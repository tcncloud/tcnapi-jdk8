// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ScrubProcess}
 */
public final class ScrubProcess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ScrubProcess)
    ScrubProcessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScrubProcess.newBuilder() to construct.
  private ScrubProcess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScrubProcess() {
    listId_ = "";
    field_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScrubProcess();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ScrubProcess_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ScrubProcess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ScrubProcess.class, com.tcn.cloud.api.api.v0alpha.ScrubProcess.Builder.class);
  }

  public static final int LIST_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object listId_ = "";
  /**
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ScrubProcess)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ScrubProcess other = (com.tcn.cloud.api.api.v0alpha.ScrubProcess) obj;

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

  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ScrubProcess prototype) {
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
   * Protobuf type {@code api.v0alpha.ScrubProcess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ScrubProcess)
      com.tcn.cloud.api.api.v0alpha.ScrubProcessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ScrubProcess_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ScrubProcess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ScrubProcess.class, com.tcn.cloud.api.api.v0alpha.ScrubProcess.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ScrubProcess.newBuilder()
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
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_ScrubProcess_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubProcess getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ScrubProcess.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubProcess build() {
      com.tcn.cloud.api.api.v0alpha.ScrubProcess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ScrubProcess buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ScrubProcess result = new com.tcn.cloud.api.api.v0alpha.ScrubProcess(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ScrubProcess result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.listId_ = listId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.field_ = field_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ScrubProcess) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ScrubProcess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ScrubProcess other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ScrubProcess.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ScrubProcess)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ScrubProcess)
  private static final com.tcn.cloud.api.api.v0alpha.ScrubProcess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ScrubProcess();
  }

  public static com.tcn.cloud.api.api.v0alpha.ScrubProcess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScrubProcess>
      PARSER = new com.google.protobuf.AbstractParser<ScrubProcess>() {
    @java.lang.Override
    public ScrubProcess parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScrubProcess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScrubProcess> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ScrubProcess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

