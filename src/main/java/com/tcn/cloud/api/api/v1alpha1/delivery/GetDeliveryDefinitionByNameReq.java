// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

/**
 * Protobuf type {@code api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq}
 */
public final class GetDeliveryDefinitionByNameReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq)
    GetDeliveryDefinitionByNameReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDeliveryDefinitionByNameReq.newBuilder() to construct.
  private GetDeliveryDefinitionByNameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDeliveryDefinitionByNameReq() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDeliveryDefinitionByNameReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_GetDeliveryDefinitionByNameReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_GetDeliveryDefinitionByNameReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.class, com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * obsolete dont use
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", deprecated = true];</code>
   * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
   *     See api/v1alpha1/delivery/service.proto;l=433
   * @return The name.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getName() {
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
   * obsolete dont use
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", deprecated = true];</code>
   * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
   *     See api/v1alpha1/delivery/service.proto;l=433
   * @return The bytes for name.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
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

  public static final int MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask mask_;
  /**
   * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
   * @return Whether the mask field is set.
   */
  @java.lang.Override
  public boolean hasMask() {
    return mask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
   * @return The mask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getMask() {
    return mask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : mask_;
  }
  /**
   * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getMaskOrBuilder() {
    return mask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : mask_;
  }

  public static final int ENTITY_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition entity_;
  /**
   * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
   * @return The entity.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition getEntity() {
    return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.getDefaultInstance() : entity_;
  }
  /**
   * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinitionOrBuilder getEntityOrBuilder() {
    return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.getDefaultInstance() : entity_;
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
    if (mask_ != null) {
      output.writeMessage(2, getMask());
    }
    if (entity_ != null) {
      output.writeMessage(3, getEntity());
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
    if (mask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMask());
    }
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getEntity());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq other = (com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasMask() != other.hasMask()) return false;
    if (hasMask()) {
      if (!getMask()
          .equals(other.getMask())) return false;
    }
    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasMask()) {
      hash = (37 * hash) + MASK_FIELD_NUMBER;
      hash = (53 * hash) + getMask().hashCode();
    }
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq)
      com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_GetDeliveryDefinitionByNameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_GetDeliveryDefinitionByNameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.class, com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.newBuilder()
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
      mask_ = null;
      if (maskBuilder_ != null) {
        maskBuilder_.dispose();
        maskBuilder_ = null;
      }
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_GetDeliveryDefinitionByNameReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq build() {
      com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq result = new com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mask_ = maskBuilder_ == null
            ? mask_
            : maskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMask()) {
        mergeMask(other.getMask());
      }
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
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
              input.readMessage(
                  getMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * obsolete dont use
     * </pre>
     *
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
     *     See api/v1alpha1/delivery/service.proto;l=433
     * @return The name.
     */
    @java.lang.Deprecated public java.lang.String getName() {
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
     * obsolete dont use
     * </pre>
     *
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
     *     See api/v1alpha1/delivery/service.proto;l=433
     * @return The bytes for name.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
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
     * obsolete dont use
     * </pre>
     *
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
     *     See api/v1alpha1/delivery/service.proto;l=433
     * @param value The name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * obsolete dont use
     * </pre>
     *
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
     *     See api/v1alpha1/delivery/service.proto;l=433
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * obsolete dont use
     * </pre>
     *
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq.name is deprecated.
     *     See api/v1alpha1/delivery/service.proto;l=433
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.FieldMask mask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> maskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     * @return Whether the mask field is set.
     */
    public boolean hasMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     * @return The mask.
     */
    public com.google.protobuf.FieldMask getMask() {
      if (maskBuilder_ == null) {
        return mask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : mask_;
      } else {
        return maskBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     */
    public Builder setMask(com.google.protobuf.FieldMask value) {
      if (maskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mask_ = value;
      } else {
        maskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     */
    public Builder setMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (maskBuilder_ == null) {
        mask_ = builderForValue.build();
      } else {
        maskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     */
    public Builder mergeMask(com.google.protobuf.FieldMask value) {
      if (maskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          mask_ != null &&
          mask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getMaskBuilder().mergeFrom(value);
        } else {
          mask_ = value;
        }
      } else {
        maskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     */
    public Builder clearMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mask_ = null;
      if (maskBuilder_ != null) {
        maskBuilder_.dispose();
        maskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getMaskOrBuilder() {
      if (maskBuilder_ != null) {
        return maskBuilder_.getMessageOrBuilder();
      } else {
        return mask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : mask_;
      }
    }
    /**
     * <code>.google.protobuf.FieldMask mask = 2 [json_name = "mask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getMaskFieldBuilder() {
      if (maskBuilder_ == null) {
        maskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getMask(),
                getParentForChildren(),
                isClean());
        mask_ = null;
      }
      return maskBuilder_;
    }

    private com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition, com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinitionOrBuilder> entityBuilder_;
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     * @return The entity.
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     */
    public Builder setEntity(com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
      } else {
        entityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     */
    public Builder setEntity(
        com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     */
    public Builder mergeEntity(com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          entity_ != null &&
          entity_ != com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.getDefaultInstance()) {
          getEntityBuilder().mergeFrom(value);
        } else {
          entity_ = value;
        }
      } else {
        entityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     */
    public Builder clearEntity() {
      bitField0_ = (bitField0_ & ~0x00000004);
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.Builder getEntityBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinitionOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ?
            com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.getDefaultInstance() : entity_;
      }
    }
    /**
     * <code>.api.v1alpha1.delivery.DeliveryDefinition entity = 3 [json_name = "entity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition, com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinitionOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition, com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinition.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.DeliveryDefinitionOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq)
  private static final com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDeliveryDefinitionByNameReq>
      PARSER = new com.google.protobuf.AbstractParser<GetDeliveryDefinitionByNameReq>() {
    @java.lang.Override
    public GetDeliveryDefinitionByNameReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDeliveryDefinitionByNameReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDeliveryDefinitionByNameReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.GetDeliveryDefinitionByNameReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

