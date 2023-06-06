// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreatePlacementRule RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreatePlacementRuleReq}
 */
public final class CreatePlacementRuleReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreatePlacementRuleReq)
    CreatePlacementRuleReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePlacementRuleReq.newBuilder() to construct.
  private CreatePlacementRuleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePlacementRuleReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePlacementRuleReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreatePlacementRuleReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreatePlacementRuleReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.Builder.class);
  }

  public static final int PLACEMENT_RULE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule placementRule_;
  /**
   * <pre>
   * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
   * @return Whether the placementRule field is set.
   */
  @java.lang.Override
  public boolean hasPlacementRule() {
    return placementRule_ != null;
  }
  /**
   * <pre>
   * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
   * @return The placementRule.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule getPlacementRule() {
    return placementRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.getDefaultInstance() : placementRule_;
  }
  /**
   * <pre>
   * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRuleOrBuilder getPlacementRuleOrBuilder() {
    return placementRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.getDefaultInstance() : placementRule_;
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
    if (placementRule_ != null) {
      output.writeMessage(1, getPlacementRule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (placementRule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlacementRule());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq) obj;

    if (hasPlacementRule() != other.hasPlacementRule()) return false;
    if (hasPlacementRule()) {
      if (!getPlacementRule()
          .equals(other.getPlacementRule())) return false;
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
    if (hasPlacementRule()) {
      hash = (37 * hash) + PLACEMENT_RULE_FIELD_NUMBER;
      hash = (53 * hash) + getPlacementRule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq prototype) {
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
   * Request message for the CreatePlacementRule RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreatePlacementRuleReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreatePlacementRuleReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreatePlacementRuleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreatePlacementRuleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.newBuilder()
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
      placementRule_ = null;
      if (placementRuleBuilder_ != null) {
        placementRuleBuilder_.dispose();
        placementRuleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreatePlacementRuleReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.placementRule_ = placementRuleBuilder_ == null
            ? placementRule_
            : placementRuleBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq.getDefaultInstance()) return this;
      if (other.hasPlacementRule()) {
        mergePlacementRule(other.getPlacementRule());
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
                  getPlacementRuleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule placementRule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule, com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRuleOrBuilder> placementRuleBuilder_;
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     * @return Whether the placementRule field is set.
     */
    public boolean hasPlacementRule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     * @return The placementRule.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule getPlacementRule() {
      if (placementRuleBuilder_ == null) {
        return placementRule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.getDefaultInstance() : placementRule_;
      } else {
        return placementRuleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     */
    public Builder setPlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule value) {
      if (placementRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        placementRule_ = value;
      } else {
        placementRuleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     */
    public Builder setPlacementRule(
        com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.Builder builderForValue) {
      if (placementRuleBuilder_ == null) {
        placementRule_ = builderForValue.build();
      } else {
        placementRuleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     */
    public Builder mergePlacementRule(com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule value) {
      if (placementRuleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          placementRule_ != null &&
          placementRule_ != com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.getDefaultInstance()) {
          getPlacementRuleBuilder().mergeFrom(value);
        } else {
          placementRule_ = value;
        }
      } else {
        placementRuleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     */
    public Builder clearPlacementRule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      placementRule_ = null;
      if (placementRuleBuilder_ != null) {
        placementRuleBuilder_.dispose();
        placementRuleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.Builder getPlacementRuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPlacementRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRuleOrBuilder getPlacementRuleOrBuilder() {
      if (placementRuleBuilder_ != null) {
        return placementRuleBuilder_.getMessageOrBuilder();
      } else {
        return placementRule_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.getDefaultInstance() : placementRule_;
      }
    }
    /**
     * <pre>
     * Placement rule to create, the &#64;placement_rule_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.PlacementRule placement_rule = 1 [json_name = "placementRule"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule, com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRuleOrBuilder> 
        getPlacementRuleFieldBuilder() {
      if (placementRuleBuilder_ == null) {
        placementRuleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule, com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.PlacementRuleOrBuilder>(
                getPlacementRule(),
                getParentForChildren(),
                isClean());
        placementRule_ = null;
      }
      return placementRuleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreatePlacementRuleReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreatePlacementRuleReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePlacementRuleReq>
      PARSER = new com.google.protobuf.AbstractParser<CreatePlacementRuleReq>() {
    @java.lang.Override
    public CreatePlacementRuleReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePlacementRuleReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePlacementRuleReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreatePlacementRuleReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

