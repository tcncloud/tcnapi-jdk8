// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.ClientHistoryCacheInfo}
 */
public final class ClientHistoryCacheInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.ClientHistoryCacheInfo)
    ClientHistoryCacheInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientHistoryCacheInfo.newBuilder() to construct.
  private ClientHistoryCacheInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientHistoryCacheInfo() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientHistoryCacheInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_ClientHistoryCacheInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_ClientHistoryCacheInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo.class, com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo.Builder.class);
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   * <pre>
   * Current state that a client's cache is at.
   * </pre>
   *
   * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * Current state that a client's cache is at.
   * </pre>
   *
   * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.HistoryCacheState getState() {
    com.tcn.cloud.api.api.commons.HistoryCacheState result = com.tcn.cloud.api.api.commons.HistoryCacheState.forNumber(state_);
    return result == null ? com.tcn.cloud.api.api.commons.HistoryCacheState.UNRECOGNIZED : result;
  }

  public static final int PROGRESS_PERCENTAGE_FIELD_NUMBER = 2;
  private int progressPercentage_ = 0;
  /**
   * <pre>
   * Percentage estimate of how much of the cache has been loaded.
   * </pre>
   *
   * <code>int32 progress_percentage = 2 [json_name = "progressPercentage"];</code>
   * @return The progressPercentage.
   */
  @java.lang.Override
  public int getProgressPercentage() {
    return progressPercentage_;
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
    if (state_ != com.tcn.cloud.api.api.commons.HistoryCacheState.NOT_LOADED.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (progressPercentage_ != 0) {
      output.writeInt32(2, progressPercentage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.tcn.cloud.api.api.commons.HistoryCacheState.NOT_LOADED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    if (progressPercentage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, progressPercentage_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo other = (com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo) obj;

    if (state_ != other.state_) return false;
    if (getProgressPercentage()
        != other.getProgressPercentage()) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + PROGRESS_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getProgressPercentage();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo prototype) {
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
   * Protobuf type {@code api.commons.ClientHistoryCacheInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.ClientHistoryCacheInfo)
      com.tcn.cloud.api.api.commons.ClientHistoryCacheInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_ClientHistoryCacheInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_ClientHistoryCacheInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo.class, com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo.newBuilder()
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
      state_ = 0;
      progressPercentage_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_ClientHistoryCacheInfo_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo build() {
      com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo buildPartial() {
      com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo result = new com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.progressPercentage_ = progressPercentage_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo) {
        return mergeFrom((com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo other) {
      if (other == com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getProgressPercentage() != 0) {
        setProgressPercentage(other.getProgressPercentage());
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
              state_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              progressPercentage_ = input.readInt32();
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

    private int state_ = 0;
    /**
     * <pre>
     * Current state that a client's cache is at.
     * </pre>
     *
     * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * Current state that a client's cache is at.
     * </pre>
     *
     * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Current state that a client's cache is at.
     * </pre>
     *
     * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.HistoryCacheState getState() {
      com.tcn.cloud.api.api.commons.HistoryCacheState result = com.tcn.cloud.api.api.commons.HistoryCacheState.forNumber(state_);
      return result == null ? com.tcn.cloud.api.api.commons.HistoryCacheState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Current state that a client's cache is at.
     * </pre>
     *
     * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.tcn.cloud.api.api.commons.HistoryCacheState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Current state that a client's cache is at.
     * </pre>
     *
     * <code>.api.commons.HistoryCacheState state = 1 [json_name = "state"];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
      onChanged();
      return this;
    }

    private int progressPercentage_ ;
    /**
     * <pre>
     * Percentage estimate of how much of the cache has been loaded.
     * </pre>
     *
     * <code>int32 progress_percentage = 2 [json_name = "progressPercentage"];</code>
     * @return The progressPercentage.
     */
    @java.lang.Override
    public int getProgressPercentage() {
      return progressPercentage_;
    }
    /**
     * <pre>
     * Percentage estimate of how much of the cache has been loaded.
     * </pre>
     *
     * <code>int32 progress_percentage = 2 [json_name = "progressPercentage"];</code>
     * @param value The progressPercentage to set.
     * @return This builder for chaining.
     */
    public Builder setProgressPercentage(int value) {

      progressPercentage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Percentage estimate of how much of the cache has been loaded.
     * </pre>
     *
     * <code>int32 progress_percentage = 2 [json_name = "progressPercentage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProgressPercentage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      progressPercentage_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.ClientHistoryCacheInfo)
  }

  // @@protoc_insertion_point(class_scope:api.commons.ClientHistoryCacheInfo)
  private static final com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo();
  }

  public static com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientHistoryCacheInfo>
      PARSER = new com.google.protobuf.AbstractParser<ClientHistoryCacheInfo>() {
    @java.lang.Override
    public ClientHistoryCacheInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientHistoryCacheInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientHistoryCacheInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ClientHistoryCacheInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

