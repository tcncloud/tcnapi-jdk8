// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

/**
 * <pre>
 * Response message for the UpdateSoundboard RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.soundboard.UpdateSoundboardRes}
 */
public final class UpdateSoundboardRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.soundboard.UpdateSoundboardRes)
    UpdateSoundboardResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateSoundboardRes.newBuilder() to construct.
  private UpdateSoundboardRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateSoundboardRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateSoundboardRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_UpdateSoundboardRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_UpdateSoundboardRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.class, com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.Builder.class);
  }

  public static final int SOUNDBOARD_ID_FIELD_NUMBER = 1;
  private long soundboardId_ = 0L;
  /**
   * <pre>
   * ID of the soundboard which was updated.
   * </pre>
   *
   * <code>int64 soundboard_id = 1 [json_name = "soundboardId", jstype = JS_STRING];</code>
   * @return The soundboardId.
   */
  @java.lang.Override
  public long getSoundboardId() {
    return soundboardId_;
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
    if (soundboardId_ != 0L) {
      output.writeInt64(1, soundboardId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (soundboardId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, soundboardId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes other = (com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes) obj;

    if (getSoundboardId()
        != other.getSoundboardId()) return false;
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
    hash = (37 * hash) + SOUNDBOARD_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSoundboardId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes prototype) {
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
   * Response message for the UpdateSoundboard RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.soundboard.UpdateSoundboardRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.soundboard.UpdateSoundboardRes)
      com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_UpdateSoundboardRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_UpdateSoundboardRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.class, com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.newBuilder()
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
      soundboardId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_UpdateSoundboardRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes build() {
      com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes result = new com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.soundboardId_ = soundboardId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes.getDefaultInstance()) return this;
      if (other.getSoundboardId() != 0L) {
        setSoundboardId(other.getSoundboardId());
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
              soundboardId_ = input.readInt64();
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

    private long soundboardId_ ;
    /**
     * <pre>
     * ID of the soundboard which was updated.
     * </pre>
     *
     * <code>int64 soundboard_id = 1 [json_name = "soundboardId", jstype = JS_STRING];</code>
     * @return The soundboardId.
     */
    @java.lang.Override
    public long getSoundboardId() {
      return soundboardId_;
    }
    /**
     * <pre>
     * ID of the soundboard which was updated.
     * </pre>
     *
     * <code>int64 soundboard_id = 1 [json_name = "soundboardId", jstype = JS_STRING];</code>
     * @param value The soundboardId to set.
     * @return This builder for chaining.
     */
    public Builder setSoundboardId(long value) {

      soundboardId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the soundboard which was updated.
     * </pre>
     *
     * <code>int64 soundboard_id = 1 [json_name = "soundboardId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearSoundboardId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      soundboardId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.soundboard.UpdateSoundboardRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.soundboard.UpdateSoundboardRes)
  private static final com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSoundboardRes>
      PARSER = new com.google.protobuf.AbstractParser<UpdateSoundboardRes>() {
    @java.lang.Override
    public UpdateSoundboardRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSoundboardRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSoundboardRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.soundboard.UpdateSoundboardRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

