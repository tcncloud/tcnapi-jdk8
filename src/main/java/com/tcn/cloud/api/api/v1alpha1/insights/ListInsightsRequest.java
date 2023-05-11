// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * ListInsightsRequest is the request to list insights.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.insights.ListInsightsRequest}
 */
public final class ListInsightsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.ListInsightsRequest)
    ListInsightsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInsightsRequest.newBuilder() to construct.
  private ListInsightsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInsightsRequest() {
    insightPermissionTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListInsightsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.class, com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.Builder.class);
  }

  public static final int INSIGHT_PERMISSION_TYPES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> insightPermissionTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.InsightPermissionType> insightPermissionTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.InsightPermissionType>() {
            public com.tcn.cloud.api.api.commons.InsightPermissionType convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.InsightPermissionType result = com.tcn.cloud.api.api.commons.InsightPermissionType.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.InsightPermissionType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @return A list containing the insightPermissionTypes.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.InsightPermissionType> getInsightPermissionTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.InsightPermissionType>(insightPermissionTypes_, insightPermissionTypes_converter_);
  }
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @return The count of insightPermissionTypes.
   */
  @java.lang.Override
  public int getInsightPermissionTypesCount() {
    return insightPermissionTypes_.size();
  }
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @param index The index of the element to return.
   * @return The insightPermissionTypes at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.InsightPermissionType getInsightPermissionTypes(int index) {
    return insightPermissionTypes_converter_.convert(insightPermissionTypes_.get(index));
  }
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @return A list containing the enum numeric values on the wire for insightPermissionTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getInsightPermissionTypesValueList() {
    return insightPermissionTypes_;
  }
  /**
   * <pre>
   * Optional - list of insight permission types to filter by
   * </pre>
   *
   * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of insightPermissionTypes at the given index.
   */
  @java.lang.Override
  public int getInsightPermissionTypesValue(int index) {
    return insightPermissionTypes_.get(index);
  }
  private int insightPermissionTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getInsightPermissionTypesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(insightPermissionTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < insightPermissionTypes_.size(); i++) {
      output.writeEnumNoTag(insightPermissionTypes_.get(i));
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
      for (int i = 0; i < insightPermissionTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(insightPermissionTypes_.get(i));
      }
      size += dataSize;
      if (!getInsightPermissionTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }insightPermissionTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest other = (com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest) obj;

    if (!insightPermissionTypes_.equals(other.insightPermissionTypes_)) return false;
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
    if (getInsightPermissionTypesCount() > 0) {
      hash = (37 * hash) + INSIGHT_PERMISSION_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + insightPermissionTypes_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest prototype) {
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
   * ListInsightsRequest is the request to list insights.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.insights.ListInsightsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.ListInsightsRequest)
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.class, com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.newBuilder()
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
      insightPermissionTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.internal_static_api_v1alpha1_insights_ListInsightsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest result = new com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        insightPermissionTypes_ = java.util.Collections.unmodifiableList(insightPermissionTypes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.insightPermissionTypes_ = insightPermissionTypes_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest.getDefaultInstance()) return this;
      if (!other.insightPermissionTypes_.isEmpty()) {
        if (insightPermissionTypes_.isEmpty()) {
          insightPermissionTypes_ = other.insightPermissionTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureInsightPermissionTypesIsMutable();
          insightPermissionTypes_.addAll(other.insightPermissionTypes_);
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
            case 16: {
              int tmpRaw = input.readEnum();
              ensureInsightPermissionTypesIsMutable();
              insightPermissionTypes_.add(tmpRaw);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureInsightPermissionTypesIsMutable();
                insightPermissionTypes_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 18
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

    private java.util.List<java.lang.Integer> insightPermissionTypes_ =
      java.util.Collections.emptyList();
    private void ensureInsightPermissionTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        insightPermissionTypes_ = new java.util.ArrayList<java.lang.Integer>(insightPermissionTypes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @return A list containing the insightPermissionTypes.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.InsightPermissionType> getInsightPermissionTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.InsightPermissionType>(insightPermissionTypes_, insightPermissionTypes_converter_);
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @return The count of insightPermissionTypes.
     */
    public int getInsightPermissionTypesCount() {
      return insightPermissionTypes_.size();
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @param index The index of the element to return.
     * @return The insightPermissionTypes at the given index.
     */
    public com.tcn.cloud.api.api.commons.InsightPermissionType getInsightPermissionTypes(int index) {
      return insightPermissionTypes_converter_.convert(insightPermissionTypes_.get(index));
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @param index The index to set the value at.
     * @param value The insightPermissionTypes to set.
     * @return This builder for chaining.
     */
    public Builder setInsightPermissionTypes(
        int index, com.tcn.cloud.api.api.commons.InsightPermissionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureInsightPermissionTypesIsMutable();
      insightPermissionTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @param value The insightPermissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addInsightPermissionTypes(com.tcn.cloud.api.api.commons.InsightPermissionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureInsightPermissionTypesIsMutable();
      insightPermissionTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @param values The insightPermissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllInsightPermissionTypes(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.InsightPermissionType> values) {
      ensureInsightPermissionTypesIsMutable();
      for (com.tcn.cloud.api.api.commons.InsightPermissionType value : values) {
        insightPermissionTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInsightPermissionTypes() {
      insightPermissionTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @return A list containing the enum numeric values on the wire for insightPermissionTypes.
     */
    public java.util.List<java.lang.Integer>
    getInsightPermissionTypesValueList() {
      return java.util.Collections.unmodifiableList(insightPermissionTypes_);
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of insightPermissionTypes at the given index.
     */
    public int getInsightPermissionTypesValue(int index) {
      return insightPermissionTypes_.get(index);
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for insightPermissionTypes to set.
     * @return This builder for chaining.
     */
    public Builder setInsightPermissionTypesValue(
        int index, int value) {
      ensureInsightPermissionTypesIsMutable();
      insightPermissionTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @param value The enum numeric value on the wire for insightPermissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addInsightPermissionTypesValue(int value) {
      ensureInsightPermissionTypesIsMutable();
      insightPermissionTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional - list of insight permission types to filter by
     * </pre>
     *
     * <code>repeated .api.commons.InsightPermissionType insight_permission_types = 2 [json_name = "insightPermissionTypes"];</code>
     * @param values The enum numeric values on the wire for insightPermissionTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllInsightPermissionTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureInsightPermissionTypesIsMutable();
      for (int value : values) {
        insightPermissionTypes_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.ListInsightsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.ListInsightsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInsightsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListInsightsRequest>() {
    @java.lang.Override
    public ListInsightsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListInsightsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInsightsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ListInsightsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

