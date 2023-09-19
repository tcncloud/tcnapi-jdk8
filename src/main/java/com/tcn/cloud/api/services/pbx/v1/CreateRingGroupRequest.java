// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v1/service.proto

package com.tcn.cloud.api.services.pbx.v1;

/**
 * Protobuf type {@code services.pbx.v1.CreateRingGroupRequest}
 */
public final class CreateRingGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.pbx.v1.CreateRingGroupRequest)
    CreateRingGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRingGroupRequest.newBuilder() to construct.
  private CreateRingGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRingGroupRequest() {
    name_ = "";
    description_ = "";
    ringStrategy_ = 0;
    pbxUserIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRingGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_CreateRingGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_CreateRingGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.class, com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required: The name of the group.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
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
   * Required: The name of the group.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
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

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * Optional: The description of the group.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
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
   * Optional: The description of the group.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
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

  public static final int RING_STRATEGY_FIELD_NUMBER = 3;
  private int ringStrategy_ = 0;
  /**
   * <pre>
   * Optional: The ring strategy of the group.
   * </pre>
   *
   * <code>.services.pbx.v1.RingStrategy ring_strategy = 3 [json_name = "ringStrategy"];</code>
   * @return The enum numeric value on the wire for ringStrategy.
   */
  @java.lang.Override public int getRingStrategyValue() {
    return ringStrategy_;
  }
  /**
   * <pre>
   * Optional: The ring strategy of the group.
   * </pre>
   *
   * <code>.services.pbx.v1.RingStrategy ring_strategy = 3 [json_name = "ringStrategy"];</code>
   * @return The ringStrategy.
   */
  @java.lang.Override public com.tcn.cloud.api.services.pbx.v1.RingStrategy getRingStrategy() {
    com.tcn.cloud.api.services.pbx.v1.RingStrategy result = com.tcn.cloud.api.services.pbx.v1.RingStrategy.forNumber(ringStrategy_);
    return result == null ? com.tcn.cloud.api.services.pbx.v1.RingStrategy.UNRECOGNIZED : result;
  }

  public static final int PBX_USER_IDS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList pbxUserIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Optional: The PBX user IDs to add to the group.
   * </pre>
   *
   * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
   * @return A list containing the pbxUserIds.
   */
  public com.google.protobuf.ProtocolStringList
      getPbxUserIdsList() {
    return pbxUserIds_;
  }
  /**
   * <pre>
   * Optional: The PBX user IDs to add to the group.
   * </pre>
   *
   * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
   * @return The count of pbxUserIds.
   */
  public int getPbxUserIdsCount() {
    return pbxUserIds_.size();
  }
  /**
   * <pre>
   * Optional: The PBX user IDs to add to the group.
   * </pre>
   *
   * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
   * @param index The index of the element to return.
   * @return The pbxUserIds at the given index.
   */
  public java.lang.String getPbxUserIds(int index) {
    return pbxUserIds_.get(index);
  }
  /**
   * <pre>
   * Optional: The PBX user IDs to add to the group.
   * </pre>
   *
   * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the pbxUserIds at the given index.
   */
  public com.google.protobuf.ByteString
      getPbxUserIdsBytes(int index) {
    return pbxUserIds_.getByteString(index);
  }

  public static final int EXTENSION_FIELD_NUMBER = 5;
  private int extension_ = 0;
  /**
   * <pre>
   * Optional: The extension for the ring group.
   * </pre>
   *
   * <code>int32 extension = 5 [json_name = "extension"];</code>
   * @return The extension.
   */
  @java.lang.Override
  public int getExtension() {
    return extension_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (ringStrategy_ != com.tcn.cloud.api.services.pbx.v1.RingStrategy.RING_STRATEGY_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, ringStrategy_);
    }
    for (int i = 0; i < pbxUserIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pbxUserIds_.getRaw(i));
    }
    if (extension_ != 0) {
      output.writeInt32(5, extension_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (ringStrategy_ != com.tcn.cloud.api.services.pbx.v1.RingStrategy.RING_STRATEGY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ringStrategy_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < pbxUserIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(pbxUserIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPbxUserIdsList().size();
    }
    if (extension_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, extension_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest other = (com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (ringStrategy_ != other.ringStrategy_) return false;
    if (!getPbxUserIdsList()
        .equals(other.getPbxUserIdsList())) return false;
    if (getExtension()
        != other.getExtension()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + RING_STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + ringStrategy_;
    if (getPbxUserIdsCount() > 0) {
      hash = (37 * hash) + PBX_USER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPbxUserIdsList().hashCode();
    }
    hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + getExtension();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest prototype) {
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
   * Protobuf type {@code services.pbx.v1.CreateRingGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.pbx.v1.CreateRingGroupRequest)
      com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_CreateRingGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_CreateRingGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.class, com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.newBuilder()
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
      name_ = "";
      description_ = "";
      ringStrategy_ = 0;
      pbxUserIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      extension_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.pbx.v1.ServiceProto.internal_static_services_pbx_v1_CreateRingGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest build() {
      com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest buildPartial() {
      com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest result = new com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ringStrategy_ = ringStrategy_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        pbxUserIds_.makeImmutable();
        result.pbxUserIds_ = pbxUserIds_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.extension_ = extension_;
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
      if (other instanceof com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest other) {
      if (other == com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.ringStrategy_ != 0) {
        setRingStrategyValue(other.getRingStrategyValue());
      }
      if (!other.pbxUserIds_.isEmpty()) {
        if (pbxUserIds_.isEmpty()) {
          pbxUserIds_ = other.pbxUserIds_;
          bitField0_ |= 0x00000008;
        } else {
          ensurePbxUserIdsIsMutable();
          pbxUserIds_.addAll(other.pbxUserIds_);
        }
        onChanged();
      }
      if (other.getExtension() != 0) {
        setExtension(other.getExtension());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              ringStrategy_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePbxUserIdsIsMutable();
              pbxUserIds_.add(s);
              break;
            } // case 34
            case 40: {
              extension_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required: The name of the group.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * Required: The name of the group.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
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
     * Required: The name of the group.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required: The name of the group.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required: The name of the group.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Optional: The description of the group.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
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
     * Optional: The description of the group.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
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
     * Optional: The description of the group.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The description of the group.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The description of the group.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int ringStrategy_ = 0;
    /**
     * <pre>
     * Optional: The ring strategy of the group.
     * </pre>
     *
     * <code>.services.pbx.v1.RingStrategy ring_strategy = 3 [json_name = "ringStrategy"];</code>
     * @return The enum numeric value on the wire for ringStrategy.
     */
    @java.lang.Override public int getRingStrategyValue() {
      return ringStrategy_;
    }
    /**
     * <pre>
     * Optional: The ring strategy of the group.
     * </pre>
     *
     * <code>.services.pbx.v1.RingStrategy ring_strategy = 3 [json_name = "ringStrategy"];</code>
     * @param value The enum numeric value on the wire for ringStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setRingStrategyValue(int value) {
      ringStrategy_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The ring strategy of the group.
     * </pre>
     *
     * <code>.services.pbx.v1.RingStrategy ring_strategy = 3 [json_name = "ringStrategy"];</code>
     * @return The ringStrategy.
     */
    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v1.RingStrategy getRingStrategy() {
      com.tcn.cloud.api.services.pbx.v1.RingStrategy result = com.tcn.cloud.api.services.pbx.v1.RingStrategy.forNumber(ringStrategy_);
      return result == null ? com.tcn.cloud.api.services.pbx.v1.RingStrategy.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Optional: The ring strategy of the group.
     * </pre>
     *
     * <code>.services.pbx.v1.RingStrategy ring_strategy = 3 [json_name = "ringStrategy"];</code>
     * @param value The ringStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setRingStrategy(com.tcn.cloud.api.services.pbx.v1.RingStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      ringStrategy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The ring strategy of the group.
     * </pre>
     *
     * <code>.services.pbx.v1.RingStrategy ring_strategy = 3 [json_name = "ringStrategy"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRingStrategy() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ringStrategy_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList pbxUserIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePbxUserIdsIsMutable() {
      if (!pbxUserIds_.isModifiable()) {
        pbxUserIds_ = new com.google.protobuf.LazyStringArrayList(pbxUserIds_);
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @return A list containing the pbxUserIds.
     */
    public com.google.protobuf.ProtocolStringList
        getPbxUserIdsList() {
      pbxUserIds_.makeImmutable();
      return pbxUserIds_;
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @return The count of pbxUserIds.
     */
    public int getPbxUserIdsCount() {
      return pbxUserIds_.size();
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @param index The index of the element to return.
     * @return The pbxUserIds at the given index.
     */
    public java.lang.String getPbxUserIds(int index) {
      return pbxUserIds_.get(index);
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the pbxUserIds at the given index.
     */
    public com.google.protobuf.ByteString
        getPbxUserIdsBytes(int index) {
      return pbxUserIds_.getByteString(index);
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @param index The index to set the value at.
     * @param value The pbxUserIds to set.
     * @return This builder for chaining.
     */
    public Builder setPbxUserIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePbxUserIdsIsMutable();
      pbxUserIds_.set(index, value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @param value The pbxUserIds to add.
     * @return This builder for chaining.
     */
    public Builder addPbxUserIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePbxUserIdsIsMutable();
      pbxUserIds_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @param values The pbxUserIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllPbxUserIds(
        java.lang.Iterable<java.lang.String> values) {
      ensurePbxUserIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, pbxUserIds_);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPbxUserIds() {
      pbxUserIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The PBX user IDs to add to the group.
     * </pre>
     *
     * <code>repeated string pbx_user_ids = 4 [json_name = "pbxUserIds"];</code>
     * @param value The bytes of the pbxUserIds to add.
     * @return This builder for chaining.
     */
    public Builder addPbxUserIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePbxUserIdsIsMutable();
      pbxUserIds_.add(value);
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private int extension_ ;
    /**
     * <pre>
     * Optional: The extension for the ring group.
     * </pre>
     *
     * <code>int32 extension = 5 [json_name = "extension"];</code>
     * @return The extension.
     */
    @java.lang.Override
    public int getExtension() {
      return extension_;
    }
    /**
     * <pre>
     * Optional: The extension for the ring group.
     * </pre>
     *
     * <code>int32 extension = 5 [json_name = "extension"];</code>
     * @param value The extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtension(int value) {

      extension_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional: The extension for the ring group.
     * </pre>
     *
     * <code>int32 extension = 5 [json_name = "extension"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExtension() {
      bitField0_ = (bitField0_ & ~0x00000010);
      extension_ = 0;
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


    // @@protoc_insertion_point(builder_scope:services.pbx.v1.CreateRingGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:services.pbx.v1.CreateRingGroupRequest)
  private static final com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest();
  }

  public static com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRingGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRingGroupRequest>() {
    @java.lang.Override
    public CreateRingGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRingGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRingGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v1.CreateRingGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

