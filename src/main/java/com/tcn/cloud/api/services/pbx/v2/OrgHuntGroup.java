// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

/**
 * Protobuf type {@code services.pbx.v2.OrgHuntGroup}
 */
public final class OrgHuntGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.pbx.v2.OrgHuntGroup)
    OrgHuntGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrgHuntGroup.newBuilder() to construct.
  private OrgHuntGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrgHuntGroup() {
    huntGroupSid_ = "";
    huntGroupName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrgHuntGroup();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgHuntGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgHuntGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup.class, com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup.Builder.class);
  }

  public static final int HUNT_GROUP_SID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object huntGroupSid_ = "";
  /**
   * <code>string hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  @java.lang.Override
  public java.lang.String getHuntGroupSid() {
    java.lang.Object ref = huntGroupSid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      huntGroupSid_ = s;
      return s;
    }
  }
  /**
   * <code>string hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
   * @return The bytes for huntGroupSid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHuntGroupSidBytes() {
    java.lang.Object ref = huntGroupSid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      huntGroupSid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HUNT_GROUP_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object huntGroupName_ = "";
  /**
   * <code>string hunt_group_name = 2 [json_name = "huntGroupName"];</code>
   * @return The huntGroupName.
   */
  @java.lang.Override
  public java.lang.String getHuntGroupName() {
    java.lang.Object ref = huntGroupName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      huntGroupName_ = s;
      return s;
    }
  }
  /**
   * <code>string hunt_group_name = 2 [json_name = "huntGroupName"];</code>
   * @return The bytes for huntGroupName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHuntGroupNameBytes() {
    java.lang.Object ref = huntGroupName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      huntGroupName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(huntGroupSid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, huntGroupSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(huntGroupName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, huntGroupName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(huntGroupSid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, huntGroupSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(huntGroupName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, huntGroupName_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup other = (com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup) obj;

    if (!getHuntGroupSid()
        .equals(other.getHuntGroupSid())) return false;
    if (!getHuntGroupName()
        .equals(other.getHuntGroupName())) return false;
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
    hash = (37 * hash) + HUNT_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + getHuntGroupSid().hashCode();
    hash = (37 * hash) + HUNT_GROUP_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getHuntGroupName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup prototype) {
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
   * Protobuf type {@code services.pbx.v2.OrgHuntGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.pbx.v2.OrgHuntGroup)
      com.tcn.cloud.api.services.pbx.v2.OrgHuntGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgHuntGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgHuntGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup.class, com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup.newBuilder()
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
      huntGroupSid_ = "";
      huntGroupName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_OrgHuntGroup_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup build() {
      com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup buildPartial() {
      com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup result = new com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.huntGroupSid_ = huntGroupSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.huntGroupName_ = huntGroupName_;
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
      if (other instanceof com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup) {
        return mergeFrom((com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup other) {
      if (other == com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup.getDefaultInstance()) return this;
      if (!other.getHuntGroupSid().isEmpty()) {
        huntGroupSid_ = other.huntGroupSid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getHuntGroupName().isEmpty()) {
        huntGroupName_ = other.huntGroupName_;
        bitField0_ |= 0x00000002;
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
              huntGroupSid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              huntGroupName_ = input.readStringRequireUtf8();
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
    private int bitField0_;

    private java.lang.Object huntGroupSid_ = "";
    /**
     * <code>string hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
     * @return The huntGroupSid.
     */
    public java.lang.String getHuntGroupSid() {
      java.lang.Object ref = huntGroupSid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        huntGroupSid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
     * @return The bytes for huntGroupSid.
     */
    public com.google.protobuf.ByteString
        getHuntGroupSidBytes() {
      java.lang.Object ref = huntGroupSid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        huntGroupSid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
     * @param value The huntGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setHuntGroupSid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      huntGroupSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHuntGroupSid() {
      huntGroupSid_ = getDefaultInstance().getHuntGroupSid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string hunt_group_sid = 1 [json_name = "huntGroupSid"];</code>
     * @param value The bytes for huntGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setHuntGroupSidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      huntGroupSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object huntGroupName_ = "";
    /**
     * <code>string hunt_group_name = 2 [json_name = "huntGroupName"];</code>
     * @return The huntGroupName.
     */
    public java.lang.String getHuntGroupName() {
      java.lang.Object ref = huntGroupName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        huntGroupName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hunt_group_name = 2 [json_name = "huntGroupName"];</code>
     * @return The bytes for huntGroupName.
     */
    public com.google.protobuf.ByteString
        getHuntGroupNameBytes() {
      java.lang.Object ref = huntGroupName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        huntGroupName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hunt_group_name = 2 [json_name = "huntGroupName"];</code>
     * @param value The huntGroupName to set.
     * @return This builder for chaining.
     */
    public Builder setHuntGroupName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      huntGroupName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string hunt_group_name = 2 [json_name = "huntGroupName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHuntGroupName() {
      huntGroupName_ = getDefaultInstance().getHuntGroupName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string hunt_group_name = 2 [json_name = "huntGroupName"];</code>
     * @param value The bytes for huntGroupName to set.
     * @return This builder for chaining.
     */
    public Builder setHuntGroupNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      huntGroupName_ = value;
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


    // @@protoc_insertion_point(builder_scope:services.pbx.v2.OrgHuntGroup)
  }

  // @@protoc_insertion_point(class_scope:services.pbx.v2.OrgHuntGroup)
  private static final com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup();
  }

  public static com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrgHuntGroup>
      PARSER = new com.google.protobuf.AbstractParser<OrgHuntGroup>() {
    @java.lang.Override
    public OrgHuntGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<OrgHuntGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrgHuntGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v2.OrgHuntGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

