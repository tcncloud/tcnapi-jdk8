// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.PortalSegments}
 */
public final class PortalSegments extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.PortalSegments)
    PortalSegmentsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PortalSegments.newBuilder() to construct.
  private PortalSegments(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PortalSegments() {
    portalSegments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PortalSegments();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalSegments_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalSegments_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments.class, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments.Builder.class);
  }

  public static final int PORTAL_SEGMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment> portalSegments_;
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment> getPortalSegmentsList() {
    return portalSegments_;
  }
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegmentOrBuilder> 
      getPortalSegmentsOrBuilderList() {
    return portalSegments_;
  }
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
   */
  @java.lang.Override
  public int getPortalSegmentsCount() {
    return portalSegments_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment getPortalSegments(int index) {
    return portalSegments_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegmentOrBuilder getPortalSegmentsOrBuilder(
      int index) {
    return portalSegments_.get(index);
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
    for (int i = 0; i < portalSegments_.size(); i++) {
      output.writeMessage(1, portalSegments_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < portalSegments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, portalSegments_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments other = (com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments) obj;

    if (!getPortalSegmentsList()
        .equals(other.getPortalSegmentsList())) return false;
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
    if (getPortalSegmentsCount() > 0) {
      hash = (37 * hash) + PORTAL_SEGMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getPortalSegmentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.PortalSegments}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.PortalSegments)
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegmentsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalSegments_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalSegments_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments.class, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments.newBuilder()
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
      if (portalSegmentsBuilder_ == null) {
        portalSegments_ = java.util.Collections.emptyList();
      } else {
        portalSegments_ = null;
        portalSegmentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalSegments_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments result = new com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments result) {
      if (portalSegmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          portalSegments_ = java.util.Collections.unmodifiableList(portalSegments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.portalSegments_ = portalSegments_;
      } else {
        result.portalSegments_ = portalSegmentsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments.getDefaultInstance()) return this;
      if (portalSegmentsBuilder_ == null) {
        if (!other.portalSegments_.isEmpty()) {
          if (portalSegments_.isEmpty()) {
            portalSegments_ = other.portalSegments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePortalSegmentsIsMutable();
            portalSegments_.addAll(other.portalSegments_);
          }
          onChanged();
        }
      } else {
        if (!other.portalSegments_.isEmpty()) {
          if (portalSegmentsBuilder_.isEmpty()) {
            portalSegmentsBuilder_.dispose();
            portalSegmentsBuilder_ = null;
            portalSegments_ = other.portalSegments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            portalSegmentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPortalSegmentsFieldBuilder() : null;
          } else {
            portalSegmentsBuilder_.addAllMessages(other.portalSegments_);
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
              com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.parser(),
                      extensionRegistry);
              if (portalSegmentsBuilder_ == null) {
                ensurePortalSegmentsIsMutable();
                portalSegments_.add(m);
              } else {
                portalSegmentsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment> portalSegments_ =
      java.util.Collections.emptyList();
    private void ensurePortalSegmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        portalSegments_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment>(portalSegments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegmentOrBuilder> portalSegmentsBuilder_;

    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment> getPortalSegmentsList() {
      if (portalSegmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(portalSegments_);
      } else {
        return portalSegmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public int getPortalSegmentsCount() {
      if (portalSegmentsBuilder_ == null) {
        return portalSegments_.size();
      } else {
        return portalSegmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment getPortalSegments(int index) {
      if (portalSegmentsBuilder_ == null) {
        return portalSegments_.get(index);
      } else {
        return portalSegmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder setPortalSegments(
        int index, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment value) {
      if (portalSegmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePortalSegmentsIsMutable();
        portalSegments_.set(index, value);
        onChanged();
      } else {
        portalSegmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder setPortalSegments(
        int index, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder builderForValue) {
      if (portalSegmentsBuilder_ == null) {
        ensurePortalSegmentsIsMutable();
        portalSegments_.set(index, builderForValue.build());
        onChanged();
      } else {
        portalSegmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder addPortalSegments(com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment value) {
      if (portalSegmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePortalSegmentsIsMutable();
        portalSegments_.add(value);
        onChanged();
      } else {
        portalSegmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder addPortalSegments(
        int index, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment value) {
      if (portalSegmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePortalSegmentsIsMutable();
        portalSegments_.add(index, value);
        onChanged();
      } else {
        portalSegmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder addPortalSegments(
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder builderForValue) {
      if (portalSegmentsBuilder_ == null) {
        ensurePortalSegmentsIsMutable();
        portalSegments_.add(builderForValue.build());
        onChanged();
      } else {
        portalSegmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder addPortalSegments(
        int index, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder builderForValue) {
      if (portalSegmentsBuilder_ == null) {
        ensurePortalSegmentsIsMutable();
        portalSegments_.add(index, builderForValue.build());
        onChanged();
      } else {
        portalSegmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder addAllPortalSegments(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment> values) {
      if (portalSegmentsBuilder_ == null) {
        ensurePortalSegmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, portalSegments_);
        onChanged();
      } else {
        portalSegmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder clearPortalSegments() {
      if (portalSegmentsBuilder_ == null) {
        portalSegments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        portalSegmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public Builder removePortalSegments(int index) {
      if (portalSegmentsBuilder_ == null) {
        ensurePortalSegmentsIsMutable();
        portalSegments_.remove(index);
        onChanged();
      } else {
        portalSegmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder getPortalSegmentsBuilder(
        int index) {
      return getPortalSegmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegmentOrBuilder getPortalSegmentsOrBuilder(
        int index) {
      if (portalSegmentsBuilder_ == null) {
        return portalSegments_.get(index);  } else {
        return portalSegmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegmentOrBuilder> 
         getPortalSegmentsOrBuilderList() {
      if (portalSegmentsBuilder_ != null) {
        return portalSegmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(portalSegments_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder addPortalSegmentsBuilder() {
      return getPortalSegmentsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder addPortalSegmentsBuilder(
        int index) {
      return getPortalSegmentsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.integrations.PortalSegment portal_segments = 1 [json_name = "portalSegments"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder> 
         getPortalSegmentsBuilderList() {
      return getPortalSegmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegmentOrBuilder> 
        getPortalSegmentsFieldBuilder() {
      if (portalSegmentsBuilder_ == null) {
        portalSegmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegment.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegmentOrBuilder>(
                portalSegments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        portalSegments_ = null;
      }
      return portalSegmentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.PortalSegments)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.PortalSegments)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PortalSegments>
      PARSER = new com.google.protobuf.AbstractParser<PortalSegments>() {
    @java.lang.Override
    public PortalSegments parsePartialFrom(
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

  public static com.google.protobuf.Parser<PortalSegments> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PortalSegments> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PortalSegments getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
