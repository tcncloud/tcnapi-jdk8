// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * File name convention properties
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.FileNamingConvention}
 */
public final class FileNamingConvention extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.FileNamingConvention)
    FileNamingConventionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileNamingConvention.newBuilder() to construct.
  private FileNamingConvention(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileNamingConvention() {
    segments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileNamingConvention();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_FileNamingConvention_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_FileNamingConvention_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention.Builder.class);
  }

  public static final int SEGMENTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment> segments_;
  /**
   * <pre>
   * Convention segments
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment> getSegmentsList() {
    return segments_;
  }
  /**
   * <pre>
   * Convention segments
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegmentOrBuilder> 
      getSegmentsOrBuilderList() {
    return segments_;
  }
  /**
   * <pre>
   * Convention segments
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
   */
  @java.lang.Override
  public int getSegmentsCount() {
    return segments_.size();
  }
  /**
   * <pre>
   * Convention segments
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment getSegments(int index) {
    return segments_.get(index);
  }
  /**
   * <pre>
   * Convention segments
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegmentOrBuilder getSegmentsOrBuilder(
      int index) {
    return segments_.get(index);
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
    for (int i = 0; i < segments_.size(); i++) {
      output.writeMessage(2, segments_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < segments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, segments_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention) obj;

    if (!getSegmentsList()
        .equals(other.getSegmentsList())) return false;
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
    if (getSegmentsCount() > 0) {
      hash = (37 * hash) + SEGMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention prototype) {
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
   * File name convention properties
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.FileNamingConvention}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.FileNamingConvention)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConventionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_FileNamingConvention_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_FileNamingConvention_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention.newBuilder()
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
      if (segmentsBuilder_ == null) {
        segments_ = java.util.Collections.emptyList();
      } else {
        segments_ = null;
        segmentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_FileNamingConvention_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention result) {
      if (segmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          segments_ = java.util.Collections.unmodifiableList(segments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.segments_ = segments_;
      } else {
        result.segments_ = segmentsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention.getDefaultInstance()) return this;
      if (segmentsBuilder_ == null) {
        if (!other.segments_.isEmpty()) {
          if (segments_.isEmpty()) {
            segments_ = other.segments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSegmentsIsMutable();
            segments_.addAll(other.segments_);
          }
          onChanged();
        }
      } else {
        if (!other.segments_.isEmpty()) {
          if (segmentsBuilder_.isEmpty()) {
            segmentsBuilder_.dispose();
            segmentsBuilder_ = null;
            segments_ = other.segments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            segmentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSegmentsFieldBuilder() : null;
          } else {
            segmentsBuilder_.addAllMessages(other.segments_);
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
            case 18: {
              com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.parser(),
                      extensionRegistry);
              if (segmentsBuilder_ == null) {
                ensureSegmentsIsMutable();
                segments_.add(m);
              } else {
                segmentsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment> segments_ =
      java.util.Collections.emptyList();
    private void ensureSegmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        segments_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment>(segments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegmentOrBuilder> segmentsBuilder_;

    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment> getSegmentsList() {
      if (segmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(segments_);
      } else {
        return segmentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public int getSegmentsCount() {
      if (segmentsBuilder_ == null) {
        return segments_.size();
      } else {
        return segmentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment getSegments(int index) {
      if (segmentsBuilder_ == null) {
        return segments_.get(index);
      } else {
        return segmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder setSegments(
        int index, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.set(index, value);
        onChanged();
      } else {
        segmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder setSegments(
        int index, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.set(index, builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder addSegments(com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.add(value);
        onChanged();
      } else {
        segmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder addSegments(
        int index, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.add(index, value);
        onChanged();
      } else {
        segmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder addSegments(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.add(builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder addSegments(
        int index, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.add(index, builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder addAllSegments(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment> values) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, segments_);
        onChanged();
      } else {
        segmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder clearSegments() {
      if (segmentsBuilder_ == null) {
        segments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        segmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public Builder removeSegments(int index) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.remove(index);
        onChanged();
      } else {
        segmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder getSegmentsBuilder(
        int index) {
      return getSegmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegmentOrBuilder getSegmentsOrBuilder(
        int index) {
      if (segmentsBuilder_ == null) {
        return segments_.get(index);  } else {
        return segmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegmentOrBuilder> 
         getSegmentsOrBuilderList() {
      if (segmentsBuilder_ != null) {
        return segmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(segments_);
      }
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder addSegmentsBuilder() {
      return getSegmentsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.getDefaultInstance());
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder addSegmentsBuilder(
        int index) {
      return getSegmentsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.getDefaultInstance());
    }
    /**
     * <pre>
     * Convention segments
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.legacy.FileNameSegment segments = 2 [json_name = "segments"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder> 
         getSegmentsBuilderList() {
      return getSegmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegmentOrBuilder> 
        getSegmentsFieldBuilder() {
      if (segmentsBuilder_ == null) {
        segmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegment.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNameSegmentOrBuilder>(
                segments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        segments_ = null;
      }
      return segmentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.FileNamingConvention)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.FileNamingConvention)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileNamingConvention>
      PARSER = new com.google.protobuf.AbstractParser<FileNamingConvention>() {
    @java.lang.Override
    public FileNamingConvention parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileNamingConvention> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileNamingConvention> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.FileNamingConvention getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

