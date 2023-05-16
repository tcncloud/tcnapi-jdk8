// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * CreateQuestionResponse contains the question that was created.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.CreateQuestionResponse}
 */
public final class CreateQuestionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.CreateQuestionResponse)
    CreateQuestionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateQuestionResponse.newBuilder() to construct.
  private CreateQuestionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateQuestionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateQuestionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.Builder.class);
  }

  public static final int QUESTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.Question question_;
  /**
   * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
   * @return Whether the question field is set.
   */
  @java.lang.Override
  public boolean hasQuestion() {
    return question_ != null;
  }
  /**
   * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
   * @return The question.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Question getQuestion() {
    return question_ == null ? com.tcn.cloud.api.api.commons.Question.getDefaultInstance() : question_;
  }
  /**
   * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.QuestionOrBuilder getQuestionOrBuilder() {
    return question_ == null ? com.tcn.cloud.api.api.commons.Question.getDefaultInstance() : question_;
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
    if (question_ != null) {
      output.writeMessage(1, getQuestion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (question_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQuestion());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse other = (com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse) obj;

    if (hasQuestion() != other.hasQuestion()) return false;
    if (hasQuestion()) {
      if (!getQuestion()
          .equals(other.getQuestion())) return false;
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
    if (hasQuestion()) {
      hash = (37 * hash) + QUESTION_FIELD_NUMBER;
      hash = (53 * hash) + getQuestion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse prototype) {
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
   * CreateQuestionResponse contains the question that was created.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.CreateQuestionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.CreateQuestionResponse)
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.newBuilder()
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
      question_ = null;
      if (questionBuilder_ != null) {
        questionBuilder_.dispose();
        questionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse result = new com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.question_ = questionBuilder_ == null
            ? question_
            : questionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.getDefaultInstance()) return this;
      if (other.hasQuestion()) {
        mergeQuestion(other.getQuestion());
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
                  getQuestionFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.Question question_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Question, com.tcn.cloud.api.api.commons.Question.Builder, com.tcn.cloud.api.api.commons.QuestionOrBuilder> questionBuilder_;
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     * @return Whether the question field is set.
     */
    public boolean hasQuestion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     * @return The question.
     */
    public com.tcn.cloud.api.api.commons.Question getQuestion() {
      if (questionBuilder_ == null) {
        return question_ == null ? com.tcn.cloud.api.api.commons.Question.getDefaultInstance() : question_;
      } else {
        return questionBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     */
    public Builder setQuestion(com.tcn.cloud.api.api.commons.Question value) {
      if (questionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        question_ = value;
      } else {
        questionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     */
    public Builder setQuestion(
        com.tcn.cloud.api.api.commons.Question.Builder builderForValue) {
      if (questionBuilder_ == null) {
        question_ = builderForValue.build();
      } else {
        questionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     */
    public Builder mergeQuestion(com.tcn.cloud.api.api.commons.Question value) {
      if (questionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          question_ != null &&
          question_ != com.tcn.cloud.api.api.commons.Question.getDefaultInstance()) {
          getQuestionBuilder().mergeFrom(value);
        } else {
          question_ = value;
        }
      } else {
        questionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     */
    public Builder clearQuestion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      question_ = null;
      if (questionBuilder_ != null) {
        questionBuilder_.dispose();
        questionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     */
    public com.tcn.cloud.api.api.commons.Question.Builder getQuestionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQuestionFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     */
    public com.tcn.cloud.api.api.commons.QuestionOrBuilder getQuestionOrBuilder() {
      if (questionBuilder_ != null) {
        return questionBuilder_.getMessageOrBuilder();
      } else {
        return question_ == null ?
            com.tcn.cloud.api.api.commons.Question.getDefaultInstance() : question_;
      }
    }
    /**
     * <code>.api.commons.Question question = 1 [json_name = "question"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Question, com.tcn.cloud.api.api.commons.Question.Builder, com.tcn.cloud.api.api.commons.QuestionOrBuilder> 
        getQuestionFieldBuilder() {
      if (questionBuilder_ == null) {
        questionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Question, com.tcn.cloud.api.api.commons.Question.Builder, com.tcn.cloud.api.api.commons.QuestionOrBuilder>(
                getQuestion(),
                getParentForChildren(),
                isClean());
        question_ = null;
      }
      return questionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.CreateQuestionResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.CreateQuestionResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateQuestionResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateQuestionResponse>() {
    @java.lang.Override
    public CreateQuestionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateQuestionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateQuestionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

