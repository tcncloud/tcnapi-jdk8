// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/agent_profile_group.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * PriorityGroup is a type and threshold in array for AgentProfileGroup
 * </pre>
 *
 * Protobuf type {@code api.commons.org.PriorityGroup}
 */
public final class PriorityGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.PriorityGroup)
    PriorityGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PriorityGroup.newBuilder() to construct.
  private PriorityGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PriorityGroup() {
    channelType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PriorityGroup();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.AgentProfileGroupProto.internal_static_api_commons_org_PriorityGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.AgentProfileGroupProto.internal_static_api_commons_org_PriorityGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.PriorityGroup.class, com.tcn.cloud.api.api.commons.org.PriorityGroup.Builder.class);
  }

  public static final int THRESHOLD_FIELD_NUMBER = 1;
  private int threshold_ = 0;
  /**
   * <pre>
   * threshold for the priority group
   * </pre>
   *
   * <code>int32 threshold = 1 [json_name = "threshold"];</code>
   * @return The threshold.
   */
  @java.lang.Override
  public int getThreshold() {
    return threshold_;
  }

  public static final int CHANNEL_TYPE_FIELD_NUMBER = 2;
  private int channelType_ = 0;
  /**
   * <pre>
   * channel type for the priority group
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
   * channel type for the priority group
   * </pre>
   *
   * <code>.api.commons.ChannelType channel_type = 2 [json_name = "channelType"];</code>
   * @return The channelType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ChannelType getChannelType() {
    com.tcn.cloud.api.api.commons.ChannelType result = com.tcn.cloud.api.api.commons.ChannelType.forNumber(channelType_);
    return result == null ? com.tcn.cloud.api.api.commons.ChannelType.UNRECOGNIZED : result;
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
    if (threshold_ != 0) {
      output.writeInt32(1, threshold_);
    }
    if (channelType_ != com.tcn.cloud.api.api.commons.ChannelType.CHANNEL_TYPE_EMAIL.getNumber()) {
      output.writeEnum(2, channelType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (threshold_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, threshold_);
    }
    if (channelType_ != com.tcn.cloud.api.api.commons.ChannelType.CHANNEL_TYPE_EMAIL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, channelType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.PriorityGroup)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.PriorityGroup other = (com.tcn.cloud.api.api.commons.org.PriorityGroup) obj;

    if (getThreshold()
        != other.getThreshold()) return false;
    if (channelType_ != other.channelType_) return false;
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
    hash = (37 * hash) + THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + getThreshold();
    hash = (37 * hash) + CHANNEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + channelType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.PriorityGroup parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.PriorityGroup prototype) {
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
   * PriorityGroup is a type and threshold in array for AgentProfileGroup
   * </pre>
   *
   * Protobuf type {@code api.commons.org.PriorityGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.PriorityGroup)
      com.tcn.cloud.api.api.commons.org.PriorityGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.AgentProfileGroupProto.internal_static_api_commons_org_PriorityGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.AgentProfileGroupProto.internal_static_api_commons_org_PriorityGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.PriorityGroup.class, com.tcn.cloud.api.api.commons.org.PriorityGroup.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.PriorityGroup.newBuilder()
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
      threshold_ = 0;
      channelType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.AgentProfileGroupProto.internal_static_api_commons_org_PriorityGroup_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.PriorityGroup getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.PriorityGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.PriorityGroup build() {
      com.tcn.cloud.api.api.commons.org.PriorityGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.PriorityGroup buildPartial() {
      com.tcn.cloud.api.api.commons.org.PriorityGroup result = new com.tcn.cloud.api.api.commons.org.PriorityGroup(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.PriorityGroup result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.threshold_ = threshold_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.channelType_ = channelType_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.PriorityGroup) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.PriorityGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.PriorityGroup other) {
      if (other == com.tcn.cloud.api.api.commons.org.PriorityGroup.getDefaultInstance()) return this;
      if (other.getThreshold() != 0) {
        setThreshold(other.getThreshold());
      }
      if (other.channelType_ != 0) {
        setChannelTypeValue(other.getChannelTypeValue());
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
              threshold_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              channelType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private int threshold_ ;
    /**
     * <pre>
     * threshold for the priority group
     * </pre>
     *
     * <code>int32 threshold = 1 [json_name = "threshold"];</code>
     * @return The threshold.
     */
    @java.lang.Override
    public int getThreshold() {
      return threshold_;
    }
    /**
     * <pre>
     * threshold for the priority group
     * </pre>
     *
     * <code>int32 threshold = 1 [json_name = "threshold"];</code>
     * @param value The threshold to set.
     * @return This builder for chaining.
     */
    public Builder setThreshold(int value) {

      threshold_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * threshold for the priority group
     * </pre>
     *
     * <code>int32 threshold = 1 [json_name = "threshold"];</code>
     * @return This builder for chaining.
     */
    public Builder clearThreshold() {
      bitField0_ = (bitField0_ & ~0x00000001);
      threshold_ = 0;
      onChanged();
      return this;
    }

    private int channelType_ = 0;
    /**
     * <pre>
     * channel type for the priority group
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
     * channel type for the priority group
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
     * channel type for the priority group
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
     * channel type for the priority group
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
     * channel type for the priority group
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.PriorityGroup)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.PriorityGroup)
  private static final com.tcn.cloud.api.api.commons.org.PriorityGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.PriorityGroup();
  }

  public static com.tcn.cloud.api.api.commons.org.PriorityGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PriorityGroup>
      PARSER = new com.google.protobuf.AbstractParser<PriorityGroup>() {
    @java.lang.Override
    public PriorityGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<PriorityGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PriorityGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.PriorityGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

