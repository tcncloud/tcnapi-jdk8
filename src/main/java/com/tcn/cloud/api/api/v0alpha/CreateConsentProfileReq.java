// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateConsentProfileReq}
 */
public final class CreateConsentProfileReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateConsentProfileReq)
    CreateConsentProfileReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateConsentProfileReq.newBuilder() to construct.
  private CreateConsentProfileReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateConsentProfileReq() {
    consentProfileId_ = "";
    profileName_ = "";
    createdBy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateConsentProfileReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateConsentProfileReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateConsentProfileReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.class, com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.Builder.class);
  }

  public static final int CONSENT_PROFILE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object consentProfileId_ = "";
  /**
   * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
   * @return The consentProfileId.
   */
  @java.lang.Override
  public java.lang.String getConsentProfileId() {
    java.lang.Object ref = consentProfileId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      consentProfileId_ = s;
      return s;
    }
  }
  /**
   * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
   * @return The bytes for consentProfileId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConsentProfileIdBytes() {
    java.lang.Object ref = consentProfileId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      consentProfileId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROFILE_NAME_FIELD_NUMBER = 10;
  @SuppressWarnings("serial")
  private volatile java.lang.Object profileName_ = "";
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>string profile_name = 10 [json_name = "profileName"];</code>
   * @return The profileName.
   */
  @java.lang.Override
  public java.lang.String getProfileName() {
    java.lang.Object ref = profileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      profileName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * payload
   * </pre>
   *
   * <code>string profile_name = 10 [json_name = "profileName"];</code>
   * @return The bytes for profileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProfileNameBytes() {
    java.lang.Object ref = profileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      profileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISABLED_FIELD_NUMBER = 11;
  private boolean disabled_ = false;
  /**
   * <code>bool disabled = 11 [json_name = "disabled"];</code>
   * @return The disabled.
   */
  @java.lang.Override
  public boolean getDisabled() {
    return disabled_;
  }

  public static final int CHANNEL_FIELD_NUMBER = 12;
  private com.tcn.cloud.api.api.commons.CommType channel_;
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.CreateConsentProfileReq.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1402
   * @return Whether the channel field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasChannel() {
    return channel_ != null;
  }
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
   * @deprecated api.v0alpha.CreateConsentProfileReq.channel is deprecated.
   *     See api/v0alpha/compliance.proto;l=1402
   * @return The channel.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.tcn.cloud.api.api.commons.CommType getChannel() {
    return channel_ == null ? com.tcn.cloud.api.api.commons.CommType.getDefaultInstance() : channel_;
  }
  /**
   * <pre>
   * channel (email, sms, phone, etc)
   * </pre>
   *
   * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated public com.tcn.cloud.api.api.commons.CommTypeOrBuilder getChannelOrBuilder() {
    return channel_ == null ? com.tcn.cloud.api.api.commons.CommType.getDefaultInstance() : channel_;
  }

  public static final int CREATED_BY_FIELD_NUMBER = 50;
  @SuppressWarnings("serial")
  private volatile java.lang.Object createdBy_ = "";
  /**
   * <pre>
   * auditing
   * </pre>
   *
   * <code>string created_by = 50 [json_name = "createdBy"];</code>
   * @return The createdBy.
   */
  @java.lang.Override
  public java.lang.String getCreatedBy() {
    java.lang.Object ref = createdBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createdBy_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * auditing
   * </pre>
   *
   * <code>string created_by = 50 [json_name = "createdBy"];</code>
   * @return The bytes for createdBy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatedByBytes() {
    java.lang.Object ref = createdBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createdBy_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consentProfileId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, consentProfileId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(profileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, profileName_);
    }
    if (disabled_ != false) {
      output.writeBool(11, disabled_);
    }
    if (channel_ != null) {
      output.writeMessage(12, getChannel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(createdBy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 50, createdBy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consentProfileId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, consentProfileId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(profileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, profileName_);
    }
    if (disabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(11, disabled_);
    }
    if (channel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(12, getChannel());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(createdBy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(50, createdBy_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq other = (com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq) obj;

    if (!getConsentProfileId()
        .equals(other.getConsentProfileId())) return false;
    if (!getProfileName()
        .equals(other.getProfileName())) return false;
    if (getDisabled()
        != other.getDisabled()) return false;
    if (hasChannel() != other.hasChannel()) return false;
    if (hasChannel()) {
      if (!getChannel()
          .equals(other.getChannel())) return false;
    }
    if (!getCreatedBy()
        .equals(other.getCreatedBy())) return false;
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
    hash = (37 * hash) + CONSENT_PROFILE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConsentProfileId().hashCode();
    hash = (37 * hash) + PROFILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getProfileName().hashCode();
    hash = (37 * hash) + DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisabled());
    if (hasChannel()) {
      hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getChannel().hashCode();
    }
    hash = (37 * hash) + CREATED_BY_FIELD_NUMBER;
    hash = (53 * hash) + getCreatedBy().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateConsentProfileReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateConsentProfileReq)
      com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateConsentProfileReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateConsentProfileReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.class, com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.newBuilder()
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
      consentProfileId_ = "";
      profileName_ = "";
      disabled_ = false;
      channel_ = null;
      if (channelBuilder_ != null) {
        channelBuilder_.dispose();
        channelBuilder_ = null;
      }
      createdBy_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateConsentProfileReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq result = new com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.consentProfileId_ = consentProfileId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.profileName_ = profileName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.disabled_ = disabled_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.channel_ = channelBuilder_ == null
            ? channel_
            : channelBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.createdBy_ = createdBy_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq.getDefaultInstance()) return this;
      if (!other.getConsentProfileId().isEmpty()) {
        consentProfileId_ = other.consentProfileId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getProfileName().isEmpty()) {
        profileName_ = other.profileName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getDisabled() != false) {
        setDisabled(other.getDisabled());
      }
      if (other.hasChannel()) {
        mergeChannel(other.getChannel());
      }
      if (!other.getCreatedBy().isEmpty()) {
        createdBy_ = other.createdBy_;
        bitField0_ |= 0x00000010;
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
              consentProfileId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 82: {
              profileName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 82
            case 88: {
              disabled_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 88
            case 98: {
              input.readMessage(
                  getChannelFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 98
            case 402: {
              createdBy_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 402
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

    private java.lang.Object consentProfileId_ = "";
    /**
     * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
     * @return The consentProfileId.
     */
    public java.lang.String getConsentProfileId() {
      java.lang.Object ref = consentProfileId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consentProfileId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
     * @return The bytes for consentProfileId.
     */
    public com.google.protobuf.ByteString
        getConsentProfileIdBytes() {
      java.lang.Object ref = consentProfileId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consentProfileId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
     * @param value The consentProfileId to set.
     * @return This builder for chaining.
     */
    public Builder setConsentProfileId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      consentProfileId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConsentProfileId() {
      consentProfileId_ = getDefaultInstance().getConsentProfileId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string consent_profile_id = 1 [json_name = "consentProfileId"];</code>
     * @param value The bytes for consentProfileId to set.
     * @return This builder for chaining.
     */
    public Builder setConsentProfileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      consentProfileId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object profileName_ = "";
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string profile_name = 10 [json_name = "profileName"];</code>
     * @return The profileName.
     */
    public java.lang.String getProfileName() {
      java.lang.Object ref = profileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        profileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string profile_name = 10 [json_name = "profileName"];</code>
     * @return The bytes for profileName.
     */
    public com.google.protobuf.ByteString
        getProfileNameBytes() {
      java.lang.Object ref = profileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        profileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string profile_name = 10 [json_name = "profileName"];</code>
     * @param value The profileName to set.
     * @return This builder for chaining.
     */
    public Builder setProfileName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      profileName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string profile_name = 10 [json_name = "profileName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProfileName() {
      profileName_ = getDefaultInstance().getProfileName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * payload
     * </pre>
     *
     * <code>string profile_name = 10 [json_name = "profileName"];</code>
     * @param value The bytes for profileName to set.
     * @return This builder for chaining.
     */
    public Builder setProfileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      profileName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean disabled_ ;
    /**
     * <code>bool disabled = 11 [json_name = "disabled"];</code>
     * @return The disabled.
     */
    @java.lang.Override
    public boolean getDisabled() {
      return disabled_;
    }
    /**
     * <code>bool disabled = 11 [json_name = "disabled"];</code>
     * @param value The disabled to set.
     * @return This builder for chaining.
     */
    public Builder setDisabled(boolean value) {

      disabled_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool disabled = 11 [json_name = "disabled"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisabled() {
      bitField0_ = (bitField0_ & ~0x00000004);
      disabled_ = false;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.CommType channel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.CommType, com.tcn.cloud.api.api.commons.CommType.Builder, com.tcn.cloud.api.api.commons.CommTypeOrBuilder> channelBuilder_;
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     * @deprecated api.v0alpha.CreateConsentProfileReq.channel is deprecated.
     *     See api/v0alpha/compliance.proto;l=1402
     * @return Whether the channel field is set.
     */
    @java.lang.Deprecated public boolean hasChannel() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     * @deprecated api.v0alpha.CreateConsentProfileReq.channel is deprecated.
     *     See api/v0alpha/compliance.proto;l=1402
     * @return The channel.
     */
    @java.lang.Deprecated public com.tcn.cloud.api.api.commons.CommType getChannel() {
      if (channelBuilder_ == null) {
        return channel_ == null ? com.tcn.cloud.api.api.commons.CommType.getDefaultInstance() : channel_;
      } else {
        return channelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setChannel(com.tcn.cloud.api.api.commons.CommType value) {
      if (channelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channel_ = value;
      } else {
        channelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setChannel(
        com.tcn.cloud.api.api.commons.CommType.Builder builderForValue) {
      if (channelBuilder_ == null) {
        channel_ = builderForValue.build();
      } else {
        channelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder mergeChannel(com.tcn.cloud.api.api.commons.CommType value) {
      if (channelBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          channel_ != null &&
          channel_ != com.tcn.cloud.api.api.commons.CommType.getDefaultInstance()) {
          getChannelBuilder().mergeFrom(value);
        } else {
          channel_ = value;
        }
      } else {
        channelBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearChannel() {
      bitField0_ = (bitField0_ & ~0x00000008);
      channel_ = null;
      if (channelBuilder_ != null) {
        channelBuilder_.dispose();
        channelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.tcn.cloud.api.api.commons.CommType.Builder getChannelBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getChannelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.tcn.cloud.api.api.commons.CommTypeOrBuilder getChannelOrBuilder() {
      if (channelBuilder_ != null) {
        return channelBuilder_.getMessageOrBuilder();
      } else {
        return channel_ == null ?
            com.tcn.cloud.api.api.commons.CommType.getDefaultInstance() : channel_;
      }
    }
    /**
     * <pre>
     * channel (email, sms, phone, etc)
     * </pre>
     *
     * <code>.api.commons.CommType channel = 12 [json_name = "channel", deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.CommType, com.tcn.cloud.api.api.commons.CommType.Builder, com.tcn.cloud.api.api.commons.CommTypeOrBuilder> 
        getChannelFieldBuilder() {
      if (channelBuilder_ == null) {
        channelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.CommType, com.tcn.cloud.api.api.commons.CommType.Builder, com.tcn.cloud.api.api.commons.CommTypeOrBuilder>(
                getChannel(),
                getParentForChildren(),
                isClean());
        channel_ = null;
      }
      return channelBuilder_;
    }

    private java.lang.Object createdBy_ = "";
    /**
     * <pre>
     * auditing
     * </pre>
     *
     * <code>string created_by = 50 [json_name = "createdBy"];</code>
     * @return The createdBy.
     */
    public java.lang.String getCreatedBy() {
      java.lang.Object ref = createdBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createdBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * auditing
     * </pre>
     *
     * <code>string created_by = 50 [json_name = "createdBy"];</code>
     * @return The bytes for createdBy.
     */
    public com.google.protobuf.ByteString
        getCreatedByBytes() {
      java.lang.Object ref = createdBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createdBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * auditing
     * </pre>
     *
     * <code>string created_by = 50 [json_name = "createdBy"];</code>
     * @param value The createdBy to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedBy(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      createdBy_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * auditing
     * </pre>
     *
     * <code>string created_by = 50 [json_name = "createdBy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatedBy() {
      createdBy_ = getDefaultInstance().getCreatedBy();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * auditing
     * </pre>
     *
     * <code>string created_by = 50 [json_name = "createdBy"];</code>
     * @param value The bytes for createdBy to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedByBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      createdBy_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateConsentProfileReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateConsentProfileReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConsentProfileReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateConsentProfileReq>() {
    @java.lang.Override
    public CreateConsentProfileReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateConsentProfileReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConsentProfileReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateConsentProfileReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

