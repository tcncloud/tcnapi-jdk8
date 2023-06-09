// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * DeleteEvaluationQuestionRequest is request to delete an evaluation question
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest}
 */
public final class DeleteEvaluationQuestionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest)
    DeleteEvaluationQuestionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteEvaluationQuestionRequest.newBuilder() to construct.
  private DeleteEvaluationQuestionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteEvaluationQuestionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteEvaluationQuestionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteEvaluationQuestionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteEvaluationQuestionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.Builder.class);
  }

  public static final int EVALUATION_QUESTION_ID_FIELD_NUMBER = 2;
  private long evaluationQuestionId_ = 0L;
  /**
   * <pre>
   * Required - unique id of evaluation question to delete
   * </pre>
   *
   * <code>int64 evaluation_question_id = 2 [json_name = "evaluationQuestionId"];</code>
   * @return The evaluationQuestionId.
   */
  @java.lang.Override
  public long getEvaluationQuestionId() {
    return evaluationQuestionId_;
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
    if (evaluationQuestionId_ != 0L) {
      output.writeInt64(2, evaluationQuestionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (evaluationQuestionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, evaluationQuestionId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest other = (com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest) obj;

    if (getEvaluationQuestionId()
        != other.getEvaluationQuestionId()) return false;
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
    hash = (37 * hash) + EVALUATION_QUESTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEvaluationQuestionId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest prototype) {
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
   * DeleteEvaluationQuestionRequest is request to delete an evaluation question
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest)
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteEvaluationQuestionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteEvaluationQuestionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.newBuilder()
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
      evaluationQuestionId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.internal_static_api_v1alpha1_scorecards_DeleteEvaluationQuestionRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest result = new com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evaluationQuestionId_ = evaluationQuestionId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.getDefaultInstance()) return this;
      if (other.getEvaluationQuestionId() != 0L) {
        setEvaluationQuestionId(other.getEvaluationQuestionId());
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
            case 16: {
              evaluationQuestionId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
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

    private long evaluationQuestionId_ ;
    /**
     * <pre>
     * Required - unique id of evaluation question to delete
     * </pre>
     *
     * <code>int64 evaluation_question_id = 2 [json_name = "evaluationQuestionId"];</code>
     * @return The evaluationQuestionId.
     */
    @java.lang.Override
    public long getEvaluationQuestionId() {
      return evaluationQuestionId_;
    }
    /**
     * <pre>
     * Required - unique id of evaluation question to delete
     * </pre>
     *
     * <code>int64 evaluation_question_id = 2 [json_name = "evaluationQuestionId"];</code>
     * @param value The evaluationQuestionId to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluationQuestionId(long value) {

      evaluationQuestionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required - unique id of evaluation question to delete
     * </pre>
     *
     * <code>int64 evaluation_question_id = 2 [json_name = "evaluationQuestionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEvaluationQuestionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      evaluationQuestionId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteEvaluationQuestionRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteEvaluationQuestionRequest>() {
    @java.lang.Override
    public DeleteEvaluationQuestionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteEvaluationQuestionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteEvaluationQuestionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

