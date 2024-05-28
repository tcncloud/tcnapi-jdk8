// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organizations/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org.organizations;

/**
 * <pre>
 * Response for fetching a business hours.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.organizations.GetBusinessHoursResponse}
 */
@java.lang.Deprecated public final class GetBusinessHoursResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.organizations.GetBusinessHoursResponse)
    GetBusinessHoursResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBusinessHoursResponse.newBuilder() to construct.
  private GetBusinessHoursResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBusinessHoursResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBusinessHoursResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessHoursResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessHoursResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse.class, com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse.Builder.class);
  }

  public static final int BUSINESS_HOURS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.BusinessHours businessHours_;
  /**
   * <pre>
   * The retrieved business hours
   * </pre>
   *
   * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
   * @return Whether the businessHours field is set.
   */
  @java.lang.Override
  public boolean hasBusinessHours() {
    return businessHours_ != null;
  }
  /**
   * <pre>
   * The retrieved business hours
   * </pre>
   *
   * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
   * @return The businessHours.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.BusinessHours getBusinessHours() {
    return businessHours_ == null ? com.tcn.cloud.api.api.commons.org.BusinessHours.getDefaultInstance() : businessHours_;
  }
  /**
   * <pre>
   * The retrieved business hours
   * </pre>
   *
   * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder getBusinessHoursOrBuilder() {
    return businessHours_ == null ? com.tcn.cloud.api.api.commons.org.BusinessHours.getDefaultInstance() : businessHours_;
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
    if (businessHours_ != null) {
      output.writeMessage(1, getBusinessHours());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (businessHours_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBusinessHours());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse other = (com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse) obj;

    if (hasBusinessHours() != other.hasBusinessHours()) return false;
    if (hasBusinessHours()) {
      if (!getBusinessHours()
          .equals(other.getBusinessHours())) return false;
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
    if (hasBusinessHours()) {
      hash = (37 * hash) + BUSINESS_HOURS_FIELD_NUMBER;
      hash = (53 * hash) + getBusinessHours().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse prototype) {
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
   * Response for fetching a business hours.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.organizations.GetBusinessHoursResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.organizations.GetBusinessHoursResponse)
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessHoursResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessHoursResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse.class, com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse.newBuilder()
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
      businessHours_ = null;
      if (businessHoursBuilder_ != null) {
        businessHoursBuilder_.dispose();
        businessHoursBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.PreferencesProto.internal_static_api_v1alpha1_org_organizations_GetBusinessHoursResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse result = new com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.businessHours_ = businessHoursBuilder_ == null
            ? businessHours_
            : businessHoursBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse.getDefaultInstance()) return this;
      if (other.hasBusinessHours()) {
        mergeBusinessHours(other.getBusinessHours());
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
                  getBusinessHoursFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.BusinessHours businessHours_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.BusinessHours, com.tcn.cloud.api.api.commons.org.BusinessHours.Builder, com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder> businessHoursBuilder_;
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     * @return Whether the businessHours field is set.
     */
    public boolean hasBusinessHours() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     * @return The businessHours.
     */
    public com.tcn.cloud.api.api.commons.org.BusinessHours getBusinessHours() {
      if (businessHoursBuilder_ == null) {
        return businessHours_ == null ? com.tcn.cloud.api.api.commons.org.BusinessHours.getDefaultInstance() : businessHours_;
      } else {
        return businessHoursBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     */
    public Builder setBusinessHours(com.tcn.cloud.api.api.commons.org.BusinessHours value) {
      if (businessHoursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        businessHours_ = value;
      } else {
        businessHoursBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     */
    public Builder setBusinessHours(
        com.tcn.cloud.api.api.commons.org.BusinessHours.Builder builderForValue) {
      if (businessHoursBuilder_ == null) {
        businessHours_ = builderForValue.build();
      } else {
        businessHoursBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     */
    public Builder mergeBusinessHours(com.tcn.cloud.api.api.commons.org.BusinessHours value) {
      if (businessHoursBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          businessHours_ != null &&
          businessHours_ != com.tcn.cloud.api.api.commons.org.BusinessHours.getDefaultInstance()) {
          getBusinessHoursBuilder().mergeFrom(value);
        } else {
          businessHours_ = value;
        }
      } else {
        businessHoursBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     */
    public Builder clearBusinessHours() {
      bitField0_ = (bitField0_ & ~0x00000001);
      businessHours_ = null;
      if (businessHoursBuilder_ != null) {
        businessHoursBuilder_.dispose();
        businessHoursBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.BusinessHours.Builder getBusinessHoursBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBusinessHoursFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder getBusinessHoursOrBuilder() {
      if (businessHoursBuilder_ != null) {
        return businessHoursBuilder_.getMessageOrBuilder();
      } else {
        return businessHours_ == null ?
            com.tcn.cloud.api.api.commons.org.BusinessHours.getDefaultInstance() : businessHours_;
      }
    }
    /**
     * <pre>
     * The retrieved business hours
     * </pre>
     *
     * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.BusinessHours, com.tcn.cloud.api.api.commons.org.BusinessHours.Builder, com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder> 
        getBusinessHoursFieldBuilder() {
      if (businessHoursBuilder_ == null) {
        businessHoursBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.BusinessHours, com.tcn.cloud.api.api.commons.org.BusinessHours.Builder, com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder>(
                getBusinessHours(),
                getParentForChildren(),
                isClean());
        businessHours_ = null;
      }
      return businessHoursBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.organizations.GetBusinessHoursResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.organizations.GetBusinessHoursResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBusinessHoursResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBusinessHoursResponse>() {
    @java.lang.Override
    public GetBusinessHoursResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBusinessHoursResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBusinessHoursResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetBusinessHoursResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

