// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SetAnaAccountRelationReq}
 */
public final class SetAnaAccountRelationReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SetAnaAccountRelationReq)
    SetAnaAccountRelationReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetAnaAccountRelationReq.newBuilder() to construct.
  private SetAnaAccountRelationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetAnaAccountRelationReq() {
    parentOrgId_ = "";
    childOrgId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetAnaAccountRelationReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetAnaAccountRelationReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetAnaAccountRelationReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.class, com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.Builder.class);
  }

  public static final int PARENT_ORG_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parentOrgId_ = "";
  /**
   * <pre>
   * Parent account to adopt child
   * </pre>
   *
   * <code>string parent_org_id = 4 [json_name = "parentOrgId"];</code>
   * @return The parentOrgId.
   */
  @java.lang.Override
  public java.lang.String getParentOrgId() {
    java.lang.Object ref = parentOrgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parentOrgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Parent account to adopt child
   * </pre>
   *
   * <code>string parent_org_id = 4 [json_name = "parentOrgId"];</code>
   * @return The bytes for parentOrgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentOrgIdBytes() {
    java.lang.Object ref = parentOrgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parentOrgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHILD_ORG_ID_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object childOrgId_ = "";
  /**
   * <pre>
   * Child account to be adopted
   * </pre>
   *
   * <code>string child_org_id = 5 [json_name = "childOrgId"];</code>
   * @return The childOrgId.
   */
  @java.lang.Override
  public java.lang.String getChildOrgId() {
    java.lang.Object ref = childOrgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      childOrgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Child account to be adopted
   * </pre>
   *
   * <code>string child_org_id = 5 [json_name = "childOrgId"];</code>
   * @return The bytes for childOrgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChildOrgIdBytes() {
    java.lang.Object ref = childOrgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      childOrgId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parentOrgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parentOrgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(childOrgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, childOrgId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parentOrgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parentOrgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(childOrgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, childOrgId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq other = (com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq) obj;

    if (!getParentOrgId()
        .equals(other.getParentOrgId())) return false;
    if (!getChildOrgId()
        .equals(other.getChildOrgId())) return false;
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
    hash = (37 * hash) + PARENT_ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getParentOrgId().hashCode();
    hash = (37 * hash) + CHILD_ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChildOrgId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq prototype) {
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
   * Protobuf type {@code api.v0alpha.SetAnaAccountRelationReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SetAnaAccountRelationReq)
      com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetAnaAccountRelationReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetAnaAccountRelationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.class, com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.newBuilder()
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
      parentOrgId_ = "";
      childOrgId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_SetAnaAccountRelationReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq build() {
      com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq result = new com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parentOrgId_ = parentOrgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.childOrgId_ = childOrgId_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq.getDefaultInstance()) return this;
      if (!other.getParentOrgId().isEmpty()) {
        parentOrgId_ = other.parentOrgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getChildOrgId().isEmpty()) {
        childOrgId_ = other.childOrgId_;
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
            case 34: {
              parentOrgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 34
            case 42: {
              childOrgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
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

    private java.lang.Object parentOrgId_ = "";
    /**
     * <pre>
     * Parent account to adopt child
     * </pre>
     *
     * <code>string parent_org_id = 4 [json_name = "parentOrgId"];</code>
     * @return The parentOrgId.
     */
    public java.lang.String getParentOrgId() {
      java.lang.Object ref = parentOrgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parentOrgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Parent account to adopt child
     * </pre>
     *
     * <code>string parent_org_id = 4 [json_name = "parentOrgId"];</code>
     * @return The bytes for parentOrgId.
     */
    public com.google.protobuf.ByteString
        getParentOrgIdBytes() {
      java.lang.Object ref = parentOrgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parentOrgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Parent account to adopt child
     * </pre>
     *
     * <code>string parent_org_id = 4 [json_name = "parentOrgId"];</code>
     * @param value The parentOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setParentOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parentOrgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parent account to adopt child
     * </pre>
     *
     * <code>string parent_org_id = 4 [json_name = "parentOrgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParentOrgId() {
      parentOrgId_ = getDefaultInstance().getParentOrgId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parent account to adopt child
     * </pre>
     *
     * <code>string parent_org_id = 4 [json_name = "parentOrgId"];</code>
     * @param value The bytes for parentOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setParentOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parentOrgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object childOrgId_ = "";
    /**
     * <pre>
     * Child account to be adopted
     * </pre>
     *
     * <code>string child_org_id = 5 [json_name = "childOrgId"];</code>
     * @return The childOrgId.
     */
    public java.lang.String getChildOrgId() {
      java.lang.Object ref = childOrgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        childOrgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Child account to be adopted
     * </pre>
     *
     * <code>string child_org_id = 5 [json_name = "childOrgId"];</code>
     * @return The bytes for childOrgId.
     */
    public com.google.protobuf.ByteString
        getChildOrgIdBytes() {
      java.lang.Object ref = childOrgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        childOrgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Child account to be adopted
     * </pre>
     *
     * <code>string child_org_id = 5 [json_name = "childOrgId"];</code>
     * @param value The childOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setChildOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      childOrgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Child account to be adopted
     * </pre>
     *
     * <code>string child_org_id = 5 [json_name = "childOrgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChildOrgId() {
      childOrgId_ = getDefaultInstance().getChildOrgId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Child account to be adopted
     * </pre>
     *
     * <code>string child_org_id = 5 [json_name = "childOrgId"];</code>
     * @param value The bytes for childOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setChildOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      childOrgId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SetAnaAccountRelationReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SetAnaAccountRelationReq)
  private static final com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetAnaAccountRelationReq>
      PARSER = new com.google.protobuf.AbstractParser<SetAnaAccountRelationReq>() {
    @java.lang.Override
    public SetAnaAccountRelationReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetAnaAccountRelationReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetAnaAccountRelationReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SetAnaAccountRelationReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

