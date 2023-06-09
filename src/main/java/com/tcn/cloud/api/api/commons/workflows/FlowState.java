// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/entities.proto

package com.tcn.cloud.api.api.commons.workflows;

/**
 * Protobuf type {@code api.commons.workflows.FlowState}
 */
public final class FlowState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.workflows.FlowState)
    FlowStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlowState.newBuilder() to construct.
  private FlowState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlowState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlowState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.workflows.EntitiesProto.internal_static_api_commons_workflows_FlowState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.workflows.EntitiesProto.internal_static_api_commons_workflows_FlowState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.workflows.FlowState.class, com.tcn.cloud.api.api.commons.workflows.FlowState.Builder.class);
  }

  public static final int ENVELOPE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.workflows.Envelope envelope_;
  /**
   * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
   * @return Whether the envelope field is set.
   */
  @java.lang.Override
  public boolean hasEnvelope() {
    return envelope_ != null;
  }
  /**
   * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
   * @return The envelope.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.Envelope getEnvelope() {
    return envelope_ == null ? com.tcn.cloud.api.api.commons.workflows.Envelope.getDefaultInstance() : envelope_;
  }
  /**
   * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.EnvelopeOrBuilder getEnvelopeOrBuilder() {
    return envelope_ == null ? com.tcn.cloud.api.api.commons.workflows.Envelope.getDefaultInstance() : envelope_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.workflows.State state_;
  /**
   * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return state_ != null;
  }
  /**
   * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.State getState() {
    return state_ == null ? com.tcn.cloud.api.api.commons.workflows.State.getDefaultInstance() : state_;
  }
  /**
   * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.StateOrBuilder getStateOrBuilder() {
    return state_ == null ? com.tcn.cloud.api.api.commons.workflows.State.getDefaultInstance() : state_;
  }

  public static final int PAYLOAD_FIELD_NUMBER = 100;
  private com.tcn.cloud.api.api.commons.workflows.Payload payload_;
  /**
   * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return payload_ != null;
  }
  /**
   * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.Payload getPayload() {
    return payload_ == null ? com.tcn.cloud.api.api.commons.workflows.Payload.getDefaultInstance() : payload_;
  }
  /**
   * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.PayloadOrBuilder getPayloadOrBuilder() {
    return payload_ == null ? com.tcn.cloud.api.api.commons.workflows.Payload.getDefaultInstance() : payload_;
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
    if (envelope_ != null) {
      output.writeMessage(1, getEnvelope());
    }
    if (state_ != null) {
      output.writeMessage(2, getState());
    }
    if (payload_ != null) {
      output.writeMessage(100, getPayload());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (envelope_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvelope());
    }
    if (state_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getState());
    }
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(100, getPayload());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.workflows.FlowState)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.workflows.FlowState other = (com.tcn.cloud.api.api.commons.workflows.FlowState) obj;

    if (hasEnvelope() != other.hasEnvelope()) return false;
    if (hasEnvelope()) {
      if (!getEnvelope()
          .equals(other.getEnvelope())) return false;
    }
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState()
          .equals(other.getState())) return false;
    }
    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload()
          .equals(other.getPayload())) return false;
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
    if (hasEnvelope()) {
      hash = (37 * hash) + ENVELOPE_FIELD_NUMBER;
      hash = (53 * hash) + getEnvelope().hashCode();
    }
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.FlowState parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.workflows.FlowState prototype) {
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
   * Protobuf type {@code api.commons.workflows.FlowState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.workflows.FlowState)
      com.tcn.cloud.api.api.commons.workflows.FlowStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.workflows.EntitiesProto.internal_static_api_commons_workflows_FlowState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.workflows.EntitiesProto.internal_static_api_commons_workflows_FlowState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.workflows.FlowState.class, com.tcn.cloud.api.api.commons.workflows.FlowState.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.workflows.FlowState.newBuilder()
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
      envelope_ = null;
      if (envelopeBuilder_ != null) {
        envelopeBuilder_.dispose();
        envelopeBuilder_ = null;
      }
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      payload_ = null;
      if (payloadBuilder_ != null) {
        payloadBuilder_.dispose();
        payloadBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.workflows.EntitiesProto.internal_static_api_commons_workflows_FlowState_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.FlowState getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.workflows.FlowState.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.FlowState build() {
      com.tcn.cloud.api.api.commons.workflows.FlowState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.FlowState buildPartial() {
      com.tcn.cloud.api.api.commons.workflows.FlowState result = new com.tcn.cloud.api.api.commons.workflows.FlowState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.workflows.FlowState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.envelope_ = envelopeBuilder_ == null
            ? envelope_
            : envelopeBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = stateBuilder_ == null
            ? state_
            : stateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.payload_ = payloadBuilder_ == null
            ? payload_
            : payloadBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.workflows.FlowState) {
        return mergeFrom((com.tcn.cloud.api.api.commons.workflows.FlowState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.workflows.FlowState other) {
      if (other == com.tcn.cloud.api.api.commons.workflows.FlowState.getDefaultInstance()) return this;
      if (other.hasEnvelope()) {
        mergeEnvelope(other.getEnvelope());
      }
      if (other.hasState()) {
        mergeState(other.getState());
      }
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
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
                  getEnvelopeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getStateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 802: {
              input.readMessage(
                  getPayloadFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 802
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

    private com.tcn.cloud.api.api.commons.workflows.Envelope envelope_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.workflows.Envelope, com.tcn.cloud.api.api.commons.workflows.Envelope.Builder, com.tcn.cloud.api.api.commons.workflows.EnvelopeOrBuilder> envelopeBuilder_;
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     * @return Whether the envelope field is set.
     */
    public boolean hasEnvelope() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     * @return The envelope.
     */
    public com.tcn.cloud.api.api.commons.workflows.Envelope getEnvelope() {
      if (envelopeBuilder_ == null) {
        return envelope_ == null ? com.tcn.cloud.api.api.commons.workflows.Envelope.getDefaultInstance() : envelope_;
      } else {
        return envelopeBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     */
    public Builder setEnvelope(com.tcn.cloud.api.api.commons.workflows.Envelope value) {
      if (envelopeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        envelope_ = value;
      } else {
        envelopeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     */
    public Builder setEnvelope(
        com.tcn.cloud.api.api.commons.workflows.Envelope.Builder builderForValue) {
      if (envelopeBuilder_ == null) {
        envelope_ = builderForValue.build();
      } else {
        envelopeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     */
    public Builder mergeEnvelope(com.tcn.cloud.api.api.commons.workflows.Envelope value) {
      if (envelopeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          envelope_ != null &&
          envelope_ != com.tcn.cloud.api.api.commons.workflows.Envelope.getDefaultInstance()) {
          getEnvelopeBuilder().mergeFrom(value);
        } else {
          envelope_ = value;
        }
      } else {
        envelopeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     */
    public Builder clearEnvelope() {
      bitField0_ = (bitField0_ & ~0x00000001);
      envelope_ = null;
      if (envelopeBuilder_ != null) {
        envelopeBuilder_.dispose();
        envelopeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     */
    public com.tcn.cloud.api.api.commons.workflows.Envelope.Builder getEnvelopeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEnvelopeFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     */
    public com.tcn.cloud.api.api.commons.workflows.EnvelopeOrBuilder getEnvelopeOrBuilder() {
      if (envelopeBuilder_ != null) {
        return envelopeBuilder_.getMessageOrBuilder();
      } else {
        return envelope_ == null ?
            com.tcn.cloud.api.api.commons.workflows.Envelope.getDefaultInstance() : envelope_;
      }
    }
    /**
     * <code>.api.commons.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.workflows.Envelope, com.tcn.cloud.api.api.commons.workflows.Envelope.Builder, com.tcn.cloud.api.api.commons.workflows.EnvelopeOrBuilder> 
        getEnvelopeFieldBuilder() {
      if (envelopeBuilder_ == null) {
        envelopeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.workflows.Envelope, com.tcn.cloud.api.api.commons.workflows.Envelope.Builder, com.tcn.cloud.api.api.commons.workflows.EnvelopeOrBuilder>(
                getEnvelope(),
                getParentForChildren(),
                isClean());
        envelope_ = null;
      }
      return envelopeBuilder_;
    }

    private com.tcn.cloud.api.api.commons.workflows.State state_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.workflows.State, com.tcn.cloud.api.api.commons.workflows.State.Builder, com.tcn.cloud.api.api.commons.workflows.StateOrBuilder> stateBuilder_;
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     * @return The state.
     */
    public com.tcn.cloud.api.api.commons.workflows.State getState() {
      if (stateBuilder_ == null) {
        return state_ == null ? com.tcn.cloud.api.api.commons.workflows.State.getDefaultInstance() : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     */
    public Builder setState(com.tcn.cloud.api.api.commons.workflows.State value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
      } else {
        stateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     */
    public Builder setState(
        com.tcn.cloud.api.api.commons.workflows.State.Builder builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     */
    public Builder mergeState(com.tcn.cloud.api.api.commons.workflows.State value) {
      if (stateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          state_ != null &&
          state_ != com.tcn.cloud.api.api.commons.workflows.State.getDefaultInstance()) {
          getStateBuilder().mergeFrom(value);
        } else {
          state_ = value;
        }
      } else {
        stateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = null;
      if (stateBuilder_ != null) {
        stateBuilder_.dispose();
        stateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     */
    public com.tcn.cloud.api.api.commons.workflows.State.Builder getStateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     */
    public com.tcn.cloud.api.api.commons.workflows.StateOrBuilder getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null ?
            com.tcn.cloud.api.api.commons.workflows.State.getDefaultInstance() : state_;
      }
    }
    /**
     * <code>.api.commons.workflows.State state = 2 [json_name = "state"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.workflows.State, com.tcn.cloud.api.api.commons.workflows.State.Builder, com.tcn.cloud.api.api.commons.workflows.StateOrBuilder> 
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.workflows.State, com.tcn.cloud.api.api.commons.workflows.State.Builder, com.tcn.cloud.api.api.commons.workflows.StateOrBuilder>(
                getState(),
                getParentForChildren(),
                isClean());
        state_ = null;
      }
      return stateBuilder_;
    }

    private com.tcn.cloud.api.api.commons.workflows.Payload payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.workflows.Payload, com.tcn.cloud.api.api.commons.workflows.Payload.Builder, com.tcn.cloud.api.api.commons.workflows.PayloadOrBuilder> payloadBuilder_;
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     * @return Whether the payload field is set.
     */
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     * @return The payload.
     */
    public com.tcn.cloud.api.api.commons.workflows.Payload getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null ? com.tcn.cloud.api.api.commons.workflows.Payload.getDefaultInstance() : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     */
    public Builder setPayload(com.tcn.cloud.api.api.commons.workflows.Payload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
      } else {
        payloadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     */
    public Builder setPayload(
        com.tcn.cloud.api.api.commons.workflows.Payload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     */
    public Builder mergePayload(com.tcn.cloud.api.api.commons.workflows.Payload value) {
      if (payloadBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          payload_ != null &&
          payload_ != com.tcn.cloud.api.api.commons.workflows.Payload.getDefaultInstance()) {
          getPayloadBuilder().mergeFrom(value);
        } else {
          payload_ = value;
        }
      } else {
        payloadBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000004);
      payload_ = null;
      if (payloadBuilder_ != null) {
        payloadBuilder_.dispose();
        payloadBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     */
    public com.tcn.cloud.api.api.commons.workflows.Payload.Builder getPayloadBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     */
    public com.tcn.cloud.api.api.commons.workflows.PayloadOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null ?
            com.tcn.cloud.api.api.commons.workflows.Payload.getDefaultInstance() : payload_;
      }
    }
    /**
     * <code>.api.commons.workflows.Payload payload = 100 [json_name = "payload"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.workflows.Payload, com.tcn.cloud.api.api.commons.workflows.Payload.Builder, com.tcn.cloud.api.api.commons.workflows.PayloadOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.workflows.Payload, com.tcn.cloud.api.api.commons.workflows.Payload.Builder, com.tcn.cloud.api.api.commons.workflows.PayloadOrBuilder>(
                getPayload(),
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      return payloadBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.workflows.FlowState)
  }

  // @@protoc_insertion_point(class_scope:api.commons.workflows.FlowState)
  private static final com.tcn.cloud.api.api.commons.workflows.FlowState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.workflows.FlowState();
  }

  public static com.tcn.cloud.api.api.commons.workflows.FlowState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlowState>
      PARSER = new com.google.protobuf.AbstractParser<FlowState>() {
    @java.lang.Override
    public FlowState parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlowState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlowState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.FlowState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

