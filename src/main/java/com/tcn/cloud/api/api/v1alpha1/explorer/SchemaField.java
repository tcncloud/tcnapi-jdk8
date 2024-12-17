// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/entities.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

/**
 * <pre>
 * SchemaField is a field in a schema.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.explorer.SchemaField}
 */
public final class SchemaField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.explorer.SchemaField)
    SchemaFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SchemaField.newBuilder() to construct.
  private SchemaField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SchemaField() {
    name_ = "";
    columnType_ = 0;
    columnDescription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SchemaField();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_SchemaField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_SchemaField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField.class, com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMN_TYPE_FIELD_NUMBER = 2;
  private int columnType_ = 0;
  /**
   * <code>.api.v1alpha1.explorer.SchemaType column_type = 2 [json_name = "columnType"];</code>
   * @return The enum numeric value on the wire for columnType.
   */
  @java.lang.Override public int getColumnTypeValue() {
    return columnType_;
  }
  /**
   * <code>.api.v1alpha1.explorer.SchemaType column_type = 2 [json_name = "columnType"];</code>
   * @return The columnType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType getColumnType() {
    com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType result = com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType.forNumber(columnType_);
    return result == null ? com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType.UNRECOGNIZED : result;
  }

  public static final int IS_PRIMARY_KEY_FIELD_NUMBER = 3;
  private boolean isPrimaryKey_ = false;
  /**
   * <code>bool is_primary_key = 3 [json_name = "isPrimaryKey"];</code>
   * @return The isPrimaryKey.
   */
  @java.lang.Override
  public boolean getIsPrimaryKey() {
    return isPrimaryKey_;
  }

  public static final int IS_LOW_CARDINALITY_FIELD_NUMBER = 4;
  private boolean isLowCardinality_ = false;
  /**
   * <code>bool is_low_cardinality = 4 [json_name = "isLowCardinality"];</code>
   * @return The isLowCardinality.
   */
  @java.lang.Override
  public boolean getIsLowCardinality() {
    return isLowCardinality_;
  }

  public static final int COLUMN_DESCRIPTION_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object columnDescription_ = "";
  /**
   * <code>string column_description = 5 [json_name = "columnDescription"];</code>
   * @return The columnDescription.
   */
  @java.lang.Override
  public java.lang.String getColumnDescription() {
    java.lang.Object ref = columnDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      columnDescription_ = s;
      return s;
    }
  }
  /**
   * <code>string column_description = 5 [json_name = "columnDescription"];</code>
   * @return The bytes for columnDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getColumnDescriptionBytes() {
    java.lang.Object ref = columnDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      columnDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_TIME_FILTER_FIELD_NUMBER = 6;
  private boolean isTimeFilter_ = false;
  /**
   * <code>bool is_time_filter = 6 [json_name = "isTimeFilter"];</code>
   * @return The isTimeFilter.
   */
  @java.lang.Override
  public boolean getIsTimeFilter() {
    return isTimeFilter_;
  }

  public static final int IS_DEFAULT_TIME_FILTER_FIELD_NUMBER = 7;
  private boolean isDefaultTimeFilter_ = false;
  /**
   * <code>bool is_default_time_filter = 7 [json_name = "isDefaultTimeFilter"];</code>
   * @return The isDefaultTimeFilter.
   */
  @java.lang.Override
  public boolean getIsDefaultTimeFilter() {
    return isDefaultTimeFilter_;
  }

  public static final int IS_JOIN_COLUMN_FIELD_NUMBER = 8;
  private boolean isJoinColumn_ = false;
  /**
   * <code>bool is_join_column = 8 [json_name = "isJoinColumn"];</code>
   * @return The isJoinColumn.
   */
  @java.lang.Override
  public boolean getIsJoinColumn() {
    return isJoinColumn_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (columnType_ != com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType.SCHEMA_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, columnType_);
    }
    if (isPrimaryKey_ != false) {
      output.writeBool(3, isPrimaryKey_);
    }
    if (isLowCardinality_ != false) {
      output.writeBool(4, isLowCardinality_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnDescription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, columnDescription_);
    }
    if (isTimeFilter_ != false) {
      output.writeBool(6, isTimeFilter_);
    }
    if (isDefaultTimeFilter_ != false) {
      output.writeBool(7, isDefaultTimeFilter_);
    }
    if (isJoinColumn_ != false) {
      output.writeBool(8, isJoinColumn_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (columnType_ != com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType.SCHEMA_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, columnType_);
    }
    if (isPrimaryKey_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isPrimaryKey_);
    }
    if (isLowCardinality_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isLowCardinality_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(columnDescription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, columnDescription_);
    }
    if (isTimeFilter_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isTimeFilter_);
    }
    if (isDefaultTimeFilter_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isDefaultTimeFilter_);
    }
    if (isJoinColumn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, isJoinColumn_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField other = (com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (columnType_ != other.columnType_) return false;
    if (getIsPrimaryKey()
        != other.getIsPrimaryKey()) return false;
    if (getIsLowCardinality()
        != other.getIsLowCardinality()) return false;
    if (!getColumnDescription()
        .equals(other.getColumnDescription())) return false;
    if (getIsTimeFilter()
        != other.getIsTimeFilter()) return false;
    if (getIsDefaultTimeFilter()
        != other.getIsDefaultTimeFilter()) return false;
    if (getIsJoinColumn()
        != other.getIsJoinColumn()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + COLUMN_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + columnType_;
    hash = (37 * hash) + IS_PRIMARY_KEY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsPrimaryKey());
    hash = (37 * hash) + IS_LOW_CARDINALITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsLowCardinality());
    hash = (37 * hash) + COLUMN_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getColumnDescription().hashCode();
    hash = (37 * hash) + IS_TIME_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsTimeFilter());
    hash = (37 * hash) + IS_DEFAULT_TIME_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsDefaultTimeFilter());
    hash = (37 * hash) + IS_JOIN_COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsJoinColumn());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField prototype) {
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
   * SchemaField is a field in a schema.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.explorer.SchemaField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.explorer.SchemaField)
      com.tcn.cloud.api.api.v1alpha1.explorer.SchemaFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_SchemaField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_SchemaField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField.class, com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField.newBuilder()
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
      name_ = "";
      columnType_ = 0;
      isPrimaryKey_ = false;
      isLowCardinality_ = false;
      columnDescription_ = "";
      isTimeFilter_ = false;
      isDefaultTimeFilter_ = false;
      isJoinColumn_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_SchemaField_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField build() {
      com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField result = new com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.columnType_ = columnType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isPrimaryKey_ = isPrimaryKey_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.isLowCardinality_ = isLowCardinality_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.columnDescription_ = columnDescription_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.isTimeFilter_ = isTimeFilter_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.isDefaultTimeFilter_ = isDefaultTimeFilter_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.isJoinColumn_ = isJoinColumn_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.columnType_ != 0) {
        setColumnTypeValue(other.getColumnTypeValue());
      }
      if (other.getIsPrimaryKey() != false) {
        setIsPrimaryKey(other.getIsPrimaryKey());
      }
      if (other.getIsLowCardinality() != false) {
        setIsLowCardinality(other.getIsLowCardinality());
      }
      if (!other.getColumnDescription().isEmpty()) {
        columnDescription_ = other.columnDescription_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getIsTimeFilter() != false) {
        setIsTimeFilter(other.getIsTimeFilter());
      }
      if (other.getIsDefaultTimeFilter() != false) {
        setIsDefaultTimeFilter(other.getIsDefaultTimeFilter());
      }
      if (other.getIsJoinColumn() != false) {
        setIsJoinColumn(other.getIsJoinColumn());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              columnType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              isPrimaryKey_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              isLowCardinality_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              columnDescription_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              isTimeFilter_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              isDefaultTimeFilter_ = input.readBool();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 64: {
              isJoinColumn_ = input.readBool();
              bitField0_ |= 0x00000080;
              break;
            } // case 64
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int columnType_ = 0;
    /**
     * <code>.api.v1alpha1.explorer.SchemaType column_type = 2 [json_name = "columnType"];</code>
     * @return The enum numeric value on the wire for columnType.
     */
    @java.lang.Override public int getColumnTypeValue() {
      return columnType_;
    }
    /**
     * <code>.api.v1alpha1.explorer.SchemaType column_type = 2 [json_name = "columnType"];</code>
     * @param value The enum numeric value on the wire for columnType to set.
     * @return This builder for chaining.
     */
    public Builder setColumnTypeValue(int value) {
      columnType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.explorer.SchemaType column_type = 2 [json_name = "columnType"];</code>
     * @return The columnType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType getColumnType() {
      com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType result = com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType.forNumber(columnType_);
      return result == null ? com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.v1alpha1.explorer.SchemaType column_type = 2 [json_name = "columnType"];</code>
     * @param value The columnType to set.
     * @return This builder for chaining.
     */
    public Builder setColumnType(com.tcn.cloud.api.api.v1alpha1.explorer.SchemaType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      columnType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.explorer.SchemaType column_type = 2 [json_name = "columnType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearColumnType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      columnType_ = 0;
      onChanged();
      return this;
    }

    private boolean isPrimaryKey_ ;
    /**
     * <code>bool is_primary_key = 3 [json_name = "isPrimaryKey"];</code>
     * @return The isPrimaryKey.
     */
    @java.lang.Override
    public boolean getIsPrimaryKey() {
      return isPrimaryKey_;
    }
    /**
     * <code>bool is_primary_key = 3 [json_name = "isPrimaryKey"];</code>
     * @param value The isPrimaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setIsPrimaryKey(boolean value) {

      isPrimaryKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_primary_key = 3 [json_name = "isPrimaryKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPrimaryKey() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isPrimaryKey_ = false;
      onChanged();
      return this;
    }

    private boolean isLowCardinality_ ;
    /**
     * <code>bool is_low_cardinality = 4 [json_name = "isLowCardinality"];</code>
     * @return The isLowCardinality.
     */
    @java.lang.Override
    public boolean getIsLowCardinality() {
      return isLowCardinality_;
    }
    /**
     * <code>bool is_low_cardinality = 4 [json_name = "isLowCardinality"];</code>
     * @param value The isLowCardinality to set.
     * @return This builder for chaining.
     */
    public Builder setIsLowCardinality(boolean value) {

      isLowCardinality_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_low_cardinality = 4 [json_name = "isLowCardinality"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsLowCardinality() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isLowCardinality_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object columnDescription_ = "";
    /**
     * <code>string column_description = 5 [json_name = "columnDescription"];</code>
     * @return The columnDescription.
     */
    public java.lang.String getColumnDescription() {
      java.lang.Object ref = columnDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        columnDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string column_description = 5 [json_name = "columnDescription"];</code>
     * @return The bytes for columnDescription.
     */
    public com.google.protobuf.ByteString
        getColumnDescriptionBytes() {
      java.lang.Object ref = columnDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        columnDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string column_description = 5 [json_name = "columnDescription"];</code>
     * @param value The columnDescription to set.
     * @return This builder for chaining.
     */
    public Builder setColumnDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      columnDescription_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string column_description = 5 [json_name = "columnDescription"];</code>
     * @return This builder for chaining.
     */
    public Builder clearColumnDescription() {
      columnDescription_ = getDefaultInstance().getColumnDescription();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string column_description = 5 [json_name = "columnDescription"];</code>
     * @param value The bytes for columnDescription to set.
     * @return This builder for chaining.
     */
    public Builder setColumnDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      columnDescription_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private boolean isTimeFilter_ ;
    /**
     * <code>bool is_time_filter = 6 [json_name = "isTimeFilter"];</code>
     * @return The isTimeFilter.
     */
    @java.lang.Override
    public boolean getIsTimeFilter() {
      return isTimeFilter_;
    }
    /**
     * <code>bool is_time_filter = 6 [json_name = "isTimeFilter"];</code>
     * @param value The isTimeFilter to set.
     * @return This builder for chaining.
     */
    public Builder setIsTimeFilter(boolean value) {

      isTimeFilter_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_time_filter = 6 [json_name = "isTimeFilter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsTimeFilter() {
      bitField0_ = (bitField0_ & ~0x00000020);
      isTimeFilter_ = false;
      onChanged();
      return this;
    }

    private boolean isDefaultTimeFilter_ ;
    /**
     * <code>bool is_default_time_filter = 7 [json_name = "isDefaultTimeFilter"];</code>
     * @return The isDefaultTimeFilter.
     */
    @java.lang.Override
    public boolean getIsDefaultTimeFilter() {
      return isDefaultTimeFilter_;
    }
    /**
     * <code>bool is_default_time_filter = 7 [json_name = "isDefaultTimeFilter"];</code>
     * @param value The isDefaultTimeFilter to set.
     * @return This builder for chaining.
     */
    public Builder setIsDefaultTimeFilter(boolean value) {

      isDefaultTimeFilter_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_default_time_filter = 7 [json_name = "isDefaultTimeFilter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsDefaultTimeFilter() {
      bitField0_ = (bitField0_ & ~0x00000040);
      isDefaultTimeFilter_ = false;
      onChanged();
      return this;
    }

    private boolean isJoinColumn_ ;
    /**
     * <code>bool is_join_column = 8 [json_name = "isJoinColumn"];</code>
     * @return The isJoinColumn.
     */
    @java.lang.Override
    public boolean getIsJoinColumn() {
      return isJoinColumn_;
    }
    /**
     * <code>bool is_join_column = 8 [json_name = "isJoinColumn"];</code>
     * @param value The isJoinColumn to set.
     * @return This builder for chaining.
     */
    public Builder setIsJoinColumn(boolean value) {

      isJoinColumn_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_join_column = 8 [json_name = "isJoinColumn"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsJoinColumn() {
      bitField0_ = (bitField0_ & ~0x00000080);
      isJoinColumn_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.explorer.SchemaField)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.explorer.SchemaField)
  private static final com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField();
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchemaField>
      PARSER = new com.google.protobuf.AbstractParser<SchemaField>() {
    @java.lang.Override
    public SchemaField parsePartialFrom(
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

  public static com.google.protobuf.Parser<SchemaField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchemaField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.explorer.SchemaField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

