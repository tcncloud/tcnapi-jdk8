// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/transcript_summary.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * <pre>
 * GetTranscriptSummaryResponse is a response for getting a transcript summary.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.vanalytics.GetTranscriptSummaryResponse}
 */
public final class GetTranscriptSummaryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.GetTranscriptSummaryResponse)
    GetTranscriptSummaryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTranscriptSummaryResponse.newBuilder() to construct.
  private GetTranscriptSummaryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTranscriptSummaryResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTranscriptSummaryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryProto.internal_static_api_v1alpha1_vanalytics_GetTranscriptSummaryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryProto.internal_static_api_v1alpha1_vanalytics_GetTranscriptSummaryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse.Builder.class);
  }

  public static final int TRANSCRIPT_SUMMARY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary transcriptSummary_;
  /**
   * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
   * @return Whether the transcriptSummary field is set.
   */
  @java.lang.Override
  public boolean hasTranscriptSummary() {
    return transcriptSummary_ != null;
  }
  /**
   * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
   * @return The transcriptSummary.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary getTranscriptSummary() {
    return transcriptSummary_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.getDefaultInstance() : transcriptSummary_;
  }
  /**
   * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryOrBuilder getTranscriptSummaryOrBuilder() {
    return transcriptSummary_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.getDefaultInstance() : transcriptSummary_;
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
    if (transcriptSummary_ != null) {
      output.writeMessage(1, getTranscriptSummary());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transcriptSummary_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTranscriptSummary());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse) obj;

    if (hasTranscriptSummary() != other.hasTranscriptSummary()) return false;
    if (hasTranscriptSummary()) {
      if (!getTranscriptSummary()
          .equals(other.getTranscriptSummary())) return false;
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
    if (hasTranscriptSummary()) {
      hash = (37 * hash) + TRANSCRIPT_SUMMARY_FIELD_NUMBER;
      hash = (53 * hash) + getTranscriptSummary().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse prototype) {
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
   * GetTranscriptSummaryResponse is a response for getting a transcript summary.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.vanalytics.GetTranscriptSummaryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.GetTranscriptSummaryResponse)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryProto.internal_static_api_v1alpha1_vanalytics_GetTranscriptSummaryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryProto.internal_static_api_v1alpha1_vanalytics_GetTranscriptSummaryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse.newBuilder()
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
      transcriptSummary_ = null;
      if (transcriptSummaryBuilder_ != null) {
        transcriptSummaryBuilder_.dispose();
        transcriptSummaryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryProto.internal_static_api_v1alpha1_vanalytics_GetTranscriptSummaryResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transcriptSummary_ = transcriptSummaryBuilder_ == null
            ? transcriptSummary_
            : transcriptSummaryBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse.getDefaultInstance()) return this;
      if (other.hasTranscriptSummary()) {
        mergeTranscriptSummary(other.getTranscriptSummary());
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
                  getTranscriptSummaryFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary transcriptSummary_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary, com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryOrBuilder> transcriptSummaryBuilder_;
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     * @return Whether the transcriptSummary field is set.
     */
    public boolean hasTranscriptSummary() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     * @return The transcriptSummary.
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary getTranscriptSummary() {
      if (transcriptSummaryBuilder_ == null) {
        return transcriptSummary_ == null ? com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.getDefaultInstance() : transcriptSummary_;
      } else {
        return transcriptSummaryBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     */
    public Builder setTranscriptSummary(com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary value) {
      if (transcriptSummaryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transcriptSummary_ = value;
      } else {
        transcriptSummaryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     */
    public Builder setTranscriptSummary(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.Builder builderForValue) {
      if (transcriptSummaryBuilder_ == null) {
        transcriptSummary_ = builderForValue.build();
      } else {
        transcriptSummaryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     */
    public Builder mergeTranscriptSummary(com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary value) {
      if (transcriptSummaryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          transcriptSummary_ != null &&
          transcriptSummary_ != com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.getDefaultInstance()) {
          getTranscriptSummaryBuilder().mergeFrom(value);
        } else {
          transcriptSummary_ = value;
        }
      } else {
        transcriptSummaryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     */
    public Builder clearTranscriptSummary() {
      bitField0_ = (bitField0_ & ~0x00000001);
      transcriptSummary_ = null;
      if (transcriptSummaryBuilder_ != null) {
        transcriptSummaryBuilder_.dispose();
        transcriptSummaryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.Builder getTranscriptSummaryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTranscriptSummaryFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryOrBuilder getTranscriptSummaryOrBuilder() {
      if (transcriptSummaryBuilder_ != null) {
        return transcriptSummaryBuilder_.getMessageOrBuilder();
      } else {
        return transcriptSummary_ == null ?
            com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.getDefaultInstance() : transcriptSummary_;
      }
    }
    /**
     * <code>.api.v1alpha1.vanalytics.TranscriptSummary transcript_summary = 1 [json_name = "transcriptSummary"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary, com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryOrBuilder> 
        getTranscriptSummaryFieldBuilder() {
      if (transcriptSummaryBuilder_ == null) {
        transcriptSummaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary, com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummary.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptSummaryOrBuilder>(
                getTranscriptSummary(),
                getParentForChildren(),
                isClean());
        transcriptSummary_ = null;
      }
      return transcriptSummaryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.GetTranscriptSummaryResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.GetTranscriptSummaryResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTranscriptSummaryResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTranscriptSummaryResponse>() {
    @java.lang.Override
    public GetTranscriptSummaryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTranscriptSummaryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTranscriptSummaryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.GetTranscriptSummaryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
