// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateInboundEmailTemplateReq}
 */
public final class UpdateInboundEmailTemplateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateInboundEmailTemplateReq)
    UpdateInboundEmailTemplateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateInboundEmailTemplateReq.newBuilder() to construct.
  private UpdateInboundEmailTemplateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateInboundEmailTemplateReq() {
    inboundEmailTemplateId_ = "";
    connectedInboxId_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateInboundEmailTemplateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateInboundEmailTemplateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateInboundEmailTemplateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.class, com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.Builder.class);
  }

  public static final int INBOUND_EMAIL_TEMPLATE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object inboundEmailTemplateId_ = "";
  /**
   * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
   * @return The inboundEmailTemplateId.
   */
  @java.lang.Override
  public java.lang.String getInboundEmailTemplateId() {
    java.lang.Object ref = inboundEmailTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inboundEmailTemplateId_ = s;
      return s;
    }
  }
  /**
   * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
   * @return The bytes for inboundEmailTemplateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInboundEmailTemplateIdBytes() {
    java.lang.Object ref = inboundEmailTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inboundEmailTemplateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONNECTED_INBOX_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object connectedInboxId_ = "";
  /**
   * <code>string connected_inbox_id = 2 [json_name = "connectedInboxId"];</code>
   * @return The connectedInboxId.
   */
  @java.lang.Override
  public java.lang.String getConnectedInboxId() {
    java.lang.Object ref = connectedInboxId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      connectedInboxId_ = s;
      return s;
    }
  }
  /**
   * <code>string connected_inbox_id = 2 [json_name = "connectedInboxId"];</code>
   * @return The bytes for connectedInboxId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConnectedInboxIdBytes() {
    java.lang.Object ref = connectedInboxId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      connectedInboxId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKILLS_FIELD_NUMBER = 7;
  private com.tcn.cloud.api.api.v0alpha.EmailConversationSkills skills_;
  /**
   * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
   * @return Whether the skills field is set.
   */
  @java.lang.Override
  public boolean hasSkills() {
    return skills_ != null;
  }
  /**
   * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
   * @return The skills.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.EmailConversationSkills getSkills() {
    return skills_ == null ? com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.getDefaultInstance() : skills_;
  }
  /**
   * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.EmailConversationSkillsOrBuilder getSkillsOrBuilder() {
    return skills_ == null ? com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.getDefaultInstance() : skills_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboundEmailTemplateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inboundEmailTemplateId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectedInboxId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, connectedInboxId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
    }
    if (skills_ != null) {
      output.writeMessage(7, getSkills());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inboundEmailTemplateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inboundEmailTemplateId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(connectedInboxId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, connectedInboxId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
    }
    if (skills_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getSkills());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq other = (com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq) obj;

    if (!getInboundEmailTemplateId()
        .equals(other.getInboundEmailTemplateId())) return false;
    if (!getConnectedInboxId()
        .equals(other.getConnectedInboxId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasSkills() != other.hasSkills()) return false;
    if (hasSkills()) {
      if (!getSkills()
          .equals(other.getSkills())) return false;
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
    hash = (37 * hash) + INBOUND_EMAIL_TEMPLATE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInboundEmailTemplateId().hashCode();
    hash = (37 * hash) + CONNECTED_INBOX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConnectedInboxId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasSkills()) {
      hash = (37 * hash) + SKILLS_FIELD_NUMBER;
      hash = (53 * hash) + getSkills().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateInboundEmailTemplateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateInboundEmailTemplateReq)
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateInboundEmailTemplateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateInboundEmailTemplateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.class, com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.newBuilder()
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
      inboundEmailTemplateId_ = "";
      connectedInboxId_ = "";
      name_ = "";
      skills_ = null;
      if (skillsBuilder_ != null) {
        skillsBuilder_.dispose();
        skillsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_UpdateInboundEmailTemplateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq result = new com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inboundEmailTemplateId_ = inboundEmailTemplateId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.connectedInboxId_ = connectedInboxId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.skills_ = skillsBuilder_ == null
            ? skills_
            : skillsBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq.getDefaultInstance()) return this;
      if (!other.getInboundEmailTemplateId().isEmpty()) {
        inboundEmailTemplateId_ = other.inboundEmailTemplateId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getConnectedInboxId().isEmpty()) {
        connectedInboxId_ = other.connectedInboxId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasSkills()) {
        mergeSkills(other.getSkills());
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
              inboundEmailTemplateId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              connectedInboxId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 42: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 42
            case 58: {
              input.readMessage(
                  getSkillsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 58
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

    private java.lang.Object inboundEmailTemplateId_ = "";
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @return The inboundEmailTemplateId.
     */
    public java.lang.String getInboundEmailTemplateId() {
      java.lang.Object ref = inboundEmailTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inboundEmailTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @return The bytes for inboundEmailTemplateId.
     */
    public com.google.protobuf.ByteString
        getInboundEmailTemplateIdBytes() {
      java.lang.Object ref = inboundEmailTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inboundEmailTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @param value The inboundEmailTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setInboundEmailTemplateId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      inboundEmailTemplateId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInboundEmailTemplateId() {
      inboundEmailTemplateId_ = getDefaultInstance().getInboundEmailTemplateId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string inbound_email_template_id = 1 [json_name = "inboundEmailTemplateId"];</code>
     * @param value The bytes for inboundEmailTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setInboundEmailTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      inboundEmailTemplateId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object connectedInboxId_ = "";
    /**
     * <code>string connected_inbox_id = 2 [json_name = "connectedInboxId"];</code>
     * @return The connectedInboxId.
     */
    public java.lang.String getConnectedInboxId() {
      java.lang.Object ref = connectedInboxId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        connectedInboxId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string connected_inbox_id = 2 [json_name = "connectedInboxId"];</code>
     * @return The bytes for connectedInboxId.
     */
    public com.google.protobuf.ByteString
        getConnectedInboxIdBytes() {
      java.lang.Object ref = connectedInboxId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        connectedInboxId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string connected_inbox_id = 2 [json_name = "connectedInboxId"];</code>
     * @param value The connectedInboxId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectedInboxId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      connectedInboxId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string connected_inbox_id = 2 [json_name = "connectedInboxId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConnectedInboxId() {
      connectedInboxId_ = getDefaultInstance().getConnectedInboxId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string connected_inbox_id = 2 [json_name = "connectedInboxId"];</code>
     * @param value The bytes for connectedInboxId to set.
     * @return This builder for chaining.
     */
    public Builder setConnectedInboxIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      connectedInboxId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.EmailConversationSkills skills_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.EmailConversationSkills, com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.Builder, com.tcn.cloud.api.api.v0alpha.EmailConversationSkillsOrBuilder> skillsBuilder_;
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     * @return Whether the skills field is set.
     */
    public boolean hasSkills() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     * @return The skills.
     */
    public com.tcn.cloud.api.api.v0alpha.EmailConversationSkills getSkills() {
      if (skillsBuilder_ == null) {
        return skills_ == null ? com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.getDefaultInstance() : skills_;
      } else {
        return skillsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     */
    public Builder setSkills(com.tcn.cloud.api.api.v0alpha.EmailConversationSkills value) {
      if (skillsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        skills_ = value;
      } else {
        skillsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     */
    public Builder setSkills(
        com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.Builder builderForValue) {
      if (skillsBuilder_ == null) {
        skills_ = builderForValue.build();
      } else {
        skillsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     */
    public Builder mergeSkills(com.tcn.cloud.api.api.v0alpha.EmailConversationSkills value) {
      if (skillsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          skills_ != null &&
          skills_ != com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.getDefaultInstance()) {
          getSkillsBuilder().mergeFrom(value);
        } else {
          skills_ = value;
        }
      } else {
        skillsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     */
    public Builder clearSkills() {
      bitField0_ = (bitField0_ & ~0x00000008);
      skills_ = null;
      if (skillsBuilder_ != null) {
        skillsBuilder_.dispose();
        skillsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.Builder getSkillsBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getSkillsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.EmailConversationSkillsOrBuilder getSkillsOrBuilder() {
      if (skillsBuilder_ != null) {
        return skillsBuilder_.getMessageOrBuilder();
      } else {
        return skills_ == null ?
            com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.getDefaultInstance() : skills_;
      }
    }
    /**
     * <code>.api.v0alpha.EmailConversationSkills skills = 7 [json_name = "skills"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.EmailConversationSkills, com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.Builder, com.tcn.cloud.api.api.v0alpha.EmailConversationSkillsOrBuilder> 
        getSkillsFieldBuilder() {
      if (skillsBuilder_ == null) {
        skillsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.EmailConversationSkills, com.tcn.cloud.api.api.v0alpha.EmailConversationSkills.Builder, com.tcn.cloud.api.api.v0alpha.EmailConversationSkillsOrBuilder>(
                getSkills(),
                getParentForChildren(),
                isClean());
        skills_ = null;
      }
      return skillsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateInboundEmailTemplateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateInboundEmailTemplateReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateInboundEmailTemplateReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateInboundEmailTemplateReq>() {
    @java.lang.Override
    public UpdateInboundEmailTemplateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateInboundEmailTemplateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateInboundEmailTemplateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateInboundEmailTemplateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

