// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SumProcess}
 */
public final class SumProcess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SumProcess)
    SumProcessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SumProcess.newBuilder() to construct.
  private SumProcess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SumProcess() {
    field_ = "";
    newName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SumProcess();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SumProcess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SumProcess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SumProcess.class, com.tcn.cloud.api.api.v0alpha.SumProcess.Builder.class);
  }

  public static final int FIELD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object field_ = "";
  /**
   * <pre>
   * field to sum
   * </pre>
   *
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The field.
   */
  @java.lang.Override
  public java.lang.String getField() {
    java.lang.Object ref = field_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      field_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * field to sum
   * </pre>
   *
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The bytes for field.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldBytes() {
    java.lang.Object ref = field_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      field_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newName_ = "";
  /**
   * <pre>
   * new_name for the summed field
   * </pre>
   *
   * <code>string new_name = 2 [json_name = "newName"];</code>
   * @return The newName.
   */
  @java.lang.Override
  public java.lang.String getNewName() {
    java.lang.Object ref = newName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * new_name for the summed field
   * </pre>
   *
   * <code>string new_name = 2 [json_name = "newName"];</code>
   * @return The bytes for newName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewNameBytes() {
    java.lang.Object ref = newName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUP_BY_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v0alpha.GroupBy groupBy_;
  /**
   * <pre>
   * optional group_by to aggregate data
   * before summing the desired field
   * </pre>
   *
   * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
   * @return Whether the groupBy field is set.
   */
  @java.lang.Override
  public boolean hasGroupBy() {
    return groupBy_ != null;
  }
  /**
   * <pre>
   * optional group_by to aggregate data
   * before summing the desired field
   * </pre>
   *
   * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
   * @return The groupBy.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GroupBy getGroupBy() {
    return groupBy_ == null ? com.tcn.cloud.api.api.v0alpha.GroupBy.getDefaultInstance() : groupBy_;
  }
  /**
   * <pre>
   * optional group_by to aggregate data
   * before summing the desired field
   * </pre>
   *
   * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GroupByOrBuilder getGroupByOrBuilder() {
    return groupBy_ == null ? com.tcn.cloud.api.api.v0alpha.GroupBy.getDefaultInstance() : groupBy_;
  }

  public static final int FILTER_FIELD_NUMBER = 4;
  private com.tcn.cloud.api.api.v0alpha.FilterOperation filter_;
  /**
   * <pre>
   * conditions to limit which record's fields will be summed
   * we will AND these together
   * </pre>
   *
   * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  @java.lang.Override
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <pre>
   * conditions to limit which record's fields will be summed
   * we will AND these together
   * </pre>
   *
   * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
   * @return The filter.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FilterOperation getFilter() {
    return filter_ == null ? com.tcn.cloud.api.api.v0alpha.FilterOperation.getDefaultInstance() : filter_;
  }
  /**
   * <pre>
   * conditions to limit which record's fields will be summed
   * we will AND these together
   * </pre>
   *
   * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FilterOperationOrBuilder getFilterOrBuilder() {
    return filter_ == null ? com.tcn.cloud.api.api.v0alpha.FilterOperation.getDefaultInstance() : filter_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(field_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, field_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, newName_);
    }
    if (groupBy_ != null) {
      output.writeMessage(3, getGroupBy());
    }
    if (filter_ != null) {
      output.writeMessage(4, getFilter());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(field_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, field_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, newName_);
    }
    if (groupBy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGroupBy());
    }
    if (filter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFilter());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SumProcess)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SumProcess other = (com.tcn.cloud.api.api.v0alpha.SumProcess) obj;

    if (!getField()
        .equals(other.getField())) return false;
    if (!getNewName()
        .equals(other.getNewName())) return false;
    if (hasGroupBy() != other.hasGroupBy()) return false;
    if (hasGroupBy()) {
      if (!getGroupBy()
          .equals(other.getGroupBy())) return false;
    }
    if (hasFilter() != other.hasFilter()) return false;
    if (hasFilter()) {
      if (!getFilter()
          .equals(other.getFilter())) return false;
    }
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
    hash = (37 * hash) + FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getField().hashCode();
    hash = (37 * hash) + NEW_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getNewName().hashCode();
    if (hasGroupBy()) {
      hash = (37 * hash) + GROUP_BY_FIELD_NUMBER;
      hash = (53 * hash) + getGroupBy().hashCode();
    }
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SumProcess parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SumProcess prototype) {
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
   * Protobuf type {@code api.v0alpha.SumProcess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SumProcess)
      com.tcn.cloud.api.api.v0alpha.SumProcessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SumProcess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SumProcess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SumProcess.class, com.tcn.cloud.api.api.v0alpha.SumProcess.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SumProcess.newBuilder()
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
      field_ = "";
      newName_ = "";
      groupBy_ = null;
      if (groupByBuilder_ != null) {
        groupByBuilder_.dispose();
        groupByBuilder_ = null;
      }
      filter_ = null;
      if (filterBuilder_ != null) {
        filterBuilder_.dispose();
        filterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SumProcess_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SumProcess getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SumProcess.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SumProcess build() {
      com.tcn.cloud.api.api.v0alpha.SumProcess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SumProcess buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SumProcess result = new com.tcn.cloud.api.api.v0alpha.SumProcess(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SumProcess result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.field_ = field_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.newName_ = newName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.groupBy_ = groupByBuilder_ == null
            ? groupBy_
            : groupByBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.filter_ = filterBuilder_ == null
            ? filter_
            : filterBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SumProcess) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SumProcess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SumProcess other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SumProcess.getDefaultInstance()) return this;
      if (!other.getField().isEmpty()) {
        field_ = other.field_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getNewName().isEmpty()) {
        newName_ = other.newName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasGroupBy()) {
        mergeGroupBy(other.getGroupBy());
      }
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
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
              field_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              newName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getGroupByFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getFilterFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
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

    private java.lang.Object field_ = "";
    /**
     * <pre>
     * field to sum
     * </pre>
     *
     * <code>string field = 1 [json_name = "field"];</code>
     * @return The field.
     */
    public java.lang.String getField() {
      java.lang.Object ref = field_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        field_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * field to sum
     * </pre>
     *
     * <code>string field = 1 [json_name = "field"];</code>
     * @return The bytes for field.
     */
    public com.google.protobuf.ByteString
        getFieldBytes() {
      java.lang.Object ref = field_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        field_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * field to sum
     * </pre>
     *
     * <code>string field = 1 [json_name = "field"];</code>
     * @param value The field to set.
     * @return This builder for chaining.
     */
    public Builder setField(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      field_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * field to sum
     * </pre>
     *
     * <code>string field = 1 [json_name = "field"];</code>
     * @return This builder for chaining.
     */
    public Builder clearField() {
      field_ = getDefaultInstance().getField();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * field to sum
     * </pre>
     *
     * <code>string field = 1 [json_name = "field"];</code>
     * @param value The bytes for field to set.
     * @return This builder for chaining.
     */
    public Builder setFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      field_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object newName_ = "";
    /**
     * <pre>
     * new_name for the summed field
     * </pre>
     *
     * <code>string new_name = 2 [json_name = "newName"];</code>
     * @return The newName.
     */
    public java.lang.String getNewName() {
      java.lang.Object ref = newName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * new_name for the summed field
     * </pre>
     *
     * <code>string new_name = 2 [json_name = "newName"];</code>
     * @return The bytes for newName.
     */
    public com.google.protobuf.ByteString
        getNewNameBytes() {
      java.lang.Object ref = newName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * new_name for the summed field
     * </pre>
     *
     * <code>string new_name = 2 [json_name = "newName"];</code>
     * @param value The newName to set.
     * @return This builder for chaining.
     */
    public Builder setNewName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * new_name for the summed field
     * </pre>
     *
     * <code>string new_name = 2 [json_name = "newName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewName() {
      newName_ = getDefaultInstance().getNewName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * new_name for the summed field
     * </pre>
     *
     * <code>string new_name = 2 [json_name = "newName"];</code>
     * @param value The bytes for newName to set.
     * @return This builder for chaining.
     */
    public Builder setNewNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.GroupBy groupBy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.GroupBy, com.tcn.cloud.api.api.v0alpha.GroupBy.Builder, com.tcn.cloud.api.api.v0alpha.GroupByOrBuilder> groupByBuilder_;
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     * @return Whether the groupBy field is set.
     */
    public boolean hasGroupBy() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     * @return The groupBy.
     */
    public com.tcn.cloud.api.api.v0alpha.GroupBy getGroupBy() {
      if (groupByBuilder_ == null) {
        return groupBy_ == null ? com.tcn.cloud.api.api.v0alpha.GroupBy.getDefaultInstance() : groupBy_;
      } else {
        return groupByBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     */
    public Builder setGroupBy(com.tcn.cloud.api.api.v0alpha.GroupBy value) {
      if (groupByBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        groupBy_ = value;
      } else {
        groupByBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     */
    public Builder setGroupBy(
        com.tcn.cloud.api.api.v0alpha.GroupBy.Builder builderForValue) {
      if (groupByBuilder_ == null) {
        groupBy_ = builderForValue.build();
      } else {
        groupByBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     */
    public Builder mergeGroupBy(com.tcn.cloud.api.api.v0alpha.GroupBy value) {
      if (groupByBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          groupBy_ != null &&
          groupBy_ != com.tcn.cloud.api.api.v0alpha.GroupBy.getDefaultInstance()) {
          getGroupByBuilder().mergeFrom(value);
        } else {
          groupBy_ = value;
        }
      } else {
        groupByBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     */
    public Builder clearGroupBy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      groupBy_ = null;
      if (groupByBuilder_ != null) {
        groupByBuilder_.dispose();
        groupByBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.GroupBy.Builder getGroupByBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getGroupByFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.GroupByOrBuilder getGroupByOrBuilder() {
      if (groupByBuilder_ != null) {
        return groupByBuilder_.getMessageOrBuilder();
      } else {
        return groupBy_ == null ?
            com.tcn.cloud.api.api.v0alpha.GroupBy.getDefaultInstance() : groupBy_;
      }
    }
    /**
     * <pre>
     * optional group_by to aggregate data
     * before summing the desired field
     * </pre>
     *
     * <code>.api.v0alpha.GroupBy group_by = 3 [json_name = "groupBy"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.GroupBy, com.tcn.cloud.api.api.v0alpha.GroupBy.Builder, com.tcn.cloud.api.api.v0alpha.GroupByOrBuilder> 
        getGroupByFieldBuilder() {
      if (groupByBuilder_ == null) {
        groupByBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.GroupBy, com.tcn.cloud.api.api.v0alpha.GroupBy.Builder, com.tcn.cloud.api.api.v0alpha.GroupByOrBuilder>(
                getGroupBy(),
                getParentForChildren(),
                isClean());
        groupBy_ = null;
      }
      return groupByBuilder_;
    }

    private com.tcn.cloud.api.api.v0alpha.FilterOperation filter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.FilterOperation, com.tcn.cloud.api.api.v0alpha.FilterOperation.Builder, com.tcn.cloud.api.api.v0alpha.FilterOperationOrBuilder> filterBuilder_;
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     * @return Whether the filter field is set.
     */
    public boolean hasFilter() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     * @return The filter.
     */
    public com.tcn.cloud.api.api.v0alpha.FilterOperation getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.tcn.cloud.api.api.v0alpha.FilterOperation.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     */
    public Builder setFilter(com.tcn.cloud.api.api.v0alpha.FilterOperation value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
      } else {
        filterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     */
    public Builder setFilter(
        com.tcn.cloud.api.api.v0alpha.FilterOperation.Builder builderForValue) {
      if (filterBuilder_ == null) {
        filter_ = builderForValue.build();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     */
    public Builder mergeFilter(com.tcn.cloud.api.api.v0alpha.FilterOperation value) {
      if (filterBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          filter_ != null &&
          filter_ != com.tcn.cloud.api.api.v0alpha.FilterOperation.getDefaultInstance()) {
          getFilterBuilder().mergeFrom(value);
        } else {
          filter_ = value;
        }
      } else {
        filterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     */
    public Builder clearFilter() {
      bitField0_ = (bitField0_ & ~0x00000008);
      filter_ = null;
      if (filterBuilder_ != null) {
        filterBuilder_.dispose();
        filterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FilterOperation.Builder getFilterBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FilterOperationOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.tcn.cloud.api.api.v0alpha.FilterOperation.getDefaultInstance() : filter_;
      }
    }
    /**
     * <pre>
     * conditions to limit which record's fields will be summed
     * we will AND these together
     * </pre>
     *
     * <code>.api.v0alpha.FilterOperation filter = 4 [json_name = "filter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.FilterOperation, com.tcn.cloud.api.api.v0alpha.FilterOperation.Builder, com.tcn.cloud.api.api.v0alpha.FilterOperationOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.FilterOperation, com.tcn.cloud.api.api.v0alpha.FilterOperation.Builder, com.tcn.cloud.api.api.v0alpha.FilterOperationOrBuilder>(
                getFilter(),
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      return filterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SumProcess)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SumProcess)
  private static final com.tcn.cloud.api.api.v0alpha.SumProcess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SumProcess();
  }

  public static com.tcn.cloud.api.api.v0alpha.SumProcess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SumProcess>
      PARSER = new com.google.protobuf.AbstractParser<SumProcess>() {
    @java.lang.Override
    public SumProcess parsePartialFrom(
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

  public static com.google.protobuf.Parser<SumProcess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SumProcess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SumProcess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

