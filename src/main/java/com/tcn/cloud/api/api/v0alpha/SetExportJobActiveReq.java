// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SetExportJobActiveReq}
 */
public final class SetExportJobActiveReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SetExportJobActiveReq)
    SetExportJobActiveReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetExportJobActiveReq.newBuilder() to construct.
  private SetExportJobActiveReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetExportJobActiveReq() {
    exportJobId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetExportJobActiveReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetExportJobActiveReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetExportJobActiveReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq.class, com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq.Builder.class);
  }

  public static final int EXPORT_JOB_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object exportJobId_ = "";
  /**
   * <code>string export_job_id = 2 [json_name = "exportJobId"];</code>
   * @return The exportJobId.
   */
  @java.lang.Override
  public java.lang.String getExportJobId() {
    java.lang.Object ref = exportJobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exportJobId_ = s;
      return s;
    }
  }
  /**
   * <code>string export_job_id = 2 [json_name = "exportJobId"];</code>
   * @return The bytes for exportJobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExportJobIdBytes() {
    java.lang.Object ref = exportJobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exportJobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SET_ACTIVE_FIELD_NUMBER = 3;
  private boolean setActive_ = false;
  /**
   * <code>bool set_active = 3 [json_name = "setActive"];</code>
   * @return The setActive.
   */
  @java.lang.Override
  public boolean getSetActive() {
    return setActive_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exportJobId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, exportJobId_);
    }
    if (setActive_ != false) {
      output.writeBool(3, setActive_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exportJobId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, exportJobId_);
    }
    if (setActive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, setActive_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq other = (com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq) obj;

    if (!getExportJobId()
        .equals(other.getExportJobId())) return false;
    if (getSetActive()
        != other.getSetActive()) return false;
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
    hash = (37 * hash) + EXPORT_JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getExportJobId().hashCode();
    hash = (37 * hash) + SET_ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSetActive());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq prototype) {
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
   * Protobuf type {@code api.v0alpha.SetExportJobActiveReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SetExportJobActiveReq)
      com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetExportJobActiveReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetExportJobActiveReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq.class, com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq.newBuilder()
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
      exportJobId_ = "";
      setActive_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetExportJobActiveReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq build() {
      com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq result = new com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.exportJobId_ = exportJobId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.setActive_ = setActive_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq.getDefaultInstance()) return this;
      if (!other.getExportJobId().isEmpty()) {
        exportJobId_ = other.exportJobId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getSetActive() != false) {
        setSetActive(other.getSetActive());
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
            case 18: {
              exportJobId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 24: {
              setActive_ = input.readBool();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object exportJobId_ = "";
    /**
     * <code>string export_job_id = 2 [json_name = "exportJobId"];</code>
     * @return The exportJobId.
     */
    public java.lang.String getExportJobId() {
      java.lang.Object ref = exportJobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exportJobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string export_job_id = 2 [json_name = "exportJobId"];</code>
     * @return The bytes for exportJobId.
     */
    public com.google.protobuf.ByteString
        getExportJobIdBytes() {
      java.lang.Object ref = exportJobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exportJobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string export_job_id = 2 [json_name = "exportJobId"];</code>
     * @param value The exportJobId to set.
     * @return This builder for chaining.
     */
    public Builder setExportJobId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      exportJobId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string export_job_id = 2 [json_name = "exportJobId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExportJobId() {
      exportJobId_ = getDefaultInstance().getExportJobId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string export_job_id = 2 [json_name = "exportJobId"];</code>
     * @param value The bytes for exportJobId to set.
     * @return This builder for chaining.
     */
    public Builder setExportJobIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      exportJobId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean setActive_ ;
    /**
     * <code>bool set_active = 3 [json_name = "setActive"];</code>
     * @return The setActive.
     */
    @java.lang.Override
    public boolean getSetActive() {
      return setActive_;
    }
    /**
     * <code>bool set_active = 3 [json_name = "setActive"];</code>
     * @param value The setActive to set.
     * @return This builder for chaining.
     */
    public Builder setSetActive(boolean value) {

      setActive_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool set_active = 3 [json_name = "setActive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSetActive() {
      bitField0_ = (bitField0_ & ~0x00000002);
      setActive_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SetExportJobActiveReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SetExportJobActiveReq)
  private static final com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetExportJobActiveReq>
      PARSER = new com.google.protobuf.AbstractParser<SetExportJobActiveReq>() {
    @java.lang.Override
    public SetExportJobActiveReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetExportJobActiveReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetExportJobActiveReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SetExportJobActiveReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

