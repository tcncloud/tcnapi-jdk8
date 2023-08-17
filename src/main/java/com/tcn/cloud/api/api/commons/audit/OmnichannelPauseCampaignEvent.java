// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/omnichannel_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * OmnichannelPauseCampaignEvent - whenever a campaign is paused
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.OmnichannelPauseCampaignEvent}
 */
public final class OmnichannelPauseCampaignEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.OmnichannelPauseCampaignEvent)
    OmnichannelPauseCampaignEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OmnichannelPauseCampaignEvent.newBuilder() to construct.
  private OmnichannelPauseCampaignEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OmnichannelPauseCampaignEvent() {
    name_ = "";
    description_ = "";
    channelType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OmnichannelPauseCampaignEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelPauseCampaignEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelPauseCampaignEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent.Builder.class);
  }

  private int bitField0_;
  public static final int CAMPAIGN_SID_FIELD_NUMBER = 1;
  private long campaignSid_ = 0L;
  /**
   * <pre>
   * campaign id
   * </pre>
   *
   * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  @java.lang.Override
  public long getCampaignSid() {
    return campaignSid_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * campaign name
   * </pre>
   *
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
   * <pre>
   * campaign name
   * </pre>
   *
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

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * campaign description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * campaign description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHANNEL_TYPE_FIELD_NUMBER = 4;
  private int channelType_ = 0;
  /**
   * <pre>
   * campaign type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  @java.lang.Override public int getChannelTypeValue() {
    return channelType_;
  }
  /**
   * <pre>
   * campaign type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ChannelType getChannelType() {
    com.tcn.cloud.api.api.commons.ChannelType result = com.tcn.cloud.api.api.commons.ChannelType.forNumber(channelType_);
    return result == null ? com.tcn.cloud.api.api.commons.ChannelType.UNRECOGNIZED : result;
  }

  public static final int OMNI_CAMPAIGN_FIELD_NUMBER = 5;
  private com.tcn.cloud.api.api.commons.OmniCampaign omniCampaign_;
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
   * @return Whether the omniCampaign field is set.
   */
  @java.lang.Override
  public boolean hasOmniCampaign() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
   * @return The omniCampaign.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniCampaign getOmniCampaign() {
    return omniCampaign_ == null ? com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
  }
  /**
   * <pre>
   * omni campaign
   * </pre>
   *
   * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getOmniCampaignOrBuilder() {
    return omniCampaign_ == null ? com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
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
    if (campaignSid_ != 0L) {
      output.writeInt64(1, campaignSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (channelType_ != com.tcn.cloud.api.api.commons.ChannelType.CHANNEL_TYPE_EMAIL.getNumber()) {
      output.writeEnum(4, channelType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(5, getOmniCampaign());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (campaignSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, campaignSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (channelType_ != com.tcn.cloud.api.api.commons.ChannelType.CHANNEL_TYPE_EMAIL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, channelType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getOmniCampaign());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent other = (com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent) obj;

    if (getCampaignSid()
        != other.getCampaignSid()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (channelType_ != other.channelType_) return false;
    if (hasOmniCampaign() != other.hasOmniCampaign()) return false;
    if (hasOmniCampaign()) {
      if (!getOmniCampaign()
          .equals(other.getOmniCampaign())) return false;
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
    hash = (37 * hash) + CAMPAIGN_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampaignSid());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + CHANNEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + channelType_;
    if (hasOmniCampaign()) {
      hash = (37 * hash) + OMNI_CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getOmniCampaign().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent prototype) {
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
   * OmnichannelPauseCampaignEvent - whenever a campaign is paused
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.OmnichannelPauseCampaignEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.OmnichannelPauseCampaignEvent)
      com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelPauseCampaignEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelPauseCampaignEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent.class, com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent.newBuilder()
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
        getOmniCampaignFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      campaignSid_ = 0L;
      name_ = "";
      description_ = "";
      channelType_ = 0;
      omniCampaign_ = null;
      if (omniCampaignBuilder_ != null) {
        omniCampaignBuilder_.dispose();
        omniCampaignBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelEventsProto.internal_static_api_commons_audit_OmnichannelPauseCampaignEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent build() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent result = new com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campaignSid_ = campaignSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.channelType_ = channelType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.omniCampaign_ = omniCampaignBuilder_ == null
            ? omniCampaign_
            : omniCampaignBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent.getDefaultInstance()) return this;
      if (other.getCampaignSid() != 0L) {
        setCampaignSid(other.getCampaignSid());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.channelType_ != 0) {
        setChannelTypeValue(other.getChannelTypeValue());
      }
      if (other.hasOmniCampaign()) {
        mergeOmniCampaign(other.getOmniCampaign());
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
              campaignSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              channelType_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getOmniCampaignFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long campaignSid_ ;
    /**
     * <pre>
     * campaign id
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @return The campaignSid.
     */
    @java.lang.Override
    public long getCampaignSid() {
      return campaignSid_;
    }
    /**
     * <pre>
     * campaign id
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @param value The campaignSid to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignSid(long value) {

      campaignSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign id
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      campaignSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * campaign name
     * </pre>
     *
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
     * <pre>
     * campaign name
     * </pre>
     *
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
     * <pre>
     * campaign name
     * </pre>
     *
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
     * <pre>
     * campaign name
     * </pre>
     *
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
     * <pre>
     * campaign name
     * </pre>
     *
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

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * campaign description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * campaign description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * campaign description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int channelType_ = 0;
    /**
     * <pre>
     * campaign type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
     * @return The enum numeric value on the wire for channelType.
     */
    @java.lang.Override public int getChannelTypeValue() {
      return channelType_;
    }
    /**
     * <pre>
     * campaign type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
     * @param value The enum numeric value on the wire for channelType to set.
     * @return This builder for chaining.
     */
    public Builder setChannelTypeValue(int value) {
      channelType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
     * @return The channelType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ChannelType getChannelType() {
      com.tcn.cloud.api.api.commons.ChannelType result = com.tcn.cloud.api.api.commons.ChannelType.forNumber(channelType_);
      return result == null ? com.tcn.cloud.api.api.commons.ChannelType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * campaign type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
     * @param value The channelType to set.
     * @return This builder for chaining.
     */
    public Builder setChannelType(com.tcn.cloud.api.api.commons.ChannelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      channelType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 4 [json_name = "channelType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      channelType_ = 0;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.OmniCampaign omniCampaign_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniCampaign, com.tcn.cloud.api.api.commons.OmniCampaign.Builder, com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder> omniCampaignBuilder_;
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     * @return Whether the omniCampaign field is set.
     */
    public boolean hasOmniCampaign() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     * @return The omniCampaign.
     */
    public com.tcn.cloud.api.api.commons.OmniCampaign getOmniCampaign() {
      if (omniCampaignBuilder_ == null) {
        return omniCampaign_ == null ? com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
      } else {
        return omniCampaignBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     */
    public Builder setOmniCampaign(com.tcn.cloud.api.api.commons.OmniCampaign value) {
      if (omniCampaignBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        omniCampaign_ = value;
      } else {
        omniCampaignBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     */
    public Builder setOmniCampaign(
        com.tcn.cloud.api.api.commons.OmniCampaign.Builder builderForValue) {
      if (omniCampaignBuilder_ == null) {
        omniCampaign_ = builderForValue.build();
      } else {
        omniCampaignBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     */
    public Builder mergeOmniCampaign(com.tcn.cloud.api.api.commons.OmniCampaign value) {
      if (omniCampaignBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          omniCampaign_ != null &&
          omniCampaign_ != com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance()) {
          getOmniCampaignBuilder().mergeFrom(value);
        } else {
          omniCampaign_ = value;
        }
      } else {
        omniCampaignBuilder_.mergeFrom(value);
      }
      if (omniCampaign_ != null) {
        bitField0_ |= 0x00000010;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     */
    public Builder clearOmniCampaign() {
      bitField0_ = (bitField0_ & ~0x00000010);
      omniCampaign_ = null;
      if (omniCampaignBuilder_ != null) {
        omniCampaignBuilder_.dispose();
        omniCampaignBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniCampaign.Builder getOmniCampaignBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getOmniCampaignFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     */
    public com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder getOmniCampaignOrBuilder() {
      if (omniCampaignBuilder_ != null) {
        return omniCampaignBuilder_.getMessageOrBuilder();
      } else {
        return omniCampaign_ == null ?
            com.tcn.cloud.api.api.commons.OmniCampaign.getDefaultInstance() : omniCampaign_;
      }
    }
    /**
     * <pre>
     * omni campaign
     * </pre>
     *
     * <code>.api.commons.OmniCampaign omni_campaign = 5 [json_name = "omniCampaign"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.OmniCampaign, com.tcn.cloud.api.api.commons.OmniCampaign.Builder, com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder> 
        getOmniCampaignFieldBuilder() {
      if (omniCampaignBuilder_ == null) {
        omniCampaignBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.OmniCampaign, com.tcn.cloud.api.api.commons.OmniCampaign.Builder, com.tcn.cloud.api.api.commons.OmniCampaignOrBuilder>(
                getOmniCampaign(),
                getParentForChildren(),
                isClean());
        omniCampaign_ = null;
      }
      return omniCampaignBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.OmnichannelPauseCampaignEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.OmnichannelPauseCampaignEvent)
  private static final com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OmnichannelPauseCampaignEvent>
      PARSER = new com.google.protobuf.AbstractParser<OmnichannelPauseCampaignEvent>() {
    @java.lang.Override
    public OmnichannelPauseCampaignEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<OmnichannelPauseCampaignEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OmnichannelPauseCampaignEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.OmnichannelPauseCampaignEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

