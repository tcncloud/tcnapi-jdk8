// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * DeleteAutoEvaluationResponse returns the deleted auto evaluation.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.DeleteAutoEvaluationResponse}
 */
public final class DeleteAutoEvaluationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.DeleteAutoEvaluationResponse)
    DeleteAutoEvaluationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteAutoEvaluationResponse.newBuilder() to construct.
  private DeleteAutoEvaluationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteAutoEvaluationResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteAutoEvaluationResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.Builder.class);
  }

  public static final int AUTO_EVALUATION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.AutoEvaluation autoEvaluation_;
  /**
   * <pre>
   * deleted auto evaluation object.
   * </pre>
   *
   * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
   * @return Whether the autoEvaluation field is set.
   */
  @java.lang.Override
  public boolean hasAutoEvaluation() {
    return autoEvaluation_ != null;
  }
  /**
   * <pre>
   * deleted auto evaluation object.
   * </pre>
   *
   * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
   * @return The autoEvaluation.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AutoEvaluation getAutoEvaluation() {
    return autoEvaluation_ == null ? com.tcn.cloud.api.api.commons.AutoEvaluation.getDefaultInstance() : autoEvaluation_;
  }
  /**
   * <pre>
   * deleted auto evaluation object.
   * </pre>
   *
   * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AutoEvaluationOrBuilder getAutoEvaluationOrBuilder() {
    return autoEvaluation_ == null ? com.tcn.cloud.api.api.commons.AutoEvaluation.getDefaultInstance() : autoEvaluation_;
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
    if (autoEvaluation_ != null) {
      output.writeMessage(1, getAutoEvaluation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (autoEvaluation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAutoEvaluation());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse other = (com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse) obj;

    if (hasAutoEvaluation() != other.hasAutoEvaluation()) return false;
    if (hasAutoEvaluation()) {
      if (!getAutoEvaluation()
          .equals(other.getAutoEvaluation())) return false;
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
    if (hasAutoEvaluation()) {
      hash = (37 * hash) + AUTO_EVALUATION_FIELD_NUMBER;
      hash = (53 * hash) + getAutoEvaluation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse prototype) {
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
   * DeleteAutoEvaluationResponse returns the deleted auto evaluation.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.DeleteAutoEvaluationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.DeleteAutoEvaluationResponse)
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.newBuilder()
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
      autoEvaluation_ = null;
      if (autoEvaluationBuilder_ != null) {
        autoEvaluationBuilder_.dispose();
        autoEvaluationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse result = new com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.autoEvaluation_ = autoEvaluationBuilder_ == null
            ? autoEvaluation_
            : autoEvaluationBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.getDefaultInstance()) return this;
      if (other.hasAutoEvaluation()) {
        mergeAutoEvaluation(other.getAutoEvaluation());
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
                  getAutoEvaluationFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.AutoEvaluation autoEvaluation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AutoEvaluation, com.tcn.cloud.api.api.commons.AutoEvaluation.Builder, com.tcn.cloud.api.api.commons.AutoEvaluationOrBuilder> autoEvaluationBuilder_;
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     * @return Whether the autoEvaluation field is set.
     */
    public boolean hasAutoEvaluation() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     * @return The autoEvaluation.
     */
    public com.tcn.cloud.api.api.commons.AutoEvaluation getAutoEvaluation() {
      if (autoEvaluationBuilder_ == null) {
        return autoEvaluation_ == null ? com.tcn.cloud.api.api.commons.AutoEvaluation.getDefaultInstance() : autoEvaluation_;
      } else {
        return autoEvaluationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     */
    public Builder setAutoEvaluation(com.tcn.cloud.api.api.commons.AutoEvaluation value) {
      if (autoEvaluationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        autoEvaluation_ = value;
      } else {
        autoEvaluationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     */
    public Builder setAutoEvaluation(
        com.tcn.cloud.api.api.commons.AutoEvaluation.Builder builderForValue) {
      if (autoEvaluationBuilder_ == null) {
        autoEvaluation_ = builderForValue.build();
      } else {
        autoEvaluationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     */
    public Builder mergeAutoEvaluation(com.tcn.cloud.api.api.commons.AutoEvaluation value) {
      if (autoEvaluationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          autoEvaluation_ != null &&
          autoEvaluation_ != com.tcn.cloud.api.api.commons.AutoEvaluation.getDefaultInstance()) {
          getAutoEvaluationBuilder().mergeFrom(value);
        } else {
          autoEvaluation_ = value;
        }
      } else {
        autoEvaluationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     */
    public Builder clearAutoEvaluation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      autoEvaluation_ = null;
      if (autoEvaluationBuilder_ != null) {
        autoEvaluationBuilder_.dispose();
        autoEvaluationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     */
    public com.tcn.cloud.api.api.commons.AutoEvaluation.Builder getAutoEvaluationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAutoEvaluationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     */
    public com.tcn.cloud.api.api.commons.AutoEvaluationOrBuilder getAutoEvaluationOrBuilder() {
      if (autoEvaluationBuilder_ != null) {
        return autoEvaluationBuilder_.getMessageOrBuilder();
      } else {
        return autoEvaluation_ == null ?
            com.tcn.cloud.api.api.commons.AutoEvaluation.getDefaultInstance() : autoEvaluation_;
      }
    }
    /**
     * <pre>
     * deleted auto evaluation object.
     * </pre>
     *
     * <code>.api.commons.AutoEvaluation auto_evaluation = 1 [json_name = "autoEvaluation"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AutoEvaluation, com.tcn.cloud.api.api.commons.AutoEvaluation.Builder, com.tcn.cloud.api.api.commons.AutoEvaluationOrBuilder> 
        getAutoEvaluationFieldBuilder() {
      if (autoEvaluationBuilder_ == null) {
        autoEvaluationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.AutoEvaluation, com.tcn.cloud.api.api.commons.AutoEvaluation.Builder, com.tcn.cloud.api.api.commons.AutoEvaluationOrBuilder>(
                getAutoEvaluation(),
                getParentForChildren(),
                isClean());
        autoEvaluation_ = null;
      }
      return autoEvaluationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.DeleteAutoEvaluationResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.DeleteAutoEvaluationResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteAutoEvaluationResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteAutoEvaluationResponse>() {
    @java.lang.Override
    public DeleteAutoEvaluationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteAutoEvaluationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteAutoEvaluationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

