// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for ListRealTimeManagementStates.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListRealTimeManagementStatesResponse}
 */
public final class ListRealTimeManagementStatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListRealTimeManagementStatesResponse)
    ListRealTimeManagementStatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListRealTimeManagementStatesResponse.newBuilder() to construct.
  private ListRealTimeManagementStatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListRealTimeManagementStatesResponse() {
    states_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListRealTimeManagementStatesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRealTimeManagementStatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRealTimeManagementStatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse.Builder.class);
  }

  public static final int STATES_FIELD_NUMBER = 1;
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
   * The states.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
   * @return A list containing the states.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.RealTimeManagementState> getStatesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.RealTimeManagementState>(states_, states_converter_);
  }
  /**
   * <pre>
   * The states.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
   * @return The count of states.
   */
  @java.lang.Override
  public int getStatesCount() {
    return states_.size();
  }
  /**
   * <pre>
   * The states.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
   * @param index The index of the element to return.
   * @return The states at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.RealTimeManagementState getStates(int index) {
    return states_converter_.convert(states_.get(index));
  }
  /**
   * <pre>
   * The states.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
   * @return A list containing the enum numeric values on the wire for states.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getStatesValueList() {
    return states_;
  }
  /**
   * <pre>
   * The states.
   * </pre>
   *
   * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of states at the given index.
   */
  @java.lang.Override
  public int getStatesValue(int index) {
    return states_.get(index);
  }
  private int statesMemoizedSerializedSize;

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
    if (getStatesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(statesMemoizedSerializedSize);
    }
    for (int i = 0; i < states_.size(); i++) {
      output.writeEnumNoTag(states_.get(i));
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse) obj;

    if (!states_.equals(other.states_)) return false;
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
    if (getStatesCount() > 0) {
      hash = (37 * hash) + STATES_FIELD_NUMBER;
      hash = (53 * hash) + states_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse prototype) {
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
   * Response message for ListRealTimeManagementStates.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListRealTimeManagementStatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListRealTimeManagementStatesResponse)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRealTimeManagementStatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRealTimeManagementStatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse.newBuilder()
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
      states_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListRealTimeManagementStatesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        states_ = java.util.Collections.unmodifiableList(states_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.states_ = states_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse.getDefaultInstance()) return this;
      if (!other.states_.isEmpty()) {
        if (states_.isEmpty()) {
          states_ = other.states_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStatesIsMutable();
          states_.addAll(other.states_);
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
            case 8: {
              int tmpRaw = input.readEnum();
              ensureStatesIsMutable();
              states_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureStatesIsMutable();
                states_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
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

    private java.util.List<java.lang.Integer> states_ =
      java.util.Collections.emptyList();
    private void ensureStatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        states_ = new java.util.ArrayList<java.lang.Integer>(states_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
     * @return A list containing the states.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.RealTimeManagementState> getStatesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.RealTimeManagementState>(states_, states_converter_);
    }
    /**
     * <pre>
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
     * @return The count of states.
     */
    public int getStatesCount() {
      return states_.size();
    }
    /**
     * <pre>
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
     * @param index The index of the element to return.
     * @return The states at the given index.
     */
    public com.tcn.cloud.api.api.commons.RealTimeManagementState getStates(int index) {
      return states_converter_.convert(states_.get(index));
    }
    /**
     * <pre>
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
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
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
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
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
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
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStates() {
      states_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
     * @return A list containing the enum numeric values on the wire for states.
     */
    public java.util.List<java.lang.Integer>
    getStatesValueList() {
      return java.util.Collections.unmodifiableList(states_);
    }
    /**
     * <pre>
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of states at the given index.
     */
    public int getStatesValue(int index) {
      return states_.get(index);
    }
    /**
     * <pre>
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
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
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
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
     * The states.
     * </pre>
     *
     * <code>repeated .api.commons.RealTimeManagementState states = 1 [json_name = "states"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListRealTimeManagementStatesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListRealTimeManagementStatesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListRealTimeManagementStatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListRealTimeManagementStatesResponse>() {
    @java.lang.Override
    public ListRealTimeManagementStatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListRealTimeManagementStatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListRealTimeManagementStatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListRealTimeManagementStatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

