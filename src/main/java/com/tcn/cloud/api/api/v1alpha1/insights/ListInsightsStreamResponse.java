// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * Protobuf type {@code api.v1alpha1.insights.ListInsightsStreamResponse}
 */
public final class ListInsightsStreamResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.ListInsightsStreamResponse)
    ListInsightsStreamResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInsightsStreamResponse.newBuilder() to construct.
  private ListInsightsStreamResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInsightsStreamResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListInsightsStreamResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsStreamResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsStreamResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse.class, com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse.Builder.class);
  }

  public static final int INSIGHTS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.insights.Insight insights_;
  /**
   * <pre>
   * Requested insights
   * </pre>
   *
   * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
   * @return Whether the insights field is set.
   */
  @java.lang.Override
  public boolean hasInsights() {
    return insights_ != null;
  }
  /**
   * <pre>
   * Requested insights
   * </pre>
   *
   * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
   * @return The insights.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.Insight getInsights() {
    return insights_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance() : insights_;
  }
  /**
   * <pre>
   * Requested insights
   * </pre>
   *
   * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder getInsightsOrBuilder() {
    return insights_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance() : insights_;
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
    if (insights_ != null) {
      output.writeMessage(1, getInsights());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (insights_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInsights());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse other = (com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse) obj;

    if (hasInsights() != other.hasInsights()) return false;
    if (hasInsights()) {
      if (!getInsights()
          .equals(other.getInsights())) return false;
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
    if (hasInsights()) {
      hash = (37 * hash) + INSIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getInsights().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.insights.ListInsightsStreamResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.ListInsightsStreamResponse)
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsStreamResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsStreamResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse.class, com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse.newBuilder()
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
      insights_ = null;
      if (insightsBuilder_ != null) {
        insightsBuilder_.dispose();
        insightsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsStreamResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse build() {
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse result = new com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.insights_ = insightsBuilder_ == null
            ? insights_
            : insightsBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse.getDefaultInstance()) return this;
      if (other.hasInsights()) {
        mergeInsights(other.getInsights());
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
                  getInsightsFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.insights.Insight insights_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.Insight, com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder, com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder> insightsBuilder_;
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     * @return Whether the insights field is set.
     */
    public boolean hasInsights() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     * @return The insights.
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.Insight getInsights() {
      if (insightsBuilder_ == null) {
        return insights_ == null ? com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance() : insights_;
      } else {
        return insightsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     */
    public Builder setInsights(com.tcn.cloud.api.api.v1alpha1.insights.Insight value) {
      if (insightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        insights_ = value;
      } else {
        insightsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     */
    public Builder setInsights(
        com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder builderForValue) {
      if (insightsBuilder_ == null) {
        insights_ = builderForValue.build();
      } else {
        insightsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     */
    public Builder mergeInsights(com.tcn.cloud.api.api.v1alpha1.insights.Insight value) {
      if (insightsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          insights_ != null &&
          insights_ != com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance()) {
          getInsightsBuilder().mergeFrom(value);
        } else {
          insights_ = value;
        }
      } else {
        insightsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     */
    public Builder clearInsights() {
      bitField0_ = (bitField0_ & ~0x00000001);
      insights_ = null;
      if (insightsBuilder_ != null) {
        insightsBuilder_.dispose();
        insightsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder getInsightsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInsightsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder getInsightsOrBuilder() {
      if (insightsBuilder_ != null) {
        return insightsBuilder_.getMessageOrBuilder();
      } else {
        return insights_ == null ?
            com.tcn.cloud.api.api.v1alpha1.insights.Insight.getDefaultInstance() : insights_;
      }
    }
    /**
     * <pre>
     * Requested insights
     * </pre>
     *
     * <code>.api.v1alpha1.insights.Insight insights = 1 [json_name = "insights"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.Insight, com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder, com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder> 
        getInsightsFieldBuilder() {
      if (insightsBuilder_ == null) {
        insightsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.insights.Insight, com.tcn.cloud.api.api.v1alpha1.insights.Insight.Builder, com.tcn.cloud.api.api.v1alpha1.insights.InsightOrBuilder>(
                getInsights(),
                getParentForChildren(),
                isClean());
        insights_ = null;
      }
      return insightsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.ListInsightsStreamResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.ListInsightsStreamResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInsightsStreamResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListInsightsStreamResponse>() {
    @java.lang.Override
    public ListInsightsStreamResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListInsightsStreamResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInsightsStreamResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsStreamResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

