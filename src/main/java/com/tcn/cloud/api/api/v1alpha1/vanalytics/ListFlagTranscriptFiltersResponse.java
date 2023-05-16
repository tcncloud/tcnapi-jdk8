// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/flag_transcript_filter.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * <pre>
 * ListFlagTranscriptFiltersResponse is a response for listing flag transcript filters.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse}
 */
public final class ListFlagTranscriptFiltersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse)
    ListFlagTranscriptFiltersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListFlagTranscriptFiltersResponse.newBuilder() to construct.
  private ListFlagTranscriptFiltersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListFlagTranscriptFiltersResponse() {
    flagTranscriptFilters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListFlagTranscriptFiltersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagTranscriptFiltersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagTranscriptFiltersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.Builder.class);
  }

  public static final int FLAG_TRANSCRIPT_FILTERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter> flagTranscriptFilters_;
  /**
   * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter> getFlagTranscriptFiltersList() {
    return flagTranscriptFilters_;
  }
  /**
   * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterOrBuilder> 
      getFlagTranscriptFiltersOrBuilderList() {
    return flagTranscriptFilters_;
  }
  /**
   * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
   */
  @java.lang.Override
  public int getFlagTranscriptFiltersCount() {
    return flagTranscriptFilters_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter getFlagTranscriptFilters(int index) {
    return flagTranscriptFilters_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterOrBuilder getFlagTranscriptFiltersOrBuilder(
      int index) {
    return flagTranscriptFilters_.get(index);
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
    for (int i = 0; i < flagTranscriptFilters_.size(); i++) {
      output.writeMessage(1, flagTranscriptFilters_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < flagTranscriptFilters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, flagTranscriptFilters_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse) obj;

    if (!getFlagTranscriptFiltersList()
        .equals(other.getFlagTranscriptFiltersList())) return false;
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
    if (getFlagTranscriptFiltersCount() > 0) {
      hash = (37 * hash) + FLAG_TRANSCRIPT_FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getFlagTranscriptFiltersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse prototype) {
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
   * ListFlagTranscriptFiltersResponse is a response for listing flag transcript filters.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagTranscriptFiltersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagTranscriptFiltersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.newBuilder()
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
      if (flagTranscriptFiltersBuilder_ == null) {
        flagTranscriptFilters_ = java.util.Collections.emptyList();
      } else {
        flagTranscriptFilters_ = null;
        flagTranscriptFiltersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.internal_static_api_v1alpha1_vanalytics_ListFlagTranscriptFiltersResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse result) {
      if (flagTranscriptFiltersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          flagTranscriptFilters_ = java.util.Collections.unmodifiableList(flagTranscriptFilters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.flagTranscriptFilters_ = flagTranscriptFilters_;
      } else {
        result.flagTranscriptFilters_ = flagTranscriptFiltersBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.getDefaultInstance()) return this;
      if (flagTranscriptFiltersBuilder_ == null) {
        if (!other.flagTranscriptFilters_.isEmpty()) {
          if (flagTranscriptFilters_.isEmpty()) {
            flagTranscriptFilters_ = other.flagTranscriptFilters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFlagTranscriptFiltersIsMutable();
            flagTranscriptFilters_.addAll(other.flagTranscriptFilters_);
          }
          onChanged();
        }
      } else {
        if (!other.flagTranscriptFilters_.isEmpty()) {
          if (flagTranscriptFiltersBuilder_.isEmpty()) {
            flagTranscriptFiltersBuilder_.dispose();
            flagTranscriptFiltersBuilder_ = null;
            flagTranscriptFilters_ = other.flagTranscriptFilters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            flagTranscriptFiltersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFlagTranscriptFiltersFieldBuilder() : null;
          } else {
            flagTranscriptFiltersBuilder_.addAllMessages(other.flagTranscriptFilters_);
          }
        }
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
              com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.parser(),
                      extensionRegistry);
              if (flagTranscriptFiltersBuilder_ == null) {
                ensureFlagTranscriptFiltersIsMutable();
                flagTranscriptFilters_.add(m);
              } else {
                flagTranscriptFiltersBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter> flagTranscriptFilters_ =
      java.util.Collections.emptyList();
    private void ensureFlagTranscriptFiltersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        flagTranscriptFilters_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter>(flagTranscriptFilters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterOrBuilder> flagTranscriptFiltersBuilder_;

    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter> getFlagTranscriptFiltersList() {
      if (flagTranscriptFiltersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(flagTranscriptFilters_);
      } else {
        return flagTranscriptFiltersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public int getFlagTranscriptFiltersCount() {
      if (flagTranscriptFiltersBuilder_ == null) {
        return flagTranscriptFilters_.size();
      } else {
        return flagTranscriptFiltersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter getFlagTranscriptFilters(int index) {
      if (flagTranscriptFiltersBuilder_ == null) {
        return flagTranscriptFilters_.get(index);
      } else {
        return flagTranscriptFiltersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder setFlagTranscriptFilters(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter value) {
      if (flagTranscriptFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagTranscriptFiltersIsMutable();
        flagTranscriptFilters_.set(index, value);
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder setFlagTranscriptFilters(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder builderForValue) {
      if (flagTranscriptFiltersBuilder_ == null) {
        ensureFlagTranscriptFiltersIsMutable();
        flagTranscriptFilters_.set(index, builderForValue.build());
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder addFlagTranscriptFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter value) {
      if (flagTranscriptFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagTranscriptFiltersIsMutable();
        flagTranscriptFilters_.add(value);
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder addFlagTranscriptFilters(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter value) {
      if (flagTranscriptFiltersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlagTranscriptFiltersIsMutable();
        flagTranscriptFilters_.add(index, value);
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder addFlagTranscriptFilters(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder builderForValue) {
      if (flagTranscriptFiltersBuilder_ == null) {
        ensureFlagTranscriptFiltersIsMutable();
        flagTranscriptFilters_.add(builderForValue.build());
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder addFlagTranscriptFilters(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder builderForValue) {
      if (flagTranscriptFiltersBuilder_ == null) {
        ensureFlagTranscriptFiltersIsMutable();
        flagTranscriptFilters_.add(index, builderForValue.build());
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder addAllFlagTranscriptFilters(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter> values) {
      if (flagTranscriptFiltersBuilder_ == null) {
        ensureFlagTranscriptFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, flagTranscriptFilters_);
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder clearFlagTranscriptFilters() {
      if (flagTranscriptFiltersBuilder_ == null) {
        flagTranscriptFilters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public Builder removeFlagTranscriptFilters(int index) {
      if (flagTranscriptFiltersBuilder_ == null) {
        ensureFlagTranscriptFiltersIsMutable();
        flagTranscriptFilters_.remove(index);
        onChanged();
      } else {
        flagTranscriptFiltersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder getFlagTranscriptFiltersBuilder(
        int index) {
      return getFlagTranscriptFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterOrBuilder getFlagTranscriptFiltersOrBuilder(
        int index) {
      if (flagTranscriptFiltersBuilder_ == null) {
        return flagTranscriptFilters_.get(index);  } else {
        return flagTranscriptFiltersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterOrBuilder> 
         getFlagTranscriptFiltersOrBuilderList() {
      if (flagTranscriptFiltersBuilder_ != null) {
        return flagTranscriptFiltersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(flagTranscriptFilters_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder addFlagTranscriptFiltersBuilder() {
      return getFlagTranscriptFiltersFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder addFlagTranscriptFiltersBuilder(
        int index) {
      return getFlagTranscriptFiltersFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.FlagTranscriptFilter flag_transcript_filters = 1 [json_name = "flagTranscriptFilters"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder> 
         getFlagTranscriptFiltersBuilderList() {
      return getFlagTranscriptFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterOrBuilder> 
        getFlagTranscriptFiltersFieldBuilder() {
      if (flagTranscriptFiltersBuilder_ == null) {
        flagTranscriptFiltersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilter.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterOrBuilder>(
                flagTranscriptFilters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        flagTranscriptFilters_ = null;
      }
      return flagTranscriptFiltersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFlagTranscriptFiltersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListFlagTranscriptFiltersResponse>() {
    @java.lang.Override
    public ListFlagTranscriptFiltersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFlagTranscriptFiltersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFlagTranscriptFiltersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

