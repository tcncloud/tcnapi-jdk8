// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight_content.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * Parent describes a join node parent
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.insights.Parent}
 */
public final class Parent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.Parent)
    ParentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Parent.newBuilder() to construct.
  private Parent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Parent() {
    parentId_ = "";
    title_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Parent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_Parent_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetRenamedColumns();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_Parent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.Parent.class, com.tcn.cloud.api.api.v1alpha1.insights.Parent.Builder.class);
  }

  public static final int PARENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parentId_ = "";
  /**
   * <pre>
   * parent_id
   * </pre>
   *
   * <code>string parent_id = 1 [json_name = "parentId"];</code>
   * @return The parentId.
   */
  @java.lang.Override
  public java.lang.String getParentId() {
    java.lang.Object ref = parentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * parent_id
   * </pre>
   *
   * <code>string parent_id = 1 [json_name = "parentId"];</code>
   * @return The bytes for parentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentIdBytes() {
    java.lang.Object ref = parentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parentId_ = b;
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
   * parent title
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
   * parent title
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

  public static final int RENAMED_COLUMNS_FIELD_NUMBER = 3;
  private static final class RenamedColumnsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_Parent_RenamedColumnsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> renamedColumns_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetRenamedColumns() {
    if (renamedColumns_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          RenamedColumnsDefaultEntryHolder.defaultEntry);
    }
    return renamedColumns_;
  }
  public int getRenamedColumnsCount() {
    return internalGetRenamedColumns().getMap().size();
  }
  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
   */
  @java.lang.Override
  public boolean containsRenamedColumns(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetRenamedColumns().getMap().containsKey(key);
  }
  /**
   * Use {@link #getRenamedColumnsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getRenamedColumns() {
    return getRenamedColumnsMap();
  }
  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getRenamedColumnsMap() {
    return internalGetRenamedColumns().getMap();
  }
  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getRenamedColumnsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetRenamedColumns().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * map of renamed columns
   * </pre>
   *
   * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
   */
  @java.lang.Override
  public java.lang.String getRenamedColumnsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetRenamedColumns().getMap();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetRenamedColumns(),
        RenamedColumnsDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetRenamedColumns().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      renamedColumns__ = RenamedColumnsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, renamedColumns__);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.Parent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.Parent other = (com.tcn.cloud.api.api.v1alpha1.insights.Parent) obj;

    if (!getParentId()
        .equals(other.getParentId())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!internalGetRenamedColumns().equals(
        other.internalGetRenamedColumns())) return false;
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
    hash = (37 * hash) + PARENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getParentId().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    if (!internalGetRenamedColumns().getMap().isEmpty()) {
      hash = (37 * hash) + RENAMED_COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetRenamedColumns().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.Parent prototype) {
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
   * Parent describes a join node parent
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.insights.Parent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.Parent)
      com.tcn.cloud.api.api.v1alpha1.insights.ParentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_Parent_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetRenamedColumns();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableRenamedColumns();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_Parent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.Parent.class, com.tcn.cloud.api.api.v1alpha1.insights.Parent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.Parent.newBuilder()
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
      parentId_ = "";
      title_ = "";
      internalGetMutableRenamedColumns().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.internal_static_api_v1alpha1_insights_Parent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.Parent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.Parent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.Parent build() {
      com.tcn.cloud.api.api.v1alpha1.insights.Parent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.Parent buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.Parent result = new com.tcn.cloud.api.api.v1alpha1.insights.Parent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.Parent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parentId_ = parentId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.renamedColumns_ = internalGetRenamedColumns();
        result.renamedColumns_.makeImmutable();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.Parent) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.Parent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.Parent other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.Parent.getDefaultInstance()) return this;
      if (!other.getParentId().isEmpty()) {
        parentId_ = other.parentId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      internalGetMutableRenamedColumns().mergeFrom(
          other.internalGetRenamedColumns());
      bitField0_ |= 0x00000004;
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
              parentId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              renamedColumns__ = input.readMessage(
                  RenamedColumnsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableRenamedColumns().getMutableMap().put(
                  renamedColumns__.getKey(), renamedColumns__.getValue());
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object parentId_ = "";
    /**
     * <pre>
     * parent_id
     * </pre>
     *
     * <code>string parent_id = 1 [json_name = "parentId"];</code>
     * @return The parentId.
     */
    public java.lang.String getParentId() {
      java.lang.Object ref = parentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * parent_id
     * </pre>
     *
     * <code>string parent_id = 1 [json_name = "parentId"];</code>
     * @return The bytes for parentId.
     */
    public com.google.protobuf.ByteString
        getParentIdBytes() {
      java.lang.Object ref = parentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * parent_id
     * </pre>
     *
     * <code>string parent_id = 1 [json_name = "parentId"];</code>
     * @param value The parentId to set.
     * @return This builder for chaining.
     */
    public Builder setParentId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent_id
     * </pre>
     *
     * <code>string parent_id = 1 [json_name = "parentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParentId() {
      parentId_ = getDefaultInstance().getParentId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parent_id
     * </pre>
     *
     * <code>string parent_id = 1 [json_name = "parentId"];</code>
     * @param value The bytes for parentId to set.
     * @return This builder for chaining.
     */
    public Builder setParentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <pre>
     * parent title
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
     * parent title
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
     * parent title
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
     * parent title
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
     * parent title
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> renamedColumns_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetRenamedColumns() {
      if (renamedColumns_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RenamedColumnsDefaultEntryHolder.defaultEntry);
      }
      return renamedColumns_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableRenamedColumns() {
      if (renamedColumns_ == null) {
        renamedColumns_ = com.google.protobuf.MapField.newMapField(
            RenamedColumnsDefaultEntryHolder.defaultEntry);
      }
      if (!renamedColumns_.isMutable()) {
        renamedColumns_ = renamedColumns_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return renamedColumns_;
    }
    public int getRenamedColumnsCount() {
      return internalGetRenamedColumns().getMap().size();
    }
    /**
     * <pre>
     * map of renamed columns
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
     */
    @java.lang.Override
    public boolean containsRenamedColumns(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetRenamedColumns().getMap().containsKey(key);
    }
    /**
     * Use {@link #getRenamedColumnsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getRenamedColumns() {
      return getRenamedColumnsMap();
    }
    /**
     * <pre>
     * map of renamed columns
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getRenamedColumnsMap() {
      return internalGetRenamedColumns().getMap();
    }
    /**
     * <pre>
     * map of renamed columns
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getRenamedColumnsOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetRenamedColumns().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * map of renamed columns
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
     */
    @java.lang.Override
    public java.lang.String getRenamedColumnsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetRenamedColumns().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearRenamedColumns() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableRenamedColumns().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * map of renamed columns
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
     */
    public Builder removeRenamedColumns(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableRenamedColumns().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableRenamedColumns() {
      bitField0_ |= 0x00000004;
      return internalGetMutableRenamedColumns().getMutableMap();
    }
    /**
     * <pre>
     * map of renamed columns
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
     */
    public Builder putRenamedColumns(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableRenamedColumns().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * map of renamed columns
     * </pre>
     *
     * <code>map&lt;string, string&gt; renamed_columns = 3 [json_name = "renamedColumns"];</code>
     */
    public Builder putAllRenamedColumns(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableRenamedColumns().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.Parent)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.Parent)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.Parent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.Parent();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.Parent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Parent>
      PARSER = new com.google.protobuf.AbstractParser<Parent>() {
    @java.lang.Override
    public Parent parsePartialFrom(
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

  public static com.google.protobuf.Parser<Parent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Parent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.Parent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

