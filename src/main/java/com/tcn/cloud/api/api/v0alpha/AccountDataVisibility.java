// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.AccountDataVisibility}
 */
public final class AccountDataVisibility extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.AccountDataVisibility)
    AccountDataVisibilityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountDataVisibility.newBuilder() to construct.
  private AccountDataVisibility(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountDataVisibility() {
    views_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccountDataVisibility();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AccountDataVisibility_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AccountDataVisibility_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.AccountDataVisibility.class, com.tcn.cloud.api.api.v0alpha.AccountDataVisibility.Builder.class);
  }

  public static final int VIEWER_FIELD_NUMBER = 1;
  private long viewer_ = 0L;
  /**
   * <code>int64 viewer = 1 [json_name = "viewer"];</code>
   * @return The viewer.
   */
  @java.lang.Override
  public long getViewer() {
    return viewer_;
  }

  public static final int VIEWS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.View> views_;
  /**
   * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.View> getViewsList() {
    return views_;
  }
  /**
   * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ViewOrBuilder> 
      getViewsOrBuilderList() {
    return views_;
  }
  /**
   * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
   */
  @java.lang.Override
  public int getViewsCount() {
    return views_.size();
  }
  /**
   * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.View getViews(int index) {
    return views_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ViewOrBuilder getViewsOrBuilder(
      int index) {
    return views_.get(index);
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
    if (viewer_ != 0L) {
      output.writeInt64(1, viewer_);
    }
    for (int i = 0; i < views_.size(); i++) {
      output.writeMessage(2, views_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (viewer_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, viewer_);
    }
    for (int i = 0; i < views_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, views_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.AccountDataVisibility)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.AccountDataVisibility other = (com.tcn.cloud.api.api.v0alpha.AccountDataVisibility) obj;

    if (getViewer()
        != other.getViewer()) return false;
    if (!getViewsList()
        .equals(other.getViewsList())) return false;
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
    hash = (37 * hash) + VIEWER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getViewer());
    if (getViewsCount() > 0) {
      hash = (37 * hash) + VIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getViewsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.AccountDataVisibility prototype) {
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
   * Protobuf type {@code api.v0alpha.AccountDataVisibility}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.AccountDataVisibility)
      com.tcn.cloud.api.api.v0alpha.AccountDataVisibilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AccountDataVisibility_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AccountDataVisibility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.AccountDataVisibility.class, com.tcn.cloud.api.api.v0alpha.AccountDataVisibility.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.AccountDataVisibility.newBuilder()
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
      viewer_ = 0L;
      if (viewsBuilder_ == null) {
        views_ = java.util.Collections.emptyList();
      } else {
        views_ = null;
        viewsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_AccountDataVisibility_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AccountDataVisibility getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.AccountDataVisibility.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AccountDataVisibility build() {
      com.tcn.cloud.api.api.v0alpha.AccountDataVisibility result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.AccountDataVisibility buildPartial() {
      com.tcn.cloud.api.api.v0alpha.AccountDataVisibility result = new com.tcn.cloud.api.api.v0alpha.AccountDataVisibility(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.AccountDataVisibility result) {
      if (viewsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          views_ = java.util.Collections.unmodifiableList(views_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.views_ = views_;
      } else {
        result.views_ = viewsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.AccountDataVisibility result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.viewer_ = viewer_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.AccountDataVisibility) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.AccountDataVisibility)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.AccountDataVisibility other) {
      if (other == com.tcn.cloud.api.api.v0alpha.AccountDataVisibility.getDefaultInstance()) return this;
      if (other.getViewer() != 0L) {
        setViewer(other.getViewer());
      }
      if (viewsBuilder_ == null) {
        if (!other.views_.isEmpty()) {
          if (views_.isEmpty()) {
            views_ = other.views_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureViewsIsMutable();
            views_.addAll(other.views_);
          }
          onChanged();
        }
      } else {
        if (!other.views_.isEmpty()) {
          if (viewsBuilder_.isEmpty()) {
            viewsBuilder_.dispose();
            viewsBuilder_ = null;
            views_ = other.views_;
            bitField0_ = (bitField0_ & ~0x00000002);
            viewsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getViewsFieldBuilder() : null;
          } else {
            viewsBuilder_.addAllMessages(other.views_);
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
            case 8: {
              viewer_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.tcn.cloud.api.api.v0alpha.View m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.View.parser(),
                      extensionRegistry);
              if (viewsBuilder_ == null) {
                ensureViewsIsMutable();
                views_.add(m);
              } else {
                viewsBuilder_.addMessage(m);
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

    private long viewer_ ;
    /**
     * <code>int64 viewer = 1 [json_name = "viewer"];</code>
     * @return The viewer.
     */
    @java.lang.Override
    public long getViewer() {
      return viewer_;
    }
    /**
     * <code>int64 viewer = 1 [json_name = "viewer"];</code>
     * @param value The viewer to set.
     * @return This builder for chaining.
     */
    public Builder setViewer(long value) {

      viewer_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 viewer = 1 [json_name = "viewer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearViewer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      viewer_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.View> views_ =
      java.util.Collections.emptyList();
    private void ensureViewsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        views_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.View>(views_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.View, com.tcn.cloud.api.api.v0alpha.View.Builder, com.tcn.cloud.api.api.v0alpha.ViewOrBuilder> viewsBuilder_;

    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.View> getViewsList() {
      if (viewsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(views_);
      } else {
        return viewsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public int getViewsCount() {
      if (viewsBuilder_ == null) {
        return views_.size();
      } else {
        return viewsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.View getViews(int index) {
      if (viewsBuilder_ == null) {
        return views_.get(index);
      } else {
        return viewsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder setViews(
        int index, com.tcn.cloud.api.api.v0alpha.View value) {
      if (viewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViewsIsMutable();
        views_.set(index, value);
        onChanged();
      } else {
        viewsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder setViews(
        int index, com.tcn.cloud.api.api.v0alpha.View.Builder builderForValue) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        views_.set(index, builderForValue.build());
        onChanged();
      } else {
        viewsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder addViews(com.tcn.cloud.api.api.v0alpha.View value) {
      if (viewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViewsIsMutable();
        views_.add(value);
        onChanged();
      } else {
        viewsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder addViews(
        int index, com.tcn.cloud.api.api.v0alpha.View value) {
      if (viewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureViewsIsMutable();
        views_.add(index, value);
        onChanged();
      } else {
        viewsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder addViews(
        com.tcn.cloud.api.api.v0alpha.View.Builder builderForValue) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        views_.add(builderForValue.build());
        onChanged();
      } else {
        viewsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder addViews(
        int index, com.tcn.cloud.api.api.v0alpha.View.Builder builderForValue) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        views_.add(index, builderForValue.build());
        onChanged();
      } else {
        viewsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder addAllViews(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.View> values) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, views_);
        onChanged();
      } else {
        viewsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder clearViews() {
      if (viewsBuilder_ == null) {
        views_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        viewsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public Builder removeViews(int index) {
      if (viewsBuilder_ == null) {
        ensureViewsIsMutable();
        views_.remove(index);
        onChanged();
      } else {
        viewsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.View.Builder getViewsBuilder(
        int index) {
      return getViewsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ViewOrBuilder getViewsOrBuilder(
        int index) {
      if (viewsBuilder_ == null) {
        return views_.get(index);  } else {
        return viewsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ViewOrBuilder> 
         getViewsOrBuilderList() {
      if (viewsBuilder_ != null) {
        return viewsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(views_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.View.Builder addViewsBuilder() {
      return getViewsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.View.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.View.Builder addViewsBuilder(
        int index) {
      return getViewsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.View.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.View views = 2 [json_name = "views"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.View.Builder> 
         getViewsBuilderList() {
      return getViewsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.View, com.tcn.cloud.api.api.v0alpha.View.Builder, com.tcn.cloud.api.api.v0alpha.ViewOrBuilder> 
        getViewsFieldBuilder() {
      if (viewsBuilder_ == null) {
        viewsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.View, com.tcn.cloud.api.api.v0alpha.View.Builder, com.tcn.cloud.api.api.v0alpha.ViewOrBuilder>(
                views_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        views_ = null;
      }
      return viewsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.AccountDataVisibility)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.AccountDataVisibility)
  private static final com.tcn.cloud.api.api.v0alpha.AccountDataVisibility DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.AccountDataVisibility();
  }

  public static com.tcn.cloud.api.api.v0alpha.AccountDataVisibility getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountDataVisibility>
      PARSER = new com.google.protobuf.AbstractParser<AccountDataVisibility>() {
    @java.lang.Override
    public AccountDataVisibility parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountDataVisibility> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountDataVisibility> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AccountDataVisibility getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

