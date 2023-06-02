// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/labels.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response message for the GetASsignmentCounts RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.GetAssignmentCountsResponse}
 */
public final class GetAssignmentCountsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.GetAssignmentCountsResponse)
    GetAssignmentCountsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAssignmentCountsResponse.newBuilder() to construct.
  private GetAssignmentCountsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAssignmentCountsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAssignmentCountsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignmentCountsResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetCounts();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignmentCountsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.Builder.class);
  }

  public static final int COUNTS_FIELD_NUMBER = 1;
  private static final class CountsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Long>newDefaultInstance(
                com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignmentCountsResponse_CountsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Long> counts_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
  internalGetCounts() {
    if (counts_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CountsDefaultEntryHolder.defaultEntry);
    }
    return counts_;
  }
  public int getCountsCount() {
    return internalGetCounts().getMap().size();
  }
  /**
   * <pre>
   * The key is the int32 value of the api.commons.EntityType enum.
   * The value is the count of all assignments belonging to the
   * type.
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
   */
  @java.lang.Override
  public boolean containsCounts(
      int key) {

    return internalGetCounts().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCountsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Long> getCounts() {
    return getCountsMap();
  }
  /**
   * <pre>
   * The key is the int32 value of the api.commons.EntityType enum.
   * The value is the count of all assignments belonging to the
   * type.
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, java.lang.Long> getCountsMap() {
    return internalGetCounts().getMap();
  }
  /**
   * <pre>
   * The key is the int32 value of the api.commons.EntityType enum.
   * The value is the count of all assignments belonging to the
   * type.
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
   */
  @java.lang.Override
  public long getCountsOrDefault(
      int key,
      long defaultValue) {

    java.util.Map<java.lang.Integer, java.lang.Long> map =
        internalGetCounts().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * The key is the int32 value of the api.commons.EntityType enum.
   * The value is the count of all assignments belonging to the
   * type.
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
   */
  @java.lang.Override
  public long getCountsOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, java.lang.Long> map =
        internalGetCounts().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetCounts(),
        CountsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> entry
         : internalGetCounts().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long>
      counts__ = CountsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, counts__);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse other = (com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse) obj;

    if (!internalGetCounts().equals(
        other.internalGetCounts())) return false;
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
    if (!internalGetCounts().getMap().isEmpty()) {
      hash = (37 * hash) + COUNTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCounts().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse prototype) {
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
   * Response message for the GetASsignmentCounts RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.GetAssignmentCountsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.GetAssignmentCountsResponse)
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignmentCountsResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetCounts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableCounts();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignmentCountsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.newBuilder()
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
      internalGetMutableCounts().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignmentCountsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse result = new com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.counts_ = internalGetCounts();
        result.counts_.makeImmutable();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse.getDefaultInstance()) return this;
      internalGetMutableCounts().mergeFrom(
          other.internalGetCounts());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long>
              counts__ = input.readMessage(
                  CountsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableCounts().getMutableMap().put(
                  counts__.getKey(), counts__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Long> counts_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
        internalGetCounts() {
      if (counts_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CountsDefaultEntryHolder.defaultEntry);
      }
      return counts_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
        internalGetMutableCounts() {
      if (counts_ == null) {
        counts_ = com.google.protobuf.MapField.newMapField(
            CountsDefaultEntryHolder.defaultEntry);
      }
      if (!counts_.isMutable()) {
        counts_ = counts_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return counts_;
    }
    public int getCountsCount() {
      return internalGetCounts().getMap().size();
    }
    /**
     * <pre>
     * The key is the int32 value of the api.commons.EntityType enum.
     * The value is the count of all assignments belonging to the
     * type.
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
     */
    @java.lang.Override
    public boolean containsCounts(
        int key) {

      return internalGetCounts().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCountsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long> getCounts() {
      return getCountsMap();
    }
    /**
     * <pre>
     * The key is the int32 value of the api.commons.EntityType enum.
     * The value is the count of all assignments belonging to the
     * type.
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Long> getCountsMap() {
      return internalGetCounts().getMap();
    }
    /**
     * <pre>
     * The key is the int32 value of the api.commons.EntityType enum.
     * The value is the count of all assignments belonging to the
     * type.
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
     */
    @java.lang.Override
    public long getCountsOrDefault(
        int key,
        long defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Long> map =
          internalGetCounts().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * The key is the int32 value of the api.commons.EntityType enum.
     * The value is the count of all assignments belonging to the
     * type.
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
     */
    @java.lang.Override
    public long getCountsOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Long> map =
          internalGetCounts().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearCounts() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableCounts().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * The key is the int32 value of the api.commons.EntityType enum.
     * The value is the count of all assignments belonging to the
     * type.
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
     */
    public Builder removeCounts(
        int key) {

      internalGetMutableCounts().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long>
        getMutableCounts() {
      bitField0_ |= 0x00000001;
      return internalGetMutableCounts().getMutableMap();
    }
    /**
     * <pre>
     * The key is the int32 value of the api.commons.EntityType enum.
     * The value is the count of all assignments belonging to the
     * type.
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
     */
    public Builder putCounts(
        int key,
        long value) {


      internalGetMutableCounts().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * The key is the int32 value of the api.commons.EntityType enum.
     * The value is the count of all assignments belonging to the
     * type.
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; counts = 1 [json_name = "counts"];</code>
     */
    public Builder putAllCounts(
        java.util.Map<java.lang.Integer, java.lang.Long> values) {
      internalGetMutableCounts().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.GetAssignmentCountsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.GetAssignmentCountsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAssignmentCountsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAssignmentCountsResponse>() {
    @java.lang.Override
    public GetAssignmentCountsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAssignmentCountsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAssignmentCountsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.GetAssignmentCountsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

