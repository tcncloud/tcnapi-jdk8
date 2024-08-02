// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/service.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

/**
 * <pre>
 * ListDatasourceSchemasRequest is the request to list datasource schemas.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.explorer.ListDatasourceSchemasRequest}
 */
public final class ListDatasourceSchemasRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.explorer.ListDatasourceSchemasRequest)
    ListDatasourceSchemasRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDatasourceSchemasRequest.newBuilder() to construct.
  private ListDatasourceSchemasRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDatasourceSchemasRequest() {
    datasourceNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDatasourceSchemasRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.class, com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.Builder.class);
  }

  public static final int DATASOURCE_NAMES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList datasourceNames_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
   * @return A list containing the datasourceNames.
   */
  public com.google.protobuf.ProtocolStringList
      getDatasourceNamesList() {
    return datasourceNames_;
  }
  /**
   * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
   * @return The count of datasourceNames.
   */
  public int getDatasourceNamesCount() {
    return datasourceNames_.size();
  }
  /**
   * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
   * @param index The index of the element to return.
   * @return The datasourceNames at the given index.
   */
  public java.lang.String getDatasourceNames(int index) {
    return datasourceNames_.get(index);
  }
  /**
   * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the datasourceNames at the given index.
   */
  public com.google.protobuf.ByteString
      getDatasourceNamesBytes(int index) {
    return datasourceNames_.getByteString(index);
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
    for (int i = 0; i < datasourceNames_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, datasourceNames_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < datasourceNames_.size(); i++) {
        dataSize += computeStringSizeNoTag(datasourceNames_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDatasourceNamesList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest other = (com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest) obj;

    if (!getDatasourceNamesList()
        .equals(other.getDatasourceNamesList())) return false;
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
    if (getDatasourceNamesCount() > 0) {
      hash = (37 * hash) + DATASOURCE_NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getDatasourceNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest prototype) {
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
   * ListDatasourceSchemasRequest is the request to list datasource schemas.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.explorer.ListDatasourceSchemasRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.explorer.ListDatasourceSchemasRequest)
      com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.class, com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.newBuilder()
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
      datasourceNames_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ServiceProto.internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest build() {
      com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest result = new com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        datasourceNames_.makeImmutable();
        result.datasourceNames_ = datasourceNames_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest.getDefaultInstance()) return this;
      if (!other.datasourceNames_.isEmpty()) {
        if (datasourceNames_.isEmpty()) {
          datasourceNames_ = other.datasourceNames_;
          bitField0_ |= 0x00000001;
        } else {
          ensureDatasourceNamesIsMutable();
          datasourceNames_.addAll(other.datasourceNames_);
        }
        onChanged();
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureDatasourceNamesIsMutable();
              datasourceNames_.add(s);
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

    private com.google.protobuf.LazyStringArrayList datasourceNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDatasourceNamesIsMutable() {
      if (!datasourceNames_.isModifiable()) {
        datasourceNames_ = new com.google.protobuf.LazyStringArrayList(datasourceNames_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @return A list containing the datasourceNames.
     */
    public com.google.protobuf.ProtocolStringList
        getDatasourceNamesList() {
      datasourceNames_.makeImmutable();
      return datasourceNames_;
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @return The count of datasourceNames.
     */
    public int getDatasourceNamesCount() {
      return datasourceNames_.size();
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @param index The index of the element to return.
     * @return The datasourceNames at the given index.
     */
    public java.lang.String getDatasourceNames(int index) {
      return datasourceNames_.get(index);
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the datasourceNames at the given index.
     */
    public com.google.protobuf.ByteString
        getDatasourceNamesBytes(int index) {
      return datasourceNames_.getByteString(index);
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @param index The index to set the value at.
     * @param value The datasourceNames to set.
     * @return This builder for chaining.
     */
    public Builder setDatasourceNames(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDatasourceNamesIsMutable();
      datasourceNames_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @param value The datasourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addDatasourceNames(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDatasourceNamesIsMutable();
      datasourceNames_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @param values The datasourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addAllDatasourceNames(
        java.lang.Iterable<java.lang.String> values) {
      ensureDatasourceNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, datasourceNames_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDatasourceNames() {
      datasourceNames_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string datasource_names = 1 [json_name = "datasourceNames"];</code>
     * @param value The bytes of the datasourceNames to add.
     * @return This builder for chaining.
     */
    public Builder addDatasourceNamesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDatasourceNamesIsMutable();
      datasourceNames_.add(value);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.explorer.ListDatasourceSchemasRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.explorer.ListDatasourceSchemasRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDatasourceSchemasRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListDatasourceSchemasRequest>() {
    @java.lang.Override
    public ListDatasourceSchemasRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDatasourceSchemasRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDatasourceSchemasRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.explorer.ListDatasourceSchemasRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

