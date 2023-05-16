// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.GetTempUserTokenRes}
 */
public final class GetTempUserTokenRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.GetTempUserTokenRes)
    GetTempUserTokenResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTempUserTokenRes.newBuilder() to construct.
  private GetTempUserTokenRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTempUserTokenRes() {
    regionId_ = "";
    token_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetTempUserTokenRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetTempUserTokenRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetTempUserTokenRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes.Builder.class);
  }

  public static final int REGION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object regionId_ = "";
  /**
   * <code>string region_id = 1 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  @java.lang.Override
  public java.lang.String getRegionId() {
    java.lang.Object ref = regionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      regionId_ = s;
      return s;
    }
  }
  /**
   * <code>string region_id = 1 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionIdBytes() {
    java.lang.Object ref = regionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      regionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object token_ = "";
  /**
   * <pre>
   * Temporary token generated for user
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The token.
   */
  @java.lang.Override
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Temporary token generated for user
   * </pre>
   *
   * <code>string token = 2 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, regionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, token_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, regionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, token_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes) obj;

    if (!getRegionId()
        .equals(other.getRegionId())) return false;
    if (!getToken()
        .equals(other.getToken())) return false;
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
    hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRegionId().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.GetTempUserTokenRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.GetTempUserTokenRes)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetTempUserTokenRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetTempUserTokenRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes.newBuilder()
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
      regionId_ = "";
      token_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetTempUserTokenRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.regionId_ = regionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.token_ = token_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes.getDefaultInstance()) return this;
      if (!other.getRegionId().isEmpty()) {
        regionId_ = other.regionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
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
            case 10: {
              regionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              token_ = input.readStringRequireUtf8();
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

    private java.lang.Object regionId_ = "";
    /**
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @return The regionId.
     */
    public java.lang.String getRegionId() {
      java.lang.Object ref = regionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @return The bytes for regionId.
     */
    public com.google.protobuf.ByteString
        getRegionIdBytes() {
      java.lang.Object ref = regionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        regionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @param value The regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      regionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionId() {
      regionId_ = getDefaultInstance().getRegionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @param value The bytes for regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      regionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <pre>
     * Temporary token generated for user
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return The token.
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Temporary token generated for user
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return The bytes for token.
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Temporary token generated for user
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      token_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Temporary token generated for user
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      token_ = getDefaultInstance().getToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Temporary token generated for user
     * </pre>
     *
     * <code>string token = 2 [json_name = "token"];</code>
     * @param value The bytes for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      token_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.GetTempUserTokenRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.GetTempUserTokenRes)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetTempUserTokenRes>
      PARSER = new com.google.protobuf.AbstractParser<GetTempUserTokenRes>() {
    @java.lang.Override
    public GetTempUserTokenRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetTempUserTokenRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTempUserTokenRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetTempUserTokenRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

