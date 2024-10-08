// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

/**
 * Protobuf type {@code api.v1alpha1.contactmanager.GetContactFieldTypeRequest}
 */
public final class GetContactFieldTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.contactmanager.GetContactFieldTypeRequest)
    GetContactFieldTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetContactFieldTypeRequest.newBuilder() to construct.
  private GetContactFieldTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetContactFieldTypeRequest() {
    fieldName_ = "";
    fieldValue_ = "";
    fieldType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetContactFieldTypeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactFieldTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactFieldTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FIELD_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldName_ = "";
  /**
   * <pre>
   * Field name to be analyzed by presidio
   * </pre>
   *
   * <code>string field_name = 1 [json_name = "fieldName"];</code>
   * @return The fieldName.
   */
  @java.lang.Override
  public java.lang.String getFieldName() {
    java.lang.Object ref = fieldName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Field name to be analyzed by presidio
   * </pre>
   *
   * <code>string field_name = 1 [json_name = "fieldName"];</code>
   * @return The bytes for fieldName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldNameBytes() {
    java.lang.Object ref = fieldName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldValue_ = "";
  /**
   * <pre>
   * Field value to be analyzed by presidio
   * </pre>
   *
   * <code>string field_value = 2 [json_name = "fieldValue"];</code>
   * @return The fieldValue.
   */
  @java.lang.Override
  public java.lang.String getFieldValue() {
    java.lang.Object ref = fieldValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Field value to be analyzed by presidio
   * </pre>
   *
   * <code>string field_value = 2 [json_name = "fieldValue"];</code>
   * @return The bytes for fieldValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldValueBytes() {
    java.lang.Object ref = fieldValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_TYPE_FIELD_NUMBER = 3;
  private int fieldType_ = 0;
  /**
   * <pre>
   * Field Type - optional to provide more info
   * </pre>
   *
   * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
   * @return Whether the fieldType field is set.
   */
  @java.lang.Override public boolean hasFieldType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Field Type - optional to provide more info
   * </pre>
   *
   * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  @java.lang.Override public int getFieldTypeValue() {
    return fieldType_;
  }
  /**
   * <pre>
   * Field Type - optional to provide more info
   * </pre>
   *
   * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
   * @return The fieldType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ClassifierEntityType getFieldType() {
    com.tcn.cloud.api.api.commons.ClassifierEntityType result = com.tcn.cloud.api.api.commons.ClassifierEntityType.forNumber(fieldType_);
    return result == null ? com.tcn.cloud.api.api.commons.ClassifierEntityType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fieldName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fieldValue_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(3, fieldType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fieldName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fieldValue_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, fieldType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest other = (com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest) obj;

    if (!getFieldName()
        .equals(other.getFieldName())) return false;
    if (!getFieldValue()
        .equals(other.getFieldValue())) return false;
    if (hasFieldType() != other.hasFieldType()) return false;
    if (hasFieldType()) {
      if (fieldType_ != other.fieldType_) return false;
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
    hash = (37 * hash) + FIELD_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFieldName().hashCode();
    hash = (37 * hash) + FIELD_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getFieldValue().hashCode();
    if (hasFieldType()) {
      hash = (37 * hash) + FIELD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + fieldType_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest prototype) {
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
   * Protobuf type {@code api.v1alpha1.contactmanager.GetContactFieldTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.contactmanager.GetContactFieldTypeRequest)
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactFieldTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactFieldTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.newBuilder()
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
      fieldName_ = "";
      fieldValue_ = "";
      fieldType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactFieldTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest build() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest result = new com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldName_ = fieldName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldValue_ = fieldValue_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fieldType_ = fieldType_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.getDefaultInstance()) return this;
      if (!other.getFieldName().isEmpty()) {
        fieldName_ = other.fieldName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFieldValue().isEmpty()) {
        fieldValue_ = other.fieldValue_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasFieldType()) {
        setFieldType(other.getFieldType());
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
              fieldName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              fieldValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              fieldType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object fieldName_ = "";
    /**
     * <pre>
     * Field name to be analyzed by presidio
     * </pre>
     *
     * <code>string field_name = 1 [json_name = "fieldName"];</code>
     * @return The fieldName.
     */
    public java.lang.String getFieldName() {
      java.lang.Object ref = fieldName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Field name to be analyzed by presidio
     * </pre>
     *
     * <code>string field_name = 1 [json_name = "fieldName"];</code>
     * @return The bytes for fieldName.
     */
    public com.google.protobuf.ByteString
        getFieldNameBytes() {
      java.lang.Object ref = fieldName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Field name to be analyzed by presidio
     * </pre>
     *
     * <code>string field_name = 1 [json_name = "fieldName"];</code>
     * @param value The fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field name to be analyzed by presidio
     * </pre>
     *
     * <code>string field_name = 1 [json_name = "fieldName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldName() {
      fieldName_ = getDefaultInstance().getFieldName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field name to be analyzed by presidio
     * </pre>
     *
     * <code>string field_name = 1 [json_name = "fieldName"];</code>
     * @param value The bytes for fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object fieldValue_ = "";
    /**
     * <pre>
     * Field value to be analyzed by presidio
     * </pre>
     *
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @return The fieldValue.
     */
    public java.lang.String getFieldValue() {
      java.lang.Object ref = fieldValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Field value to be analyzed by presidio
     * </pre>
     *
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @return The bytes for fieldValue.
     */
    public com.google.protobuf.ByteString
        getFieldValueBytes() {
      java.lang.Object ref = fieldValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Field value to be analyzed by presidio
     * </pre>
     *
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @param value The fieldValue to set.
     * @return This builder for chaining.
     */
    public Builder setFieldValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field value to be analyzed by presidio
     * </pre>
     *
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldValue() {
      fieldValue_ = getDefaultInstance().getFieldValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field value to be analyzed by presidio
     * </pre>
     *
     * <code>string field_value = 2 [json_name = "fieldValue"];</code>
     * @param value The bytes for fieldValue to set.
     * @return This builder for chaining.
     */
    public Builder setFieldValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int fieldType_ = 0;
    /**
     * <pre>
     * Field Type - optional to provide more info
     * </pre>
     *
     * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
     * @return Whether the fieldType field is set.
     */
    @java.lang.Override public boolean hasFieldType() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Field Type - optional to provide more info
     * </pre>
     *
     * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
     * @return The enum numeric value on the wire for fieldType.
     */
    @java.lang.Override public int getFieldTypeValue() {
      return fieldType_;
    }
    /**
     * <pre>
     * Field Type - optional to provide more info
     * </pre>
     *
     * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
     * @param value The enum numeric value on the wire for fieldType to set.
     * @return This builder for chaining.
     */
    public Builder setFieldTypeValue(int value) {
      fieldType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field Type - optional to provide more info
     * </pre>
     *
     * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
     * @return The fieldType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ClassifierEntityType getFieldType() {
      com.tcn.cloud.api.api.commons.ClassifierEntityType result = com.tcn.cloud.api.api.commons.ClassifierEntityType.forNumber(fieldType_);
      return result == null ? com.tcn.cloud.api.api.commons.ClassifierEntityType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Field Type - optional to provide more info
     * </pre>
     *
     * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
     * @param value The fieldType to set.
     * @return This builder for chaining.
     */
    public Builder setFieldType(com.tcn.cloud.api.api.commons.ClassifierEntityType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      fieldType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field Type - optional to provide more info
     * </pre>
     *
     * <code>optional .api.commons.ClassifierEntityType field_type = 3 [json_name = "fieldType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fieldType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.contactmanager.GetContactFieldTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.contactmanager.GetContactFieldTypeRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetContactFieldTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetContactFieldTypeRequest>() {
    @java.lang.Override
    public GetContactFieldTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetContactFieldTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetContactFieldTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

