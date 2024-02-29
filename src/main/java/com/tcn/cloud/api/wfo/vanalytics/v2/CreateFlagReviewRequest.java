// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_review.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * CreateFlagReviewRequest is a request for creating a flag review.
 * </pre>
 *
 * Protobuf type {@code wfo.vanalytics.v2.CreateFlagReviewRequest}
 */
public final class CreateFlagReviewRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.CreateFlagReviewRequest)
    CreateFlagReviewRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateFlagReviewRequest.newBuilder() to construct.
  private CreateFlagReviewRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateFlagReviewRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateFlagReviewRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_CreateFlagReviewRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_CreateFlagReviewRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.Builder.class);
  }

  public static final int FLAG_REVIEW_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview flagReview_;
  /**
   * <pre>
   * FlagReview resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
   * @return Whether the flagReview field is set.
   */
  @java.lang.Override
  public boolean hasFlagReview() {
    return flagReview_ != null;
  }
  /**
   * <pre>
   * FlagReview resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
   * @return The flagReview.
   */
  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview getFlagReview() {
    return flagReview_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.getDefaultInstance() : flagReview_;
  }
  /**
   * <pre>
   * FlagReview resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewOrBuilder getFlagReviewOrBuilder() {
    return flagReview_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.getDefaultInstance() : flagReview_;
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
    if (flagReview_ != null) {
      output.writeMessage(1, getFlagReview());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (flagReview_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFlagReview());
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest other = (com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest) obj;

    if (hasFlagReview() != other.hasFlagReview()) return false;
    if (hasFlagReview()) {
      if (!getFlagReview()
          .equals(other.getFlagReview())) return false;
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
    if (hasFlagReview()) {
      hash = (37 * hash) + FLAG_REVIEW_FIELD_NUMBER;
      hash = (53 * hash) + getFlagReview().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest prototype) {
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
   * CreateFlagReviewRequest is a request for creating a flag review.
   * </pre>
   *
   * Protobuf type {@code wfo.vanalytics.v2.CreateFlagReviewRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.CreateFlagReviewRequest)
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_CreateFlagReviewRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_CreateFlagReviewRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.newBuilder()
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
      flagReview_ = null;
      if (flagReviewBuilder_ != null) {
        flagReviewBuilder_.dispose();
        flagReviewBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.internal_static_wfo_vanalytics_v2_CreateFlagReviewRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest result = new com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.flagReview_ = flagReviewBuilder_ == null
            ? flagReview_
            : flagReviewBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest.getDefaultInstance()) return this;
      if (other.hasFlagReview()) {
        mergeFlagReview(other.getFlagReview());
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
                  getFlagReviewFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview flagReview_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewOrBuilder> flagReviewBuilder_;
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     * @return Whether the flagReview field is set.
     */
    public boolean hasFlagReview() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     * @return The flagReview.
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview getFlagReview() {
      if (flagReviewBuilder_ == null) {
        return flagReview_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.getDefaultInstance() : flagReview_;
      } else {
        return flagReviewBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     */
    public Builder setFlagReview(com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview value) {
      if (flagReviewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        flagReview_ = value;
      } else {
        flagReviewBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     */
    public Builder setFlagReview(
        com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.Builder builderForValue) {
      if (flagReviewBuilder_ == null) {
        flagReview_ = builderForValue.build();
      } else {
        flagReviewBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     */
    public Builder mergeFlagReview(com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview value) {
      if (flagReviewBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          flagReview_ != null &&
          flagReview_ != com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.getDefaultInstance()) {
          getFlagReviewBuilder().mergeFrom(value);
        } else {
          flagReview_ = value;
        }
      } else {
        flagReviewBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     */
    public Builder clearFlagReview() {
      bitField0_ = (bitField0_ & ~0x00000001);
      flagReview_ = null;
      if (flagReviewBuilder_ != null) {
        flagReviewBuilder_.dispose();
        flagReviewBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.Builder getFlagReviewBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFlagReviewFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewOrBuilder getFlagReviewOrBuilder() {
      if (flagReviewBuilder_ != null) {
        return flagReviewBuilder_.getMessageOrBuilder();
      } else {
        return flagReview_ == null ?
            com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.getDefaultInstance() : flagReview_;
      }
    }
    /**
     * <pre>
     * FlagReview resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.FlagReview flag_review = 1 [json_name = "flagReview"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewOrBuilder> 
        getFlagReviewFieldBuilder() {
      if (flagReviewBuilder_ == null) {
        flagReviewBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReview.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewOrBuilder>(
                getFlagReview(),
                getParentForChildren(),
                isClean());
        flagReview_ = null;
      }
      return flagReviewBuilder_;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.CreateFlagReviewRequest)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.CreateFlagReviewRequest)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFlagReviewRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateFlagReviewRequest>() {
    @java.lang.Override
    public CreateFlagReviewRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFlagReviewRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFlagReviewRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFlagReviewRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

