// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CopyDashVizReq}
 */
public final class CopyDashVizReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CopyDashVizReq)
    CopyDashVizReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CopyDashVizReq.newBuilder() to construct.
  private CopyDashVizReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CopyDashVizReq() {
    dashboardIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    visualizationIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    orgId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CopyDashVizReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CopyDashVizReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CopyDashVizReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.class, com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.Builder.class);
  }

  public static final int DASHBOARD_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList dashboardIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
   * @return A list containing the dashboardIds.
   */
  public com.google.protobuf.ProtocolStringList
      getDashboardIdsList() {
    return dashboardIds_;
  }
  /**
   * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
   * @return The count of dashboardIds.
   */
  public int getDashboardIdsCount() {
    return dashboardIds_.size();
  }
  /**
   * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
   * @param index The index of the element to return.
   * @return The dashboardIds at the given index.
   */
  public java.lang.String getDashboardIds(int index) {
    return dashboardIds_.get(index);
  }
  /**
   * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the dashboardIds at the given index.
   */
  public com.google.protobuf.ByteString
      getDashboardIdsBytes(int index) {
    return dashboardIds_.getByteString(index);
  }

  public static final int VISUALIZATION_IDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList visualizationIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
   * @return A list containing the visualizationIds.
   */
  public com.google.protobuf.ProtocolStringList
      getVisualizationIdsList() {
    return visualizationIds_;
  }
  /**
   * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
   * @return The count of visualizationIds.
   */
  public int getVisualizationIdsCount() {
    return visualizationIds_.size();
  }
  /**
   * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
   * @param index The index of the element to return.
   * @return The visualizationIds at the given index.
   */
  public java.lang.String getVisualizationIds(int index) {
    return visualizationIds_.get(index);
  }
  /**
   * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the visualizationIds at the given index.
   */
  public com.google.protobuf.ByteString
      getVisualizationIdsBytes(int index) {
    return visualizationIds_.getByteString(index);
  }

  public static final int ORG_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * org Id to copy visualizations and dashboards to
   * </pre>
   *
   * <code>string org_id = 4 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  @java.lang.Override
  public java.lang.String getOrgId() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * org Id to copy visualizations and dashboards to
   * </pre>
   *
   * <code>string org_id = 4 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrgIdBytes() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < dashboardIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dashboardIds_.getRaw(i));
    }
    for (int i = 0; i < visualizationIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, visualizationIds_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, orgId_);
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
      for (int i = 0; i < dashboardIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(dashboardIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDashboardIdsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < visualizationIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(visualizationIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getVisualizationIdsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, orgId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CopyDashVizReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CopyDashVizReq other = (com.tcn.cloud.api.api.v0alpha.CopyDashVizReq) obj;

    if (!getDashboardIdsList()
        .equals(other.getDashboardIdsList())) return false;
    if (!getVisualizationIdsList()
        .equals(other.getVisualizationIdsList())) return false;
    if (!getOrgId()
        .equals(other.getOrgId())) return false;
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
    if (getDashboardIdsCount() > 0) {
      hash = (37 * hash) + DASHBOARD_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getDashboardIdsList().hashCode();
    }
    if (getVisualizationIdsCount() > 0) {
      hash = (37 * hash) + VISUALIZATION_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getVisualizationIdsList().hashCode();
    }
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CopyDashVizReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CopyDashVizReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CopyDashVizReq)
      com.tcn.cloud.api.api.v0alpha.CopyDashVizReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CopyDashVizReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CopyDashVizReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.class, com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.newBuilder()
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
      dashboardIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      visualizationIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      orgId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CopyDashVizReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CopyDashVizReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CopyDashVizReq build() {
      com.tcn.cloud.api.api.v0alpha.CopyDashVizReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CopyDashVizReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CopyDashVizReq result = new com.tcn.cloud.api.api.v0alpha.CopyDashVizReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CopyDashVizReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        dashboardIds_.makeImmutable();
        result.dashboardIds_ = dashboardIds_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        visualizationIds_.makeImmutable();
        result.visualizationIds_ = visualizationIds_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orgId_ = orgId_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CopyDashVizReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CopyDashVizReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CopyDashVizReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CopyDashVizReq.getDefaultInstance()) return this;
      if (!other.dashboardIds_.isEmpty()) {
        if (dashboardIds_.isEmpty()) {
          dashboardIds_ = other.dashboardIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureDashboardIdsIsMutable();
          dashboardIds_.addAll(other.dashboardIds_);
        }
        onChanged();
      }
      if (!other.visualizationIds_.isEmpty()) {
        if (visualizationIds_.isEmpty()) {
          visualizationIds_ = other.visualizationIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureVisualizationIdsIsMutable();
          visualizationIds_.addAll(other.visualizationIds_);
        }
        onChanged();
      }
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000004;
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDashboardIdsIsMutable();
              dashboardIds_.add(s);
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureVisualizationIdsIsMutable();
              visualizationIds_.add(s);
              break;
            } // case 26
            case 34: {
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private com.google.protobuf.LazyStringArrayList dashboardIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDashboardIdsIsMutable() {
      if (!dashboardIds_.isModifiable()) {
        dashboardIds_ = new com.google.protobuf.LazyStringArrayList(dashboardIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @return A list containing the dashboardIds.
     */
    public com.google.protobuf.ProtocolStringList
        getDashboardIdsList() {
      dashboardIds_.makeImmutable();
      return dashboardIds_;
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @return The count of dashboardIds.
     */
    public int getDashboardIdsCount() {
      return dashboardIds_.size();
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @param index The index of the element to return.
     * @return The dashboardIds at the given index.
     */
    public java.lang.String getDashboardIds(int index) {
      return dashboardIds_.get(index);
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the dashboardIds at the given index.
     */
    public com.google.protobuf.ByteString
        getDashboardIdsBytes(int index) {
      return dashboardIds_.getByteString(index);
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @param index The index to set the value at.
     * @param value The dashboardIds to set.
     * @return This builder for chaining.
     */
    public Builder setDashboardIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDashboardIdsIsMutable();
      dashboardIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @param value The dashboardIds to add.
     * @return This builder for chaining.
     */
    public Builder addDashboardIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDashboardIdsIsMutable();
      dashboardIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @param values The dashboardIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllDashboardIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureDashboardIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dashboardIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDashboardIds() {
      dashboardIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dashboard_ids = 2 [json_name = "dashboardIds"];</code>
     * @param value The bytes of the dashboardIds to add.
     * @return This builder for chaining.
     */
    public Builder addDashboardIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDashboardIdsIsMutable();
      dashboardIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList visualizationIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureVisualizationIdsIsMutable() {
      if (!visualizationIds_.isModifiable()) {
        visualizationIds_ = new com.google.protobuf.LazyStringArrayList(visualizationIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @return A list containing the visualizationIds.
     */
    public com.google.protobuf.ProtocolStringList
        getVisualizationIdsList() {
      visualizationIds_.makeImmutable();
      return visualizationIds_;
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @return The count of visualizationIds.
     */
    public int getVisualizationIdsCount() {
      return visualizationIds_.size();
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @param index The index of the element to return.
     * @return The visualizationIds at the given index.
     */
    public java.lang.String getVisualizationIds(int index) {
      return visualizationIds_.get(index);
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the visualizationIds at the given index.
     */
    public com.google.protobuf.ByteString
        getVisualizationIdsBytes(int index) {
      return visualizationIds_.getByteString(index);
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @param index The index to set the value at.
     * @param value The visualizationIds to set.
     * @return This builder for chaining.
     */
    public Builder setVisualizationIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureVisualizationIdsIsMutable();
      visualizationIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @param value The visualizationIds to add.
     * @return This builder for chaining.
     */
    public Builder addVisualizationIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureVisualizationIdsIsMutable();
      visualizationIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @param values The visualizationIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllVisualizationIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureVisualizationIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, visualizationIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVisualizationIds() {
      visualizationIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string visualization_ids = 3 [json_name = "visualizationIds"];</code>
     * @param value The bytes of the visualizationIds to add.
     * @return This builder for chaining.
     */
    public Builder addVisualizationIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureVisualizationIdsIsMutable();
      visualizationIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * org Id to copy visualizations and dashboards to
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId"];</code>
     * @return The orgId.
     */
    public java.lang.String getOrgId() {
      java.lang.Object ref = orgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * org Id to copy visualizations and dashboards to
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId"];</code>
     * @return The bytes for orgId.
     */
    public com.google.protobuf.ByteString
        getOrgIdBytes() {
      java.lang.Object ref = orgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * org Id to copy visualizations and dashboards to
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * org Id to copy visualizations and dashboards to
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * org Id to copy visualizations and dashboards to
     * </pre>
     *
     * <code>string org_id = 4 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CopyDashVizReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CopyDashVizReq)
  private static final com.tcn.cloud.api.api.v0alpha.CopyDashVizReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CopyDashVizReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CopyDashVizReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CopyDashVizReq>
      PARSER = new com.google.protobuf.AbstractParser<CopyDashVizReq>() {
    @java.lang.Override
    public CopyDashVizReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CopyDashVizReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CopyDashVizReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CopyDashVizReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

