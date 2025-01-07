// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * AggregateNode describes which columns to aggregate
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.insights.AggregateNode}
 */
@java.lang.Deprecated public final class AggregateNode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.AggregateNode)
    AggregateNodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AggregateNode.newBuilder() to construct.
  private AggregateNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AggregateNode() {
    aggregationColumns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AggregateNode();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_AggregateNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_AggregateNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode.class, com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode.Builder.class);
  }

  public static final int AGGREGATION_COLUMNS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn> aggregationColumns_;
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn> getAggregationColumnsList() {
    return aggregationColumns_;
  }
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder> 
      getAggregationColumnsOrBuilderList() {
    return aggregationColumns_;
  }
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  @java.lang.Override
  public int getAggregationColumnsCount() {
    return aggregationColumns_.size();
  }
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn getAggregationColumns(int index) {
    return aggregationColumns_.get(index);
  }
  /**
   * <pre>
   * Aggregation columns
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder getAggregationColumnsOrBuilder(
      int index) {
    return aggregationColumns_.get(index);
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
    for (int i = 0; i < aggregationColumns_.size(); i++) {
      output.writeMessage(2, aggregationColumns_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < aggregationColumns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, aggregationColumns_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode other = (com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode) obj;

    if (!getAggregationColumnsList()
        .equals(other.getAggregationColumnsList())) return false;
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
    if (getAggregationColumnsCount() > 0) {
      hash = (37 * hash) + AGGREGATION_COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getAggregationColumnsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode prototype) {
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
   * AggregateNode describes which columns to aggregate
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.insights.AggregateNode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.AggregateNode)
      com.tcn.cloud.api.api.v1alpha1.insights.AggregateNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_AggregateNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_AggregateNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode.class, com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode.newBuilder()
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
      if (aggregationColumnsBuilder_ == null) {
        aggregationColumns_ = java.util.Collections.emptyList();
      } else {
        aggregationColumns_ = null;
        aggregationColumnsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_AggregateNode_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode build() {
      com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode result = new com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode result) {
      if (aggregationColumnsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          aggregationColumns_ = java.util.Collections.unmodifiableList(aggregationColumns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aggregationColumns_ = aggregationColumns_;
      } else {
        result.aggregationColumns_ = aggregationColumnsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode.getDefaultInstance()) return this;
      if (aggregationColumnsBuilder_ == null) {
        if (!other.aggregationColumns_.isEmpty()) {
          if (aggregationColumns_.isEmpty()) {
            aggregationColumns_ = other.aggregationColumns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAggregationColumnsIsMutable();
            aggregationColumns_.addAll(other.aggregationColumns_);
          }
          onChanged();
        }
      } else {
        if (!other.aggregationColumns_.isEmpty()) {
          if (aggregationColumnsBuilder_.isEmpty()) {
            aggregationColumnsBuilder_.dispose();
            aggregationColumnsBuilder_ = null;
            aggregationColumns_ = other.aggregationColumns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            aggregationColumnsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAggregationColumnsFieldBuilder() : null;
          } else {
            aggregationColumnsBuilder_.addAllMessages(other.aggregationColumns_);
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
            case 18: {
              com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.parser(),
                      extensionRegistry);
              if (aggregationColumnsBuilder_ == null) {
                ensureAggregationColumnsIsMutable();
                aggregationColumns_.add(m);
              } else {
                aggregationColumnsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn> aggregationColumns_ =
      java.util.Collections.emptyList();
    private void ensureAggregationColumnsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        aggregationColumns_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn>(aggregationColumns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder> aggregationColumnsBuilder_;

    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn> getAggregationColumnsList() {
      if (aggregationColumnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(aggregationColumns_);
      } else {
        return aggregationColumnsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public int getAggregationColumnsCount() {
      if (aggregationColumnsBuilder_ == null) {
        return aggregationColumns_.size();
      } else {
        return aggregationColumnsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn getAggregationColumns(int index) {
      if (aggregationColumnsBuilder_ == null) {
        return aggregationColumns_.get(index);
      } else {
        return aggregationColumnsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder setAggregationColumns(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn value) {
      if (aggregationColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregationColumnsIsMutable();
        aggregationColumns_.set(index, value);
        onChanged();
      } else {
        aggregationColumnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder setAggregationColumns(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder builderForValue) {
      if (aggregationColumnsBuilder_ == null) {
        ensureAggregationColumnsIsMutable();
        aggregationColumns_.set(index, builderForValue.build());
        onChanged();
      } else {
        aggregationColumnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder addAggregationColumns(com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn value) {
      if (aggregationColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregationColumnsIsMutable();
        aggregationColumns_.add(value);
        onChanged();
      } else {
        aggregationColumnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder addAggregationColumns(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn value) {
      if (aggregationColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAggregationColumnsIsMutable();
        aggregationColumns_.add(index, value);
        onChanged();
      } else {
        aggregationColumnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder addAggregationColumns(
        com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder builderForValue) {
      if (aggregationColumnsBuilder_ == null) {
        ensureAggregationColumnsIsMutable();
        aggregationColumns_.add(builderForValue.build());
        onChanged();
      } else {
        aggregationColumnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder addAggregationColumns(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder builderForValue) {
      if (aggregationColumnsBuilder_ == null) {
        ensureAggregationColumnsIsMutable();
        aggregationColumns_.add(index, builderForValue.build());
        onChanged();
      } else {
        aggregationColumnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder addAllAggregationColumns(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn> values) {
      if (aggregationColumnsBuilder_ == null) {
        ensureAggregationColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aggregationColumns_);
        onChanged();
      } else {
        aggregationColumnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder clearAggregationColumns() {
      if (aggregationColumnsBuilder_ == null) {
        aggregationColumns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        aggregationColumnsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public Builder removeAggregationColumns(int index) {
      if (aggregationColumnsBuilder_ == null) {
        ensureAggregationColumnsIsMutable();
        aggregationColumns_.remove(index);
        onChanged();
      } else {
        aggregationColumnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder getAggregationColumnsBuilder(
        int index) {
      return getAggregationColumnsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder getAggregationColumnsOrBuilder(
        int index) {
      if (aggregationColumnsBuilder_ == null) {
        return aggregationColumns_.get(index);  } else {
        return aggregationColumnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder> 
         getAggregationColumnsOrBuilderList() {
      if (aggregationColumnsBuilder_ != null) {
        return aggregationColumnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(aggregationColumns_);
      }
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder addAggregationColumnsBuilder() {
      return getAggregationColumnsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.getDefaultInstance());
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder addAggregationColumnsBuilder(
        int index) {
      return getAggregationColumnsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.getDefaultInstance());
    }
    /**
     * <pre>
     * Aggregation columns
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.AggregationColumn aggregation_columns = 2 [json_name = "aggregationColumns"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder> 
         getAggregationColumnsBuilderList() {
      return getAggregationColumnsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder> 
        getAggregationColumnsFieldBuilder() {
      if (aggregationColumnsBuilder_ == null) {
        aggregationColumnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumn.Builder, com.tcn.cloud.api.api.v1alpha1.insights.AggregationColumnOrBuilder>(
                aggregationColumns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        aggregationColumns_ = null;
      }
      return aggregationColumnsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.AggregateNode)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.AggregateNode)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AggregateNode>
      PARSER = new com.google.protobuf.AbstractParser<AggregateNode>() {
    @java.lang.Override
    public AggregateNode parsePartialFrom(
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

  public static com.google.protobuf.Parser<AggregateNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AggregateNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.AggregateNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

