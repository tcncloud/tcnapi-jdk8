// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest}
 */
public final class UpdateWebLinkTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest)
    UpdateWebLinkTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateWebLinkTemplateRequest.newBuilder() to construct.
  private UpdateWebLinkTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateWebLinkTemplateRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateWebLinkTemplateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateWebLinkTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateWebLinkTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest.Builder.class);
  }

  private int bitField0_;
  public static final int WEB_LINK_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate webLinkTemplate_;
  /**
   * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
   * @return Whether the webLinkTemplate field is set.
   */
  @java.lang.Override
  public boolean hasWebLinkTemplate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
   * @return The webLinkTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate getWebLinkTemplate() {
    return webLinkTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.getDefaultInstance() : webLinkTemplate_;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplateOrBuilder getWebLinkTemplateOrBuilder() {
    return webLinkTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.getDefaultInstance() : webLinkTemplate_;
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
      output.writeMessage(1, getWebLinkTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest) obj;

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

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateWebLinkTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateWebLinkTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest.newBuilder()
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
        getWebLinkTemplateFieldBuilder();
      }
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
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_UpdateWebLinkTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.webLinkTemplate_ = webLinkTemplateBuilder_ == null
            ? webLinkTemplate_
            : webLinkTemplateBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest.getDefaultInstance()) return this;
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate webLinkTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplateOrBuilder> webLinkTemplateBuilder_;
    /**
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     * @return Whether the webLinkTemplate field is set.
     */
    public boolean hasWebLinkTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     * @return The webLinkTemplate.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate getWebLinkTemplate() {
      if (webLinkTemplateBuilder_ == null) {
        return webLinkTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.getDefaultInstance() : webLinkTemplate_;
      } else {
        return webLinkTemplateBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public Builder setWebLinkTemplate(com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate value) {
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
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public Builder setWebLinkTemplate(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.Builder builderForValue) {
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
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public Builder mergeWebLinkTemplate(com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate value) {
      if (webLinkTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          webLinkTemplate_ != null &&
          webLinkTemplate_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.getDefaultInstance()) {
          getWebLinkTemplateBuilder().mergeFrom(value);
        } else {
          webLinkTemplate_ = value;
        }
      } else {
        webLinkTemplateBuilder_.mergeFrom(value);
      }
      if (webLinkTemplate_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
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
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.Builder getWebLinkTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWebLinkTemplateFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplateOrBuilder getWebLinkTemplateOrBuilder() {
      if (webLinkTemplateBuilder_ != null) {
        return webLinkTemplateBuilder_.getMessageOrBuilder();
      } else {
        return webLinkTemplate_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.getDefaultInstance() : webLinkTemplate_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.WebLinkTemplate web_link_template = 1 [json_name = "webLinkTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplateOrBuilder> 
        getWebLinkTemplateFieldBuilder() {
      if (webLinkTemplateBuilder_ == null) {
        webLinkTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.WebLinkTemplateOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateWebLinkTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateWebLinkTemplateRequest>() {
    @java.lang.Override
    public UpdateWebLinkTemplateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateWebLinkTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateWebLinkTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.UpdateWebLinkTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

