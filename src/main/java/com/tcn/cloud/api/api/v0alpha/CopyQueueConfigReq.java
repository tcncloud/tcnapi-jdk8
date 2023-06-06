// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CopyQueueConfigReq}
 */
public final class CopyQueueConfigReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CopyQueueConfigReq)
    CopyQueueConfigReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CopyQueueConfigReq.newBuilder() to construct.
  private CopyQueueConfigReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CopyQueueConfigReq() {
    fromOrgId_ = "";
    toOrgId_ = "";
    fromName_ = "";
    toName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CopyQueueConfigReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CopyQueueConfigReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CopyQueueConfigReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.class, com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.Builder.class);
  }

  public static final int FROM_ORG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fromOrgId_ = "";
  /**
   * <code>string from_org_id = 1 [json_name = "fromOrgId"];</code>
   * @return The fromOrgId.
   */
  @java.lang.Override
  public java.lang.String getFromOrgId() {
    java.lang.Object ref = fromOrgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromOrgId_ = s;
      return s;
    }
  }
  /**
   * <code>string from_org_id = 1 [json_name = "fromOrgId"];</code>
   * @return The bytes for fromOrgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromOrgIdBytes() {
    java.lang.Object ref = fromOrgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromOrgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_ORG_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toOrgId_ = "";
  /**
   * <code>string to_org_id = 2 [json_name = "toOrgId"];</code>
   * @return The toOrgId.
   */
  @java.lang.Override
  public java.lang.String getToOrgId() {
    java.lang.Object ref = toOrgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toOrgId_ = s;
      return s;
    }
  }
  /**
   * <code>string to_org_id = 2 [json_name = "toOrgId"];</code>
   * @return The bytes for toOrgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToOrgIdBytes() {
    java.lang.Object ref = toOrgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toOrgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fromName_ = "";
  /**
   * <pre>
   * from_name is the name of the config that will be copied
   * from the given from_org_id.
   * </pre>
   *
   * <code>string from_name = 3 [json_name = "fromName"];</code>
   * @return The fromName.
   */
  @java.lang.Override
  public java.lang.String getFromName() {
    java.lang.Object ref = fromName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fromName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * from_name is the name of the config that will be copied
   * from the given from_org_id.
   * </pre>
   *
   * <code>string from_name = 3 [json_name = "fromName"];</code>
   * @return The bytes for fromName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromNameBytes() {
    java.lang.Object ref = fromName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fromName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_NAME_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toName_ = "";
  /**
   * <pre>
   * to_name is the name that the copied config will have for
   * the given to_org_id.
   * </pre>
   *
   * <code>string to_name = 4 [json_name = "toName"];</code>
   * @return The toName.
   */
  @java.lang.Override
  public java.lang.String getToName() {
    java.lang.Object ref = toName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * to_name is the name that the copied config will have for
   * the given to_org_id.
   * </pre>
   *
   * <code>string to_name = 4 [json_name = "toName"];</code>
   * @return The bytes for toName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToNameBytes() {
    java.lang.Object ref = toName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromOrgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fromOrgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toOrgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, toOrgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fromName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, toName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromOrgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fromOrgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toOrgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, toOrgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fromName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fromName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(toName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, toName_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq other = (com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq) obj;

    if (!getFromOrgId()
        .equals(other.getFromOrgId())) return false;
    if (!getToOrgId()
        .equals(other.getToOrgId())) return false;
    if (!getFromName()
        .equals(other.getFromName())) return false;
    if (!getToName()
        .equals(other.getToName())) return false;
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
    hash = (37 * hash) + FROM_ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFromOrgId().hashCode();
    hash = (37 * hash) + TO_ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getToOrgId().hashCode();
    hash = (37 * hash) + FROM_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFromName().hashCode();
    hash = (37 * hash) + TO_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getToName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CopyQueueConfigReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CopyQueueConfigReq)
      com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CopyQueueConfigReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CopyQueueConfigReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.class, com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.newBuilder()
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
      fromOrgId_ = "";
      toOrgId_ = "";
      fromName_ = "";
      toName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CopyQueueConfigReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq build() {
      com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq result = new com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fromOrgId_ = fromOrgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.toOrgId_ = toOrgId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fromName_ = fromName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.toName_ = toName_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq.getDefaultInstance()) return this;
      if (!other.getFromOrgId().isEmpty()) {
        fromOrgId_ = other.fromOrgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getToOrgId().isEmpty()) {
        toOrgId_ = other.toOrgId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFromName().isEmpty()) {
        fromName_ = other.fromName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getToName().isEmpty()) {
        toName_ = other.toName_;
        bitField0_ |= 0x00000008;
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
              fromOrgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              toOrgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              fromName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              toName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object fromOrgId_ = "";
    /**
     * <code>string from_org_id = 1 [json_name = "fromOrgId"];</code>
     * @return The fromOrgId.
     */
    public java.lang.String getFromOrgId() {
      java.lang.Object ref = fromOrgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromOrgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from_org_id = 1 [json_name = "fromOrgId"];</code>
     * @return The bytes for fromOrgId.
     */
    public com.google.protobuf.ByteString
        getFromOrgIdBytes() {
      java.lang.Object ref = fromOrgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromOrgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from_org_id = 1 [json_name = "fromOrgId"];</code>
     * @param value The fromOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setFromOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fromOrgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string from_org_id = 1 [json_name = "fromOrgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFromOrgId() {
      fromOrgId_ = getDefaultInstance().getFromOrgId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string from_org_id = 1 [json_name = "fromOrgId"];</code>
     * @param value The bytes for fromOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setFromOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fromOrgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object toOrgId_ = "";
    /**
     * <code>string to_org_id = 2 [json_name = "toOrgId"];</code>
     * @return The toOrgId.
     */
    public java.lang.String getToOrgId() {
      java.lang.Object ref = toOrgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toOrgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to_org_id = 2 [json_name = "toOrgId"];</code>
     * @return The bytes for toOrgId.
     */
    public com.google.protobuf.ByteString
        getToOrgIdBytes() {
      java.lang.Object ref = toOrgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toOrgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to_org_id = 2 [json_name = "toOrgId"];</code>
     * @param value The toOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setToOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toOrgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string to_org_id = 2 [json_name = "toOrgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToOrgId() {
      toOrgId_ = getDefaultInstance().getToOrgId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string to_org_id = 2 [json_name = "toOrgId"];</code>
     * @param value The bytes for toOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setToOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toOrgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object fromName_ = "";
    /**
     * <pre>
     * from_name is the name of the config that will be copied
     * from the given from_org_id.
     * </pre>
     *
     * <code>string from_name = 3 [json_name = "fromName"];</code>
     * @return The fromName.
     */
    public java.lang.String getFromName() {
      java.lang.Object ref = fromName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fromName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * from_name is the name of the config that will be copied
     * from the given from_org_id.
     * </pre>
     *
     * <code>string from_name = 3 [json_name = "fromName"];</code>
     * @return The bytes for fromName.
     */
    public com.google.protobuf.ByteString
        getFromNameBytes() {
      java.lang.Object ref = fromName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fromName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * from_name is the name of the config that will be copied
     * from the given from_org_id.
     * </pre>
     *
     * <code>string from_name = 3 [json_name = "fromName"];</code>
     * @param value The fromName to set.
     * @return This builder for chaining.
     */
    public Builder setFromName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fromName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from_name is the name of the config that will be copied
     * from the given from_org_id.
     * </pre>
     *
     * <code>string from_name = 3 [json_name = "fromName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFromName() {
      fromName_ = getDefaultInstance().getFromName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from_name is the name of the config that will be copied
     * from the given from_org_id.
     * </pre>
     *
     * <code>string from_name = 3 [json_name = "fromName"];</code>
     * @param value The bytes for fromName to set.
     * @return This builder for chaining.
     */
    public Builder setFromNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fromName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object toName_ = "";
    /**
     * <pre>
     * to_name is the name that the copied config will have for
     * the given to_org_id.
     * </pre>
     *
     * <code>string to_name = 4 [json_name = "toName"];</code>
     * @return The toName.
     */
    public java.lang.String getToName() {
      java.lang.Object ref = toName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * to_name is the name that the copied config will have for
     * the given to_org_id.
     * </pre>
     *
     * <code>string to_name = 4 [json_name = "toName"];</code>
     * @return The bytes for toName.
     */
    public com.google.protobuf.ByteString
        getToNameBytes() {
      java.lang.Object ref = toName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * to_name is the name that the copied config will have for
     * the given to_org_id.
     * </pre>
     *
     * <code>string to_name = 4 [json_name = "toName"];</code>
     * @param value The toName to set.
     * @return This builder for chaining.
     */
    public Builder setToName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toName_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * to_name is the name that the copied config will have for
     * the given to_org_id.
     * </pre>
     *
     * <code>string to_name = 4 [json_name = "toName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToName() {
      toName_ = getDefaultInstance().getToName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * to_name is the name that the copied config will have for
     * the given to_org_id.
     * </pre>
     *
     * <code>string to_name = 4 [json_name = "toName"];</code>
     * @param value The bytes for toName to set.
     * @return This builder for chaining.
     */
    public Builder setToNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toName_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CopyQueueConfigReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CopyQueueConfigReq)
  private static final com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CopyQueueConfigReq>
      PARSER = new com.google.protobuf.AbstractParser<CopyQueueConfigReq>() {
    @java.lang.Override
    public CopyQueueConfigReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CopyQueueConfigReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CopyQueueConfigReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CopyQueueConfigReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

