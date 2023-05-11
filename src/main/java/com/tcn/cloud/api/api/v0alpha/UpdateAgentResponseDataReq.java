// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/sds.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateAgentResponseDataReq}
 */
public final class UpdateAgentResponseDataReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateAgentResponseDataReq)
    UpdateAgentResponseDataReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAgentResponseDataReq.newBuilder() to construct.
  private UpdateAgentResponseDataReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAgentResponseDataReq() {
    callType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAgentResponseDataReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SdsProto.internal_static_api_v0alpha_UpdateAgentResponseDataReq_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetResponses();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SdsProto.internal_static_api_v0alpha_UpdateAgentResponseDataReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.class, com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.Builder.class);
  }

  public static final int CALL_SID_FIELD_NUMBER = 2;
  private long callSid_ = 0L;
  /**
   * <code>int64 call_sid = 2 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  @java.lang.Override
  public long getCallSid() {
    return callSid_;
  }

  public static final int CALL_TYPE_FIELD_NUMBER = 3;
  private int callType_ = 0;
  /**
   * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
   * @return The enum numeric value on the wire for callType.
   */
  @java.lang.Override public int getCallTypeValue() {
    return callType_;
  }
  /**
   * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
   * @return The callType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.CallType.Enum getCallType() {
    com.tcn.cloud.api.api.commons.CallType.Enum result = com.tcn.cloud.api.api.commons.CallType.Enum.forNumber(callType_);
    return result == null ? com.tcn.cloud.api.api.commons.CallType.Enum.UNRECOGNIZED : result;
  }

  public static final int RESPONSES_FIELD_NUMBER = 4;
  private static final class ResponsesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.tcn.cloud.api.api.v0alpha.SdsProto.internal_static_api_v0alpha_UpdateAgentResponseDataReq_ResponsesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> responses_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetResponses() {
    if (responses_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ResponsesDefaultEntryHolder.defaultEntry);
    }
    return responses_;
  }
  public int getResponsesCount() {
    return internalGetResponses().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
   */
  @java.lang.Override
  public boolean containsResponses(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetResponses().getMap().containsKey(key);
  }
  /**
   * Use {@link #getResponsesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getResponses() {
    return getResponsesMap();
  }
  /**
   * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getResponsesMap() {
    return internalGetResponses().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getResponsesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetResponses().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
   */
  @java.lang.Override
  public java.lang.String getResponsesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetResponses().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (callSid_ != 0L) {
      output.writeInt64(2, callSid_);
    }
    if (callType_ != com.tcn.cloud.api.api.commons.CallType.Enum.INBOUND.getNumber()) {
      output.writeEnum(3, callType_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetResponses(),
        ResponsesDefaultEntryHolder.defaultEntry,
        4);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (callSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, callSid_);
    }
    if (callType_ != com.tcn.cloud.api.api.commons.CallType.Enum.INBOUND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, callType_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetResponses().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      responses__ = ResponsesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, responses__);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq other = (com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq) obj;

    if (getCallSid()
        != other.getCallSid()) return false;
    if (callType_ != other.callType_) return false;
    if (!internalGetResponses().equals(
        other.internalGetResponses())) return false;
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
    hash = (37 * hash) + CALL_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCallSid());
    hash = (37 * hash) + CALL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + callType_;
    if (!internalGetResponses().getMap().isEmpty()) {
      hash = (37 * hash) + RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetResponses().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateAgentResponseDataReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateAgentResponseDataReq)
      com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SdsProto.internal_static_api_v0alpha_UpdateAgentResponseDataReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetResponses();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableResponses();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SdsProto.internal_static_api_v0alpha_UpdateAgentResponseDataReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.class, com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.newBuilder()
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
      callSid_ = 0L;
      callType_ = 0;
      internalGetMutableResponses().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SdsProto.internal_static_api_v0alpha_UpdateAgentResponseDataReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq result = new com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callSid_ = callSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.callType_ = callType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.responses_ = internalGetResponses();
        result.responses_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq.getDefaultInstance()) return this;
      if (other.getCallSid() != 0L) {
        setCallSid(other.getCallSid());
      }
      if (other.callType_ != 0) {
        setCallTypeValue(other.getCallTypeValue());
      }
      internalGetMutableResponses().mergeFrom(
          other.internalGetResponses());
      bitField0_ |= 0x00000004;
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
            case 16: {
              callSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 24: {
              callType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 34: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              responses__ = input.readMessage(
                  ResponsesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableResponses().getMutableMap().put(
                  responses__.getKey(), responses__.getValue());
              bitField0_ |= 0x00000004;
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

    private long callSid_ ;
    /**
     * <code>int64 call_sid = 2 [json_name = "callSid"];</code>
     * @return The callSid.
     */
    @java.lang.Override
    public long getCallSid() {
      return callSid_;
    }
    /**
     * <code>int64 call_sid = 2 [json_name = "callSid"];</code>
     * @param value The callSid to set.
     * @return This builder for chaining.
     */
    public Builder setCallSid(long value) {

      callSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 call_sid = 2 [json_name = "callSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callSid_ = 0L;
      onChanged();
      return this;
    }

    private int callType_ = 0;
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @return The enum numeric value on the wire for callType.
     */
    @java.lang.Override public int getCallTypeValue() {
      return callType_;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @param value The enum numeric value on the wire for callType to set.
     * @return This builder for chaining.
     */
    public Builder setCallTypeValue(int value) {
      callType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @return The callType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.CallType.Enum getCallType() {
      com.tcn.cloud.api.api.commons.CallType.Enum result = com.tcn.cloud.api.api.commons.CallType.Enum.forNumber(callType_);
      return result == null ? com.tcn.cloud.api.api.commons.CallType.Enum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @param value The callType to set.
     * @return This builder for chaining.
     */
    public Builder setCallType(com.tcn.cloud.api.api.commons.CallType.Enum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      callType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.CallType.Enum call_type = 3 [json_name = "callType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      callType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> responses_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetResponses() {
      if (responses_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ResponsesDefaultEntryHolder.defaultEntry);
      }
      return responses_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableResponses() {
      if (responses_ == null) {
        responses_ = com.google.protobuf.MapField.newMapField(
            ResponsesDefaultEntryHolder.defaultEntry);
      }
      if (!responses_.isMutable()) {
        responses_ = responses_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return responses_;
    }
    public int getResponsesCount() {
      return internalGetResponses().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
     */
    @java.lang.Override
    public boolean containsResponses(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetResponses().getMap().containsKey(key);
    }
    /**
     * Use {@link #getResponsesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getResponses() {
      return getResponsesMap();
    }
    /**
     * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getResponsesMap() {
      return internalGetResponses().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getResponsesOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetResponses().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
     */
    @java.lang.Override
    public java.lang.String getResponsesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetResponses().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearResponses() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableResponses().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
     */
    public Builder removeResponses(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableResponses().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableResponses() {
      bitField0_ |= 0x00000004;
      return internalGetMutableResponses().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
     */
    public Builder putResponses(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableResponses().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; responses = 4 [json_name = "responses"];</code>
     */
    public Builder putAllResponses(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableResponses().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateAgentResponseDataReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateAgentResponseDataReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAgentResponseDataReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAgentResponseDataReq>() {
    @java.lang.Override
    public UpdateAgentResponseDataReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAgentResponseDataReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAgentResponseDataReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateAgentResponseDataReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

