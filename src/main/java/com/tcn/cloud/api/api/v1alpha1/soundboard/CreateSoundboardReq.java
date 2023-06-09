// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

/**
 * <pre>
 * Request message for the CreateSoundboard RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.soundboard.CreateSoundboardReq}
 */
public final class CreateSoundboardReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.soundboard.CreateSoundboardReq)
    CreateSoundboardReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSoundboardReq.newBuilder() to construct.
  private CreateSoundboardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSoundboardReq() {
    ftsId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSoundboardReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_CreateSoundboardReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_CreateSoundboardReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.class, com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.Builder.class);
  }

  public static final int SOUNDBOARD_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails soundboard_;
  /**
   * <pre>
   * The metadata of the soundboard.
   * </pre>
   *
   * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
   * @return Whether the soundboard field is set.
   */
  @java.lang.Override
  public boolean hasSoundboard() {
    return soundboard_ != null;
  }
  /**
   * <pre>
   * The metadata of the soundboard.
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
   * The metadata of the soundboard.
   * </pre>
   *
   * <code>.api.v1alpha1.soundboard.SoundboardDetails soundboard = 1 [json_name = "soundboard"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder getSoundboardOrBuilder() {
    return soundboard_ == null ? com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.getDefaultInstance() : soundboard_;
  }

  public static final int FTS_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ftsId_ = "";
  /**
   * <pre>
   * The generated ID received from fts.GetUploadFileUrl.
   * </pre>
   *
   * <code>string fts_id = 2 [json_name = "ftsId"];</code>
   * @return The ftsId.
   */
  @java.lang.Override
  public java.lang.String getFtsId() {
    java.lang.Object ref = ftsId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ftsId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The generated ID received from fts.GetUploadFileUrl.
   * </pre>
   *
   * <code>string fts_id = 2 [json_name = "ftsId"];</code>
   * @return The bytes for ftsId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFtsIdBytes() {
    java.lang.Object ref = ftsId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ftsId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (soundboard_ != null) {
      output.writeMessage(1, getSoundboard());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ftsId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ftsId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (soundboard_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSoundboard());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ftsId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ftsId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq other = (com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq) obj;

    if (hasSoundboard() != other.hasSoundboard()) return false;
    if (hasSoundboard()) {
      if (!getSoundboard()
          .equals(other.getSoundboard())) return false;
    }
    if (!getFtsId()
        .equals(other.getFtsId())) return false;
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
    hash = (37 * hash) + FTS_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFtsId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq prototype) {
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
   * Request message for the CreateSoundboard RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.soundboard.CreateSoundboardReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.soundboard.CreateSoundboardReq)
      com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_CreateSoundboardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_CreateSoundboardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.class, com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.newBuilder()
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
      soundboard_ = null;
      if (soundboardBuilder_ != null) {
        soundboardBuilder_.dispose();
        soundboardBuilder_ = null;
      }
      ftsId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_CreateSoundboardReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq build() {
      com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq result = new com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.soundboard_ = soundboardBuilder_ == null
            ? soundboard_
            : soundboardBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ftsId_ = ftsId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq.getDefaultInstance()) return this;
      if (other.hasSoundboard()) {
        mergeSoundboard(other.getSoundboard());
      }
      if (!other.getFtsId().isEmpty()) {
        ftsId_ = other.ftsId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 18: {
              ftsId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails soundboard_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails, com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetails.Builder, com.tcn.cloud.api.api.v1alpha1.soundboard.SoundboardDetailsOrBuilder> soundboardBuilder_;
    /**
     * <pre>
     * The metadata of the soundboard.
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
     * The metadata of the soundboard.
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
     * The metadata of the soundboard.
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
     * The metadata of the soundboard.
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
     * The metadata of the soundboard.
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The metadata of the soundboard.
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
     * The metadata of the soundboard.
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
     * The metadata of the soundboard.
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
     * The metadata of the soundboard.
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

    private java.lang.Object ftsId_ = "";
    /**
     * <pre>
     * The generated ID received from fts.GetUploadFileUrl.
     * </pre>
     *
     * <code>string fts_id = 2 [json_name = "ftsId"];</code>
     * @return The ftsId.
     */
    public java.lang.String getFtsId() {
      java.lang.Object ref = ftsId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ftsId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The generated ID received from fts.GetUploadFileUrl.
     * </pre>
     *
     * <code>string fts_id = 2 [json_name = "ftsId"];</code>
     * @return The bytes for ftsId.
     */
    public com.google.protobuf.ByteString
        getFtsIdBytes() {
      java.lang.Object ref = ftsId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ftsId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The generated ID received from fts.GetUploadFileUrl.
     * </pre>
     *
     * <code>string fts_id = 2 [json_name = "ftsId"];</code>
     * @param value The ftsId to set.
     * @return This builder for chaining.
     */
    public Builder setFtsId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ftsId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated ID received from fts.GetUploadFileUrl.
     * </pre>
     *
     * <code>string fts_id = 2 [json_name = "ftsId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFtsId() {
      ftsId_ = getDefaultInstance().getFtsId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The generated ID received from fts.GetUploadFileUrl.
     * </pre>
     *
     * <code>string fts_id = 2 [json_name = "ftsId"];</code>
     * @param value The bytes for ftsId to set.
     * @return This builder for chaining.
     */
    public Builder setFtsIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ftsId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.soundboard.CreateSoundboardReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.soundboard.CreateSoundboardReq)
  private static final com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSoundboardReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateSoundboardReq>() {
    @java.lang.Override
    public CreateSoundboardReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSoundboardReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSoundboardReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.soundboard.CreateSoundboardReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

