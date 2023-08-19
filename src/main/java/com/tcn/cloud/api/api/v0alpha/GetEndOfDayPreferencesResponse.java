// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response for GetEndOfDayPreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.GetEndOfDayPreferencesResponse}
 */
public final class GetEndOfDayPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetEndOfDayPreferencesResponse)
    GetEndOfDayPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEndOfDayPreferencesResponse.newBuilder() to construct.
  private GetEndOfDayPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEndOfDayPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEndOfDayPreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetEndOfDayPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetEndOfDayPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int END_OF_DAY_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences endOfDayPreferences_;
  /**
   * <pre>
   * EndOfDay preferences object
   * </pre>
   *
   * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
   * @return Whether the endOfDayPreferences field is set.
   */
  @java.lang.Override
  public boolean hasEndOfDayPreferences() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * EndOfDay preferences object
   * </pre>
   *
   * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
   * @return The endOfDayPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences getEndOfDayPreferences() {
    return endOfDayPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.getDefaultInstance() : endOfDayPreferences_;
  }
  /**
   * <pre>
   * EndOfDay preferences object
   * </pre>
   *
   * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.EndOfDayPreferencesOrBuilder getEndOfDayPreferencesOrBuilder() {
    return endOfDayPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.getDefaultInstance() : endOfDayPreferences_;
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
      output.writeMessage(1, getEndOfDayPreferences());
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
        .computeMessageSize(1, getEndOfDayPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse other = (com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse) obj;

    if (hasEndOfDayPreferences() != other.hasEndOfDayPreferences()) return false;
    if (hasEndOfDayPreferences()) {
      if (!getEndOfDayPreferences()
          .equals(other.getEndOfDayPreferences())) return false;
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
    if (hasEndOfDayPreferences()) {
      hash = (37 * hash) + END_OF_DAY_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getEndOfDayPreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse prototype) {
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
   * Response for GetEndOfDayPreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.GetEndOfDayPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetEndOfDayPreferencesResponse)
      com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetEndOfDayPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetEndOfDayPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.newBuilder()
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
        getEndOfDayPreferencesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      endOfDayPreferences_ = null;
      if (endOfDayPreferencesBuilder_ != null) {
        endOfDayPreferencesBuilder_.dispose();
        endOfDayPreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetEndOfDayPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse result = new com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.endOfDayPreferences_ = endOfDayPreferencesBuilder_ == null
            ? endOfDayPreferences_
            : endOfDayPreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasEndOfDayPreferences()) {
        mergeEndOfDayPreferences(other.getEndOfDayPreferences());
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
                  getEndOfDayPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences endOfDayPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences, com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.Builder, com.tcn.cloud.api.api.v0alpha.EndOfDayPreferencesOrBuilder> endOfDayPreferencesBuilder_;
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     * @return Whether the endOfDayPreferences field is set.
     */
    public boolean hasEndOfDayPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     * @return The endOfDayPreferences.
     */
    public com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences getEndOfDayPreferences() {
      if (endOfDayPreferencesBuilder_ == null) {
        return endOfDayPreferences_ == null ? com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.getDefaultInstance() : endOfDayPreferences_;
      } else {
        return endOfDayPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     */
    public Builder setEndOfDayPreferences(com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences value) {
      if (endOfDayPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endOfDayPreferences_ = value;
      } else {
        endOfDayPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     */
    public Builder setEndOfDayPreferences(
        com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.Builder builderForValue) {
      if (endOfDayPreferencesBuilder_ == null) {
        endOfDayPreferences_ = builderForValue.build();
      } else {
        endOfDayPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     */
    public Builder mergeEndOfDayPreferences(com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences value) {
      if (endOfDayPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          endOfDayPreferences_ != null &&
          endOfDayPreferences_ != com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.getDefaultInstance()) {
          getEndOfDayPreferencesBuilder().mergeFrom(value);
        } else {
          endOfDayPreferences_ = value;
        }
      } else {
        endOfDayPreferencesBuilder_.mergeFrom(value);
      }
      if (endOfDayPreferences_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     */
    public Builder clearEndOfDayPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      endOfDayPreferences_ = null;
      if (endOfDayPreferencesBuilder_ != null) {
        endOfDayPreferencesBuilder_.dispose();
        endOfDayPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.Builder getEndOfDayPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEndOfDayPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.EndOfDayPreferencesOrBuilder getEndOfDayPreferencesOrBuilder() {
      if (endOfDayPreferencesBuilder_ != null) {
        return endOfDayPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return endOfDayPreferences_ == null ?
            com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.getDefaultInstance() : endOfDayPreferences_;
      }
    }
    /**
     * <pre>
     * EndOfDay preferences object
     * </pre>
     *
     * <code>.api.v0alpha.EndOfDayPreferences end_of_day_preferences = 1 [json_name = "endOfDayPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences, com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.Builder, com.tcn.cloud.api.api.v0alpha.EndOfDayPreferencesOrBuilder> 
        getEndOfDayPreferencesFieldBuilder() {
      if (endOfDayPreferencesBuilder_ == null) {
        endOfDayPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences, com.tcn.cloud.api.api.v0alpha.EndOfDayPreferences.Builder, com.tcn.cloud.api.api.v0alpha.EndOfDayPreferencesOrBuilder>(
                getEndOfDayPreferences(),
                getParentForChildren(),
                isClean());
        endOfDayPreferences_ = null;
      }
      return endOfDayPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetEndOfDayPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetEndOfDayPreferencesResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEndOfDayPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEndOfDayPreferencesResponse>() {
    @java.lang.Override
    public GetEndOfDayPreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetEndOfDayPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEndOfDayPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetEndOfDayPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

