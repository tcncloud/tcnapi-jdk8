// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.TransferColdToAgentRequest}
 */
public final class TransferColdToAgentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.TransferColdToAgentRequest)
    TransferColdToAgentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferColdToAgentRequest.newBuilder() to construct.
  private TransferColdToAgentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferColdToAgentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransferColdToAgentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_TransferColdToAgentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_TransferColdToAgentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.class, com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.Builder.class);
  }

  public static final int DESTINATION_AGENT_ID_FIELD_NUMBER = 3;
  private long destinationAgentId_ = 0L;
  /**
   * <code>int64 destination_agent_id = 3 [json_name = "destinationAgentId"];</code>
   * @return The destinationAgentId.
   */
  @java.lang.Override
  public long getDestinationAgentId() {
    return destinationAgentId_;
  }

  public static final int SESSION_SID_FIELD_NUMBER = 4;
  private long sessionSid_ = 0L;
  /**
   * <code>int64 session_sid = 4 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  @java.lang.Override
  public long getSessionSid() {
    return sessionSid_;
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
    if (destinationAgentId_ != 0L) {
      output.writeInt64(3, destinationAgentId_);
    }
    if (sessionSid_ != 0L) {
      output.writeInt64(4, sessionSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (destinationAgentId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, destinationAgentId_);
    }
    if (sessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, sessionSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest other = (com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest) obj;

    if (getDestinationAgentId()
        != other.getDestinationAgentId()) return false;
    if (getSessionSid()
        != other.getSessionSid()) return false;
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
    hash = (37 * hash) + DESTINATION_AGENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDestinationAgentId());
    hash = (37 * hash) + SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest prototype) {
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
   * Protobuf type {@code api.v0alpha.TransferColdToAgentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.TransferColdToAgentRequest)
      com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_TransferColdToAgentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_TransferColdToAgentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.class, com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.newBuilder()
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
      destinationAgentId_ = 0L;
      sessionSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_TransferColdToAgentRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest build() {
      com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest result = new com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.destinationAgentId_ = destinationAgentId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sessionSid_ = sessionSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest.getDefaultInstance()) return this;
      if (other.getDestinationAgentId() != 0L) {
        setDestinationAgentId(other.getDestinationAgentId());
      }
      if (other.getSessionSid() != 0L) {
        setSessionSid(other.getSessionSid());
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
            case 24: {
              destinationAgentId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              sessionSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
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

    private long destinationAgentId_ ;
    /**
     * <code>int64 destination_agent_id = 3 [json_name = "destinationAgentId"];</code>
     * @return The destinationAgentId.
     */
    @java.lang.Override
    public long getDestinationAgentId() {
      return destinationAgentId_;
    }
    /**
     * <code>int64 destination_agent_id = 3 [json_name = "destinationAgentId"];</code>
     * @param value The destinationAgentId to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationAgentId(long value) {

      destinationAgentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 destination_agent_id = 3 [json_name = "destinationAgentId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationAgentId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      destinationAgentId_ = 0L;
      onChanged();
      return this;
    }

    private long sessionSid_ ;
    /**
     * <code>int64 session_sid = 4 [json_name = "sessionSid"];</code>
     * @return The sessionSid.
     */
    @java.lang.Override
    public long getSessionSid() {
      return sessionSid_;
    }
    /**
     * <code>int64 session_sid = 4 [json_name = "sessionSid"];</code>
     * @param value The sessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setSessionSid(long value) {

      sessionSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 session_sid = 4 [json_name = "sessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sessionSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.TransferColdToAgentRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.TransferColdToAgentRequest)
  private static final com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferColdToAgentRequest>
      PARSER = new com.google.protobuf.AbstractParser<TransferColdToAgentRequest>() {
    @java.lang.Override
    public TransferColdToAgentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<TransferColdToAgentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferColdToAgentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.TransferColdToAgentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

