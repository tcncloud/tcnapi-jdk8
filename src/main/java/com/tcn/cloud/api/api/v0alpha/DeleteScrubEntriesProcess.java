// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * This process collects data from a specific fields in all the records in the lms list
 * and calls Compliance.DeleteScrubListEntries() on them.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.DeleteScrubEntriesProcess}
 */
public final class DeleteScrubEntriesProcess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DeleteScrubEntriesProcess)
    DeleteScrubEntriesProcessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteScrubEntriesProcess.newBuilder() to construct.
  private DeleteScrubEntriesProcess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteScrubEntriesProcess() {
    listId_ = "";
    field_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteScrubEntriesProcess();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeleteScrubEntriesProcess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeleteScrubEntriesProcess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess.class, com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess.Builder.class);
  }

  public static final int LIST_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object listId_ = "";
  /**
   * <pre>
   * 'list_id' is the id of the scrub list in compliance to delete from
   * </pre>
   *
   * <code>string list_id = 3 [json_name = "listId"];</code>
   * @return The listId.
   */
  @java.lang.Override
  public java.lang.String getListId() {
    java.lang.Object ref = listId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      listId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 'list_id' is the id of the scrub list in compliance to delete from
   * </pre>
   *
   * <code>string list_id = 3 [json_name = "listId"];</code>
   * @return The bytes for listId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getListIdBytes() {
    java.lang.Object ref = listId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      listId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object field_ = "";
  /**
   * <pre>
   * 'field' is which column on an lms record that contains the data we want to delete
   * from the scrub list in compliance.
   * ex: if field is "first"  all records that contain a record field named "first" will have their contents
   * collected, and sent to compliance to be deleted from scrub list.
   * </pre>
   *
   * <code>string field = 4 [json_name = "field"];</code>
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
   * 'field' is which column on an lms record that contains the data we want to delete
   * from the scrub list in compliance.
   * ex: if field is "first"  all records that contain a record field named "first" will have their contents
   * collected, and sent to compliance to be deleted from scrub list.
   * </pre>
   *
   * <code>string field = 4 [json_name = "field"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, listId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(field_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, field_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(listId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, listId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(field_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, field_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess other = (com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess) obj;

    if (!getListId()
        .equals(other.getListId())) return false;
    if (!getField()
        .equals(other.getField())) return false;
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
    hash = (37 * hash) + LIST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getListId().hashCode();
    hash = (37 * hash) + FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getField().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess prototype) {
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
   * This process collects data from a specific fields in all the records in the lms list
   * and calls Compliance.DeleteScrubListEntries() on them.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.DeleteScrubEntriesProcess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DeleteScrubEntriesProcess)
      com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeleteScrubEntriesProcess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeleteScrubEntriesProcess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess.class, com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess.newBuilder()
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
      listId_ = "";
      field_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeleteScrubEntriesProcess_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess build() {
      com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess result = new com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.listId_ = listId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.field_ = field_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess.getDefaultInstance()) return this;
      if (!other.getListId().isEmpty()) {
        listId_ = other.listId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getField().isEmpty()) {
        field_ = other.field_;
        bitField0_ |= 0x00000002;
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
            case 26: {
              listId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 34: {
              field_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object listId_ = "";
    /**
     * <pre>
     * 'list_id' is the id of the scrub list in compliance to delete from
     * </pre>
     *
     * <code>string list_id = 3 [json_name = "listId"];</code>
     * @return The listId.
     */
    public java.lang.String getListId() {
      java.lang.Object ref = listId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        listId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 'list_id' is the id of the scrub list in compliance to delete from
     * </pre>
     *
     * <code>string list_id = 3 [json_name = "listId"];</code>
     * @return The bytes for listId.
     */
    public com.google.protobuf.ByteString
        getListIdBytes() {
      java.lang.Object ref = listId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        listId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 'list_id' is the id of the scrub list in compliance to delete from
     * </pre>
     *
     * <code>string list_id = 3 [json_name = "listId"];</code>
     * @param value The listId to set.
     * @return This builder for chaining.
     */
    public Builder setListId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      listId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 'list_id' is the id of the scrub list in compliance to delete from
     * </pre>
     *
     * <code>string list_id = 3 [json_name = "listId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearListId() {
      listId_ = getDefaultInstance().getListId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 'list_id' is the id of the scrub list in compliance to delete from
     * </pre>
     *
     * <code>string list_id = 3 [json_name = "listId"];</code>
     * @param value The bytes for listId to set.
     * @return This builder for chaining.
     */
    public Builder setListIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      listId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object field_ = "";
    /**
     * <pre>
     * 'field' is which column on an lms record that contains the data we want to delete
     * from the scrub list in compliance.
     * ex: if field is "first"  all records that contain a record field named "first" will have their contents
     * collected, and sent to compliance to be deleted from scrub list.
     * </pre>
     *
     * <code>string field = 4 [json_name = "field"];</code>
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
     * 'field' is which column on an lms record that contains the data we want to delete
     * from the scrub list in compliance.
     * ex: if field is "first"  all records that contain a record field named "first" will have their contents
     * collected, and sent to compliance to be deleted from scrub list.
     * </pre>
     *
     * <code>string field = 4 [json_name = "field"];</code>
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
     * 'field' is which column on an lms record that contains the data we want to delete
     * from the scrub list in compliance.
     * ex: if field is "first"  all records that contain a record field named "first" will have their contents
     * collected, and sent to compliance to be deleted from scrub list.
     * </pre>
     *
     * <code>string field = 4 [json_name = "field"];</code>
     * @param value The field to set.
     * @return This builder for chaining.
     */
    public Builder setField(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      field_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 'field' is which column on an lms record that contains the data we want to delete
     * from the scrub list in compliance.
     * ex: if field is "first"  all records that contain a record field named "first" will have their contents
     * collected, and sent to compliance to be deleted from scrub list.
     * </pre>
     *
     * <code>string field = 4 [json_name = "field"];</code>
     * @return This builder for chaining.
     */
    public Builder clearField() {
      field_ = getDefaultInstance().getField();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 'field' is which column on an lms record that contains the data we want to delete
     * from the scrub list in compliance.
     * ex: if field is "first"  all records that contain a record field named "first" will have their contents
     * collected, and sent to compliance to be deleted from scrub list.
     * </pre>
     *
     * <code>string field = 4 [json_name = "field"];</code>
     * @param value The bytes for field to set.
     * @return This builder for chaining.
     */
    public Builder setFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      field_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DeleteScrubEntriesProcess)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DeleteScrubEntriesProcess)
  private static final com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess();
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteScrubEntriesProcess>
      PARSER = new com.google.protobuf.AbstractParser<DeleteScrubEntriesProcess>() {
    @java.lang.Override
    public DeleteScrubEntriesProcess parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteScrubEntriesProcess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteScrubEntriesProcess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

