// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/soundboard/entities.proto

package com.tcn.cloud.api.api.v1alpha1.soundboard;

/**
 * <pre>
 * Response message for the GetSoundboardFile RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.soundboard.GetSoundboardFileRes}
 */
public final class GetSoundboardFileRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.soundboard.GetSoundboardFileRes)
    GetSoundboardFileResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSoundboardFileRes.newBuilder() to construct.
  private GetSoundboardFileRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSoundboardFileRes() {
    soundboardFile_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSoundboardFileRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardFileRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardFileRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.class, com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.Builder.class);
  }

  public static final int SOUNDBOARD_FILE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString soundboardFile_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Segments of the audio file, sent in 3mb chunks.
   * </pre>
   *
   * <code>bytes soundboard_file = 1 [json_name = "soundboardFile"];</code>
   * @return The soundboardFile.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSoundboardFile() {
    return soundboardFile_;
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
    if (!soundboardFile_.isEmpty()) {
      output.writeBytes(1, soundboardFile_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!soundboardFile_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, soundboardFile_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes other = (com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes) obj;

    if (!getSoundboardFile()
        .equals(other.getSoundboardFile())) return false;
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
    hash = (37 * hash) + SOUNDBOARD_FILE_FIELD_NUMBER;
    hash = (53 * hash) + getSoundboardFile().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes prototype) {
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
   * Response message for the GetSoundboardFile RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.soundboard.GetSoundboardFileRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.soundboard.GetSoundboardFileRes)
      com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardFileRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardFileRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.class, com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.newBuilder()
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
      soundboardFile_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.EntitiesProto.internal_static_api_v1alpha1_soundboard_GetSoundboardFileRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes build() {
      com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes result = new com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.soundboardFile_ = soundboardFile_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes.getDefaultInstance()) return this;
      if (other.getSoundboardFile() != com.google.protobuf.ByteString.EMPTY) {
        setSoundboardFile(other.getSoundboardFile());
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
              soundboardFile_ = input.readBytes();
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

    private com.google.protobuf.ByteString soundboardFile_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Segments of the audio file, sent in 3mb chunks.
     * </pre>
     *
     * <code>bytes soundboard_file = 1 [json_name = "soundboardFile"];</code>
     * @return The soundboardFile.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSoundboardFile() {
      return soundboardFile_;
    }
    /**
     * <pre>
     * Segments of the audio file, sent in 3mb chunks.
     * </pre>
     *
     * <code>bytes soundboard_file = 1 [json_name = "soundboardFile"];</code>
     * @param value The soundboardFile to set.
     * @return This builder for chaining.
     */
    public Builder setSoundboardFile(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      soundboardFile_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Segments of the audio file, sent in 3mb chunks.
     * </pre>
     *
     * <code>bytes soundboard_file = 1 [json_name = "soundboardFile"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSoundboardFile() {
      bitField0_ = (bitField0_ & ~0x00000001);
      soundboardFile_ = getDefaultInstance().getSoundboardFile();
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.soundboard.GetSoundboardFileRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.soundboard.GetSoundboardFileRes)
  private static final com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSoundboardFileRes>
      PARSER = new com.google.protobuf.AbstractParser<GetSoundboardFileRes>() {
    @java.lang.Override
    public GetSoundboardFileRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSoundboardFileRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSoundboardFileRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.soundboard.GetSoundboardFileRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

