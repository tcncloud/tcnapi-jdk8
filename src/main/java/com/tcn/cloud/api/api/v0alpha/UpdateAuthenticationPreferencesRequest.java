// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request for UpdateAuthenticationPreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.UpdateAuthenticationPreferencesRequest}
 */
public final class UpdateAuthenticationPreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateAuthenticationPreferencesRequest)
    UpdateAuthenticationPreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAuthenticationPreferencesRequest.newBuilder() to construct.
  private UpdateAuthenticationPreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAuthenticationPreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAuthenticationPreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAuthenticationPreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAuthenticationPreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.Builder.class);
  }

  public static final int AUTHENTICATION_PREFERENCES_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences authenticationPreferences_;
  /**
   * <pre>
   * Authentication preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
   * @return Whether the authenticationPreferences field is set.
   */
  @java.lang.Override
  public boolean hasAuthenticationPreferences() {
    return authenticationPreferences_ != null;
  }
  /**
   * <pre>
   * Authentication preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
   * @return The authenticationPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences getAuthenticationPreferences() {
    return authenticationPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.getDefaultInstance() : authenticationPreferences_;
  }
  /**
   * <pre>
   * Authentication preferences object, required to update
   * </pre>
   *
   * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AuthenticationPreferencesOrBuilder getAuthenticationPreferencesOrBuilder() {
    return authenticationPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.getDefaultInstance() : authenticationPreferences_;
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
    if (authenticationPreferences_ != null) {
      output.writeMessage(2, getAuthenticationPreferences());
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
    if (authenticationPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAuthenticationPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest other = (com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest) obj;

    if (hasAuthenticationPreferences() != other.hasAuthenticationPreferences()) return false;
    if (hasAuthenticationPreferences()) {
      if (!getAuthenticationPreferences()
          .equals(other.getAuthenticationPreferences())) return false;
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
    if (hasAuthenticationPreferences()) {
      hash = (37 * hash) + AUTHENTICATION_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getAuthenticationPreferences().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest prototype) {
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
   * Request for UpdateAuthenticationPreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.UpdateAuthenticationPreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateAuthenticationPreferencesRequest)
      com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAuthenticationPreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAuthenticationPreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.newBuilder()
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
      authenticationPreferences_ = null;
      if (authenticationPreferencesBuilder_ != null) {
        authenticationPreferencesBuilder_.dispose();
        authenticationPreferencesBuilder_ = null;
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
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateAuthenticationPreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest build() {
      com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest result = new com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authenticationPreferences_ = authenticationPreferencesBuilder_ == null
            ? authenticationPreferences_
            : authenticationPreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest.getDefaultInstance()) return this;
      if (other.hasAuthenticationPreferences()) {
        mergeAuthenticationPreferences(other.getAuthenticationPreferences());
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
                  getAuthenticationPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences authenticationPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences, com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.Builder, com.tcn.cloud.api.api.v0alpha.AuthenticationPreferencesOrBuilder> authenticationPreferencesBuilder_;
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     * @return Whether the authenticationPreferences field is set.
     */
    public boolean hasAuthenticationPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     * @return The authenticationPreferences.
     */
    public com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences getAuthenticationPreferences() {
      if (authenticationPreferencesBuilder_ == null) {
        return authenticationPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.getDefaultInstance() : authenticationPreferences_;
      } else {
        return authenticationPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     */
    public Builder setAuthenticationPreferences(com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences value) {
      if (authenticationPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authenticationPreferences_ = value;
      } else {
        authenticationPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     */
    public Builder setAuthenticationPreferences(
        com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.Builder builderForValue) {
      if (authenticationPreferencesBuilder_ == null) {
        authenticationPreferences_ = builderForValue.build();
      } else {
        authenticationPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     */
    public Builder mergeAuthenticationPreferences(com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences value) {
      if (authenticationPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          authenticationPreferences_ != null &&
          authenticationPreferences_ != com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.getDefaultInstance()) {
          getAuthenticationPreferencesBuilder().mergeFrom(value);
        } else {
          authenticationPreferences_ = value;
        }
      } else {
        authenticationPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     */
    public Builder clearAuthenticationPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      authenticationPreferences_ = null;
      if (authenticationPreferencesBuilder_ != null) {
        authenticationPreferencesBuilder_.dispose();
        authenticationPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.Builder getAuthenticationPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAuthenticationPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AuthenticationPreferencesOrBuilder getAuthenticationPreferencesOrBuilder() {
      if (authenticationPreferencesBuilder_ != null) {
        return authenticationPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return authenticationPreferences_ == null ?
            com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.getDefaultInstance() : authenticationPreferences_;
      }
    }
    /**
     * <pre>
     * Authentication preferences object, required to update
     * </pre>
     *
     * <code>.api.v0alpha.AuthenticationPreferences authentication_preferences = 2 [json_name = "authenticationPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences, com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.Builder, com.tcn.cloud.api.api.v0alpha.AuthenticationPreferencesOrBuilder> 
        getAuthenticationPreferencesFieldBuilder() {
      if (authenticationPreferencesBuilder_ == null) {
        authenticationPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences, com.tcn.cloud.api.api.v0alpha.AuthenticationPreferences.Builder, com.tcn.cloud.api.api.v0alpha.AuthenticationPreferencesOrBuilder>(
                getAuthenticationPreferences(),
                getParentForChildren(),
                isClean());
        authenticationPreferences_ = null;
      }
      return authenticationPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateAuthenticationPreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateAuthenticationPreferencesRequest)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAuthenticationPreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAuthenticationPreferencesRequest>() {
    @java.lang.Override
    public UpdateAuthenticationPreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAuthenticationPreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAuthenticationPreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateAuthenticationPreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

