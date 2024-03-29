// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the CreateTourPattern RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes}
 */
public final class CreateTourShiftSegmentConfigRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes)
    CreateTourShiftSegmentConfigResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTourShiftSegmentConfigRes.newBuilder() to construct.
  private CreateTourShiftSegmentConfigRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTourShiftSegmentConfigRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTourShiftSegmentConfigRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourShiftSegmentConfigRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourShiftSegmentConfigRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes.Builder.class);
  }

  public static final int TOUR_SHIFT_SEGMENT_CONFIG_SID_FIELD_NUMBER = 1;
  private long tourShiftSegmentConfigSid_ = 0L;
  /**
   * <pre>
   * ID of the newly created Tour shift Segment Config.
   * </pre>
   *
   * <code>int64 tour_shift_segment_config_sid = 1 [json_name = "tourShiftSegmentConfigSid", jstype = JS_STRING];</code>
   * @return The tourShiftSegmentConfigSid.
   */
  @java.lang.Override
  public long getTourShiftSegmentConfigSid() {
    return tourShiftSegmentConfigSid_;
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
    if (tourShiftSegmentConfigSid_ != 0L) {
      output.writeInt64(1, tourShiftSegmentConfigSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tourShiftSegmentConfigSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, tourShiftSegmentConfigSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes) obj;

    if (getTourShiftSegmentConfigSid()
        != other.getTourShiftSegmentConfigSid()) return false;
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
    hash = (37 * hash) + TOUR_SHIFT_SEGMENT_CONFIG_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTourShiftSegmentConfigSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes prototype) {
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
   * Response message for the CreateTourPattern RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourShiftSegmentConfigRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourShiftSegmentConfigRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes.newBuilder()
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
      tourShiftSegmentConfigSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateTourShiftSegmentConfigRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tourShiftSegmentConfigSid_ = tourShiftSegmentConfigSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes.getDefaultInstance()) return this;
      if (other.getTourShiftSegmentConfigSid() != 0L) {
        setTourShiftSegmentConfigSid(other.getTourShiftSegmentConfigSid());
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
              tourShiftSegmentConfigSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long tourShiftSegmentConfigSid_ ;
    /**
     * <pre>
     * ID of the newly created Tour shift Segment Config.
     * </pre>
     *
     * <code>int64 tour_shift_segment_config_sid = 1 [json_name = "tourShiftSegmentConfigSid", jstype = JS_STRING];</code>
     * @return The tourShiftSegmentConfigSid.
     */
    @java.lang.Override
    public long getTourShiftSegmentConfigSid() {
      return tourShiftSegmentConfigSid_;
    }
    /**
     * <pre>
     * ID of the newly created Tour shift Segment Config.
     * </pre>
     *
     * <code>int64 tour_shift_segment_config_sid = 1 [json_name = "tourShiftSegmentConfigSid", jstype = JS_STRING];</code>
     * @param value The tourShiftSegmentConfigSid to set.
     * @return This builder for chaining.
     */
    public Builder setTourShiftSegmentConfigSid(long value) {

      tourShiftSegmentConfigSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the newly created Tour shift Segment Config.
     * </pre>
     *
     * <code>int64 tour_shift_segment_config_sid = 1 [json_name = "tourShiftSegmentConfigSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearTourShiftSegmentConfigSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tourShiftSegmentConfigSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTourShiftSegmentConfigRes>
      PARSER = new com.google.protobuf.AbstractParser<CreateTourShiftSegmentConfigRes>() {
    @java.lang.Override
    public CreateTourShiftSegmentConfigRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTourShiftSegmentConfigRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTourShiftSegmentConfigRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateTourShiftSegmentConfigRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

