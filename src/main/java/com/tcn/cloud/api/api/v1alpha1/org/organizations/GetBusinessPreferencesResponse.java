// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organizations/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org.organizations;

/**
 * <pre>
 * Response for the GetBusinessPreferences RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.organizations.GetBusinessPreferencesResponse}
 */
public final class GetBusinessPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.organizations.GetBusinessPreferencesResponse)
    GetBusinessPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBusinessPreferencesResponse.newBuilder() to construct.
  private GetBusinessPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBusinessPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBusinessPreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse.Builder.class);
  }

  public static final int BUSINESS_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.BusinessPreferences businessPreferences_;
  /**
   * <pre>
   * Business preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
   * @return Whether the businessPreferences field is set.
   */
  @java.lang.Override
  public boolean hasBusinessPreferences() {
    return businessPreferences_ != null;
  }
  /**
   * <pre>
   * Business preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
   * @return The businessPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.BusinessPreferences getBusinessPreferences() {
    return businessPreferences_ == null ? com.tcn.cloud.api.api.commons.org.BusinessPreferences.getDefaultInstance() : businessPreferences_;
  }
  /**
   * <pre>
   * Business preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.BusinessPreferencesOrBuilder getBusinessPreferencesOrBuilder() {
    return businessPreferences_ == null ? com.tcn.cloud.api.api.commons.org.BusinessPreferences.getDefaultInstance() : businessPreferences_;
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
    if (businessPreferences_ != null) {
      output.writeMessage(1, getBusinessPreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (businessPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBusinessPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse) obj;

    if (hasBusinessPreferences() != other.hasBusinessPreferences()) return false;
    if (hasBusinessPreferences()) {
      if (!getBusinessPreferences()
          .equals(other.getBusinessPreferences())) return false;
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
    if (hasBusinessPreferences()) {
      hash = (37 * hash) + BUSINESS_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getBusinessPreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse prototype) {
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
   * Response for the GetBusinessPreferences RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.organizations.GetBusinessPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.organizations.GetBusinessPreferencesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse.newBuilder()
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
      businessPreferences_ = null;
      if (businessPreferencesBuilder_ != null) {
        businessPreferencesBuilder_.dispose();
        businessPreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.businessPreferences_ = businessPreferencesBuilder_ == null
            ? businessPreferences_
            : businessPreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasBusinessPreferences()) {
        mergeBusinessPreferences(other.getBusinessPreferences());
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
                  getBusinessPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.BusinessPreferences businessPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.BusinessPreferences, com.tcn.cloud.api.api.commons.org.BusinessPreferences.Builder, com.tcn.cloud.api.api.commons.org.BusinessPreferencesOrBuilder> businessPreferencesBuilder_;
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     * @return Whether the businessPreferences field is set.
     */
    public boolean hasBusinessPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     * @return The businessPreferences.
     */
    public com.tcn.cloud.api.api.commons.org.BusinessPreferences getBusinessPreferences() {
      if (businessPreferencesBuilder_ == null) {
        return businessPreferences_ == null ? com.tcn.cloud.api.api.commons.org.BusinessPreferences.getDefaultInstance() : businessPreferences_;
      } else {
        return businessPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     */
    public Builder setBusinessPreferences(com.tcn.cloud.api.api.commons.org.BusinessPreferences value) {
      if (businessPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        businessPreferences_ = value;
      } else {
        businessPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     */
    public Builder setBusinessPreferences(
        com.tcn.cloud.api.api.commons.org.BusinessPreferences.Builder builderForValue) {
      if (businessPreferencesBuilder_ == null) {
        businessPreferences_ = builderForValue.build();
      } else {
        businessPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     */
    public Builder mergeBusinessPreferences(com.tcn.cloud.api.api.commons.org.BusinessPreferences value) {
      if (businessPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          businessPreferences_ != null &&
          businessPreferences_ != com.tcn.cloud.api.api.commons.org.BusinessPreferences.getDefaultInstance()) {
          getBusinessPreferencesBuilder().mergeFrom(value);
        } else {
          businessPreferences_ = value;
        }
      } else {
        businessPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     */
    public Builder clearBusinessPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      businessPreferences_ = null;
      if (businessPreferencesBuilder_ != null) {
        businessPreferencesBuilder_.dispose();
        businessPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.BusinessPreferences.Builder getBusinessPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBusinessPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.BusinessPreferencesOrBuilder getBusinessPreferencesOrBuilder() {
      if (businessPreferencesBuilder_ != null) {
        return businessPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return businessPreferences_ == null ?
            com.tcn.cloud.api.api.commons.org.BusinessPreferences.getDefaultInstance() : businessPreferences_;
      }
    }
    /**
     * <pre>
     * Business preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BusinessPreferences business_preferences = 1 [json_name = "businessPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.BusinessPreferences, com.tcn.cloud.api.api.commons.org.BusinessPreferences.Builder, com.tcn.cloud.api.api.commons.org.BusinessPreferencesOrBuilder> 
        getBusinessPreferencesFieldBuilder() {
      if (businessPreferencesBuilder_ == null) {
        businessPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.BusinessPreferences, com.tcn.cloud.api.api.commons.org.BusinessPreferences.Builder, com.tcn.cloud.api.api.commons.org.BusinessPreferencesOrBuilder>(
                getBusinessPreferences(),
                getParentForChildren(),
                isClean());
        businessPreferences_ = null;
      }
      return businessPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.organizations.GetBusinessPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.organizations.GetBusinessPreferencesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBusinessPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBusinessPreferencesResponse>() {
    @java.lang.Override
    public GetBusinessPreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBusinessPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBusinessPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

