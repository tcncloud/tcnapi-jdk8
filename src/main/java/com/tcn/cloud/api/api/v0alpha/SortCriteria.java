// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SortCriteria}
 */
public final class SortCriteria extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SortCriteria)
    SortCriteriaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SortCriteria.newBuilder() to construct.
  private SortCriteria(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SortCriteria() {
    ordering_ = java.util.Collections.emptyList();
    fieldOrder_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SortCriteria();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SortCriteria_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SortCriteria_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SortCriteria.class, com.tcn.cloud.api.api.v0alpha.SortCriteria.Builder.class);
  }

  public static final int ORDERING_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> ordering_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.SortOrder> ordering_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.SortOrder>() {
            public com.tcn.cloud.api.api.commons.SortOrder convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.SortOrder result = com.tcn.cloud.api.api.commons.SortOrder.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.SortOrder.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * The ordering, ascending or descending
   * </pre>
   *
   * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
   * @return A list containing the ordering.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.SortOrder> getOrderingList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.SortOrder>(ordering_, ordering_converter_);
  }
  /**
   * <pre>
   * The ordering, ascending or descending
   * </pre>
   *
   * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
   * @return The count of ordering.
   */
  @java.lang.Override
  public int getOrderingCount() {
    return ordering_.size();
  }
  /**
   * <pre>
   * The ordering, ascending or descending
   * </pre>
   *
   * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
   * @param index The index of the element to return.
   * @return The ordering at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SortOrder getOrdering(int index) {
    return ordering_converter_.convert(ordering_.get(index));
  }
  /**
   * <pre>
   * The ordering, ascending or descending
   * </pre>
   *
   * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
   * @return A list containing the enum numeric values on the wire for ordering.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getOrderingValueList() {
    return ordering_;
  }
  /**
   * <pre>
   * The ordering, ascending or descending
   * </pre>
   *
   * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of ordering at the given index.
   */
  @java.lang.Override
  public int getOrderingValue(int index) {
    return ordering_.get(index);
  }
  private int orderingMemoizedSerializedSize;

  public static final int FIELD_ORDER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex> fieldOrder_;
  /**
   * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex> getFieldOrderList() {
    return fieldOrder_;
  }
  /**
   * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder> 
      getFieldOrderOrBuilderList() {
    return fieldOrder_;
  }
  /**
   * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
   */
  @java.lang.Override
  public int getFieldOrderCount() {
    return fieldOrder_.size();
  }
  /**
   * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FieldIndex getFieldOrder(int index) {
    return fieldOrder_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder getFieldOrderOrBuilder(
      int index) {
    return fieldOrder_.get(index);
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
    getSerializedSize();
    if (getOrderingList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(orderingMemoizedSerializedSize);
    }
    for (int i = 0; i < ordering_.size(); i++) {
      output.writeEnumNoTag(ordering_.get(i));
    }
    for (int i = 0; i < fieldOrder_.size(); i++) {
      output.writeMessage(2, fieldOrder_.get(i));
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
      for (int i = 0; i < ordering_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(ordering_.get(i));
      }
      size += dataSize;
      if (!getOrderingList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }orderingMemoizedSerializedSize = dataSize;
    }
    for (int i = 0; i < fieldOrder_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, fieldOrder_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SortCriteria)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SortCriteria other = (com.tcn.cloud.api.api.v0alpha.SortCriteria) obj;

    if (!ordering_.equals(other.ordering_)) return false;
    if (!getFieldOrderList()
        .equals(other.getFieldOrderList())) return false;
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
    if (getOrderingCount() > 0) {
      hash = (37 * hash) + ORDERING_FIELD_NUMBER;
      hash = (53 * hash) + ordering_.hashCode();
    }
    if (getFieldOrderCount() > 0) {
      hash = (37 * hash) + FIELD_ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getFieldOrderList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SortCriteria parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SortCriteria prototype) {
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
   * Protobuf type {@code api.v0alpha.SortCriteria}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SortCriteria)
      com.tcn.cloud.api.api.v0alpha.SortCriteriaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SortCriteria_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SortCriteria_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SortCriteria.class, com.tcn.cloud.api.api.v0alpha.SortCriteria.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SortCriteria.newBuilder()
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
      ordering_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      if (fieldOrderBuilder_ == null) {
        fieldOrder_ = java.util.Collections.emptyList();
      } else {
        fieldOrder_ = null;
        fieldOrderBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SortCriteria_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SortCriteria getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SortCriteria.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SortCriteria build() {
      com.tcn.cloud.api.api.v0alpha.SortCriteria result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SortCriteria buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SortCriteria result = new com.tcn.cloud.api.api.v0alpha.SortCriteria(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.SortCriteria result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        ordering_ = java.util.Collections.unmodifiableList(ordering_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ordering_ = ordering_;
      if (fieldOrderBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          fieldOrder_ = java.util.Collections.unmodifiableList(fieldOrder_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.fieldOrder_ = fieldOrder_;
      } else {
        result.fieldOrder_ = fieldOrderBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SortCriteria result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SortCriteria) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SortCriteria)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SortCriteria other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SortCriteria.getDefaultInstance()) return this;
      if (!other.ordering_.isEmpty()) {
        if (ordering_.isEmpty()) {
          ordering_ = other.ordering_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOrderingIsMutable();
          ordering_.addAll(other.ordering_);
        }
        onChanged();
      }
      if (fieldOrderBuilder_ == null) {
        if (!other.fieldOrder_.isEmpty()) {
          if (fieldOrder_.isEmpty()) {
            fieldOrder_ = other.fieldOrder_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFieldOrderIsMutable();
            fieldOrder_.addAll(other.fieldOrder_);
          }
          onChanged();
        }
      } else {
        if (!other.fieldOrder_.isEmpty()) {
          if (fieldOrderBuilder_.isEmpty()) {
            fieldOrderBuilder_.dispose();
            fieldOrderBuilder_ = null;
            fieldOrder_ = other.fieldOrder_;
            bitField0_ = (bitField0_ & ~0x00000002);
            fieldOrderBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFieldOrderFieldBuilder() : null;
          } else {
            fieldOrderBuilder_.addAllMessages(other.fieldOrder_);
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
            case 8: {
              int tmpRaw = input.readEnum();
              ensureOrderingIsMutable();
              ordering_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureOrderingIsMutable();
                ordering_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.v0alpha.FieldIndex m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.FieldIndex.parser(),
                      extensionRegistry);
              if (fieldOrderBuilder_ == null) {
                ensureFieldOrderIsMutable();
                fieldOrder_.add(m);
              } else {
                fieldOrderBuilder_.addMessage(m);
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

    private java.util.List<java.lang.Integer> ordering_ =
      java.util.Collections.emptyList();
    private void ensureOrderingIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ordering_ = new java.util.ArrayList<java.lang.Integer>(ordering_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @return A list containing the ordering.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.SortOrder> getOrderingList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.SortOrder>(ordering_, ordering_converter_);
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @return The count of ordering.
     */
    public int getOrderingCount() {
      return ordering_.size();
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @param index The index of the element to return.
     * @return The ordering at the given index.
     */
    public com.tcn.cloud.api.api.commons.SortOrder getOrdering(int index) {
      return ordering_converter_.convert(ordering_.get(index));
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @param index The index to set the value at.
     * @param value The ordering to set.
     * @return This builder for chaining.
     */
    public Builder setOrdering(
        int index, com.tcn.cloud.api.api.commons.SortOrder value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOrderingIsMutable();
      ordering_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @param value The ordering to add.
     * @return This builder for chaining.
     */
    public Builder addOrdering(com.tcn.cloud.api.api.commons.SortOrder value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureOrderingIsMutable();
      ordering_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @param values The ordering to add.
     * @return This builder for chaining.
     */
    public Builder addAllOrdering(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.SortOrder> values) {
      ensureOrderingIsMutable();
      for (com.tcn.cloud.api.api.commons.SortOrder value : values) {
        ordering_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrdering() {
      ordering_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @return A list containing the enum numeric values on the wire for ordering.
     */
    public java.util.List<java.lang.Integer>
    getOrderingValueList() {
      return java.util.Collections.unmodifiableList(ordering_);
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of ordering at the given index.
     */
    public int getOrderingValue(int index) {
      return ordering_.get(index);
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for ordering to set.
     * @return This builder for chaining.
     */
    public Builder setOrderingValue(
        int index, int value) {
      ensureOrderingIsMutable();
      ordering_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @param value The enum numeric value on the wire for ordering to add.
     * @return This builder for chaining.
     */
    public Builder addOrderingValue(int value) {
      ensureOrderingIsMutable();
      ordering_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ordering, ascending or descending
     * </pre>
     *
     * <code>repeated .api.commons.SortOrder ordering = 1 [json_name = "ordering"];</code>
     * @param values The enum numeric values on the wire for ordering to add.
     * @return This builder for chaining.
     */
    public Builder addAllOrderingValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureOrderingIsMutable();
      for (int value : values) {
        ordering_.add(value);
      }
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex> fieldOrder_ =
      java.util.Collections.emptyList();
    private void ensureFieldOrderIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        fieldOrder_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.FieldIndex>(fieldOrder_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.FieldIndex, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder, com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder> fieldOrderBuilder_;

    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex> getFieldOrderList() {
      if (fieldOrderBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fieldOrder_);
      } else {
        return fieldOrderBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public int getFieldOrderCount() {
      if (fieldOrderBuilder_ == null) {
        return fieldOrder_.size();
      } else {
        return fieldOrderBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndex getFieldOrder(int index) {
      if (fieldOrderBuilder_ == null) {
        return fieldOrder_.get(index);
      } else {
        return fieldOrderBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder setFieldOrder(
        int index, com.tcn.cloud.api.api.v0alpha.FieldIndex value) {
      if (fieldOrderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldOrderIsMutable();
        fieldOrder_.set(index, value);
        onChanged();
      } else {
        fieldOrderBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder setFieldOrder(
        int index, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder builderForValue) {
      if (fieldOrderBuilder_ == null) {
        ensureFieldOrderIsMutable();
        fieldOrder_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldOrderBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder addFieldOrder(com.tcn.cloud.api.api.v0alpha.FieldIndex value) {
      if (fieldOrderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldOrderIsMutable();
        fieldOrder_.add(value);
        onChanged();
      } else {
        fieldOrderBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder addFieldOrder(
        int index, com.tcn.cloud.api.api.v0alpha.FieldIndex value) {
      if (fieldOrderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldOrderIsMutable();
        fieldOrder_.add(index, value);
        onChanged();
      } else {
        fieldOrderBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder addFieldOrder(
        com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder builderForValue) {
      if (fieldOrderBuilder_ == null) {
        ensureFieldOrderIsMutable();
        fieldOrder_.add(builderForValue.build());
        onChanged();
      } else {
        fieldOrderBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder addFieldOrder(
        int index, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder builderForValue) {
      if (fieldOrderBuilder_ == null) {
        ensureFieldOrderIsMutable();
        fieldOrder_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldOrderBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder addAllFieldOrder(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.FieldIndex> values) {
      if (fieldOrderBuilder_ == null) {
        ensureFieldOrderIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fieldOrder_);
        onChanged();
      } else {
        fieldOrderBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder clearFieldOrder() {
      if (fieldOrderBuilder_ == null) {
        fieldOrder_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        fieldOrderBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public Builder removeFieldOrder(int index) {
      if (fieldOrderBuilder_ == null) {
        ensureFieldOrderIsMutable();
        fieldOrder_.remove(index);
        onChanged();
      } else {
        fieldOrderBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder getFieldOrderBuilder(
        int index) {
      return getFieldOrderFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder getFieldOrderOrBuilder(
        int index) {
      if (fieldOrderBuilder_ == null) {
        return fieldOrder_.get(index);  } else {
        return fieldOrderBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder> 
         getFieldOrderOrBuilderList() {
      if (fieldOrderBuilder_ != null) {
        return fieldOrderBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fieldOrder_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder addFieldOrderBuilder() {
      return getFieldOrderFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.FieldIndex.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder addFieldOrderBuilder(
        int index) {
      return getFieldOrderFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.FieldIndex.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex field_order = 2 [json_name = "fieldOrder"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder> 
         getFieldOrderBuilderList() {
      return getFieldOrderFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.FieldIndex, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder, com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder> 
        getFieldOrderFieldBuilder() {
      if (fieldOrderBuilder_ == null) {
        fieldOrderBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.FieldIndex, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder, com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder>(
                fieldOrder_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        fieldOrder_ = null;
      }
      return fieldOrderBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SortCriteria)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SortCriteria)
  private static final com.tcn.cloud.api.api.v0alpha.SortCriteria DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SortCriteria();
  }

  public static com.tcn.cloud.api.api.v0alpha.SortCriteria getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SortCriteria>
      PARSER = new com.google.protobuf.AbstractParser<SortCriteria>() {
    @java.lang.Override
    public SortCriteria parsePartialFrom(
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

  public static com.google.protobuf.Parser<SortCriteria> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SortCriteria> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SortCriteria getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

