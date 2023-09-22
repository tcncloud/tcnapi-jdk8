// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Dashboard summary
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.DashboardSummary}
 */
public final class DashboardSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DashboardSummary)
    DashboardSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DashboardSummary.newBuilder() to construct.
  private DashboardSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DashboardSummary() {
    dashboardId_ = "";
    title_ = "";
    description_ = "";
    resourceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DashboardSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DashboardSummary.class, com.tcn.cloud.api.api.v0alpha.DashboardSummary.Builder.class);
  }

  public static final int DASHBOARD_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dashboardId_ = "";
  /**
   * <pre>
   * unique ID for this dashboard
   * </pre>
   *
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The dashboardId.
   */
  @java.lang.Override
  public java.lang.String getDashboardId() {
    java.lang.Object ref = dashboardId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dashboardId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * unique ID for this dashboard
   * </pre>
   *
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The bytes for dashboardId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDashboardIdBytes() {
    java.lang.Object ref = dashboardId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dashboardId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <pre>
   * required dashboard title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * required dashboard title
   * </pre>
   *
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * optional dashboard description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * optional dashboard description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PANEL_COUNT_FIELD_NUMBER = 4;
  private int panelCount_ = 0;
  /**
   * <pre>
   * number of associated panels
   * </pre>
   *
   * <code>int32 panel_count = 4 [json_name = "panelCount"];</code>
   * @return The panelCount.
   */
  @java.lang.Override
  public int getPanelCount() {
    return panelCount_;
  }

  public static final int RESOURCE_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceId_ = "";
  /**
   * <pre>
   * resource id of the dashboard
   * </pre>
   *
   * <code>string resource_id = 5 [json_name = "resourceId"];</code>
   * @return The resourceId.
   */
  @java.lang.Override
  public java.lang.String getResourceId() {
    java.lang.Object ref = resourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * resource id of the dashboard
   * </pre>
   *
   * <code>string resource_id = 5 [json_name = "resourceId"];</code>
   * @return The bytes for resourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceIdBytes() {
    java.lang.Object ref = resourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dashboardId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dashboardId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (panelCount_ != 0) {
      output.writeInt32(4, panelCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, resourceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dashboardId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dashboardId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (panelCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, panelCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, resourceId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DashboardSummary)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DashboardSummary other = (com.tcn.cloud.api.api.v0alpha.DashboardSummary) obj;

    if (!getDashboardId()
        .equals(other.getDashboardId())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (getPanelCount()
        != other.getPanelCount()) return false;
    if (!getResourceId()
        .equals(other.getResourceId())) return false;
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
    hash = (37 * hash) + DASHBOARD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDashboardId().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + PANEL_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPanelCount();
    hash = (37 * hash) + RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DashboardSummary prototype) {
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
   * Dashboard summary
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.DashboardSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DashboardSummary)
      com.tcn.cloud.api.api.v0alpha.DashboardSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DashboardSummary.class, com.tcn.cloud.api.api.v0alpha.DashboardSummary.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DashboardSummary.newBuilder()
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
      dashboardId_ = "";
      title_ = "";
      description_ = "";
      panelCount_ = 0;
      resourceId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardSummary_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardSummary getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DashboardSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardSummary build() {
      com.tcn.cloud.api.api.v0alpha.DashboardSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardSummary buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DashboardSummary result = new com.tcn.cloud.api.api.v0alpha.DashboardSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DashboardSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dashboardId_ = dashboardId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.panelCount_ = panelCount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.resourceId_ = resourceId_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DashboardSummary) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DashboardSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DashboardSummary other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DashboardSummary.getDefaultInstance()) return this;
      if (!other.getDashboardId().isEmpty()) {
        dashboardId_ = other.dashboardId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getPanelCount() != 0) {
        setPanelCount(other.getPanelCount());
      }
      if (!other.getResourceId().isEmpty()) {
        resourceId_ = other.resourceId_;
        bitField0_ |= 0x00000010;
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
              dashboardId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              panelCount_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              resourceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object dashboardId_ = "";
    /**
     * <pre>
     * unique ID for this dashboard
     * </pre>
     *
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @return The dashboardId.
     */
    public java.lang.String getDashboardId() {
      java.lang.Object ref = dashboardId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dashboardId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * unique ID for this dashboard
     * </pre>
     *
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @return The bytes for dashboardId.
     */
    public com.google.protobuf.ByteString
        getDashboardIdBytes() {
      java.lang.Object ref = dashboardId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dashboardId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * unique ID for this dashboard
     * </pre>
     *
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @param value The dashboardId to set.
     * @return This builder for chaining.
     */
    public Builder setDashboardId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dashboardId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique ID for this dashboard
     * </pre>
     *
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDashboardId() {
      dashboardId_ = getDefaultInstance().getDashboardId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unique ID for this dashboard
     * </pre>
     *
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @param value The bytes for dashboardId to set.
     * @return This builder for chaining.
     */
    public Builder setDashboardIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dashboardId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * required dashboard title
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * required dashboard title
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * required dashboard title
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required dashboard title
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * required dashboard title
     * </pre>
     *
     * <code>string title = 2 [json_name = "title"];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * optional dashboard description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * optional dashboard description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * optional dashboard description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional dashboard description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional dashboard description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int panelCount_ ;
    /**
     * <pre>
     * number of associated panels
     * </pre>
     *
     * <code>int32 panel_count = 4 [json_name = "panelCount"];</code>
     * @return The panelCount.
     */
    @java.lang.Override
    public int getPanelCount() {
      return panelCount_;
    }
    /**
     * <pre>
     * number of associated panels
     * </pre>
     *
     * <code>int32 panel_count = 4 [json_name = "panelCount"];</code>
     * @param value The panelCount to set.
     * @return This builder for chaining.
     */
    public Builder setPanelCount(int value) {

      panelCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * number of associated panels
     * </pre>
     *
     * <code>int32 panel_count = 4 [json_name = "panelCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPanelCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      panelCount_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object resourceId_ = "";
    /**
     * <pre>
     * resource id of the dashboard
     * </pre>
     *
     * <code>string resource_id = 5 [json_name = "resourceId"];</code>
     * @return The resourceId.
     */
    public java.lang.String getResourceId() {
      java.lang.Object ref = resourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * resource id of the dashboard
     * </pre>
     *
     * <code>string resource_id = 5 [json_name = "resourceId"];</code>
     * @return The bytes for resourceId.
     */
    public com.google.protobuf.ByteString
        getResourceIdBytes() {
      java.lang.Object ref = resourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * resource id of the dashboard
     * </pre>
     *
     * <code>string resource_id = 5 [json_name = "resourceId"];</code>
     * @param value The resourceId to set.
     * @return This builder for chaining.
     */
    public Builder setResourceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceId_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * resource id of the dashboard
     * </pre>
     *
     * <code>string resource_id = 5 [json_name = "resourceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceId() {
      resourceId_ = getDefaultInstance().getResourceId();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * resource id of the dashboard
     * </pre>
     *
     * <code>string resource_id = 5 [json_name = "resourceId"];</code>
     * @param value The bytes for resourceId to set.
     * @return This builder for chaining.
     */
    public Builder setResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceId_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DashboardSummary)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DashboardSummary)
  private static final com.tcn.cloud.api.api.v0alpha.DashboardSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DashboardSummary();
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DashboardSummary>
      PARSER = new com.google.protobuf.AbstractParser<DashboardSummary>() {
    @java.lang.Override
    public DashboardSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<DashboardSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DashboardSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DashboardSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

