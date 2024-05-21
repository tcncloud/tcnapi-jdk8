// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.PopulateIntegrationLinkRes}
 */
public final class PopulateIntegrationLinkRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.PopulateIntegrationLinkRes)
    PopulateIntegrationLinkResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PopulateIntegrationLinkRes.newBuilder() to construct.
  private PopulateIntegrationLinkRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PopulateIntegrationLinkRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PopulateIntegrationLinkRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.class, com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.Builder.class);
  }

  public static final int INTEGRATION_LINK_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.IntegrationLink integrationLink_;
  /**
   * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
   * @return Whether the integrationLink field is set.
   */
  @java.lang.Override
  public boolean hasIntegrationLink() {
    return integrationLink_ != null;
  }
  /**
   * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
   * @return The integrationLink.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IntegrationLink getIntegrationLink() {
    return integrationLink_ == null ? com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance() : integrationLink_;
  }
  /**
   * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder getIntegrationLinkOrBuilder() {
    return integrationLink_ == null ? com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance() : integrationLink_;
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
    if (integrationLink_ != null) {
      output.writeMessage(1, getIntegrationLink());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (integrationLink_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIntegrationLink());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes other = (com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes) obj;

    if (hasIntegrationLink() != other.hasIntegrationLink()) return false;
    if (hasIntegrationLink()) {
      if (!getIntegrationLink()
          .equals(other.getIntegrationLink())) return false;
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
    if (hasIntegrationLink()) {
      hash = (37 * hash) + INTEGRATION_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getIntegrationLink().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.PopulateIntegrationLinkRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.PopulateIntegrationLinkRes)
      com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.class, com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.newBuilder()
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
      integrationLink_ = null;
      if (integrationLinkBuilder_ != null) {
        integrationLinkBuilder_.dispose();
        integrationLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PopulateIntegrationLinkRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes result = new com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.integrationLink_ = integrationLinkBuilder_ == null
            ? integrationLink_
            : integrationLinkBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes.getDefaultInstance()) return this;
      if (other.hasIntegrationLink()) {
        mergeIntegrationLink(other.getIntegrationLink());
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
                  getIntegrationLinkFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.IntegrationLink integrationLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.IntegrationLink, com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder> integrationLinkBuilder_;
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     * @return Whether the integrationLink field is set.
     */
    public boolean hasIntegrationLink() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     * @return The integrationLink.
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLink getIntegrationLink() {
      if (integrationLinkBuilder_ == null) {
        return integrationLink_ == null ? com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance() : integrationLink_;
      } else {
        return integrationLinkBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     */
    public Builder setIntegrationLink(com.tcn.cloud.api.api.commons.org.IntegrationLink value) {
      if (integrationLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        integrationLink_ = value;
      } else {
        integrationLinkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     */
    public Builder setIntegrationLink(
        com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder builderForValue) {
      if (integrationLinkBuilder_ == null) {
        integrationLink_ = builderForValue.build();
      } else {
        integrationLinkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     */
    public Builder mergeIntegrationLink(com.tcn.cloud.api.api.commons.org.IntegrationLink value) {
      if (integrationLinkBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          integrationLink_ != null &&
          integrationLink_ != com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance()) {
          getIntegrationLinkBuilder().mergeFrom(value);
        } else {
          integrationLink_ = value;
        }
      } else {
        integrationLinkBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     */
    public Builder clearIntegrationLink() {
      bitField0_ = (bitField0_ & ~0x00000001);
      integrationLink_ = null;
      if (integrationLinkBuilder_ != null) {
        integrationLinkBuilder_.dispose();
        integrationLinkBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder getIntegrationLinkBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIntegrationLinkFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder getIntegrationLinkOrBuilder() {
      if (integrationLinkBuilder_ != null) {
        return integrationLinkBuilder_.getMessageOrBuilder();
      } else {
        return integrationLink_ == null ?
            com.tcn.cloud.api.api.commons.org.IntegrationLink.getDefaultInstance() : integrationLink_;
      }
    }
    /**
     * <code>.api.commons.org.IntegrationLink integration_link = 1 [json_name = "integrationLink"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.IntegrationLink, com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder> 
        getIntegrationLinkFieldBuilder() {
      if (integrationLinkBuilder_ == null) {
        integrationLinkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.IntegrationLink, com.tcn.cloud.api.api.commons.org.IntegrationLink.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkOrBuilder>(
                getIntegrationLink(),
                getParentForChildren(),
                isClean());
        integrationLink_ = null;
      }
      return integrationLinkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.PopulateIntegrationLinkRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.PopulateIntegrationLinkRes)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PopulateIntegrationLinkRes>
      PARSER = new com.google.protobuf.AbstractParser<PopulateIntegrationLinkRes>() {
    @java.lang.Override
    public PopulateIntegrationLinkRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<PopulateIntegrationLinkRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PopulateIntegrationLinkRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PopulateIntegrationLinkRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

