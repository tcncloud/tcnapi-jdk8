// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request to archive a campaign
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ArchiveCampaignReq}
 */
public final class ArchiveCampaignReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ArchiveCampaignReq)
    ArchiveCampaignReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ArchiveCampaignReq.newBuilder() to construct.
  private ArchiveCampaignReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ArchiveCampaignReq() {
    channelType_ = 0;
    campaignDirection_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ArchiveCampaignReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ArchiveCampaignReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ArchiveCampaignReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.class, com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.Builder.class);
  }

  public static final int CAMPAIGN_SID_FIELD_NUMBER = 1;
  private long campaignSid_ = 0L;
  /**
   * <pre>
   * the campaign identifier
   * </pre>
   *
   * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  @java.lang.Override
  public long getCampaignSid() {
    return campaignSid_;
  }

  public static final int CHANNEL_TYPE_FIELD_NUMBER = 2;
  private int channelType_ = 0;
  /**
   * <pre>
   * the campaign's channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The enum numeric value on the wire for channelType.
   */
  @java.lang.Override public int getChannelTypeValue() {
    return channelType_;
  }
  /**
   * <pre>
   * the campaign's channel type
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ChannelType getChannelType() {
    com.tcn.cloud.api.api.commons.ChannelType result = com.tcn.cloud.api.api.commons.ChannelType.forNumber(channelType_);
    return result == null ? com.tcn.cloud.api.api.commons.ChannelType.UNRECOGNIZED : result;
  }

  public static final int CAMPAIGN_DIRECTION_FIELD_NUMBER = 3;
  private int campaignDirection_ = 0;
  /**
   * <pre>
   * the campaign direction
   * </pre>
   *
   * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
   * @return The enum numeric value on the wire for campaignDirection.
   */
  @java.lang.Override public int getCampaignDirectionValue() {
    return campaignDirection_;
  }
  /**
   * <pre>
   * the campaign direction
   * </pre>
   *
   * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
   * @return The campaignDirection.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.OmniCampaignDirection getCampaignDirection() {
    com.tcn.cloud.api.api.commons.OmniCampaignDirection result = com.tcn.cloud.api.api.commons.OmniCampaignDirection.forNumber(campaignDirection_);
    return result == null ? com.tcn.cloud.api.api.commons.OmniCampaignDirection.UNRECOGNIZED : result;
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
    if (channelType_ != com.tcn.cloud.api.api.commons.ChannelType.CHANNEL_TYPE_EMAIL.getNumber()) {
      output.writeEnum(2, channelType_);
    }
    if (campaignDirection_ != com.tcn.cloud.api.api.commons.OmniCampaignDirection.INBOUND.getNumber()) {
      output.writeEnum(3, campaignDirection_);
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
    if (channelType_ != com.tcn.cloud.api.api.commons.ChannelType.CHANNEL_TYPE_EMAIL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, channelType_);
    }
    if (campaignDirection_ != com.tcn.cloud.api.api.commons.OmniCampaignDirection.INBOUND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, campaignDirection_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq other = (com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq) obj;

    if (getCampaignSid()
        != other.getCampaignSid()) return false;
    if (channelType_ != other.channelType_) return false;
    if (campaignDirection_ != other.campaignDirection_) return false;
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
    hash = (37 * hash) + CHANNEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + channelType_;
    hash = (37 * hash) + CAMPAIGN_DIRECTION_FIELD_NUMBER;
    hash = (53 * hash) + campaignDirection_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq prototype) {
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
   * Request to archive a campaign
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ArchiveCampaignReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ArchiveCampaignReq)
      com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ArchiveCampaignReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ArchiveCampaignReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.class, com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.newBuilder()
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
      campaignSid_ = 0L;
      channelType_ = 0;
      campaignDirection_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_ArchiveCampaignReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq build() {
      com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq result = new com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campaignSid_ = campaignSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.channelType_ = channelType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.campaignDirection_ = campaignDirection_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq.getDefaultInstance()) return this;
      if (other.getCampaignSid() != 0L) {
        setCampaignSid(other.getCampaignSid());
      }
      if (other.channelType_ != 0) {
        setChannelTypeValue(other.getChannelTypeValue());
      }
      if (other.campaignDirection_ != 0) {
        setCampaignDirectionValue(other.getCampaignDirectionValue());
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
            case 16: {
              channelType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              campaignDirection_ = input.readEnum();
              bitField0_ |= 0x00000004;
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

    private long campaignSid_ ;
    /**
     * <pre>
     * the campaign identifier
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
     * the campaign identifier
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
     * the campaign identifier
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

    private int channelType_ = 0;
    /**
     * <pre>
     * the campaign's channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
     * @return The enum numeric value on the wire for channelType.
     */
    @java.lang.Override public int getChannelTypeValue() {
      return channelType_;
    }
    /**
     * <pre>
     * the campaign's channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
     * @param value The enum numeric value on the wire for channelType to set.
     * @return This builder for chaining.
     */
    public Builder setChannelTypeValue(int value) {
      channelType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the campaign's channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
     * @return The channelType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ChannelType getChannelType() {
      com.tcn.cloud.api.api.commons.ChannelType result = com.tcn.cloud.api.api.commons.ChannelType.forNumber(channelType_);
      return result == null ? com.tcn.cloud.api.api.commons.ChannelType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the campaign's channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
     * @param value The channelType to set.
     * @return This builder for chaining.
     */
    public Builder setChannelType(com.tcn.cloud.api.api.commons.ChannelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      channelType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the campaign's channel type
     * </pre>
     *
     * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      channelType_ = 0;
      onChanged();
      return this;
    }

    private int campaignDirection_ = 0;
    /**
     * <pre>
     * the campaign direction
     * </pre>
     *
     * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
     * @return The enum numeric value on the wire for campaignDirection.
     */
    @java.lang.Override public int getCampaignDirectionValue() {
      return campaignDirection_;
    }
    /**
     * <pre>
     * the campaign direction
     * </pre>
     *
     * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
     * @param value The enum numeric value on the wire for campaignDirection to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignDirectionValue(int value) {
      campaignDirection_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the campaign direction
     * </pre>
     *
     * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
     * @return The campaignDirection.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.OmniCampaignDirection getCampaignDirection() {
      com.tcn.cloud.api.api.commons.OmniCampaignDirection result = com.tcn.cloud.api.api.commons.OmniCampaignDirection.forNumber(campaignDirection_);
      return result == null ? com.tcn.cloud.api.api.commons.OmniCampaignDirection.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the campaign direction
     * </pre>
     *
     * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
     * @param value The campaignDirection to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignDirection(com.tcn.cloud.api.api.commons.OmniCampaignDirection value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      campaignDirection_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the campaign direction
     * </pre>
     *
     * <code>.api.commons.OmniCampaignDirection campaign_direction = 3 [json_name = "campaignDirection"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignDirection() {
      bitField0_ = (bitField0_ & ~0x00000004);
      campaignDirection_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ArchiveCampaignReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ArchiveCampaignReq)
  private static final com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArchiveCampaignReq>
      PARSER = new com.google.protobuf.AbstractParser<ArchiveCampaignReq>() {
    @java.lang.Override
    public ArchiveCampaignReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArchiveCampaignReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArchiveCampaignReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ArchiveCampaignReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

