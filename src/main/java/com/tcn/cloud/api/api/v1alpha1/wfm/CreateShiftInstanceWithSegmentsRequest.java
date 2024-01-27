// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreateShiftInstanceWithSegments RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest}
 */
public final class CreateShiftInstanceWithSegmentsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest)
    CreateShiftInstanceWithSegmentsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateShiftInstanceWithSegmentsRequest.newBuilder() to construct.
  private CreateShiftInstanceWithSegmentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateShiftInstanceWithSegmentsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateShiftInstanceWithSegmentsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftInstanceWithSegmentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftInstanceWithSegmentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest.Builder.class);
  }

  public static final int SHIFT_INSTANCE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance shiftInstance_;
  /**
   * <pre>
   * Shift instance with any member shift segments and shift segment call stats to create.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   * @return Whether the shiftInstance field is set.
   */
  @java.lang.Override
  public boolean hasShiftInstance() {
    return shiftInstance_ != null;
  }
  /**
   * <pre>
   * Shift instance with any member shift segments and shift segment call stats to create.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   * @return The shiftInstance.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance getShiftInstance() {
    return shiftInstance_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.getDefaultInstance() : shiftInstance_;
  }
  /**
   * <pre>
   * Shift instance with any member shift segments and shift segment call stats to create.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder getShiftInstanceOrBuilder() {
    return shiftInstance_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.getDefaultInstance() : shiftInstance_;
  }

  public static final int IGNORE_DIAGNOSTICS_ERRORS_FIELD_NUMBER = 2;
  private boolean ignoreDiagnosticsErrors_ = false;
  /**
   * <pre>
   * If set to true, it will create the shift regardless of any diagnostics errors,
   * otherwise it will return those diagnostic errors and not create the shift.
   * </pre>
   *
   * <code>bool ignore_diagnostics_errors = 2 [json_name = "ignoreDiagnosticsErrors"];</code>
   * @return The ignoreDiagnosticsErrors.
   */
  @java.lang.Override
  public boolean getIgnoreDiagnosticsErrors() {
    return ignoreDiagnosticsErrors_;
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
    if (shiftInstance_ != null) {
      output.writeMessage(1, getShiftInstance());
    }
    if (ignoreDiagnosticsErrors_ != false) {
      output.writeBool(2, ignoreDiagnosticsErrors_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shiftInstance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getShiftInstance());
    }
    if (ignoreDiagnosticsErrors_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ignoreDiagnosticsErrors_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest) obj;

    if (hasShiftInstance() != other.hasShiftInstance()) return false;
    if (hasShiftInstance()) {
      if (!getShiftInstance()
          .equals(other.getShiftInstance())) return false;
    }
    if (getIgnoreDiagnosticsErrors()
        != other.getIgnoreDiagnosticsErrors()) return false;
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
    if (hasShiftInstance()) {
      hash = (37 * hash) + SHIFT_INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getShiftInstance().hashCode();
    }
    hash = (37 * hash) + IGNORE_DIAGNOSTICS_ERRORS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreDiagnosticsErrors());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest prototype) {
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
   * Request message for the CreateShiftInstanceWithSegments RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftInstanceWithSegmentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftInstanceWithSegmentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest.newBuilder()
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
      shiftInstance_ = null;
      if (shiftInstanceBuilder_ != null) {
        shiftInstanceBuilder_.dispose();
        shiftInstanceBuilder_ = null;
      }
      ignoreDiagnosticsErrors_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateShiftInstanceWithSegmentsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shiftInstance_ = shiftInstanceBuilder_ == null
            ? shiftInstance_
            : shiftInstanceBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ignoreDiagnosticsErrors_ = ignoreDiagnosticsErrors_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest.getDefaultInstance()) return this;
      if (other.hasShiftInstance()) {
        mergeShiftInstance(other.getShiftInstance());
      }
      if (other.getIgnoreDiagnosticsErrors() != false) {
        setIgnoreDiagnosticsErrors(other.getIgnoreDiagnosticsErrors());
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
                  getShiftInstanceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              ignoreDiagnosticsErrors_ = input.readBool();
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance shiftInstance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder> shiftInstanceBuilder_;
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     * @return Whether the shiftInstance field is set.
     */
    public boolean hasShiftInstance() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     * @return The shiftInstance.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance getShiftInstance() {
      if (shiftInstanceBuilder_ == null) {
        return shiftInstance_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.getDefaultInstance() : shiftInstance_;
      } else {
        return shiftInstanceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     */
    public Builder setShiftInstance(com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance value) {
      if (shiftInstanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shiftInstance_ = value;
      } else {
        shiftInstanceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     */
    public Builder setShiftInstance(
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.Builder builderForValue) {
      if (shiftInstanceBuilder_ == null) {
        shiftInstance_ = builderForValue.build();
      } else {
        shiftInstanceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     */
    public Builder mergeShiftInstance(com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance value) {
      if (shiftInstanceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          shiftInstance_ != null &&
          shiftInstance_ != com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.getDefaultInstance()) {
          getShiftInstanceBuilder().mergeFrom(value);
        } else {
          shiftInstance_ = value;
        }
      } else {
        shiftInstanceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     */
    public Builder clearShiftInstance() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shiftInstance_ = null;
      if (shiftInstanceBuilder_ != null) {
        shiftInstanceBuilder_.dispose();
        shiftInstanceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.Builder getShiftInstanceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getShiftInstanceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder getShiftInstanceOrBuilder() {
      if (shiftInstanceBuilder_ != null) {
        return shiftInstanceBuilder_.getMessageOrBuilder();
      } else {
        return shiftInstance_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.getDefaultInstance() : shiftInstance_;
      }
    }
    /**
     * <pre>
     * Shift instance with any member shift segments and shift segment call stats to create.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder> 
        getShiftInstanceFieldBuilder() {
      if (shiftInstanceBuilder_ == null) {
        shiftInstanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder>(
                getShiftInstance(),
                getParentForChildren(),
                isClean());
        shiftInstance_ = null;
      }
      return shiftInstanceBuilder_;
    }

    private boolean ignoreDiagnosticsErrors_ ;
    /**
     * <pre>
     * If set to true, it will create the shift regardless of any diagnostics errors,
     * otherwise it will return those diagnostic errors and not create the shift.
     * </pre>
     *
     * <code>bool ignore_diagnostics_errors = 2 [json_name = "ignoreDiagnosticsErrors"];</code>
     * @return The ignoreDiagnosticsErrors.
     */
    @java.lang.Override
    public boolean getIgnoreDiagnosticsErrors() {
      return ignoreDiagnosticsErrors_;
    }
    /**
     * <pre>
     * If set to true, it will create the shift regardless of any diagnostics errors,
     * otherwise it will return those diagnostic errors and not create the shift.
     * </pre>
     *
     * <code>bool ignore_diagnostics_errors = 2 [json_name = "ignoreDiagnosticsErrors"];</code>
     * @param value The ignoreDiagnosticsErrors to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreDiagnosticsErrors(boolean value) {

      ignoreDiagnosticsErrors_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set to true, it will create the shift regardless of any diagnostics errors,
     * otherwise it will return those diagnostic errors and not create the shift.
     * </pre>
     *
     * <code>bool ignore_diagnostics_errors = 2 [json_name = "ignoreDiagnosticsErrors"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIgnoreDiagnosticsErrors() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ignoreDiagnosticsErrors_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateShiftInstanceWithSegmentsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateShiftInstanceWithSegmentsRequest>() {
    @java.lang.Override
    public CreateShiftInstanceWithSegmentsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateShiftInstanceWithSegmentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateShiftInstanceWithSegmentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateShiftInstanceWithSegmentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

