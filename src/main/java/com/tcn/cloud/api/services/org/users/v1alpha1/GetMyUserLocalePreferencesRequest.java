// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/users/v1alpha1/preferences.proto

package com.tcn.cloud.api.services.org.users.v1alpha1;

/**
 * <pre>
 * GetMyUserLocalePreferencesRequest is the request message for the GetMyUserLocalePreferences rpc.
 * </pre>
 *
 * Protobuf type {@code services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest}
 */
public final class GetMyUserLocalePreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest)
    GetMyUserLocalePreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetMyUserLocalePreferencesRequest.newBuilder() to construct.
  private GetMyUserLocalePreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetMyUserLocalePreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetMyUserLocalePreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_GetMyUserLocalePreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_GetMyUserLocalePreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.class, com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.Builder.class);
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  @java.lang.Override
  public boolean hasFieldMask() {
    return fieldMask_ != null;
  }
  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFieldMask() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <pre>
   * The fields to include in the response.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
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
    if (fieldMask_ != null) {
      output.writeMessage(1, getFieldMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFieldMask());
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
    if (!(obj instanceof com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest other = (com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest) obj;

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
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest prototype) {
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
   * GetMyUserLocalePreferencesRequest is the request message for the GetMyUserLocalePreferences rpc.
   * </pre>
   *
   * Protobuf type {@code services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest)
      com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_GetMyUserLocalePreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_GetMyUserLocalePreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.class, com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.newBuilder()
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
      return com.tcn.cloud.api.services.org.users.v1alpha1.PreferencesProto.internal_static_services_org_users_v1alpha1_GetMyUserLocalePreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest build() {
      com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest buildPartial() {
      com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest result = new com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
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
      if (other instanceof com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest other) {
      if (other == com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest.getDefaultInstance()) return this;
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
            case 10: {
              input.readMessage(
                  getFieldMaskFieldBuilder().getBuilder(),
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

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
     * @return Whether the fieldMask field is set.
     */
    public boolean hasFieldMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
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
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
     */
    public Builder mergeFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          fieldMask_ != null &&
          fieldMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFieldMaskBuilder().mergeFrom(value);
        } else {
          fieldMask_ = value;
        }
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
     */
    public Builder clearFieldMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
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
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
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
     * The fields to include in the response.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
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


    // @@protoc_insertion_point(builder_scope:services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest)
  private static final com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest();
  }

  public static com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMyUserLocalePreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetMyUserLocalePreferencesRequest>() {
    @java.lang.Override
    public GetMyUserLocalePreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetMyUserLocalePreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMyUserLocalePreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.org.users.v1alpha1.GetMyUserLocalePreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

