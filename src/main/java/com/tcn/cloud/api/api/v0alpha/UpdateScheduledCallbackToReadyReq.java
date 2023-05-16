// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/cbs.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateScheduledCallbackToReadyReq}
 */
public final class UpdateScheduledCallbackToReadyReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateScheduledCallbackToReadyReq)
    UpdateScheduledCallbackToReadyReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateScheduledCallbackToReadyReq.newBuilder() to construct.
  private UpdateScheduledCallbackToReadyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateScheduledCallbackToReadyReq() {
    scheduledCallbackId_ = "";
    serviceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateScheduledCallbackToReadyReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_UpdateScheduledCallbackToReadyReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_UpdateScheduledCallbackToReadyReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.class, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.Builder.class);
  }

  public static final int SCHEDULED_CALLBACK_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object scheduledCallbackId_ = "";
  /**
   * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
   * @return The scheduledCallbackId.
   */
  @java.lang.Override
  public java.lang.String getScheduledCallbackId() {
    java.lang.Object ref = scheduledCallbackId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scheduledCallbackId_ = s;
      return s;
    }
  }
  /**
   * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
   * @return The bytes for scheduledCallbackId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getScheduledCallbackIdBytes() {
    java.lang.Object ref = scheduledCallbackId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scheduledCallbackId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_AUTO_RETURN_FIELD_NUMBER = 3;
  private boolean isAutoReturn_ = false;
  /**
   * <code>bool is_auto_return = 3 [json_name = "isAutoReturn"];</code>
   * @return The isAutoReturn.
   */
  @java.lang.Override
  public boolean getIsAutoReturn() {
    return isAutoReturn_;
  }

  public static final int SERVICE_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceId_ = "";
  /**
   * <code>string service_id = 4 [json_name = "serviceId"];</code>
   * @return The serviceId.
   */
  @java.lang.Override
  public java.lang.String getServiceId() {
    java.lang.Object ref = serviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceId_ = s;
      return s;
    }
  }
  /**
   * <code>string service_id = 4 [json_name = "serviceId"];</code>
   * @return The bytes for serviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceIdBytes() {
    java.lang.Object ref = serviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scheduledCallbackId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scheduledCallbackId_);
    }
    if (isAutoReturn_ != false) {
      output.writeBool(3, isAutoReturn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serviceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scheduledCallbackId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, scheduledCallbackId_);
    }
    if (isAutoReturn_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isAutoReturn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, serviceId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq other = (com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq) obj;

    if (!getScheduledCallbackId()
        .equals(other.getScheduledCallbackId())) return false;
    if (getIsAutoReturn()
        != other.getIsAutoReturn()) return false;
    if (!getServiceId()
        .equals(other.getServiceId())) return false;
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
    hash = (37 * hash) + SCHEDULED_CALLBACK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getScheduledCallbackId().hashCode();
    hash = (37 * hash) + IS_AUTO_RETURN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAutoReturn());
    hash = (37 * hash) + SERVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateScheduledCallbackToReadyReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateScheduledCallbackToReadyReq)
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_UpdateScheduledCallbackToReadyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_UpdateScheduledCallbackToReadyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.class, com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.newBuilder()
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
      scheduledCallbackId_ = "";
      isAutoReturn_ = false;
      serviceId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.CbsProto.internal_static_api_v0alpha_UpdateScheduledCallbackToReadyReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq result = new com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scheduledCallbackId_ = scheduledCallbackId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isAutoReturn_ = isAutoReturn_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.serviceId_ = serviceId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq.getDefaultInstance()) return this;
      if (!other.getScheduledCallbackId().isEmpty()) {
        scheduledCallbackId_ = other.scheduledCallbackId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getIsAutoReturn() != false) {
        setIsAutoReturn(other.getIsAutoReturn());
      }
      if (!other.getServiceId().isEmpty()) {
        serviceId_ = other.serviceId_;
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
            case 18: {
              scheduledCallbackId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 24: {
              isAutoReturn_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 34: {
              serviceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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

    private java.lang.Object scheduledCallbackId_ = "";
    /**
     * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
     * @return The scheduledCallbackId.
     */
    public java.lang.String getScheduledCallbackId() {
      java.lang.Object ref = scheduledCallbackId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scheduledCallbackId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
     * @return The bytes for scheduledCallbackId.
     */
    public com.google.protobuf.ByteString
        getScheduledCallbackIdBytes() {
      java.lang.Object ref = scheduledCallbackId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scheduledCallbackId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
     * @param value The scheduledCallbackId to set.
     * @return This builder for chaining.
     */
    public Builder setScheduledCallbackId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      scheduledCallbackId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScheduledCallbackId() {
      scheduledCallbackId_ = getDefaultInstance().getScheduledCallbackId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string scheduled_callback_id = 2 [json_name = "scheduledCallbackId"];</code>
     * @param value The bytes for scheduledCallbackId to set.
     * @return This builder for chaining.
     */
    public Builder setScheduledCallbackIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      scheduledCallbackId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean isAutoReturn_ ;
    /**
     * <code>bool is_auto_return = 3 [json_name = "isAutoReturn"];</code>
     * @return The isAutoReturn.
     */
    @java.lang.Override
    public boolean getIsAutoReturn() {
      return isAutoReturn_;
    }
    /**
     * <code>bool is_auto_return = 3 [json_name = "isAutoReturn"];</code>
     * @param value The isAutoReturn to set.
     * @return This builder for chaining.
     */
    public Builder setIsAutoReturn(boolean value) {

      isAutoReturn_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_auto_return = 3 [json_name = "isAutoReturn"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAutoReturn() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isAutoReturn_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object serviceId_ = "";
    /**
     * <code>string service_id = 4 [json_name = "serviceId"];</code>
     * @return The serviceId.
     */
    public java.lang.String getServiceId() {
      java.lang.Object ref = serviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string service_id = 4 [json_name = "serviceId"];</code>
     * @return The bytes for serviceId.
     */
    public com.google.protobuf.ByteString
        getServiceIdBytes() {
      java.lang.Object ref = serviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string service_id = 4 [json_name = "serviceId"];</code>
     * @param value The serviceId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      serviceId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string service_id = 4 [json_name = "serviceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceId() {
      serviceId_ = getDefaultInstance().getServiceId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string service_id = 4 [json_name = "serviceId"];</code>
     * @param value The bytes for serviceId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      serviceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateScheduledCallbackToReadyReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateScheduledCallbackToReadyReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateScheduledCallbackToReadyReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateScheduledCallbackToReadyReq>() {
    @java.lang.Override
    public UpdateScheduledCallbackToReadyReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateScheduledCallbackToReadyReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateScheduledCallbackToReadyReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateScheduledCallbackToReadyReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

