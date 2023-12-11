// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Represents the status of a client's initial setup and progress to use WFM.
 * </pre>
 *
 * Protobuf type {@code api.commons.InitialSetupStatus}
 */
public final class InitialSetupStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.InitialSetupStatus)
    InitialSetupStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InitialSetupStatus.newBuilder() to construct.
  private InitialSetupStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InitialSetupStatus() {
    state_ = 0;
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InitialSetupStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_InitialSetupStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_InitialSetupStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.InitialSetupStatus.class, com.tcn.cloud.api.api.commons.InitialSetupStatus.Builder.class);
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   * <pre>
   * Current state that a client is at.
   * </pre>
   *
   * <code>.api.commons.InitialSetupState state = 1 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * Current state that a client is at.
   * </pre>
   *
   * <code>.api.commons.InitialSetupState state = 1 [json_name = "state"];</code>
   * @return The state.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.InitialSetupState getState() {
    com.tcn.cloud.api.api.commons.InitialSetupState result = com.tcn.cloud.api.api.commons.InitialSetupState.forNumber(state_);
    return result == null ? com.tcn.cloud.api.api.commons.InitialSetupState.UNRECOGNIZED : result;
  }

  public static final int PROGRESS_PERCENTAGE_FIELD_NUMBER = 2;
  private int progressPercentage_ = 0;
  /**
   * <pre>
   * Progress percentage estimate of the setup process.
   * </pre>
   *
   * <code>int32 progress_percentage = 2 [json_name = "progressPercentage"];</code>
   * @return The progressPercentage.
   */
  @java.lang.Override
  public int getProgressPercentage() {
    return progressPercentage_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <pre>
   * Any message that a service has in regards to their current state.
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Any message that a service has in regards to their current state.
   * </pre>
   *
   * <code>string message = 3 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (state_ != com.tcn.cloud.api.api.commons.InitialSetupState.NOT_SETUP.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (progressPercentage_ != 0) {
      output.writeInt32(2, progressPercentage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.tcn.cloud.api.api.commons.InitialSetupState.NOT_SETUP.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    if (progressPercentage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, progressPercentage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.InitialSetupStatus)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.InitialSetupStatus other = (com.tcn.cloud.api.api.commons.InitialSetupStatus) obj;

    if (state_ != other.state_) return false;
    if (getProgressPercentage()
        != other.getProgressPercentage()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.InitialSetupStatus parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.InitialSetupStatus prototype) {
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
   * Represents the status of a client's initial setup and progress to use WFM.
   * </pre>
   *
   * Protobuf type {@code api.commons.InitialSetupStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.InitialSetupStatus)
      com.tcn.cloud.api.api.commons.InitialSetupStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_InitialSetupStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_InitialSetupStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.InitialSetupStatus.class, com.tcn.cloud.api.api.commons.InitialSetupStatus.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.InitialSetupStatus.newBuilder()
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
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_InitialSetupStatus_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.InitialSetupStatus getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.InitialSetupStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.InitialSetupStatus build() {
      com.tcn.cloud.api.api.commons.InitialSetupStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.InitialSetupStatus buildPartial() {
      com.tcn.cloud.api.api.commons.InitialSetupStatus result = new com.tcn.cloud.api.api.commons.InitialSetupStatus(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.InitialSetupStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.progressPercentage_ = progressPercentage_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.message_ = message_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.InitialSetupStatus) {
        return mergeFrom((com.tcn.cloud.api.api.commons.InitialSetupStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.InitialSetupStatus other) {
      if (other == com.tcn.cloud.api.api.commons.InitialSetupStatus.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getProgressPercentage() != 0) {
        setProgressPercentage(other.getProgressPercentage());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000004;
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
              state_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              progressPercentage_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
     * Current state that a client is at.
     * </pre>
     *
     * <code>.api.commons.InitialSetupState state = 1 [json_name = "state"];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * Current state that a client is at.
     * </pre>
     *
     * <code>.api.commons.InitialSetupState state = 1 [json_name = "state"];</code>
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
     * Current state that a client is at.
     * </pre>
     *
     * <code>.api.commons.InitialSetupState state = 1 [json_name = "state"];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.InitialSetupState getState() {
      com.tcn.cloud.api.api.commons.InitialSetupState result = com.tcn.cloud.api.api.commons.InitialSetupState.forNumber(state_);
      return result == null ? com.tcn.cloud.api.api.commons.InitialSetupState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Current state that a client is at.
     * </pre>
     *
     * <code>.api.commons.InitialSetupState state = 1 [json_name = "state"];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.tcn.cloud.api.api.commons.InitialSetupState value) {
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
     * Current state that a client is at.
     * </pre>
     *
     * <code>.api.commons.InitialSetupState state = 1 [json_name = "state"];</code>
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
     * Progress percentage estimate of the setup process.
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
     * Progress percentage estimate of the setup process.
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
     * Progress percentage estimate of the setup process.
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

    private java.lang.Object message_ = "";
    /**
     * <pre>
     * Any message that a service has in regards to their current state.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Any message that a service has in regards to their current state.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Any message that a service has in regards to their current state.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any message that a service has in regards to their current state.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any message that a service has in regards to their current state.
     * </pre>
     *
     * <code>string message = 3 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.commons.InitialSetupStatus)
  }

  // @@protoc_insertion_point(class_scope:api.commons.InitialSetupStatus)
  private static final com.tcn.cloud.api.api.commons.InitialSetupStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.InitialSetupStatus();
  }

  public static com.tcn.cloud.api.api.commons.InitialSetupStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitialSetupStatus>
      PARSER = new com.google.protobuf.AbstractParser<InitialSetupStatus>() {
    @java.lang.Override
    public InitialSetupStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<InitialSetupStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitialSetupStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.InitialSetupStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
