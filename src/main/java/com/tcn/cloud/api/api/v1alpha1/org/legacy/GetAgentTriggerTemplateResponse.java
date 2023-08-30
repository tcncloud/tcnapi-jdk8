// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse}
 */
public final class GetAgentTriggerTemplateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse)
    GetAgentTriggerTemplateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAgentTriggerTemplateResponse.newBuilder() to construct.
  private GetAgentTriggerTemplateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAgentTriggerTemplateResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAgentTriggerTemplateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetAgentTriggerTemplateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetAgentTriggerTemplateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse.Builder.class);
  }

  public static final int AGENT_TRIGGER_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate agentTriggerTemplate_;
  /**
   * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
   * @return Whether the agentTriggerTemplate field is set.
   */
  @java.lang.Override
  public boolean hasAgentTriggerTemplate() {
    return agentTriggerTemplate_ != null;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
   * @return The agentTriggerTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate getAgentTriggerTemplate() {
    return agentTriggerTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.getDefaultInstance() : agentTriggerTemplate_;
  }
  /**
   * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplateOrBuilder getAgentTriggerTemplateOrBuilder() {
    return agentTriggerTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.getDefaultInstance() : agentTriggerTemplate_;
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
    if (agentTriggerTemplate_ != null) {
      output.writeMessage(1, getAgentTriggerTemplate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentTriggerTemplate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgentTriggerTemplate());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse) obj;

    if (hasAgentTriggerTemplate() != other.hasAgentTriggerTemplate()) return false;
    if (hasAgentTriggerTemplate()) {
      if (!getAgentTriggerTemplate()
          .equals(other.getAgentTriggerTemplate())) return false;
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
    if (hasAgentTriggerTemplate()) {
      hash = (37 * hash) + AGENT_TRIGGER_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getAgentTriggerTemplate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetAgentTriggerTemplateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetAgentTriggerTemplateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse.newBuilder()
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
      agentTriggerTemplate_ = null;
      if (agentTriggerTemplateBuilder_ != null) {
        agentTriggerTemplateBuilder_.dispose();
        agentTriggerTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetAgentTriggerTemplateResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentTriggerTemplate_ = agentTriggerTemplateBuilder_ == null
            ? agentTriggerTemplate_
            : agentTriggerTemplateBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse.getDefaultInstance()) return this;
      if (other.hasAgentTriggerTemplate()) {
        mergeAgentTriggerTemplate(other.getAgentTriggerTemplate());
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
                  getAgentTriggerTemplateFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate agentTriggerTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplateOrBuilder> agentTriggerTemplateBuilder_;
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     * @return Whether the agentTriggerTemplate field is set.
     */
    public boolean hasAgentTriggerTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     * @return The agentTriggerTemplate.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate getAgentTriggerTemplate() {
      if (agentTriggerTemplateBuilder_ == null) {
        return agentTriggerTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.getDefaultInstance() : agentTriggerTemplate_;
      } else {
        return agentTriggerTemplateBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     */
    public Builder setAgentTriggerTemplate(com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate value) {
      if (agentTriggerTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentTriggerTemplate_ = value;
      } else {
        agentTriggerTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     */
    public Builder setAgentTriggerTemplate(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.Builder builderForValue) {
      if (agentTriggerTemplateBuilder_ == null) {
        agentTriggerTemplate_ = builderForValue.build();
      } else {
        agentTriggerTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     */
    public Builder mergeAgentTriggerTemplate(com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate value) {
      if (agentTriggerTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          agentTriggerTemplate_ != null &&
          agentTriggerTemplate_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.getDefaultInstance()) {
          getAgentTriggerTemplateBuilder().mergeFrom(value);
        } else {
          agentTriggerTemplate_ = value;
        }
      } else {
        agentTriggerTemplateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     */
    public Builder clearAgentTriggerTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agentTriggerTemplate_ = null;
      if (agentTriggerTemplateBuilder_ != null) {
        agentTriggerTemplateBuilder_.dispose();
        agentTriggerTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.Builder getAgentTriggerTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAgentTriggerTemplateFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplateOrBuilder getAgentTriggerTemplateOrBuilder() {
      if (agentTriggerTemplateBuilder_ != null) {
        return agentTriggerTemplateBuilder_.getMessageOrBuilder();
      } else {
        return agentTriggerTemplate_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.getDefaultInstance() : agentTriggerTemplate_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.legacy.AgentTriggerTemplate agent_trigger_template = 1 [json_name = "agentTriggerTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplateOrBuilder> 
        getAgentTriggerTemplateFieldBuilder() {
      if (agentTriggerTemplateBuilder_ == null) {
        agentTriggerTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate, com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.AgentTriggerTemplateOrBuilder>(
                getAgentTriggerTemplate(),
                getParentForChildren(),
                isClean());
        agentTriggerTemplate_ = null;
      }
      return agentTriggerTemplateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAgentTriggerTemplateResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAgentTriggerTemplateResponse>() {
    @java.lang.Override
    public GetAgentTriggerTemplateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAgentTriggerTemplateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAgentTriggerTemplateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetAgentTriggerTemplateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

