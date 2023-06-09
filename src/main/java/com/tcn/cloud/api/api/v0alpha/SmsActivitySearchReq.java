// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/smsapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SmsActivitySearchReq}
 */
public final class SmsActivitySearchReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SmsActivitySearchReq)
    SmsActivitySearchReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmsActivitySearchReq.newBuilder() to construct.
  private SmsActivitySearchReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmsActivitySearchReq() {
    toNumber_ = "";
    srcNumber_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmsActivitySearchReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsActivitySearchReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsActivitySearchReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.class, com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.Builder.class);
  }

  public static final int TO_NUMBER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toNumber_ = "";
  /**
   * <code>string to_number = 1 [json_name = "toNumber"];</code>
   * @return The toNumber.
   */
  @java.lang.Override
  public java.lang.String getToNumber() {
    java.lang.Object ref = toNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string to_number = 1 [json_name = "toNumber"];</code>
   * @return The bytes for toNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToNumberBytes() {
    java.lang.Object ref = toNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SRC_NUMBER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object srcNumber_ = "";
  /**
   * <code>string src_number = 2 [json_name = "srcNumber"];</code>
   * @return The srcNumber.
   */
  @java.lang.Override
  public java.lang.String getSrcNumber() {
    java.lang.Object ref = srcNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      srcNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string src_number = 2 [json_name = "srcNumber"];</code>
   * @return The bytes for srcNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSrcNumberBytes() {
    java.lang.Object ref = srcNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      srcNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_DATE_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp fromDate_;
  /**
   * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
   * @return Whether the fromDate field is set.
   */
  @java.lang.Override
  public boolean hasFromDate() {
    return fromDate_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
   * @return The fromDate.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getFromDate() {
    return fromDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : fromDate_;
  }
  /**
   * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getFromDateOrBuilder() {
    return fromDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : fromDate_;
  }

  public static final int TO_DATE_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp toDate_;
  /**
   * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
   * @return Whether the toDate field is set.
   */
  @java.lang.Override
  public boolean hasToDate() {
    return toDate_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
   * @return The toDate.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getToDate() {
    return toDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : toDate_;
  }
  /**
   * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getToDateOrBuilder() {
    return toDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : toDate_;
  }

  public static final int ENTIRE_HISTORY_FIELD_NUMBER = 5;
  private boolean entireHistory_ = false;
  /**
   * <code>bool entire_history = 5 [json_name = "entireHistory"];</code>
   * @return The entireHistory.
   */
  @java.lang.Override
  public boolean getEntireHistory() {
    return entireHistory_;
  }

  public static final int SENT_ONLY_FIELD_NUMBER = 6;
  private boolean sentOnly_ = false;
  /**
   * <code>bool sent_only = 6 [json_name = "sentOnly"];</code>
   * @return The sentOnly.
   */
  @java.lang.Override
  public boolean getSentOnly() {
    return sentOnly_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, toNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(srcNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, srcNumber_);
    }
    if (fromDate_ != null) {
      output.writeMessage(3, getFromDate());
    }
    if (toDate_ != null) {
      output.writeMessage(4, getToDate());
    }
    if (entireHistory_ != false) {
      output.writeBool(5, entireHistory_);
    }
    if (sentOnly_ != false) {
      output.writeBool(6, sentOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, toNumber_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(srcNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, srcNumber_);
    }
    if (fromDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFromDate());
    }
    if (toDate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getToDate());
    }
    if (entireHistory_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, entireHistory_);
    }
    if (sentOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, sentOnly_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq other = (com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq) obj;

    if (!getToNumber()
        .equals(other.getToNumber())) return false;
    if (!getSrcNumber()
        .equals(other.getSrcNumber())) return false;
    if (hasFromDate() != other.hasFromDate()) return false;
    if (hasFromDate()) {
      if (!getFromDate()
          .equals(other.getFromDate())) return false;
    }
    if (hasToDate() != other.hasToDate()) return false;
    if (hasToDate()) {
      if (!getToDate()
          .equals(other.getToDate())) return false;
    }
    if (getEntireHistory()
        != other.getEntireHistory()) return false;
    if (getSentOnly()
        != other.getSentOnly()) return false;
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
    hash = (37 * hash) + TO_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getToNumber().hashCode();
    hash = (37 * hash) + SRC_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSrcNumber().hashCode();
    if (hasFromDate()) {
      hash = (37 * hash) + FROM_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getFromDate().hashCode();
    }
    if (hasToDate()) {
      hash = (37 * hash) + TO_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getToDate().hashCode();
    }
    hash = (37 * hash) + ENTIRE_HISTORY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEntireHistory());
    hash = (37 * hash) + SENT_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSentOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq prototype) {
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
   * Protobuf type {@code api.v0alpha.SmsActivitySearchReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SmsActivitySearchReq)
      com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsActivitySearchReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsActivitySearchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.class, com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.newBuilder()
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
      toNumber_ = "";
      srcNumber_ = "";
      fromDate_ = null;
      if (fromDateBuilder_ != null) {
        fromDateBuilder_.dispose();
        fromDateBuilder_ = null;
      }
      toDate_ = null;
      if (toDateBuilder_ != null) {
        toDateBuilder_.dispose();
        toDateBuilder_ = null;
      }
      entireHistory_ = false;
      sentOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsapiProto.internal_static_api_v0alpha_SmsActivitySearchReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq build() {
      com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq result = new com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.toNumber_ = toNumber_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.srcNumber_ = srcNumber_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fromDate_ = fromDateBuilder_ == null
            ? fromDate_
            : fromDateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.toDate_ = toDateBuilder_ == null
            ? toDate_
            : toDateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.entireHistory_ = entireHistory_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.sentOnly_ = sentOnly_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq.getDefaultInstance()) return this;
      if (!other.getToNumber().isEmpty()) {
        toNumber_ = other.toNumber_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSrcNumber().isEmpty()) {
        srcNumber_ = other.srcNumber_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasFromDate()) {
        mergeFromDate(other.getFromDate());
      }
      if (other.hasToDate()) {
        mergeToDate(other.getToDate());
      }
      if (other.getEntireHistory() != false) {
        setEntireHistory(other.getEntireHistory());
      }
      if (other.getSentOnly() != false) {
        setSentOnly(other.getSentOnly());
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
              toNumber_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              srcNumber_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getFromDateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getToDateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              entireHistory_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              sentOnly_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private java.lang.Object toNumber_ = "";
    /**
     * <code>string to_number = 1 [json_name = "toNumber"];</code>
     * @return The toNumber.
     */
    public java.lang.String getToNumber() {
      java.lang.Object ref = toNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_number = 1 [json_name = "toNumber"];</code>
     * @return The bytes for toNumber.
     */
    public com.google.protobuf.ByteString
        getToNumberBytes() {
      java.lang.Object ref = toNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_number = 1 [json_name = "toNumber"];</code>
     * @param value The toNumber to set.
     * @return This builder for chaining.
     */
    public Builder setToNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string to_number = 1 [json_name = "toNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToNumber() {
      toNumber_ = getDefaultInstance().getToNumber();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string to_number = 1 [json_name = "toNumber"];</code>
     * @param value The bytes for toNumber to set.
     * @return This builder for chaining.
     */
    public Builder setToNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toNumber_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object srcNumber_ = "";
    /**
     * <code>string src_number = 2 [json_name = "srcNumber"];</code>
     * @return The srcNumber.
     */
    public java.lang.String getSrcNumber() {
      java.lang.Object ref = srcNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        srcNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string src_number = 2 [json_name = "srcNumber"];</code>
     * @return The bytes for srcNumber.
     */
    public com.google.protobuf.ByteString
        getSrcNumberBytes() {
      java.lang.Object ref = srcNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        srcNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string src_number = 2 [json_name = "srcNumber"];</code>
     * @param value The srcNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSrcNumber(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      srcNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string src_number = 2 [json_name = "srcNumber"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSrcNumber() {
      srcNumber_ = getDefaultInstance().getSrcNumber();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string src_number = 2 [json_name = "srcNumber"];</code>
     * @param value The bytes for srcNumber to set.
     * @return This builder for chaining.
     */
    public Builder setSrcNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      srcNumber_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp fromDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> fromDateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     * @return Whether the fromDate field is set.
     */
    public boolean hasFromDate() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     * @return The fromDate.
     */
    public com.google.protobuf.Timestamp getFromDate() {
      if (fromDateBuilder_ == null) {
        return fromDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : fromDate_;
      } else {
        return fromDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     */
    public Builder setFromDate(com.google.protobuf.Timestamp value) {
      if (fromDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fromDate_ = value;
      } else {
        fromDateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     */
    public Builder setFromDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (fromDateBuilder_ == null) {
        fromDate_ = builderForValue.build();
      } else {
        fromDateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     */
    public Builder mergeFromDate(com.google.protobuf.Timestamp value) {
      if (fromDateBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          fromDate_ != null &&
          fromDate_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getFromDateBuilder().mergeFrom(value);
        } else {
          fromDate_ = value;
        }
      } else {
        fromDateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     */
    public Builder clearFromDate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fromDate_ = null;
      if (fromDateBuilder_ != null) {
        fromDateBuilder_.dispose();
        fromDateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getFromDateBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getFromDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getFromDateOrBuilder() {
      if (fromDateBuilder_ != null) {
        return fromDateBuilder_.getMessageOrBuilder();
      } else {
        return fromDate_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : fromDate_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp from_date = 3 [json_name = "fromDate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getFromDateFieldBuilder() {
      if (fromDateBuilder_ == null) {
        fromDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getFromDate(),
                getParentForChildren(),
                isClean());
        fromDate_ = null;
      }
      return fromDateBuilder_;
    }

    private com.google.protobuf.Timestamp toDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> toDateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     * @return Whether the toDate field is set.
     */
    public boolean hasToDate() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     * @return The toDate.
     */
    public com.google.protobuf.Timestamp getToDate() {
      if (toDateBuilder_ == null) {
        return toDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : toDate_;
      } else {
        return toDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     */
    public Builder setToDate(com.google.protobuf.Timestamp value) {
      if (toDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        toDate_ = value;
      } else {
        toDateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     */
    public Builder setToDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (toDateBuilder_ == null) {
        toDate_ = builderForValue.build();
      } else {
        toDateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     */
    public Builder mergeToDate(com.google.protobuf.Timestamp value) {
      if (toDateBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          toDate_ != null &&
          toDate_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getToDateBuilder().mergeFrom(value);
        } else {
          toDate_ = value;
        }
      } else {
        toDateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     */
    public Builder clearToDate() {
      bitField0_ = (bitField0_ & ~0x00000008);
      toDate_ = null;
      if (toDateBuilder_ != null) {
        toDateBuilder_.dispose();
        toDateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getToDateBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getToDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getToDateOrBuilder() {
      if (toDateBuilder_ != null) {
        return toDateBuilder_.getMessageOrBuilder();
      } else {
        return toDate_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : toDate_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp to_date = 4 [json_name = "toDate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getToDateFieldBuilder() {
      if (toDateBuilder_ == null) {
        toDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getToDate(),
                getParentForChildren(),
                isClean());
        toDate_ = null;
      }
      return toDateBuilder_;
    }

    private boolean entireHistory_ ;
    /**
     * <code>bool entire_history = 5 [json_name = "entireHistory"];</code>
     * @return The entireHistory.
     */
    @java.lang.Override
    public boolean getEntireHistory() {
      return entireHistory_;
    }
    /**
     * <code>bool entire_history = 5 [json_name = "entireHistory"];</code>
     * @param value The entireHistory to set.
     * @return This builder for chaining.
     */
    public Builder setEntireHistory(boolean value) {

      entireHistory_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool entire_history = 5 [json_name = "entireHistory"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntireHistory() {
      bitField0_ = (bitField0_ & ~0x00000010);
      entireHistory_ = false;
      onChanged();
      return this;
    }

    private boolean sentOnly_ ;
    /**
     * <code>bool sent_only = 6 [json_name = "sentOnly"];</code>
     * @return The sentOnly.
     */
    @java.lang.Override
    public boolean getSentOnly() {
      return sentOnly_;
    }
    /**
     * <code>bool sent_only = 6 [json_name = "sentOnly"];</code>
     * @param value The sentOnly to set.
     * @return This builder for chaining.
     */
    public Builder setSentOnly(boolean value) {

      sentOnly_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bool sent_only = 6 [json_name = "sentOnly"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSentOnly() {
      bitField0_ = (bitField0_ & ~0x00000020);
      sentOnly_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SmsActivitySearchReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SmsActivitySearchReq)
  private static final com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmsActivitySearchReq>
      PARSER = new com.google.protobuf.AbstractParser<SmsActivitySearchReq>() {
    @java.lang.Override
    public SmsActivitySearchReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmsActivitySearchReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmsActivitySearchReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SmsActivitySearchReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

