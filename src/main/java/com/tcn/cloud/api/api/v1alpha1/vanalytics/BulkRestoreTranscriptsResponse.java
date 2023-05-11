// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/transcript.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * <pre>
 * BulkRestoreTranscriptsResponse defines the bulk restore transcripts response.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse}
 */
public final class BulkRestoreTranscriptsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse)
    BulkRestoreTranscriptsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BulkRestoreTranscriptsResponse.newBuilder() to construct.
  private BulkRestoreTranscriptsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BulkRestoreTranscriptsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BulkRestoreTranscriptsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_BulkRestoreTranscriptsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_BulkRestoreTranscriptsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.Builder.class);
  }

  public static final int TOTAL_FIELD_NUMBER = 1;
  private int total_ = 0;
  /**
   * <pre>
   * The number of transcripts restored.
   * </pre>
   *
   * <code>uint32 total = 1 [json_name = "total"];</code>
   * @return The total.
   */
  @java.lang.Override
  public int getTotal() {
    return total_;
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
    if (total_ != 0) {
      output.writeUInt32(1, total_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, total_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse) obj;

    if (getTotal()
        != other.getTotal()) return false;
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
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + getTotal();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse prototype) {
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
   * BulkRestoreTranscriptsResponse defines the bulk restore transcripts response.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_BulkRestoreTranscriptsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_BulkRestoreTranscriptsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.newBuilder()
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
      total_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_BulkRestoreTranscriptsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.total_ = total_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.getDefaultInstance()) return this;
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
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
            case 8: {
              total_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int total_ ;
    /**
     * <pre>
     * The number of transcripts restored.
     * </pre>
     *
     * <code>uint32 total = 1 [json_name = "total"];</code>
     * @return The total.
     */
    @java.lang.Override
    public int getTotal() {
      return total_;
    }
    /**
     * <pre>
     * The number of transcripts restored.
     * </pre>
     *
     * <code>uint32 total = 1 [json_name = "total"];</code>
     * @param value The total to set.
     * @return This builder for chaining.
     */
    public Builder setTotal(int value) {

      total_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of transcripts restored.
     * </pre>
     *
     * <code>uint32 total = 1 [json_name = "total"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      total_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BulkRestoreTranscriptsResponse>
      PARSER = new com.google.protobuf.AbstractParser<BulkRestoreTranscriptsResponse>() {
    @java.lang.Override
    public BulkRestoreTranscriptsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BulkRestoreTranscriptsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BulkRestoreTranscriptsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

