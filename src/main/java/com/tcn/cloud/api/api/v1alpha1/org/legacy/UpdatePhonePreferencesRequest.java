// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * Request for UpdatePhonePreferences
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest}
 */
public final class UpdatePhonePreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest)
    UpdatePhonePreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePhonePreferencesRequest.newBuilder() to construct.
  private UpdatePhonePreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePhonePreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePhonePreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePhonePreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePhonePreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest.Builder.class);
  }

  public static final int PHONE_PREFERENCES_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences phonePreferences_;
  /**
   * <pre>
   * Phone preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
   * @return Whether the phonePreferences field is set.
   */
  @java.lang.Override
  public boolean hasPhonePreferences() {
    return phonePreferences_ != null;
  }
  /**
   * <pre>
   * Phone preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
   * @return The phonePreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences getPhonePreferences() {
    return phonePreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.getDefaultInstance() : phonePreferences_;
  }
  /**
   * <pre>
   * Phone preferences object, required to update
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferencesOrBuilder getPhonePreferencesOrBuilder() {
    return phonePreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.getDefaultInstance() : phonePreferences_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 10;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * Field mask for update request
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
   * Field mask for update request
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
   * Field mask for update request
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
    if (phonePreferences_ != null) {
      output.writeMessage(2, getPhonePreferences());
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
    if (phonePreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPhonePreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest) obj;

    if (hasPhonePreferences() != other.hasPhonePreferences()) return false;
    if (hasPhonePreferences()) {
      if (!getPhonePreferences()
          .equals(other.getPhonePreferences())) return false;
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
    if (hasPhonePreferences()) {
      hash = (37 * hash) + PHONE_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getPhonePreferences().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest prototype) {
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
   * Request for UpdatePhonePreferences
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePhonePreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePhonePreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest.newBuilder()
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
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdatePhonePreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.phonePreferences_ = phonePreferencesBuilder_ == null
            ? phonePreferences_
            : phonePreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest.getDefaultInstance()) return this;
      if (other.hasPhonePreferences()) {
        mergePhonePreferences(other.getPhonePreferences());
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
                  getPhonePreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences phonePreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferencesOrBuilder> phonePreferencesBuilder_;
    /**
     * <pre>
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
     * @return Whether the phonePreferences field is set.
     */
    public boolean hasPhonePreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
     * @return The phonePreferences.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences getPhonePreferences() {
      if (phonePreferencesBuilder_ == null) {
        return phonePreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.getDefaultInstance() : phonePreferences_;
      } else {
        return phonePreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
     */
    public Builder setPhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences value) {
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
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
     */
    public Builder setPhonePreferences(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.Builder builderForValue) {
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
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
     */
    public Builder mergePhonePreferences(com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences value) {
      if (phonePreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          phonePreferences_ != null &&
          phonePreferences_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.getDefaultInstance()) {
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
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
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
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.Builder getPhonePreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPhonePreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferencesOrBuilder getPhonePreferencesOrBuilder() {
      if (phonePreferencesBuilder_ != null) {
        return phonePreferencesBuilder_.getMessageOrBuilder();
      } else {
        return phonePreferences_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.getDefaultInstance() : phonePreferences_;
      }
    }
    /**
     * <pre>
     * Phone preferences object, required to update
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.PhonePreferences phone_preferences = 2 [json_name = "phonePreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferencesOrBuilder> 
        getPhonePreferencesFieldBuilder() {
      if (phonePreferencesBuilder_ == null) {
        phonePreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.PhonePreferencesOrBuilder>(
                getPhonePreferences(),
                getParentForChildren(),
                isClean());
        phonePreferences_ = null;
      }
      return phonePreferencesBuilder_;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * Field mask for update request
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
     * Field mask for update request
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
     * Field mask for update request
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
     * Field mask for update request
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
     * Field mask for update request
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
     * Field mask for update request
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
     * Field mask for update request
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
     * Field mask for update request
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
     * Field mask for update request
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePhonePreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePhonePreferencesRequest>() {
    @java.lang.Override
    public UpdatePhonePreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePhonePreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePhonePreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdatePhonePreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

