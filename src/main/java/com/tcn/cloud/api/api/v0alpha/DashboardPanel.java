// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * location fields subject to change
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.DashboardPanel}
 */
public final class DashboardPanel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DashboardPanel)
    DashboardPanelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DashboardPanel.newBuilder() to construct.
  private DashboardPanel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DashboardPanel() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DashboardPanel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardPanel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardPanel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DashboardPanel.class, com.tcn.cloud.api.api.v0alpha.DashboardPanel.Builder.class);
  }

  public static final int PANEL_SOURCE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.PanelSource panelSource_;
  /**
   * <pre>
   * panel_source determines the fields needed to
   * retrieve the panel data and is used to determine
   * who to pull the data from
   * </pre>
   *
   * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
   * @return Whether the panelSource field is set.
   */
  @java.lang.Override
  public boolean hasPanelSource() {
    return panelSource_ != null;
  }
  /**
   * <pre>
   * panel_source determines the fields needed to
   * retrieve the panel data and is used to determine
   * who to pull the data from
   * </pre>
   *
   * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
   * @return The panelSource.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PanelSource getPanelSource() {
    return panelSource_ == null ? com.tcn.cloud.api.api.v0alpha.PanelSource.getDefaultInstance() : panelSource_;
  }
  /**
   * <pre>
   * panel_source determines the fields needed to
   * retrieve the panel data and is used to determine
   * who to pull the data from
   * </pre>
   *
   * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PanelSourceOrBuilder getPanelSourceOrBuilder() {
    return panelSource_ == null ? com.tcn.cloud.api.api.v0alpha.PanelSource.getDefaultInstance() : panelSource_;
  }

  public static final int ROW_LENGTH_FIELD_NUMBER = 2;
  private long rowLength_ = 0L;
  /**
   * <pre>
   * height of panel
   * </pre>
   *
   * <code>int64 row_length = 2 [json_name = "rowLength"];</code>
   * @return The rowLength.
   */
  @java.lang.Override
  public long getRowLength() {
    return rowLength_;
  }

  public static final int COLUMN_LENGTH_FIELD_NUMBER = 3;
  private long columnLength_ = 0L;
  /**
   * <pre>
   * length of panel
   * </pre>
   *
   * <code>int64 column_length = 3 [json_name = "columnLength"];</code>
   * @return The columnLength.
   */
  @java.lang.Override
  public long getColumnLength() {
    return columnLength_;
  }

  public static final int ROW_START_FIELD_NUMBER = 4;
  private long rowStart_ = 0L;
  /**
   * <pre>
   * absolute x position of panel
   * </pre>
   *
   * <code>int64 row_start = 4 [json_name = "rowStart"];</code>
   * @return The rowStart.
   */
  @java.lang.Override
  public long getRowStart() {
    return rowStart_;
  }

  public static final int COLUMN_START_FIELD_NUMBER = 5;
  private long columnStart_ = 0L;
  /**
   * <pre>
   * absoulute y position of panel
   * </pre>
   *
   * <code>int64 column_start = 5 [json_name = "columnStart"];</code>
   * @return The columnStart.
   */
  @java.lang.Override
  public long getColumnStart() {
    return columnStart_;
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
    if (panelSource_ != null) {
      output.writeMessage(1, getPanelSource());
    }
    if (rowLength_ != 0L) {
      output.writeInt64(2, rowLength_);
    }
    if (columnLength_ != 0L) {
      output.writeInt64(3, columnLength_);
    }
    if (rowStart_ != 0L) {
      output.writeInt64(4, rowStart_);
    }
    if (columnStart_ != 0L) {
      output.writeInt64(5, columnStart_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (panelSource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPanelSource());
    }
    if (rowLength_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, rowLength_);
    }
    if (columnLength_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, columnLength_);
    }
    if (rowStart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, rowStart_);
    }
    if (columnStart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, columnStart_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DashboardPanel)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DashboardPanel other = (com.tcn.cloud.api.api.v0alpha.DashboardPanel) obj;

    if (hasPanelSource() != other.hasPanelSource()) return false;
    if (hasPanelSource()) {
      if (!getPanelSource()
          .equals(other.getPanelSource())) return false;
    }
    if (getRowLength()
        != other.getRowLength()) return false;
    if (getColumnLength()
        != other.getColumnLength()) return false;
    if (getRowStart()
        != other.getRowStart()) return false;
    if (getColumnStart()
        != other.getColumnStart()) return false;
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
    if (hasPanelSource()) {
      hash = (37 * hash) + PANEL_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getPanelSource().hashCode();
    }
    hash = (37 * hash) + ROW_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRowLength());
    hash = (37 * hash) + COLUMN_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getColumnLength());
    hash = (37 * hash) + ROW_START_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRowStart());
    hash = (37 * hash) + COLUMN_START_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getColumnStart());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DashboardPanel prototype) {
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
   * location fields subject to change
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.DashboardPanel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DashboardPanel)
      com.tcn.cloud.api.api.v0alpha.DashboardPanelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardPanel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardPanel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DashboardPanel.class, com.tcn.cloud.api.api.v0alpha.DashboardPanel.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DashboardPanel.newBuilder()
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
      panelSource_ = null;
      if (panelSourceBuilder_ != null) {
        panelSourceBuilder_.dispose();
        panelSourceBuilder_ = null;
      }
      rowLength_ = 0L;
      columnLength_ = 0L;
      rowStart_ = 0L;
      columnStart_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DashboardPanel_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardPanel getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DashboardPanel.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardPanel build() {
      com.tcn.cloud.api.api.v0alpha.DashboardPanel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DashboardPanel buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DashboardPanel result = new com.tcn.cloud.api.api.v0alpha.DashboardPanel(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DashboardPanel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.panelSource_ = panelSourceBuilder_ == null
            ? panelSource_
            : panelSourceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rowLength_ = rowLength_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.columnLength_ = columnLength_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.rowStart_ = rowStart_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.columnStart_ = columnStart_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DashboardPanel) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DashboardPanel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DashboardPanel other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DashboardPanel.getDefaultInstance()) return this;
      if (other.hasPanelSource()) {
        mergePanelSource(other.getPanelSource());
      }
      if (other.getRowLength() != 0L) {
        setRowLength(other.getRowLength());
      }
      if (other.getColumnLength() != 0L) {
        setColumnLength(other.getColumnLength());
      }
      if (other.getRowStart() != 0L) {
        setRowStart(other.getRowStart());
      }
      if (other.getColumnStart() != 0L) {
        setColumnStart(other.getColumnStart());
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
                  getPanelSourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              rowLength_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              columnLength_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              rowStart_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              columnStart_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private com.tcn.cloud.api.api.v0alpha.PanelSource panelSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PanelSource, com.tcn.cloud.api.api.v0alpha.PanelSource.Builder, com.tcn.cloud.api.api.v0alpha.PanelSourceOrBuilder> panelSourceBuilder_;
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     * @return Whether the panelSource field is set.
     */
    public boolean hasPanelSource() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     * @return The panelSource.
     */
    public com.tcn.cloud.api.api.v0alpha.PanelSource getPanelSource() {
      if (panelSourceBuilder_ == null) {
        return panelSource_ == null ? com.tcn.cloud.api.api.v0alpha.PanelSource.getDefaultInstance() : panelSource_;
      } else {
        return panelSourceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     */
    public Builder setPanelSource(com.tcn.cloud.api.api.v0alpha.PanelSource value) {
      if (panelSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        panelSource_ = value;
      } else {
        panelSourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     */
    public Builder setPanelSource(
        com.tcn.cloud.api.api.v0alpha.PanelSource.Builder builderForValue) {
      if (panelSourceBuilder_ == null) {
        panelSource_ = builderForValue.build();
      } else {
        panelSourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     */
    public Builder mergePanelSource(com.tcn.cloud.api.api.v0alpha.PanelSource value) {
      if (panelSourceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          panelSource_ != null &&
          panelSource_ != com.tcn.cloud.api.api.v0alpha.PanelSource.getDefaultInstance()) {
          getPanelSourceBuilder().mergeFrom(value);
        } else {
          panelSource_ = value;
        }
      } else {
        panelSourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     */
    public Builder clearPanelSource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      panelSource_ = null;
      if (panelSourceBuilder_ != null) {
        panelSourceBuilder_.dispose();
        panelSourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PanelSource.Builder getPanelSourceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPanelSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PanelSourceOrBuilder getPanelSourceOrBuilder() {
      if (panelSourceBuilder_ != null) {
        return panelSourceBuilder_.getMessageOrBuilder();
      } else {
        return panelSource_ == null ?
            com.tcn.cloud.api.api.v0alpha.PanelSource.getDefaultInstance() : panelSource_;
      }
    }
    /**
     * <pre>
     * panel_source determines the fields needed to
     * retrieve the panel data and is used to determine
     * who to pull the data from
     * </pre>
     *
     * <code>.api.v0alpha.PanelSource panel_source = 1 [json_name = "panelSource"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PanelSource, com.tcn.cloud.api.api.v0alpha.PanelSource.Builder, com.tcn.cloud.api.api.v0alpha.PanelSourceOrBuilder> 
        getPanelSourceFieldBuilder() {
      if (panelSourceBuilder_ == null) {
        panelSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.PanelSource, com.tcn.cloud.api.api.v0alpha.PanelSource.Builder, com.tcn.cloud.api.api.v0alpha.PanelSourceOrBuilder>(
                getPanelSource(),
                getParentForChildren(),
                isClean());
        panelSource_ = null;
      }
      return panelSourceBuilder_;
    }

    private long rowLength_ ;
    /**
     * <pre>
     * height of panel
     * </pre>
     *
     * <code>int64 row_length = 2 [json_name = "rowLength"];</code>
     * @return The rowLength.
     */
    @java.lang.Override
    public long getRowLength() {
      return rowLength_;
    }
    /**
     * <pre>
     * height of panel
     * </pre>
     *
     * <code>int64 row_length = 2 [json_name = "rowLength"];</code>
     * @param value The rowLength to set.
     * @return This builder for chaining.
     */
    public Builder setRowLength(long value) {

      rowLength_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * height of panel
     * </pre>
     *
     * <code>int64 row_length = 2 [json_name = "rowLength"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRowLength() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rowLength_ = 0L;
      onChanged();
      return this;
    }

    private long columnLength_ ;
    /**
     * <pre>
     * length of panel
     * </pre>
     *
     * <code>int64 column_length = 3 [json_name = "columnLength"];</code>
     * @return The columnLength.
     */
    @java.lang.Override
    public long getColumnLength() {
      return columnLength_;
    }
    /**
     * <pre>
     * length of panel
     * </pre>
     *
     * <code>int64 column_length = 3 [json_name = "columnLength"];</code>
     * @param value The columnLength to set.
     * @return This builder for chaining.
     */
    public Builder setColumnLength(long value) {

      columnLength_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * length of panel
     * </pre>
     *
     * <code>int64 column_length = 3 [json_name = "columnLength"];</code>
     * @return This builder for chaining.
     */
    public Builder clearColumnLength() {
      bitField0_ = (bitField0_ & ~0x00000004);
      columnLength_ = 0L;
      onChanged();
      return this;
    }

    private long rowStart_ ;
    /**
     * <pre>
     * absolute x position of panel
     * </pre>
     *
     * <code>int64 row_start = 4 [json_name = "rowStart"];</code>
     * @return The rowStart.
     */
    @java.lang.Override
    public long getRowStart() {
      return rowStart_;
    }
    /**
     * <pre>
     * absolute x position of panel
     * </pre>
     *
     * <code>int64 row_start = 4 [json_name = "rowStart"];</code>
     * @param value The rowStart to set.
     * @return This builder for chaining.
     */
    public Builder setRowStart(long value) {

      rowStart_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * absolute x position of panel
     * </pre>
     *
     * <code>int64 row_start = 4 [json_name = "rowStart"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRowStart() {
      bitField0_ = (bitField0_ & ~0x00000008);
      rowStart_ = 0L;
      onChanged();
      return this;
    }

    private long columnStart_ ;
    /**
     * <pre>
     * absoulute y position of panel
     * </pre>
     *
     * <code>int64 column_start = 5 [json_name = "columnStart"];</code>
     * @return The columnStart.
     */
    @java.lang.Override
    public long getColumnStart() {
      return columnStart_;
    }
    /**
     * <pre>
     * absoulute y position of panel
     * </pre>
     *
     * <code>int64 column_start = 5 [json_name = "columnStart"];</code>
     * @param value The columnStart to set.
     * @return This builder for chaining.
     */
    public Builder setColumnStart(long value) {

      columnStart_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * absoulute y position of panel
     * </pre>
     *
     * <code>int64 column_start = 5 [json_name = "columnStart"];</code>
     * @return This builder for chaining.
     */
    public Builder clearColumnStart() {
      bitField0_ = (bitField0_ & ~0x00000010);
      columnStart_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DashboardPanel)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DashboardPanel)
  private static final com.tcn.cloud.api.api.v0alpha.DashboardPanel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DashboardPanel();
  }

  public static com.tcn.cloud.api.api.v0alpha.DashboardPanel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DashboardPanel>
      PARSER = new com.google.protobuf.AbstractParser<DashboardPanel>() {
    @java.lang.Override
    public DashboardPanel parsePartialFrom(
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

  public static com.google.protobuf.Parser<DashboardPanel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DashboardPanel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DashboardPanel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

