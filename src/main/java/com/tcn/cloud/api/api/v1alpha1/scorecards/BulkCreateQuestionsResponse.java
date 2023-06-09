// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * BulkCreateQuestionsResponse returns the created questions
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.BulkCreateQuestionsResponse}
 */
public final class BulkCreateQuestionsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.BulkCreateQuestionsResponse)
    BulkCreateQuestionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BulkCreateQuestionsResponse.newBuilder() to construct.
  private BulkCreateQuestionsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BulkCreateQuestionsResponse() {
    questions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BulkCreateQuestionsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.Builder.class);
  }

  public static final int QUESTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.Question> questions_;
  /**
   * <pre>
   * Created questions.
   * </pre>
   *
   * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.Question> getQuestionsList() {
    return questions_;
  }
  /**
   * <pre>
   * Created questions.
   * </pre>
   *
   * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.QuestionOrBuilder> 
      getQuestionsOrBuilderList() {
    return questions_;
  }
  /**
   * <pre>
   * Created questions.
   * </pre>
   *
   * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
   */
  @java.lang.Override
  public int getQuestionsCount() {
    return questions_.size();
  }
  /**
   * <pre>
   * Created questions.
   * </pre>
   *
   * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Question getQuestions(int index) {
    return questions_.get(index);
  }
  /**
   * <pre>
   * Created questions.
   * </pre>
   *
   * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.QuestionOrBuilder getQuestionsOrBuilder(
      int index) {
    return questions_.get(index);
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
    for (int i = 0; i < questions_.size(); i++) {
      output.writeMessage(1, questions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < questions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, questions_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse other = (com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse) obj;

    if (!getQuestionsList()
        .equals(other.getQuestionsList())) return false;
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
    if (getQuestionsCount() > 0) {
      hash = (37 * hash) + QUESTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getQuestionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse prototype) {
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
   * BulkCreateQuestionsResponse returns the created questions
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.BulkCreateQuestionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.BulkCreateQuestionsResponse)
      com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.newBuilder()
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
      if (questionsBuilder_ == null) {
        questions_ = java.util.Collections.emptyList();
      } else {
        questions_ = null;
        questionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse result = new com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse result) {
      if (questionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          questions_ = java.util.Collections.unmodifiableList(questions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.questions_ = questions_;
      } else {
        result.questions_ = questionsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.getDefaultInstance()) return this;
      if (questionsBuilder_ == null) {
        if (!other.questions_.isEmpty()) {
          if (questions_.isEmpty()) {
            questions_ = other.questions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQuestionsIsMutable();
            questions_.addAll(other.questions_);
          }
          onChanged();
        }
      } else {
        if (!other.questions_.isEmpty()) {
          if (questionsBuilder_.isEmpty()) {
            questionsBuilder_.dispose();
            questionsBuilder_ = null;
            questions_ = other.questions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            questionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getQuestionsFieldBuilder() : null;
          } else {
            questionsBuilder_.addAllMessages(other.questions_);
          }
        }
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
              com.tcn.cloud.api.api.commons.Question m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.Question.parser(),
                      extensionRegistry);
              if (questionsBuilder_ == null) {
                ensureQuestionsIsMutable();
                questions_.add(m);
              } else {
                questionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.commons.Question> questions_ =
      java.util.Collections.emptyList();
    private void ensureQuestionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        questions_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.Question>(questions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Question, com.tcn.cloud.api.api.commons.Question.Builder, com.tcn.cloud.api.api.commons.QuestionOrBuilder> questionsBuilder_;

    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.Question> getQuestionsList() {
      if (questionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(questions_);
      } else {
        return questionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public int getQuestionsCount() {
      if (questionsBuilder_ == null) {
        return questions_.size();
      } else {
        return questionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public com.tcn.cloud.api.api.commons.Question getQuestions(int index) {
      if (questionsBuilder_ == null) {
        return questions_.get(index);
      } else {
        return questionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder setQuestions(
        int index, com.tcn.cloud.api.api.commons.Question value) {
      if (questionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuestionsIsMutable();
        questions_.set(index, value);
        onChanged();
      } else {
        questionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder setQuestions(
        int index, com.tcn.cloud.api.api.commons.Question.Builder builderForValue) {
      if (questionsBuilder_ == null) {
        ensureQuestionsIsMutable();
        questions_.set(index, builderForValue.build());
        onChanged();
      } else {
        questionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder addQuestions(com.tcn.cloud.api.api.commons.Question value) {
      if (questionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuestionsIsMutable();
        questions_.add(value);
        onChanged();
      } else {
        questionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder addQuestions(
        int index, com.tcn.cloud.api.api.commons.Question value) {
      if (questionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuestionsIsMutable();
        questions_.add(index, value);
        onChanged();
      } else {
        questionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder addQuestions(
        com.tcn.cloud.api.api.commons.Question.Builder builderForValue) {
      if (questionsBuilder_ == null) {
        ensureQuestionsIsMutable();
        questions_.add(builderForValue.build());
        onChanged();
      } else {
        questionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder addQuestions(
        int index, com.tcn.cloud.api.api.commons.Question.Builder builderForValue) {
      if (questionsBuilder_ == null) {
        ensureQuestionsIsMutable();
        questions_.add(index, builderForValue.build());
        onChanged();
      } else {
        questionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder addAllQuestions(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.Question> values) {
      if (questionsBuilder_ == null) {
        ensureQuestionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, questions_);
        onChanged();
      } else {
        questionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder clearQuestions() {
      if (questionsBuilder_ == null) {
        questions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        questionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public Builder removeQuestions(int index) {
      if (questionsBuilder_ == null) {
        ensureQuestionsIsMutable();
        questions_.remove(index);
        onChanged();
      } else {
        questionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public com.tcn.cloud.api.api.commons.Question.Builder getQuestionsBuilder(
        int index) {
      return getQuestionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public com.tcn.cloud.api.api.commons.QuestionOrBuilder getQuestionsOrBuilder(
        int index) {
      if (questionsBuilder_ == null) {
        return questions_.get(index);  } else {
        return questionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.QuestionOrBuilder> 
         getQuestionsOrBuilderList() {
      if (questionsBuilder_ != null) {
        return questionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(questions_);
      }
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public com.tcn.cloud.api.api.commons.Question.Builder addQuestionsBuilder() {
      return getQuestionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.Question.getDefaultInstance());
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public com.tcn.cloud.api.api.commons.Question.Builder addQuestionsBuilder(
        int index) {
      return getQuestionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.Question.getDefaultInstance());
    }
    /**
     * <pre>
     * Created questions.
     * </pre>
     *
     * <code>repeated .api.commons.Question questions = 1 [json_name = "questions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.Question.Builder> 
         getQuestionsBuilderList() {
      return getQuestionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Question, com.tcn.cloud.api.api.commons.Question.Builder, com.tcn.cloud.api.api.commons.QuestionOrBuilder> 
        getQuestionsFieldBuilder() {
      if (questionsBuilder_ == null) {
        questionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Question, com.tcn.cloud.api.api.commons.Question.Builder, com.tcn.cloud.api.api.commons.QuestionOrBuilder>(
                questions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        questions_ = null;
      }
      return questionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.BulkCreateQuestionsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.BulkCreateQuestionsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BulkCreateQuestionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<BulkCreateQuestionsResponse>() {
    @java.lang.Override
    public BulkCreateQuestionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BulkCreateQuestionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BulkCreateQuestionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

