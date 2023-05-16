// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * DeleteInsightRequest is the request to delete an insight.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.insights.DeleteInsightRequest}
 */
public final class DeleteInsightRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.DeleteInsightRequest)
    DeleteInsightRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteInsightRequest.newBuilder() to construct.
  private DeleteInsightRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteInsightRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteInsightRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_DeleteInsightRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_DeleteInsightRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.class, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.Builder.class);
  }

  public static final int INSIGHT_ID_FIELD_NUMBER = 1;
  private long insightId_ = 0L;
  /**
   * <pre>
   * Required - id of insight to delete
   * </pre>
   *
   * <code>int64 insight_id = 1 [json_name = "insightId", jstype = JS_STRING];</code>
   * @return The insightId.
   */
  @java.lang.Override
  public long getInsightId() {
    return insightId_;
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
    if (insightId_ != 0L) {
      output.writeInt64(1, insightId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (insightId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, insightId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest other = (com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest) obj;

    if (getInsightId()
        != other.getInsightId()) return false;
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
    hash = (37 * hash) + INSIGHT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInsightId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest prototype) {
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
   * DeleteInsightRequest is the request to delete an insight.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.insights.DeleteInsightRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.DeleteInsightRequest)
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_DeleteInsightRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_DeleteInsightRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.class, com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.newBuilder()
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
      insightId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_DeleteInsightRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest build() {
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest result = new com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.insightId_ = insightId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest.getDefaultInstance()) return this;
      if (other.getInsightId() != 0L) {
        setInsightId(other.getInsightId());
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
            case 8: {
              insightId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long insightId_ ;
    /**
     * <pre>
     * Required - id of insight to delete
     * </pre>
     *
     * <code>int64 insight_id = 1 [json_name = "insightId", jstype = JS_STRING];</code>
     * @return The insightId.
     */
    @java.lang.Override
    public long getInsightId() {
      return insightId_;
    }
    /**
     * <pre>
     * Required - id of insight to delete
     * </pre>
     *
     * <code>int64 insight_id = 1 [json_name = "insightId", jstype = JS_STRING];</code>
     * @param value The insightId to set.
     * @return This builder for chaining.
     */
    public Builder setInsightId(long value) {

      insightId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required - id of insight to delete
     * </pre>
     *
     * <code>int64 insight_id = 1 [json_name = "insightId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearInsightId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      insightId_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.DeleteInsightRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.DeleteInsightRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteInsightRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteInsightRequest>() {
    @java.lang.Override
    public DeleteInsightRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteInsightRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteInsightRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.DeleteInsightRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

