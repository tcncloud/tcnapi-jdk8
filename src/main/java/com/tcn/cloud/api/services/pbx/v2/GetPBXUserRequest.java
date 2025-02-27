// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

/**
 * <pre>
 * DEPRECATED: This message is deprecated and may be removed in future versions. (No longer need PBX Users)
 * </pre>
 *
 * Protobuf type {@code services.pbx.v2.GetPBXUserRequest}
 */
public final class GetPBXUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.pbx.v2.GetPBXUserRequest)
    GetPBXUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPBXUserRequest.newBuilder() to construct.
  private GetPBXUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPBXUserRequest() {
    pbxUserId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPBXUserRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_GetPBXUserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_GetPBXUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.class, com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.Builder.class);
  }

  public static final int PBX_USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pbxUserId_ = "";
  /**
   * <pre>
   * Required: To fetch a specific user by ID.
   * </pre>
   *
   * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
   * @return The pbxUserId.
   */
  @java.lang.Override
  public java.lang.String getPbxUserId() {
    java.lang.Object ref = pbxUserId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pbxUserId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required: To fetch a specific user by ID.
   * </pre>
   *
   * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
   * @return The bytes for pbxUserId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPbxUserIdBytes() {
    java.lang.Object ref = pbxUserId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pbxUserId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pbxUserId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pbxUserId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pbxUserId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pbxUserId_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest other = (com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest) obj;

    if (!getPbxUserId()
        .equals(other.getPbxUserId())) return false;
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
    hash = (37 * hash) + PBX_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPbxUserId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest prototype) {
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
   * DEPRECATED: This message is deprecated and may be removed in future versions. (No longer need PBX Users)
   * </pre>
   *
   * Protobuf type {@code services.pbx.v2.GetPBXUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.pbx.v2.GetPBXUserRequest)
      com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_GetPBXUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_GetPBXUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.class, com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.newBuilder()
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
      pbxUserId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_GetPBXUserRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest build() {
      com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest buildPartial() {
      com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest result = new com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pbxUserId_ = pbxUserId_;
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
      if (other instanceof com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest) {
        return mergeFrom((com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest other) {
      if (other == com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest.getDefaultInstance()) return this;
      if (!other.getPbxUserId().isEmpty()) {
        pbxUserId_ = other.pbxUserId_;
        bitField0_ |= 0x00000001;
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
              pbxUserId_ = input.readStringRequireUtf8();
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

    private java.lang.Object pbxUserId_ = "";
    /**
     * <pre>
     * Required: To fetch a specific user by ID.
     * </pre>
     *
     * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
     * @return The pbxUserId.
     */
    public java.lang.String getPbxUserId() {
      java.lang.Object ref = pbxUserId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pbxUserId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required: To fetch a specific user by ID.
     * </pre>
     *
     * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
     * @return The bytes for pbxUserId.
     */
    public com.google.protobuf.ByteString
        getPbxUserIdBytes() {
      java.lang.Object ref = pbxUserId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pbxUserId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required: To fetch a specific user by ID.
     * </pre>
     *
     * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
     * @param value The pbxUserId to set.
     * @return This builder for chaining.
     */
    public Builder setPbxUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pbxUserId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required: To fetch a specific user by ID.
     * </pre>
     *
     * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPbxUserId() {
      pbxUserId_ = getDefaultInstance().getPbxUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required: To fetch a specific user by ID.
     * </pre>
     *
     * <code>string pbx_user_id = 1 [json_name = "pbxUserId"];</code>
     * @param value The bytes for pbxUserId to set.
     * @return This builder for chaining.
     */
    public Builder setPbxUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pbxUserId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:services.pbx.v2.GetPBXUserRequest)
  }

  // @@protoc_insertion_point(class_scope:services.pbx.v2.GetPBXUserRequest)
  private static final com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest();
  }

  public static com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPBXUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPBXUserRequest>() {
    @java.lang.Override
    public GetPBXUserRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPBXUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPBXUserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v2.GetPBXUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

