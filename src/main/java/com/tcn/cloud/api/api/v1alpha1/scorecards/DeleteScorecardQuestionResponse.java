// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/scorecard_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * DeleteScorecardQuestionResponse returns the deleted scorecard question.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.DeleteScorecardQuestionResponse}
 */
public final class DeleteScorecardQuestionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.DeleteScorecardQuestionResponse)
    DeleteScorecardQuestionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteScorecardQuestionResponse.newBuilder() to construct.
  private DeleteScorecardQuestionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteScorecardQuestionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteScorecardQuestionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteScorecardQuestionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteScorecardQuestionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.Builder.class);
  }

  public static final int SCORECARD_QUESTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.ScorecardQuestion scorecardQuestion_;
  /**
   * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
   * @return Whether the scorecardQuestion field is set.
   */
  @java.lang.Override
  public boolean hasScorecardQuestion() {
    return scorecardQuestion_ != null;
  }
  /**
   * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
   * @return The scorecardQuestion.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ScorecardQuestion getScorecardQuestion() {
    return scorecardQuestion_ == null ? com.tcn.cloud.api.api.commons.ScorecardQuestion.getDefaultInstance() : scorecardQuestion_;
  }
  /**
   * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ScorecardQuestionOrBuilder getScorecardQuestionOrBuilder() {
    return scorecardQuestion_ == null ? com.tcn.cloud.api.api.commons.ScorecardQuestion.getDefaultInstance() : scorecardQuestion_;
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
    if (scorecardQuestion_ != null) {
      output.writeMessage(1, getScorecardQuestion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scorecardQuestion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getScorecardQuestion());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse other = (com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse) obj;

    if (hasScorecardQuestion() != other.hasScorecardQuestion()) return false;
    if (hasScorecardQuestion()) {
      if (!getScorecardQuestion()
          .equals(other.getScorecardQuestion())) return false;
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
    if (hasScorecardQuestion()) {
      hash = (37 * hash) + SCORECARD_QUESTION_FIELD_NUMBER;
      hash = (53 * hash) + getScorecardQuestion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse prototype) {
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
   * DeleteScorecardQuestionResponse returns the deleted scorecard question.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.DeleteScorecardQuestionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.DeleteScorecardQuestionResponse)
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteScorecardQuestionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteScorecardQuestionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.newBuilder()
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
      scorecardQuestion_ = null;
      if (scorecardQuestionBuilder_ != null) {
        scorecardQuestionBuilder_.dispose();
        scorecardQuestionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteScorecardQuestionResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse result = new com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scorecardQuestion_ = scorecardQuestionBuilder_ == null
            ? scorecardQuestion_
            : scorecardQuestionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.getDefaultInstance()) return this;
      if (other.hasScorecardQuestion()) {
        mergeScorecardQuestion(other.getScorecardQuestion());
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
                  getScorecardQuestionFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.ScorecardQuestion scorecardQuestion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ScorecardQuestion, com.tcn.cloud.api.api.commons.ScorecardQuestion.Builder, com.tcn.cloud.api.api.commons.ScorecardQuestionOrBuilder> scorecardQuestionBuilder_;
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     * @return Whether the scorecardQuestion field is set.
     */
    public boolean hasScorecardQuestion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     * @return The scorecardQuestion.
     */
    public com.tcn.cloud.api.api.commons.ScorecardQuestion getScorecardQuestion() {
      if (scorecardQuestionBuilder_ == null) {
        return scorecardQuestion_ == null ? com.tcn.cloud.api.api.commons.ScorecardQuestion.getDefaultInstance() : scorecardQuestion_;
      } else {
        return scorecardQuestionBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     */
    public Builder setScorecardQuestion(com.tcn.cloud.api.api.commons.ScorecardQuestion value) {
      if (scorecardQuestionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scorecardQuestion_ = value;
      } else {
        scorecardQuestionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     */
    public Builder setScorecardQuestion(
        com.tcn.cloud.api.api.commons.ScorecardQuestion.Builder builderForValue) {
      if (scorecardQuestionBuilder_ == null) {
        scorecardQuestion_ = builderForValue.build();
      } else {
        scorecardQuestionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     */
    public Builder mergeScorecardQuestion(com.tcn.cloud.api.api.commons.ScorecardQuestion value) {
      if (scorecardQuestionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          scorecardQuestion_ != null &&
          scorecardQuestion_ != com.tcn.cloud.api.api.commons.ScorecardQuestion.getDefaultInstance()) {
          getScorecardQuestionBuilder().mergeFrom(value);
        } else {
          scorecardQuestion_ = value;
        }
      } else {
        scorecardQuestionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     */
    public Builder clearScorecardQuestion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scorecardQuestion_ = null;
      if (scorecardQuestionBuilder_ != null) {
        scorecardQuestionBuilder_.dispose();
        scorecardQuestionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScorecardQuestion.Builder getScorecardQuestionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScorecardQuestionFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScorecardQuestionOrBuilder getScorecardQuestionOrBuilder() {
      if (scorecardQuestionBuilder_ != null) {
        return scorecardQuestionBuilder_.getMessageOrBuilder();
      } else {
        return scorecardQuestion_ == null ?
            com.tcn.cloud.api.api.commons.ScorecardQuestion.getDefaultInstance() : scorecardQuestion_;
      }
    }
    /**
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ScorecardQuestion, com.tcn.cloud.api.api.commons.ScorecardQuestion.Builder, com.tcn.cloud.api.api.commons.ScorecardQuestionOrBuilder> 
        getScorecardQuestionFieldBuilder() {
      if (scorecardQuestionBuilder_ == null) {
        scorecardQuestionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.ScorecardQuestion, com.tcn.cloud.api.api.commons.ScorecardQuestion.Builder, com.tcn.cloud.api.api.commons.ScorecardQuestionOrBuilder>(
                getScorecardQuestion(),
                getParentForChildren(),
                isClean());
        scorecardQuestion_ = null;
      }
      return scorecardQuestionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.DeleteScorecardQuestionResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.DeleteScorecardQuestionResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteScorecardQuestionResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteScorecardQuestionResponse>() {
    @java.lang.Override
    public DeleteScorecardQuestionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteScorecardQuestionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteScorecardQuestionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

