// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * Response message for GetCustomReportFilter
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.GetCustomReportFilterResponse}
 */
public final class GetCustomReportFilterResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.GetCustomReportFilterResponse)
    GetCustomReportFilterResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCustomReportFilterResponse.newBuilder() to construct.
  private GetCustomReportFilterResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCustomReportFilterResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCustomReportFilterResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetCustomReportFilterResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetCustomReportFilterResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse.Builder.class);
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter filter_;
  /**
   * <pre>
   * Custom report filter
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  @java.lang.Override
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <pre>
   * Custom report filter
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
   * @return The filter.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter getFilter() {
    return filter_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.getDefaultInstance() : filter_;
  }
  /**
   * <pre>
   * Custom report filter
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilterOrBuilder getFilterOrBuilder() {
    return filter_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.getDefaultInstance() : filter_;
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
    if (filter_ != null) {
      output.writeMessage(1, getFilter());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFilter());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse) obj;

    if (hasFilter() != other.hasFilter()) return false;
    if (hasFilter()) {
      if (!getFilter()
          .equals(other.getFilter())) return false;
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
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse prototype) {
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
   * Response message for GetCustomReportFilter
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.GetCustomReportFilterResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.GetCustomReportFilterResponse)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetCustomReportFilterResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetCustomReportFilterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse.newBuilder()
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
      filter_ = null;
      if (filterBuilder_ != null) {
        filterBuilder_.dispose();
        filterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetCustomReportFilterResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filter_ = filterBuilder_ == null
            ? filter_
            : filterBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse.getDefaultInstance()) return this;
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
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
                  getFilterFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter filter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter, com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilterOrBuilder> filterBuilder_;
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     * @return Whether the filter field is set.
     */
    public boolean hasFilter() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     * @return The filter.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     */
    public Builder setFilter(com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
      } else {
        filterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     */
    public Builder setFilter(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.Builder builderForValue) {
      if (filterBuilder_ == null) {
        filter_ = builderForValue.build();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     */
    public Builder mergeFilter(com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter value) {
      if (filterBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          filter_ != null &&
          filter_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.getDefaultInstance()) {
          getFilterBuilder().mergeFrom(value);
        } else {
          filter_ = value;
        }
      } else {
        filterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     */
    public Builder clearFilter() {
      bitField0_ = (bitField0_ & ~0x00000001);
      filter_ = null;
      if (filterBuilder_ != null) {
        filterBuilder_.dispose();
        filterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.Builder getFilterBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilterOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.getDefaultInstance() : filter_;
      }
    }
    /**
     * <pre>
     * Custom report filter
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.CustomReportFilter filter = 1 [json_name = "filter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter, com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilterOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter, com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilter.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.CustomReportFilterOrBuilder>(
                getFilter(),
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      return filterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.GetCustomReportFilterResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.GetCustomReportFilterResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCustomReportFilterResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCustomReportFilterResponse>() {
    @java.lang.Override
    public GetCustomReportFilterResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCustomReportFilterResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCustomReportFilterResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetCustomReportFilterResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

