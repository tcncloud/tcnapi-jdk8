// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the UpsertHistoricalDataDelta RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq}
 */
public final class UpsertHistoricalDataDeltaReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq)
    UpsertHistoricalDataDeltaReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpsertHistoricalDataDeltaReq.newBuilder() to construct.
  private UpsertHistoricalDataDeltaReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpsertHistoricalDataDeltaReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpsertHistoricalDataDeltaReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertHistoricalDataDeltaReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertHistoricalDataDeltaReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.Builder.class);
  }

  public static final int DELTA_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval delta_;
  /**
   * <pre>
   * Training data delta to create/update.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
   * @return Whether the delta field is set.
   */
  @java.lang.Override
  public boolean hasDelta() {
    return delta_ != null;
  }
  /**
   * <pre>
   * Training data delta to create/update.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
   * @return The delta.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval getDelta() {
    return delta_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.getDefaultInstance() : delta_;
  }
  /**
   * <pre>
   * Training data delta to create/update.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataIntervalOrBuilder getDeltaOrBuilder() {
    return delta_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.getDefaultInstance() : delta_;
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
    if (delta_ != null) {
      output.writeMessage(1, getDelta());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (delta_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDelta());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq) obj;

    if (hasDelta() != other.hasDelta()) return false;
    if (hasDelta()) {
      if (!getDelta()
          .equals(other.getDelta())) return false;
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
    if (hasDelta()) {
      hash = (37 * hash) + DELTA_FIELD_NUMBER;
      hash = (53 * hash) + getDelta().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq prototype) {
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
   * Request message for the UpsertHistoricalDataDelta RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertHistoricalDataDeltaReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertHistoricalDataDeltaReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.newBuilder()
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
      delta_ = null;
      if (deltaBuilder_ != null) {
        deltaBuilder_.dispose();
        deltaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertHistoricalDataDeltaReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.delta_ = deltaBuilder_ == null
            ? delta_
            : deltaBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq.getDefaultInstance()) return this;
      if (other.hasDelta()) {
        mergeDelta(other.getDelta());
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
                  getDeltaFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval delta_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval, com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataIntervalOrBuilder> deltaBuilder_;
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     * @return Whether the delta field is set.
     */
    public boolean hasDelta() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     * @return The delta.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval getDelta() {
      if (deltaBuilder_ == null) {
        return delta_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.getDefaultInstance() : delta_;
      } else {
        return deltaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     */
    public Builder setDelta(com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval value) {
      if (deltaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        delta_ = value;
      } else {
        deltaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     */
    public Builder setDelta(
        com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.Builder builderForValue) {
      if (deltaBuilder_ == null) {
        delta_ = builderForValue.build();
      } else {
        deltaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     */
    public Builder mergeDelta(com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval value) {
      if (deltaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          delta_ != null &&
          delta_ != com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.getDefaultInstance()) {
          getDeltaBuilder().mergeFrom(value);
        } else {
          delta_ = value;
        }
      } else {
        deltaBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     */
    public Builder clearDelta() {
      bitField0_ = (bitField0_ & ~0x00000001);
      delta_ = null;
      if (deltaBuilder_ != null) {
        deltaBuilder_.dispose();
        deltaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.Builder getDeltaBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeltaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataIntervalOrBuilder getDeltaOrBuilder() {
      if (deltaBuilder_ != null) {
        return deltaBuilder_.getMessageOrBuilder();
      } else {
        return delta_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.getDefaultInstance() : delta_;
      }
    }
    /**
     * <pre>
     * Training data delta to create/update.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.HistoricalDataInterval delta = 1 [json_name = "delta"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval, com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataIntervalOrBuilder> 
        getDeltaFieldBuilder() {
      if (deltaBuilder_ == null) {
        deltaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval, com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataInterval.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.HistoricalDataIntervalOrBuilder>(
                getDelta(),
                getParentForChildren(),
                isClean());
        delta_ = null;
      }
      return deltaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpsertHistoricalDataDeltaReq>
      PARSER = new com.google.protobuf.AbstractParser<UpsertHistoricalDataDeltaReq>() {
    @java.lang.Override
    public UpsertHistoricalDataDeltaReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpsertHistoricalDataDeltaReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpsertHistoricalDataDeltaReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertHistoricalDataDeltaReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

