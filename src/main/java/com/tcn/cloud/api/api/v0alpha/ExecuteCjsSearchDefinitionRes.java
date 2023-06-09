// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ExecuteCjsSearchDefinitionRes}
 */
public final class ExecuteCjsSearchDefinitionRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ExecuteCjsSearchDefinitionRes)
    ExecuteCjsSearchDefinitionResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecuteCjsSearchDefinitionRes.newBuilder() to construct.
  private ExecuteCjsSearchDefinitionRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecuteCjsSearchDefinitionRes() {
    collectionEntries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecuteCjsSearchDefinitionRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ExecuteCjsSearchDefinitionRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ExecuteCjsSearchDefinitionRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.class, com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.Builder.class);
  }

  public static final int COLLECTION_ENTRIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntries> collectionEntries_;
  /**
   * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntries> getCollectionEntriesList() {
    return collectionEntries_;
  }
  /**
   * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CollectionEntriesOrBuilder> 
      getCollectionEntriesOrBuilderList() {
    return collectionEntries_;
  }
  /**
   * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
   */
  @java.lang.Override
  public int getCollectionEntriesCount() {
    return collectionEntries_.size();
  }
  /**
   * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionEntries getCollectionEntries(int index) {
    return collectionEntries_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CollectionEntriesOrBuilder getCollectionEntriesOrBuilder(
      int index) {
    return collectionEntries_.get(index);
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
    for (int i = 0; i < collectionEntries_.size(); i++) {
      output.writeMessage(1, collectionEntries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < collectionEntries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, collectionEntries_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes other = (com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes) obj;

    if (!getCollectionEntriesList()
        .equals(other.getCollectionEntriesList())) return false;
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
    if (getCollectionEntriesCount() > 0) {
      hash = (37 * hash) + COLLECTION_ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getCollectionEntriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ExecuteCjsSearchDefinitionRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ExecuteCjsSearchDefinitionRes)
      com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ExecuteCjsSearchDefinitionRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ExecuteCjsSearchDefinitionRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.class, com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.newBuilder()
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
      if (collectionEntriesBuilder_ == null) {
        collectionEntries_ = java.util.Collections.emptyList();
      } else {
        collectionEntries_ = null;
        collectionEntriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ExecuteCjsSearchDefinitionRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes build() {
      com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes result = new com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes result) {
      if (collectionEntriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          collectionEntries_ = java.util.Collections.unmodifiableList(collectionEntries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.collectionEntries_ = collectionEntries_;
      } else {
        result.collectionEntries_ = collectionEntriesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes.getDefaultInstance()) return this;
      if (collectionEntriesBuilder_ == null) {
        if (!other.collectionEntries_.isEmpty()) {
          if (collectionEntries_.isEmpty()) {
            collectionEntries_ = other.collectionEntries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCollectionEntriesIsMutable();
            collectionEntries_.addAll(other.collectionEntries_);
          }
          onChanged();
        }
      } else {
        if (!other.collectionEntries_.isEmpty()) {
          if (collectionEntriesBuilder_.isEmpty()) {
            collectionEntriesBuilder_.dispose();
            collectionEntriesBuilder_ = null;
            collectionEntries_ = other.collectionEntries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            collectionEntriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCollectionEntriesFieldBuilder() : null;
          } else {
            collectionEntriesBuilder_.addAllMessages(other.collectionEntries_);
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
              com.tcn.cloud.api.api.v0alpha.CollectionEntries m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.CollectionEntries.parser(),
                      extensionRegistry);
              if (collectionEntriesBuilder_ == null) {
                ensureCollectionEntriesIsMutable();
                collectionEntries_.add(m);
              } else {
                collectionEntriesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntries> collectionEntries_ =
      java.util.Collections.emptyList();
    private void ensureCollectionEntriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        collectionEntries_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.CollectionEntries>(collectionEntries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CollectionEntries, com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder, com.tcn.cloud.api.api.v0alpha.CollectionEntriesOrBuilder> collectionEntriesBuilder_;

    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntries> getCollectionEntriesList() {
      if (collectionEntriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(collectionEntries_);
      } else {
        return collectionEntriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public int getCollectionEntriesCount() {
      if (collectionEntriesBuilder_ == null) {
        return collectionEntries_.size();
      } else {
        return collectionEntriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntries getCollectionEntries(int index) {
      if (collectionEntriesBuilder_ == null) {
        return collectionEntries_.get(index);
      } else {
        return collectionEntriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder setCollectionEntries(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionEntries value) {
      if (collectionEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectionEntriesIsMutable();
        collectionEntries_.set(index, value);
        onChanged();
      } else {
        collectionEntriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder setCollectionEntries(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder builderForValue) {
      if (collectionEntriesBuilder_ == null) {
        ensureCollectionEntriesIsMutable();
        collectionEntries_.set(index, builderForValue.build());
        onChanged();
      } else {
        collectionEntriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder addCollectionEntries(com.tcn.cloud.api.api.v0alpha.CollectionEntries value) {
      if (collectionEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectionEntriesIsMutable();
        collectionEntries_.add(value);
        onChanged();
      } else {
        collectionEntriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder addCollectionEntries(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionEntries value) {
      if (collectionEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCollectionEntriesIsMutable();
        collectionEntries_.add(index, value);
        onChanged();
      } else {
        collectionEntriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder addCollectionEntries(
        com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder builderForValue) {
      if (collectionEntriesBuilder_ == null) {
        ensureCollectionEntriesIsMutable();
        collectionEntries_.add(builderForValue.build());
        onChanged();
      } else {
        collectionEntriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder addCollectionEntries(
        int index, com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder builderForValue) {
      if (collectionEntriesBuilder_ == null) {
        ensureCollectionEntriesIsMutable();
        collectionEntries_.add(index, builderForValue.build());
        onChanged();
      } else {
        collectionEntriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder addAllCollectionEntries(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.CollectionEntries> values) {
      if (collectionEntriesBuilder_ == null) {
        ensureCollectionEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, collectionEntries_);
        onChanged();
      } else {
        collectionEntriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder clearCollectionEntries() {
      if (collectionEntriesBuilder_ == null) {
        collectionEntries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        collectionEntriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public Builder removeCollectionEntries(int index) {
      if (collectionEntriesBuilder_ == null) {
        ensureCollectionEntriesIsMutable();
        collectionEntries_.remove(index);
        onChanged();
      } else {
        collectionEntriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder getCollectionEntriesBuilder(
        int index) {
      return getCollectionEntriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntriesOrBuilder getCollectionEntriesOrBuilder(
        int index) {
      if (collectionEntriesBuilder_ == null) {
        return collectionEntries_.get(index);  } else {
        return collectionEntriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CollectionEntriesOrBuilder> 
         getCollectionEntriesOrBuilderList() {
      if (collectionEntriesBuilder_ != null) {
        return collectionEntriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(collectionEntries_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder addCollectionEntriesBuilder() {
      return getCollectionEntriesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.CollectionEntries.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder addCollectionEntriesBuilder(
        int index) {
      return getCollectionEntriesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.CollectionEntries.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.CollectionEntries collection_entries = 1 [json_name = "collectionEntries"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder> 
         getCollectionEntriesBuilderList() {
      return getCollectionEntriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CollectionEntries, com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder, com.tcn.cloud.api.api.v0alpha.CollectionEntriesOrBuilder> 
        getCollectionEntriesFieldBuilder() {
      if (collectionEntriesBuilder_ == null) {
        collectionEntriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.CollectionEntries, com.tcn.cloud.api.api.v0alpha.CollectionEntries.Builder, com.tcn.cloud.api.api.v0alpha.CollectionEntriesOrBuilder>(
                collectionEntries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        collectionEntries_ = null;
      }
      return collectionEntriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ExecuteCjsSearchDefinitionRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ExecuteCjsSearchDefinitionRes)
  private static final com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecuteCjsSearchDefinitionRes>
      PARSER = new com.google.protobuf.AbstractParser<ExecuteCjsSearchDefinitionRes>() {
    @java.lang.Override
    public ExecuteCjsSearchDefinitionRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExecuteCjsSearchDefinitionRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecuteCjsSearchDefinitionRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ExecuteCjsSearchDefinitionRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

