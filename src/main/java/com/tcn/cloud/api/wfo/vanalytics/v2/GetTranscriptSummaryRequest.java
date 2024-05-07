// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript_summary.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * GetTranscriptSummaryRequest is a request for getting a transcript summary.
 * </pre>
 *
 * Protobuf type {@code wfo.vanalytics.v2.GetTranscriptSummaryRequest}
 */
public final class GetTranscriptSummaryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.GetTranscriptSummaryRequest)
    GetTranscriptSummaryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTranscriptSummaryRequest.newBuilder() to construct.
  private GetTranscriptSummaryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTranscriptSummaryRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTranscriptSummaryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_GetTranscriptSummaryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_GetTranscriptSummaryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest.Builder.class);
  }

  public static final int TRANSCRIPT_SID_FIELD_NUMBER = 2;
  private long transcriptSid_ = 0L;
  /**
   * <pre>
   * Required - transcript to get summary of.
   * </pre>
   *
   * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  @java.lang.Override
  public long getTranscriptSid() {
    return transcriptSid_;
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
    if (transcriptSid_ != 0L) {
      output.writeInt64(2, transcriptSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transcriptSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, transcriptSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest other = (com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest) obj;

    if (getTranscriptSid()
        != other.getTranscriptSid()) return false;
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
    hash = (37 * hash) + TRANSCRIPT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTranscriptSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest prototype) {
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
   * GetTranscriptSummaryRequest is a request for getting a transcript summary.
   * </pre>
   *
   * Protobuf type {@code wfo.vanalytics.v2.GetTranscriptSummaryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.GetTranscriptSummaryRequest)
      com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_GetTranscriptSummaryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_GetTranscriptSummaryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest.newBuilder()
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
      transcriptSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.internal_static_wfo_vanalytics_v2_GetTranscriptSummaryRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest result = new com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transcriptSid_ = transcriptSid_;
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest.getDefaultInstance()) return this;
      if (other.getTranscriptSid() != 0L) {
        setTranscriptSid(other.getTranscriptSid());
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
              transcriptSid_ = input.readInt64();
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

    private long transcriptSid_ ;
    /**
     * <pre>
     * Required - transcript to get summary of.
     * </pre>
     *
     * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
     * @return The transcriptSid.
     */
    @java.lang.Override
    public long getTranscriptSid() {
      return transcriptSid_;
    }
    /**
     * <pre>
     * Required - transcript to get summary of.
     * </pre>
     *
     * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
     * @param value The transcriptSid to set.
     * @return This builder for chaining.
     */
    public Builder setTranscriptSid(long value) {

      transcriptSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required - transcript to get summary of.
     * </pre>
     *
     * <code>int64 transcript_sid = 2 [json_name = "transcriptSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTranscriptSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      transcriptSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.GetTranscriptSummaryRequest)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.GetTranscriptSummaryRequest)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTranscriptSummaryRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetTranscriptSummaryRequest>() {
    @java.lang.Override
    public GetTranscriptSummaryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTranscriptSummaryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTranscriptSummaryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.GetTranscriptSummaryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

