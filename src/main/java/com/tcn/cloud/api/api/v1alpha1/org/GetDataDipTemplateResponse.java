// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response message for the GetDataDipTemplate RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.GetDataDipTemplateResponse}
 */
public final class GetDataDipTemplateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.GetDataDipTemplateResponse)
    GetDataDipTemplateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDataDipTemplateResponse.newBuilder() to construct.
  private GetDataDipTemplateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDataDipTemplateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDataDipTemplateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetDataDipTemplateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetDataDipTemplateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.Builder.class);
  }

  public static final int TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.DataDipConfig template_;
  /**
   * <pre>
   * The requested template.
   * </pre>
   *
   * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
   * @return Whether the template field is set.
   */
  @java.lang.Override
  public boolean hasTemplate() {
    return template_ != null;
  }
  /**
   * <pre>
   * The requested template.
   * </pre>
   *
   * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
   * @return The template.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.DataDipConfig getTemplate() {
    return template_ == null ? com.tcn.cloud.api.api.commons.org.DataDipConfig.getDefaultInstance() : template_;
  }
  /**
   * <pre>
   * The requested template.
   * </pre>
   *
   * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder getTemplateOrBuilder() {
    return template_ == null ? com.tcn.cloud.api.api.commons.org.DataDipConfig.getDefaultInstance() : template_;
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
    if (template_ != null) {
      output.writeMessage(1, getTemplate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (template_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse other = (com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse) obj;

    if (hasTemplate() != other.hasTemplate()) return false;
    if (hasTemplate()) {
      if (!getTemplate()
          .equals(other.getTemplate())) return false;
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
    if (hasTemplate()) {
      hash = (37 * hash) + TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getTemplate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse prototype) {
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
   * Response message for the GetDataDipTemplate RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.GetDataDipTemplateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.GetDataDipTemplateResponse)
      com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetDataDipTemplateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetDataDipTemplateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.newBuilder()
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
      template_ = null;
      if (templateBuilder_ != null) {
        templateBuilder_.dispose();
        templateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetDataDipTemplateResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse result = new com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.template_ = templateBuilder_ == null
            ? template_
            : templateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse.getDefaultInstance()) return this;
      if (other.hasTemplate()) {
        mergeTemplate(other.getTemplate());
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
                  getTemplateFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.DataDipConfig template_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.DataDipConfig, com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder, com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder> templateBuilder_;
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     * @return Whether the template field is set.
     */
    public boolean hasTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     * @return The template.
     */
    public com.tcn.cloud.api.api.commons.org.DataDipConfig getTemplate() {
      if (templateBuilder_ == null) {
        return template_ == null ? com.tcn.cloud.api.api.commons.org.DataDipConfig.getDefaultInstance() : template_;
      } else {
        return templateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     */
    public Builder setTemplate(com.tcn.cloud.api.api.commons.org.DataDipConfig value) {
      if (templateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        template_ = value;
      } else {
        templateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     */
    public Builder setTemplate(
        com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder builderForValue) {
      if (templateBuilder_ == null) {
        template_ = builderForValue.build();
      } else {
        templateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     */
    public Builder mergeTemplate(com.tcn.cloud.api.api.commons.org.DataDipConfig value) {
      if (templateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          template_ != null &&
          template_ != com.tcn.cloud.api.api.commons.org.DataDipConfig.getDefaultInstance()) {
          getTemplateBuilder().mergeFrom(value);
        } else {
          template_ = value;
        }
      } else {
        templateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     */
    public Builder clearTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      template_ = null;
      if (templateBuilder_ != null) {
        templateBuilder_.dispose();
        templateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder getTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder getTemplateOrBuilder() {
      if (templateBuilder_ != null) {
        return templateBuilder_.getMessageOrBuilder();
      } else {
        return template_ == null ?
            com.tcn.cloud.api.api.commons.org.DataDipConfig.getDefaultInstance() : template_;
      }
    }
    /**
     * <pre>
     * The requested template.
     * </pre>
     *
     * <code>.api.commons.org.DataDipConfig template = 1 [json_name = "template"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.DataDipConfig, com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder, com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder> 
        getTemplateFieldBuilder() {
      if (templateBuilder_ == null) {
        templateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.DataDipConfig, com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder, com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder>(
                getTemplate(),
                getParentForChildren(),
                isClean());
        template_ = null;
      }
      return templateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.GetDataDipTemplateResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.GetDataDipTemplateResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDataDipTemplateResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDataDipTemplateResponse>() {
    @java.lang.Override
    public GetDataDipTemplateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDataDipTemplateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDataDipTemplateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.GetDataDipTemplateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

