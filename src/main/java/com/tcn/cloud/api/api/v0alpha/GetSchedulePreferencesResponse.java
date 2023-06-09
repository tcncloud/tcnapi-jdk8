// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response for GetSchedulePreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.GetSchedulePreferencesResponse}
 */
public final class GetSchedulePreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetSchedulePreferencesResponse)
    GetSchedulePreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSchedulePreferencesResponse.newBuilder() to construct.
  private GetSchedulePreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSchedulePreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSchedulePreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSchedulePreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSchedulePreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.Builder.class);
  }

  public static final int SCHEDULE_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.SchedulePreferences schedulePreferences_;
  /**
   * <pre>
   * Schedule preferences object
   * </pre>
   *
   * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
   * @return Whether the schedulePreferences field is set.
   */
  @java.lang.Override
  public boolean hasSchedulePreferences() {
    return schedulePreferences_ != null;
  }
  /**
   * <pre>
   * Schedule preferences object
   * </pre>
   *
   * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
   * @return The schedulePreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SchedulePreferences getSchedulePreferences() {
    return schedulePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.SchedulePreferences.getDefaultInstance() : schedulePreferences_;
  }
  /**
   * <pre>
   * Schedule preferences object
   * </pre>
   *
   * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SchedulePreferencesOrBuilder getSchedulePreferencesOrBuilder() {
    return schedulePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.SchedulePreferences.getDefaultInstance() : schedulePreferences_;
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
    if (schedulePreferences_ != null) {
      output.writeMessage(1, getSchedulePreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (schedulePreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSchedulePreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse other = (com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse) obj;

    if (hasSchedulePreferences() != other.hasSchedulePreferences()) return false;
    if (hasSchedulePreferences()) {
      if (!getSchedulePreferences()
          .equals(other.getSchedulePreferences())) return false;
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
    if (hasSchedulePreferences()) {
      hash = (37 * hash) + SCHEDULE_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getSchedulePreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse prototype) {
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
   * Response for GetSchedulePreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.GetSchedulePreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetSchedulePreferencesResponse)
      com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSchedulePreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSchedulePreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.newBuilder()
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
      schedulePreferences_ = null;
      if (schedulePreferencesBuilder_ != null) {
        schedulePreferencesBuilder_.dispose();
        schedulePreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSchedulePreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse result = new com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schedulePreferences_ = schedulePreferencesBuilder_ == null
            ? schedulePreferences_
            : schedulePreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse.getDefaultInstance()) return this;
      if (other.hasSchedulePreferences()) {
        mergeSchedulePreferences(other.getSchedulePreferences());
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
                  getSchedulePreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.SchedulePreferences schedulePreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SchedulePreferences, com.tcn.cloud.api.api.v0alpha.SchedulePreferences.Builder, com.tcn.cloud.api.api.v0alpha.SchedulePreferencesOrBuilder> schedulePreferencesBuilder_;
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     * @return Whether the schedulePreferences field is set.
     */
    public boolean hasSchedulePreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     * @return The schedulePreferences.
     */
    public com.tcn.cloud.api.api.v0alpha.SchedulePreferences getSchedulePreferences() {
      if (schedulePreferencesBuilder_ == null) {
        return schedulePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.SchedulePreferences.getDefaultInstance() : schedulePreferences_;
      } else {
        return schedulePreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     */
    public Builder setSchedulePreferences(com.tcn.cloud.api.api.v0alpha.SchedulePreferences value) {
      if (schedulePreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        schedulePreferences_ = value;
      } else {
        schedulePreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     */
    public Builder setSchedulePreferences(
        com.tcn.cloud.api.api.v0alpha.SchedulePreferences.Builder builderForValue) {
      if (schedulePreferencesBuilder_ == null) {
        schedulePreferences_ = builderForValue.build();
      } else {
        schedulePreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     */
    public Builder mergeSchedulePreferences(com.tcn.cloud.api.api.v0alpha.SchedulePreferences value) {
      if (schedulePreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          schedulePreferences_ != null &&
          schedulePreferences_ != com.tcn.cloud.api.api.v0alpha.SchedulePreferences.getDefaultInstance()) {
          getSchedulePreferencesBuilder().mergeFrom(value);
        } else {
          schedulePreferences_ = value;
        }
      } else {
        schedulePreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     */
    public Builder clearSchedulePreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      schedulePreferences_ = null;
      if (schedulePreferencesBuilder_ != null) {
        schedulePreferencesBuilder_.dispose();
        schedulePreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SchedulePreferences.Builder getSchedulePreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSchedulePreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SchedulePreferencesOrBuilder getSchedulePreferencesOrBuilder() {
      if (schedulePreferencesBuilder_ != null) {
        return schedulePreferencesBuilder_.getMessageOrBuilder();
      } else {
        return schedulePreferences_ == null ?
            com.tcn.cloud.api.api.v0alpha.SchedulePreferences.getDefaultInstance() : schedulePreferences_;
      }
    }
    /**
     * <pre>
     * Schedule preferences object
     * </pre>
     *
     * <code>.api.v0alpha.SchedulePreferences schedule_preferences = 1 [json_name = "schedulePreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SchedulePreferences, com.tcn.cloud.api.api.v0alpha.SchedulePreferences.Builder, com.tcn.cloud.api.api.v0alpha.SchedulePreferencesOrBuilder> 
        getSchedulePreferencesFieldBuilder() {
      if (schedulePreferencesBuilder_ == null) {
        schedulePreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SchedulePreferences, com.tcn.cloud.api.api.v0alpha.SchedulePreferences.Builder, com.tcn.cloud.api.api.v0alpha.SchedulePreferencesOrBuilder>(
                getSchedulePreferences(),
                getParentForChildren(),
                isClean());
        schedulePreferences_ = null;
      }
      return schedulePreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetSchedulePreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetSchedulePreferencesResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSchedulePreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSchedulePreferencesResponse>() {
    @java.lang.Override
    public GetSchedulePreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSchedulePreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSchedulePreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetSchedulePreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

