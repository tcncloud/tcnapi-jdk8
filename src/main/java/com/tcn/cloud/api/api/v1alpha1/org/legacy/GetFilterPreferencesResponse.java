// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * Response for GetFilterPreferences
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.GetFilterPreferencesResponse}
 */
public final class GetFilterPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.GetFilterPreferencesResponse)
    GetFilterPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFilterPreferencesResponse.newBuilder() to construct.
  private GetFilterPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFilterPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFilterPreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetFilterPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetFilterPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse.Builder.class);
  }

  public static final int FILTER_PREFERENCES_FIELD_NUMBER = 10;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences filterPreferences_;
  /**
   * <pre>
   * Filter preferences object
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
   * @return Whether the filterPreferences field is set.
   */
  @java.lang.Override
  public boolean hasFilterPreferences() {
    return filterPreferences_ != null;
  }
  /**
   * <pre>
   * Filter preferences object
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
   * @return The filterPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences getFilterPreferences() {
    return filterPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.getDefaultInstance() : filterPreferences_;
  }
  /**
   * <pre>
   * Filter preferences object
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferencesOrBuilder getFilterPreferencesOrBuilder() {
    return filterPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.getDefaultInstance() : filterPreferences_;
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
    if (filterPreferences_ != null) {
      output.writeMessage(10, getFilterPreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filterPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getFilterPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse) obj;

    if (hasFilterPreferences() != other.hasFilterPreferences()) return false;
    if (hasFilterPreferences()) {
      if (!getFilterPreferences()
          .equals(other.getFilterPreferences())) return false;
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
    if (hasFilterPreferences()) {
      hash = (37 * hash) + FILTER_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getFilterPreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse prototype) {
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
   * Response for GetFilterPreferences
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.GetFilterPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.GetFilterPreferencesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetFilterPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetFilterPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse.newBuilder()
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
      filterPreferences_ = null;
      if (filterPreferencesBuilder_ != null) {
        filterPreferencesBuilder_.dispose();
        filterPreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetFilterPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filterPreferences_ = filterPreferencesBuilder_ == null
            ? filterPreferences_
            : filterPreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasFilterPreferences()) {
        mergeFilterPreferences(other.getFilterPreferences());
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
            case 82: {
              input.readMessage(
                  getFilterPreferencesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 82
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences filterPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferencesOrBuilder> filterPreferencesBuilder_;
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     * @return Whether the filterPreferences field is set.
     */
    public boolean hasFilterPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     * @return The filterPreferences.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences getFilterPreferences() {
      if (filterPreferencesBuilder_ == null) {
        return filterPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.getDefaultInstance() : filterPreferences_;
      } else {
        return filterPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     */
    public Builder setFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences value) {
      if (filterPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filterPreferences_ = value;
      } else {
        filterPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     */
    public Builder setFilterPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.Builder builderForValue) {
      if (filterPreferencesBuilder_ == null) {
        filterPreferences_ = builderForValue.build();
      } else {
        filterPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     */
    public Builder mergeFilterPreferences(com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences value) {
      if (filterPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          filterPreferences_ != null &&
          filterPreferences_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.getDefaultInstance()) {
          getFilterPreferencesBuilder().mergeFrom(value);
        } else {
          filterPreferences_ = value;
        }
      } else {
        filterPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     */
    public Builder clearFilterPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      filterPreferences_ = null;
      if (filterPreferencesBuilder_ != null) {
        filterPreferencesBuilder_.dispose();
        filterPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.Builder getFilterPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFilterPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferencesOrBuilder getFilterPreferencesOrBuilder() {
      if (filterPreferencesBuilder_ != null) {
        return filterPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return filterPreferences_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.getDefaultInstance() : filterPreferences_;
      }
    }
    /**
     * <pre>
     * Filter preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.FilterPreferences filter_preferences = 10 [json_name = "filterPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferencesOrBuilder> 
        getFilterPreferencesFieldBuilder() {
      if (filterPreferencesBuilder_ == null) {
        filterPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.FilterPreferencesOrBuilder>(
                getFilterPreferences(),
                getParentForChildren(),
                isClean());
        filterPreferences_ = null;
      }
      return filterPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.GetFilterPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.GetFilterPreferencesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFilterPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetFilterPreferencesResponse>() {
    @java.lang.Override
    public GetFilterPreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetFilterPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFilterPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetFilterPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

