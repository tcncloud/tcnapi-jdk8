// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * The request for org.Org.RemovePermissionFromOrgDefaultGroup
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest}
 */
public final class RemovePermissionFromOrgDefaultGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest)
    RemovePermissionFromOrgDefaultGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemovePermissionFromOrgDefaultGroupRequest.newBuilder() to construct.
  private RemovePermissionFromOrgDefaultGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemovePermissionFromOrgDefaultGroupRequest() {
    orgId_ = "";
    permission_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemovePermissionFromOrgDefaultGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RemovePermissionFromOrgDefaultGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RemovePermissionFromOrgDefaultGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.class, com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.Builder.class);
  }

  public static final int ORG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * id for which organization to remove permission from default Super group.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  @java.lang.Override
  public java.lang.String getOrgId() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * id for which organization to remove permission from default Super group.
   * </pre>
   *
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrgIdBytes() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSION_FIELD_NUMBER = 2;
  private int permission_ = 0;
  /**
   * <pre>
   * Permission to be removed.
   * </pre>
   *
   * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
   * @return The enum numeric value on the wire for permission.
   */
  @java.lang.Override public int getPermissionValue() {
    return permission_;
  }
  /**
   * <pre>
   * Permission to be removed.
   * </pre>
   *
   * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
   * @return The permission.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.auth.Permission getPermission() {
    com.tcn.cloud.api.api.commons.auth.Permission result = com.tcn.cloud.api.api.commons.auth.Permission.forNumber(permission_);
    return result == null ? com.tcn.cloud.api.api.commons.auth.Permission.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orgId_);
    }
    if (permission_ != com.tcn.cloud.api.api.commons.auth.Permission.PERMISSION_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, permission_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orgId_);
    }
    if (permission_ != com.tcn.cloud.api.api.commons.auth.Permission.PERMISSION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, permission_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest other = (com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (permission_ != other.permission_) return false;
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
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (37 * hash) + PERMISSION_FIELD_NUMBER;
    hash = (53 * hash) + permission_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest prototype) {
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
   * The request for org.Org.RemovePermissionFromOrgDefaultGroup
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest)
      com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RemovePermissionFromOrgDefaultGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RemovePermissionFromOrgDefaultGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.class, com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.newBuilder()
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
      orgId_ = "";
      permission_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_RemovePermissionFromOrgDefaultGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest build() {
      com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest result = new com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.permission_ = permission_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.permission_ != 0) {
        setPermissionValue(other.getPermissionValue());
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
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              permission_ = input.readEnum();
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

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * id for which organization to remove permission from default Super group.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @return The orgId.
     */
    public java.lang.String getOrgId() {
      java.lang.Object ref = orgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * id for which organization to remove permission from default Super group.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @return The bytes for orgId.
     */
    public com.google.protobuf.ByteString
        getOrgIdBytes() {
      java.lang.Object ref = orgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * id for which organization to remove permission from default Super group.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id for which organization to remove permission from default Super group.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id for which organization to remove permission from default Super group.
     * </pre>
     *
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int permission_ = 0;
    /**
     * <pre>
     * Permission to be removed.
     * </pre>
     *
     * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
     * @return The enum numeric value on the wire for permission.
     */
    @java.lang.Override public int getPermissionValue() {
      return permission_;
    }
    /**
     * <pre>
     * Permission to be removed.
     * </pre>
     *
     * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
     * @param value The enum numeric value on the wire for permission to set.
     * @return This builder for chaining.
     */
    public Builder setPermissionValue(int value) {
      permission_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Permission to be removed.
     * </pre>
     *
     * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
     * @return The permission.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.auth.Permission getPermission() {
      com.tcn.cloud.api.api.commons.auth.Permission result = com.tcn.cloud.api.api.commons.auth.Permission.forNumber(permission_);
      return result == null ? com.tcn.cloud.api.api.commons.auth.Permission.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Permission to be removed.
     * </pre>
     *
     * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
     * @param value The permission to set.
     * @return This builder for chaining.
     */
    public Builder setPermission(com.tcn.cloud.api.api.commons.auth.Permission value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      permission_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Permission to be removed.
     * </pre>
     *
     * <code>.api.commons.auth.Permission permission = 2 [json_name = "permission"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPermission() {
      bitField0_ = (bitField0_ & ~0x00000002);
      permission_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest)
  private static final com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemovePermissionFromOrgDefaultGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemovePermissionFromOrgDefaultGroupRequest>() {
    @java.lang.Override
    public RemovePermissionFromOrgDefaultGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemovePermissionFromOrgDefaultGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemovePermissionFromOrgDefaultGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RemovePermissionFromOrgDefaultGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

