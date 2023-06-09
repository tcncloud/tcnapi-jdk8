// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response message for ListAgentResponseGroups
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ListAgentResponseGroupsResponse}
 */
public final class ListAgentResponseGroupsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListAgentResponseGroupsResponse)
    ListAgentResponseGroupsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAgentResponseGroupsResponse.newBuilder() to construct.
  private ListAgentResponseGroupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAgentResponseGroupsResponse() {
    agentResponses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAgentResponseGroupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListAgentResponseGroupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListAgentResponseGroupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.class, com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.Builder.class);
  }

  public static final int AGENT_RESPONSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList agentResponses_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * List of possible agent response groups.
   * </pre>
   *
   * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
   * @return A list containing the agentResponses.
   */
  public com.google.protobuf.ProtocolStringList
      getAgentResponsesList() {
    return agentResponses_;
  }
  /**
   * <pre>
   * List of possible agent response groups.
   * </pre>
   *
   * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
   * @return The count of agentResponses.
   */
  public int getAgentResponsesCount() {
    return agentResponses_.size();
  }
  /**
   * <pre>
   * List of possible agent response groups.
   * </pre>
   *
   * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
   * @param index The index of the element to return.
   * @return The agentResponses at the given index.
   */
  public java.lang.String getAgentResponses(int index) {
    return agentResponses_.get(index);
  }
  /**
   * <pre>
   * List of possible agent response groups.
   * </pre>
   *
   * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the agentResponses at the given index.
   */
  public com.google.protobuf.ByteString
      getAgentResponsesBytes(int index) {
    return agentResponses_.getByteString(index);
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
    for (int i = 0; i < agentResponses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, agentResponses_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < agentResponses_.size(); i++) {
        dataSize += computeStringSizeNoTag(agentResponses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAgentResponsesList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse other = (com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse) obj;

    if (!getAgentResponsesList()
        .equals(other.getAgentResponsesList())) return false;
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
    if (getAgentResponsesCount() > 0) {
      hash = (37 * hash) + AGENT_RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getAgentResponsesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse prototype) {
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
   * Response message for ListAgentResponseGroups
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ListAgentResponseGroupsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListAgentResponseGroupsResponse)
      com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListAgentResponseGroupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListAgentResponseGroupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.class, com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.newBuilder()
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
      agentResponses_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_ListAgentResponseGroupsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse build() {
      com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse result = new com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        agentResponses_.makeImmutable();
        result.agentResponses_ = agentResponses_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse.getDefaultInstance()) return this;
      if (!other.agentResponses_.isEmpty()) {
        if (agentResponses_.isEmpty()) {
          agentResponses_ = other.agentResponses_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAgentResponsesIsMutable();
          agentResponses_.addAll(other.agentResponses_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAgentResponsesIsMutable();
              agentResponses_.add(s);
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

    private com.google.protobuf.LazyStringArrayList agentResponses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAgentResponsesIsMutable() {
      if (!agentResponses_.isModifiable()) {
        agentResponses_ = new com.google.protobuf.LazyStringArrayList(agentResponses_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @return A list containing the agentResponses.
     */
    public com.google.protobuf.ProtocolStringList
        getAgentResponsesList() {
      agentResponses_.makeImmutable();
      return agentResponses_;
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @return The count of agentResponses.
     */
    public int getAgentResponsesCount() {
      return agentResponses_.size();
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @param index The index of the element to return.
     * @return The agentResponses at the given index.
     */
    public java.lang.String getAgentResponses(int index) {
      return agentResponses_.get(index);
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the agentResponses at the given index.
     */
    public com.google.protobuf.ByteString
        getAgentResponsesBytes(int index) {
      return agentResponses_.getByteString(index);
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @param index The index to set the value at.
     * @param value The agentResponses to set.
     * @return This builder for chaining.
     */
    public Builder setAgentResponses(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAgentResponsesIsMutable();
      agentResponses_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @param value The agentResponses to add.
     * @return This builder for chaining.
     */
    public Builder addAgentResponses(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAgentResponsesIsMutable();
      agentResponses_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @param values The agentResponses to add.
     * @return This builder for chaining.
     */
    public Builder addAllAgentResponses(
        java.lang.Iterable<java.lang.String> values) {
      ensureAgentResponsesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, agentResponses_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentResponses() {
      agentResponses_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of possible agent response groups.
     * </pre>
     *
     * <code>repeated string agent_responses = 1 [json_name = "agentResponses"];</code>
     * @param value The bytes of the agentResponses to add.
     * @return This builder for chaining.
     */
    public Builder addAgentResponsesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAgentResponsesIsMutable();
      agentResponses_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListAgentResponseGroupsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListAgentResponseGroupsResponse)
  private static final com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAgentResponseGroupsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAgentResponseGroupsResponse>() {
    @java.lang.Override
    public ListAgentResponseGroupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAgentResponseGroupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAgentResponseGroupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListAgentResponseGroupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

