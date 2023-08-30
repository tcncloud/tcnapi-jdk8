// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ListNonSkillActivityAssociations RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq}
 */
public final class ListNonSkillActivityAssociationsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq)
    ListNonSkillActivityAssociationsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListNonSkillActivityAssociationsReq.newBuilder() to construct.
  private ListNonSkillActivityAssociationsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListNonSkillActivityAssociationsReq() {
    relationshipType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListNonSkillActivityAssociationsReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.Builder.class);
  }

  public static final int ASSOCIATED_ENTITY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity associatedEntity_;
  /**
   * <pre>
   * Entity to check for relationships with the non skill activities.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
   * @return Whether the associatedEntity field is set.
   */
  @java.lang.Override
  public boolean hasAssociatedEntity() {
    return associatedEntity_ != null;
  }
  /**
   * <pre>
   * Entity to check for relationships with the non skill activities.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
   * @return The associatedEntity.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getAssociatedEntity() {
    return associatedEntity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : associatedEntity_;
  }
  /**
   * <pre>
   * Entity to check for relationships with the non skill activities.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getAssociatedEntityOrBuilder() {
    return associatedEntity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : associatedEntity_;
  }

  public static final int RELATIONSHIP_TYPE_FIELD_NUMBER = 2;
  private int relationshipType_ = 0;
  /**
   * <pre>
   * Type of relationship between non skill activity and the &#64;associated_entity.
   * </pre>
   *
   * <code>.api.commons.ConfigRelationshipType relationship_type = 2 [json_name = "relationshipType"];</code>
   * @return The enum numeric value on the wire for relationshipType.
   */
  @java.lang.Override public int getRelationshipTypeValue() {
    return relationshipType_;
  }
  /**
   * <pre>
   * Type of relationship between non skill activity and the &#64;associated_entity.
   * </pre>
   *
   * <code>.api.commons.ConfigRelationshipType relationship_type = 2 [json_name = "relationshipType"];</code>
   * @return The relationshipType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigRelationshipType getRelationshipType() {
    com.tcn.cloud.api.api.commons.ConfigRelationshipType result = com.tcn.cloud.api.api.commons.ConfigRelationshipType.forNumber(relationshipType_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigRelationshipType.UNRECOGNIZED : result;
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
    if (associatedEntity_ != null) {
      output.writeMessage(1, getAssociatedEntity());
    }
    if (relationshipType_ != com.tcn.cloud.api.api.commons.ConfigRelationshipType.IS_ASSOCIATED_WITH.getNumber()) {
      output.writeEnum(2, relationshipType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (associatedEntity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAssociatedEntity());
    }
    if (relationshipType_ != com.tcn.cloud.api.api.commons.ConfigRelationshipType.IS_ASSOCIATED_WITH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, relationshipType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq) obj;

    if (hasAssociatedEntity() != other.hasAssociatedEntity()) return false;
    if (hasAssociatedEntity()) {
      if (!getAssociatedEntity()
          .equals(other.getAssociatedEntity())) return false;
    }
    if (relationshipType_ != other.relationshipType_) return false;
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
    if (hasAssociatedEntity()) {
      hash = (37 * hash) + ASSOCIATED_ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getAssociatedEntity().hashCode();
    }
    hash = (37 * hash) + RELATIONSHIP_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + relationshipType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq prototype) {
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
   * Request message for the ListNonSkillActivityAssociations RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.newBuilder()
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
      associatedEntity_ = null;
      if (associatedEntityBuilder_ != null) {
        associatedEntityBuilder_.dispose();
        associatedEntityBuilder_ = null;
      }
      relationshipType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListNonSkillActivityAssociationsReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.associatedEntity_ = associatedEntityBuilder_ == null
            ? associatedEntity_
            : associatedEntityBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relationshipType_ = relationshipType_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq.getDefaultInstance()) return this;
      if (other.hasAssociatedEntity()) {
        mergeAssociatedEntity(other.getAssociatedEntity());
      }
      if (other.relationshipType_ != 0) {
        setRelationshipTypeValue(other.getRelationshipTypeValue());
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
                  getAssociatedEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              relationshipType_ = input.readEnum();
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity associatedEntity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder> associatedEntityBuilder_;
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     * @return Whether the associatedEntity field is set.
     */
    public boolean hasAssociatedEntity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     * @return The associatedEntity.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getAssociatedEntity() {
      if (associatedEntityBuilder_ == null) {
        return associatedEntity_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : associatedEntity_;
      } else {
        return associatedEntityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     */
    public Builder setAssociatedEntity(com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity value) {
      if (associatedEntityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        associatedEntity_ = value;
      } else {
        associatedEntityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     */
    public Builder setAssociatedEntity(
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder builderForValue) {
      if (associatedEntityBuilder_ == null) {
        associatedEntity_ = builderForValue.build();
      } else {
        associatedEntityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     */
    public Builder mergeAssociatedEntity(com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity value) {
      if (associatedEntityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          associatedEntity_ != null &&
          associatedEntity_ != com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance()) {
          getAssociatedEntityBuilder().mergeFrom(value);
        } else {
          associatedEntity_ = value;
        }
      } else {
        associatedEntityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     */
    public Builder clearAssociatedEntity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      associatedEntity_ = null;
      if (associatedEntityBuilder_ != null) {
        associatedEntityBuilder_.dispose();
        associatedEntityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder getAssociatedEntityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAssociatedEntityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getAssociatedEntityOrBuilder() {
      if (associatedEntityBuilder_ != null) {
        return associatedEntityBuilder_.getMessageOrBuilder();
      } else {
        return associatedEntity_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.getDefaultInstance() : associatedEntity_;
      }
    }
    /**
     * <pre>
     * Entity to check for relationships with the non skill activities.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ParentEntity associated_entity = 1 [json_name = "associatedEntity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder> 
        getAssociatedEntityFieldBuilder() {
      if (associatedEntityBuilder_ == null) {
        associatedEntityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder>(
                getAssociatedEntity(),
                getParentForChildren(),
                isClean());
        associatedEntity_ = null;
      }
      return associatedEntityBuilder_;
    }

    private int relationshipType_ = 0;
    /**
     * <pre>
     * Type of relationship between non skill activity and the &#64;associated_entity.
     * </pre>
     *
     * <code>.api.commons.ConfigRelationshipType relationship_type = 2 [json_name = "relationshipType"];</code>
     * @return The enum numeric value on the wire for relationshipType.
     */
    @java.lang.Override public int getRelationshipTypeValue() {
      return relationshipType_;
    }
    /**
     * <pre>
     * Type of relationship between non skill activity and the &#64;associated_entity.
     * </pre>
     *
     * <code>.api.commons.ConfigRelationshipType relationship_type = 2 [json_name = "relationshipType"];</code>
     * @param value The enum numeric value on the wire for relationshipType to set.
     * @return This builder for chaining.
     */
    public Builder setRelationshipTypeValue(int value) {
      relationshipType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of relationship between non skill activity and the &#64;associated_entity.
     * </pre>
     *
     * <code>.api.commons.ConfigRelationshipType relationship_type = 2 [json_name = "relationshipType"];</code>
     * @return The relationshipType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigRelationshipType getRelationshipType() {
      com.tcn.cloud.api.api.commons.ConfigRelationshipType result = com.tcn.cloud.api.api.commons.ConfigRelationshipType.forNumber(relationshipType_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigRelationshipType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of relationship between non skill activity and the &#64;associated_entity.
     * </pre>
     *
     * <code>.api.commons.ConfigRelationshipType relationship_type = 2 [json_name = "relationshipType"];</code>
     * @param value The relationshipType to set.
     * @return This builder for chaining.
     */
    public Builder setRelationshipType(com.tcn.cloud.api.api.commons.ConfigRelationshipType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      relationshipType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of relationship between non skill activity and the &#64;associated_entity.
     * </pre>
     *
     * <code>.api.commons.ConfigRelationshipType relationship_type = 2 [json_name = "relationshipType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelationshipType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      relationshipType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNonSkillActivityAssociationsReq>
      PARSER = new com.google.protobuf.AbstractParser<ListNonSkillActivityAssociationsReq>() {
    @java.lang.Override
    public ListNonSkillActivityAssociationsReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNonSkillActivityAssociationsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNonSkillActivityAssociationsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListNonSkillActivityAssociationsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

