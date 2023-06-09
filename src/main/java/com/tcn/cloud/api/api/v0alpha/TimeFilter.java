// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.TimeFilter}
 */
public final class TimeFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.TimeFilter)
    TimeFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimeFilter.newBuilder() to construct.
  private TimeFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimeFilter() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimeFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TimeFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TimeFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.TimeFilter.class, com.tcn.cloud.api.api.v0alpha.TimeFilter.Builder.class);
  }

  public static final int RELATIVE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.Relative relative_;
  /**
   * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
   * @return Whether the relative field is set.
   */
  @java.lang.Override
  public boolean hasRelative() {
    return relative_ != null;
  }
  /**
   * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
   * @return The relative.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Relative getRelative() {
    return relative_ == null ? com.tcn.cloud.api.api.v0alpha.Relative.getDefaultInstance() : relative_;
  }
  /**
   * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RelativeOrBuilder getRelativeOrBuilder() {
    return relative_ == null ? com.tcn.cloud.api.api.v0alpha.Relative.getDefaultInstance() : relative_;
  }

  public static final int ABSOLUTE_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v0alpha.Absolute absolute_;
  /**
   * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
   * @return Whether the absolute field is set.
   */
  @java.lang.Override
  public boolean hasAbsolute() {
    return absolute_ != null;
  }
  /**
   * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
   * @return The absolute.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Absolute getAbsolute() {
    return absolute_ == null ? com.tcn.cloud.api.api.v0alpha.Absolute.getDefaultInstance() : absolute_;
  }
  /**
   * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AbsoluteOrBuilder getAbsoluteOrBuilder() {
    return absolute_ == null ? com.tcn.cloud.api.api.v0alpha.Absolute.getDefaultInstance() : absolute_;
  }

  public static final int QUICK_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v0alpha.Quick quick_;
  /**
   * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
   * @return Whether the quick field is set.
   */
  @java.lang.Override
  public boolean hasQuick() {
    return quick_ != null;
  }
  /**
   * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
   * @return The quick.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Quick getQuick() {
    return quick_ == null ? com.tcn.cloud.api.api.v0alpha.Quick.getDefaultInstance() : quick_;
  }
  /**
   * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.QuickOrBuilder getQuickOrBuilder() {
    return quick_ == null ? com.tcn.cloud.api.api.v0alpha.Quick.getDefaultInstance() : quick_;
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
    if (relative_ != null) {
      output.writeMessage(1, getRelative());
    }
    if (absolute_ != null) {
      output.writeMessage(2, getAbsolute());
    }
    if (quick_ != null) {
      output.writeMessage(3, getQuick());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (relative_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRelative());
    }
    if (absolute_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAbsolute());
    }
    if (quick_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getQuick());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.TimeFilter)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.TimeFilter other = (com.tcn.cloud.api.api.v0alpha.TimeFilter) obj;

    if (hasRelative() != other.hasRelative()) return false;
    if (hasRelative()) {
      if (!getRelative()
          .equals(other.getRelative())) return false;
    }
    if (hasAbsolute() != other.hasAbsolute()) return false;
    if (hasAbsolute()) {
      if (!getAbsolute()
          .equals(other.getAbsolute())) return false;
    }
    if (hasQuick() != other.hasQuick()) return false;
    if (hasQuick()) {
      if (!getQuick()
          .equals(other.getQuick())) return false;
    }
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
    if (hasRelative()) {
      hash = (37 * hash) + RELATIVE_FIELD_NUMBER;
      hash = (53 * hash) + getRelative().hashCode();
    }
    if (hasAbsolute()) {
      hash = (37 * hash) + ABSOLUTE_FIELD_NUMBER;
      hash = (53 * hash) + getAbsolute().hashCode();
    }
    if (hasQuick()) {
      hash = (37 * hash) + QUICK_FIELD_NUMBER;
      hash = (53 * hash) + getQuick().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.TimeFilter parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.TimeFilter prototype) {
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
   * Protobuf type {@code api.v0alpha.TimeFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.TimeFilter)
      com.tcn.cloud.api.api.v0alpha.TimeFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TimeFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TimeFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.TimeFilter.class, com.tcn.cloud.api.api.v0alpha.TimeFilter.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.TimeFilter.newBuilder()
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
      relative_ = null;
      if (relativeBuilder_ != null) {
        relativeBuilder_.dispose();
        relativeBuilder_ = null;
      }
      absolute_ = null;
      if (absoluteBuilder_ != null) {
        absoluteBuilder_.dispose();
        absoluteBuilder_ = null;
      }
      quick_ = null;
      if (quickBuilder_ != null) {
        quickBuilder_.dispose();
        quickBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_TimeFilter_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeFilter getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.TimeFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeFilter build() {
      com.tcn.cloud.api.api.v0alpha.TimeFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TimeFilter buildPartial() {
      com.tcn.cloud.api.api.v0alpha.TimeFilter result = new com.tcn.cloud.api.api.v0alpha.TimeFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.TimeFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.relative_ = relativeBuilder_ == null
            ? relative_
            : relativeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.absolute_ = absoluteBuilder_ == null
            ? absolute_
            : absoluteBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.quick_ = quickBuilder_ == null
            ? quick_
            : quickBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.TimeFilter) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.TimeFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.TimeFilter other) {
      if (other == com.tcn.cloud.api.api.v0alpha.TimeFilter.getDefaultInstance()) return this;
      if (other.hasRelative()) {
        mergeRelative(other.getRelative());
      }
      if (other.hasAbsolute()) {
        mergeAbsolute(other.getAbsolute());
      }
      if (other.hasQuick()) {
        mergeQuick(other.getQuick());
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
                  getRelativeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAbsoluteFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getQuickFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private com.tcn.cloud.api.api.v0alpha.Relative relative_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relative, com.tcn.cloud.api.api.v0alpha.Relative.Builder, com.tcn.cloud.api.api.v0alpha.RelativeOrBuilder> relativeBuilder_;
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     * @return Whether the relative field is set.
     */
    public boolean hasRelative() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     * @return The relative.
     */
    public com.tcn.cloud.api.api.v0alpha.Relative getRelative() {
      if (relativeBuilder_ == null) {
        return relative_ == null ? com.tcn.cloud.api.api.v0alpha.Relative.getDefaultInstance() : relative_;
      } else {
        return relativeBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     */
    public Builder setRelative(com.tcn.cloud.api.api.v0alpha.Relative value) {
      if (relativeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        relative_ = value;
      } else {
        relativeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     */
    public Builder setRelative(
        com.tcn.cloud.api.api.v0alpha.Relative.Builder builderForValue) {
      if (relativeBuilder_ == null) {
        relative_ = builderForValue.build();
      } else {
        relativeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     */
    public Builder mergeRelative(com.tcn.cloud.api.api.v0alpha.Relative value) {
      if (relativeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          relative_ != null &&
          relative_ != com.tcn.cloud.api.api.v0alpha.Relative.getDefaultInstance()) {
          getRelativeBuilder().mergeFrom(value);
        } else {
          relative_ = value;
        }
      } else {
        relativeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     */
    public Builder clearRelative() {
      bitField0_ = (bitField0_ & ~0x00000001);
      relative_ = null;
      if (relativeBuilder_ != null) {
        relativeBuilder_.dispose();
        relativeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Relative.Builder getRelativeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRelativeFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RelativeOrBuilder getRelativeOrBuilder() {
      if (relativeBuilder_ != null) {
        return relativeBuilder_.getMessageOrBuilder();
      } else {
        return relative_ == null ?
            com.tcn.cloud.api.api.v0alpha.Relative.getDefaultInstance() : relative_;
      }
    }
    /**
     * <code>.api.v0alpha.Relative relative = 1 [json_name = "relative"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relative, com.tcn.cloud.api.api.v0alpha.Relative.Builder, com.tcn.cloud.api.api.v0alpha.RelativeOrBuilder> 
        getRelativeFieldBuilder() {
      if (relativeBuilder_ == null) {
        relativeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Relative, com.tcn.cloud.api.api.v0alpha.Relative.Builder, com.tcn.cloud.api.api.v0alpha.RelativeOrBuilder>(
                getRelative(),
                getParentForChildren(),
                isClean());
        relative_ = null;
      }
      return relativeBuilder_;
    }

    private com.tcn.cloud.api.api.v0alpha.Absolute absolute_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Absolute, com.tcn.cloud.api.api.v0alpha.Absolute.Builder, com.tcn.cloud.api.api.v0alpha.AbsoluteOrBuilder> absoluteBuilder_;
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     * @return Whether the absolute field is set.
     */
    public boolean hasAbsolute() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     * @return The absolute.
     */
    public com.tcn.cloud.api.api.v0alpha.Absolute getAbsolute() {
      if (absoluteBuilder_ == null) {
        return absolute_ == null ? com.tcn.cloud.api.api.v0alpha.Absolute.getDefaultInstance() : absolute_;
      } else {
        return absoluteBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     */
    public Builder setAbsolute(com.tcn.cloud.api.api.v0alpha.Absolute value) {
      if (absoluteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        absolute_ = value;
      } else {
        absoluteBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     */
    public Builder setAbsolute(
        com.tcn.cloud.api.api.v0alpha.Absolute.Builder builderForValue) {
      if (absoluteBuilder_ == null) {
        absolute_ = builderForValue.build();
      } else {
        absoluteBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     */
    public Builder mergeAbsolute(com.tcn.cloud.api.api.v0alpha.Absolute value) {
      if (absoluteBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          absolute_ != null &&
          absolute_ != com.tcn.cloud.api.api.v0alpha.Absolute.getDefaultInstance()) {
          getAbsoluteBuilder().mergeFrom(value);
        } else {
          absolute_ = value;
        }
      } else {
        absoluteBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     */
    public Builder clearAbsolute() {
      bitField0_ = (bitField0_ & ~0x00000002);
      absolute_ = null;
      if (absoluteBuilder_ != null) {
        absoluteBuilder_.dispose();
        absoluteBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Absolute.Builder getAbsoluteBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAbsoluteFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AbsoluteOrBuilder getAbsoluteOrBuilder() {
      if (absoluteBuilder_ != null) {
        return absoluteBuilder_.getMessageOrBuilder();
      } else {
        return absolute_ == null ?
            com.tcn.cloud.api.api.v0alpha.Absolute.getDefaultInstance() : absolute_;
      }
    }
    /**
     * <code>.api.v0alpha.Absolute absolute = 2 [json_name = "absolute"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Absolute, com.tcn.cloud.api.api.v0alpha.Absolute.Builder, com.tcn.cloud.api.api.v0alpha.AbsoluteOrBuilder> 
        getAbsoluteFieldBuilder() {
      if (absoluteBuilder_ == null) {
        absoluteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Absolute, com.tcn.cloud.api.api.v0alpha.Absolute.Builder, com.tcn.cloud.api.api.v0alpha.AbsoluteOrBuilder>(
                getAbsolute(),
                getParentForChildren(),
                isClean());
        absolute_ = null;
      }
      return absoluteBuilder_;
    }

    private com.tcn.cloud.api.api.v0alpha.Quick quick_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Quick, com.tcn.cloud.api.api.v0alpha.Quick.Builder, com.tcn.cloud.api.api.v0alpha.QuickOrBuilder> quickBuilder_;
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     * @return Whether the quick field is set.
     */
    public boolean hasQuick() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     * @return The quick.
     */
    public com.tcn.cloud.api.api.v0alpha.Quick getQuick() {
      if (quickBuilder_ == null) {
        return quick_ == null ? com.tcn.cloud.api.api.v0alpha.Quick.getDefaultInstance() : quick_;
      } else {
        return quickBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     */
    public Builder setQuick(com.tcn.cloud.api.api.v0alpha.Quick value) {
      if (quickBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        quick_ = value;
      } else {
        quickBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     */
    public Builder setQuick(
        com.tcn.cloud.api.api.v0alpha.Quick.Builder builderForValue) {
      if (quickBuilder_ == null) {
        quick_ = builderForValue.build();
      } else {
        quickBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     */
    public Builder mergeQuick(com.tcn.cloud.api.api.v0alpha.Quick value) {
      if (quickBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          quick_ != null &&
          quick_ != com.tcn.cloud.api.api.v0alpha.Quick.getDefaultInstance()) {
          getQuickBuilder().mergeFrom(value);
        } else {
          quick_ = value;
        }
      } else {
        quickBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     */
    public Builder clearQuick() {
      bitField0_ = (bitField0_ & ~0x00000004);
      quick_ = null;
      if (quickBuilder_ != null) {
        quickBuilder_.dispose();
        quickBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Quick.Builder getQuickBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getQuickFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.QuickOrBuilder getQuickOrBuilder() {
      if (quickBuilder_ != null) {
        return quickBuilder_.getMessageOrBuilder();
      } else {
        return quick_ == null ?
            com.tcn.cloud.api.api.v0alpha.Quick.getDefaultInstance() : quick_;
      }
    }
    /**
     * <code>.api.v0alpha.Quick quick = 3 [json_name = "quick"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Quick, com.tcn.cloud.api.api.v0alpha.Quick.Builder, com.tcn.cloud.api.api.v0alpha.QuickOrBuilder> 
        getQuickFieldBuilder() {
      if (quickBuilder_ == null) {
        quickBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Quick, com.tcn.cloud.api.api.v0alpha.Quick.Builder, com.tcn.cloud.api.api.v0alpha.QuickOrBuilder>(
                getQuick(),
                getParentForChildren(),
                isClean());
        quick_ = null;
      }
      return quickBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.TimeFilter)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.TimeFilter)
  private static final com.tcn.cloud.api.api.v0alpha.TimeFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.TimeFilter();
  }

  public static com.tcn.cloud.api.api.v0alpha.TimeFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeFilter>
      PARSER = new com.google.protobuf.AbstractParser<TimeFilter>() {
    @java.lang.Override
    public TimeFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimeFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.TimeFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

