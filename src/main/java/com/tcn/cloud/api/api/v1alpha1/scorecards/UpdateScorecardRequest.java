// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/scorecard.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * UpdateScorecardRequest is the request for updating a scorecard.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.UpdateScorecardRequest}
 */
public final class UpdateScorecardRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.UpdateScorecardRequest)
    UpdateScorecardRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateScorecardRequest.newBuilder() to construct.
  private UpdateScorecardRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateScorecardRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateScorecardRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SCORECARD_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.Scorecard scorecard_;
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
   * @return Whether the scorecard field is set.
   */
  @java.lang.Override
  public boolean hasScorecard() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
   * @return The scorecard.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Scorecard getScorecard() {
    return scorecard_ == null ? com.tcn.cloud.api.api.commons.Scorecard.getDefaultInstance() : scorecard_;
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ScorecardOrBuilder getScorecardOrBuilder() {
    return scorecard_ == null ? com.tcn.cloud.api.api.commons.Scorecard.getDefaultInstance() : scorecard_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Valid paths: [title, description, pass_score, score_type,
   * evaluation_type, allow_feedback, distribute_weights, category.category_id].
   * To update Sections, use *Section and *ScorecardQuestion methods.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Required. Valid paths: [title, description, pass_score, score_type,
   * evaluation_type, allow_feedback, distribute_weights, category.category_id].
   * To update Sections, use *Section and *ScorecardQuestion methods.
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
   * Required. Valid paths: [title, description, pass_score, score_type,
   * evaluation_type, allow_feedback, distribute_weights, category.category_id].
   * To update Sections, use *Section and *ScorecardQuestion methods.
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getScorecard());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
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
        .computeMessageSize(1, getScorecard());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest other = (com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest) obj;

    if (hasScorecard() != other.hasScorecard()) return false;
    if (hasScorecard()) {
      if (!getScorecard()
          .equals(other.getScorecard())) return false;
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
    if (hasScorecard()) {
      hash = (37 * hash) + SCORECARD_FIELD_NUMBER;
      hash = (53 * hash) + getScorecard().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest prototype) {
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
   * UpdateScorecardRequest is the request for updating a scorecard.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.UpdateScorecardRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.UpdateScorecardRequest)
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.newBuilder()
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
        getScorecardFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scorecard_ = null;
      if (scorecardBuilder_ != null) {
        scorecardBuilder_.dispose();
        scorecardBuilder_ = null;
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
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_UpdateScorecardRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest result = new com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scorecard_ = scorecardBuilder_ == null
            ? scorecard_
            : scorecardBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.getDefaultInstance()) return this;
      if (other.hasScorecard()) {
        mergeScorecard(other.getScorecard());
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
                  getScorecardFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.Scorecard scorecard_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Scorecard, com.tcn.cloud.api.api.commons.Scorecard.Builder, com.tcn.cloud.api.api.commons.ScorecardOrBuilder> scorecardBuilder_;
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     * @return Whether the scorecard field is set.
     */
    public boolean hasScorecard() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     * @return The scorecard.
     */
    public com.tcn.cloud.api.api.commons.Scorecard getScorecard() {
      if (scorecardBuilder_ == null) {
        return scorecard_ == null ? com.tcn.cloud.api.api.commons.Scorecard.getDefaultInstance() : scorecard_;
      } else {
        return scorecardBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     */
    public Builder setScorecard(com.tcn.cloud.api.api.commons.Scorecard value) {
      if (scorecardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scorecard_ = value;
      } else {
        scorecardBuilder_.setMessage(value);
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
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     */
    public Builder setScorecard(
        com.tcn.cloud.api.api.commons.Scorecard.Builder builderForValue) {
      if (scorecardBuilder_ == null) {
        scorecard_ = builderForValue.build();
      } else {
        scorecardBuilder_.setMessage(builderForValue.build());
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
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     */
    public Builder mergeScorecard(com.tcn.cloud.api.api.commons.Scorecard value) {
      if (scorecardBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          scorecard_ != null &&
          scorecard_ != com.tcn.cloud.api.api.commons.Scorecard.getDefaultInstance()) {
          getScorecardBuilder().mergeFrom(value);
        } else {
          scorecard_ = value;
        }
      } else {
        scorecardBuilder_.mergeFrom(value);
      }
      if (scorecard_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     */
    public Builder clearScorecard() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scorecard_ = null;
      if (scorecardBuilder_ != null) {
        scorecardBuilder_.dispose();
        scorecardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     */
    public com.tcn.cloud.api.api.commons.Scorecard.Builder getScorecardBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScorecardFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScorecardOrBuilder getScorecardOrBuilder() {
      if (scorecardBuilder_ != null) {
        return scorecardBuilder_.getMessageOrBuilder();
      } else {
        return scorecard_ == null ?
            com.tcn.cloud.api.api.commons.Scorecard.getDefaultInstance() : scorecard_;
      }
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Scorecard, com.tcn.cloud.api.api.commons.Scorecard.Builder, com.tcn.cloud.api.api.commons.ScorecardOrBuilder> 
        getScorecardFieldBuilder() {
      if (scorecardBuilder_ == null) {
        scorecardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Scorecard, com.tcn.cloud.api.api.commons.Scorecard.Builder, com.tcn.cloud.api.api.commons.ScorecardOrBuilder>(
                getScorecard(),
                getParentForChildren(),
                isClean());
        scorecard_ = null;
      }
      return scorecardBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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
     * Required. Valid paths: [title, description, pass_score, score_type,
     * evaluation_type, allow_feedback, distribute_weights, category.category_id].
     * To update Sections, use *Section and *ScorecardQuestion methods.
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.UpdateScorecardRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.UpdateScorecardRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateScorecardRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateScorecardRequest>() {
    @java.lang.Override
    public UpdateScorecardRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateScorecardRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateScorecardRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

