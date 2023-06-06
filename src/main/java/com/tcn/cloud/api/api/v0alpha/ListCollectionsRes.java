// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListCollectionsRes}
 */
public final class ListCollectionsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListCollectionsRes)
    ListCollectionsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCollectionsRes.newBuilder() to construct.
  private ListCollectionsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCollectionsRes() {
    collections_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCollectionsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ListCollectionsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ListCollectionsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.class, com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.Builder.class);
  }

  public static final int COLLECTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> collections_;
  /**
   * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getCollectionsList() {
    return collections_;
  }
  /**
   * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder> 
      getCollectionsOrBuilderList() {
    return collections_;
  }
  /**
   * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
   */
  @java.lang.Override
  public int getCollectionsCount() {
    return collections_.size();
  }
  /**
   * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionMetadata getCollections(int index) {
    return collections_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder getCollectionsOrBuilder(
      int index) {
    return collections_.get(index);
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
    for (int i = 0; i < collections_.size(); i++) {
      output.writeMessage(1, collections_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < collections_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, collections_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListCollectionsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListCollectionsRes other = (com.tcn.cloud.api.api.v0alpha.ListCollectionsRes) obj;

    if (!getCollectionsList()
        .equals(other.getCollectionsList())) return false;
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
    if (getCollectionsCount() > 0) {
      hash = (37 * hash) + COLLECTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCollectionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListCollectionsRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ListCollectionsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListCollectionsRes)
      com.tcn.cloud.api.api.v0alpha.ListCollectionsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ListCollectionsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ListCollectionsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.class, com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.newBuilder()
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
      if (collectionsBuilder_ == null) {
        collections_ = java.util.Collections.emptyList();
      } else {
        collections_ = null;
        collectionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ListCollectionsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCollectionsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCollectionsRes build() {
      com.tcn.cloud.api.api.v0alpha.ListCollectionsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCollectionsRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListCollectionsRes result = new com.tcn.cloud.api.api.v0alpha.ListCollectionsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListCollectionsRes result) {
      if (collectionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          collections_ = java.util.Collections.unmodifiableList(collections_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.collections_ = collections_;
      } else {
        result.collections_ = collectionsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListCollectionsRes result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListCollectionsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListCollectionsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListCollectionsRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListCollectionsRes.getDefaultInstance()) return this;
      if (collectionsBuilder_ == null) {
        if (!other.collections_.isEmpty()) {
          if (collections_.isEmpty()) {
            collections_ = other.collections_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCollectionsIsMutable();
            collections_.addAll(other.collections_);
          }
          onChanged();
        }
      } else {
        if (!other.collections_.isEmpty()) {
          if (collectionsBuilder_.isEmpty()) {
            collectionsBuilder_.dispose();
            collectionsBuilder_ = null;
            collections_ = other.collections_;
            bitField0_ = (bitField0_ & ~0x00000001);
            collectionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCollectionsFieldBuilder() : null;
          } else {
            collectionsBuilder_.addAllMessages(other.collections_);
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
              com.tcn.cloud.api.api.v0alpha.CollectionMetadata m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.CollectionMetadata.parser(),
                      extensionRegistry);
              if (collectionsBuilder_ == null) {
                ensureCollectionsIsMutable();
                collections_.add(m);
              } else {
                collectionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> collections_ =
      java.util.Collections.emptyList();
    private void ensureCollectionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        collections_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.CollectionMetadata>(collections_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder, com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder> collectionsBuilder_;

    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionMetadata> getCollectionsList() {
      if (collectionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(collections_);
      } else {
        return collectionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public int getCollectionsCount() {
      if (collectionsBuilder_ == null) {
        return collections_.size();
      } else {
        return collectionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadata getCollections(int index) {
      if (collectionsBuilder_ == null) {
        return collections_.get(index);
      } else {
        return collectionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder setCollections(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionMetadata value) {
      if (collectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectionsIsMutable();
        collections_.set(index, value);
        onChanged();
      } else {
        collectionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder setCollections(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder builderForValue) {
      if (collectionsBuilder_ == null) {
        ensureCollectionsIsMutable();
        collections_.set(index, builderForValue.build());
        onChanged();
      } else {
        collectionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder addCollections(com.tcn.cloud.api.api.v0alpha.CollectionMetadata value) {
      if (collectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectionsIsMutable();
        collections_.add(value);
        onChanged();
      } else {
        collectionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder addCollections(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionMetadata value) {
      if (collectionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectionsIsMutable();
        collections_.add(index, value);
        onChanged();
      } else {
        collectionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder addCollections(
        com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder builderForValue) {
      if (collectionsBuilder_ == null) {
        ensureCollectionsIsMutable();
        collections_.add(builderForValue.build());
        onChanged();
      } else {
        collectionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder addCollections(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder builderForValue) {
      if (collectionsBuilder_ == null) {
        ensureCollectionsIsMutable();
        collections_.add(index, builderForValue.build());
        onChanged();
      } else {
        collectionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder addAllCollections(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.CollectionMetadata> values) {
      if (collectionsBuilder_ == null) {
        ensureCollectionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, collections_);
        onChanged();
      } else {
        collectionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder clearCollections() {
      if (collectionsBuilder_ == null) {
        collections_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        collectionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public Builder removeCollections(int index) {
      if (collectionsBuilder_ == null) {
        ensureCollectionsIsMutable();
        collections_.remove(index);
        onChanged();
      } else {
        collectionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder getCollectionsBuilder(
        int index) {
      return getCollectionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder getCollectionsOrBuilder(
        int index) {
      if (collectionsBuilder_ == null) {
        return collections_.get(index);  } else {
        return collectionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder> 
         getCollectionsOrBuilderList() {
      if (collectionsBuilder_ != null) {
        return collectionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(collections_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder addCollectionsBuilder() {
      return getCollectionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder addCollectionsBuilder(
        int index) {
      return getCollectionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.CollectionMetadata collections = 1 [json_name = "collections"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder> 
         getCollectionsBuilderList() {
      return getCollectionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder, com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder> 
        getCollectionsFieldBuilder() {
      if (collectionsBuilder_ == null) {
        collectionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.CollectionMetadata, com.tcn.cloud.api.api.v0alpha.CollectionMetadata.Builder, com.tcn.cloud.api.api.v0alpha.CollectionMetadataOrBuilder>(
                collections_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        collections_ = null;
      }
      return collectionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListCollectionsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListCollectionsRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListCollectionsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListCollectionsRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCollectionsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCollectionsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListCollectionsRes>() {
    @java.lang.Override
    public ListCollectionsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCollectionsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCollectionsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListCollectionsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

