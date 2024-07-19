// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for ListRgbaColors.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListRgbaColorsResponse}
 */
public final class ListRgbaColorsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListRgbaColorsResponse)
    ListRgbaColorsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListRgbaColorsResponse.newBuilder() to construct.
  private ListRgbaColorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRgbaColorsResponse() {
    colors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListRgbaColorsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRgbaColorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRgbaColorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse.Builder.class);
  }

  public static final int COLORS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor> colors_;
  /**
   * <pre>
   * The rgba colors for the &#64;org_id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor> getColorsList() {
    return colors_;
  }
  /**
   * <pre>
   * The rgba colors for the &#64;org_id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColorOrBuilder> 
      getColorsOrBuilderList() {
    return colors_;
  }
  /**
   * <pre>
   * The rgba colors for the &#64;org_id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
   */
  @java.lang.Override
  public int getColorsCount() {
    return colors_.size();
  }
  /**
   * <pre>
   * The rgba colors for the &#64;org_id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor getColors(int index) {
    return colors_.get(index);
  }
  /**
   * <pre>
   * The rgba colors for the &#64;org_id.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColorOrBuilder getColorsOrBuilder(
      int index) {
    return colors_.get(index);
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
    for (int i = 0; i < colors_.size(); i++) {
      output.writeMessage(1, colors_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < colors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, colors_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse) obj;

    if (!getColorsList()
        .equals(other.getColorsList())) return false;
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
    if (getColorsCount() > 0) {
      hash = (37 * hash) + COLORS_FIELD_NUMBER;
      hash = (53 * hash) + getColorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse prototype) {
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
   * Response message for ListRgbaColors.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListRgbaColorsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListRgbaColorsResponse)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRgbaColorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRgbaColorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse.newBuilder()
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
      if (colorsBuilder_ == null) {
        colors_ = java.util.Collections.emptyList();
      } else {
        colors_ = null;
        colorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRgbaColorsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse result) {
      if (colorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          colors_ = java.util.Collections.unmodifiableList(colors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.colors_ = colors_;
      } else {
        result.colors_ = colorsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse.getDefaultInstance()) return this;
      if (colorsBuilder_ == null) {
        if (!other.colors_.isEmpty()) {
          if (colors_.isEmpty()) {
            colors_ = other.colors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColorsIsMutable();
            colors_.addAll(other.colors_);
          }
          onChanged();
        }
      } else {
        if (!other.colors_.isEmpty()) {
          if (colorsBuilder_.isEmpty()) {
            colorsBuilder_.dispose();
            colorsBuilder_ = null;
            colors_ = other.colors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            colorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColorsFieldBuilder() : null;
          } else {
            colorsBuilder_.addAllMessages(other.colors_);
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
              com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.parser(),
                      extensionRegistry);
              if (colorsBuilder_ == null) {
                ensureColorsIsMutable();
                colors_.add(m);
              } else {
                colorsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor> colors_ =
      java.util.Collections.emptyList();
    private void ensureColorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        colors_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor>(colors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColorOrBuilder> colorsBuilder_;

    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor> getColorsList() {
      if (colorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(colors_);
      } else {
        return colorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public int getColorsCount() {
      if (colorsBuilder_ == null) {
        return colors_.size();
      } else {
        return colorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor getColors(int index) {
      if (colorsBuilder_ == null) {
        return colors_.get(index);
      } else {
        return colorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder setColors(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor value) {
      if (colorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColorsIsMutable();
        colors_.set(index, value);
        onChanged();
      } else {
        colorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder setColors(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder builderForValue) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        colors_.set(index, builderForValue.build());
        onChanged();
      } else {
        colorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder addColors(com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor value) {
      if (colorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColorsIsMutable();
        colors_.add(value);
        onChanged();
      } else {
        colorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder addColors(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor value) {
      if (colorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColorsIsMutable();
        colors_.add(index, value);
        onChanged();
      } else {
        colorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder addColors(
        com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder builderForValue) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        colors_.add(builderForValue.build());
        onChanged();
      } else {
        colorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder addColors(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder builderForValue) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        colors_.add(index, builderForValue.build());
        onChanged();
      } else {
        colorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder addAllColors(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor> values) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, colors_);
        onChanged();
      } else {
        colorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder clearColors() {
      if (colorsBuilder_ == null) {
        colors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        colorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public Builder removeColors(int index) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        colors_.remove(index);
        onChanged();
      } else {
        colorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder getColorsBuilder(
        int index) {
      return getColorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColorOrBuilder getColorsOrBuilder(
        int index) {
      if (colorsBuilder_ == null) {
        return colors_.get(index);  } else {
        return colorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColorOrBuilder> 
         getColorsOrBuilderList() {
      if (colorsBuilder_ != null) {
        return colorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(colors_);
      }
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder addColorsBuilder() {
      return getColorsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.getDefaultInstance());
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder addColorsBuilder(
        int index) {
      return getColorsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.getDefaultInstance());
    }
    /**
     * <pre>
     * The rgba colors for the &#64;org_id.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.RgbaColor colors = 1 [json_name = "colors"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder> 
         getColorsBuilderList() {
      return getColorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColorOrBuilder> 
        getColorsFieldBuilder() {
      if (colorsBuilder_ == null) {
        colorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColor.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RgbaColorOrBuilder>(
                colors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        colors_ = null;
      }
      return colorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListRgbaColorsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListRgbaColorsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRgbaColorsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListRgbaColorsResponse>() {
    @java.lang.Override
    public ListRgbaColorsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRgbaColorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRgbaColorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListRgbaColorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

