// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/scorecard_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * UpdateScorecardQuestionRequest is the request to update a scorecard question.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.UpdateScorecardQuestionRequest}
 */
public final class UpdateScorecardQuestionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.UpdateScorecardQuestionRequest)
    UpdateScorecardQuestionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateScorecardQuestionRequest.newBuilder() to construct.
  private UpdateScorecardQuestionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateScorecardQuestionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateScorecardQuestionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardQuestionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardQuestionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.Builder.class);
  }

  public static final int SCORECARD_QUESTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.ScorecardQuestion scorecardQuestion_;
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
   * @return Whether the scorecardQuestion field is set.
   */
  @java.lang.Override
  public boolean hasScorecardQuestion() {
    return scorecardQuestion_ != null;
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
   * @return The scorecardQuestion.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ScorecardQuestion getScorecardQuestion() {
    return scorecardQuestion_ == null ? com.tcn.cloud.api.api.commons.ScorecardQuestion.getDefaultInstance() : scorecardQuestion_;
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ScorecardQuestionOrBuilder getScorecardQuestionOrBuilder() {
    return scorecardQuestion_ == null ? com.tcn.cloud.api.api.commons.ScorecardQuestion.getDefaultInstance() : scorecardQuestion_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
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
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest other = (com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest) obj;

    if (hasScorecardQuestion() != other.hasScorecardQuestion()) return false;
    if (hasScorecardQuestion()) {
      if (!getScorecardQuestion()
          .equals(other.getScorecardQuestion())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest prototype) {
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
   * UpdateScorecardQuestionRequest is the request to update a scorecard question.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.UpdateScorecardQuestionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.UpdateScorecardQuestionRequest)
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardQuestionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardQuestionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.newBuilder()
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
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardQuestionRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest result = new com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scorecardQuestion_ = scorecardQuestionBuilder_ == null
            ? scorecardQuestion_
            : scorecardQuestionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.getDefaultInstance()) return this;
      if (other.hasScorecardQuestion()) {
        mergeScorecardQuestion(other.getScorecardQuestion());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     * @return Whether the scorecardQuestion field is set.
     */
    public boolean hasScorecardQuestion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
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
     * <pre>
     * Required.
     * </pre>
     *
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
     * <pre>
     * Required.
     * </pre>
     *
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
     * <pre>
     * Required.
     * </pre>
     *
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
     * <pre>
     * Required.
     * </pre>
     *
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
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.ScorecardQuestion scorecard_question = 1 [json_name = "scorecardQuestion"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScorecardQuestion.Builder getScorecardQuestionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScorecardQuestionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
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
     * <pre>
     * Required.
     * </pre>
     *
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

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.UpdateScorecardQuestionRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.UpdateScorecardQuestionRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateScorecardQuestionRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateScorecardQuestionRequest>() {
    @java.lang.Override
    public UpdateScorecardQuestionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateScorecardQuestionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateScorecardQuestionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

