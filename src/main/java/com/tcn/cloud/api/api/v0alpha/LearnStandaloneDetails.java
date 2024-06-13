// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * response to get standalone articles
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.LearnStandaloneDetails}
 */
public final class LearnStandaloneDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.LearnStandaloneDetails)
    LearnStandaloneDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LearnStandaloneDetails.newBuilder() to construct.
  private LearnStandaloneDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LearnStandaloneDetails() {
    name_ = "";
    content_ = "";
    title_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LearnStandaloneDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_LearnStandaloneDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_LearnStandaloneDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails.class, com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * storage bucket
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * storage bucket
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>string content = 2 [json_name = "content", deprecated = true];</code>
   * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
   *     See api/v0alpha/learn.proto;l=431
   * @return The content.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getContent() {
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
   * deprecated
   * </pre>
   *
   * <code>string content = 2 [json_name = "content", deprecated = true];</code>
   * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
   *     See api/v0alpha/learn.proto;l=431
   * @return The bytes for content.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
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

  public static final int LAST_EDITED_TIMESTAMP_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp lastEditedTimestamp_;
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
   * @deprecated api.v0alpha.LearnStandaloneDetails.last_edited_timestamp is deprecated.
   *     See api/v0alpha/learn.proto;l=433
   * @return Whether the lastEditedTimestamp field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasLastEditedTimestamp() {
    return lastEditedTimestamp_ != null;
  }
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
   * @deprecated api.v0alpha.LearnStandaloneDetails.last_edited_timestamp is deprecated.
   *     See api/v0alpha/learn.proto;l=433
   * @return The lastEditedTimestamp.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.Timestamp getLastEditedTimestamp() {
    return lastEditedTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastEditedTimestamp_;
  }
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.TimestampOrBuilder getLastEditedTimestampOrBuilder() {
    return lastEditedTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastEditedTimestamp_;
  }

  public static final int TITLE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * title of the article
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * title of the article
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
    }
    if (lastEditedTimestamp_ != null) {
      output.writeMessage(3, getLastEditedTimestamp());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, title_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
    }
    if (lastEditedTimestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLastEditedTimestamp());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, title_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails other = (com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (hasLastEditedTimestamp() != other.hasLastEditedTimestamp()) return false;
    if (hasLastEditedTimestamp()) {
      if (!getLastEditedTimestamp()
          .equals(other.getLastEditedTimestamp())) return false;
    }
    if (!getTitle()
        .equals(other.getTitle())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    if (hasLastEditedTimestamp()) {
      hash = (37 * hash) + LAST_EDITED_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getLastEditedTimestamp().hashCode();
    }
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails prototype) {
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
   * response to get standalone articles
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.LearnStandaloneDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.LearnStandaloneDetails)
      com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_LearnStandaloneDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_LearnStandaloneDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails.class, com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails.newBuilder()
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
      name_ = "";
      content_ = "";
      lastEditedTimestamp_ = null;
      if (lastEditedTimestampBuilder_ != null) {
        lastEditedTimestampBuilder_.dispose();
        lastEditedTimestampBuilder_ = null;
      }
      title_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LearnProto.internal_static_api_v0alpha_LearnStandaloneDetails_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails build() {
      com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails buildPartial() {
      com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails result = new com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.content_ = content_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.lastEditedTimestamp_ = lastEditedTimestampBuilder_ == null
            ? lastEditedTimestamp_
            : lastEditedTimestampBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.title_ = title_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails other) {
      if (other == com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLastEditedTimestamp()) {
        mergeLastEditedTimestamp(other.getLastEditedTimestamp());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000008;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              content_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getLastEditedTimestampFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * storage bucket
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * storage bucket
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * storage bucket
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * storage bucket
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * storage bucket
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>string content = 2 [json_name = "content", deprecated = true];</code>
     * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
     *     See api/v0alpha/learn.proto;l=431
     * @return The content.
     */
    @java.lang.Deprecated public java.lang.String getContent() {
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
     * deprecated
     * </pre>
     *
     * <code>string content = 2 [json_name = "content", deprecated = true];</code>
     * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
     *     See api/v0alpha/learn.proto;l=431
     * @return The bytes for content.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
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
     * deprecated
     * </pre>
     *
     * <code>string content = 2 [json_name = "content", deprecated = true];</code>
     * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
     *     See api/v0alpha/learn.proto;l=431
     * @param value The content to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setContent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      content_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>string content = 2 [json_name = "content", deprecated = true];</code>
     * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
     *     See api/v0alpha/learn.proto;l=431
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearContent() {
      content_ = getDefaultInstance().getContent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>string content = 2 [json_name = "content", deprecated = true];</code>
     * @deprecated api.v0alpha.LearnStandaloneDetails.content is deprecated.
     *     See api/v0alpha/learn.proto;l=431
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      content_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp lastEditedTimestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastEditedTimestampBuilder_;
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     * @deprecated api.v0alpha.LearnStandaloneDetails.last_edited_timestamp is deprecated.
     *     See api/v0alpha/learn.proto;l=433
     * @return Whether the lastEditedTimestamp field is set.
     */
    @java.lang.Deprecated public boolean hasLastEditedTimestamp() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     * @deprecated api.v0alpha.LearnStandaloneDetails.last_edited_timestamp is deprecated.
     *     See api/v0alpha/learn.proto;l=433
     * @return The lastEditedTimestamp.
     */
    @java.lang.Deprecated public com.google.protobuf.Timestamp getLastEditedTimestamp() {
      if (lastEditedTimestampBuilder_ == null) {
        return lastEditedTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastEditedTimestamp_;
      } else {
        return lastEditedTimestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setLastEditedTimestamp(com.google.protobuf.Timestamp value) {
      if (lastEditedTimestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastEditedTimestamp_ = value;
      } else {
        lastEditedTimestampBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setLastEditedTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastEditedTimestampBuilder_ == null) {
        lastEditedTimestamp_ = builderForValue.build();
      } else {
        lastEditedTimestampBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder mergeLastEditedTimestamp(com.google.protobuf.Timestamp value) {
      if (lastEditedTimestampBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          lastEditedTimestamp_ != null &&
          lastEditedTimestamp_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastEditedTimestampBuilder().mergeFrom(value);
        } else {
          lastEditedTimestamp_ = value;
        }
      } else {
        lastEditedTimestampBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearLastEditedTimestamp() {
      bitField0_ = (bitField0_ & ~0x00000004);
      lastEditedTimestamp_ = null;
      if (lastEditedTimestampBuilder_ != null) {
        lastEditedTimestampBuilder_.dispose();
        lastEditedTimestampBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.google.protobuf.Timestamp.Builder getLastEditedTimestampBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLastEditedTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.google.protobuf.TimestampOrBuilder getLastEditedTimestampOrBuilder() {
      if (lastEditedTimestampBuilder_ != null) {
        return lastEditedTimestampBuilder_.getMessageOrBuilder();
      } else {
        return lastEditedTimestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastEditedTimestamp_;
      }
    }
    /**
     * <pre>
     * deprecated
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_edited_timestamp = 3 [json_name = "lastEditedTimestamp", deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastEditedTimestampFieldBuilder() {
      if (lastEditedTimestampBuilder_ == null) {
        lastEditedTimestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastEditedTimestamp(),
                getParentForChildren(),
                isClean());
        lastEditedTimestamp_ = null;
      }
      return lastEditedTimestampBuilder_;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * title of the article
     * </pre>
     *
     * <code>string title = 4 [json_name = "title"];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * title of the article
     * </pre>
     *
     * <code>string title = 4 [json_name = "title"];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * title of the article
     * </pre>
     *
     * <code>string title = 4 [json_name = "title"];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * title of the article
     * </pre>
     *
     * <code>string title = 4 [json_name = "title"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * title of the article
     * </pre>
     *
     * <code>string title = 4 [json_name = "title"];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.LearnStandaloneDetails)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.LearnStandaloneDetails)
  private static final com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails();
  }

  public static com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LearnStandaloneDetails>
      PARSER = new com.google.protobuf.AbstractParser<LearnStandaloneDetails>() {
    @java.lang.Override
    public LearnStandaloneDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<LearnStandaloneDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LearnStandaloneDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.LearnStandaloneDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

