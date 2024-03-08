// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * response to list of differences after comparing different versions
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ReviewVersionRes}
 */
public final class ReviewVersionRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ReviewVersionRes)
    ReviewVersionResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReviewVersionRes.newBuilder() to construct.
  private ReviewVersionRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReviewVersionRes() {
    diffUrls_ = "";
    diffFileNames_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReviewVersionRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewVersionRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewVersionRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ReviewVersionRes.class, com.tcn.cloud.api.api.v0alpha.ReviewVersionRes.Builder.class);
  }

  public static final int DIFF_URLS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object diffUrls_ = "";
  /**
   * <pre>
   * diff of urls between both versions
   * </pre>
   *
   * <code>string diff_urls = 1 [json_name = "diffUrls"];</code>
   * @return The diffUrls.
   */
  @java.lang.Override
  public java.lang.String getDiffUrls() {
    java.lang.Object ref = diffUrls_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diffUrls_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * diff of urls between both versions
   * </pre>
   *
   * <code>string diff_urls = 1 [json_name = "diffUrls"];</code>
   * @return The bytes for diffUrls.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDiffUrlsBytes() {
    java.lang.Object ref = diffUrls_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      diffUrls_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIFF_FILE_NAMES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object diffFileNames_ = "";
  /**
   * <pre>
   * diff of file names between both versions
   * </pre>
   *
   * <code>string diff_file_names = 2 [json_name = "diffFileNames"];</code>
   * @return The diffFileNames.
   */
  @java.lang.Override
  public java.lang.String getDiffFileNames() {
    java.lang.Object ref = diffFileNames_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diffFileNames_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * diff of file names between both versions
   * </pre>
   *
   * <code>string diff_file_names = 2 [json_name = "diffFileNames"];</code>
   * @return The bytes for diffFileNames.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDiffFileNamesBytes() {
    java.lang.Object ref = diffFileNames_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      diffFileNames_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diffUrls_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, diffUrls_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diffFileNames_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, diffFileNames_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diffUrls_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, diffUrls_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diffFileNames_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, diffFileNames_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ReviewVersionRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ReviewVersionRes other = (com.tcn.cloud.api.api.v0alpha.ReviewVersionRes) obj;

    if (!getDiffUrls()
        .equals(other.getDiffUrls())) return false;
    if (!getDiffFileNames()
        .equals(other.getDiffFileNames())) return false;
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
    hash = (37 * hash) + DIFF_URLS_FIELD_NUMBER;
    hash = (53 * hash) + getDiffUrls().hashCode();
    hash = (37 * hash) + DIFF_FILE_NAMES_FIELD_NUMBER;
    hash = (53 * hash) + getDiffFileNames().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ReviewVersionRes prototype) {
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
   * response to list of differences after comparing different versions
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ReviewVersionRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ReviewVersionRes)
      com.tcn.cloud.api.api.v0alpha.ReviewVersionResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewVersionRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewVersionRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ReviewVersionRes.class, com.tcn.cloud.api.api.v0alpha.ReviewVersionRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ReviewVersionRes.newBuilder()
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
      diffUrls_ = "";
      diffFileNames_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewVersionRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ReviewVersionRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ReviewVersionRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ReviewVersionRes build() {
      com.tcn.cloud.api.api.v0alpha.ReviewVersionRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ReviewVersionRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ReviewVersionRes result = new com.tcn.cloud.api.api.v0alpha.ReviewVersionRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ReviewVersionRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.diffUrls_ = diffUrls_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diffFileNames_ = diffFileNames_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ReviewVersionRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ReviewVersionRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ReviewVersionRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ReviewVersionRes.getDefaultInstance()) return this;
      if (!other.getDiffUrls().isEmpty()) {
        diffUrls_ = other.diffUrls_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDiffFileNames().isEmpty()) {
        diffFileNames_ = other.diffFileNames_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              diffUrls_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              diffFileNames_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object diffUrls_ = "";
    /**
     * <pre>
     * diff of urls between both versions
     * </pre>
     *
     * <code>string diff_urls = 1 [json_name = "diffUrls"];</code>
     * @return The diffUrls.
     */
    public java.lang.String getDiffUrls() {
      java.lang.Object ref = diffUrls_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diffUrls_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * diff of urls between both versions
     * </pre>
     *
     * <code>string diff_urls = 1 [json_name = "diffUrls"];</code>
     * @return The bytes for diffUrls.
     */
    public com.google.protobuf.ByteString
        getDiffUrlsBytes() {
      java.lang.Object ref = diffUrls_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diffUrls_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * diff of urls between both versions
     * </pre>
     *
     * <code>string diff_urls = 1 [json_name = "diffUrls"];</code>
     * @param value The diffUrls to set.
     * @return This builder for chaining.
     */
    public Builder setDiffUrls(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      diffUrls_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * diff of urls between both versions
     * </pre>
     *
     * <code>string diff_urls = 1 [json_name = "diffUrls"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDiffUrls() {
      diffUrls_ = getDefaultInstance().getDiffUrls();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * diff of urls between both versions
     * </pre>
     *
     * <code>string diff_urls = 1 [json_name = "diffUrls"];</code>
     * @param value The bytes for diffUrls to set.
     * @return This builder for chaining.
     */
    public Builder setDiffUrlsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      diffUrls_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object diffFileNames_ = "";
    /**
     * <pre>
     * diff of file names between both versions
     * </pre>
     *
     * <code>string diff_file_names = 2 [json_name = "diffFileNames"];</code>
     * @return The diffFileNames.
     */
    public java.lang.String getDiffFileNames() {
      java.lang.Object ref = diffFileNames_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diffFileNames_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * diff of file names between both versions
     * </pre>
     *
     * <code>string diff_file_names = 2 [json_name = "diffFileNames"];</code>
     * @return The bytes for diffFileNames.
     */
    public com.google.protobuf.ByteString
        getDiffFileNamesBytes() {
      java.lang.Object ref = diffFileNames_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diffFileNames_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * diff of file names between both versions
     * </pre>
     *
     * <code>string diff_file_names = 2 [json_name = "diffFileNames"];</code>
     * @param value The diffFileNames to set.
     * @return This builder for chaining.
     */
    public Builder setDiffFileNames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      diffFileNames_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * diff of file names between both versions
     * </pre>
     *
     * <code>string diff_file_names = 2 [json_name = "diffFileNames"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDiffFileNames() {
      diffFileNames_ = getDefaultInstance().getDiffFileNames();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * diff of file names between both versions
     * </pre>
     *
     * <code>string diff_file_names = 2 [json_name = "diffFileNames"];</code>
     * @param value The bytes for diffFileNames to set.
     * @return This builder for chaining.
     */
    public Builder setDiffFileNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      diffFileNames_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ReviewVersionRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ReviewVersionRes)
  private static final com.tcn.cloud.api.api.v0alpha.ReviewVersionRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ReviewVersionRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ReviewVersionRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReviewVersionRes>
      PARSER = new com.google.protobuf.AbstractParser<ReviewVersionRes>() {
    @java.lang.Override
    public ReviewVersionRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReviewVersionRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReviewVersionRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ReviewVersionRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

