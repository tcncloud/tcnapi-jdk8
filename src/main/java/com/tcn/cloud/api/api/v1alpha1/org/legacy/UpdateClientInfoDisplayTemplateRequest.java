// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest}
 */
public final class UpdateClientInfoDisplayTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest)
    UpdateClientInfoDisplayTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateClientInfoDisplayTemplateRequest.newBuilder() to construct.
  private UpdateClientInfoDisplayTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateClientInfoDisplayTemplateRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateClientInfoDisplayTemplateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateClientInfoDisplayTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateClientInfoDisplayTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest.Builder.class);
  }

  public static final int CLIENT_INFO_DISPLAY_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate clientInfoDisplayTemplate_;
  /**
   * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
   * @return Whether the clientInfoDisplayTemplate field is set.
   */
  @java.lang.Override
  public boolean hasClientInfoDisplayTemplate() {
    return clientInfoDisplayTemplate_ != null;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
   * @return The clientInfoDisplayTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate getClientInfoDisplayTemplate() {
    return clientInfoDisplayTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.getDefaultInstance() : clientInfoDisplayTemplate_;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplateOrBuilder getClientInfoDisplayTemplateOrBuilder() {
    return clientInfoDisplayTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.getDefaultInstance() : clientInfoDisplayTemplate_;
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
    if (clientInfoDisplayTemplate_ != null) {
      output.writeMessage(1, getClientInfoDisplayTemplate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientInfoDisplayTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClientInfoDisplayTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest) obj;

    if (hasClientInfoDisplayTemplate() != other.hasClientInfoDisplayTemplate()) return false;
    if (hasClientInfoDisplayTemplate()) {
      if (!getClientInfoDisplayTemplate()
          .equals(other.getClientInfoDisplayTemplate())) return false;
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
    if (hasClientInfoDisplayTemplate()) {
      hash = (37 * hash) + CLIENT_INFO_DISPLAY_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getClientInfoDisplayTemplate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateClientInfoDisplayTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateClientInfoDisplayTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest.newBuilder()
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
      clientInfoDisplayTemplate_ = null;
      if (clientInfoDisplayTemplateBuilder_ != null) {
        clientInfoDisplayTemplateBuilder_.dispose();
        clientInfoDisplayTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateClientInfoDisplayTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientInfoDisplayTemplate_ = clientInfoDisplayTemplateBuilder_ == null
            ? clientInfoDisplayTemplate_
            : clientInfoDisplayTemplateBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest.getDefaultInstance()) return this;
      if (other.hasClientInfoDisplayTemplate()) {
        mergeClientInfoDisplayTemplate(other.getClientInfoDisplayTemplate());
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
                  getClientInfoDisplayTemplateFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate clientInfoDisplayTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplateOrBuilder> clientInfoDisplayTemplateBuilder_;
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     * @return Whether the clientInfoDisplayTemplate field is set.
     */
    public boolean hasClientInfoDisplayTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     * @return The clientInfoDisplayTemplate.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate getClientInfoDisplayTemplate() {
      if (clientInfoDisplayTemplateBuilder_ == null) {
        return clientInfoDisplayTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.getDefaultInstance() : clientInfoDisplayTemplate_;
      } else {
        return clientInfoDisplayTemplateBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public Builder setClientInfoDisplayTemplate(com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate value) {
      if (clientInfoDisplayTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientInfoDisplayTemplate_ = value;
      } else {
        clientInfoDisplayTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public Builder setClientInfoDisplayTemplate(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.Builder builderForValue) {
      if (clientInfoDisplayTemplateBuilder_ == null) {
        clientInfoDisplayTemplate_ = builderForValue.build();
      } else {
        clientInfoDisplayTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public Builder mergeClientInfoDisplayTemplate(com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate value) {
      if (clientInfoDisplayTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          clientInfoDisplayTemplate_ != null &&
          clientInfoDisplayTemplate_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.getDefaultInstance()) {
          getClientInfoDisplayTemplateBuilder().mergeFrom(value);
        } else {
          clientInfoDisplayTemplate_ = value;
        }
      } else {
        clientInfoDisplayTemplateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public Builder clearClientInfoDisplayTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clientInfoDisplayTemplate_ = null;
      if (clientInfoDisplayTemplateBuilder_ != null) {
        clientInfoDisplayTemplateBuilder_.dispose();
        clientInfoDisplayTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.Builder getClientInfoDisplayTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getClientInfoDisplayTemplateFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplateOrBuilder getClientInfoDisplayTemplateOrBuilder() {
      if (clientInfoDisplayTemplateBuilder_ != null) {
        return clientInfoDisplayTemplateBuilder_.getMessageOrBuilder();
      } else {
        return clientInfoDisplayTemplate_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.getDefaultInstance() : clientInfoDisplayTemplate_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplateOrBuilder> 
        getClientInfoDisplayTemplateFieldBuilder() {
      if (clientInfoDisplayTemplateBuilder_ == null) {
        clientInfoDisplayTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.ClientInfoDisplayTemplateOrBuilder>(
                getClientInfoDisplayTemplate(),
                getParentForChildren(),
                isClean());
        clientInfoDisplayTemplate_ = null;
      }
      return clientInfoDisplayTemplateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateClientInfoDisplayTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateClientInfoDisplayTemplateRequest>() {
    @java.lang.Override
    public UpdateClientInfoDisplayTemplateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateClientInfoDisplayTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateClientInfoDisplayTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateClientInfoDisplayTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

