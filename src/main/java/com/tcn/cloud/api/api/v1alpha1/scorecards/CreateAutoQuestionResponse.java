// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * CreateAutoQuestionResponse returns the created auto question.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.CreateAutoQuestionResponse}
 */
public final class CreateAutoQuestionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.CreateAutoQuestionResponse)
    CreateAutoQuestionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAutoQuestionResponse.newBuilder() to construct.
  private CreateAutoQuestionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAutoQuestionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAutoQuestionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoQuestionProto.internal_static_api_v1alpha1_scorecards_CreateAutoQuestionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoQuestionProto.internal_static_api_v1alpha1_scorecards_CreateAutoQuestionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.Builder.class);
  }

  public static final int AUTO_QUESTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.AutoQuestion autoQuestion_;
  /**
   * <pre>
   * updated auto question object.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
   * @return Whether the autoQuestion field is set.
   */
  @java.lang.Override
  public boolean hasAutoQuestion() {
    return autoQuestion_ != null;
  }
  /**
   * <pre>
   * updated auto question object.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
   * @return The autoQuestion.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AutoQuestion getAutoQuestion() {
    return autoQuestion_ == null ? com.tcn.cloud.api.api.commons.AutoQuestion.getDefaultInstance() : autoQuestion_;
  }
  /**
   * <pre>
   * updated auto question object.
   * </pre>
   *
   * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AutoQuestionOrBuilder getAutoQuestionOrBuilder() {
    return autoQuestion_ == null ? com.tcn.cloud.api.api.commons.AutoQuestion.getDefaultInstance() : autoQuestion_;
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
    if (autoQuestion_ != null) {
      output.writeMessage(1, getAutoQuestion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (autoQuestion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAutoQuestion());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse other = (com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse) obj;

    if (hasAutoQuestion() != other.hasAutoQuestion()) return false;
    if (hasAutoQuestion()) {
      if (!getAutoQuestion()
          .equals(other.getAutoQuestion())) return false;
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
    if (hasAutoQuestion()) {
      hash = (37 * hash) + AUTO_QUESTION_FIELD_NUMBER;
      hash = (53 * hash) + getAutoQuestion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse prototype) {
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
   * CreateAutoQuestionResponse returns the created auto question.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.CreateAutoQuestionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.CreateAutoQuestionResponse)
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoQuestionProto.internal_static_api_v1alpha1_scorecards_CreateAutoQuestionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoQuestionProto.internal_static_api_v1alpha1_scorecards_CreateAutoQuestionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.class, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.newBuilder()
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
      autoQuestion_ = null;
      if (autoQuestionBuilder_ != null) {
        autoQuestionBuilder_.dispose();
        autoQuestionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.AutoQuestionProto.internal_static_api_v1alpha1_scorecards_CreateAutoQuestionResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse result = new com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.autoQuestion_ = autoQuestionBuilder_ == null
            ? autoQuestion_
            : autoQuestionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.getDefaultInstance()) return this;
      if (other.hasAutoQuestion()) {
        mergeAutoQuestion(other.getAutoQuestion());
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
                  getAutoQuestionFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.AutoQuestion autoQuestion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AutoQuestion, com.tcn.cloud.api.api.commons.AutoQuestion.Builder, com.tcn.cloud.api.api.commons.AutoQuestionOrBuilder> autoQuestionBuilder_;
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     * @return Whether the autoQuestion field is set.
     */
    public boolean hasAutoQuestion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     * @return The autoQuestion.
     */
    public com.tcn.cloud.api.api.commons.AutoQuestion getAutoQuestion() {
      if (autoQuestionBuilder_ == null) {
        return autoQuestion_ == null ? com.tcn.cloud.api.api.commons.AutoQuestion.getDefaultInstance() : autoQuestion_;
      } else {
        return autoQuestionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     */
    public Builder setAutoQuestion(com.tcn.cloud.api.api.commons.AutoQuestion value) {
      if (autoQuestionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        autoQuestion_ = value;
      } else {
        autoQuestionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     */
    public Builder setAutoQuestion(
        com.tcn.cloud.api.api.commons.AutoQuestion.Builder builderForValue) {
      if (autoQuestionBuilder_ == null) {
        autoQuestion_ = builderForValue.build();
      } else {
        autoQuestionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     */
    public Builder mergeAutoQuestion(com.tcn.cloud.api.api.commons.AutoQuestion value) {
      if (autoQuestionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          autoQuestion_ != null &&
          autoQuestion_ != com.tcn.cloud.api.api.commons.AutoQuestion.getDefaultInstance()) {
          getAutoQuestionBuilder().mergeFrom(value);
        } else {
          autoQuestion_ = value;
        }
      } else {
        autoQuestionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     */
    public Builder clearAutoQuestion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      autoQuestion_ = null;
      if (autoQuestionBuilder_ != null) {
        autoQuestionBuilder_.dispose();
        autoQuestionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     */
    public com.tcn.cloud.api.api.commons.AutoQuestion.Builder getAutoQuestionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAutoQuestionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     */
    public com.tcn.cloud.api.api.commons.AutoQuestionOrBuilder getAutoQuestionOrBuilder() {
      if (autoQuestionBuilder_ != null) {
        return autoQuestionBuilder_.getMessageOrBuilder();
      } else {
        return autoQuestion_ == null ?
            com.tcn.cloud.api.api.commons.AutoQuestion.getDefaultInstance() : autoQuestion_;
      }
    }
    /**
     * <pre>
     * updated auto question object.
     * </pre>
     *
     * <code>.api.commons.AutoQuestion auto_question = 1 [json_name = "autoQuestion"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AutoQuestion, com.tcn.cloud.api.api.commons.AutoQuestion.Builder, com.tcn.cloud.api.api.commons.AutoQuestionOrBuilder> 
        getAutoQuestionFieldBuilder() {
      if (autoQuestionBuilder_ == null) {
        autoQuestionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.AutoQuestion, com.tcn.cloud.api.api.commons.AutoQuestion.Builder, com.tcn.cloud.api.api.commons.AutoQuestionOrBuilder>(
                getAutoQuestion(),
                getParentForChildren(),
                isClean());
        autoQuestion_ = null;
      }
      return autoQuestionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.CreateAutoQuestionResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.CreateAutoQuestionResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAutoQuestionResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateAutoQuestionResponse>() {
    @java.lang.Override
    public CreateAutoQuestionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAutoQuestionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAutoQuestionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

