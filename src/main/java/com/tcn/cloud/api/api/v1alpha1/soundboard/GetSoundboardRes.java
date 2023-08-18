// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

/**
 * <pre>
 * Response message for the GetSoundboard RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.soundboard.GetSoundboardRes}
 */
public final class GetSoundboardRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.soundboard.GetSoundboardRes)
    GetSoundboardResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSoundboardRes.newBuilder() to construct.
  private GetSoundboardRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSoundboardRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSoundboardRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes.class, com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes.Builder.class);
  }

  private int bitField0_;
  public static final int SOUNDBOARD_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails soundboard_;
  /**
   * <pre>
   * Metadata of the soundboard.
   * </pre>
   *
   * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
   * @return Whether the soundboard field is set.
   */
  @java.lang.Override
  public boolean hasSoundboard() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Metadata of the soundboard.
   * </pre>
   *
   * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
   * @return The soundboard.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails getSoundboard() {
    return soundboard_ == null ? com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.getDefaultInstance() : soundboard_;
  }
  /**
   * <pre>
   * Metadata of the soundboard.
   * </pre>
   *
   * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder getSoundboardOrBuilder() {
    return soundboard_ == null ? com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.getDefaultInstance() : soundboard_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSoundboard());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSoundboard());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes other = (com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes) obj;

    if (hasSoundboard() != other.hasSoundboard()) return false;
    if (hasSoundboard()) {
      if (!getSoundboard()
          .equals(other.getSoundboard())) return false;
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
    if (hasSoundboard()) {
      hash = (37 * hash) + SOUNDBOARD_FIELD_NUMBER;
      hash = (53 * hash) + getSoundboard().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes prototype) {
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
   * Response message for the GetSoundboard RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.soundboard.GetSoundboardRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.soundboard.GetSoundboardRes)
      com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes.class, com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSoundboardFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      soundboard_ = null;
      if (soundboardBuilder_ != null) {
        soundboardBuilder_.dispose();
        soundboardBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes build() {
      com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes result = new com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.soundboard_ = soundboardBuilder_ == null
            ? soundboard_
            : soundboardBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes.getDefaultInstance()) return this;
      if (other.hasSoundboard()) {
        mergeSoundboard(other.getSoundboard());
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
                  getSoundboardFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails soundboard_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails, com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.Builder, com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder> soundboardBuilder_;
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     * @return Whether the soundboard field is set.
     */
    public boolean hasSoundboard() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     * @return The soundboard.
     */
    public com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails getSoundboard() {
      if (soundboardBuilder_ == null) {
        return soundboard_ == null ? com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.getDefaultInstance() : soundboard_;
      } else {
        return soundboardBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     */
    public Builder setSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails value) {
      if (soundboardBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        soundboard_ = value;
      } else {
        soundboardBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     */
    public Builder setSoundboard(
        com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.Builder builderForValue) {
      if (soundboardBuilder_ == null) {
        soundboard_ = builderForValue.build();
      } else {
        soundboardBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     */
    public Builder mergeSoundboard(com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails value) {
      if (soundboardBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          soundboard_ != null &&
          soundboard_ != com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.getDefaultInstance()) {
          getSoundboardBuilder().mergeFrom(value);
        } else {
          soundboard_ = value;
        }
      } else {
        soundboardBuilder_.mergeFrom(value);
      }
      if (soundboard_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     */
    public Builder clearSoundboard() {
      bitField0_ = (bitField0_ & ~0x00000001);
      soundboard_ = null;
      if (soundboardBuilder_ != null) {
        soundboardBuilder_.dispose();
        soundboardBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.Builder getSoundboardBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSoundboardFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder getSoundboardOrBuilder() {
      if (soundboardBuilder_ != null) {
        return soundboardBuilder_.getMessageOrBuilder();
      } else {
        return soundboard_ == null ?
            com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.getDefaultInstance() : soundboard_;
      }
    }
    /**
     * <pre>
     * Metadata of the soundboard.
     * </pre>
     *
     * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails, com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.Builder, com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder> 
        getSoundboardFieldBuilder() {
      if (soundboardBuilder_ == null) {
        soundboardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails, com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.Builder, com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder>(
                getSoundboard(),
                getParentForChildren(),
                isClean());
        soundboard_ = null;
      }
      return soundboardBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.soundboard.GetSoundboardRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.soundboard.GetSoundboardRes)
  private static final com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSoundboardRes>
      PARSER = new com.google.protobuf.AbstractParser<GetSoundboardRes>() {
    @java.lang.Override
    public GetSoundboardRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSoundboardRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSoundboardRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

