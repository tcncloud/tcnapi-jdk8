// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response message for ListCustomReportFilters
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ListCustomReportFiltersResponse}
 */
public final class ListCustomReportFiltersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListCustomReportFiltersResponse)
    ListCustomReportFiltersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCustomReportFiltersResponse.newBuilder() to construct.
  private ListCustomReportFiltersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCustomReportFiltersResponse() {
    filters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCustomReportFiltersResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListCustomReportFiltersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListCustomReportFiltersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.class, com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.Builder.class);
  }

  public static final int FILTERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.CustomReportFilter> filters_;
  /**
   * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.CustomReportFilter> getFiltersList() {
    return filters_;
  }
  /**
   * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CustomReportFilterOrBuilder> 
      getFiltersOrBuilderList() {
    return filters_;
  }
  /**
   * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public int getFiltersCount() {
    return filters_.size();
  }
  /**
   * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CustomReportFilter getFilters(int index) {
    return filters_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CustomReportFilterOrBuilder getFiltersOrBuilder(
      int index) {
    return filters_.get(index);
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
    for (int i = 0; i < filters_.size(); i++) {
      output.writeMessage(1, filters_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < filters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, filters_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse other = (com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse) obj;

    if (!getFiltersList()
        .equals(other.getFiltersList())) return false;
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
    if (getFiltersCount() > 0) {
      hash = (37 * hash) + FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getFiltersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse prototype) {
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
   * Response message for ListCustomReportFilters
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ListCustomReportFiltersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListCustomReportFiltersResponse)
      com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListCustomReportFiltersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListCustomReportFiltersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.class, com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.newBuilder()
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
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
      } else {
        filters_ = null;
        filtersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListCustomReportFiltersResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse build() {
      com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse result = new com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse result) {
      if (filtersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          filters_ = java.util.Collections.unmodifiableList(filters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.filters_ = filters_;
      } else {
        result.filters_ = filtersBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse.getDefaultInstance()) return this;
      if (filtersBuilder_ == null) {
        if (!other.filters_.isEmpty()) {
          if (filters_.isEmpty()) {
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFiltersIsMutable();
            filters_.addAll(other.filters_);
          }
          onChanged();
        }
      } else {
        if (!other.filters_.isEmpty()) {
          if (filtersBuilder_.isEmpty()) {
            filtersBuilder_.dispose();
            filtersBuilder_ = null;
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            filtersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFiltersFieldBuilder() : null;
          } else {
            filtersBuilder_.addAllMessages(other.filters_);
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
              com.tcn.cloud.api.api.v0alpha.CustomReportFilter m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.CustomReportFilter.parser(),
                      extensionRegistry);
              if (filtersBuilder_ == null) {
                ensureFiltersIsMutable();
                filters_.add(m);
              } else {
                filtersBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.CustomReportFilter> filters_ =
      java.util.Collections.emptyList();
    private void ensureFiltersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        filters_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.CustomReportFilter>(filters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CustomReportFilter, com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder, com.tcn.cloud.api.api.v0alpha.CustomReportFilterOrBuilder> filtersBuilder_;

    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CustomReportFilter> getFiltersList() {
      if (filtersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(filters_);
      } else {
        return filtersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public int getFiltersCount() {
      if (filtersBuilder_ == null) {
        return filters_.size();
      } else {
        return filtersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CustomReportFilter getFilters(int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);
      } else {
        return filtersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder setFilters(
        int index, com.tcn.cloud.api.api.v0alpha.CustomReportFilter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.set(index, value);
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder setFilters(
        int index, com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.set(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder addFilters(com.tcn.cloud.api.api.v0alpha.CustomReportFilter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        int index, com.tcn.cloud.api.api.v0alpha.CustomReportFilter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(index, value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder addFilters(
        int index, com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder addAllFilters(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.CustomReportFilter> values) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, filters_);
        onChanged();
      } else {
        filtersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder clearFilters() {
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        filtersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public Builder removeFilters(int index) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.remove(index);
        onChanged();
      } else {
        filtersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder getFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CustomReportFilterOrBuilder getFiltersOrBuilder(
        int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);  } else {
        return filtersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CustomReportFilterOrBuilder> 
         getFiltersOrBuilderList() {
      if (filtersBuilder_ != null) {
        return filtersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(filters_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder addFiltersBuilder() {
      return getFiltersFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.CustomReportFilter.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder addFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.CustomReportFilter.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.CustomReportFilter filters = 1 [json_name = "filters"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder> 
         getFiltersBuilderList() {
      return getFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.CustomReportFilter, com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder, com.tcn.cloud.api.api.v0alpha.CustomReportFilterOrBuilder> 
        getFiltersFieldBuilder() {
      if (filtersBuilder_ == null) {
        filtersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.CustomReportFilter, com.tcn.cloud.api.api.v0alpha.CustomReportFilter.Builder, com.tcn.cloud.api.api.v0alpha.CustomReportFilterOrBuilder>(
                filters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        filters_ = null;
      }
      return filtersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListCustomReportFiltersResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListCustomReportFiltersResponse)
  private static final com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomReportFiltersResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCustomReportFiltersResponse>() {
    @java.lang.Override
    public ListCustomReportFiltersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCustomReportFiltersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomReportFiltersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListCustomReportFiltersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

