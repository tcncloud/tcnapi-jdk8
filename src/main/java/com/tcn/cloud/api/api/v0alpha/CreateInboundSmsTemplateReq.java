// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateInboundSmsTemplateReq}
 */
public final class CreateInboundSmsTemplateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateInboundSmsTemplateReq)
    CreateInboundSmsTemplateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateInboundSmsTemplateReq.newBuilder() to construct.
  private CreateInboundSmsTemplateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateInboundSmsTemplateReq() {
    name_ = "";
    smsIntentTemplateSid_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateInboundSmsTemplateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateInboundSmsTemplateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateInboundSmsTemplateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.class, com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.Builder.class);
  }

  private int bitField0_;
  public static final int SMS_NUMBER_SID_FIELD_NUMBER = 1;
  private long smsNumberSid_ = 0L;
  /**
   * <code>int64 sms_number_sid = 1 [json_name = "smsNumberSid"];</code>
   * @return The smsNumberSid.
   */
  @java.lang.Override
  public long getSmsNumberSid() {
    return smsNumberSid_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2 [json_name = "name"];</code>
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
   * <code>string name = 2 [json_name = "name"];</code>
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

  public static final int SMS_INTENT_TEMPLATE_SID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList smsIntentTemplateSid_ =
      emptyLongList();
  /**
   * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
   * @return A list containing the smsIntentTemplateSid.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getSmsIntentTemplateSidList() {
    return smsIntentTemplateSid_;
  }
  /**
   * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
   * @return The count of smsIntentTemplateSid.
   */
  public int getSmsIntentTemplateSidCount() {
    return smsIntentTemplateSid_.size();
  }
  /**
   * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
   * @param index The index of the element to return.
   * @return The smsIntentTemplateSid at the given index.
   */
  public long getSmsIntentTemplateSid(int index) {
    return smsIntentTemplateSid_.getLong(index);
  }
  private int smsIntentTemplateSidMemoizedSerializedSize = -1;

  public static final int REPORT_SETTINGS_FIELD_NUMBER = 6;
  private com.tcn.cloud.api.api.v0alpha.ReportSettings reportSettings_;
  /**
   * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
   * @return Whether the reportSettings field is set.
   */
  @java.lang.Override
  public boolean hasReportSettings() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
   * @return The reportSettings.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ReportSettings getReportSettings() {
    return reportSettings_ == null ? com.tcn.cloud.api.api.v0alpha.ReportSettings.getDefaultInstance() : reportSettings_;
  }
  /**
   * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ReportSettingsOrBuilder getReportSettingsOrBuilder() {
    return reportSettings_ == null ? com.tcn.cloud.api.api.v0alpha.ReportSettings.getDefaultInstance() : reportSettings_;
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
    getSerializedSize();
    if (smsNumberSid_ != 0L) {
      output.writeInt64(1, smsNumberSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (getSmsIntentTemplateSidList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(smsIntentTemplateSidMemoizedSerializedSize);
    }
    for (int i = 0; i < smsIntentTemplateSid_.size(); i++) {
      output.writeInt64NoTag(smsIntentTemplateSid_.getLong(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(6, getReportSettings());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (smsNumberSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, smsNumberSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < smsIntentTemplateSid_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(smsIntentTemplateSid_.getLong(i));
      }
      size += dataSize;
      if (!getSmsIntentTemplateSidList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      smsIntentTemplateSidMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getReportSettings());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq other = (com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq) obj;

    if (getSmsNumberSid()
        != other.getSmsNumberSid()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getSmsIntentTemplateSidList()
        .equals(other.getSmsIntentTemplateSidList())) return false;
    if (hasReportSettings() != other.hasReportSettings()) return false;
    if (hasReportSettings()) {
      if (!getReportSettings()
          .equals(other.getReportSettings())) return false;
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
    hash = (37 * hash) + SMS_NUMBER_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSmsNumberSid());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getSmsIntentTemplateSidCount() > 0) {
      hash = (37 * hash) + SMS_INTENT_TEMPLATE_SID_FIELD_NUMBER;
      hash = (53 * hash) + getSmsIntentTemplateSidList().hashCode();
    }
    if (hasReportSettings()) {
      hash = (37 * hash) + REPORT_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getReportSettings().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateInboundSmsTemplateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateInboundSmsTemplateReq)
      com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateInboundSmsTemplateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateInboundSmsTemplateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.class, com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getReportSettingsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      smsNumberSid_ = 0L;
      name_ = "";
      smsIntentTemplateSid_ = emptyLongList();
      reportSettings_ = null;
      if (reportSettingsBuilder_ != null) {
        reportSettingsBuilder_.dispose();
        reportSettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_CreateInboundSmsTemplateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq result = new com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.smsNumberSid_ = smsNumberSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        smsIntentTemplateSid_.makeImmutable();
        result.smsIntentTemplateSid_ = smsIntentTemplateSid_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.reportSettings_ = reportSettingsBuilder_ == null
            ? reportSettings_
            : reportSettingsBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq.getDefaultInstance()) return this;
      if (other.getSmsNumberSid() != 0L) {
        setSmsNumberSid(other.getSmsNumberSid());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.smsIntentTemplateSid_.isEmpty()) {
        if (smsIntentTemplateSid_.isEmpty()) {
          smsIntentTemplateSid_ = other.smsIntentTemplateSid_;
          smsIntentTemplateSid_.makeImmutable();
          bitField0_ |= 0x00000004;
        } else {
          ensureSmsIntentTemplateSidIsMutable();
          smsIntentTemplateSid_.addAll(other.smsIntentTemplateSid_);
        }
        onChanged();
      }
      if (other.hasReportSettings()) {
        mergeReportSettings(other.getReportSettings());
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
              smsNumberSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 40: {
              long v = input.readInt64();
              ensureSmsIntentTemplateSidIsMutable();
              smsIntentTemplateSid_.addLong(v);
              break;
            } // case 40
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureSmsIntentTemplateSidIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                smsIntentTemplateSid_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 42
            case 50: {
              input.readMessage(
                  getReportSettingsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 50
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

    private long smsNumberSid_ ;
    /**
     * <code>int64 sms_number_sid = 1 [json_name = "smsNumberSid"];</code>
     * @return The smsNumberSid.
     */
    @java.lang.Override
    public long getSmsNumberSid() {
      return smsNumberSid_;
    }
    /**
     * <code>int64 sms_number_sid = 1 [json_name = "smsNumberSid"];</code>
     * @param value The smsNumberSid to set.
     * @return This builder for chaining.
     */
    public Builder setSmsNumberSid(long value) {

      smsNumberSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 sms_number_sid = 1 [json_name = "smsNumberSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSmsNumberSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      smsNumberSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2 [json_name = "name"];</code>
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
     * <code>string name = 2 [json_name = "name"];</code>
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
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList smsIntentTemplateSid_ = emptyLongList();
    private void ensureSmsIntentTemplateSidIsMutable() {
      if (!smsIntentTemplateSid_.isModifiable()) {
        smsIntentTemplateSid_ = makeMutableCopy(smsIntentTemplateSid_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
     * @return A list containing the smsIntentTemplateSid.
     */
    public java.util.List<java.lang.Long>
        getSmsIntentTemplateSidList() {
      smsIntentTemplateSid_.makeImmutable();
      return smsIntentTemplateSid_;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
     * @return The count of smsIntentTemplateSid.
     */
    public int getSmsIntentTemplateSidCount() {
      return smsIntentTemplateSid_.size();
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
     * @param index The index of the element to return.
     * @return The smsIntentTemplateSid at the given index.
     */
    public long getSmsIntentTemplateSid(int index) {
      return smsIntentTemplateSid_.getLong(index);
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
     * @param index The index to set the value at.
     * @param value The smsIntentTemplateSid to set.
     * @return This builder for chaining.
     */
    public Builder setSmsIntentTemplateSid(
        int index, long value) {

      ensureSmsIntentTemplateSidIsMutable();
      smsIntentTemplateSid_.setLong(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
     * @param value The smsIntentTemplateSid to add.
     * @return This builder for chaining.
     */
    public Builder addSmsIntentTemplateSid(long value) {

      ensureSmsIntentTemplateSidIsMutable();
      smsIntentTemplateSid_.addLong(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
     * @param values The smsIntentTemplateSid to add.
     * @return This builder for chaining.
     */
    public Builder addAllSmsIntentTemplateSid(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureSmsIntentTemplateSidIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, smsIntentTemplateSid_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 sms_intent_template_sid = 5 [json_name = "smsIntentTemplateSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSmsIntentTemplateSid() {
      smsIntentTemplateSid_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.ReportSettings reportSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ReportSettings, com.tcn.cloud.api.api.v0alpha.ReportSettings.Builder, com.tcn.cloud.api.api.v0alpha.ReportSettingsOrBuilder> reportSettingsBuilder_;
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     * @return Whether the reportSettings field is set.
     */
    public boolean hasReportSettings() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     * @return The reportSettings.
     */
    public com.tcn.cloud.api.api.v0alpha.ReportSettings getReportSettings() {
      if (reportSettingsBuilder_ == null) {
        return reportSettings_ == null ? com.tcn.cloud.api.api.v0alpha.ReportSettings.getDefaultInstance() : reportSettings_;
      } else {
        return reportSettingsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     */
    public Builder setReportSettings(com.tcn.cloud.api.api.v0alpha.ReportSettings value) {
      if (reportSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reportSettings_ = value;
      } else {
        reportSettingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     */
    public Builder setReportSettings(
        com.tcn.cloud.api.api.v0alpha.ReportSettings.Builder builderForValue) {
      if (reportSettingsBuilder_ == null) {
        reportSettings_ = builderForValue.build();
      } else {
        reportSettingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     */
    public Builder mergeReportSettings(com.tcn.cloud.api.api.v0alpha.ReportSettings value) {
      if (reportSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          reportSettings_ != null &&
          reportSettings_ != com.tcn.cloud.api.api.v0alpha.ReportSettings.getDefaultInstance()) {
          getReportSettingsBuilder().mergeFrom(value);
        } else {
          reportSettings_ = value;
        }
      } else {
        reportSettingsBuilder_.mergeFrom(value);
      }
      if (reportSettings_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     */
    public Builder clearReportSettings() {
      bitField0_ = (bitField0_ & ~0x00000008);
      reportSettings_ = null;
      if (reportSettingsBuilder_ != null) {
        reportSettingsBuilder_.dispose();
        reportSettingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ReportSettings.Builder getReportSettingsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getReportSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ReportSettingsOrBuilder getReportSettingsOrBuilder() {
      if (reportSettingsBuilder_ != null) {
        return reportSettingsBuilder_.getMessageOrBuilder();
      } else {
        return reportSettings_ == null ?
            com.tcn.cloud.api.api.v0alpha.ReportSettings.getDefaultInstance() : reportSettings_;
      }
    }
    /**
     * <code>.api.v0alpha.ReportSettings report_settings = 6 [json_name = "reportSettings"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ReportSettings, com.tcn.cloud.api.api.v0alpha.ReportSettings.Builder, com.tcn.cloud.api.api.v0alpha.ReportSettingsOrBuilder> 
        getReportSettingsFieldBuilder() {
      if (reportSettingsBuilder_ == null) {
        reportSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ReportSettings, com.tcn.cloud.api.api.v0alpha.ReportSettings.Builder, com.tcn.cloud.api.api.v0alpha.ReportSettingsOrBuilder>(
                getReportSettings(),
                getParentForChildren(),
                isClean());
        reportSettings_ = null;
      }
      return reportSettingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateInboundSmsTemplateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateInboundSmsTemplateReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateInboundSmsTemplateReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateInboundSmsTemplateReq>() {
    @java.lang.Override
    public CreateInboundSmsTemplateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateInboundSmsTemplateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateInboundSmsTemplateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateInboundSmsTemplateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

