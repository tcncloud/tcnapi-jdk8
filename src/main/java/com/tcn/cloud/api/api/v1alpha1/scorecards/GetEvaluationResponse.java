// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * GetEvaluationReponse is response with requested entity
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.GetEvaluationResponse}
 */
public final class GetEvaluationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.GetEvaluationResponse)
    GetEvaluationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEvaluationResponse.newBuilder() to construct.
  private GetEvaluationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEvaluationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEvaluationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.Builder.class);
  }

  public static final int EVALUATION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.Evaluation evaluation_;
  /**
   * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
   * @return Whether the evaluation field is set.
   */
  @java.lang.Override
  public boolean hasEvaluation() {
    return evaluation_ != null;
  }
  /**
   * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
   * @return The evaluation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Evaluation getEvaluation() {
    return evaluation_ == null ? com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance() : evaluation_;
  }
  /**
   * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.EvaluationOrBuilder getEvaluationOrBuilder() {
    return evaluation_ == null ? com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance() : evaluation_;
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
    if (evaluation_ != null) {
      output.writeMessage(1, getEvaluation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (evaluation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEvaluation());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse other = (com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse) obj;

    if (hasEvaluation() != other.hasEvaluation()) return false;
    if (hasEvaluation()) {
      if (!getEvaluation()
          .equals(other.getEvaluation())) return false;
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
    if (hasEvaluation()) {
      hash = (37 * hash) + EVALUATION_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse prototype) {
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
   * GetEvaluationReponse is response with requested entity
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.GetEvaluationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.GetEvaluationResponse)
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.newBuilder()
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
      evaluation_ = null;
      if (evaluationBuilder_ != null) {
        evaluationBuilder_.dispose();
        evaluationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse result = new com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evaluation_ = evaluationBuilder_ == null
            ? evaluation_
            : evaluationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.getDefaultInstance()) return this;
      if (other.hasEvaluation()) {
        mergeEvaluation(other.getEvaluation());
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
                  getEvaluationFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.Evaluation evaluation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Evaluation, com.tcn.cloud.api.api.commons.Evaluation.Builder, com.tcn.cloud.api.api.commons.EvaluationOrBuilder> evaluationBuilder_;
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     * @return Whether the evaluation field is set.
     */
    public boolean hasEvaluation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     * @return The evaluation.
     */
    public com.tcn.cloud.api.api.commons.Evaluation getEvaluation() {
      if (evaluationBuilder_ == null) {
        return evaluation_ == null ? com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance() : evaluation_;
      } else {
        return evaluationBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     */
    public Builder setEvaluation(com.tcn.cloud.api.api.commons.Evaluation value) {
      if (evaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evaluation_ = value;
      } else {
        evaluationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     */
    public Builder setEvaluation(
        com.tcn.cloud.api.api.commons.Evaluation.Builder builderForValue) {
      if (evaluationBuilder_ == null) {
        evaluation_ = builderForValue.build();
      } else {
        evaluationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     */
    public Builder mergeEvaluation(com.tcn.cloud.api.api.commons.Evaluation value) {
      if (evaluationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          evaluation_ != null &&
          evaluation_ != com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance()) {
          getEvaluationBuilder().mergeFrom(value);
        } else {
          evaluation_ = value;
        }
      } else {
        evaluationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     */
    public Builder clearEvaluation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      evaluation_ = null;
      if (evaluationBuilder_ != null) {
        evaluationBuilder_.dispose();
        evaluationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     */
    public com.tcn.cloud.api.api.commons.Evaluation.Builder getEvaluationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEvaluationFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     */
    public com.tcn.cloud.api.api.commons.EvaluationOrBuilder getEvaluationOrBuilder() {
      if (evaluationBuilder_ != null) {
        return evaluationBuilder_.getMessageOrBuilder();
      } else {
        return evaluation_ == null ?
            com.tcn.cloud.api.api.commons.Evaluation.getDefaultInstance() : evaluation_;
      }
    }
    /**
     * <code>.api.commons.Evaluation evaluation = 1 [json_name = "evaluation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Evaluation, com.tcn.cloud.api.api.commons.Evaluation.Builder, com.tcn.cloud.api.api.commons.EvaluationOrBuilder> 
        getEvaluationFieldBuilder() {
      if (evaluationBuilder_ == null) {
        evaluationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Evaluation, com.tcn.cloud.api.api.commons.Evaluation.Builder, com.tcn.cloud.api.api.commons.EvaluationOrBuilder>(
                getEvaluation(),
                getParentForChildren(),
                isClean());
        evaluation_ = null;
      }
      return evaluationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.GetEvaluationResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.GetEvaluationResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEvaluationResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEvaluationResponse>() {
    @java.lang.Override
    public GetEvaluationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetEvaluationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEvaluationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

