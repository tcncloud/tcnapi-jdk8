// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * ReplaceNode
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.insights.ReplaceNode}
 */
public final class ReplaceNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.ReplaceNode)
    ReplaceNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplaceNode.newBuilder() to construct.
  private ReplaceNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplaceNode() {
    columnReplacements_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReplaceNode();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ReplaceNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ReplaceNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode.class, com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode.Builder.class);
  }

  public static final int COLUMN_REPLACEMENTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement> columnReplacements_;
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement> getColumnReplacementsList() {
    return columnReplacements_;
  }
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder> 
      getColumnReplacementsOrBuilderList() {
    return columnReplacements_;
  }
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  @java.lang.Override
  public int getColumnReplacementsCount() {
    return columnReplacements_.size();
  }
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement getColumnReplacements(int index) {
    return columnReplacements_.get(index);
  }
  /**
   * <pre>
   * List of column replacements
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder getColumnReplacementsOrBuilder(
      int index) {
    return columnReplacements_.get(index);
  }

  public static final int IS_COMPLEX_FIELD_NUMBER = 2;
  private boolean isComplex_ = false;
  /**
   * <pre>
   * Is complex
   * </pre>
   *
   * <code>bool is_complex = 2 [json_name = "isComplex"];</code>
   * @return The isComplex.
   */
  @java.lang.Override
  public boolean getIsComplex() {
    return isComplex_;
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
    for (int i = 0; i < columnReplacements_.size(); i++) {
      output.writeMessage(1, columnReplacements_.get(i));
    }
    if (isComplex_ != false) {
      output.writeBool(2, isComplex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < columnReplacements_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, columnReplacements_.get(i));
    }
    if (isComplex_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isComplex_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode other = (com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode) obj;

    if (!getColumnReplacementsList()
        .equals(other.getColumnReplacementsList())) return false;
    if (getIsComplex()
        != other.getIsComplex()) return false;
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
    if (getColumnReplacementsCount() > 0) {
      hash = (37 * hash) + COLUMN_REPLACEMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getColumnReplacementsList().hashCode();
    }
    hash = (37 * hash) + IS_COMPLEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsComplex());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode prototype) {
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
   * ReplaceNode
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.insights.ReplaceNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.ReplaceNode)
      com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ReplaceNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ReplaceNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode.class, com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode.newBuilder()
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
      if (columnReplacementsBuilder_ == null) {
        columnReplacements_ = java.util.Collections.emptyList();
      } else {
        columnReplacements_ = null;
        columnReplacementsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      isComplex_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_ReplaceNode_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode build() {
      com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode result = new com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode result) {
      if (columnReplacementsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          columnReplacements_ = java.util.Collections.unmodifiableList(columnReplacements_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.columnReplacements_ = columnReplacements_;
      } else {
        result.columnReplacements_ = columnReplacementsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isComplex_ = isComplex_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode.getDefaultInstance()) return this;
      if (columnReplacementsBuilder_ == null) {
        if (!other.columnReplacements_.isEmpty()) {
          if (columnReplacements_.isEmpty()) {
            columnReplacements_ = other.columnReplacements_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColumnReplacementsIsMutable();
            columnReplacements_.addAll(other.columnReplacements_);
          }
          onChanged();
        }
      } else {
        if (!other.columnReplacements_.isEmpty()) {
          if (columnReplacementsBuilder_.isEmpty()) {
            columnReplacementsBuilder_.dispose();
            columnReplacementsBuilder_ = null;
            columnReplacements_ = other.columnReplacements_;
            bitField0_ = (bitField0_ & ~0x00000001);
            columnReplacementsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColumnReplacementsFieldBuilder() : null;
          } else {
            columnReplacementsBuilder_.addAllMessages(other.columnReplacements_);
          }
        }
      }
      if (other.getIsComplex() != false) {
        setIsComplex(other.getIsComplex());
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
              com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.parser(),
                      extensionRegistry);
              if (columnReplacementsBuilder_ == null) {
                ensureColumnReplacementsIsMutable();
                columnReplacements_.add(m);
              } else {
                columnReplacementsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              isComplex_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement> columnReplacements_ =
      java.util.Collections.emptyList();
    private void ensureColumnReplacementsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        columnReplacements_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement>(columnReplacements_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder> columnReplacementsBuilder_;

    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement> getColumnReplacementsList() {
      if (columnReplacementsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(columnReplacements_);
      } else {
        return columnReplacementsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public int getColumnReplacementsCount() {
      if (columnReplacementsBuilder_ == null) {
        return columnReplacements_.size();
      } else {
        return columnReplacementsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement getColumnReplacements(int index) {
      if (columnReplacementsBuilder_ == null) {
        return columnReplacements_.get(index);
      } else {
        return columnReplacementsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder setColumnReplacements(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement value) {
      if (columnReplacementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnReplacementsIsMutable();
        columnReplacements_.set(index, value);
        onChanged();
      } else {
        columnReplacementsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder setColumnReplacements(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder builderForValue) {
      if (columnReplacementsBuilder_ == null) {
        ensureColumnReplacementsIsMutable();
        columnReplacements_.set(index, builderForValue.build());
        onChanged();
      } else {
        columnReplacementsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder addColumnReplacements(com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement value) {
      if (columnReplacementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnReplacementsIsMutable();
        columnReplacements_.add(value);
        onChanged();
      } else {
        columnReplacementsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder addColumnReplacements(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement value) {
      if (columnReplacementsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnReplacementsIsMutable();
        columnReplacements_.add(index, value);
        onChanged();
      } else {
        columnReplacementsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder addColumnReplacements(
        com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder builderForValue) {
      if (columnReplacementsBuilder_ == null) {
        ensureColumnReplacementsIsMutable();
        columnReplacements_.add(builderForValue.build());
        onChanged();
      } else {
        columnReplacementsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder addColumnReplacements(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder builderForValue) {
      if (columnReplacementsBuilder_ == null) {
        ensureColumnReplacementsIsMutable();
        columnReplacements_.add(index, builderForValue.build());
        onChanged();
      } else {
        columnReplacementsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder addAllColumnReplacements(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement> values) {
      if (columnReplacementsBuilder_ == null) {
        ensureColumnReplacementsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, columnReplacements_);
        onChanged();
      } else {
        columnReplacementsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder clearColumnReplacements() {
      if (columnReplacementsBuilder_ == null) {
        columnReplacements_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        columnReplacementsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public Builder removeColumnReplacements(int index) {
      if (columnReplacementsBuilder_ == null) {
        ensureColumnReplacementsIsMutable();
        columnReplacements_.remove(index);
        onChanged();
      } else {
        columnReplacementsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder getColumnReplacementsBuilder(
        int index) {
      return getColumnReplacementsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder getColumnReplacementsOrBuilder(
        int index) {
      if (columnReplacementsBuilder_ == null) {
        return columnReplacements_.get(index);  } else {
        return columnReplacementsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder> 
         getColumnReplacementsOrBuilderList() {
      if (columnReplacementsBuilder_ != null) {
        return columnReplacementsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(columnReplacements_);
      }
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder addColumnReplacementsBuilder() {
      return getColumnReplacementsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.getDefaultInstance());
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder addColumnReplacementsBuilder(
        int index) {
      return getColumnReplacementsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.getDefaultInstance());
    }
    /**
     * <pre>
     * List of column replacements
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.ColumnReplacement column_replacements = 1 [json_name = "columnReplacements"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder> 
         getColumnReplacementsBuilderList() {
      return getColumnReplacementsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder> 
        getColumnReplacementsFieldBuilder() {
      if (columnReplacementsBuilder_ == null) {
        columnReplacementsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacement.Builder, com.tcn.cloud.api.api.v1alpha1.insights.ColumnReplacementOrBuilder>(
                columnReplacements_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        columnReplacements_ = null;
      }
      return columnReplacementsBuilder_;
    }

    private boolean isComplex_ ;
    /**
     * <pre>
     * Is complex
     * </pre>
     *
     * <code>bool is_complex = 2 [json_name = "isComplex"];</code>
     * @return The isComplex.
     */
    @java.lang.Override
    public boolean getIsComplex() {
      return isComplex_;
    }
    /**
     * <pre>
     * Is complex
     * </pre>
     *
     * <code>bool is_complex = 2 [json_name = "isComplex"];</code>
     * @param value The isComplex to set.
     * @return This builder for chaining.
     */
    public Builder setIsComplex(boolean value) {

      isComplex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Is complex
     * </pre>
     *
     * <code>bool is_complex = 2 [json_name = "isComplex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsComplex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isComplex_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.ReplaceNode)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.ReplaceNode)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplaceNode>
      PARSER = new com.google.protobuf.AbstractParser<ReplaceNode>() {
    @java.lang.Override
    public ReplaceNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplaceNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplaceNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ReplaceNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

