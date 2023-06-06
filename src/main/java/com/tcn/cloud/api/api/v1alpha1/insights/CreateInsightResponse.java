// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * CreateInsightResponse contains the Insight that was created.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.insights.CreateInsightResponse}
 */
public final class CreateInsightResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.CreateInsightResponse)
    CreateInsightResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateInsightResponse.newBuilder() to construct.
  private CreateInsightResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateInsightResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateInsightResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_CreateInsightResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_CreateInsightResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.class, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.Builder.class);
  }

  public static final int INSIGHT_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.insights.Insight insight_;
  /**
   * <pre>
   * Created entity
   * </pre>
   *
   * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
   * @return Whether the insight field is set.
   */
  @java.lang.Override
  public boolean hasInsight() {
    return insight_ != null;
  }
  /**
   * <pre>
   * Created entity
   * </pre>
   *
   * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
   * @return The insight.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.Insight getInsight() {
    return insight_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance() : insight_;
  }
  /**
   * <pre>
   * Created entity
   * </pre>
   *
   * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder getInsightOrBuilder() {
    return insight_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance() : insight_;
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
    if (insight_ != null) {
      output.writeMessage(1, getInsight());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (insight_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInsight());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse other = (com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse) obj;

    if (hasInsight() != other.hasInsight()) return false;
    if (hasInsight()) {
      if (!getInsight()
          .equals(other.getInsight())) return false;
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
    if (hasInsight()) {
      hash = (37 * hash) + INSIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getInsight().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse prototype) {
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
   * CreateInsightResponse contains the Insight that was created.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.insights.CreateInsightResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.CreateInsightResponse)
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_CreateInsightResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_CreateInsightResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.class, com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.newBuilder()
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
      insight_ = null;
      if (insightBuilder_ != null) {
        insightBuilder_.dispose();
        insightBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_CreateInsightResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse build() {
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse result = new com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.insight_ = insightBuilder_ == null
            ? insight_
            : insightBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse.getDefaultInstance()) return this;
      if (other.hasInsight()) {
        mergeInsight(other.getInsight());
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
                  getInsightFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.insights.Insight insight_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.Insight, com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder, com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder> insightBuilder_;
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     * @return Whether the insight field is set.
     */
    public boolean hasInsight() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     * @return The insight.
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.Insight getInsight() {
      if (insightBuilder_ == null) {
        return insight_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance() : insight_;
      } else {
        return insightBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     */
    public Builder setInsight(com.tcn.cloud.api.api.v1alpha1.insights.Insight value) {
      if (insightBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        insight_ = value;
      } else {
        insightBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     */
    public Builder setInsight(
        com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder builderForValue) {
      if (insightBuilder_ == null) {
        insight_ = builderForValue.build();
      } else {
        insightBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     */
    public Builder mergeInsight(com.tcn.cloud.api.api.v1alpha1.insights.Insight value) {
      if (insightBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          insight_ != null &&
          insight_ != com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance()) {
          getInsightBuilder().mergeFrom(value);
        } else {
          insight_ = value;
        }
      } else {
        insightBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     */
    public Builder clearInsight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      insight_ = null;
      if (insightBuilder_ != null) {
        insightBuilder_.dispose();
        insightBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder getInsightBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInsightFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder getInsightOrBuilder() {
      if (insightBuilder_ != null) {
        return insightBuilder_.getMessageOrBuilder();
      } else {
        return insight_ == null ?
            com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance() : insight_;
      }
    }
    /**
     * <pre>
     * Created entity
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insight = 1 [json_name = "insight"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.Insight, com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder, com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder> 
        getInsightFieldBuilder() {
      if (insightBuilder_ == null) {
        insightBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.insights.Insight, com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder, com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder>(
                getInsight(),
                getParentForChildren(),
                isClean());
        insight_ = null;
      }
      return insightBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.CreateInsightResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.CreateInsightResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateInsightResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateInsightResponse>() {
    @java.lang.Override
    public CreateInsightResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateInsightResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateInsightResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.CreateInsightResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

