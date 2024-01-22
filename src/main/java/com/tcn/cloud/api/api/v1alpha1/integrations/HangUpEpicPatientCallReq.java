// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.HangUpEpicPatientCallReq}
 */
public final class HangUpEpicPatientCallReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.HangUpEpicPatientCallReq)
    HangUpEpicPatientCallReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HangUpEpicPatientCallReq.newBuilder() to construct.
  private HangUpEpicPatientCallReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HangUpEpicPatientCallReq() {
    phoneAgentID_ = "";
    originPhoneExtension_ = "";
    epicCallID_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HangUpEpicPatientCallReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_HangUpEpicPatientCallReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_HangUpEpicPatientCallReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.class, com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.Builder.class);
  }

  public static final int PHONEAGENTID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object phoneAgentID_ = "";
  /**
   * <pre>
   * The PhoneAgentID is the user’s ID in the phone system (TCN), which indicates to the phone system (TCN) which user is initiating a call.
   * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
   * The property will always be sent, although it may not be populated.
   * </pre>
   *
   * <code>string PhoneAgentID = 1 [json_name = "PhoneAgentID"];</code>
   * @return The phoneAgentID.
   */
  @java.lang.Override
  public java.lang.String getPhoneAgentID() {
    java.lang.Object ref = phoneAgentID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phoneAgentID_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The PhoneAgentID is the user’s ID in the phone system (TCN), which indicates to the phone system (TCN) which user is initiating a call.
   * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
   * The property will always be sent, although it may not be populated.
   * </pre>
   *
   * <code>string PhoneAgentID = 1 [json_name = "PhoneAgentID"];</code>
   * @return The bytes for phoneAgentID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPhoneAgentIDBytes() {
    java.lang.Object ref = phoneAgentID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phoneAgentID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORIGINPHONEEXTENSION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object originPhoneExtension_ = "";
  /**
   * <pre>
   * The extension used as the phone number for the call initiated from Epic.
   * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
   * The property will always be sent, although it may not be populated.
   * </pre>
   *
   * <code>string OriginPhoneExtension = 2 [json_name = "OriginPhoneExtension"];</code>
   * @return The originPhoneExtension.
   */
  @java.lang.Override
  public java.lang.String getOriginPhoneExtension() {
    java.lang.Object ref = originPhoneExtension_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      originPhoneExtension_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The extension used as the phone number for the call initiated from Epic.
   * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
   * The property will always be sent, although it may not be populated.
   * </pre>
   *
   * <code>string OriginPhoneExtension = 2 [json_name = "OriginPhoneExtension"];</code>
   * @return The bytes for originPhoneExtension.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginPhoneExtensionBytes() {
    java.lang.Object ref = originPhoneExtension_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      originPhoneExtension_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EPICCALLID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object epicCallID_ = "";
  /**
   * <pre>
   * The internal ID of the record in Epic that represents this call.
   * </pre>
   *
   * <code>string EpicCallID = 3 [json_name = "EpicCallID"];</code>
   * @return The epicCallID.
   */
  @java.lang.Override
  public java.lang.String getEpicCallID() {
    java.lang.Object ref = epicCallID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      epicCallID_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The internal ID of the record in Epic that represents this call.
   * </pre>
   *
   * <code>string EpicCallID = 3 [json_name = "EpicCallID"];</code>
   * @return The bytes for epicCallID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEpicCallIDBytes() {
    java.lang.Object ref = epicCallID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      epicCallID_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phoneAgentID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phoneAgentID_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originPhoneExtension_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, originPhoneExtension_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(epicCallID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, epicCallID_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(phoneAgentID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phoneAgentID_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originPhoneExtension_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, originPhoneExtension_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(epicCallID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, epicCallID_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq other = (com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq) obj;

    if (!getPhoneAgentID()
        .equals(other.getPhoneAgentID())) return false;
    if (!getOriginPhoneExtension()
        .equals(other.getOriginPhoneExtension())) return false;
    if (!getEpicCallID()
        .equals(other.getEpicCallID())) return false;
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
    hash = (37 * hash) + PHONEAGENTID_FIELD_NUMBER;
    hash = (53 * hash) + getPhoneAgentID().hashCode();
    hash = (37 * hash) + ORIGINPHONEEXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + getOriginPhoneExtension().hashCode();
    hash = (37 * hash) + EPICCALLID_FIELD_NUMBER;
    hash = (53 * hash) + getEpicCallID().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.HangUpEpicPatientCallReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.HangUpEpicPatientCallReq)
      com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_HangUpEpicPatientCallReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_HangUpEpicPatientCallReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.class, com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.newBuilder()
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
      phoneAgentID_ = "";
      originPhoneExtension_ = "";
      epicCallID_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_HangUpEpicPatientCallReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq result = new com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.phoneAgentID_ = phoneAgentID_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.originPhoneExtension_ = originPhoneExtension_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.epicCallID_ = epicCallID_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq.getDefaultInstance()) return this;
      if (!other.getPhoneAgentID().isEmpty()) {
        phoneAgentID_ = other.phoneAgentID_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOriginPhoneExtension().isEmpty()) {
        originPhoneExtension_ = other.originPhoneExtension_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getEpicCallID().isEmpty()) {
        epicCallID_ = other.epicCallID_;
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
              phoneAgentID_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              originPhoneExtension_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              epicCallID_ = input.readStringRequireUtf8();
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

    private java.lang.Object phoneAgentID_ = "";
    /**
     * <pre>
     * The PhoneAgentID is the user’s ID in the phone system (TCN), which indicates to the phone system (TCN) which user is initiating a call.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string PhoneAgentID = 1 [json_name = "PhoneAgentID"];</code>
     * @return The phoneAgentID.
     */
    public java.lang.String getPhoneAgentID() {
      java.lang.Object ref = phoneAgentID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneAgentID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The PhoneAgentID is the user’s ID in the phone system (TCN), which indicates to the phone system (TCN) which user is initiating a call.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string PhoneAgentID = 1 [json_name = "PhoneAgentID"];</code>
     * @return The bytes for phoneAgentID.
     */
    public com.google.protobuf.ByteString
        getPhoneAgentIDBytes() {
      java.lang.Object ref = phoneAgentID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneAgentID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The PhoneAgentID is the user’s ID in the phone system (TCN), which indicates to the phone system (TCN) which user is initiating a call.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string PhoneAgentID = 1 [json_name = "PhoneAgentID"];</code>
     * @param value The phoneAgentID to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneAgentID(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      phoneAgentID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The PhoneAgentID is the user’s ID in the phone system (TCN), which indicates to the phone system (TCN) which user is initiating a call.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string PhoneAgentID = 1 [json_name = "PhoneAgentID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneAgentID() {
      phoneAgentID_ = getDefaultInstance().getPhoneAgentID();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The PhoneAgentID is the user’s ID in the phone system (TCN), which indicates to the phone system (TCN) which user is initiating a call.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string PhoneAgentID = 1 [json_name = "PhoneAgentID"];</code>
     * @param value The bytes for phoneAgentID to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneAgentIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      phoneAgentID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object originPhoneExtension_ = "";
    /**
     * <pre>
     * The extension used as the phone number for the call initiated from Epic.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string OriginPhoneExtension = 2 [json_name = "OriginPhoneExtension"];</code>
     * @return The originPhoneExtension.
     */
    public java.lang.String getOriginPhoneExtension() {
      java.lang.Object ref = originPhoneExtension_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        originPhoneExtension_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The extension used as the phone number for the call initiated from Epic.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string OriginPhoneExtension = 2 [json_name = "OriginPhoneExtension"];</code>
     * @return The bytes for originPhoneExtension.
     */
    public com.google.protobuf.ByteString
        getOriginPhoneExtensionBytes() {
      java.lang.Object ref = originPhoneExtension_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        originPhoneExtension_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The extension used as the phone number for the call initiated from Epic.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string OriginPhoneExtension = 2 [json_name = "OriginPhoneExtension"];</code>
     * @param value The originPhoneExtension to set.
     * @return This builder for chaining.
     */
    public Builder setOriginPhoneExtension(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      originPhoneExtension_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The extension used as the phone number for the call initiated from Epic.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string OriginPhoneExtension = 2 [json_name = "OriginPhoneExtension"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginPhoneExtension() {
      originPhoneExtension_ = getDefaultInstance().getOriginPhoneExtension();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The extension used as the phone number for the call initiated from Epic.
     * At least one of PhoneAgentID and OriginPhoneExtension must be populated.
     * The property will always be sent, although it may not be populated.
     * </pre>
     *
     * <code>string OriginPhoneExtension = 2 [json_name = "OriginPhoneExtension"];</code>
     * @param value The bytes for originPhoneExtension to set.
     * @return This builder for chaining.
     */
    public Builder setOriginPhoneExtensionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      originPhoneExtension_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object epicCallID_ = "";
    /**
     * <pre>
     * The internal ID of the record in Epic that represents this call.
     * </pre>
     *
     * <code>string EpicCallID = 3 [json_name = "EpicCallID"];</code>
     * @return The epicCallID.
     */
    public java.lang.String getEpicCallID() {
      java.lang.Object ref = epicCallID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        epicCallID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The internal ID of the record in Epic that represents this call.
     * </pre>
     *
     * <code>string EpicCallID = 3 [json_name = "EpicCallID"];</code>
     * @return The bytes for epicCallID.
     */
    public com.google.protobuf.ByteString
        getEpicCallIDBytes() {
      java.lang.Object ref = epicCallID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        epicCallID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The internal ID of the record in Epic that represents this call.
     * </pre>
     *
     * <code>string EpicCallID = 3 [json_name = "EpicCallID"];</code>
     * @param value The epicCallID to set.
     * @return This builder for chaining.
     */
    public Builder setEpicCallID(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      epicCallID_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The internal ID of the record in Epic that represents this call.
     * </pre>
     *
     * <code>string EpicCallID = 3 [json_name = "EpicCallID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEpicCallID() {
      epicCallID_ = getDefaultInstance().getEpicCallID();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The internal ID of the record in Epic that represents this call.
     * </pre>
     *
     * <code>string EpicCallID = 3 [json_name = "EpicCallID"];</code>
     * @param value The bytes for epicCallID to set.
     * @return This builder for chaining.
     */
    public Builder setEpicCallIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      epicCallID_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.HangUpEpicPatientCallReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.HangUpEpicPatientCallReq)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HangUpEpicPatientCallReq>
      PARSER = new com.google.protobuf.AbstractParser<HangUpEpicPatientCallReq>() {
    @java.lang.Override
    public HangUpEpicPatientCallReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<HangUpEpicPatientCallReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HangUpEpicPatientCallReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.HangUpEpicPatientCallReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

