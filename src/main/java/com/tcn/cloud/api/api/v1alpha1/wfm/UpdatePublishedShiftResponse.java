// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the UpdatePublishedShift RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.UpdatePublishedShiftResponse}
 */
public final class UpdatePublishedShiftResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.UpdatePublishedShiftResponse)
    UpdatePublishedShiftResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePublishedShiftResponse.newBuilder() to construct.
  private UpdatePublishedShiftResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePublishedShiftResponse() {
    diagnostics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePublishedShiftResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdatePublishedShiftResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdatePublishedShiftResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse.Builder.class);
  }

  public static final int SHIFT_INSTANCE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance shiftInstance_;
  /**
   * <pre>
   * The updated shift instance.
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
   * The updated shift instance.
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
   * The updated shift instance.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ShiftInstance shift_instance = 1 [json_name = "shiftInstance"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstanceOrBuilder getShiftInstanceOrBuilder() {
    return shiftInstance_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.ShiftInstance.getDefaultInstance() : shiftInstance_;
  }

  public static final int DIAGNOSTICS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> diagnostics_;
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> getDiagnosticsList() {
    return diagnostics_;
  }
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
      getDiagnosticsOrBuilderList() {
    return diagnostics_;
  }
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  @java.lang.Override
  public int getDiagnosticsCount() {
    return diagnostics_.size();
  }
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index) {
    return diagnostics_.get(index);
  }
  /**
   * <pre>
   * A list of diagnostics for any errors encountered, which prevented the update.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
      int index) {
    return diagnostics_.get(index);
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
    for (int i = 0; i < diagnostics_.size(); i++) {
      output.writeMessage(2, diagnostics_.get(i));
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
    for (int i = 0; i < diagnostics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, diagnostics_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse other = (com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse) obj;

    if (hasShiftInstance() != other.hasShiftInstance()) return false;
    if (hasShiftInstance()) {
      if (!getShiftInstance()
          .equals(other.getShiftInstance())) return false;
    }
    if (!getDiagnosticsList()
        .equals(other.getDiagnosticsList())) return false;
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
    if (getDiagnosticsCount() > 0) {
      hash = (37 * hash) + DIAGNOSTICS_FIELD_NUMBER;
      hash = (53 * hash) + getDiagnosticsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse prototype) {
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
   * Response message for the UpdatePublishedShift RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.UpdatePublishedShiftResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.UpdatePublishedShiftResponse)
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdatePublishedShiftResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdatePublishedShiftResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse.newBuilder()
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
      if (diagnosticsBuilder_ == null) {
        diagnostics_ = java.util.Collections.emptyList();
      } else {
        diagnostics_ = null;
        diagnosticsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpdatePublishedShiftResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse result = new com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse result) {
      if (diagnosticsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          diagnostics_ = java.util.Collections.unmodifiableList(diagnostics_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.diagnostics_ = diagnostics_;
      } else {
        result.diagnostics_ = diagnosticsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shiftInstance_ = shiftInstanceBuilder_ == null
            ? shiftInstance_
            : shiftInstanceBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse.getDefaultInstance()) return this;
      if (other.hasShiftInstance()) {
        mergeShiftInstance(other.getShiftInstance());
      }
      if (diagnosticsBuilder_ == null) {
        if (!other.diagnostics_.isEmpty()) {
          if (diagnostics_.isEmpty()) {
            diagnostics_ = other.diagnostics_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDiagnosticsIsMutable();
            diagnostics_.addAll(other.diagnostics_);
          }
          onChanged();
        }
      } else {
        if (!other.diagnostics_.isEmpty()) {
          if (diagnosticsBuilder_.isEmpty()) {
            diagnosticsBuilder_.dispose();
            diagnosticsBuilder_ = null;
            diagnostics_ = other.diagnostics_;
            bitField0_ = (bitField0_ & ~0x00000002);
            diagnosticsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDiagnosticsFieldBuilder() : null;
          } else {
            diagnosticsBuilder_.addAllMessages(other.diagnostics_);
          }
        }
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
            case 18: {
              com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.parser(),
                      extensionRegistry);
              if (diagnosticsBuilder_ == null) {
                ensureDiagnosticsIsMutable();
                diagnostics_.add(m);
              } else {
                diagnosticsBuilder_.addMessage(m);
              }
              break;
            } // case 18
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
     * The updated shift instance.
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
     * The updated shift instance.
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
     * The updated shift instance.
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
     * The updated shift instance.
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
     * The updated shift instance.
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
     * The updated shift instance.
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
     * The updated shift instance.
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
     * The updated shift instance.
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
     * The updated shift instance.
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> diagnostics_ =
      java.util.Collections.emptyList();
    private void ensureDiagnosticsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        diagnostics_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic>(diagnostics_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic, com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> diagnosticsBuilder_;

    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> getDiagnosticsList() {
      if (diagnosticsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(diagnostics_);
      } else {
        return diagnosticsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public int getDiagnosticsCount() {
      if (diagnosticsBuilder_ == null) {
        return diagnostics_.size();
      } else {
        return diagnosticsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic getDiagnostics(int index) {
      if (diagnosticsBuilder_ == null) {
        return diagnostics_.get(index);
      } else {
        return diagnosticsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder setDiagnostics(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic value) {
      if (diagnosticsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiagnosticsIsMutable();
        diagnostics_.set(index, value);
        onChanged();
      } else {
        diagnosticsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder setDiagnostics(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder builderForValue) {
      if (diagnosticsBuilder_ == null) {
        ensureDiagnosticsIsMutable();
        diagnostics_.set(index, builderForValue.build());
        onChanged();
      } else {
        diagnosticsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder addDiagnostics(com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic value) {
      if (diagnosticsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiagnosticsIsMutable();
        diagnostics_.add(value);
        onChanged();
      } else {
        diagnosticsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder addDiagnostics(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic value) {
      if (diagnosticsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiagnosticsIsMutable();
        diagnostics_.add(index, value);
        onChanged();
      } else {
        diagnosticsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder addDiagnostics(
        com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder builderForValue) {
      if (diagnosticsBuilder_ == null) {
        ensureDiagnosticsIsMutable();
        diagnostics_.add(builderForValue.build());
        onChanged();
      } else {
        diagnosticsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder addDiagnostics(
        int index, com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder builderForValue) {
      if (diagnosticsBuilder_ == null) {
        ensureDiagnosticsIsMutable();
        diagnostics_.add(index, builderForValue.build());
        onChanged();
      } else {
        diagnosticsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder addAllDiagnostics(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic> values) {
      if (diagnosticsBuilder_ == null) {
        ensureDiagnosticsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, diagnostics_);
        onChanged();
      } else {
        diagnosticsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder clearDiagnostics() {
      if (diagnosticsBuilder_ == null) {
        diagnostics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        diagnosticsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public Builder removeDiagnostics(int index) {
      if (diagnosticsBuilder_ == null) {
        ensureDiagnosticsIsMutable();
        diagnostics_.remove(index);
        onChanged();
      } else {
        diagnosticsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder getDiagnosticsBuilder(
        int index) {
      return getDiagnosticsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder getDiagnosticsOrBuilder(
        int index) {
      if (diagnosticsBuilder_ == null) {
        return diagnostics_.get(index);  } else {
        return diagnosticsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
         getDiagnosticsOrBuilderList() {
      if (diagnosticsBuilder_ != null) {
        return diagnosticsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(diagnostics_);
      }
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder addDiagnosticsBuilder() {
      return getDiagnosticsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder addDiagnosticsBuilder(
        int index) {
      return getDiagnosticsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.getDefaultInstance());
    }
    /**
     * <pre>
     * A list of diagnostics for any errors encountered, which prevented the update.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.wfm.Diagnostic diagnostics = 2 [json_name = "diagnostics"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder> 
         getDiagnosticsBuilderList() {
      return getDiagnosticsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic, com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder> 
        getDiagnosticsFieldBuilder() {
      if (diagnosticsBuilder_ == null) {
        diagnosticsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic, com.tcn.cloud.api.api.v1alpha1.wfm.Diagnostic.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.DiagnosticOrBuilder>(
                diagnostics_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        diagnostics_ = null;
      }
      return diagnosticsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.UpdatePublishedShiftResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.UpdatePublishedShiftResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePublishedShiftResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePublishedShiftResponse>() {
    @java.lang.Override
    public UpdatePublishedShiftResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePublishedShiftResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePublishedShiftResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.UpdatePublishedShiftResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

