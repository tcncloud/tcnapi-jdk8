// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.GetPortalConfigRes}
 */
public final class GetPortalConfigRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.GetPortalConfigRes)
    GetPortalConfigResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPortalConfigRes.newBuilder() to construct.
  private GetPortalConfigRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPortalConfigRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPortalConfigRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_GetPortalConfigRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_GetPortalConfigRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.class, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.Builder.class);
  }

  private int bitField0_;
  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig entity_;
  /**
   * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig getEntity() {
    return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.getDefaultInstance() : entity_;
  }
  /**
   * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigOrBuilder getEntityOrBuilder() {
    return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.getDefaultInstance() : entity_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEntity());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntity());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes other = (com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
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
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.GetPortalConfigRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.GetPortalConfigRes)
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_GetPortalConfigRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_GetPortalConfigRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.class, com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEntityFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_GetPortalConfigRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes result = new com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes.getDefaultInstance()) return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
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
                  getEntityFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigOrBuilder> entityBuilder_;
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     * @return The entity.
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     */
    public Builder setEntity(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
      } else {
        entityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     */
    public Builder setEntity(
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     */
    public Builder mergeEntity(com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          entity_ != null &&
          entity_ != com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.getDefaultInstance()) {
          getEntityBuilder().mergeFrom(value);
        } else {
          entity_ = value;
        }
      } else {
        entityBuilder_.mergeFrom(value);
      }
      if (entity_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     */
    public Builder clearEntity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.Builder getEntityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ?
            com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.getDefaultInstance() : entity_;
      }
    }
    /**
     * <code>.api.v1alpha1.integrations.PortalConfig entity = 1 [json_name = "entity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfig.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PortalConfigOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.GetPortalConfigRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.GetPortalConfigRes)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPortalConfigRes>
      PARSER = new com.google.protobuf.AbstractParser<GetPortalConfigRes>() {
    @java.lang.Override
    public GetPortalConfigRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPortalConfigRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPortalConfigRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.GetPortalConfigRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

