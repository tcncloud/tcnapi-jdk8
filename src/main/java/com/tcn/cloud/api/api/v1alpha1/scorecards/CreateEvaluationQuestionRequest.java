// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * CreateEvaluationQuestionRequest is request to create an evaluation question
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.CreateEvaluationQuestionRequest}
 */
public final class CreateEvaluationQuestionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.CreateEvaluationQuestionRequest)
    CreateEvaluationQuestionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEvaluationQuestionRequest.newBuilder() to construct.
  private CreateEvaluationQuestionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEvaluationQuestionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateEvaluationQuestionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_CreateEvaluationQuestionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_CreateEvaluationQuestionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int EVALUATION_QUESTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.EvaluationQuestion evaluationQuestion_;
  /**
   * <pre>
   * Required - the entity which is requested to be created
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
   * @return Whether the evaluationQuestion field is set.
   */
  @java.lang.Override
  public boolean hasEvaluationQuestion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required - the entity which is requested to be created
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
   * @return The evaluationQuestion.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.EvaluationQuestion getEvaluationQuestion() {
    return evaluationQuestion_ == null ? com.tcn.cloud.api.api.commons.EvaluationQuestion.getDefaultInstance() : evaluationQuestion_;
  }
  /**
   * <pre>
   * Required - the entity which is requested to be created
   * </pre>
   *
   * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.EvaluationQuestionOrBuilder getEvaluationQuestionOrBuilder() {
    return evaluationQuestion_ == null ? com.tcn.cloud.api.api.commons.EvaluationQuestion.getDefaultInstance() : evaluationQuestion_;
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
      output.writeMessage(1, getEvaluationQuestion());
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
        .computeMessageSize(1, getEvaluationQuestion());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest other = (com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest) obj;

    if (hasEvaluationQuestion() != other.hasEvaluationQuestion()) return false;
    if (hasEvaluationQuestion()) {
      if (!getEvaluationQuestion()
          .equals(other.getEvaluationQuestion())) return false;
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
    if (hasEvaluationQuestion()) {
      hash = (37 * hash) + EVALUATION_QUESTION_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluationQuestion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest prototype) {
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
   * CreateEvaluationQuestionRequest is request to create an evaluation question
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.CreateEvaluationQuestionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.CreateEvaluationQuestionRequest)
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_CreateEvaluationQuestionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_CreateEvaluationQuestionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.newBuilder()
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
        getEvaluationQuestionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      evaluationQuestion_ = null;
      if (evaluationQuestionBuilder_ != null) {
        evaluationQuestionBuilder_.dispose();
        evaluationQuestionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_CreateEvaluationQuestionRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest result = new com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evaluationQuestion_ = evaluationQuestionBuilder_ == null
            ? evaluationQuestion_
            : evaluationQuestionBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.getDefaultInstance()) return this;
      if (other.hasEvaluationQuestion()) {
        mergeEvaluationQuestion(other.getEvaluationQuestion());
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
                  getEvaluationQuestionFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.EvaluationQuestion evaluationQuestion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.EvaluationQuestion, com.tcn.cloud.api.api.commons.EvaluationQuestion.Builder, com.tcn.cloud.api.api.commons.EvaluationQuestionOrBuilder> evaluationQuestionBuilder_;
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     * @return Whether the evaluationQuestion field is set.
     */
    public boolean hasEvaluationQuestion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     * @return The evaluationQuestion.
     */
    public com.tcn.cloud.api.api.commons.EvaluationQuestion getEvaluationQuestion() {
      if (evaluationQuestionBuilder_ == null) {
        return evaluationQuestion_ == null ? com.tcn.cloud.api.api.commons.EvaluationQuestion.getDefaultInstance() : evaluationQuestion_;
      } else {
        return evaluationQuestionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     */
    public Builder setEvaluationQuestion(com.tcn.cloud.api.api.commons.EvaluationQuestion value) {
      if (evaluationQuestionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evaluationQuestion_ = value;
      } else {
        evaluationQuestionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     */
    public Builder setEvaluationQuestion(
        com.tcn.cloud.api.api.commons.EvaluationQuestion.Builder builderForValue) {
      if (evaluationQuestionBuilder_ == null) {
        evaluationQuestion_ = builderForValue.build();
      } else {
        evaluationQuestionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     */
    public Builder mergeEvaluationQuestion(com.tcn.cloud.api.api.commons.EvaluationQuestion value) {
      if (evaluationQuestionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          evaluationQuestion_ != null &&
          evaluationQuestion_ != com.tcn.cloud.api.api.commons.EvaluationQuestion.getDefaultInstance()) {
          getEvaluationQuestionBuilder().mergeFrom(value);
        } else {
          evaluationQuestion_ = value;
        }
      } else {
        evaluationQuestionBuilder_.mergeFrom(value);
      }
      if (evaluationQuestion_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     */
    public Builder clearEvaluationQuestion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      evaluationQuestion_ = null;
      if (evaluationQuestionBuilder_ != null) {
        evaluationQuestionBuilder_.dispose();
        evaluationQuestionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     */
    public com.tcn.cloud.api.api.commons.EvaluationQuestion.Builder getEvaluationQuestionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEvaluationQuestionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     */
    public com.tcn.cloud.api.api.commons.EvaluationQuestionOrBuilder getEvaluationQuestionOrBuilder() {
      if (evaluationQuestionBuilder_ != null) {
        return evaluationQuestionBuilder_.getMessageOrBuilder();
      } else {
        return evaluationQuestion_ == null ?
            com.tcn.cloud.api.api.commons.EvaluationQuestion.getDefaultInstance() : evaluationQuestion_;
      }
    }
    /**
     * <pre>
     * Required - the entity which is requested to be created
     * </pre>
     *
     * <code>.api.commons.EvaluationQuestion evaluation_question = 1 [json_name = "evaluationQuestion"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.EvaluationQuestion, com.tcn.cloud.api.api.commons.EvaluationQuestion.Builder, com.tcn.cloud.api.api.commons.EvaluationQuestionOrBuilder> 
        getEvaluationQuestionFieldBuilder() {
      if (evaluationQuestionBuilder_ == null) {
        evaluationQuestionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.EvaluationQuestion, com.tcn.cloud.api.api.commons.EvaluationQuestion.Builder, com.tcn.cloud.api.api.commons.EvaluationQuestionOrBuilder>(
                getEvaluationQuestion(),
                getParentForChildren(),
                isClean());
        evaluationQuestion_ = null;
      }
      return evaluationQuestionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.CreateEvaluationQuestionRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.CreateEvaluationQuestionRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEvaluationQuestionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateEvaluationQuestionRequest>() {
    @java.lang.Override
    public CreateEvaluationQuestionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateEvaluationQuestionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEvaluationQuestionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

