// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreateRegressionTemplate RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateRegressionTemplateReq}
 */
public final class CreateRegressionTemplateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateRegressionTemplateReq)
    CreateRegressionTemplateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRegressionTemplateReq.newBuilder() to construct.
  private CreateRegressionTemplateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRegressionTemplateReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRegressionTemplateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateRegressionTemplateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateRegressionTemplateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.Builder.class);
  }

  public static final int REGRESSION_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate regressionTemplate_;
  /**
   * <pre>
   * Regression template to be stored in the db.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
   * @return Whether the regressionTemplate field is set.
   */
  @java.lang.Override
  public boolean hasRegressionTemplate() {
    return regressionTemplate_ != null;
  }
  /**
   * <pre>
   * Regression template to be stored in the db.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
   * @return The regressionTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate getRegressionTemplate() {
    return regressionTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.getDefaultInstance() : regressionTemplate_;
  }
  /**
   * <pre>
   * Regression template to be stored in the db.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplateOrBuilder getRegressionTemplateOrBuilder() {
    return regressionTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.getDefaultInstance() : regressionTemplate_;
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
    if (regressionTemplate_ != null) {
      output.writeMessage(1, getRegressionTemplate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (regressionTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRegressionTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq) obj;

    if (hasRegressionTemplate() != other.hasRegressionTemplate()) return false;
    if (hasRegressionTemplate()) {
      if (!getRegressionTemplate()
          .equals(other.getRegressionTemplate())) return false;
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
    if (hasRegressionTemplate()) {
      hash = (37 * hash) + REGRESSION_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getRegressionTemplate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq prototype) {
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
   * Request message for the CreateRegressionTemplate RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateRegressionTemplateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateRegressionTemplateReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateRegressionTemplateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateRegressionTemplateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.newBuilder()
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
      regressionTemplate_ = null;
      if (regressionTemplateBuilder_ != null) {
        regressionTemplateBuilder_.dispose();
        regressionTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateRegressionTemplateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.regressionTemplate_ = regressionTemplateBuilder_ == null
            ? regressionTemplate_
            : regressionTemplateBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq.getDefaultInstance()) return this;
      if (other.hasRegressionTemplate()) {
        mergeRegressionTemplate(other.getRegressionTemplate());
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
                  getRegressionTemplateFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate regressionTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplateOrBuilder> regressionTemplateBuilder_;
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     * @return Whether the regressionTemplate field is set.
     */
    public boolean hasRegressionTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     * @return The regressionTemplate.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate getRegressionTemplate() {
      if (regressionTemplateBuilder_ == null) {
        return regressionTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.getDefaultInstance() : regressionTemplate_;
      } else {
        return regressionTemplateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     */
    public Builder setRegressionTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate value) {
      if (regressionTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        regressionTemplate_ = value;
      } else {
        regressionTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     */
    public Builder setRegressionTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.Builder builderForValue) {
      if (regressionTemplateBuilder_ == null) {
        regressionTemplate_ = builderForValue.build();
      } else {
        regressionTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     */
    public Builder mergeRegressionTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate value) {
      if (regressionTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          regressionTemplate_ != null &&
          regressionTemplate_ != com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.getDefaultInstance()) {
          getRegressionTemplateBuilder().mergeFrom(value);
        } else {
          regressionTemplate_ = value;
        }
      } else {
        regressionTemplateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     */
    public Builder clearRegressionTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      regressionTemplate_ = null;
      if (regressionTemplateBuilder_ != null) {
        regressionTemplateBuilder_.dispose();
        regressionTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.Builder getRegressionTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRegressionTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplateOrBuilder getRegressionTemplateOrBuilder() {
      if (regressionTemplateBuilder_ != null) {
        return regressionTemplateBuilder_.getMessageOrBuilder();
      } else {
        return regressionTemplate_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.getDefaultInstance() : regressionTemplate_;
      }
    }
    /**
     * <pre>
     * Regression template to be stored in the db.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RegressionTemplate regression_template = 1 [json_name = "regressionTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplateOrBuilder> 
        getRegressionTemplateFieldBuilder() {
      if (regressionTemplateBuilder_ == null) {
        regressionTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RegressionTemplateOrBuilder>(
                getRegressionTemplate(),
                getParentForChildren(),
                isClean());
        regressionTemplate_ = null;
      }
      return regressionTemplateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateRegressionTemplateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateRegressionTemplateReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRegressionTemplateReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateRegressionTemplateReq>() {
    @java.lang.Override
    public CreateRegressionTemplateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRegressionTemplateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRegressionTemplateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateRegressionTemplateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

