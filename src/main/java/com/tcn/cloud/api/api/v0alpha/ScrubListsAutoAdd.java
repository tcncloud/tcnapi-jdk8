// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * scrub list ids and field values used in lookup
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ScrubListsAutoAdd}
 */
public final class ScrubListsAutoAdd extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ScrubListsAutoAdd)
    ScrubListsAutoAddOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScrubListsAutoAdd.newBuilder() to construct.
  private ScrubListsAutoAdd(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScrubListsAutoAdd() {
    scrubList_ = "";
    fieldId_ = "";
    fieldName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScrubListsAutoAdd();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ScrubListsAutoAdd_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ScrubListsAutoAdd_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd.class, com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd.Builder.class);
  }

  public static final int SCRUB_LIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object scrubList_ = "";
  /**
   * <pre>
   * Scrub list ID
   * </pre>
   *
   * <code>string scrub_list = 1 [json_name = "scrubList"];</code>
   * @return The scrubList.
   */
  @java.lang.Override
  public java.lang.String getScrubList() {
    java.lang.Object ref = scrubList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scrubList_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Scrub list ID
   * </pre>
   *
   * <code>string scrub_list = 1 [json_name = "scrubList"];</code>
   * @return The bytes for scrubList.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScrubListBytes() {
    java.lang.Object ref = scrubList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scrubList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldId_ = "";
  /**
   * <pre>
   * Field ID to be added to scrub list
   * </pre>
   *
   * <code>string field_id = 2 [json_name = "fieldId"];</code>
   * @return The fieldId.
   */
  @java.lang.Override
  public java.lang.String getFieldId() {
    java.lang.Object ref = fieldId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fieldId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Field ID to be added to scrub list
   * </pre>
   *
   * <code>string field_id = 2 [json_name = "fieldId"];</code>
   * @return The bytes for fieldId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFieldIdBytes() {
    java.lang.Object ref = fieldId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fieldId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fieldName_ = "";
  /**
   * <pre>
   * Field name/value used to find calldata with same name/key
   * </pre>
   *
   * <code>string field_name = 3 [json_name = "fieldName"];</code>
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
   * Field name/value used to find calldata with same name/key
   * </pre>
   *
   * <code>string field_name = 3 [json_name = "fieldName"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scrubList_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scrubList_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fieldId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fieldName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scrubList_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scrubList_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fieldId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fieldName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fieldName_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd other = (com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd) obj;

    if (!getScrubList()
        .equals(other.getScrubList())) return false;
    if (!getFieldId()
        .equals(other.getFieldId())) return false;
    if (!getFieldName()
        .equals(other.getFieldName())) return false;
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
    hash = (37 * hash) + SCRUB_LIST_FIELD_NUMBER;
    hash = (53 * hash) + getScrubList().hashCode();
    hash = (37 * hash) + FIELD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFieldId().hashCode();
    hash = (37 * hash) + FIELD_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFieldName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd prototype) {
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
   * scrub list ids and field values used in lookup
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ScrubListsAutoAdd}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ScrubListsAutoAdd)
      com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAddOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ScrubListsAutoAdd_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ScrubListsAutoAdd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd.class, com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd.newBuilder()
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
      scrubList_ = "";
      fieldId_ = "";
      fieldName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ScrubListsAutoAdd_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd build() {
      com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd result = new com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scrubList_ = scrubList_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldId_ = fieldId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fieldName_ = fieldName_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd.getDefaultInstance()) return this;
      if (!other.getScrubList().isEmpty()) {
        scrubList_ = other.scrubList_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFieldId().isEmpty()) {
        fieldId_ = other.fieldId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFieldName().isEmpty()) {
        fieldName_ = other.fieldName_;
        bitField0_ |= 0x00000004;
        onChanged();
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
              scrubList_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              fieldId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              fieldName_ = input.readStringRequireUtf8();
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

    private java.lang.Object scrubList_ = "";
    /**
     * <pre>
     * Scrub list ID
     * </pre>
     *
     * <code>string scrub_list = 1 [json_name = "scrubList"];</code>
     * @return The scrubList.
     */
    public java.lang.String getScrubList() {
      java.lang.Object ref = scrubList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scrubList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Scrub list ID
     * </pre>
     *
     * <code>string scrub_list = 1 [json_name = "scrubList"];</code>
     * @return The bytes for scrubList.
     */
    public com.google.protobuf.ByteString
        getScrubListBytes() {
      java.lang.Object ref = scrubList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scrubList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Scrub list ID
     * </pre>
     *
     * <code>string scrub_list = 1 [json_name = "scrubList"];</code>
     * @param value The scrubList to set.
     * @return This builder for chaining.
     */
    public Builder setScrubList(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      scrubList_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scrub list ID
     * </pre>
     *
     * <code>string scrub_list = 1 [json_name = "scrubList"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScrubList() {
      scrubList_ = getDefaultInstance().getScrubList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Scrub list ID
     * </pre>
     *
     * <code>string scrub_list = 1 [json_name = "scrubList"];</code>
     * @param value The bytes for scrubList to set.
     * @return This builder for chaining.
     */
    public Builder setScrubListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      scrubList_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object fieldId_ = "";
    /**
     * <pre>
     * Field ID to be added to scrub list
     * </pre>
     *
     * <code>string field_id = 2 [json_name = "fieldId"];</code>
     * @return The fieldId.
     */
    public java.lang.String getFieldId() {
      java.lang.Object ref = fieldId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fieldId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Field ID to be added to scrub list
     * </pre>
     *
     * <code>string field_id = 2 [json_name = "fieldId"];</code>
     * @return The bytes for fieldId.
     */
    public com.google.protobuf.ByteString
        getFieldIdBytes() {
      java.lang.Object ref = fieldId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fieldId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Field ID to be added to scrub list
     * </pre>
     *
     * <code>string field_id = 2 [json_name = "fieldId"];</code>
     * @param value The fieldId to set.
     * @return This builder for chaining.
     */
    public Builder setFieldId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field ID to be added to scrub list
     * </pre>
     *
     * <code>string field_id = 2 [json_name = "fieldId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldId() {
      fieldId_ = getDefaultInstance().getFieldId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field ID to be added to scrub list
     * </pre>
     *
     * <code>string field_id = 2 [json_name = "fieldId"];</code>
     * @param value The bytes for fieldId to set.
     * @return This builder for chaining.
     */
    public Builder setFieldIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object fieldName_ = "";
    /**
     * <pre>
     * Field name/value used to find calldata with same name/key
     * </pre>
     *
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
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
     * Field name/value used to find calldata with same name/key
     * </pre>
     *
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
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
     * Field name/value used to find calldata with same name/key
     * </pre>
     *
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @param value The fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fieldName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field name/value used to find calldata with same name/key
     * </pre>
     *
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldName() {
      fieldName_ = getDefaultInstance().getFieldName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field name/value used to find calldata with same name/key
     * </pre>
     *
     * <code>string field_name = 3 [json_name = "fieldName"];</code>
     * @param value The bytes for fieldName to set.
     * @return This builder for chaining.
     */
    public Builder setFieldNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fieldName_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ScrubListsAutoAdd)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ScrubListsAutoAdd)
  private static final com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd();
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScrubListsAutoAdd>
      PARSER = new com.google.protobuf.AbstractParser<ScrubListsAutoAdd>() {
    @java.lang.Override
    public ScrubListsAutoAdd parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScrubListsAutoAdd> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScrubListsAutoAdd> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ScrubListsAutoAdd getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

