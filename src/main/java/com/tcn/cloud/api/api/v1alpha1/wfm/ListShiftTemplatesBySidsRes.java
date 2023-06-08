// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the ListShiftTemplatesBySids RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListShiftTemplatesBySidsRes}
 */
public final class ListShiftTemplatesBySidsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListShiftTemplatesBySidsRes)
    ListShiftTemplatesBySidsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListShiftTemplatesBySidsRes.newBuilder() to construct.
  private ListShiftTemplatesBySidsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListShiftTemplatesBySidsRes() {
    shiftTemplates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListShiftTemplatesBySidsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListShiftTemplatesBySidsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListShiftTemplatesBySidsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.Builder.class);
  }

  public static final int SHIFT_TEMPLATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate> shiftTemplates_;
  /**
   * <pre>
   * Requested shift templates.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate> getShiftTemplatesList() {
    return shiftTemplates_;
  }
  /**
   * <pre>
   * Requested shift templates.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder> 
      getShiftTemplatesOrBuilderList() {
    return shiftTemplates_;
  }
  /**
   * <pre>
   * Requested shift templates.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
   */
  @java.lang.Override
  public int getShiftTemplatesCount() {
    return shiftTemplates_.size();
  }
  /**
   * <pre>
   * Requested shift templates.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate getShiftTemplates(int index) {
    return shiftTemplates_.get(index);
  }
  /**
   * <pre>
   * Requested shift templates.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder getShiftTemplatesOrBuilder(
      int index) {
    return shiftTemplates_.get(index);
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
    for (int i = 0; i < shiftTemplates_.size(); i++) {
      output.writeMessage(1, shiftTemplates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < shiftTemplates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, shiftTemplates_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes) obj;

    if (!getShiftTemplatesList()
        .equals(other.getShiftTemplatesList())) return false;
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
    if (getShiftTemplatesCount() > 0) {
      hash = (37 * hash) + SHIFT_TEMPLATES_FIELD_NUMBER;
      hash = (53 * hash) + getShiftTemplatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes prototype) {
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
   * Response message for the ListShiftTemplatesBySids RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListShiftTemplatesBySidsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListShiftTemplatesBySidsRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListShiftTemplatesBySidsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListShiftTemplatesBySidsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.newBuilder()
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
      if (shiftTemplatesBuilder_ == null) {
        shiftTemplates_ = java.util.Collections.emptyList();
      } else {
        shiftTemplates_ = null;
        shiftTemplatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListShiftTemplatesBySidsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes result) {
      if (shiftTemplatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          shiftTemplates_ = java.util.Collections.unmodifiableList(shiftTemplates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.shiftTemplates_ = shiftTemplates_;
      } else {
        result.shiftTemplates_ = shiftTemplatesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes.getDefaultInstance()) return this;
      if (shiftTemplatesBuilder_ == null) {
        if (!other.shiftTemplates_.isEmpty()) {
          if (shiftTemplates_.isEmpty()) {
            shiftTemplates_ = other.shiftTemplates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShiftTemplatesIsMutable();
            shiftTemplates_.addAll(other.shiftTemplates_);
          }
          onChanged();
        }
      } else {
        if (!other.shiftTemplates_.isEmpty()) {
          if (shiftTemplatesBuilder_.isEmpty()) {
            shiftTemplatesBuilder_.dispose();
            shiftTemplatesBuilder_ = null;
            shiftTemplates_ = other.shiftTemplates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            shiftTemplatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getShiftTemplatesFieldBuilder() : null;
          } else {
            shiftTemplatesBuilder_.addAllMessages(other.shiftTemplates_);
          }
        }
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
              com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.parser(),
                      extensionRegistry);
              if (shiftTemplatesBuilder_ == null) {
                ensureShiftTemplatesIsMutable();
                shiftTemplates_.add(m);
              } else {
                shiftTemplatesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate> shiftTemplates_ =
      java.util.Collections.emptyList();
    private void ensureShiftTemplatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        shiftTemplates_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate>(shiftTemplates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder> shiftTemplatesBuilder_;

    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate> getShiftTemplatesList() {
      if (shiftTemplatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(shiftTemplates_);
      } else {
        return shiftTemplatesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public int getShiftTemplatesCount() {
      if (shiftTemplatesBuilder_ == null) {
        return shiftTemplates_.size();
      } else {
        return shiftTemplatesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate getShiftTemplates(int index) {
      if (shiftTemplatesBuilder_ == null) {
        return shiftTemplates_.get(index);
      } else {
        return shiftTemplatesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder setShiftTemplates(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate value) {
      if (shiftTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShiftTemplatesIsMutable();
        shiftTemplates_.set(index, value);
        onChanged();
      } else {
        shiftTemplatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder setShiftTemplates(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder builderForValue) {
      if (shiftTemplatesBuilder_ == null) {
        ensureShiftTemplatesIsMutable();
        shiftTemplates_.set(index, builderForValue.build());
        onChanged();
      } else {
        shiftTemplatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder addShiftTemplates(com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate value) {
      if (shiftTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShiftTemplatesIsMutable();
        shiftTemplates_.add(value);
        onChanged();
      } else {
        shiftTemplatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder addShiftTemplates(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate value) {
      if (shiftTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShiftTemplatesIsMutable();
        shiftTemplates_.add(index, value);
        onChanged();
      } else {
        shiftTemplatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder addShiftTemplates(
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder builderForValue) {
      if (shiftTemplatesBuilder_ == null) {
        ensureShiftTemplatesIsMutable();
        shiftTemplates_.add(builderForValue.build());
        onChanged();
      } else {
        shiftTemplatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder addShiftTemplates(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder builderForValue) {
      if (shiftTemplatesBuilder_ == null) {
        ensureShiftTemplatesIsMutable();
        shiftTemplates_.add(index, builderForValue.build());
        onChanged();
      } else {
        shiftTemplatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder addAllShiftTemplates(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate> values) {
      if (shiftTemplatesBuilder_ == null) {
        ensureShiftTemplatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shiftTemplates_);
        onChanged();
      } else {
        shiftTemplatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder clearShiftTemplates() {
      if (shiftTemplatesBuilder_ == null) {
        shiftTemplates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        shiftTemplatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public Builder removeShiftTemplates(int index) {
      if (shiftTemplatesBuilder_ == null) {
        ensureShiftTemplatesIsMutable();
        shiftTemplates_.remove(index);
        onChanged();
      } else {
        shiftTemplatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder getShiftTemplatesBuilder(
        int index) {
      return getShiftTemplatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder getShiftTemplatesOrBuilder(
        int index) {
      if (shiftTemplatesBuilder_ == null) {
        return shiftTemplates_.get(index);  } else {
        return shiftTemplatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder> 
         getShiftTemplatesOrBuilderList() {
      if (shiftTemplatesBuilder_ != null) {
        return shiftTemplatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(shiftTemplates_);
      }
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder addShiftTemplatesBuilder() {
      return getShiftTemplatesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.getDefaultInstance());
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder addShiftTemplatesBuilder(
        int index) {
      return getShiftTemplatesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.getDefaultInstance());
    }
    /**
     * <pre>
     * Requested shift templates.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.ShiftTemplate shift_templates = 1 [json_name = "shiftTemplates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder> 
         getShiftTemplatesBuilderList() {
      return getShiftTemplatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder> 
        getShiftTemplatesFieldBuilder() {
      if (shiftTemplatesBuilder_ == null) {
        shiftTemplatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder>(
                shiftTemplates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        shiftTemplates_ = null;
      }
      return shiftTemplatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListShiftTemplatesBySidsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListShiftTemplatesBySidsRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListShiftTemplatesBySidsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListShiftTemplatesBySidsRes>() {
    @java.lang.Override
    public ListShiftTemplatesBySidsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListShiftTemplatesBySidsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListShiftTemplatesBySidsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListShiftTemplatesBySidsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

