// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response for the GetAdminClientPreferences RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.GetAdminClientPreferencesResponse}
 */
public final class GetAdminClientPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.GetAdminClientPreferencesResponse)
    GetAdminClientPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAdminClientPreferencesResponse.newBuilder() to construct.
  private GetAdminClientPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAdminClientPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAdminClientPreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAdminClientPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAdminClientPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.Builder.class);
  }

  public static final int ADMIN_CLIENT_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.AdminClientPreferences adminClientPreferences_;
  /**
   * <pre>
   * Admin client preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   * @return Whether the adminClientPreferences field is set.
   */
  @java.lang.Override
  public boolean hasAdminClientPreferences() {
    return adminClientPreferences_ != null;
  }
  /**
   * <pre>
   * Admin client preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   * @return The adminClientPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AdminClientPreferences getAdminClientPreferences() {
    return adminClientPreferences_ == null ? com.tcn.cloud.api.api.commons.org.AdminClientPreferences.getDefaultInstance() : adminClientPreferences_;
  }
  /**
   * <pre>
   * Admin client preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AdminClientPreferencesOrBuilder getAdminClientPreferencesOrBuilder() {
    return adminClientPreferences_ == null ? com.tcn.cloud.api.api.commons.org.AdminClientPreferences.getDefaultInstance() : adminClientPreferences_;
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
    if (adminClientPreferences_ != null) {
      output.writeMessage(1, getAdminClientPreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adminClientPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAdminClientPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse) obj;

    if (hasAdminClientPreferences() != other.hasAdminClientPreferences()) return false;
    if (hasAdminClientPreferences()) {
      if (!getAdminClientPreferences()
          .equals(other.getAdminClientPreferences())) return false;
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
    if (hasAdminClientPreferences()) {
      hash = (37 * hash) + ADMIN_CLIENT_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getAdminClientPreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse prototype) {
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
   * Response for the GetAdminClientPreferences RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.GetAdminClientPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.GetAdminClientPreferencesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAdminClientPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAdminClientPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.newBuilder()
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
      adminClientPreferences_ = null;
      if (adminClientPreferencesBuilder_ != null) {
        adminClientPreferencesBuilder_.dispose();
        adminClientPreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAdminClientPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.adminClientPreferences_ = adminClientPreferencesBuilder_ == null
            ? adminClientPreferences_
            : adminClientPreferencesBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasAdminClientPreferences()) {
        mergeAdminClientPreferences(other.getAdminClientPreferences());
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
                  getAdminClientPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.AdminClientPreferences adminClientPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AdminClientPreferences, com.tcn.cloud.api.api.commons.org.AdminClientPreferences.Builder, com.tcn.cloud.api.api.commons.org.AdminClientPreferencesOrBuilder> adminClientPreferencesBuilder_;
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     * @return Whether the adminClientPreferences field is set.
     */
    public boolean hasAdminClientPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     * @return The adminClientPreferences.
     */
    public com.tcn.cloud.api.api.commons.org.AdminClientPreferences getAdminClientPreferences() {
      if (adminClientPreferencesBuilder_ == null) {
        return adminClientPreferences_ == null ? com.tcn.cloud.api.api.commons.org.AdminClientPreferences.getDefaultInstance() : adminClientPreferences_;
      } else {
        return adminClientPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public Builder setAdminClientPreferences(com.tcn.cloud.api.api.commons.org.AdminClientPreferences value) {
      if (adminClientPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adminClientPreferences_ = value;
      } else {
        adminClientPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public Builder setAdminClientPreferences(
        com.tcn.cloud.api.api.commons.org.AdminClientPreferences.Builder builderForValue) {
      if (adminClientPreferencesBuilder_ == null) {
        adminClientPreferences_ = builderForValue.build();
      } else {
        adminClientPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public Builder mergeAdminClientPreferences(com.tcn.cloud.api.api.commons.org.AdminClientPreferences value) {
      if (adminClientPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          adminClientPreferences_ != null &&
          adminClientPreferences_ != com.tcn.cloud.api.api.commons.org.AdminClientPreferences.getDefaultInstance()) {
          getAdminClientPreferencesBuilder().mergeFrom(value);
        } else {
          adminClientPreferences_ = value;
        }
      } else {
        adminClientPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public Builder clearAdminClientPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adminClientPreferences_ = null;
      if (adminClientPreferencesBuilder_ != null) {
        adminClientPreferencesBuilder_.dispose();
        adminClientPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AdminClientPreferences.Builder getAdminClientPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAdminClientPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AdminClientPreferencesOrBuilder getAdminClientPreferencesOrBuilder() {
      if (adminClientPreferencesBuilder_ != null) {
        return adminClientPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return adminClientPreferences_ == null ?
            com.tcn.cloud.api.api.commons.org.AdminClientPreferences.getDefaultInstance() : adminClientPreferences_;
      }
    }
    /**
     * <pre>
     * Admin client preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AdminClientPreferences admin_client_preferences = 1 [json_name = "adminClientPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AdminClientPreferences, com.tcn.cloud.api.api.commons.org.AdminClientPreferences.Builder, com.tcn.cloud.api.api.commons.org.AdminClientPreferencesOrBuilder> 
        getAdminClientPreferencesFieldBuilder() {
      if (adminClientPreferencesBuilder_ == null) {
        adminClientPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.AdminClientPreferences, com.tcn.cloud.api.api.commons.org.AdminClientPreferences.Builder, com.tcn.cloud.api.api.commons.org.AdminClientPreferencesOrBuilder>(
                getAdminClientPreferences(),
                getParentForChildren(),
                isClean());
        adminClientPreferences_ = null;
      }
      return adminClientPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.GetAdminClientPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.GetAdminClientPreferencesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAdminClientPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAdminClientPreferencesResponse>() {
    @java.lang.Override
    public GetAdminClientPreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAdminClientPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAdminClientPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.GetAdminClientPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

