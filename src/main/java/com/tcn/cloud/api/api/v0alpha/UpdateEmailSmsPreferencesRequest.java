// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request for UpdateEmailSmsPreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.UpdateEmailSmsPreferencesRequest}
 */
public final class UpdateEmailSmsPreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateEmailSmsPreferencesRequest)
    UpdateEmailSmsPreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateEmailSmsPreferencesRequest.newBuilder() to construct.
  private UpdateEmailSmsPreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateEmailSmsPreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateEmailSmsPreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateEmailSmsPreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateEmailSmsPreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.Builder.class);
  }

  public static final int EMAIL_SMS_PREFERENCES_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences emailSmsPreferences_;
  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
   * @return Whether the emailSmsPreferences field is set.
   */
  @java.lang.Override
  public boolean hasEmailSmsPreferences() {
    return emailSmsPreferences_ != null;
  }
  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
   * @return The emailSmsPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences getEmailSmsPreferences() {
    return emailSmsPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.getDefaultInstance() : emailSmsPreferences_;
  }
  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.EmailSmsPreferencesOrBuilder getEmailSmsPreferencesOrBuilder() {
    return emailSmsPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.getDefaultInstance() : emailSmsPreferences_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 10;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * The mask indicating which fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  @java.lang.Override
  public boolean hasFieldMask() {
    return fieldMask_ != null;
  }
  /**
   * <pre>
   * The mask indicating which fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFieldMask() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <pre>
   * The mask indicating which fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
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
      output.writeMessage(2, getEmailSmsPreferences());
    }
    if (fieldMask_ != null) {
      output.writeMessage(10, getFieldMask());
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
        .computeMessageSize(2, getEmailSmsPreferences());
    }
    if (fieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getFieldMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest other = (com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest) obj;

    if (hasEmailSmsPreferences() != other.hasEmailSmsPreferences()) return false;
    if (hasEmailSmsPreferences()) {
      if (!getEmailSmsPreferences()
          .equals(other.getEmailSmsPreferences())) return false;
    }
    if (hasFieldMask() != other.hasFieldMask()) return false;
    if (hasFieldMask()) {
      if (!getFieldMask()
          .equals(other.getFieldMask())) return false;
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
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest prototype) {
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
   * Request for UpdateEmailSmsPreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.UpdateEmailSmsPreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateEmailSmsPreferencesRequest)
      com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateEmailSmsPreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateEmailSmsPreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.newBuilder()
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
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateEmailSmsPreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest build() {
      com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest result = new com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emailSmsPreferences_ = emailSmsPreferencesBuilder_ == null
            ? emailSmsPreferences_
            : emailSmsPreferencesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest.getDefaultInstance()) return this;
      if (other.hasEmailSmsPreferences()) {
        mergeEmailSmsPreferences(other.getEmailSmsPreferences());
      }
      if (other.hasFieldMask()) {
        mergeFieldMask(other.getFieldMask());
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
            case 18: {
              input.readMessage(
                  getEmailSmsPreferencesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 82: {
              input.readMessage(
                  getFieldMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 82
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

    private com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences emailSmsPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences, com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.Builder, com.tcn.cloud.api.api.v0alpha.EmailSmsPreferencesOrBuilder> emailSmsPreferencesBuilder_;
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
     * @return Whether the emailSmsPreferences field is set.
     */
    public boolean hasEmailSmsPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
     * @return The emailSmsPreferences.
     */
    public com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences getEmailSmsPreferences() {
      if (emailSmsPreferencesBuilder_ == null) {
        return emailSmsPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.getDefaultInstance() : emailSmsPreferences_;
      } else {
        return emailSmsPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
     */
    public Builder setEmailSmsPreferences(com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences value) {
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
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
     */
    public Builder setEmailSmsPreferences(
        com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.Builder builderForValue) {
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
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
     */
    public Builder mergeEmailSmsPreferences(com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences value) {
      if (emailSmsPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          emailSmsPreferences_ != null &&
          emailSmsPreferences_ != com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.getDefaultInstance()) {
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
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
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
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.Builder getEmailSmsPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEmailSmsPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailSmsPreferencesOrBuilder getEmailSmsPreferencesOrBuilder() {
      if (emailSmsPreferencesBuilder_ != null) {
        return emailSmsPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return emailSmsPreferences_ == null ?
            com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.getDefaultInstance() : emailSmsPreferences_;
      }
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.EmailSmsPreferences email_sms_preferences = 2 [json_name = "emailSmsPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences, com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.Builder, com.tcn.cloud.api.api.v0alpha.EmailSmsPreferencesOrBuilder> 
        getEmailSmsPreferencesFieldBuilder() {
      if (emailSmsPreferencesBuilder_ == null) {
        emailSmsPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences, com.tcn.cloud.api.api.v0alpha.EmailSmsPreferences.Builder, com.tcn.cloud.api.api.v0alpha.EmailSmsPreferencesOrBuilder>(
                getEmailSmsPreferences(),
                getParentForChildren(),
                isClean());
        emailSmsPreferences_ = null;
      }
      return emailSmsPreferencesBuilder_;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     * @return Whether the fieldMask field is set.
     */
    public boolean hasFieldMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     * @return The fieldMask.
     */
    public com.google.protobuf.FieldMask getFieldMask() {
      if (fieldMaskBuilder_ == null) {
        return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      } else {
        return fieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldMask_ = value;
      } else {
        fieldMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder mergeFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fieldMask_ != null &&
          fieldMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFieldMaskBuilder().mergeFrom(value);
        } else {
          fieldMask_ = value;
        }
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder clearFieldMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
      if (fieldMaskBuilder_ != null) {
        return fieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return fieldMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      }
    }
    /**
     * <pre>
     * The mask indicating which fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFieldMaskFieldBuilder() {
      if (fieldMaskBuilder_ == null) {
        fieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFieldMask(),
                getParentForChildren(),
                isClean());
        fieldMask_ = null;
      }
      return fieldMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateEmailSmsPreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateEmailSmsPreferencesRequest)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEmailSmsPreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateEmailSmsPreferencesRequest>() {
    @java.lang.Override
    public UpdateEmailSmsPreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEmailSmsPreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEmailSmsPreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateEmailSmsPreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

