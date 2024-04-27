// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * Protobuf type {@code wfo.vanalytics.v2.CreateFilterRequest}
 */
public final class CreateFilterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.CreateFilterRequest)
    CreateFilterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateFilterRequest.newBuilder() to construct.
  private CreateFilterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateFilterRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateFilterRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.internal_static_wfo_vanalytics_v2_CreateFilterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.internal_static_wfo_vanalytics_v2_CreateFilterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.Builder.class);
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.wfo.vanalytics.v2.Filter filter_;
  /**
   * <pre>
   * The filter resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  @java.lang.Override
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <pre>
   * The filter resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
   * @return The filter.
   */
  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.Filter getFilter() {
    return filter_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.Filter.getDefaultInstance() : filter_;
  }
  /**
   * <pre>
   * The filter resource to create.
   * </pre>
   *
   * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder getFilterOrBuilder() {
    return filter_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.Filter.getDefaultInstance() : filter_;
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest other = (com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest) obj;

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

  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest prototype) {
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
   * Protobuf type {@code wfo.vanalytics.v2.CreateFilterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.CreateFilterRequest)
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.internal_static_wfo_vanalytics_v2_CreateFilterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.internal_static_wfo_vanalytics_v2_CreateFilterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.newBuilder()
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
      return com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.internal_static_wfo_vanalytics_v2_CreateFilterRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest result = new com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filter_ = filterBuilder_ == null
            ? filter_
            : filterBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest.getDefaultInstance()) return this;
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

    private com.tcn.cloud.api.wfo.vanalytics.v2.Filter filter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.wfo.vanalytics.v2.Filter, com.tcn.cloud.api.wfo.vanalytics.v2.Filter.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder> filterBuilder_;
    /**
     * <pre>
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
     * @return Whether the filter field is set.
     */
    public boolean hasFilter() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
     * @return The filter.
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Filter getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.tcn.cloud.api.wfo.vanalytics.v2.Filter.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public Builder setFilter(com.tcn.cloud.api.wfo.vanalytics.v2.Filter value) {
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
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public Builder setFilter(
        com.tcn.cloud.api.wfo.vanalytics.v2.Filter.Builder builderForValue) {
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
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public Builder mergeFilter(com.tcn.cloud.api.wfo.vanalytics.v2.Filter value) {
      if (filterBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          filter_ != null &&
          filter_ != com.tcn.cloud.api.wfo.vanalytics.v2.Filter.getDefaultInstance()) {
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
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
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
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.Filter.Builder getFilterBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.tcn.cloud.api.wfo.vanalytics.v2.Filter.getDefaultInstance() : filter_;
      }
    }
    /**
     * <pre>
     * The filter resource to create.
     * </pre>
     *
     * <code>.wfo.vanalytics.v2.Filter filter = 1 [json_name = "filter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.wfo.vanalytics.v2.Filter, com.tcn.cloud.api.wfo.vanalytics.v2.Filter.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.wfo.vanalytics.v2.Filter, com.tcn.cloud.api.wfo.vanalytics.v2.Filter.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FilterOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.CreateFilterRequest)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.CreateFilterRequest)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFilterRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateFilterRequest>() {
    @java.lang.Override
    public CreateFilterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFilterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFilterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.CreateFilterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
