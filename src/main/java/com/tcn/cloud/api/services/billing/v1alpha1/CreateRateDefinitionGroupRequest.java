// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/groups.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

/**
 * Protobuf type {@code services.billing.v1alpha1.CreateRateDefinitionGroupRequest}
 */
public final class CreateRateDefinitionGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha1.CreateRateDefinitionGroupRequest)
    CreateRateDefinitionGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateRateDefinitionGroupRequest.newBuilder() to construct.
  private CreateRateDefinitionGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateRateDefinitionGroupRequest() {
    rateDefinitionGroupId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateRateDefinitionGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha1.GroupsProto.internal_static_services_billing_v1alpha1_CreateRateDefinitionGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha1.GroupsProto.internal_static_services_billing_v1alpha1_CreateRateDefinitionGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest.class, com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest.Builder.class);
  }

  public static final int RATE_DEFINITION_GROUP_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rateDefinitionGroupId_ = "";
  /**
   * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
   * @return The rateDefinitionGroupId.
   */
  @java.lang.Override
  public java.lang.String getRateDefinitionGroupId() {
    java.lang.Object ref = rateDefinitionGroupId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rateDefinitionGroupId_ = s;
      return s;
    }
  }
  /**
   * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
   * @return The bytes for rateDefinitionGroupId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRateDefinitionGroupIdBytes() {
    java.lang.Object ref = rateDefinitionGroupId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rateDefinitionGroupId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RATE_DEFINITION_GROUP_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup rateDefinitionGroup_;
  /**
   * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
   * @return Whether the rateDefinitionGroup field is set.
   */
  @java.lang.Override
  public boolean hasRateDefinitionGroup() {
    return rateDefinitionGroup_ != null;
  }
  /**
   * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
   * @return The rateDefinitionGroup.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup getRateDefinitionGroup() {
    return rateDefinitionGroup_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.getDefaultInstance() : rateDefinitionGroup_;
  }
  /**
   * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroupOrBuilder getRateDefinitionGroupOrBuilder() {
    return rateDefinitionGroup_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.getDefaultInstance() : rateDefinitionGroup_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rateDefinitionGroupId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rateDefinitionGroupId_);
    }
    if (rateDefinitionGroup_ != null) {
      output.writeMessage(2, getRateDefinitionGroup());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rateDefinitionGroupId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rateDefinitionGroupId_);
    }
    if (rateDefinitionGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRateDefinitionGroup());
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest other = (com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest) obj;

    if (!getRateDefinitionGroupId()
        .equals(other.getRateDefinitionGroupId())) return false;
    if (hasRateDefinitionGroup() != other.hasRateDefinitionGroup()) return false;
    if (hasRateDefinitionGroup()) {
      if (!getRateDefinitionGroup()
          .equals(other.getRateDefinitionGroup())) return false;
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
    hash = (37 * hash) + RATE_DEFINITION_GROUP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRateDefinitionGroupId().hashCode();
    if (hasRateDefinitionGroup()) {
      hash = (37 * hash) + RATE_DEFINITION_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getRateDefinitionGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest prototype) {
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
   * Protobuf type {@code services.billing.v1alpha1.CreateRateDefinitionGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha1.CreateRateDefinitionGroupRequest)
      com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha1.GroupsProto.internal_static_services_billing_v1alpha1_CreateRateDefinitionGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha1.GroupsProto.internal_static_services_billing_v1alpha1_CreateRateDefinitionGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest.class, com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest.newBuilder()
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
      rateDefinitionGroupId_ = "";
      rateDefinitionGroup_ = null;
      if (rateDefinitionGroupBuilder_ != null) {
        rateDefinitionGroupBuilder_.dispose();
        rateDefinitionGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha1.GroupsProto.internal_static_services_billing_v1alpha1_CreateRateDefinitionGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest build() {
      com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest result = new com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rateDefinitionGroupId_ = rateDefinitionGroupId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rateDefinitionGroup_ = rateDefinitionGroupBuilder_ == null
            ? rateDefinitionGroup_
            : rateDefinitionGroupBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest.getDefaultInstance()) return this;
      if (!other.getRateDefinitionGroupId().isEmpty()) {
        rateDefinitionGroupId_ = other.rateDefinitionGroupId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasRateDefinitionGroup()) {
        mergeRateDefinitionGroup(other.getRateDefinitionGroup());
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
              rateDefinitionGroupId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRateDefinitionGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object rateDefinitionGroupId_ = "";
    /**
     * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
     * @return The rateDefinitionGroupId.
     */
    public java.lang.String getRateDefinitionGroupId() {
      java.lang.Object ref = rateDefinitionGroupId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rateDefinitionGroupId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
     * @return The bytes for rateDefinitionGroupId.
     */
    public com.google.protobuf.ByteString
        getRateDefinitionGroupIdBytes() {
      java.lang.Object ref = rateDefinitionGroupId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rateDefinitionGroupId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
     * @param value The rateDefinitionGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setRateDefinitionGroupId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rateDefinitionGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRateDefinitionGroupId() {
      rateDefinitionGroupId_ = getDefaultInstance().getRateDefinitionGroupId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string rate_definition_group_id = 1 [json_name = "rateDefinitionGroupId"];</code>
     * @param value The bytes for rateDefinitionGroupId to set.
     * @return This builder for chaining.
     */
    public Builder setRateDefinitionGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rateDefinitionGroupId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup rateDefinitionGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroupOrBuilder> rateDefinitionGroupBuilder_;
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     * @return Whether the rateDefinitionGroup field is set.
     */
    public boolean hasRateDefinitionGroup() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     * @return The rateDefinitionGroup.
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup getRateDefinitionGroup() {
      if (rateDefinitionGroupBuilder_ == null) {
        return rateDefinitionGroup_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.getDefaultInstance() : rateDefinitionGroup_;
      } else {
        return rateDefinitionGroupBuilder_.getMessage();
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     */
    public Builder setRateDefinitionGroup(com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup value) {
      if (rateDefinitionGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rateDefinitionGroup_ = value;
      } else {
        rateDefinitionGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     */
    public Builder setRateDefinitionGroup(
        com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.Builder builderForValue) {
      if (rateDefinitionGroupBuilder_ == null) {
        rateDefinitionGroup_ = builderForValue.build();
      } else {
        rateDefinitionGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     */
    public Builder mergeRateDefinitionGroup(com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup value) {
      if (rateDefinitionGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          rateDefinitionGroup_ != null &&
          rateDefinitionGroup_ != com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.getDefaultInstance()) {
          getRateDefinitionGroupBuilder().mergeFrom(value);
        } else {
          rateDefinitionGroup_ = value;
        }
      } else {
        rateDefinitionGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     */
    public Builder clearRateDefinitionGroup() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rateDefinitionGroup_ = null;
      if (rateDefinitionGroupBuilder_ != null) {
        rateDefinitionGroupBuilder_.dispose();
        rateDefinitionGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.Builder getRateDefinitionGroupBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRateDefinitionGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroupOrBuilder getRateDefinitionGroupOrBuilder() {
      if (rateDefinitionGroupBuilder_ != null) {
        return rateDefinitionGroupBuilder_.getMessageOrBuilder();
      } else {
        return rateDefinitionGroup_ == null ?
            com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.getDefaultInstance() : rateDefinitionGroup_;
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha1.RateDefinitionGroup rate_definition_group = 2 [json_name = "rateDefinitionGroup"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroupOrBuilder> 
        getRateDefinitionGroupFieldBuilder() {
      if (rateDefinitionGroupBuilder_ == null) {
        rateDefinitionGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroup.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.RateDefinitionGroupOrBuilder>(
                getRateDefinitionGroup(),
                getParentForChildren(),
                isClean());
        rateDefinitionGroup_ = null;
      }
      return rateDefinitionGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha1.CreateRateDefinitionGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha1.CreateRateDefinitionGroupRequest)
  private static final com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRateDefinitionGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateRateDefinitionGroupRequest>() {
    @java.lang.Override
    public CreateRateDefinitionGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRateDefinitionGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRateDefinitionGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha1.CreateRateDefinitionGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

