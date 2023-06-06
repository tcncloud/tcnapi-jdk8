// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response for the GetAgentPreferences RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.GetAgentPreferencesResponse}
 */
public final class GetAgentPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.GetAgentPreferencesResponse)
    GetAgentPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAgentPreferencesResponse.newBuilder() to construct.
  private GetAgentPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAgentPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAgentPreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAgentPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAgentPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.Builder.class);
  }

  public static final int AGENT_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.AgentPreferences agentPreferences_;
  /**
   * <pre>
   * Agent preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
   * @return Whether the agentPreferences field is set.
   */
  @java.lang.Override
  public boolean hasAgentPreferences() {
    return agentPreferences_ != null;
  }
  /**
   * <pre>
   * Agent preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
   * @return The agentPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentPreferences getAgentPreferences() {
    return agentPreferences_ == null ? com.tcn.cloud.api.api.commons.org.AgentPreferences.getDefaultInstance() : agentPreferences_;
  }
  /**
   * <pre>
   * Agent preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.AgentPreferencesOrBuilder getAgentPreferencesOrBuilder() {
    return agentPreferences_ == null ? com.tcn.cloud.api.api.commons.org.AgentPreferences.getDefaultInstance() : agentPreferences_;
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
    if (agentPreferences_ != null) {
      output.writeMessage(1, getAgentPreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (agentPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAgentPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse) obj;

    if (hasAgentPreferences() != other.hasAgentPreferences()) return false;
    if (hasAgentPreferences()) {
      if (!getAgentPreferences()
          .equals(other.getAgentPreferences())) return false;
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
    if (hasAgentPreferences()) {
      hash = (37 * hash) + AGENT_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getAgentPreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse prototype) {
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
   * Response for the GetAgentPreferences RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.GetAgentPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.GetAgentPreferencesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAgentPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAgentPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.newBuilder()
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
      agentPreferences_ = null;
      if (agentPreferencesBuilder_ != null) {
        agentPreferencesBuilder_.dispose();
        agentPreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetAgentPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentPreferences_ = agentPreferencesBuilder_ == null
            ? agentPreferences_
            : agentPreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasAgentPreferences()) {
        mergeAgentPreferences(other.getAgentPreferences());
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
                  getAgentPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.AgentPreferences agentPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentPreferences, com.tcn.cloud.api.api.commons.org.AgentPreferences.Builder, com.tcn.cloud.api.api.commons.org.AgentPreferencesOrBuilder> agentPreferencesBuilder_;
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     * @return Whether the agentPreferences field is set.
     */
    public boolean hasAgentPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     * @return The agentPreferences.
     */
    public com.tcn.cloud.api.api.commons.org.AgentPreferences getAgentPreferences() {
      if (agentPreferencesBuilder_ == null) {
        return agentPreferences_ == null ? com.tcn.cloud.api.api.commons.org.AgentPreferences.getDefaultInstance() : agentPreferences_;
      } else {
        return agentPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     */
    public Builder setAgentPreferences(com.tcn.cloud.api.api.commons.org.AgentPreferences value) {
      if (agentPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        agentPreferences_ = value;
      } else {
        agentPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     */
    public Builder setAgentPreferences(
        com.tcn.cloud.api.api.commons.org.AgentPreferences.Builder builderForValue) {
      if (agentPreferencesBuilder_ == null) {
        agentPreferences_ = builderForValue.build();
      } else {
        agentPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     */
    public Builder mergeAgentPreferences(com.tcn.cloud.api.api.commons.org.AgentPreferences value) {
      if (agentPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          agentPreferences_ != null &&
          agentPreferences_ != com.tcn.cloud.api.api.commons.org.AgentPreferences.getDefaultInstance()) {
          getAgentPreferencesBuilder().mergeFrom(value);
        } else {
          agentPreferences_ = value;
        }
      } else {
        agentPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     */
    public Builder clearAgentPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      agentPreferences_ = null;
      if (agentPreferencesBuilder_ != null) {
        agentPreferencesBuilder_.dispose();
        agentPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentPreferences.Builder getAgentPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAgentPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.AgentPreferencesOrBuilder getAgentPreferencesOrBuilder() {
      if (agentPreferencesBuilder_ != null) {
        return agentPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return agentPreferences_ == null ?
            com.tcn.cloud.api.api.commons.org.AgentPreferences.getDefaultInstance() : agentPreferences_;
      }
    }
    /**
     * <pre>
     * Agent preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.AgentPreferences agent_preferences = 1 [json_name = "agentPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.AgentPreferences, com.tcn.cloud.api.api.commons.org.AgentPreferences.Builder, com.tcn.cloud.api.api.commons.org.AgentPreferencesOrBuilder> 
        getAgentPreferencesFieldBuilder() {
      if (agentPreferencesBuilder_ == null) {
        agentPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.AgentPreferences, com.tcn.cloud.api.api.commons.org.AgentPreferences.Builder, com.tcn.cloud.api.api.commons.org.AgentPreferencesOrBuilder>(
                getAgentPreferences(),
                getParentForChildren(),
                isClean());
        agentPreferences_ = null;
      }
      return agentPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.GetAgentPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.GetAgentPreferencesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAgentPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAgentPreferencesResponse>() {
    @java.lang.Override
    public GetAgentPreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAgentPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAgentPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.GetAgentPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

