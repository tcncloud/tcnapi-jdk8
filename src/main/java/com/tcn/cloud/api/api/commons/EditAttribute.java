// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.EditAttribute}
 */
public final class EditAttribute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.EditAttribute)
    EditAttributeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditAttribute.newBuilder() to construct.
  private EditAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditAttribute() {
    fromVal_ = "";
    toVal_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditAttribute();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_EditAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_EditAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.EditAttribute.class, com.tcn.cloud.api.api.commons.EditAttribute.Builder.class);
  }

  public static final int COL_DESC_FIELD_NUMBER = 1;
  private long colDesc_ = 0L;
  /**
   * <pre>
   * Column Descripter
   * </pre>
   *
   * <code>int64 col_desc = 1 [json_name = "colDesc", jstype = JS_STRING];</code>
   * @return The colDesc.
   */
  @java.lang.Override
  public long getColDesc() {
    return colDesc_;
  }

  public static final int FROM_VAL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fromVal_ = "";
  /**
   * <code>string from_val = 2 [json_name = "fromVal"];</code>
   * @return The fromVal.
   */
  @java.lang.Override
  public java.lang.String getFromVal() {
    java.lang.Object ref = fromVal_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromVal_ = s;
      return s;
    }
  }
  /**
   * <code>string from_val = 2 [json_name = "fromVal"];</code>
   * @return The bytes for fromVal.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromValBytes() {
    java.lang.Object ref = fromVal_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromVal_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_VAL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toVal_ = "";
  /**
   * <code>string to_val = 3 [json_name = "toVal"];</code>
   * @return The toVal.
   */
  @java.lang.Override
  public java.lang.String getToVal() {
    java.lang.Object ref = toVal_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toVal_ = s;
      return s;
    }
  }
  /**
   * <code>string to_val = 3 [json_name = "toVal"];</code>
   * @return The bytes for toVal.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToValBytes() {
    java.lang.Object ref = toVal_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toVal_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_EDITED_FIELD_NUMBER = 4;
  private boolean isEdited_ = false;
  /**
   * <code>bool is_edited = 4 [json_name = "isEdited"];</code>
   * @return The isEdited.
   */
  @java.lang.Override
  public boolean getIsEdited() {
    return isEdited_;
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
    if (colDesc_ != 0L) {
      output.writeInt64(1, colDesc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromVal_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fromVal_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toVal_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, toVal_);
    }
    if (isEdited_ != false) {
      output.writeBool(4, isEdited_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (colDesc_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, colDesc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromVal_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fromVal_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toVal_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, toVal_);
    }
    if (isEdited_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isEdited_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.EditAttribute)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.EditAttribute other = (com.tcn.cloud.api.api.commons.EditAttribute) obj;

    if (getColDesc()
        != other.getColDesc()) return false;
    if (!getFromVal()
        .equals(other.getFromVal())) return false;
    if (!getToVal()
        .equals(other.getToVal())) return false;
    if (getIsEdited()
        != other.getIsEdited()) return false;
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
    hash = (37 * hash) + COL_DESC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getColDesc());
    hash = (37 * hash) + FROM_VAL_FIELD_NUMBER;
    hash = (53 * hash) + getFromVal().hashCode();
    hash = (37 * hash) + TO_VAL_FIELD_NUMBER;
    hash = (53 * hash) + getToVal().hashCode();
    hash = (37 * hash) + IS_EDITED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsEdited());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.EditAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.EditAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.EditAttribute parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.EditAttribute prototype) {
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
   * Protobuf type {@code api.commons.EditAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.EditAttribute)
      com.tcn.cloud.api.api.commons.EditAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_EditAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_EditAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.EditAttribute.class, com.tcn.cloud.api.api.commons.EditAttribute.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.EditAttribute.newBuilder()
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
      colDesc_ = 0L;
      fromVal_ = "";
      toVal_ = "";
      isEdited_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_EditAttribute_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.EditAttribute getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.EditAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.EditAttribute build() {
      com.tcn.cloud.api.api.commons.EditAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.EditAttribute buildPartial() {
      com.tcn.cloud.api.api.commons.EditAttribute result = new com.tcn.cloud.api.api.commons.EditAttribute(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.EditAttribute result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.colDesc_ = colDesc_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fromVal_ = fromVal_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.toVal_ = toVal_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.isEdited_ = isEdited_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.EditAttribute) {
        return mergeFrom((com.tcn.cloud.api.api.commons.EditAttribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.EditAttribute other) {
      if (other == com.tcn.cloud.api.api.commons.EditAttribute.getDefaultInstance()) return this;
      if (other.getColDesc() != 0L) {
        setColDesc(other.getColDesc());
      }
      if (!other.getFromVal().isEmpty()) {
        fromVal_ = other.fromVal_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getToVal().isEmpty()) {
        toVal_ = other.toVal_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getIsEdited() != false) {
        setIsEdited(other.getIsEdited());
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
              colDesc_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              fromVal_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              toVal_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              isEdited_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private long colDesc_ ;
    /**
     * <pre>
     * Column Descripter
     * </pre>
     *
     * <code>int64 col_desc = 1 [json_name = "colDesc", jstype = JS_STRING];</code>
     * @return The colDesc.
     */
    @java.lang.Override
    public long getColDesc() {
      return colDesc_;
    }
    /**
     * <pre>
     * Column Descripter
     * </pre>
     *
     * <code>int64 col_desc = 1 [json_name = "colDesc", jstype = JS_STRING];</code>
     * @param value The colDesc to set.
     * @return This builder for chaining.
     */
    public Builder setColDesc(long value) {

      colDesc_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column Descripter
     * </pre>
     *
     * <code>int64 col_desc = 1 [json_name = "colDesc", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearColDesc() {
      bitField0_ = (bitField0_ & ~0x00000001);
      colDesc_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object fromVal_ = "";
    /**
     * <code>string from_val = 2 [json_name = "fromVal"];</code>
     * @return The fromVal.
     */
    public java.lang.String getFromVal() {
      java.lang.Object ref = fromVal_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromVal_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from_val = 2 [json_name = "fromVal"];</code>
     * @return The bytes for fromVal.
     */
    public com.google.protobuf.ByteString
        getFromValBytes() {
      java.lang.Object ref = fromVal_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromVal_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from_val = 2 [json_name = "fromVal"];</code>
     * @param value The fromVal to set.
     * @return This builder for chaining.
     */
    public Builder setFromVal(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fromVal_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string from_val = 2 [json_name = "fromVal"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFromVal() {
      fromVal_ = getDefaultInstance().getFromVal();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string from_val = 2 [json_name = "fromVal"];</code>
     * @param value The bytes for fromVal to set.
     * @return This builder for chaining.
     */
    public Builder setFromValBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fromVal_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object toVal_ = "";
    /**
     * <code>string to_val = 3 [json_name = "toVal"];</code>
     * @return The toVal.
     */
    public java.lang.String getToVal() {
      java.lang.Object ref = toVal_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toVal_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_val = 3 [json_name = "toVal"];</code>
     * @return The bytes for toVal.
     */
    public com.google.protobuf.ByteString
        getToValBytes() {
      java.lang.Object ref = toVal_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toVal_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_val = 3 [json_name = "toVal"];</code>
     * @param value The toVal to set.
     * @return This builder for chaining.
     */
    public Builder setToVal(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toVal_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string to_val = 3 [json_name = "toVal"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToVal() {
      toVal_ = getDefaultInstance().getToVal();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string to_val = 3 [json_name = "toVal"];</code>
     * @param value The bytes for toVal to set.
     * @return This builder for chaining.
     */
    public Builder setToValBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toVal_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean isEdited_ ;
    /**
     * <code>bool is_edited = 4 [json_name = "isEdited"];</code>
     * @return The isEdited.
     */
    @java.lang.Override
    public boolean getIsEdited() {
      return isEdited_;
    }
    /**
     * <code>bool is_edited = 4 [json_name = "isEdited"];</code>
     * @param value The isEdited to set.
     * @return This builder for chaining.
     */
    public Builder setIsEdited(boolean value) {

      isEdited_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_edited = 4 [json_name = "isEdited"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsEdited() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isEdited_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.commons.EditAttribute)
  }

  // @@protoc_insertion_point(class_scope:api.commons.EditAttribute)
  private static final com.tcn.cloud.api.api.commons.EditAttribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.EditAttribute();
  }

  public static com.tcn.cloud.api.api.commons.EditAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditAttribute>
      PARSER = new com.google.protobuf.AbstractParser<EditAttribute>() {
    @java.lang.Override
    public EditAttribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<EditAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.EditAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

