// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/agent_profile_group.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * Protobuf type {@code api.v1alpha1.org.CreateAgentProfileGroupRequest}
 */
public final class CreateAgentProfileGroupRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.CreateAgentProfileGroupRequest)
    CreateAgentProfileGroupRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAgentProfileGroupRequest.newBuilder() to construct.
  private CreateAgentProfileGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAgentProfileGroupRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAgentProfileGroupRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.AgentProfileGroupProto.internal_static_api_v1alpha1_org_CreateAgentProfileGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.AgentProfileGroupProto.internal_static_api_v1alpha1_org_CreateAgentProfileGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.Builder.class);
  }

  public static final int AGENT_PROFILE_GROUP_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.org.AgentProfileGroup agentProfileGroup_;
  /**
   * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
   * @return Whether the agentProfileGroup field is set.
   */
  @java.lang.Override
  public boolean hasAgentProfileGroup() {
    return agentProfileGroup_ != null;
  }
  /**
   * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
   * @return The agentProfileGroup.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentProfileGroup getAgentProfileGroup() {
    return agentProfileGroup_ == null ? com.tcn.cloud.api.api.commons.org.AgentProfileGroup.getDefaultInstance() : agentProfileGroup_;
  }
  /**
   * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder getAgentProfileGroupOrBuilder() {
    return agentProfileGroup_ == null ? com.tcn.cloud.api.api.commons.org.AgentProfileGroup.getDefaultInstance() : agentProfileGroup_;
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
    if (agentProfileGroup_ != null) {
      output.writeMessage(2, getAgentProfileGroup());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentProfileGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAgentProfileGroup());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest other = (com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest) obj;

    if (hasAgentProfileGroup() != other.hasAgentProfileGroup()) return false;
    if (hasAgentProfileGroup()) {
      if (!getAgentProfileGroup()
          .equals(other.getAgentProfileGroup())) return false;
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
    if (hasAgentProfileGroup()) {
      hash = (37 * hash) + AGENT_PROFILE_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getAgentProfileGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.CreateAgentProfileGroupRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.CreateAgentProfileGroupRequest)
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.AgentProfileGroupProto.internal_static_api_v1alpha1_org_CreateAgentProfileGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.AgentProfileGroupProto.internal_static_api_v1alpha1_org_CreateAgentProfileGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.class, com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.newBuilder()
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
      agentProfileGroup_ = null;
      if (agentProfileGroupBuilder_ != null) {
        agentProfileGroupBuilder_.dispose();
        agentProfileGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.AgentProfileGroupProto.internal_static_api_v1alpha1_org_CreateAgentProfileGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest result = new com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentProfileGroup_ = agentProfileGroupBuilder_ == null
            ? agentProfileGroup_
            : agentProfileGroupBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest.getDefaultInstance()) return this;
      if (other.hasAgentProfileGroup()) {
        mergeAgentProfileGroup(other.getAgentProfileGroup());
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
            case 18: {
              input.readMessage(
                  getAgentProfileGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.commons.org.AgentProfileGroup agentProfileGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentProfileGroup, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder, com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder> agentProfileGroupBuilder_;
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     * @return Whether the agentProfileGroup field is set.
     */
    public boolean hasAgentProfileGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     * @return The agentProfileGroup.
     */
    public com.tcn.cloud.api.api.commons.org.AgentProfileGroup getAgentProfileGroup() {
      if (agentProfileGroupBuilder_ == null) {
        return agentProfileGroup_ == null ? com.tcn.cloud.api.api.commons.org.AgentProfileGroup.getDefaultInstance() : agentProfileGroup_;
      } else {
        return agentProfileGroupBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     */
    public Builder setAgentProfileGroup(com.tcn.cloud.api.api.commons.org.AgentProfileGroup value) {
      if (agentProfileGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentProfileGroup_ = value;
      } else {
        agentProfileGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     */
    public Builder setAgentProfileGroup(
        com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder builderForValue) {
      if (agentProfileGroupBuilder_ == null) {
        agentProfileGroup_ = builderForValue.build();
      } else {
        agentProfileGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     */
    public Builder mergeAgentProfileGroup(com.tcn.cloud.api.api.commons.org.AgentProfileGroup value) {
      if (agentProfileGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          agentProfileGroup_ != null &&
          agentProfileGroup_ != com.tcn.cloud.api.api.commons.org.AgentProfileGroup.getDefaultInstance()) {
          getAgentProfileGroupBuilder().mergeFrom(value);
        } else {
          agentProfileGroup_ = value;
        }
      } else {
        agentProfileGroupBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     */
    public Builder clearAgentProfileGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agentProfileGroup_ = null;
      if (agentProfileGroupBuilder_ != null) {
        agentProfileGroupBuilder_.dispose();
        agentProfileGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder getAgentProfileGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAgentProfileGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder getAgentProfileGroupOrBuilder() {
      if (agentProfileGroupBuilder_ != null) {
        return agentProfileGroupBuilder_.getMessageOrBuilder();
      } else {
        return agentProfileGroup_ == null ?
            com.tcn.cloud.api.api.commons.org.AgentProfileGroup.getDefaultInstance() : agentProfileGroup_;
      }
    }
    /**
     * <code>.api.commons.org.AgentProfileGroup agent_profile_group = 2 [json_name = "agentProfileGroup"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentProfileGroup, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder, com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder> 
        getAgentProfileGroupFieldBuilder() {
      if (agentProfileGroupBuilder_ == null) {
        agentProfileGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.AgentProfileGroup, com.tcn.cloud.api.api.commons.org.AgentProfileGroup.Builder, com.tcn.cloud.api.api.commons.org.AgentProfileGroupOrBuilder>(
                getAgentProfileGroup(),
                getParentForChildren(),
                isClean());
        agentProfileGroup_ = null;
      }
      return agentProfileGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.CreateAgentProfileGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.CreateAgentProfileGroupRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAgentProfileGroupRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAgentProfileGroupRequest>() {
    @java.lang.Override
    public CreateAgentProfileGroupRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAgentProfileGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAgentProfileGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.CreateAgentProfileGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

