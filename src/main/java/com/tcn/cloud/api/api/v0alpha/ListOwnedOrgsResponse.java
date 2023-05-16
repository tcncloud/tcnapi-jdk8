// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListOwnedOrgsResponse}
 */
public final class ListOwnedOrgsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListOwnedOrgsResponse)
    ListOwnedOrgsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOwnedOrgsResponse.newBuilder() to construct.
  private ListOwnedOrgsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOwnedOrgsResponse() {
    organizationDescriptions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOwnedOrgsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListOwnedOrgsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListOwnedOrgsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.class, com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.Builder.class);
  }

  public static final int ORGANIZATION_DESCRIPTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.OrganizationDescription> organizationDescriptions_;
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.OrganizationDescription> getOrganizationDescriptionsList() {
    return organizationDescriptions_;
  }
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder> 
      getOrganizationDescriptionsOrBuilderList() {
    return organizationDescriptions_;
  }
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  @java.lang.Override
  public int getOrganizationDescriptionsCount() {
    return organizationDescriptions_.size();
  }
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.OrganizationDescription getOrganizationDescriptions(int index) {
    return organizationDescriptions_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder getOrganizationDescriptionsOrBuilder(
      int index) {
    return organizationDescriptions_.get(index);
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
    for (int i = 0; i < organizationDescriptions_.size(); i++) {
      output.writeMessage(1, organizationDescriptions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < organizationDescriptions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, organizationDescriptions_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse other = (com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse) obj;

    if (!getOrganizationDescriptionsList()
        .equals(other.getOrganizationDescriptionsList())) return false;
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
    if (getOrganizationDescriptionsCount() > 0) {
      hash = (37 * hash) + ORGANIZATION_DESCRIPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOrganizationDescriptionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse prototype) {
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
   * Protobuf type {@code api.v0alpha.ListOwnedOrgsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListOwnedOrgsResponse)
      com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListOwnedOrgsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListOwnedOrgsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.class, com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.newBuilder()
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
      if (organizationDescriptionsBuilder_ == null) {
        organizationDescriptions_ = java.util.Collections.emptyList();
      } else {
        organizationDescriptions_ = null;
        organizationDescriptionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListOwnedOrgsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse build() {
      com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse result = new com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse result) {
      if (organizationDescriptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          organizationDescriptions_ = java.util.Collections.unmodifiableList(organizationDescriptions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.organizationDescriptions_ = organizationDescriptions_;
      } else {
        result.organizationDescriptions_ = organizationDescriptionsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse.getDefaultInstance()) return this;
      if (organizationDescriptionsBuilder_ == null) {
        if (!other.organizationDescriptions_.isEmpty()) {
          if (organizationDescriptions_.isEmpty()) {
            organizationDescriptions_ = other.organizationDescriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrganizationDescriptionsIsMutable();
            organizationDescriptions_.addAll(other.organizationDescriptions_);
          }
          onChanged();
        }
      } else {
        if (!other.organizationDescriptions_.isEmpty()) {
          if (organizationDescriptionsBuilder_.isEmpty()) {
            organizationDescriptionsBuilder_.dispose();
            organizationDescriptionsBuilder_ = null;
            organizationDescriptions_ = other.organizationDescriptions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            organizationDescriptionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrganizationDescriptionsFieldBuilder() : null;
          } else {
            organizationDescriptionsBuilder_.addAllMessages(other.organizationDescriptions_);
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
              com.tcn.cloud.api.api.v0alpha.OrganizationDescription m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.OrganizationDescription.parser(),
                      extensionRegistry);
              if (organizationDescriptionsBuilder_ == null) {
                ensureOrganizationDescriptionsIsMutable();
                organizationDescriptions_.add(m);
              } else {
                organizationDescriptionsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.OrganizationDescription> organizationDescriptions_ =
      java.util.Collections.emptyList();
    private void ensureOrganizationDescriptionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        organizationDescriptions_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.OrganizationDescription>(organizationDescriptions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.OrganizationDescription, com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder, com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder> organizationDescriptionsBuilder_;

    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.OrganizationDescription> getOrganizationDescriptionsList() {
      if (organizationDescriptionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(organizationDescriptions_);
      } else {
        return organizationDescriptionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public int getOrganizationDescriptionsCount() {
      if (organizationDescriptionsBuilder_ == null) {
        return organizationDescriptions_.size();
      } else {
        return organizationDescriptionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.OrganizationDescription getOrganizationDescriptions(int index) {
      if (organizationDescriptionsBuilder_ == null) {
        return organizationDescriptions_.get(index);
      } else {
        return organizationDescriptionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder setOrganizationDescriptions(
        int index, com.tcn.cloud.api.api.v0alpha.OrganizationDescription value) {
      if (organizationDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationDescriptionsIsMutable();
        organizationDescriptions_.set(index, value);
        onChanged();
      } else {
        organizationDescriptionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder setOrganizationDescriptions(
        int index, com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder builderForValue) {
      if (organizationDescriptionsBuilder_ == null) {
        ensureOrganizationDescriptionsIsMutable();
        organizationDescriptions_.set(index, builderForValue.build());
        onChanged();
      } else {
        organizationDescriptionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder addOrganizationDescriptions(com.tcn.cloud.api.api.v0alpha.OrganizationDescription value) {
      if (organizationDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationDescriptionsIsMutable();
        organizationDescriptions_.add(value);
        onChanged();
      } else {
        organizationDescriptionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder addOrganizationDescriptions(
        int index, com.tcn.cloud.api.api.v0alpha.OrganizationDescription value) {
      if (organizationDescriptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrganizationDescriptionsIsMutable();
        organizationDescriptions_.add(index, value);
        onChanged();
      } else {
        organizationDescriptionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder addOrganizationDescriptions(
        com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder builderForValue) {
      if (organizationDescriptionsBuilder_ == null) {
        ensureOrganizationDescriptionsIsMutable();
        organizationDescriptions_.add(builderForValue.build());
        onChanged();
      } else {
        organizationDescriptionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder addOrganizationDescriptions(
        int index, com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder builderForValue) {
      if (organizationDescriptionsBuilder_ == null) {
        ensureOrganizationDescriptionsIsMutable();
        organizationDescriptions_.add(index, builderForValue.build());
        onChanged();
      } else {
        organizationDescriptionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder addAllOrganizationDescriptions(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.OrganizationDescription> values) {
      if (organizationDescriptionsBuilder_ == null) {
        ensureOrganizationDescriptionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, organizationDescriptions_);
        onChanged();
      } else {
        organizationDescriptionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder clearOrganizationDescriptions() {
      if (organizationDescriptionsBuilder_ == null) {
        organizationDescriptions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        organizationDescriptionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public Builder removeOrganizationDescriptions(int index) {
      if (organizationDescriptionsBuilder_ == null) {
        ensureOrganizationDescriptionsIsMutable();
        organizationDescriptions_.remove(index);
        onChanged();
      } else {
        organizationDescriptionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder getOrganizationDescriptionsBuilder(
        int index) {
      return getOrganizationDescriptionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder getOrganizationDescriptionsOrBuilder(
        int index) {
      if (organizationDescriptionsBuilder_ == null) {
        return organizationDescriptions_.get(index);  } else {
        return organizationDescriptionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder> 
         getOrganizationDescriptionsOrBuilderList() {
      if (organizationDescriptionsBuilder_ != null) {
        return organizationDescriptionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(organizationDescriptions_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder addOrganizationDescriptionsBuilder() {
      return getOrganizationDescriptionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.OrganizationDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder addOrganizationDescriptionsBuilder(
        int index) {
      return getOrganizationDescriptionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.OrganizationDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.OrganizationDescription organization_descriptions = 1 [json_name = "organizationDescriptions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder> 
         getOrganizationDescriptionsBuilderList() {
      return getOrganizationDescriptionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.OrganizationDescription, com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder, com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder> 
        getOrganizationDescriptionsFieldBuilder() {
      if (organizationDescriptionsBuilder_ == null) {
        organizationDescriptionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.OrganizationDescription, com.tcn.cloud.api.api.v0alpha.OrganizationDescription.Builder, com.tcn.cloud.api.api.v0alpha.OrganizationDescriptionOrBuilder>(
                organizationDescriptions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        organizationDescriptions_ = null;
      }
      return organizationDescriptionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListOwnedOrgsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListOwnedOrgsResponse)
  private static final com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOwnedOrgsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListOwnedOrgsResponse>() {
    @java.lang.Override
    public ListOwnedOrgsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOwnedOrgsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOwnedOrgsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListOwnedOrgsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

