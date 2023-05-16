// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Wrapper DashboardQueuePreferences object for get response and update request
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.DashboardQueuePreferences}
 */
public final class DashboardQueuePreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DashboardQueuePreferences)
    DashboardQueuePreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DashboardQueuePreferences.newBuilder() to construct.
  private DashboardQueuePreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DashboardQueuePreferences() {
    defaultInfoSortByValue_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DashboardQueuePreferences();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DashboardQueuePreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DashboardQueuePreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.class, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder.class);
  }

  public static final int DEFAULT_INFO_VIEW_FIELD_NUMBER = 10;
  private boolean defaultInfoView_ = false;
  /**
   * <pre>
   * Default Queue/Hold table view.  'false' for icon view, 'true' for table view.
   * </pre>
   *
   * <code>bool default_info_view = 10 [json_name = "defaultInfoView"];</code>
   * @return The defaultInfoView.
   */
  @java.lang.Override
  public boolean getDefaultInfoView() {
    return defaultInfoView_;
  }

  public static final int DEFAULT_INFO_GROUPING_FIELD_NUMBER = 11;
  private boolean defaultInfoGrouping_ = false;
  /**
   * <pre>
   * Default Queue/Hold table grouping. 'false' for no grouping, 'true' for group by queue type.
   * </pre>
   *
   * <code>bool default_info_grouping = 11 [json_name = "defaultInfoGrouping"];</code>
   * @return The defaultInfoGrouping.
   */
  @java.lang.Override
  public boolean getDefaultInfoGrouping() {
    return defaultInfoGrouping_;
  }

  public static final int DEFAULT_SMALL_ICON_FIELD_NUMBER = 12;
  private boolean defaultSmallIcon_ = false;
  /**
   * <pre>
   * Default table icon size.  'true' for small, 'false' for large.
   * </pre>
   *
   * <code>bool default_small_icon = 12 [json_name = "defaultSmallIcon"];</code>
   * @return The defaultSmallIcon.
   */
  @java.lang.Override
  public boolean getDefaultSmallIcon() {
    return defaultSmallIcon_;
  }

  public static final int DEFAULT_DESCENDING_SORT_FIELD_NUMBER = 13;
  private boolean defaultDescendingSort_ = false;
  /**
   * <pre>
   * Default table sort direction. 'false' for descending, 'true' for ascending.
   * </pre>
   *
   * <code>bool default_descending_sort = 13 [json_name = "defaultDescendingSort"];</code>
   * @return The defaultDescendingSort.
   */
  @java.lang.Override
  public boolean getDefaultDescendingSort() {
    return defaultDescendingSort_;
  }

  public static final int DEFAULT_AGENT_SKILLS_FILTER_FIELD_NUMBER = 14;
  private long defaultAgentSkillsFilter_ = 0L;
  /**
   * <pre>
   * Default skills filter.  Holds a regional sid pointing to the filter in the xml_client_property table.  Default is no filtering ('-1').
   * </pre>
   *
   * <code>int64 default_agent_skills_filter = 14 [json_name = "defaultAgentSkillsFilter"];</code>
   * @return The defaultAgentSkillsFilter.
   */
  @java.lang.Override
  public long getDefaultAgentSkillsFilter() {
    return defaultAgentSkillsFilter_;
  }

  public static final int DEFAULT_INFO_TABLE_TEMPLATE_FIELD_NUMBER = 15;
  private long defaultInfoTableTemplate_ = 0L;
  /**
   * <pre>
   * Default table template. Holds a regional sid pointing to the filter in the xml_client_property table.  Default is no filtering ('0').
   * </pre>
   *
   * <code>int64 default_info_table_template = 15 [json_name = "defaultInfoTableTemplate"];</code>
   * @return The defaultInfoTableTemplate.
   */
  @java.lang.Override
  public long getDefaultInfoTableTemplate() {
    return defaultInfoTableTemplate_;
  }

  public static final int DEFAULT_INFO_SORT_BY_VALUE_FIELD_NUMBER = 16;
  private int defaultInfoSortByValue_ = 0;
  /**
   * <pre>
   * Default Queue/Hold Info Sort-By Value
   * </pre>
   *
   * <code>.api.commons.QueueInfoSortBy default_info_sort_by_value = 16 [json_name = "defaultInfoSortByValue"];</code>
   * @return The enum numeric value on the wire for defaultInfoSortByValue.
   */
  @java.lang.Override public int getDefaultInfoSortByValueValue() {
    return defaultInfoSortByValue_;
  }
  /**
   * <pre>
   * Default Queue/Hold Info Sort-By Value
   * </pre>
   *
   * <code>.api.commons.QueueInfoSortBy default_info_sort_by_value = 16 [json_name = "defaultInfoSortByValue"];</code>
   * @return The defaultInfoSortByValue.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.QueueInfoSortBy getDefaultInfoSortByValue() {
    com.tcn.cloud.api.api.commons.QueueInfoSortBy result = com.tcn.cloud.api.api.commons.QueueInfoSortBy.forNumber(defaultInfoSortByValue_);
    return result == null ? com.tcn.cloud.api.api.commons.QueueInfoSortBy.UNRECOGNIZED : result;
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
    if (defaultInfoView_ != false) {
      output.writeBool(10, defaultInfoView_);
    }
    if (defaultInfoGrouping_ != false) {
      output.writeBool(11, defaultInfoGrouping_);
    }
    if (defaultSmallIcon_ != false) {
      output.writeBool(12, defaultSmallIcon_);
    }
    if (defaultDescendingSort_ != false) {
      output.writeBool(13, defaultDescendingSort_);
    }
    if (defaultAgentSkillsFilter_ != 0L) {
      output.writeInt64(14, defaultAgentSkillsFilter_);
    }
    if (defaultInfoTableTemplate_ != 0L) {
      output.writeInt64(15, defaultInfoTableTemplate_);
    }
    if (defaultInfoSortByValue_ != com.tcn.cloud.api.api.commons.QueueInfoSortBy.QUEUE_INFO_SORT_BY_NONE.getNumber()) {
      output.writeEnum(16, defaultInfoSortByValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (defaultInfoView_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(10, defaultInfoView_);
    }
    if (defaultInfoGrouping_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(11, defaultInfoGrouping_);
    }
    if (defaultSmallIcon_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(12, defaultSmallIcon_);
    }
    if (defaultDescendingSort_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(13, defaultDescendingSort_);
    }
    if (defaultAgentSkillsFilter_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(14, defaultAgentSkillsFilter_);
    }
    if (defaultInfoTableTemplate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(15, defaultInfoTableTemplate_);
    }
    if (defaultInfoSortByValue_ != com.tcn.cloud.api.api.commons.QueueInfoSortBy.QUEUE_INFO_SORT_BY_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(16, defaultInfoSortByValue_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences other = (com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences) obj;

    if (getDefaultInfoView()
        != other.getDefaultInfoView()) return false;
    if (getDefaultInfoGrouping()
        != other.getDefaultInfoGrouping()) return false;
    if (getDefaultSmallIcon()
        != other.getDefaultSmallIcon()) return false;
    if (getDefaultDescendingSort()
        != other.getDefaultDescendingSort()) return false;
    if (getDefaultAgentSkillsFilter()
        != other.getDefaultAgentSkillsFilter()) return false;
    if (getDefaultInfoTableTemplate()
        != other.getDefaultInfoTableTemplate()) return false;
    if (defaultInfoSortByValue_ != other.defaultInfoSortByValue_) return false;
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
    hash = (37 * hash) + DEFAULT_INFO_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDefaultInfoView());
    hash = (37 * hash) + DEFAULT_INFO_GROUPING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDefaultInfoGrouping());
    hash = (37 * hash) + DEFAULT_SMALL_ICON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDefaultSmallIcon());
    hash = (37 * hash) + DEFAULT_DESCENDING_SORT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDefaultDescendingSort());
    hash = (37 * hash) + DEFAULT_AGENT_SKILLS_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDefaultAgentSkillsFilter());
    hash = (37 * hash) + DEFAULT_INFO_TABLE_TEMPLATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDefaultInfoTableTemplate());
    hash = (37 * hash) + DEFAULT_INFO_SORT_BY_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + defaultInfoSortByValue_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences prototype) {
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
   * Wrapper DashboardQueuePreferences object for get response and update request
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.DashboardQueuePreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DashboardQueuePreferences)
      com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DashboardQueuePreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DashboardQueuePreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.class, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.newBuilder()
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
      defaultInfoView_ = false;
      defaultInfoGrouping_ = false;
      defaultSmallIcon_ = false;
      defaultDescendingSort_ = false;
      defaultAgentSkillsFilter_ = 0L;
      defaultInfoTableTemplate_ = 0L;
      defaultInfoSortByValue_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DashboardQueuePreferences_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences build() {
      com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences result = new com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.defaultInfoView_ = defaultInfoView_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.defaultInfoGrouping_ = defaultInfoGrouping_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.defaultSmallIcon_ = defaultSmallIcon_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.defaultDescendingSort_ = defaultDescendingSort_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.defaultAgentSkillsFilter_ = defaultAgentSkillsFilter_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.defaultInfoTableTemplate_ = defaultInfoTableTemplate_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.defaultInfoSortByValue_ = defaultInfoSortByValue_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance()) return this;
      if (other.getDefaultInfoView() != false) {
        setDefaultInfoView(other.getDefaultInfoView());
      }
      if (other.getDefaultInfoGrouping() != false) {
        setDefaultInfoGrouping(other.getDefaultInfoGrouping());
      }
      if (other.getDefaultSmallIcon() != false) {
        setDefaultSmallIcon(other.getDefaultSmallIcon());
      }
      if (other.getDefaultDescendingSort() != false) {
        setDefaultDescendingSort(other.getDefaultDescendingSort());
      }
      if (other.getDefaultAgentSkillsFilter() != 0L) {
        setDefaultAgentSkillsFilter(other.getDefaultAgentSkillsFilter());
      }
      if (other.getDefaultInfoTableTemplate() != 0L) {
        setDefaultInfoTableTemplate(other.getDefaultInfoTableTemplate());
      }
      if (other.defaultInfoSortByValue_ != 0) {
        setDefaultInfoSortByValueValue(other.getDefaultInfoSortByValueValue());
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
            case 80: {
              defaultInfoView_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 80
            case 88: {
              defaultInfoGrouping_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 88
            case 96: {
              defaultSmallIcon_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 96
            case 104: {
              defaultDescendingSort_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 104
            case 112: {
              defaultAgentSkillsFilter_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 112
            case 120: {
              defaultInfoTableTemplate_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 120
            case 128: {
              defaultInfoSortByValue_ = input.readEnum();
              bitField0_ |= 0x00000040;
              break;
            } // case 128
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

    private boolean defaultInfoView_ ;
    /**
     * <pre>
     * Default Queue/Hold table view.  'false' for icon view, 'true' for table view.
     * </pre>
     *
     * <code>bool default_info_view = 10 [json_name = "defaultInfoView"];</code>
     * @return The defaultInfoView.
     */
    @java.lang.Override
    public boolean getDefaultInfoView() {
      return defaultInfoView_;
    }
    /**
     * <pre>
     * Default Queue/Hold table view.  'false' for icon view, 'true' for table view.
     * </pre>
     *
     * <code>bool default_info_view = 10 [json_name = "defaultInfoView"];</code>
     * @param value The defaultInfoView to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultInfoView(boolean value) {

      defaultInfoView_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default Queue/Hold table view.  'false' for icon view, 'true' for table view.
     * </pre>
     *
     * <code>bool default_info_view = 10 [json_name = "defaultInfoView"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultInfoView() {
      bitField0_ = (bitField0_ & ~0x00000001);
      defaultInfoView_ = false;
      onChanged();
      return this;
    }

    private boolean defaultInfoGrouping_ ;
    /**
     * <pre>
     * Default Queue/Hold table grouping. 'false' for no grouping, 'true' for group by queue type.
     * </pre>
     *
     * <code>bool default_info_grouping = 11 [json_name = "defaultInfoGrouping"];</code>
     * @return The defaultInfoGrouping.
     */
    @java.lang.Override
    public boolean getDefaultInfoGrouping() {
      return defaultInfoGrouping_;
    }
    /**
     * <pre>
     * Default Queue/Hold table grouping. 'false' for no grouping, 'true' for group by queue type.
     * </pre>
     *
     * <code>bool default_info_grouping = 11 [json_name = "defaultInfoGrouping"];</code>
     * @param value The defaultInfoGrouping to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultInfoGrouping(boolean value) {

      defaultInfoGrouping_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default Queue/Hold table grouping. 'false' for no grouping, 'true' for group by queue type.
     * </pre>
     *
     * <code>bool default_info_grouping = 11 [json_name = "defaultInfoGrouping"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultInfoGrouping() {
      bitField0_ = (bitField0_ & ~0x00000002);
      defaultInfoGrouping_ = false;
      onChanged();
      return this;
    }

    private boolean defaultSmallIcon_ ;
    /**
     * <pre>
     * Default table icon size.  'true' for small, 'false' for large.
     * </pre>
     *
     * <code>bool default_small_icon = 12 [json_name = "defaultSmallIcon"];</code>
     * @return The defaultSmallIcon.
     */
    @java.lang.Override
    public boolean getDefaultSmallIcon() {
      return defaultSmallIcon_;
    }
    /**
     * <pre>
     * Default table icon size.  'true' for small, 'false' for large.
     * </pre>
     *
     * <code>bool default_small_icon = 12 [json_name = "defaultSmallIcon"];</code>
     * @param value The defaultSmallIcon to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultSmallIcon(boolean value) {

      defaultSmallIcon_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default table icon size.  'true' for small, 'false' for large.
     * </pre>
     *
     * <code>bool default_small_icon = 12 [json_name = "defaultSmallIcon"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultSmallIcon() {
      bitField0_ = (bitField0_ & ~0x00000004);
      defaultSmallIcon_ = false;
      onChanged();
      return this;
    }

    private boolean defaultDescendingSort_ ;
    /**
     * <pre>
     * Default table sort direction. 'false' for descending, 'true' for ascending.
     * </pre>
     *
     * <code>bool default_descending_sort = 13 [json_name = "defaultDescendingSort"];</code>
     * @return The defaultDescendingSort.
     */
    @java.lang.Override
    public boolean getDefaultDescendingSort() {
      return defaultDescendingSort_;
    }
    /**
     * <pre>
     * Default table sort direction. 'false' for descending, 'true' for ascending.
     * </pre>
     *
     * <code>bool default_descending_sort = 13 [json_name = "defaultDescendingSort"];</code>
     * @param value The defaultDescendingSort to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultDescendingSort(boolean value) {

      defaultDescendingSort_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default table sort direction. 'false' for descending, 'true' for ascending.
     * </pre>
     *
     * <code>bool default_descending_sort = 13 [json_name = "defaultDescendingSort"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultDescendingSort() {
      bitField0_ = (bitField0_ & ~0x00000008);
      defaultDescendingSort_ = false;
      onChanged();
      return this;
    }

    private long defaultAgentSkillsFilter_ ;
    /**
     * <pre>
     * Default skills filter.  Holds a regional sid pointing to the filter in the xml_client_property table.  Default is no filtering ('-1').
     * </pre>
     *
     * <code>int64 default_agent_skills_filter = 14 [json_name = "defaultAgentSkillsFilter"];</code>
     * @return The defaultAgentSkillsFilter.
     */
    @java.lang.Override
    public long getDefaultAgentSkillsFilter() {
      return defaultAgentSkillsFilter_;
    }
    /**
     * <pre>
     * Default skills filter.  Holds a regional sid pointing to the filter in the xml_client_property table.  Default is no filtering ('-1').
     * </pre>
     *
     * <code>int64 default_agent_skills_filter = 14 [json_name = "defaultAgentSkillsFilter"];</code>
     * @param value The defaultAgentSkillsFilter to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultAgentSkillsFilter(long value) {

      defaultAgentSkillsFilter_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default skills filter.  Holds a regional sid pointing to the filter in the xml_client_property table.  Default is no filtering ('-1').
     * </pre>
     *
     * <code>int64 default_agent_skills_filter = 14 [json_name = "defaultAgentSkillsFilter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultAgentSkillsFilter() {
      bitField0_ = (bitField0_ & ~0x00000010);
      defaultAgentSkillsFilter_ = 0L;
      onChanged();
      return this;
    }

    private long defaultInfoTableTemplate_ ;
    /**
     * <pre>
     * Default table template. Holds a regional sid pointing to the filter in the xml_client_property table.  Default is no filtering ('0').
     * </pre>
     *
     * <code>int64 default_info_table_template = 15 [json_name = "defaultInfoTableTemplate"];</code>
     * @return The defaultInfoTableTemplate.
     */
    @java.lang.Override
    public long getDefaultInfoTableTemplate() {
      return defaultInfoTableTemplate_;
    }
    /**
     * <pre>
     * Default table template. Holds a regional sid pointing to the filter in the xml_client_property table.  Default is no filtering ('0').
     * </pre>
     *
     * <code>int64 default_info_table_template = 15 [json_name = "defaultInfoTableTemplate"];</code>
     * @param value The defaultInfoTableTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultInfoTableTemplate(long value) {

      defaultInfoTableTemplate_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default table template. Holds a regional sid pointing to the filter in the xml_client_property table.  Default is no filtering ('0').
     * </pre>
     *
     * <code>int64 default_info_table_template = 15 [json_name = "defaultInfoTableTemplate"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultInfoTableTemplate() {
      bitField0_ = (bitField0_ & ~0x00000020);
      defaultInfoTableTemplate_ = 0L;
      onChanged();
      return this;
    }

    private int defaultInfoSortByValue_ = 0;
    /**
     * <pre>
     * Default Queue/Hold Info Sort-By Value
     * </pre>
     *
     * <code>.api.commons.QueueInfoSortBy default_info_sort_by_value = 16 [json_name = "defaultInfoSortByValue"];</code>
     * @return The enum numeric value on the wire for defaultInfoSortByValue.
     */
    @java.lang.Override public int getDefaultInfoSortByValueValue() {
      return defaultInfoSortByValue_;
    }
    /**
     * <pre>
     * Default Queue/Hold Info Sort-By Value
     * </pre>
     *
     * <code>.api.commons.QueueInfoSortBy default_info_sort_by_value = 16 [json_name = "defaultInfoSortByValue"];</code>
     * @param value The enum numeric value on the wire for defaultInfoSortByValue to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultInfoSortByValueValue(int value) {
      defaultInfoSortByValue_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default Queue/Hold Info Sort-By Value
     * </pre>
     *
     * <code>.api.commons.QueueInfoSortBy default_info_sort_by_value = 16 [json_name = "defaultInfoSortByValue"];</code>
     * @return The defaultInfoSortByValue.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.QueueInfoSortBy getDefaultInfoSortByValue() {
      com.tcn.cloud.api.api.commons.QueueInfoSortBy result = com.tcn.cloud.api.api.commons.QueueInfoSortBy.forNumber(defaultInfoSortByValue_);
      return result == null ? com.tcn.cloud.api.api.commons.QueueInfoSortBy.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Default Queue/Hold Info Sort-By Value
     * </pre>
     *
     * <code>.api.commons.QueueInfoSortBy default_info_sort_by_value = 16 [json_name = "defaultInfoSortByValue"];</code>
     * @param value The defaultInfoSortByValue to set.
     * @return This builder for chaining.
     */
    public Builder setDefaultInfoSortByValue(com.tcn.cloud.api.api.commons.QueueInfoSortBy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000040;
      defaultInfoSortByValue_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Default Queue/Hold Info Sort-By Value
     * </pre>
     *
     * <code>.api.commons.QueueInfoSortBy default_info_sort_by_value = 16 [json_name = "defaultInfoSortByValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDefaultInfoSortByValue() {
      bitField0_ = (bitField0_ & ~0x00000040);
      defaultInfoSortByValue_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DashboardQueuePreferences)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DashboardQueuePreferences)
  private static final com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences();
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DashboardQueuePreferences>
      PARSER = new com.google.protobuf.AbstractParser<DashboardQueuePreferences>() {
    @java.lang.Override
    public DashboardQueuePreferences parsePartialFrom(
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

  public static com.google.protobuf.Parser<DashboardQueuePreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DashboardQueuePreferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

