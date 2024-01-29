// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for the SetMfaTypeRequest rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.SetMfaTypeRequest}
 */
public final class SetMfaTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.SetMfaTypeRequest)
    SetMfaTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetMfaTypeRequest.newBuilder() to construct.
  private SetMfaTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetMfaTypeRequest() {
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetMfaTypeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_SetMfaTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_SetMfaTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest.class, com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest.Builder.class);
  }

  private int mfaTypeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object mfaType_;
  public enum MfaTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    OTP(1),
    MFATYPE_NOT_SET(0);
    private final int value;
    private MfaTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MfaTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static MfaTypeCase forNumber(int value) {
      switch (value) {
        case 1: return OTP;
        case 0: return MFATYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MfaTypeCase
  getMfaTypeCase() {
    return MfaTypeCase.forNumber(
        mfaTypeCase_);
  }

  public static final int OTP_FIELD_NUMBER = 1;
  /**
   * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
   * @return Whether the otp field is set.
   */
  @java.lang.Override
  public boolean hasOtp() {
    return mfaTypeCase_ == 1;
  }
  /**
   * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
   * @return The otp.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType getOtp() {
    if (mfaTypeCase_ == 1) {
       return (com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType) mfaType_;
    }
    return com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.getDefaultInstance();
  }
  /**
   * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.MfaInfo.OtpTypeOrBuilder getOtpOrBuilder() {
    if (mfaTypeCase_ == 1) {
       return (com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType) mfaType_;
    }
    return com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.getDefaultInstance();
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <pre>
   * The id of the user to set the mfa type for.
   * </pre>
   *
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The id of the user to set the mfa type for.
   * </pre>
   *
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
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
    if (mfaTypeCase_ == 1) {
      output.writeMessage(1, (com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType) mfaType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mfaTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType) mfaType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest other = (com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getMfaTypeCase().equals(other.getMfaTypeCase())) return false;
    switch (mfaTypeCase_) {
      case 1:
        if (!getOtp()
            .equals(other.getOtp())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    switch (mfaTypeCase_) {
      case 1:
        hash = (37 * hash) + OTP_FIELD_NUMBER;
        hash = (53 * hash) + getOtp().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest prototype) {
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
   * Request message for the SetMfaTypeRequest rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.SetMfaTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.SetMfaTypeRequest)
      com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_SetMfaTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_SetMfaTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest.class, com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest.newBuilder()
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
      if (otpBuilder_ != null) {
        otpBuilder_.clear();
      }
      userId_ = "";
      mfaTypeCase_ = 0;
      mfaType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_SetMfaTypeRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest result = new com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userId_ = userId_;
      }
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest result) {
      result.mfaTypeCase_ = mfaTypeCase_;
      result.mfaType_ = this.mfaType_;
      if (mfaTypeCase_ == 1 &&
          otpBuilder_ != null) {
        result.mfaType_ = otpBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getMfaTypeCase()) {
        case OTP: {
          mergeOtp(other.getOtp());
          break;
        }
        case MFATYPE_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getOtpFieldBuilder().getBuilder(),
                  extensionRegistry);
              mfaTypeCase_ = 1;
              break;
            } // case 10
            case 18: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
    private int mfaTypeCase_ = 0;
    private java.lang.Object mfaType_;
    public MfaTypeCase
        getMfaTypeCase() {
      return MfaTypeCase.forNumber(
          mfaTypeCase_);
    }

    public Builder clearMfaType() {
      mfaTypeCase_ = 0;
      mfaType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType, com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.Builder, com.tcn.cloud.api.api.commons.org.MfaInfo.OtpTypeOrBuilder> otpBuilder_;
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     * @return Whether the otp field is set.
     */
    @java.lang.Override
    public boolean hasOtp() {
      return mfaTypeCase_ == 1;
    }
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     * @return The otp.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType getOtp() {
      if (otpBuilder_ == null) {
        if (mfaTypeCase_ == 1) {
          return (com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType) mfaType_;
        }
        return com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.getDefaultInstance();
      } else {
        if (mfaTypeCase_ == 1) {
          return otpBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.getDefaultInstance();
      }
    }
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     */
    public Builder setOtp(com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType value) {
      if (otpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mfaType_ = value;
        onChanged();
      } else {
        otpBuilder_.setMessage(value);
      }
      mfaTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     */
    public Builder setOtp(
        com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.Builder builderForValue) {
      if (otpBuilder_ == null) {
        mfaType_ = builderForValue.build();
        onChanged();
      } else {
        otpBuilder_.setMessage(builderForValue.build());
      }
      mfaTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     */
    public Builder mergeOtp(com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType value) {
      if (otpBuilder_ == null) {
        if (mfaTypeCase_ == 1 &&
            mfaType_ != com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.getDefaultInstance()) {
          mfaType_ = com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.newBuilder((com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType) mfaType_)
              .mergeFrom(value).buildPartial();
        } else {
          mfaType_ = value;
        }
        onChanged();
      } else {
        if (mfaTypeCase_ == 1) {
          otpBuilder_.mergeFrom(value);
        } else {
          otpBuilder_.setMessage(value);
        }
      }
      mfaTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     */
    public Builder clearOtp() {
      if (otpBuilder_ == null) {
        if (mfaTypeCase_ == 1) {
          mfaTypeCase_ = 0;
          mfaType_ = null;
          onChanged();
        }
      } else {
        if (mfaTypeCase_ == 1) {
          mfaTypeCase_ = 0;
          mfaType_ = null;
        }
        otpBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.Builder getOtpBuilder() {
      return getOtpFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.MfaInfo.OtpTypeOrBuilder getOtpOrBuilder() {
      if ((mfaTypeCase_ == 1) && (otpBuilder_ != null)) {
        return otpBuilder_.getMessageOrBuilder();
      } else {
        if (mfaTypeCase_ == 1) {
          return (com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType) mfaType_;
        }
        return com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.getDefaultInstance();
      }
    }
    /**
     * <code>.api.commons.org.MfaInfo.OtpType otp = 1 [json_name = "otp"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType, com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.Builder, com.tcn.cloud.api.api.commons.org.MfaInfo.OtpTypeOrBuilder> 
        getOtpFieldBuilder() {
      if (otpBuilder_ == null) {
        if (!(mfaTypeCase_ == 1)) {
          mfaType_ = com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.getDefaultInstance();
        }
        otpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType, com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType.Builder, com.tcn.cloud.api.api.commons.org.MfaInfo.OtpTypeOrBuilder>(
                (com.tcn.cloud.api.api.commons.org.MfaInfo.OtpType) mfaType_,
                getParentForChildren(),
                isClean());
        mfaType_ = null;
      }
      mfaTypeCase_ = 1;
      onChanged();
      return otpBuilder_;
    }

    private java.lang.Object userId_ = "";
    /**
     * <pre>
     * The id of the user to set the mfa type for.
     * </pre>
     *
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The id of the user to set the mfa type for.
     * </pre>
     *
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The id of the user to set the mfa type for.
     * </pre>
     *
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the user to set the mfa type for.
     * </pre>
     *
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The id of the user to set the mfa type for.
     * </pre>
     *
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.SetMfaTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.SetMfaTypeRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetMfaTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<SetMfaTypeRequest>() {
    @java.lang.Override
    public SetMfaTypeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetMfaTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetMfaTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.SetMfaTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

