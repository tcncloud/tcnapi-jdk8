// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/scorecard.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * GetScorecardResponse contains a scorecard.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.GetScorecardResponse}
 */
public final class GetScorecardResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.GetScorecardResponse)
    GetScorecardResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetScorecardResponse.newBuilder() to construct.
  private GetScorecardResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetScorecardResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetScorecardResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_GetScorecardResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_GetScorecardResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.Builder.class);
  }

  public static final int SCORECARD_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.Scorecard scorecard_;
  /**
   * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
   * @return Whether the scorecard field is set.
   */
  @java.lang.Override
  public boolean hasScorecard() {
    return scorecard_ != null;
  }
  /**
   * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
   * @return The scorecard.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Scorecard getScorecard() {
    return scorecard_ == null ? com.tcn.cloud.api.api.commons.Scorecard.getDefaultInstance() : scorecard_;
  }
  /**
   * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ScorecardOrBuilder getScorecardOrBuilder() {
    return scorecard_ == null ? com.tcn.cloud.api.api.commons.Scorecard.getDefaultInstance() : scorecard_;
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
    if (scorecard_ != null) {
      output.writeMessage(1, getScorecard());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scorecard_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getScorecard());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse other = (com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse) obj;

    if (hasScorecard() != other.hasScorecard()) return false;
    if (hasScorecard()) {
      if (!getScorecard()
          .equals(other.getScorecard())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse prototype) {
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
   * GetScorecardResponse contains a scorecard.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.GetScorecardResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.GetScorecardResponse)
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_GetScorecardResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_GetScorecardResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.newBuilder()
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
      scorecard_ = null;
      if (scorecardBuilder_ != null) {
        scorecardBuilder_.dispose();
        scorecardBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.internal_static_api_v1alpha1_scorecards_GetScorecardResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse result = new com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scorecard_ = scorecardBuilder_ == null
            ? scorecard_
            : scorecardBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.getDefaultInstance()) return this;
      if (other.hasScorecard()) {
        mergeScorecard(other.getScorecard());
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
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     * @return Whether the scorecard field is set.
     */
    public boolean hasScorecard() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
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
     * <code>.api.commons.Scorecard scorecard = 1 [json_name = "scorecard"];</code>
     */
    public com.tcn.cloud.api.api.commons.Scorecard.Builder getScorecardBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScorecardFieldBuilder().getBuilder();
    }
    /**
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.GetScorecardResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.GetScorecardResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetScorecardResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetScorecardResponse>() {
    @java.lang.Override
    public GetScorecardResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetScorecardResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetScorecardResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

