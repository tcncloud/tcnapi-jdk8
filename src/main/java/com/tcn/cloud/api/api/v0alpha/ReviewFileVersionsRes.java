// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * response to retrieve diff after comparing file contents in different versions
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ReviewFileVersionsRes}
 */
public final class ReviewFileVersionsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ReviewFileVersionsRes)
    ReviewFileVersionsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReviewFileVersionsRes.newBuilder() to construct.
  private ReviewFileVersionsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReviewFileVersionsRes() {
    content_ = "";
    diffContent_ = "";
    images_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReviewFileVersionsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewFileVersionsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewFileVersionsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes.class, com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes.Builder.class);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   * <pre>
   * existing file contents from master
   * </pre>
   *
   * <code>string content = 1 [json_name = "content"];</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * existing file contents from master
   * </pre>
   *
   * <code>string content = 1 [json_name = "content"];</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIFF_CONTENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object diffContent_ = "";
  /**
   * <pre>
   * diff contents between both master and passed version
   * </pre>
   *
   * <code>string diff_content = 2 [json_name = "diffContent"];</code>
   * @return The diffContent.
   */
  @java.lang.Override
  public java.lang.String getDiffContent() {
    java.lang.Object ref = diffContent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diffContent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * diff contents between both master and passed version
   * </pre>
   *
   * <code>string diff_content = 2 [json_name = "diffContent"];</code>
   * @return The bytes for diffContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDiffContentBytes() {
    java.lang.Object ref = diffContent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      diffContent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.LearnImage> images_;
  /**
   * <pre>
   * List containing image links from parsing both files
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.LearnImage> getImagesList() {
    return images_;
  }
  /**
   * <pre>
   * List containing image links from parsing both files
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder> 
      getImagesOrBuilderList() {
    return images_;
  }
  /**
   * <pre>
   * List containing image links from parsing both files
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  @java.lang.Override
  public int getImagesCount() {
    return images_.size();
  }
  /**
   * <pre>
   * List containing image links from parsing both files
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.LearnImage getImages(int index) {
    return images_.get(index);
  }
  /**
   * <pre>
   * List containing image links from parsing both files
   * </pre>
   *
   * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder getImagesOrBuilder(
      int index) {
    return images_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diffContent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, diffContent_);
    }
    for (int i = 0; i < images_.size(); i++) {
      output.writeMessage(3, images_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diffContent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, diffContent_);
    }
    for (int i = 0; i < images_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, images_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes other = (com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes) obj;

    if (!getContent()
        .equals(other.getContent())) return false;
    if (!getDiffContent()
        .equals(other.getDiffContent())) return false;
    if (!getImagesList()
        .equals(other.getImagesList())) return false;
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
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + DIFF_CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getDiffContent().hashCode();
    if (getImagesCount() > 0) {
      hash = (37 * hash) + IMAGES_FIELD_NUMBER;
      hash = (53 * hash) + getImagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes prototype) {
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
   * response to retrieve diff after comparing file contents in different versions
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ReviewFileVersionsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ReviewFileVersionsRes)
      com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewFileVersionsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewFileVersionsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes.class, com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes.newBuilder()
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
      content_ = "";
      diffContent_ = "";
      if (imagesBuilder_ == null) {
        images_ = java.util.Collections.emptyList();
      } else {
        images_ = null;
        imagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_ReviewFileVersionsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes build() {
      com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes result = new com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes result) {
      if (imagesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          images_ = java.util.Collections.unmodifiableList(images_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.images_ = images_;
      } else {
        result.images_ = imagesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.content_ = content_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.diffContent_ = diffContent_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes.getDefaultInstance()) return this;
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDiffContent().isEmpty()) {
        diffContent_ = other.diffContent_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (imagesBuilder_ == null) {
        if (!other.images_.isEmpty()) {
          if (images_.isEmpty()) {
            images_ = other.images_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureImagesIsMutable();
            images_.addAll(other.images_);
          }
          onChanged();
        }
      } else {
        if (!other.images_.isEmpty()) {
          if (imagesBuilder_.isEmpty()) {
            imagesBuilder_.dispose();
            imagesBuilder_ = null;
            images_ = other.images_;
            bitField0_ = (bitField0_ & ~0x00000004);
            imagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getImagesFieldBuilder() : null;
          } else {
            imagesBuilder_.addAllMessages(other.images_);
          }
        }
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
              content_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              diffContent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.tcn.cloud.api.api.v0alpha.LearnImage m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.LearnImage.parser(),
                      extensionRegistry);
              if (imagesBuilder_ == null) {
                ensureImagesIsMutable();
                images_.add(m);
              } else {
                imagesBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private java.lang.Object content_ = "";
    /**
     * <pre>
     * existing file contents from master
     * </pre>
     *
     * <code>string content = 1 [json_name = "content"];</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * existing file contents from master
     * </pre>
     *
     * <code>string content = 1 [json_name = "content"];</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * existing file contents from master
     * </pre>
     *
     * <code>string content = 1 [json_name = "content"];</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * existing file contents from master
     * </pre>
     *
     * <code>string content = 1 [json_name = "content"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      content_ = getDefaultInstance().getContent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * existing file contents from master
     * </pre>
     *
     * <code>string content = 1 [json_name = "content"];</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object diffContent_ = "";
    /**
     * <pre>
     * diff contents between both master and passed version
     * </pre>
     *
     * <code>string diff_content = 2 [json_name = "diffContent"];</code>
     * @return The diffContent.
     */
    public java.lang.String getDiffContent() {
      java.lang.Object ref = diffContent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diffContent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * diff contents between both master and passed version
     * </pre>
     *
     * <code>string diff_content = 2 [json_name = "diffContent"];</code>
     * @return The bytes for diffContent.
     */
    public com.google.protobuf.ByteString
        getDiffContentBytes() {
      java.lang.Object ref = diffContent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diffContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * diff contents between both master and passed version
     * </pre>
     *
     * <code>string diff_content = 2 [json_name = "diffContent"];</code>
     * @param value The diffContent to set.
     * @return This builder for chaining.
     */
    public Builder setDiffContent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      diffContent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * diff contents between both master and passed version
     * </pre>
     *
     * <code>string diff_content = 2 [json_name = "diffContent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDiffContent() {
      diffContent_ = getDefaultInstance().getDiffContent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * diff contents between both master and passed version
     * </pre>
     *
     * <code>string diff_content = 2 [json_name = "diffContent"];</code>
     * @param value The bytes for diffContent to set.
     * @return This builder for chaining.
     */
    public Builder setDiffContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      diffContent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.LearnImage> images_ =
      java.util.Collections.emptyList();
    private void ensureImagesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        images_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.LearnImage>(images_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.LearnImage, com.tcn.cloud.api.api.v0alpha.LearnImage.Builder, com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder> imagesBuilder_;

    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.LearnImage> getImagesList() {
      if (imagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(images_);
      } else {
        return imagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public int getImagesCount() {
      if (imagesBuilder_ == null) {
        return images_.size();
      } else {
        return imagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnImage getImages(int index) {
      if (imagesBuilder_ == null) {
        return images_.get(index);
      } else {
        return imagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder setImages(
        int index, com.tcn.cloud.api.api.v0alpha.LearnImage value) {
      if (imagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImagesIsMutable();
        images_.set(index, value);
        onChanged();
      } else {
        imagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder setImages(
        int index, com.tcn.cloud.api.api.v0alpha.LearnImage.Builder builderForValue) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        images_.set(index, builderForValue.build());
        onChanged();
      } else {
        imagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder addImages(com.tcn.cloud.api.api.v0alpha.LearnImage value) {
      if (imagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImagesIsMutable();
        images_.add(value);
        onChanged();
      } else {
        imagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder addImages(
        int index, com.tcn.cloud.api.api.v0alpha.LearnImage value) {
      if (imagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImagesIsMutable();
        images_.add(index, value);
        onChanged();
      } else {
        imagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder addImages(
        com.tcn.cloud.api.api.v0alpha.LearnImage.Builder builderForValue) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        images_.add(builderForValue.build());
        onChanged();
      } else {
        imagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder addImages(
        int index, com.tcn.cloud.api.api.v0alpha.LearnImage.Builder builderForValue) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        images_.add(index, builderForValue.build());
        onChanged();
      } else {
        imagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder addAllImages(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.LearnImage> values) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, images_);
        onChanged();
      } else {
        imagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder clearImages() {
      if (imagesBuilder_ == null) {
        images_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        imagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public Builder removeImages(int index) {
      if (imagesBuilder_ == null) {
        ensureImagesIsMutable();
        images_.remove(index);
        onChanged();
      } else {
        imagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnImage.Builder getImagesBuilder(
        int index) {
      return getImagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder getImagesOrBuilder(
        int index) {
      if (imagesBuilder_ == null) {
        return images_.get(index);  } else {
        return imagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder> 
         getImagesOrBuilderList() {
      if (imagesBuilder_ != null) {
        return imagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(images_);
      }
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnImage.Builder addImagesBuilder() {
      return getImagesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.LearnImage.getDefaultInstance());
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LearnImage.Builder addImagesBuilder(
        int index) {
      return getImagesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.LearnImage.getDefaultInstance());
    }
    /**
     * <pre>
     * List containing image links from parsing both files
     * </pre>
     *
     * <code>repeated .api.v0alpha.LearnImage images = 3 [json_name = "images"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.LearnImage.Builder> 
         getImagesBuilderList() {
      return getImagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.LearnImage, com.tcn.cloud.api.api.v0alpha.LearnImage.Builder, com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder> 
        getImagesFieldBuilder() {
      if (imagesBuilder_ == null) {
        imagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.LearnImage, com.tcn.cloud.api.api.v0alpha.LearnImage.Builder, com.tcn.cloud.api.api.v0alpha.LearnImageOrBuilder>(
                images_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        images_ = null;
      }
      return imagesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ReviewFileVersionsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ReviewFileVersionsRes)
  private static final com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReviewFileVersionsRes>
      PARSER = new com.google.protobuf.AbstractParser<ReviewFileVersionsRes>() {
    @java.lang.Override
    public ReviewFileVersionsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReviewFileVersionsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReviewFileVersionsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ReviewFileVersionsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

