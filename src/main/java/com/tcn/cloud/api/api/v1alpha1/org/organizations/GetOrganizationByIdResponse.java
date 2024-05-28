// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organizations/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.organizations;

/**
 * <pre>
 * GetOrganizationByIdResponse a single organization from given org id
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.organizations.GetOrganizationByIdResponse}
 */
public final class GetOrganizationByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.organizations.GetOrganizationByIdResponse)
    GetOrganizationByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOrganizationByIdResponse.newBuilder() to construct.
  private GetOrganizationByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOrganizationByIdResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOrganizationByIdResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.organizations.EntitiesProto.internal_static_api_v1alpha1_org_organizations_GetOrganizationByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.organizations.EntitiesProto.internal_static_api_v1alpha1_org_organizations_GetOrganizationByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse.class, com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse.Builder.class);
  }

  public static final int ORGANIZATION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.Organization organization_;
  /**
   * <pre>
   * Organization
   * </pre>
   *
   * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
   * @return Whether the organization field is set.
   */
  @java.lang.Override
  public boolean hasOrganization() {
    return organization_ != null;
  }
  /**
   * <pre>
   * Organization
   * </pre>
   *
   * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
   * @return The organization.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.Organization getOrganization() {
    return organization_ == null ? com.tcn.cloud.api.api.commons.org.Organization.getDefaultInstance() : organization_;
  }
  /**
   * <pre>
   * Organization
   * </pre>
   *
   * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.OrganizationOrBuilder getOrganizationOrBuilder() {
    return organization_ == null ? com.tcn.cloud.api.api.commons.org.Organization.getDefaultInstance() : organization_;
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
    if (organization_ != null) {
      output.writeMessage(1, getOrganization());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (organization_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOrganization());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse other = (com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse) obj;

    if (hasOrganization() != other.hasOrganization()) return false;
    if (hasOrganization()) {
      if (!getOrganization()
          .equals(other.getOrganization())) return false;
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
    if (hasOrganization()) {
      hash = (37 * hash) + ORGANIZATION_FIELD_NUMBER;
      hash = (53 * hash) + getOrganization().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse prototype) {
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
   * GetOrganizationByIdResponse a single organization from given org id
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.organizations.GetOrganizationByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.organizations.GetOrganizationByIdResponse)
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.EntitiesProto.internal_static_api_v1alpha1_org_organizations_GetOrganizationByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.EntitiesProto.internal_static_api_v1alpha1_org_organizations_GetOrganizationByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse.class, com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse.newBuilder()
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
      organization_ = null;
      if (organizationBuilder_ != null) {
        organizationBuilder_.dispose();
        organizationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.EntitiesProto.internal_static_api_v1alpha1_org_organizations_GetOrganizationByIdResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse result = new com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.organization_ = organizationBuilder_ == null
            ? organization_
            : organizationBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse.getDefaultInstance()) return this;
      if (other.hasOrganization()) {
        mergeOrganization(other.getOrganization());
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
                  getOrganizationFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.Organization organization_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.Organization, com.tcn.cloud.api.api.commons.org.Organization.Builder, com.tcn.cloud.api.api.commons.org.OrganizationOrBuilder> organizationBuilder_;
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     * @return Whether the organization field is set.
     */
    public boolean hasOrganization() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     * @return The organization.
     */
    public com.tcn.cloud.api.api.commons.org.Organization getOrganization() {
      if (organizationBuilder_ == null) {
        return organization_ == null ? com.tcn.cloud.api.api.commons.org.Organization.getDefaultInstance() : organization_;
      } else {
        return organizationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     */
    public Builder setOrganization(com.tcn.cloud.api.api.commons.org.Organization value) {
      if (organizationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        organization_ = value;
      } else {
        organizationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     */
    public Builder setOrganization(
        com.tcn.cloud.api.api.commons.org.Organization.Builder builderForValue) {
      if (organizationBuilder_ == null) {
        organization_ = builderForValue.build();
      } else {
        organizationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     */
    public Builder mergeOrganization(com.tcn.cloud.api.api.commons.org.Organization value) {
      if (organizationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          organization_ != null &&
          organization_ != com.tcn.cloud.api.api.commons.org.Organization.getDefaultInstance()) {
          getOrganizationBuilder().mergeFrom(value);
        } else {
          organization_ = value;
        }
      } else {
        organizationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     */
    public Builder clearOrganization() {
      bitField0_ = (bitField0_ & ~0x00000001);
      organization_ = null;
      if (organizationBuilder_ != null) {
        organizationBuilder_.dispose();
        organizationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.Organization.Builder getOrganizationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOrganizationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.OrganizationOrBuilder getOrganizationOrBuilder() {
      if (organizationBuilder_ != null) {
        return organizationBuilder_.getMessageOrBuilder();
      } else {
        return organization_ == null ?
            com.tcn.cloud.api.api.commons.org.Organization.getDefaultInstance() : organization_;
      }
    }
    /**
     * <pre>
     * Organization
     * </pre>
     *
     * <code>.api.commons.org.Organization organization = 1 [json_name = "organization"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.Organization, com.tcn.cloud.api.api.commons.org.Organization.Builder, com.tcn.cloud.api.api.commons.org.OrganizationOrBuilder> 
        getOrganizationFieldBuilder() {
      if (organizationBuilder_ == null) {
        organizationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.Organization, com.tcn.cloud.api.api.commons.org.Organization.Builder, com.tcn.cloud.api.api.commons.org.OrganizationOrBuilder>(
                getOrganization(),
                getParentForChildren(),
                isClean());
        organization_ = null;
      }
      return organizationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.organizations.GetOrganizationByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.organizations.GetOrganizationByIdResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOrganizationByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetOrganizationByIdResponse>() {
    @java.lang.Override
    public GetOrganizationByIdResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetOrganizationByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOrganizationByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.organizations.GetOrganizationByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

