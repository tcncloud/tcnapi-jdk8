// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/agenttraining/learning_opportunity.proto

package com.tcn.cloud.api.api.v1alpha1.agenttraining;

/**
 * <pre>
 * CompleteAgentLearningOpportunityRequest represents an agent
 * request to complete a learning opportunity assigned to that agent.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest}
 */
public final class CompleteAgentLearningOpportunityRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest)
    CompleteAgentLearningOpportunityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompleteAgentLearningOpportunityRequest.newBuilder() to construct.
  private CompleteAgentLearningOpportunityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompleteAgentLearningOpportunityRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompleteAgentLearningOpportunityRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_CompleteAgentLearningOpportunityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_CompleteAgentLearningOpportunityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.class, com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.Builder.class);
  }

  public static final int LEARNING_OPPORTUNITY_ID_FIELD_NUMBER = 3;
  private long learningOpportunityId_ = 0L;
  /**
   * <code>int64 learning_opportunity_id = 3 [json_name = "learningOpportunityId"];</code>
   * @return The learningOpportunityId.
   */
  @java.lang.Override
  public long getLearningOpportunityId() {
    return learningOpportunityId_;
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
    if (learningOpportunityId_ != 0L) {
      output.writeInt64(3, learningOpportunityId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (learningOpportunityId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, learningOpportunityId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest other = (com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest) obj;

    if (getLearningOpportunityId()
        != other.getLearningOpportunityId()) return false;
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
    hash = (37 * hash) + LEARNING_OPPORTUNITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLearningOpportunityId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest prototype) {
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
   * CompleteAgentLearningOpportunityRequest represents an agent
   * request to complete a learning opportunity assigned to that agent.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest)
      com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_CompleteAgentLearningOpportunityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_CompleteAgentLearningOpportunityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.class, com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.newBuilder()
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
      learningOpportunityId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.internal_static_api_v1alpha1_agenttraining_CompleteAgentLearningOpportunityRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest build() {
      com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest result = new com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.learningOpportunityId_ = learningOpportunityId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest.getDefaultInstance()) return this;
      if (other.getLearningOpportunityId() != 0L) {
        setLearningOpportunityId(other.getLearningOpportunityId());
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
            case 24: {
              learningOpportunityId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
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

    private long learningOpportunityId_ ;
    /**
     * <code>int64 learning_opportunity_id = 3 [json_name = "learningOpportunityId"];</code>
     * @return The learningOpportunityId.
     */
    @java.lang.Override
    public long getLearningOpportunityId() {
      return learningOpportunityId_;
    }
    /**
     * <code>int64 learning_opportunity_id = 3 [json_name = "learningOpportunityId"];</code>
     * @param value The learningOpportunityId to set.
     * @return This builder for chaining.
     */
    public Builder setLearningOpportunityId(long value) {

      learningOpportunityId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 learning_opportunity_id = 3 [json_name = "learningOpportunityId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLearningOpportunityId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      learningOpportunityId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompleteAgentLearningOpportunityRequest>
      PARSER = new com.google.protobuf.AbstractParser<CompleteAgentLearningOpportunityRequest>() {
    @java.lang.Override
    public CompleteAgentLearningOpportunityRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompleteAgentLearningOpportunityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompleteAgentLearningOpportunityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.agenttraining.CompleteAgentLearningOpportunityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
