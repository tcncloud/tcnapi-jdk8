// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ListConfigEntities RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListConfigEntitiesReq}
 */
public final class ListConfigEntitiesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListConfigEntitiesReq)
    ListConfigEntitiesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListConfigEntitiesReq.newBuilder() to construct.
  private ListConfigEntitiesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListConfigEntitiesReq() {
    entityType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListConfigEntitiesReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListConfigEntitiesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListConfigEntitiesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.Builder.class);
  }

  public static final int ENTITY_TYPE_FIELD_NUMBER = 1;
  private int entityType_ = 0;
  /**
   * <pre>
   * Entity type of the entities to retrieve.
   * </pre>
   *
   * <code>.api.commons.ConfigEntityType entity_type = 1 [json_name = "entityType"];</code>
   * @return The enum numeric value on the wire for entityType.
   */
  @java.lang.Override public int getEntityTypeValue() {
    return entityType_;
  }
  /**
   * <pre>
   * Entity type of the entities to retrieve.
   * </pre>
   *
   * <code>.api.commons.ConfigEntityType entity_type = 1 [json_name = "entityType"];</code>
   * @return The entityType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigEntityType getEntityType() {
    com.tcn.cloud.api.api.commons.ConfigEntityType result = com.tcn.cloud.api.api.commons.ConfigEntityType.forNumber(entityType_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigEntityType.UNRECOGNIZED : result;
  }

  public static final int BELONGS_TO_ENTITY_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity belongsToEntity_;
  /**
   * <pre>
   * Entity that the entities to return will belong to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
   * @return Whether the belongsToEntity field is set.
   */
  @java.lang.Override
  public boolean hasBelongsToEntity() {
    return belongsToEntity_ != null;
  }
  /**
   * <pre>
   * Entity that the entities to return will belong to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
   * @return The belongsToEntity.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getBelongsToEntity() {
    return belongsToEntity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : belongsToEntity_;
  }
  /**
   * <pre>
   * Entity that the entities to return will belong to.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getBelongsToEntityOrBuilder() {
    return belongsToEntity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : belongsToEntity_;
  }

  public static final int INCLUDE_INACTIVE_FIELD_NUMBER = 3;
  private boolean includeInactive_ = false;
  /**
   * <pre>
   * Indicates whether or not to retrieve inactive entities (true=active and inactive, false=active only).
   * </pre>
   *
   * <code>bool include_inactive = 3 [json_name = "includeInactive"];</code>
   * @return The includeInactive.
   */
  @java.lang.Override
  public boolean getIncludeInactive() {
    return includeInactive_;
  }

  public static final int MEMBER_DEPTH_FIELD_NUMBER = 4;
  private int memberDepth_ = 0;
  /**
   * <pre>
   * Depth to go down the config tree for children and member entities.
   * e.g: a value of 0 will only get the entities requested with no children/member.
   *      a value of 1 will get the entities with children/member entities included 1 level down.
   * </pre>
   *
   * <code>int32 member_depth = 4 [json_name = "memberDepth"];</code>
   * @return The memberDepth.
   */
  @java.lang.Override
  public int getMemberDepth() {
    return memberDepth_;
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
    if (entityType_ != com.tcn.cloud.api.api.commons.ConfigEntityType.CALL_CENTER_NODE.getNumber()) {
      output.writeEnum(1, entityType_);
    }
    if (belongsToEntity_ != null) {
      output.writeMessage(2, getBelongsToEntity());
    }
    if (includeInactive_ != false) {
      output.writeBool(3, includeInactive_);
    }
    if (memberDepth_ != 0) {
      output.writeInt32(4, memberDepth_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entityType_ != com.tcn.cloud.api.api.commons.ConfigEntityType.CALL_CENTER_NODE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, entityType_);
    }
    if (belongsToEntity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBelongsToEntity());
    }
    if (includeInactive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, includeInactive_);
    }
    if (memberDepth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, memberDepth_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq) obj;

    if (entityType_ != other.entityType_) return false;
    if (hasBelongsToEntity() != other.hasBelongsToEntity()) return false;
    if (hasBelongsToEntity()) {
      if (!getBelongsToEntity()
          .equals(other.getBelongsToEntity())) return false;
    }
    if (getIncludeInactive()
        != other.getIncludeInactive()) return false;
    if (getMemberDepth()
        != other.getMemberDepth()) return false;
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
    hash = (37 * hash) + ENTITY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + entityType_;
    if (hasBelongsToEntity()) {
      hash = (37 * hash) + BELONGS_TO_ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getBelongsToEntity().hashCode();
    }
    hash = (37 * hash) + INCLUDE_INACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIncludeInactive());
    hash = (37 * hash) + MEMBER_DEPTH_FIELD_NUMBER;
    hash = (53 * hash) + getMemberDepth();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq prototype) {
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
   * Request message for the ListConfigEntities RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListConfigEntitiesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListConfigEntitiesReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListConfigEntitiesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListConfigEntitiesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.newBuilder()
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
      entityType_ = 0;
      belongsToEntity_ = null;
      if (belongsToEntityBuilder_ != null) {
        belongsToEntityBuilder_.dispose();
        belongsToEntityBuilder_ = null;
      }
      includeInactive_ = false;
      memberDepth_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListConfigEntitiesReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entityType_ = entityType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.belongsToEntity_ = belongsToEntityBuilder_ == null
            ? belongsToEntity_
            : belongsToEntityBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.includeInactive_ = includeInactive_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.memberDepth_ = memberDepth_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq.getDefaultInstance()) return this;
      if (other.entityType_ != 0) {
        setEntityTypeValue(other.getEntityTypeValue());
      }
      if (other.hasBelongsToEntity()) {
        mergeBelongsToEntity(other.getBelongsToEntity());
      }
      if (other.getIncludeInactive() != false) {
        setIncludeInactive(other.getIncludeInactive());
      }
      if (other.getMemberDepth() != 0) {
        setMemberDepth(other.getMemberDepth());
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
              entityType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getBelongsToEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              includeInactive_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              memberDepth_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private int entityType_ = 0;
    /**
     * <pre>
     * Entity type of the entities to retrieve.
     * </pre>
     *
     * <code>.api.commons.ConfigEntityType entity_type = 1 [json_name = "entityType"];</code>
     * @return The enum numeric value on the wire for entityType.
     */
    @java.lang.Override public int getEntityTypeValue() {
      return entityType_;
    }
    /**
     * <pre>
     * Entity type of the entities to retrieve.
     * </pre>
     *
     * <code>.api.commons.ConfigEntityType entity_type = 1 [json_name = "entityType"];</code>
     * @param value The enum numeric value on the wire for entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityTypeValue(int value) {
      entityType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity type of the entities to retrieve.
     * </pre>
     *
     * <code>.api.commons.ConfigEntityType entity_type = 1 [json_name = "entityType"];</code>
     * @return The entityType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigEntityType getEntityType() {
      com.tcn.cloud.api.api.commons.ConfigEntityType result = com.tcn.cloud.api.api.commons.ConfigEntityType.forNumber(entityType_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigEntityType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Entity type of the entities to retrieve.
     * </pre>
     *
     * <code>.api.commons.ConfigEntityType entity_type = 1 [json_name = "entityType"];</code>
     * @param value The entityType to set.
     * @return This builder for chaining.
     */
    public Builder setEntityType(com.tcn.cloud.api.api.commons.ConfigEntityType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      entityType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity type of the entities to retrieve.
     * </pre>
     *
     * <code>.api.commons.ConfigEntityType entity_type = 1 [json_name = "entityType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entityType_ = 0;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity belongsToEntity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder> belongsToEntityBuilder_;
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     * @return Whether the belongsToEntity field is set.
     */
    public boolean hasBelongsToEntity() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     * @return The belongsToEntity.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getBelongsToEntity() {
      if (belongsToEntityBuilder_ == null) {
        return belongsToEntity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : belongsToEntity_;
      } else {
        return belongsToEntityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     */
    public Builder setBelongsToEntity(com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity value) {
      if (belongsToEntityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        belongsToEntity_ = value;
      } else {
        belongsToEntityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     */
    public Builder setBelongsToEntity(
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder builderForValue) {
      if (belongsToEntityBuilder_ == null) {
        belongsToEntity_ = builderForValue.build();
      } else {
        belongsToEntityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     */
    public Builder mergeBelongsToEntity(com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity value) {
      if (belongsToEntityBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          belongsToEntity_ != null &&
          belongsToEntity_ != com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance()) {
          getBelongsToEntityBuilder().mergeFrom(value);
        } else {
          belongsToEntity_ = value;
        }
      } else {
        belongsToEntityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     */
    public Builder clearBelongsToEntity() {
      bitField0_ = (bitField0_ & ~0x00000002);
      belongsToEntity_ = null;
      if (belongsToEntityBuilder_ != null) {
        belongsToEntityBuilder_.dispose();
        belongsToEntityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder getBelongsToEntityBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBelongsToEntityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getBelongsToEntityOrBuilder() {
      if (belongsToEntityBuilder_ != null) {
        return belongsToEntityBuilder_.getMessageOrBuilder();
      } else {
        return belongsToEntity_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : belongsToEntity_;
      }
    }
    /**
     * <pre>
     * Entity that the entities to return will belong to.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity belongs_to_entity = 2 [json_name = "belongsToEntity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder> 
        getBelongsToEntityFieldBuilder() {
      if (belongsToEntityBuilder_ == null) {
        belongsToEntityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder>(
                getBelongsToEntity(),
                getParentForChildren(),
                isClean());
        belongsToEntity_ = null;
      }
      return belongsToEntityBuilder_;
    }

    private boolean includeInactive_ ;
    /**
     * <pre>
     * Indicates whether or not to retrieve inactive entities (true=active and inactive, false=active only).
     * </pre>
     *
     * <code>bool include_inactive = 3 [json_name = "includeInactive"];</code>
     * @return The includeInactive.
     */
    @java.lang.Override
    public boolean getIncludeInactive() {
      return includeInactive_;
    }
    /**
     * <pre>
     * Indicates whether or not to retrieve inactive entities (true=active and inactive, false=active only).
     * </pre>
     *
     * <code>bool include_inactive = 3 [json_name = "includeInactive"];</code>
     * @param value The includeInactive to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeInactive(boolean value) {

      includeInactive_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates whether or not to retrieve inactive entities (true=active and inactive, false=active only).
     * </pre>
     *
     * <code>bool include_inactive = 3 [json_name = "includeInactive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeInactive() {
      bitField0_ = (bitField0_ & ~0x00000004);
      includeInactive_ = false;
      onChanged();
      return this;
    }

    private int memberDepth_ ;
    /**
     * <pre>
     * Depth to go down the config tree for children and member entities.
     * e.g: a value of 0 will only get the entities requested with no children/member.
     *      a value of 1 will get the entities with children/member entities included 1 level down.
     * </pre>
     *
     * <code>int32 member_depth = 4 [json_name = "memberDepth"];</code>
     * @return The memberDepth.
     */
    @java.lang.Override
    public int getMemberDepth() {
      return memberDepth_;
    }
    /**
     * <pre>
     * Depth to go down the config tree for children and member entities.
     * e.g: a value of 0 will only get the entities requested with no children/member.
     *      a value of 1 will get the entities with children/member entities included 1 level down.
     * </pre>
     *
     * <code>int32 member_depth = 4 [json_name = "memberDepth"];</code>
     * @param value The memberDepth to set.
     * @return This builder for chaining.
     */
    public Builder setMemberDepth(int value) {

      memberDepth_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Depth to go down the config tree for children and member entities.
     * e.g: a value of 0 will only get the entities requested with no children/member.
     *      a value of 1 will get the entities with children/member entities included 1 level down.
     * </pre>
     *
     * <code>int32 member_depth = 4 [json_name = "memberDepth"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMemberDepth() {
      bitField0_ = (bitField0_ & ~0x00000008);
      memberDepth_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListConfigEntitiesReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListConfigEntitiesReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListConfigEntitiesReq>
      PARSER = new com.google.protobuf.AbstractParser<ListConfigEntitiesReq>() {
    @java.lang.Override
    public ListConfigEntitiesReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListConfigEntitiesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListConfigEntitiesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListConfigEntitiesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

