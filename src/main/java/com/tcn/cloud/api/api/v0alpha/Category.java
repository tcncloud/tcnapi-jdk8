// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.Category}
 */
public final class Category extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.Category)
    CategoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Category.newBuilder() to construct.
  private Category(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Category() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Category();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Category_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Category_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.Category.class, com.tcn.cloud.api.api.v0alpha.Category.Builder.class);
  }

  private int dataTypeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object dataType_;
  public enum DataTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STRING_VALUE(1),
    TIMESTAMP_VALUE(2),
    DATATYPE_NOT_SET(0);
    private final int value;
    private DataTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataTypeCase forNumber(int value) {
      switch (value) {
        case 1: return STRING_VALUE;
        case 2: return TIMESTAMP_VALUE;
        case 0: return DATATYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataTypeCase
  getDataTypeCase() {
    return DataTypeCase.forNumber(
        dataTypeCase_);
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 1;
  /**
   * <code>string string_value = 1 [json_name = "stringValue"];</code>
   * @return Whether the stringValue field is set.
   */
  public boolean hasStringValue() {
    return dataTypeCase_ == 1;
  }
  /**
   * <code>string string_value = 1 [json_name = "stringValue"];</code>
   * @return The stringValue.
   */
  public java.lang.String getStringValue() {
    java.lang.Object ref = "";
    if (dataTypeCase_ == 1) {
      ref = dataType_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (dataTypeCase_ == 1) {
        dataType_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string string_value = 1 [json_name = "stringValue"];</code>
   * @return The bytes for stringValue.
   */
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.Object ref = "";
    if (dataTypeCase_ == 1) {
      ref = dataType_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (dataTypeCase_ == 1) {
        dataType_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 2;
  /**
   * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
   * @return Whether the timestampValue field is set.
   */
  @java.lang.Override
  public boolean hasTimestampValue() {
    return dataTypeCase_ == 2;
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
   * @return The timestampValue.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestampValue() {
    if (dataTypeCase_ == 2) {
       return (com.google.protobuf.Timestamp) dataType_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }
  /**
   * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder() {
    if (dataTypeCase_ == 2) {
       return (com.google.protobuf.Timestamp) dataType_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
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
    if (dataTypeCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataType_);
    }
    if (dataTypeCase_ == 2) {
      output.writeMessage(2, (com.google.protobuf.Timestamp) dataType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataTypeCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataType_);
    }
    if (dataTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.protobuf.Timestamp) dataType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.Category)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.Category other = (com.tcn.cloud.api.api.v0alpha.Category) obj;

    if (!getDataTypeCase().equals(other.getDataTypeCase())) return false;
    switch (dataTypeCase_) {
      case 1:
        if (!getStringValue()
            .equals(other.getStringValue())) return false;
        break;
      case 2:
        if (!getTimestampValue()
            .equals(other.getTimestampValue())) return false;
        break;
      case 0:
      default:
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
    switch (dataTypeCase_) {
      case 1:
        hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getStringValue().hashCode();
        break;
      case 2:
        hash = (37 * hash) + TIMESTAMP_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTimestampValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.Category parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.Category parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Category parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.Category prototype) {
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
   * Protobuf type {@code api.v0alpha.Category}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.Category)
      com.tcn.cloud.api.api.v0alpha.CategoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Category_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Category_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.Category.class, com.tcn.cloud.api.api.v0alpha.Category.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.Category.newBuilder()
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
      if (timestampValueBuilder_ != null) {
        timestampValueBuilder_.clear();
      }
      dataTypeCase_ = 0;
      dataType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Category_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Category getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.Category.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Category build() {
      com.tcn.cloud.api.api.v0alpha.Category result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Category buildPartial() {
      com.tcn.cloud.api.api.v0alpha.Category result = new com.tcn.cloud.api.api.v0alpha.Category(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.Category result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v0alpha.Category result) {
      result.dataTypeCase_ = dataTypeCase_;
      result.dataType_ = this.dataType_;
      if (dataTypeCase_ == 2 &&
          timestampValueBuilder_ != null) {
        result.dataType_ = timestampValueBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.Category) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.Category)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.Category other) {
      if (other == com.tcn.cloud.api.api.v0alpha.Category.getDefaultInstance()) return this;
      switch (other.getDataTypeCase()) {
        case STRING_VALUE: {
          dataTypeCase_ = 1;
          dataType_ = other.dataType_;
          onChanged();
          break;
        }
        case TIMESTAMP_VALUE: {
          mergeTimestampValue(other.getTimestampValue());
          break;
        }
        case DATATYPE_NOT_SET: {
          break;
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              dataTypeCase_ = 1;
              dataType_ = s;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTimestampValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              dataTypeCase_ = 2;
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
    private int dataTypeCase_ = 0;
    private java.lang.Object dataType_;
    public DataTypeCase
        getDataTypeCase() {
      return DataTypeCase.forNumber(
          dataTypeCase_);
    }

    public Builder clearDataType() {
      dataTypeCase_ = 0;
      dataType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string string_value = 1 [json_name = "stringValue"];</code>
     * @return Whether the stringValue field is set.
     */
    @java.lang.Override
    public boolean hasStringValue() {
      return dataTypeCase_ == 1;
    }
    /**
     * <code>string string_value = 1 [json_name = "stringValue"];</code>
     * @return The stringValue.
     */
    @java.lang.Override
    public java.lang.String getStringValue() {
      java.lang.Object ref = "";
      if (dataTypeCase_ == 1) {
        ref = dataType_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (dataTypeCase_ == 1) {
          dataType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string string_value = 1 [json_name = "stringValue"];</code>
     * @return The bytes for stringValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = "";
      if (dataTypeCase_ == 1) {
        ref = dataType_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (dataTypeCase_ == 1) {
          dataType_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string string_value = 1 [json_name = "stringValue"];</code>
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dataTypeCase_ = 1;
      dataType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string string_value = 1 [json_name = "stringValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      if (dataTypeCase_ == 1) {
        dataTypeCase_ = 0;
        dataType_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string string_value = 1 [json_name = "stringValue"];</code>
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dataTypeCase_ = 1;
      dataType_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampValueBuilder_;
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     * @return Whether the timestampValue field is set.
     */
    @java.lang.Override
    public boolean hasTimestampValue() {
      return dataTypeCase_ == 2;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     * @return The timestampValue.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getTimestampValue() {
      if (timestampValueBuilder_ == null) {
        if (dataTypeCase_ == 2) {
          return (com.google.protobuf.Timestamp) dataType_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      } else {
        if (dataTypeCase_ == 2) {
          return timestampValueBuilder_.getMessage();
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     */
    public Builder setTimestampValue(com.google.protobuf.Timestamp value) {
      if (timestampValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataType_ = value;
        onChanged();
      } else {
        timestampValueBuilder_.setMessage(value);
      }
      dataTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     */
    public Builder setTimestampValue(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampValueBuilder_ == null) {
        dataType_ = builderForValue.build();
        onChanged();
      } else {
        timestampValueBuilder_.setMessage(builderForValue.build());
      }
      dataTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     */
    public Builder mergeTimestampValue(com.google.protobuf.Timestamp value) {
      if (timestampValueBuilder_ == null) {
        if (dataTypeCase_ == 2 &&
            dataType_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          dataType_ = com.google.protobuf.Timestamp.newBuilder((com.google.protobuf.Timestamp) dataType_)
              .mergeFrom(value).buildPartial();
        } else {
          dataType_ = value;
        }
        onChanged();
      } else {
        if (dataTypeCase_ == 2) {
          timestampValueBuilder_.mergeFrom(value);
        } else {
          timestampValueBuilder_.setMessage(value);
        }
      }
      dataTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     */
    public Builder clearTimestampValue() {
      if (timestampValueBuilder_ == null) {
        if (dataTypeCase_ == 2) {
          dataTypeCase_ = 0;
          dataType_ = null;
          onChanged();
        }
      } else {
        if (dataTypeCase_ == 2) {
          dataTypeCase_ = 0;
          dataType_ = null;
        }
        timestampValueBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampValueBuilder() {
      return getTimestampValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder() {
      if ((dataTypeCase_ == 2) && (timestampValueBuilder_ != null)) {
        return timestampValueBuilder_.getMessageOrBuilder();
      } else {
        if (dataTypeCase_ == 2) {
          return (com.google.protobuf.Timestamp) dataType_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp timestamp_value = 2 [json_name = "timestampValue"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampValueFieldBuilder() {
      if (timestampValueBuilder_ == null) {
        if (!(dataTypeCase_ == 2)) {
          dataType_ = com.google.protobuf.Timestamp.getDefaultInstance();
        }
        timestampValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                (com.google.protobuf.Timestamp) dataType_,
                getParentForChildren(),
                isClean());
        dataType_ = null;
      }
      dataTypeCase_ = 2;
      onChanged();
      return timestampValueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.Category)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.Category)
  private static final com.tcn.cloud.api.api.v0alpha.Category DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.Category();
  }

  public static com.tcn.cloud.api.api.v0alpha.Category getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Category>
      PARSER = new com.google.protobuf.AbstractParser<Category>() {
    @java.lang.Override
    public Category parsePartialFrom(
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

  public static com.google.protobuf.Parser<Category> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Category> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Category getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

