// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CollectionEntries}
 */
public final class CollectionEntries extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CollectionEntries)
    CollectionEntriesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CollectionEntries.newBuilder() to construct.
  private CollectionEntries(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CollectionEntries() {
    entries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CollectionEntries();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CollectionEntries_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CollectionEntries_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CollectionEntries.class, com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder.class);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.CollectionMetadata metadata_;
  /**
   * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionMetadata getMetadata() {
    return metadata_ == null ? com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance() : metadata_;
  }
  /**
   * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance() : metadata_;
  }

  public static final int ENTRIES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntry> entries_;
  /**
   * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntry> getEntriesList() {
    return entries_;
  }
  /**
   * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder> 
      getEntriesOrBuilderList() {
    return entries_;
  }
  /**
   * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
   */
  @java.lang.Override
  public int getEntriesCount() {
    return entries_.size();
  }
  /**
   * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionEntry getEntries(int index) {
    return entries_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder getEntriesOrBuilder(
      int index) {
    return entries_.get(index);
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
    if (metadata_ != null) {
      output.writeMessage(1, getMetadata());
    }
    for (int i = 0; i < entries_.size(); i++) {
      output.writeMessage(2, entries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetadata());
    }
    for (int i = 0; i < entries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, entries_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CollectionEntries)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CollectionEntries other = (com.tcn.cloud.api.api.v0alpha.CollectionEntries) obj;

    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
    }
    if (!getEntriesList()
        .equals(other.getEntriesList())) return false;
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
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    if (getEntriesCount() > 0) {
      hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CollectionEntries prototype) {
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
   * Protobuf type {@code api.v0alpha.CollectionEntries}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CollectionEntries)
      com.tcn.cloud.api.api.v0alpha.CollectionEntriesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CollectionEntries_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CollectionEntries_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CollectionEntries.class, com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CollectionEntries.newBuilder()
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
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
      } else {
        entries_ = null;
        entriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CollectionEntries_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CollectionEntries getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CollectionEntries.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CollectionEntries build() {
      com.tcn.cloud.api.api.v0alpha.CollectionEntries result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CollectionEntries buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CollectionEntries result = new com.tcn.cloud.api.api.v0alpha.CollectionEntries(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.CollectionEntries result) {
      if (entriesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.entries_ = entries_;
      } else {
        result.entries_ = entriesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CollectionEntries result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CollectionEntries) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CollectionEntries)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CollectionEntries other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CollectionEntries.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
      }
      if (entriesBuilder_ == null) {
        if (!other.entries_.isEmpty()) {
          if (entries_.isEmpty()) {
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureEntriesIsMutable();
            entries_.addAll(other.entries_);
          }
          onChanged();
        }
      } else {
        if (!other.entries_.isEmpty()) {
          if (entriesBuilder_.isEmpty()) {
            entriesBuilder_.dispose();
            entriesBuilder_ = null;
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000002);
            entriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntriesFieldBuilder() : null;
          } else {
            entriesBuilder_.addAllMessages(other.entries_);
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
              input.readMessage(
                  getMetadataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.v0alpha.CollectionEntry m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.CollectionEntry.parser(),
                      extensionRegistry);
              if (entriesBuilder_ == null) {
                ensureEntriesIsMutable();
                entries_.add(m);
              } else {
                entriesBuilder_.addMessage(m);
              }
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

    private com.tcn.cloud.api.api.v0alpha.CollectionMetadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder, com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder> metadataBuilder_;
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(com.tcn.cloud.api.api.v0alpha.CollectionMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(
        com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder mergeMetadata(com.tcn.cloud.api.api.v0alpha.CollectionMetadata value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          metadata_ != null &&
          metadata_ != com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>.api.v0alpha.CollectionMetadata metadata = 1 [json_name = "metadata"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder, com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder, com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntry> entries_ =
      java.util.Collections.emptyList();
    private void ensureEntriesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        entries_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.CollectionEntry>(entries_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CollectionEntry, com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder, com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder> entriesBuilder_;

    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntry> getEntriesList() {
      if (entriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entries_);
      } else {
        return entriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public int getEntriesCount() {
      if (entriesBuilder_ == null) {
        return entries_.size();
      } else {
        return entriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntry getEntries(int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);
      } else {
        return entriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder setEntries(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.set(index, value);
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder setEntries(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.set(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder addEntries(com.tcn.cloud.api.api.v0alpha.CollectionEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder addEntries(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionEntry value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(index, value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder addEntries(
        com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder addEntries(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder addAllEntries(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.CollectionEntry> values) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entries_);
        onChanged();
      } else {
        entriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder clearEntries() {
      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        entriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public Builder removeEntries(int index) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.remove(index);
        onChanged();
      } else {
        entriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder getEntriesBuilder(
        int index) {
      return getEntriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder getEntriesOrBuilder(
        int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);  } else {
        return entriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder> 
         getEntriesOrBuilderList() {
      if (entriesBuilder_ != null) {
        return entriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entries_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder addEntriesBuilder() {
      return getEntriesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.CollectionEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder addEntriesBuilder(
        int index) {
      return getEntriesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.CollectionEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntry entries = 2 [json_name = "entries"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder> 
         getEntriesBuilderList() {
      return getEntriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CollectionEntry, com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder, com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder> 
        getEntriesFieldBuilder() {
      if (entriesBuilder_ == null) {
        entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.CollectionEntry, com.tcn.cloud.api.api.v0alpha.CollectionEntry.Builder, com.tcn.cloud.api.api.v0alpha.CollectionEntryOrBuilder>(
                entries_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        entries_ = null;
      }
      return entriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CollectionEntries)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CollectionEntries)
  private static final com.tcn.cloud.api.api.v0alpha.CollectionEntries DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CollectionEntries();
  }

  public static com.tcn.cloud.api.api.v0alpha.CollectionEntries getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CollectionEntries>
      PARSER = new com.google.protobuf.AbstractParser<CollectionEntries>() {
    @java.lang.Override
    public CollectionEntries parsePartialFrom(
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

  public static com.google.protobuf.Parser<CollectionEntries> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollectionEntries> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionEntries getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

