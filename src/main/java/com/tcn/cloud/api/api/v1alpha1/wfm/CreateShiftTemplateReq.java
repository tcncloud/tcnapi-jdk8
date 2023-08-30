// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreateShiftTemplate RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateShiftTemplateReq}
 */
public final class CreateShiftTemplateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateShiftTemplateReq)
    CreateShiftTemplateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateShiftTemplateReq.newBuilder() to construct.
  private CreateShiftTemplateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateShiftTemplateReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateShiftTemplateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftTemplateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftTemplateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.Builder.class);
  }

  public static final int SHIFT_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate shiftTemplate_;
  /**
   * <pre>
   * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
   * @return Whether the shiftTemplate field is set.
   */
  @java.lang.Override
  public boolean hasShiftTemplate() {
    return shiftTemplate_ != null;
  }
  /**
   * <pre>
   * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
   * @return The shiftTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate getShiftTemplate() {
    return shiftTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.getDefaultInstance() : shiftTemplate_;
  }
  /**
   * <pre>
   * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder getShiftTemplateOrBuilder() {
    return shiftTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.getDefaultInstance() : shiftTemplate_;
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
    if (shiftTemplate_ != null) {
      output.writeMessage(1, getShiftTemplate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shiftTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getShiftTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq) obj;

    if (hasShiftTemplate() != other.hasShiftTemplate()) return false;
    if (hasShiftTemplate()) {
      if (!getShiftTemplate()
          .equals(other.getShiftTemplate())) return false;
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
    if (hasShiftTemplate()) {
      hash = (37 * hash) + SHIFT_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getShiftTemplate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq prototype) {
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
   * Request message for the CreateShiftTemplate RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateShiftTemplateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateShiftTemplateReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftTemplateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftTemplateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.newBuilder()
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
      shiftTemplate_ = null;
      if (shiftTemplateBuilder_ != null) {
        shiftTemplateBuilder_.dispose();
        shiftTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftTemplateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shiftTemplate_ = shiftTemplateBuilder_ == null
            ? shiftTemplate_
            : shiftTemplateBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq.getDefaultInstance()) return this;
      if (other.hasShiftTemplate()) {
        mergeShiftTemplate(other.getShiftTemplate());
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
                  getShiftTemplateFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate shiftTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder> shiftTemplateBuilder_;
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     * @return Whether the shiftTemplate field is set.
     */
    public boolean hasShiftTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     * @return The shiftTemplate.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate getShiftTemplate() {
      if (shiftTemplateBuilder_ == null) {
        return shiftTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.getDefaultInstance() : shiftTemplate_;
      } else {
        return shiftTemplateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     */
    public Builder setShiftTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate value) {
      if (shiftTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shiftTemplate_ = value;
      } else {
        shiftTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     */
    public Builder setShiftTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder builderForValue) {
      if (shiftTemplateBuilder_ == null) {
        shiftTemplate_ = builderForValue.build();
      } else {
        shiftTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     */
    public Builder mergeShiftTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate value) {
      if (shiftTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          shiftTemplate_ != null &&
          shiftTemplate_ != com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.getDefaultInstance()) {
          getShiftTemplateBuilder().mergeFrom(value);
        } else {
          shiftTemplate_ = value;
        }
      } else {
        shiftTemplateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     */
    public Builder clearShiftTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shiftTemplate_ = null;
      if (shiftTemplateBuilder_ != null) {
        shiftTemplateBuilder_.dispose();
        shiftTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder getShiftTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getShiftTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder getShiftTemplateOrBuilder() {
      if (shiftTemplateBuilder_ != null) {
        return shiftTemplateBuilder_.getMessageOrBuilder();
      } else {
        return shiftTemplate_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.getDefaultInstance() : shiftTemplate_;
      }
    }
    /**
     * <pre>
     * Shift template to create, the &#64;shift_template_sid doesn't need to be set since it won't be used
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftTemplate shift_template = 1 [json_name = "shiftTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder> 
        getShiftTemplateFieldBuilder() {
      if (shiftTemplateBuilder_ == null) {
        shiftTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftTemplateOrBuilder>(
                getShiftTemplate(),
                getParentForChildren(),
                isClean());
        shiftTemplate_ = null;
      }
      return shiftTemplateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateShiftTemplateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateShiftTemplateReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateShiftTemplateReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateShiftTemplateReq>() {
    @java.lang.Override
    public CreateShiftTemplateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateShiftTemplateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateShiftTemplateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftTemplateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

