// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organization.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response for the ListOrganizations RPC, returning all organizations.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.ListOrganizationsResponse}
 */
public final class ListOrganizationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.ListOrganizationsResponse)
    ListOrganizationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOrganizationsResponse.newBuilder() to construct.
  private ListOrganizationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOrganizationsResponse() {
    organizationDetails_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOrganizationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse.Builder.class);
  }

  public static final int ORGANIZATION_DETAILS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails> organizationDetails_;
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails> getOrganizationDetailsList() {
    return organizationDetails_;
  }
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder> 
      getOrganizationDetailsOrBuilderList() {
    return organizationDetails_;
  }
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  @java.lang.Override
  public int getOrganizationDetailsCount() {
    return organizationDetails_.size();
  }
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails getOrganizationDetails(int index) {
    return organizationDetails_.get(index);
  }
  /**
   * <pre>
   * Organizations filtered by identifier.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder getOrganizationDetailsOrBuilder(
      int index) {
    return organizationDetails_.get(index);
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
    for (int i = 0; i < organizationDetails_.size(); i++) {
      output.writeMessage(1, organizationDetails_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < organizationDetails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, organizationDetails_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse other = (com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse) obj;

    if (!getOrganizationDetailsList()
        .equals(other.getOrganizationDetailsList())) return false;
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
    if (getOrganizationDetailsCount() > 0) {
      hash = (37 * hash) + ORGANIZATION_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getOrganizationDetailsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse prototype) {
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
   * Response for the ListOrganizations RPC, returning all organizations.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.ListOrganizationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.ListOrganizationsResponse)
      com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse.newBuilder()
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
      if (organizationDetailsBuilder_ == null) {
        organizationDetails_ = java.util.Collections.emptyList();
      } else {
        organizationDetails_ = null;
        organizationDetailsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse result = new com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse result) {
      if (organizationDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          organizationDetails_ = java.util.Collections.unmodifiableList(organizationDetails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.organizationDetails_ = organizationDetails_;
      } else {
        result.organizationDetails_ = organizationDetailsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse.getDefaultInstance()) return this;
      if (organizationDetailsBuilder_ == null) {
        if (!other.organizationDetails_.isEmpty()) {
          if (organizationDetails_.isEmpty()) {
            organizationDetails_ = other.organizationDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrganizationDetailsIsMutable();
            organizationDetails_.addAll(other.organizationDetails_);
          }
          onChanged();
        }
      } else {
        if (!other.organizationDetails_.isEmpty()) {
          if (organizationDetailsBuilder_.isEmpty()) {
            organizationDetailsBuilder_.dispose();
            organizationDetailsBuilder_ = null;
            organizationDetails_ = other.organizationDetails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            organizationDetailsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrganizationDetailsFieldBuilder() : null;
          } else {
            organizationDetailsBuilder_.addAllMessages(other.organizationDetails_);
          }
        }
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
              com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.parser(),
                      extensionRegistry);
              if (organizationDetailsBuilder_ == null) {
                ensureOrganizationDetailsIsMutable();
                organizationDetails_.add(m);
              } else {
                organizationDetailsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails> organizationDetails_ =
      java.util.Collections.emptyList();
    private void ensureOrganizationDetailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        organizationDetails_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails>(organizationDetails_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder> organizationDetailsBuilder_;

    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails> getOrganizationDetailsList() {
      if (organizationDetailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(organizationDetails_);
      } else {
        return organizationDetailsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public int getOrganizationDetailsCount() {
      if (organizationDetailsBuilder_ == null) {
        return organizationDetails_.size();
      } else {
        return organizationDetailsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails getOrganizationDetails(int index) {
      if (organizationDetailsBuilder_ == null) {
        return organizationDetails_.get(index);
      } else {
        return organizationDetailsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder setOrganizationDetails(
        int index, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails value) {
      if (organizationDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationDetailsIsMutable();
        organizationDetails_.set(index, value);
        onChanged();
      } else {
        organizationDetailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder setOrganizationDetails(
        int index, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder builderForValue) {
      if (organizationDetailsBuilder_ == null) {
        ensureOrganizationDetailsIsMutable();
        organizationDetails_.set(index, builderForValue.build());
        onChanged();
      } else {
        organizationDetailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder addOrganizationDetails(com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails value) {
      if (organizationDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationDetailsIsMutable();
        organizationDetails_.add(value);
        onChanged();
      } else {
        organizationDetailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder addOrganizationDetails(
        int index, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails value) {
      if (organizationDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationDetailsIsMutable();
        organizationDetails_.add(index, value);
        onChanged();
      } else {
        organizationDetailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder addOrganizationDetails(
        com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder builderForValue) {
      if (organizationDetailsBuilder_ == null) {
        ensureOrganizationDetailsIsMutable();
        organizationDetails_.add(builderForValue.build());
        onChanged();
      } else {
        organizationDetailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder addOrganizationDetails(
        int index, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder builderForValue) {
      if (organizationDetailsBuilder_ == null) {
        ensureOrganizationDetailsIsMutable();
        organizationDetails_.add(index, builderForValue.build());
        onChanged();
      } else {
        organizationDetailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder addAllOrganizationDetails(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails> values) {
      if (organizationDetailsBuilder_ == null) {
        ensureOrganizationDetailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, organizationDetails_);
        onChanged();
      } else {
        organizationDetailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder clearOrganizationDetails() {
      if (organizationDetailsBuilder_ == null) {
        organizationDetails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        organizationDetailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public Builder removeOrganizationDetails(int index) {
      if (organizationDetailsBuilder_ == null) {
        ensureOrganizationDetailsIsMutable();
        organizationDetails_.remove(index);
        onChanged();
      } else {
        organizationDetailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder getOrganizationDetailsBuilder(
        int index) {
      return getOrganizationDetailsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder getOrganizationDetailsOrBuilder(
        int index) {
      if (organizationDetailsBuilder_ == null) {
        return organizationDetails_.get(index);  } else {
        return organizationDetailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder> 
         getOrganizationDetailsOrBuilderList() {
      if (organizationDetailsBuilder_ != null) {
        return organizationDetailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(organizationDetails_);
      }
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder addOrganizationDetailsBuilder() {
      return getOrganizationDetailsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.getDefaultInstance());
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder addOrganizationDetailsBuilder(
        int index) {
      return getOrganizationDetailsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.getDefaultInstance());
    }
    /**
     * <pre>
     * Organizations filtered by identifier.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.OrganizationDetails organization_details = 1 [json_name = "organizationDetails"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder> 
         getOrganizationDetailsBuilderList() {
      return getOrganizationDetailsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder> 
        getOrganizationDetailsFieldBuilder() {
      if (organizationDetailsBuilder_ == null) {
        organizationDetailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetails.Builder, com.tcn.cloud.api.api.v1alpha1.org.OrganizationDetailsOrBuilder>(
                organizationDetails_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        organizationDetails_ = null;
      }
      return organizationDetailsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.ListOrganizationsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.ListOrganizationsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOrganizationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListOrganizationsResponse>() {
    @java.lang.Override
    public ListOrganizationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOrganizationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOrganizationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

