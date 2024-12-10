// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Represents an agents real time state over a period of time.
 * </pre>
 *
 * Protobuf type {@code api.commons.AgentStateSegment}
 */
@java.lang.Deprecated public final class AgentStateSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.AgentStateSegment)
    AgentStateSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentStateSegment.newBuilder() to construct.
  private AgentStateSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentStateSegment() {
    states_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentStateSegment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AgentStateSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AgentStateSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.AgentStateSegment.class, com.tcn.cloud.api.api.commons.AgentStateSegment.Builder.class);
  }

  public static final int ORDER_IN_RTS_FIELD_NUMBER = 1;
  private int orderInRts_ = 0;
  /**
   * <pre>
   * The order that this agent state segment fits into the AgentStateSequence.
   * Sequence starts at 0.
   * </pre>
   *
   * <code>int32 order_in_rts = 1 [json_name = "orderInRts"];</code>
   * @return The orderInRts.
   */
  @java.lang.Override
  public int getOrderInRts() {
    return orderInRts_;
  }

  public static final int STATES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> states_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.RealTimeManagementState> states_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.RealTimeManagementState>() {
            public com.tcn.cloud.api.api.commons.RealTimeManagementState convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.RealTimeManagementState result = com.tcn.cloud.api.api.commons.RealTimeManagementState.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.RealTimeManagementState.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @return A list containing the states.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.RealTimeManagementState> getStatesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.RealTimeManagementState>(states_, states_converter_);
  }
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @return The count of states.
   */
  @java.lang.Override
  public int getStatesCount() {
    return states_.size();
  }
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @param index The index of the element to return.
   * @return The states at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.RealTimeManagementState getStates(int index) {
    return states_converter_.convert(states_.get(index));
  }
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @return A list containing the enum numeric values on the wire for states.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getStatesValueList() {
    return states_;
  }
  /**
   * <pre>
   * The state of the agent during this segment.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of states at the given index.
   */
  @java.lang.Override
  public int getStatesValue(int index) {
    return states_.get(index);
  }
  private int statesMemoizedSerializedSize;

  public static final int WIDTH_IN_MINUTES_FIELD_NUMBER = 3;
  private int widthInMinutes_ = 0;
  /**
   * <pre>
   * The width of this segment in minutes.
   * </pre>
   *
   * <code>int32 width_in_minutes = 3 [json_name = "widthInMinutes", deprecated = true];</code>
   * @deprecated api.commons.AgentStateSegment.width_in_minutes is deprecated.
   *     See api/commons/wfm.proto;l=820
   * @return The widthInMinutes.
   */
  @java.lang.Override
  @java.lang.Deprecated public int getWidthInMinutes() {
    return widthInMinutes_;
  }

  public static final int WIDTH_IN_SECONDS_FIELD_NUMBER = 4;
  private int widthInSeconds_ = 0;
  /**
   * <pre>
   * The width of this segment in seconds.
   * </pre>
   *
   * <code>int32 width_in_seconds = 4 [json_name = "widthInSeconds"];</code>
   * @return The widthInSeconds.
   */
  @java.lang.Override
  public int getWidthInSeconds() {
    return widthInSeconds_;
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
    getSerializedSize();
    if (orderInRts_ != 0) {
      output.writeInt32(1, orderInRts_);
    }
    if (getStatesList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(statesMemoizedSerializedSize);
    }
    for (int i = 0; i < states_.size(); i++) {
      output.writeEnumNoTag(states_.get(i));
    }
    if (widthInMinutes_ != 0) {
      output.writeInt32(3, widthInMinutes_);
    }
    if (widthInSeconds_ != 0) {
      output.writeInt32(4, widthInSeconds_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (orderInRts_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, orderInRts_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < states_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(states_.get(i));
      }
      size += dataSize;
      if (!getStatesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }statesMemoizedSerializedSize = dataSize;
    }
    if (widthInMinutes_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, widthInMinutes_);
    }
    if (widthInSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, widthInSeconds_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.AgentStateSegment)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.AgentStateSegment other = (com.tcn.cloud.api.api.commons.AgentStateSegment) obj;

    if (getOrderInRts()
        != other.getOrderInRts()) return false;
    if (!states_.equals(other.states_)) return false;
    if (getWidthInMinutes()
        != other.getWidthInMinutes()) return false;
    if (getWidthInSeconds()
        != other.getWidthInSeconds()) return false;
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
    hash = (37 * hash) + ORDER_IN_RTS_FIELD_NUMBER;
    hash = (53 * hash) + getOrderInRts();
    if (getStatesCount() > 0) {
      hash = (37 * hash) + STATES_FIELD_NUMBER;
      hash = (53 * hash) + states_.hashCode();
    }
    hash = (37 * hash) + WIDTH_IN_MINUTES_FIELD_NUMBER;
    hash = (53 * hash) + getWidthInMinutes();
    hash = (37 * hash) + WIDTH_IN_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getWidthInSeconds();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentStateSegment parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.AgentStateSegment prototype) {
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
   * Represents an agents real time state over a period of time.
   * </pre>
   *
   * Protobuf type {@code api.commons.AgentStateSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.AgentStateSegment)
      com.tcn.cloud.api.api.commons.AgentStateSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AgentStateSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AgentStateSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.AgentStateSegment.class, com.tcn.cloud.api.api.commons.AgentStateSegment.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.AgentStateSegment.newBuilder()
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
      orderInRts_ = 0;
      states_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      widthInMinutes_ = 0;
      widthInSeconds_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AgentStateSegment_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentStateSegment getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.AgentStateSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentStateSegment build() {
      com.tcn.cloud.api.api.commons.AgentStateSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentStateSegment buildPartial() {
      com.tcn.cloud.api.api.commons.AgentStateSegment result = new com.tcn.cloud.api.api.commons.AgentStateSegment(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.AgentStateSegment result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        states_ = java.util.Collections.unmodifiableList(states_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.states_ = states_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.AgentStateSegment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orderInRts_ = orderInRts_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.widthInMinutes_ = widthInMinutes_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.widthInSeconds_ = widthInSeconds_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.AgentStateSegment) {
        return mergeFrom((com.tcn.cloud.api.api.commons.AgentStateSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.AgentStateSegment other) {
      if (other == com.tcn.cloud.api.api.commons.AgentStateSegment.getDefaultInstance()) return this;
      if (other.getOrderInRts() != 0) {
        setOrderInRts(other.getOrderInRts());
      }
      if (!other.states_.isEmpty()) {
        if (states_.isEmpty()) {
          states_ = other.states_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureStatesIsMutable();
          states_.addAll(other.states_);
        }
        onChanged();
      }
      if (other.getWidthInMinutes() != 0) {
        setWidthInMinutes(other.getWidthInMinutes());
      }
      if (other.getWidthInSeconds() != 0) {
        setWidthInSeconds(other.getWidthInSeconds());
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
              orderInRts_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              ensureStatesIsMutable();
              states_.add(tmpRaw);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureStatesIsMutable();
                states_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 18
            case 24: {
              widthInMinutes_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              widthInSeconds_ = input.readInt32();
              bitField0_ |= 0x00000008;
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

    private int orderInRts_ ;
    /**
     * <pre>
     * The order that this agent state segment fits into the AgentStateSequence.
     * Sequence starts at 0.
     * </pre>
     *
     * <code>int32 order_in_rts = 1 [json_name = "orderInRts"];</code>
     * @return The orderInRts.
     */
    @java.lang.Override
    public int getOrderInRts() {
      return orderInRts_;
    }
    /**
     * <pre>
     * The order that this agent state segment fits into the AgentStateSequence.
     * Sequence starts at 0.
     * </pre>
     *
     * <code>int32 order_in_rts = 1 [json_name = "orderInRts"];</code>
     * @param value The orderInRts to set.
     * @return This builder for chaining.
     */
    public Builder setOrderInRts(int value) {

      orderInRts_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The order that this agent state segment fits into the AgentStateSequence.
     * Sequence starts at 0.
     * </pre>
     *
     * <code>int32 order_in_rts = 1 [json_name = "orderInRts"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderInRts() {
      bitField0_ = (bitField0_ & ~0x00000001);
      orderInRts_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> states_ =
      java.util.Collections.emptyList();
    private void ensureStatesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        states_ = new java.util.ArrayList<java.lang.Integer>(states_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @return A list containing the states.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.RealTimeManagementState> getStatesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.RealTimeManagementState>(states_, states_converter_);
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @return The count of states.
     */
    public int getStatesCount() {
      return states_.size();
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @param index The index of the element to return.
     * @return The states at the given index.
     */
    public com.tcn.cloud.api.api.commons.RealTimeManagementState getStates(int index) {
      return states_converter_.convert(states_.get(index));
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @param index The index to set the value at.
     * @param value The states to set.
     * @return This builder for chaining.
     */
    public Builder setStates(
        int index, com.tcn.cloud.api.api.commons.RealTimeManagementState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStatesIsMutable();
      states_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @param value The states to add.
     * @return This builder for chaining.
     */
    public Builder addStates(com.tcn.cloud.api.api.commons.RealTimeManagementState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStatesIsMutable();
      states_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @param values The states to add.
     * @return This builder for chaining.
     */
    public Builder addAllStates(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.RealTimeManagementState> values) {
      ensureStatesIsMutable();
      for (com.tcn.cloud.api.api.commons.RealTimeManagementState value : values) {
        states_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStates() {
      states_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @return A list containing the enum numeric values on the wire for states.
     */
    public java.util.List<java.lang.Integer>
    getStatesValueList() {
      return java.util.Collections.unmodifiableList(states_);
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of states at the given index.
     */
    public int getStatesValue(int index) {
      return states_.get(index);
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for states to set.
     * @return This builder for chaining.
     */
    public Builder setStatesValue(
        int index, int value) {
      ensureStatesIsMutable();
      states_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @param value The enum numeric value on the wire for states to add.
     * @return This builder for chaining.
     */
    public Builder addStatesValue(int value) {
      ensureStatesIsMutable();
      states_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the agent during this segment.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 2 [json_name = "states"];</code>
     * @param values The enum numeric values on the wire for states to add.
     * @return This builder for chaining.
     */
    public Builder addAllStatesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureStatesIsMutable();
      for (int value : values) {
        states_.add(value);
      }
      onChanged();
      return this;
    }

    private int widthInMinutes_ ;
    /**
     * <pre>
     * The width of this segment in minutes.
     * </pre>
     *
     * <code>int32 width_in_minutes = 3 [json_name = "widthInMinutes", deprecated = true];</code>
     * @deprecated api.commons.AgentStateSegment.width_in_minutes is deprecated.
     *     See api/commons/wfm.proto;l=820
     * @return The widthInMinutes.
     */
    @java.lang.Override
    @java.lang.Deprecated public int getWidthInMinutes() {
      return widthInMinutes_;
    }
    /**
     * <pre>
     * The width of this segment in minutes.
     * </pre>
     *
     * <code>int32 width_in_minutes = 3 [json_name = "widthInMinutes", deprecated = true];</code>
     * @deprecated api.commons.AgentStateSegment.width_in_minutes is deprecated.
     *     See api/commons/wfm.proto;l=820
     * @param value The widthInMinutes to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setWidthInMinutes(int value) {

      widthInMinutes_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The width of this segment in minutes.
     * </pre>
     *
     * <code>int32 width_in_minutes = 3 [json_name = "widthInMinutes", deprecated = true];</code>
     * @deprecated api.commons.AgentStateSegment.width_in_minutes is deprecated.
     *     See api/commons/wfm.proto;l=820
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearWidthInMinutes() {
      bitField0_ = (bitField0_ & ~0x00000004);
      widthInMinutes_ = 0;
      onChanged();
      return this;
    }

    private int widthInSeconds_ ;
    /**
     * <pre>
     * The width of this segment in seconds.
     * </pre>
     *
     * <code>int32 width_in_seconds = 4 [json_name = "widthInSeconds"];</code>
     * @return The widthInSeconds.
     */
    @java.lang.Override
    public int getWidthInSeconds() {
      return widthInSeconds_;
    }
    /**
     * <pre>
     * The width of this segment in seconds.
     * </pre>
     *
     * <code>int32 width_in_seconds = 4 [json_name = "widthInSeconds"];</code>
     * @param value The widthInSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setWidthInSeconds(int value) {

      widthInSeconds_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The width of this segment in seconds.
     * </pre>
     *
     * <code>int32 width_in_seconds = 4 [json_name = "widthInSeconds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWidthInSeconds() {
      bitField0_ = (bitField0_ & ~0x00000008);
      widthInSeconds_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.AgentStateSegment)
  }

  // @@protoc_insertion_point(class_scope:api.commons.AgentStateSegment)
  private static final com.tcn.cloud.api.api.commons.AgentStateSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.AgentStateSegment();
  }

  public static com.tcn.cloud.api.api.commons.AgentStateSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentStateSegment>
      PARSER = new com.google.protobuf.AbstractParser<AgentStateSegment>() {
    @java.lang.Override
    public AgentStateSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgentStateSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentStateSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AgentStateSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

