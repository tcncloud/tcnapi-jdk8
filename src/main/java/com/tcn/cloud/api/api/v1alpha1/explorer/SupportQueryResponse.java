// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/service.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

/**
 * Protobuf type {@code api.v1alpha1.explorer.SupportQueryResponse}
 */
public final class SupportQueryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.explorer.SupportQueryResponse)
    SupportQueryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SupportQueryResponse.newBuilder() to construct.
  private SupportQueryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SupportQueryResponse() {
    resultUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SupportQueryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_SupportQueryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_SupportQueryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.class, com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.Builder.class);
  }

  public static final int RESULT_URL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resultUrl_ = "";
  /**
   * <pre>
   * result_url is the URL to the result of the query.
   * </pre>
   *
   * <code>string result_url = 1 [json_name = "resultUrl"];</code>
   * @return The resultUrl.
   */
  @java.lang.Override
  public java.lang.String getResultUrl() {
    java.lang.Object ref = resultUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resultUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * result_url is the URL to the result of the query.
   * </pre>
   *
   * <code>string result_url = 1 [json_name = "resultUrl"];</code>
   * @return The bytes for resultUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultUrlBytes() {
    java.lang.Object ref = resultUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resultUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_SIZE_BYTES_FIELD_NUMBER = 2;
  private long resultSizeBytes_ = 0L;
  /**
   * <pre>
   * result_size_bytes is the size of the result in bytes.
   * </pre>
   *
   * <code>int64 result_size_bytes = 2 [json_name = "resultSizeBytes"];</code>
   * @return The resultSizeBytes.
   */
  @java.lang.Override
  public long getResultSizeBytes() {
    return resultSizeBytes_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resultUrl_);
    }
    if (resultSizeBytes_ != 0L) {
      output.writeInt64(2, resultSizeBytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resultUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resultUrl_);
    }
    if (resultSizeBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, resultSizeBytes_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse other = (com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse) obj;

    if (!getResultUrl()
        .equals(other.getResultUrl())) return false;
    if (getResultSizeBytes()
        != other.getResultSizeBytes()) return false;
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
    hash = (37 * hash) + RESULT_URL_FIELD_NUMBER;
    hash = (53 * hash) + getResultUrl().hashCode();
    hash = (37 * hash) + RESULT_SIZE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getResultSizeBytes());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.explorer.SupportQueryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.explorer.SupportQueryResponse)
      com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_SupportQueryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_SupportQueryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.class, com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.newBuilder()
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
      resultUrl_ = "";
      resultSizeBytes_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_SupportQueryResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse build() {
      com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse result = new com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resultUrl_ = resultUrl_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resultSizeBytes_ = resultSizeBytes_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse.getDefaultInstance()) return this;
      if (!other.getResultUrl().isEmpty()) {
        resultUrl_ = other.resultUrl_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getResultSizeBytes() != 0L) {
        setResultSizeBytes(other.getResultSizeBytes());
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
              resultUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              resultSizeBytes_ = input.readInt64();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object resultUrl_ = "";
    /**
     * <pre>
     * result_url is the URL to the result of the query.
     * </pre>
     *
     * <code>string result_url = 1 [json_name = "resultUrl"];</code>
     * @return The resultUrl.
     */
    public java.lang.String getResultUrl() {
      java.lang.Object ref = resultUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * result_url is the URL to the result of the query.
     * </pre>
     *
     * <code>string result_url = 1 [json_name = "resultUrl"];</code>
     * @return The bytes for resultUrl.
     */
    public com.google.protobuf.ByteString
        getResultUrlBytes() {
      java.lang.Object ref = resultUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * result_url is the URL to the result of the query.
     * </pre>
     *
     * <code>string result_url = 1 [json_name = "resultUrl"];</code>
     * @param value The resultUrl to set.
     * @return This builder for chaining.
     */
    public Builder setResultUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resultUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * result_url is the URL to the result of the query.
     * </pre>
     *
     * <code>string result_url = 1 [json_name = "resultUrl"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResultUrl() {
      resultUrl_ = getDefaultInstance().getResultUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * result_url is the URL to the result of the query.
     * </pre>
     *
     * <code>string result_url = 1 [json_name = "resultUrl"];</code>
     * @param value The bytes for resultUrl to set.
     * @return This builder for chaining.
     */
    public Builder setResultUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resultUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long resultSizeBytes_ ;
    /**
     * <pre>
     * result_size_bytes is the size of the result in bytes.
     * </pre>
     *
     * <code>int64 result_size_bytes = 2 [json_name = "resultSizeBytes"];</code>
     * @return The resultSizeBytes.
     */
    @java.lang.Override
    public long getResultSizeBytes() {
      return resultSizeBytes_;
    }
    /**
     * <pre>
     * result_size_bytes is the size of the result in bytes.
     * </pre>
     *
     * <code>int64 result_size_bytes = 2 [json_name = "resultSizeBytes"];</code>
     * @param value The resultSizeBytes to set.
     * @return This builder for chaining.
     */
    public Builder setResultSizeBytes(long value) {

      resultSizeBytes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * result_size_bytes is the size of the result in bytes.
     * </pre>
     *
     * <code>int64 result_size_bytes = 2 [json_name = "resultSizeBytes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResultSizeBytes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resultSizeBytes_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.explorer.SupportQueryResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.explorer.SupportQueryResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SupportQueryResponse>
      PARSER = new com.google.protobuf.AbstractParser<SupportQueryResponse>() {
    @java.lang.Override
    public SupportQueryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SupportQueryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SupportQueryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.explorer.SupportQueryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

