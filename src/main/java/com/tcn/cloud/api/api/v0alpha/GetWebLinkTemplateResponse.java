// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetWebLinkTemplateResponse}
 */
public final class GetWebLinkTemplateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetWebLinkTemplateResponse)
    GetWebLinkTemplateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetWebLinkTemplateResponse.newBuilder() to construct.
  private GetWebLinkTemplateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetWebLinkTemplateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetWebLinkTemplateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetWebLinkTemplateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetWebLinkTemplateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.class, com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.Builder.class);
  }

  public static final int WEB_LINK_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.WebLinkTemplate webLinkTemplate_;
  /**
   * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
   * @return Whether the webLinkTemplate field is set.
   */
  @java.lang.Override
  public boolean hasWebLinkTemplate() {
    return webLinkTemplate_ != null;
  }
  /**
   * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
   * @return The webLinkTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.WebLinkTemplate getWebLinkTemplate() {
    return webLinkTemplate_ == null ? com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.getDefaultInstance() : webLinkTemplate_;
  }
  /**
   * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.WebLinkTemplateOrBuilder getWebLinkTemplateOrBuilder() {
    return webLinkTemplate_ == null ? com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.getDefaultInstance() : webLinkTemplate_;
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
    if (webLinkTemplate_ != null) {
      output.writeMessage(1, getWebLinkTemplate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (webLinkTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWebLinkTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse other = (com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse) obj;

    if (hasWebLinkTemplate() != other.hasWebLinkTemplate()) return false;
    if (hasWebLinkTemplate()) {
      if (!getWebLinkTemplate()
          .equals(other.getWebLinkTemplate())) return false;
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
    if (hasWebLinkTemplate()) {
      hash = (37 * hash) + WEB_LINK_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getWebLinkTemplate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse prototype) {
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
   * Protobuf type {@code api.v0alpha.GetWebLinkTemplateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetWebLinkTemplateResponse)
      com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetWebLinkTemplateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetWebLinkTemplateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.class, com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.newBuilder()
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
      webLinkTemplate_ = null;
      if (webLinkTemplateBuilder_ != null) {
        webLinkTemplateBuilder_.dispose();
        webLinkTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetWebLinkTemplateResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse result = new com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.webLinkTemplate_ = webLinkTemplateBuilder_ == null
            ? webLinkTemplate_
            : webLinkTemplateBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse.getDefaultInstance()) return this;
      if (other.hasWebLinkTemplate()) {
        mergeWebLinkTemplate(other.getWebLinkTemplate());
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
                  getWebLinkTemplateFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.WebLinkTemplate webLinkTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.WebLinkTemplate, com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.Builder, com.tcn.cloud.api.api.v0alpha.WebLinkTemplateOrBuilder> webLinkTemplateBuilder_;
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     * @return Whether the webLinkTemplate field is set.
     */
    public boolean hasWebLinkTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     * @return The webLinkTemplate.
     */
    public com.tcn.cloud.api.api.v0alpha.WebLinkTemplate getWebLinkTemplate() {
      if (webLinkTemplateBuilder_ == null) {
        return webLinkTemplate_ == null ? com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.getDefaultInstance() : webLinkTemplate_;
      } else {
        return webLinkTemplateBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public Builder setWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.WebLinkTemplate value) {
      if (webLinkTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        webLinkTemplate_ = value;
      } else {
        webLinkTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public Builder setWebLinkTemplate(
        com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.Builder builderForValue) {
      if (webLinkTemplateBuilder_ == null) {
        webLinkTemplate_ = builderForValue.build();
      } else {
        webLinkTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public Builder mergeWebLinkTemplate(com.tcn.cloud.api.api.v0alpha.WebLinkTemplate value) {
      if (webLinkTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          webLinkTemplate_ != null &&
          webLinkTemplate_ != com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.getDefaultInstance()) {
          getWebLinkTemplateBuilder().mergeFrom(value);
        } else {
          webLinkTemplate_ = value;
        }
      } else {
        webLinkTemplateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public Builder clearWebLinkTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      webLinkTemplate_ = null;
      if (webLinkTemplateBuilder_ != null) {
        webLinkTemplateBuilder_.dispose();
        webLinkTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.Builder getWebLinkTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWebLinkTemplateFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.WebLinkTemplateOrBuilder getWebLinkTemplateOrBuilder() {
      if (webLinkTemplateBuilder_ != null) {
        return webLinkTemplateBuilder_.getMessageOrBuilder();
      } else {
        return webLinkTemplate_ == null ?
            com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.getDefaultInstance() : webLinkTemplate_;
      }
    }
    /**
     * <code>.api.v0alpha.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.WebLinkTemplate, com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.Builder, com.tcn.cloud.api.api.v0alpha.WebLinkTemplateOrBuilder> 
        getWebLinkTemplateFieldBuilder() {
      if (webLinkTemplateBuilder_ == null) {
        webLinkTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.WebLinkTemplate, com.tcn.cloud.api.api.v0alpha.WebLinkTemplate.Builder, com.tcn.cloud.api.api.v0alpha.WebLinkTemplateOrBuilder>(
                getWebLinkTemplate(),
                getParentForChildren(),
                isClean());
        webLinkTemplate_ = null;
      }
      return webLinkTemplateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetWebLinkTemplateResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetWebLinkTemplateResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetWebLinkTemplateResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetWebLinkTemplateResponse>() {
    @java.lang.Override
    public GetWebLinkTemplateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetWebLinkTemplateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetWebLinkTemplateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetWebLinkTemplateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

