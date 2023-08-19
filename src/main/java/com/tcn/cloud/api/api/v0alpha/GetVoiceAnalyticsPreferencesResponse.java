// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response for GetVoiceAnalyticsPreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.GetVoiceAnalyticsPreferencesResponse}
 */
public final class GetVoiceAnalyticsPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetVoiceAnalyticsPreferencesResponse)
    GetVoiceAnalyticsPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetVoiceAnalyticsPreferencesResponse.newBuilder() to construct.
  private GetVoiceAnalyticsPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetVoiceAnalyticsPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetVoiceAnalyticsPreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetVoiceAnalyticsPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetVoiceAnalyticsPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int VOICE_ANALYTICS_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences voiceAnalyticsPreferences_;
  /**
   * <pre>
   * Voice analytics preferences object
   * </pre>
   *
   * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
   * @return Whether the voiceAnalyticsPreferences field is set.
   */
  @java.lang.Override
  public boolean hasVoiceAnalyticsPreferences() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Voice analytics preferences object
   * </pre>
   *
   * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
   * @return The voiceAnalyticsPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences getVoiceAnalyticsPreferences() {
    return voiceAnalyticsPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.getDefaultInstance() : voiceAnalyticsPreferences_;
  }
  /**
   * <pre>
   * Voice analytics preferences object
   * </pre>
   *
   * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferencesOrBuilder getVoiceAnalyticsPreferencesOrBuilder() {
    return voiceAnalyticsPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.getDefaultInstance() : voiceAnalyticsPreferences_;
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
      output.writeMessage(1, getVoiceAnalyticsPreferences());
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
        .computeMessageSize(1, getVoiceAnalyticsPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse other = (com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse) obj;

    if (hasVoiceAnalyticsPreferences() != other.hasVoiceAnalyticsPreferences()) return false;
    if (hasVoiceAnalyticsPreferences()) {
      if (!getVoiceAnalyticsPreferences()
          .equals(other.getVoiceAnalyticsPreferences())) return false;
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
    if (hasVoiceAnalyticsPreferences()) {
      hash = (37 * hash) + VOICE_ANALYTICS_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getVoiceAnalyticsPreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse prototype) {
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
   * Response for GetVoiceAnalyticsPreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.GetVoiceAnalyticsPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetVoiceAnalyticsPreferencesResponse)
      com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetVoiceAnalyticsPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetVoiceAnalyticsPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.newBuilder()
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
        getVoiceAnalyticsPreferencesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      voiceAnalyticsPreferences_ = null;
      if (voiceAnalyticsPreferencesBuilder_ != null) {
        voiceAnalyticsPreferencesBuilder_.dispose();
        voiceAnalyticsPreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetVoiceAnalyticsPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse result = new com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.voiceAnalyticsPreferences_ = voiceAnalyticsPreferencesBuilder_ == null
            ? voiceAnalyticsPreferences_
            : voiceAnalyticsPreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasVoiceAnalyticsPreferences()) {
        mergeVoiceAnalyticsPreferences(other.getVoiceAnalyticsPreferences());
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
                  getVoiceAnalyticsPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences voiceAnalyticsPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences, com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.Builder, com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferencesOrBuilder> voiceAnalyticsPreferencesBuilder_;
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     * @return Whether the voiceAnalyticsPreferences field is set.
     */
    public boolean hasVoiceAnalyticsPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     * @return The voiceAnalyticsPreferences.
     */
    public com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences getVoiceAnalyticsPreferences() {
      if (voiceAnalyticsPreferencesBuilder_ == null) {
        return voiceAnalyticsPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.getDefaultInstance() : voiceAnalyticsPreferences_;
      } else {
        return voiceAnalyticsPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     */
    public Builder setVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences value) {
      if (voiceAnalyticsPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        voiceAnalyticsPreferences_ = value;
      } else {
        voiceAnalyticsPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     */
    public Builder setVoiceAnalyticsPreferences(
        com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.Builder builderForValue) {
      if (voiceAnalyticsPreferencesBuilder_ == null) {
        voiceAnalyticsPreferences_ = builderForValue.build();
      } else {
        voiceAnalyticsPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     */
    public Builder mergeVoiceAnalyticsPreferences(com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences value) {
      if (voiceAnalyticsPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          voiceAnalyticsPreferences_ != null &&
          voiceAnalyticsPreferences_ != com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.getDefaultInstance()) {
          getVoiceAnalyticsPreferencesBuilder().mergeFrom(value);
        } else {
          voiceAnalyticsPreferences_ = value;
        }
      } else {
        voiceAnalyticsPreferencesBuilder_.mergeFrom(value);
      }
      if (voiceAnalyticsPreferences_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     */
    public Builder clearVoiceAnalyticsPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      voiceAnalyticsPreferences_ = null;
      if (voiceAnalyticsPreferencesBuilder_ != null) {
        voiceAnalyticsPreferencesBuilder_.dispose();
        voiceAnalyticsPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.Builder getVoiceAnalyticsPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getVoiceAnalyticsPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferencesOrBuilder getVoiceAnalyticsPreferencesOrBuilder() {
      if (voiceAnalyticsPreferencesBuilder_ != null) {
        return voiceAnalyticsPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return voiceAnalyticsPreferences_ == null ?
            com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.getDefaultInstance() : voiceAnalyticsPreferences_;
      }
    }
    /**
     * <pre>
     * Voice analytics preferences object
     * </pre>
     *
     * <code>.api.v0alpha.VoiceAnalyticsPreferences voice_analytics_preferences = 1 [json_name = "voiceAnalyticsPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences, com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.Builder, com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferencesOrBuilder> 
        getVoiceAnalyticsPreferencesFieldBuilder() {
      if (voiceAnalyticsPreferencesBuilder_ == null) {
        voiceAnalyticsPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences, com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferences.Builder, com.tcn.cloud.api.api.v0alpha.VoiceAnalyticsPreferencesOrBuilder>(
                getVoiceAnalyticsPreferences(),
                getParentForChildren(),
                isClean());
        voiceAnalyticsPreferences_ = null;
      }
      return voiceAnalyticsPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetVoiceAnalyticsPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetVoiceAnalyticsPreferencesResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetVoiceAnalyticsPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetVoiceAnalyticsPreferencesResponse>() {
    @java.lang.Override
    public GetVoiceAnalyticsPreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetVoiceAnalyticsPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetVoiceAnalyticsPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetVoiceAnalyticsPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

