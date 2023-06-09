// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/asm/service.proto

package com.tcn.cloud.api.api.v1alpha1.asm;

/**
 * <pre>
 * request used to establish a stream of status updates
 * based on the given asm session sid. Ths will return
 * all payload types in the responses
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.asm.StreamAgentStateReq}
 */
public final class StreamAgentStateReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.asm.StreamAgentStateReq)
    StreamAgentStateReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamAgentStateReq.newBuilder() to construct.
  private StreamAgentStateReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamAgentStateReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamAgentStateReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_StreamAgentStateReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_StreamAgentStateReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.class, com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.Builder.class);
  }

  public static final int ASM_SESSION_SID_FIELD_NUMBER = 1;
  private long asmSessionSid_ = 0L;
  /**
   * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
   * @return The asmSessionSid.
   */
  @java.lang.Override
  public long getAsmSessionSid() {
    return asmSessionSid_;
  }

  public static final int KEEP_ALIVE_FIELD_NUMBER = 2;
  private boolean keepAlive_ = false;
  /**
   * <code>bool keep_alive = 2 [json_name = "keepAlive"];</code>
   * @return The keepAlive.
   */
  @java.lang.Override
  public boolean getKeepAlive() {
    return keepAlive_;
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
    if (asmSessionSid_ != 0L) {
      output.writeInt64(1, asmSessionSid_);
    }
    if (keepAlive_ != false) {
      output.writeBool(2, keepAlive_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (asmSessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, asmSessionSid_);
    }
    if (keepAlive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, keepAlive_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq other = (com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq) obj;

    if (getAsmSessionSid()
        != other.getAsmSessionSid()) return false;
    if (getKeepAlive()
        != other.getKeepAlive()) return false;
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
    hash = (37 * hash) + ASM_SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAsmSessionSid());
    hash = (37 * hash) + KEEP_ALIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getKeepAlive());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq prototype) {
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
   * request used to establish a stream of status updates
   * based on the given asm session sid. Ths will return
   * all payload types in the responses
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.asm.StreamAgentStateReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.asm.StreamAgentStateReq)
      com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_StreamAgentStateReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_StreamAgentStateReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.class, com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.newBuilder()
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
      asmSessionSid_ = 0L;
      keepAlive_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.asm.ServiceProto.internal_static_api_v1alpha1_asm_StreamAgentStateReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq build() {
      com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq result = new com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.asmSessionSid_ = asmSessionSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.keepAlive_ = keepAlive_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq.getDefaultInstance()) return this;
      if (other.getAsmSessionSid() != 0L) {
        setAsmSessionSid(other.getAsmSessionSid());
      }
      if (other.getKeepAlive() != false) {
        setKeepAlive(other.getKeepAlive());
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
            case 8: {
              asmSessionSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              keepAlive_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long asmSessionSid_ ;
    /**
     * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
     * @return The asmSessionSid.
     */
    @java.lang.Override
    public long getAsmSessionSid() {
      return asmSessionSid_;
    }
    /**
     * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
     * @param value The asmSessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setAsmSessionSid(long value) {

      asmSessionSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 asm_session_sid = 1 [json_name = "asmSessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsmSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      asmSessionSid_ = 0L;
      onChanged();
      return this;
    }

    private boolean keepAlive_ ;
    /**
     * <code>bool keep_alive = 2 [json_name = "keepAlive"];</code>
     * @return The keepAlive.
     */
    @java.lang.Override
    public boolean getKeepAlive() {
      return keepAlive_;
    }
    /**
     * <code>bool keep_alive = 2 [json_name = "keepAlive"];</code>
     * @param value The keepAlive to set.
     * @return This builder for chaining.
     */
    public Builder setKeepAlive(boolean value) {

      keepAlive_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool keep_alive = 2 [json_name = "keepAlive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKeepAlive() {
      bitField0_ = (bitField0_ & ~0x00000002);
      keepAlive_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.asm.StreamAgentStateReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.asm.StreamAgentStateReq)
  private static final com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamAgentStateReq>
      PARSER = new com.google.protobuf.AbstractParser<StreamAgentStateReq>() {
    @java.lang.Override
    public StreamAgentStateReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamAgentStateReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamAgentStateReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.asm.StreamAgentStateReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

