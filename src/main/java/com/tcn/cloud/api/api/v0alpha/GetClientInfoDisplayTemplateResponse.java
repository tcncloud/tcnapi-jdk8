// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetClientInfoDisplayTemplateResponse}
 */
public final class GetClientInfoDisplayTemplateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetClientInfoDisplayTemplateResponse)
    GetClientInfoDisplayTemplateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetClientInfoDisplayTemplateResponse.newBuilder() to construct.
  private GetClientInfoDisplayTemplateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetClientInfoDisplayTemplateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetClientInfoDisplayTemplateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetClientInfoDisplayTemplateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetClientInfoDisplayTemplateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.class, com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CLIENT_INFO_DISPLAY_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate clientInfoDisplayTemplate_;
  /**
   * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
   * @return Whether the clientInfoDisplayTemplate field is set.
   */
  @java.lang.Override
  public boolean hasClientInfoDisplayTemplate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
   * @return The clientInfoDisplayTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate getClientInfoDisplayTemplate() {
    return clientInfoDisplayTemplate_ == null ? com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.getDefaultInstance() : clientInfoDisplayTemplate_;
  }
  /**
   * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplateOrBuilder getClientInfoDisplayTemplateOrBuilder() {
    return clientInfoDisplayTemplate_ == null ? com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.getDefaultInstance() : clientInfoDisplayTemplate_;
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
      output.writeMessage(1, getClientInfoDisplayTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse other = (com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse) obj;

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

  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse prototype) {
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
   * Protobuf type {@code api.v0alpha.GetClientInfoDisplayTemplateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetClientInfoDisplayTemplateResponse)
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetClientInfoDisplayTemplateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetClientInfoDisplayTemplateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.class, com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.newBuilder()
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
        getClientInfoDisplayTemplateFieldBuilder();
      }
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
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetClientInfoDisplayTemplateResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse result = new com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientInfoDisplayTemplate_ = clientInfoDisplayTemplateBuilder_ == null
            ? clientInfoDisplayTemplate_
            : clientInfoDisplayTemplateBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse.getDefaultInstance()) return this;
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

    private com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate clientInfoDisplayTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate, com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.Builder, com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplateOrBuilder> clientInfoDisplayTemplateBuilder_;
    /**
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     * @return Whether the clientInfoDisplayTemplate field is set.
     */
    public boolean hasClientInfoDisplayTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     * @return The clientInfoDisplayTemplate.
     */
    public com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate getClientInfoDisplayTemplate() {
      if (clientInfoDisplayTemplateBuilder_ == null) {
        return clientInfoDisplayTemplate_ == null ? com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.getDefaultInstance() : clientInfoDisplayTemplate_;
      } else {
        return clientInfoDisplayTemplateBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public Builder setClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate value) {
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
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public Builder setClientInfoDisplayTemplate(
        com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.Builder builderForValue) {
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
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public Builder mergeClientInfoDisplayTemplate(com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate value) {
      if (clientInfoDisplayTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          clientInfoDisplayTemplate_ != null &&
          clientInfoDisplayTemplate_ != com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.getDefaultInstance()) {
          getClientInfoDisplayTemplateBuilder().mergeFrom(value);
        } else {
          clientInfoDisplayTemplate_ = value;
        }
      } else {
        clientInfoDisplayTemplateBuilder_.mergeFrom(value);
      }
      if (clientInfoDisplayTemplate_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
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
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.Builder getClientInfoDisplayTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getClientInfoDisplayTemplateFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplateOrBuilder getClientInfoDisplayTemplateOrBuilder() {
      if (clientInfoDisplayTemplateBuilder_ != null) {
        return clientInfoDisplayTemplateBuilder_.getMessageOrBuilder();
      } else {
        return clientInfoDisplayTemplate_ == null ?
            com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.getDefaultInstance() : clientInfoDisplayTemplate_;
      }
    }
    /**
     * <code>.api.v0alpha.ClientInfoDisplayTemplate client_info_display_template = 1 [json_name = "clientInfoDisplayTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate, com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.Builder, com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplateOrBuilder> 
        getClientInfoDisplayTemplateFieldBuilder() {
      if (clientInfoDisplayTemplateBuilder_ == null) {
        clientInfoDisplayTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate, com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplate.Builder, com.tcn.cloud.api.api.v0alpha.ClientInfoDisplayTemplateOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetClientInfoDisplayTemplateResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetClientInfoDisplayTemplateResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetClientInfoDisplayTemplateResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetClientInfoDisplayTemplateResponse>() {
    @java.lang.Override
    public GetClientInfoDisplayTemplateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetClientInfoDisplayTemplateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetClientInfoDisplayTemplateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetClientInfoDisplayTemplateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

