// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/agenttraining/learning_opportunity.proto

package com.tcn.cloud.api.api.v1alpha1.agenttraining;

/**
 * <pre>
 * UpdateLearningOpportunityResponse represents the updated learning opportunity.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse}
 */
public final class UpdateLearningOpportunityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse)
    UpdateLearningOpportunityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateLearningOpportunityResponse.newBuilder() to construct.
  private UpdateLearningOpportunityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateLearningOpportunityResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateLearningOpportunityResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_UpdateLearningOpportunityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_UpdateLearningOpportunityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.class, com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.Builder.class);
  }

  private int bitField0_;
  public static final int LEARNING_OPPORTUNITY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.LearningOpportunity learningOpportunity_;
  /**
   * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
   * @return Whether the learningOpportunity field is set.
   */
  @java.lang.Override
  public boolean hasLearningOpportunity() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
   * @return The learningOpportunity.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.LearningOpportunity getLearningOpportunity() {
    return learningOpportunity_ == null ? com.tcn.cloud.api.api.commons.LearningOpportunity.getDefaultInstance() : learningOpportunity_;
  }
  /**
   * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.LearningOpportunityOrBuilder getLearningOpportunityOrBuilder() {
    return learningOpportunity_ == null ? com.tcn.cloud.api.api.commons.LearningOpportunity.getDefaultInstance() : learningOpportunity_;
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
      output.writeMessage(1, getLearningOpportunity());
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
        .computeMessageSize(1, getLearningOpportunity());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse other = (com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse) obj;

    if (hasLearningOpportunity() != other.hasLearningOpportunity()) return false;
    if (hasLearningOpportunity()) {
      if (!getLearningOpportunity()
          .equals(other.getLearningOpportunity())) return false;
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
    if (hasLearningOpportunity()) {
      hash = (37 * hash) + LEARNING_OPPORTUNITY_FIELD_NUMBER;
      hash = (53 * hash) + getLearningOpportunity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse prototype) {
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
   * UpdateLearningOpportunityResponse represents the updated learning opportunity.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse)
      com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_UpdateLearningOpportunityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_UpdateLearningOpportunityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.class, com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.newBuilder()
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
        getLearningOpportunityFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      learningOpportunity_ = null;
      if (learningOpportunityBuilder_ != null) {
        learningOpportunityBuilder_.dispose();
        learningOpportunityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_UpdateLearningOpportunityResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse build() {
      com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse result = new com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.learningOpportunity_ = learningOpportunityBuilder_ == null
            ? learningOpportunity_
            : learningOpportunityBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse.getDefaultInstance()) return this;
      if (other.hasLearningOpportunity()) {
        mergeLearningOpportunity(other.getLearningOpportunity());
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
                  getLearningOpportunityFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.LearningOpportunity learningOpportunity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.LearningOpportunity, com.tcn.cloud.api.api.commons.LearningOpportunity.Builder, com.tcn.cloud.api.api.commons.LearningOpportunityOrBuilder> learningOpportunityBuilder_;
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     * @return Whether the learningOpportunity field is set.
     */
    public boolean hasLearningOpportunity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     * @return The learningOpportunity.
     */
    public com.tcn.cloud.api.api.commons.LearningOpportunity getLearningOpportunity() {
      if (learningOpportunityBuilder_ == null) {
        return learningOpportunity_ == null ? com.tcn.cloud.api.api.commons.LearningOpportunity.getDefaultInstance() : learningOpportunity_;
      } else {
        return learningOpportunityBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     */
    public Builder setLearningOpportunity(com.tcn.cloud.api.api.commons.LearningOpportunity value) {
      if (learningOpportunityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        learningOpportunity_ = value;
      } else {
        learningOpportunityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     */
    public Builder setLearningOpportunity(
        com.tcn.cloud.api.api.commons.LearningOpportunity.Builder builderForValue) {
      if (learningOpportunityBuilder_ == null) {
        learningOpportunity_ = builderForValue.build();
      } else {
        learningOpportunityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     */
    public Builder mergeLearningOpportunity(com.tcn.cloud.api.api.commons.LearningOpportunity value) {
      if (learningOpportunityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          learningOpportunity_ != null &&
          learningOpportunity_ != com.tcn.cloud.api.api.commons.LearningOpportunity.getDefaultInstance()) {
          getLearningOpportunityBuilder().mergeFrom(value);
        } else {
          learningOpportunity_ = value;
        }
      } else {
        learningOpportunityBuilder_.mergeFrom(value);
      }
      if (learningOpportunity_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     */
    public Builder clearLearningOpportunity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      learningOpportunity_ = null;
      if (learningOpportunityBuilder_ != null) {
        learningOpportunityBuilder_.dispose();
        learningOpportunityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     */
    public com.tcn.cloud.api.api.commons.LearningOpportunity.Builder getLearningOpportunityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getLearningOpportunityFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     */
    public com.tcn.cloud.api.api.commons.LearningOpportunityOrBuilder getLearningOpportunityOrBuilder() {
      if (learningOpportunityBuilder_ != null) {
        return learningOpportunityBuilder_.getMessageOrBuilder();
      } else {
        return learningOpportunity_ == null ?
            com.tcn.cloud.api.api.commons.LearningOpportunity.getDefaultInstance() : learningOpportunity_;
      }
    }
    /**
     * <code>.api.commons.LearningOpportunity learning_opportunity = 1 [json_name = "learningOpportunity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.LearningOpportunity, com.tcn.cloud.api.api.commons.LearningOpportunity.Builder, com.tcn.cloud.api.api.commons.LearningOpportunityOrBuilder> 
        getLearningOpportunityFieldBuilder() {
      if (learningOpportunityBuilder_ == null) {
        learningOpportunityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.LearningOpportunity, com.tcn.cloud.api.api.commons.LearningOpportunity.Builder, com.tcn.cloud.api.api.commons.LearningOpportunityOrBuilder>(
                getLearningOpportunity(),
                getParentForChildren(),
                isClean());
        learningOpportunity_ = null;
      }
      return learningOpportunityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateLearningOpportunityResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateLearningOpportunityResponse>() {
    @java.lang.Override
    public UpdateLearningOpportunityResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateLearningOpportunityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateLearningOpportunityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.agenttraining.UpdateLearningOpportunityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

