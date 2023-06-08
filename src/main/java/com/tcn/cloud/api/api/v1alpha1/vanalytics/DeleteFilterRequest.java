// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/filter.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * Protobuf type {@code api.v1alpha1.vanalytics.DeleteFilterRequest}
 */
public final class DeleteFilterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.DeleteFilterRequest)
    DeleteFilterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteFilterRequest.newBuilder() to construct.
  private DeleteFilterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteFilterRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteFilterRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterProto.internal_static_api_v1alpha1_vanalytics_DeleteFilterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterProto.internal_static_api_v1alpha1_vanalytics_DeleteFilterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.Builder.class);
  }

  public static final int FILTER_SID_FIELD_NUMBER = 1;
  private long filterSid_ = 0L;
  /**
   * <pre>
   * Required. The unique id of the filter to be deleted.
   * </pre>
   *
   * <code>int64 filter_sid = 1 [json_name = "filterSid"];</code>
   * @return The filterSid.
   */
  @java.lang.Override
  public long getFilterSid() {
    return filterSid_;
  }

  public static final int RETURN_FIELD_NUMBER = 3;
  private boolean return_ = false;
  /**
   * <pre>
   * Optional. Return the filter that was deleted.
   * </pre>
   *
   * <code>bool return = 3 [json_name = "return"];</code>
   * @return The return.
   */
  @java.lang.Override
  public boolean getReturn() {
    return return_;
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
    if (filterSid_ != 0L) {
      output.writeInt64(1, filterSid_);
    }
    if (return_ != false) {
      output.writeBool(3, return_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filterSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, filterSid_);
    }
    if (return_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, return_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest) obj;

    if (getFilterSid()
        != other.getFilterSid()) return false;
    if (getReturn()
        != other.getReturn()) return false;
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
    hash = (37 * hash) + FILTER_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFilterSid());
    hash = (37 * hash) + RETURN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReturn());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest prototype) {
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
   * Protobuf type {@code api.v1alpha1.vanalytics.DeleteFilterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.DeleteFilterRequest)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterProto.internal_static_api_v1alpha1_vanalytics_DeleteFilterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterProto.internal_static_api_v1alpha1_vanalytics_DeleteFilterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.newBuilder()
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
      filterSid_ = 0L;
      return_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterProto.internal_static_api_v1alpha1_vanalytics_DeleteFilterRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filterSid_ = filterSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.return_ = return_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.getDefaultInstance()) return this;
      if (other.getFilterSid() != 0L) {
        setFilterSid(other.getFilterSid());
      }
      if (other.getReturn() != false) {
        setReturn(other.getReturn());
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
            case 8: {
              filterSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 24: {
              return_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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

    private long filterSid_ ;
    /**
     * <pre>
     * Required. The unique id of the filter to be deleted.
     * </pre>
     *
     * <code>int64 filter_sid = 1 [json_name = "filterSid"];</code>
     * @return The filterSid.
     */
    @java.lang.Override
    public long getFilterSid() {
      return filterSid_;
    }
    /**
     * <pre>
     * Required. The unique id of the filter to be deleted.
     * </pre>
     *
     * <code>int64 filter_sid = 1 [json_name = "filterSid"];</code>
     * @param value The filterSid to set.
     * @return This builder for chaining.
     */
    public Builder setFilterSid(long value) {

      filterSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The unique id of the filter to be deleted.
     * </pre>
     *
     * <code>int64 filter_sid = 1 [json_name = "filterSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFilterSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      filterSid_ = 0L;
      onChanged();
      return this;
    }

    private boolean return_ ;
    /**
     * <pre>
     * Optional. Return the filter that was deleted.
     * </pre>
     *
     * <code>bool return = 3 [json_name = "return"];</code>
     * @return The return.
     */
    @java.lang.Override
    public boolean getReturn() {
      return return_;
    }
    /**
     * <pre>
     * Optional. Return the filter that was deleted.
     * </pre>
     *
     * <code>bool return = 3 [json_name = "return"];</code>
     * @param value The return to set.
     * @return This builder for chaining.
     */
    public Builder setReturn(boolean value) {

      return_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Return the filter that was deleted.
     * </pre>
     *
     * <code>bool return = 3 [json_name = "return"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReturn() {
      bitField0_ = (bitField0_ & ~0x00000002);
      return_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.DeleteFilterRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.DeleteFilterRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteFilterRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteFilterRequest>() {
    @java.lang.Override
    public DeleteFilterRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteFilterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteFilterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

