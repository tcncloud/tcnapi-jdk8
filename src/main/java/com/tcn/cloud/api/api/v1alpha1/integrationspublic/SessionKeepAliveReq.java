// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrationspublic/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

/**
 * Protobuf type {@code api.v1alpha1.integrationspublic.SessionKeepAliveReq}
 */
public final class SessionKeepAliveReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrationspublic.SessionKeepAliveReq)
    SessionKeepAliveReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SessionKeepAliveReq.newBuilder() to construct.
  private SessionKeepAliveReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SessionKeepAliveReq() {
    sessionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SessionKeepAliveReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SessionKeepAliveReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SessionKeepAliveReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.class, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.Builder.class);
  }

  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId entity_;
  /**
   * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId getEntity() {
    return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.getDefaultInstance() : entity_;
  }
  /**
   * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkIdOrBuilder getEntityOrBuilder() {
    return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.getDefaultInstance() : entity_;
  }

  public static final int SESSION_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sessionId_ = "";
  /**
   * <code>string session_id = 2 [json_name = "sessionId"];</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string session_id = 2 [json_name = "sessionId"];</code>
   * @return The bytes for sessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
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
    if (entity_ != null) {
      output.writeMessage(1, getEntity());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sessionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntity());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sessionId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq other = (com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
    }
    if (!getSessionId()
        .equals(other.getSessionId())) return false;
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
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (37 * hash) + SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrationspublic.SessionKeepAliveReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrationspublic.SessionKeepAliveReq)
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SessionKeepAliveReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SessionKeepAliveReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.class, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.newBuilder()
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
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      sessionId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SessionKeepAliveReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq build() {
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq result = new com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionId_ = sessionId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq.getDefaultInstance()) return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
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
              input.readMessage(
                  getEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              sessionId_ = input.readStringRequireUtf8();
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

    private com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId entity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId, com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.Builder, com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkIdOrBuilder> entityBuilder_;
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     * @return The entity.
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     */
    public Builder setEntity(com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
      } else {
        entityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     */
    public Builder setEntity(
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     */
    public Builder mergeEntity(com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          entity_ != null &&
          entity_ != com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.getDefaultInstance()) {
          getEntityBuilder().mergeFrom(value);
        } else {
          entity_ = value;
        }
      } else {
        entityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     */
    public Builder clearEntity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.Builder getEntityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkIdOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ?
            com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.getDefaultInstance() : entity_;
      }
    }
    /**
     * <code>.api.v1alpha1.integrationspublic.PortalLinkId entity = 1 [json_name = "entity"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId, com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.Builder, com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkIdOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId, com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkId.Builder, com.tcn.cloud.api.api.v1alpha1.integrationspublic.PortalLinkIdOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @return The sessionId.
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @return The bytes for sessionId.
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sessionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      sessionId_ = getDefaultInstance().getSessionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string session_id = 2 [json_name = "sessionId"];</code>
     * @param value The bytes for sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sessionId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrationspublic.SessionKeepAliveReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrationspublic.SessionKeepAliveReq)
  private static final com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SessionKeepAliveReq>
      PARSER = new com.google.protobuf.AbstractParser<SessionKeepAliveReq>() {
    @java.lang.Override
    public SessionKeepAliveReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<SessionKeepAliveReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SessionKeepAliveReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SessionKeepAliveReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

