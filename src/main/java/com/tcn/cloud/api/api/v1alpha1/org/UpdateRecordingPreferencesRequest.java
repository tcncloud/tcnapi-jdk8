// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request for the UpdateRecordingPreferences RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateRecordingPreferencesRequest}
 */
public final class UpdateRecordingPreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateRecordingPreferencesRequest)
    UpdateRecordingPreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateRecordingPreferencesRequest.newBuilder() to construct.
  private UpdateRecordingPreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateRecordingPreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateRecordingPreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateRecordingPreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateRecordingPreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.Builder.class);
  }

  public static final int RECORDING_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.RecordingPreferences recordingPreferences_;
  /**
   * <pre>
   * Recording preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
   * @return Whether the recordingPreferences field is set.
   */
  @java.lang.Override
  public boolean hasRecordingPreferences() {
    return recordingPreferences_ != null;
  }
  /**
   * <pre>
   * Recording preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
   * @return The recordingPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.RecordingPreferences getRecordingPreferences() {
    return recordingPreferences_ == null ? com.tcn.cloud.api.api.commons.org.RecordingPreferences.getDefaultInstance() : recordingPreferences_;
  }
  /**
   * <pre>
   * Recording preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.RecordingPreferencesOrBuilder getRecordingPreferencesOrBuilder() {
    return recordingPreferences_ == null ? com.tcn.cloud.api.api.commons.org.RecordingPreferences.getDefaultInstance() : recordingPreferences_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 10;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  @java.lang.Override
  public boolean hasFieldMask() {
    return fieldMask_ != null;
  }
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFieldMask() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <pre>
   * Field mask for filtering each field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
    return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
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
    if (recordingPreferences_ != null) {
      output.writeMessage(1, getRecordingPreferences());
    }
    if (fieldMask_ != null) {
      output.writeMessage(10, getFieldMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recordingPreferences_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecordingPreferences());
    }
    if (fieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getFieldMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest) obj;

    if (hasRecordingPreferences() != other.hasRecordingPreferences()) return false;
    if (hasRecordingPreferences()) {
      if (!getRecordingPreferences()
          .equals(other.getRecordingPreferences())) return false;
    }
    if (hasFieldMask() != other.hasFieldMask()) return false;
    if (hasFieldMask()) {
      if (!getFieldMask()
          .equals(other.getFieldMask())) return false;
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
    if (hasRecordingPreferences()) {
      hash = (37 * hash) + RECORDING_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getRecordingPreferences().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest prototype) {
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
   * Request for the UpdateRecordingPreferences RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateRecordingPreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateRecordingPreferencesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateRecordingPreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateRecordingPreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.newBuilder()
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
      recordingPreferences_ = null;
      if (recordingPreferencesBuilder_ != null) {
        recordingPreferencesBuilder_.dispose();
        recordingPreferencesBuilder_ = null;
      }
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateRecordingPreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.recordingPreferences_ = recordingPreferencesBuilder_ == null
            ? recordingPreferences_
            : recordingPreferencesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest.getDefaultInstance()) return this;
      if (other.hasRecordingPreferences()) {
        mergeRecordingPreferences(other.getRecordingPreferences());
      }
      if (other.hasFieldMask()) {
        mergeFieldMask(other.getFieldMask());
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
                  getRecordingPreferencesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 82: {
              input.readMessage(
                  getFieldMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 82
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

    private com.tcn.cloud.api.api.commons.org.RecordingPreferences recordingPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.RecordingPreferences, com.tcn.cloud.api.api.commons.org.RecordingPreferences.Builder, com.tcn.cloud.api.api.commons.org.RecordingPreferencesOrBuilder> recordingPreferencesBuilder_;
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     * @return Whether the recordingPreferences field is set.
     */
    public boolean hasRecordingPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     * @return The recordingPreferences.
     */
    public com.tcn.cloud.api.api.commons.org.RecordingPreferences getRecordingPreferences() {
      if (recordingPreferencesBuilder_ == null) {
        return recordingPreferences_ == null ? com.tcn.cloud.api.api.commons.org.RecordingPreferences.getDefaultInstance() : recordingPreferences_;
      } else {
        return recordingPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     */
    public Builder setRecordingPreferences(com.tcn.cloud.api.api.commons.org.RecordingPreferences value) {
      if (recordingPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recordingPreferences_ = value;
      } else {
        recordingPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     */
    public Builder setRecordingPreferences(
        com.tcn.cloud.api.api.commons.org.RecordingPreferences.Builder builderForValue) {
      if (recordingPreferencesBuilder_ == null) {
        recordingPreferences_ = builderForValue.build();
      } else {
        recordingPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     */
    public Builder mergeRecordingPreferences(com.tcn.cloud.api.api.commons.org.RecordingPreferences value) {
      if (recordingPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          recordingPreferences_ != null &&
          recordingPreferences_ != com.tcn.cloud.api.api.commons.org.RecordingPreferences.getDefaultInstance()) {
          getRecordingPreferencesBuilder().mergeFrom(value);
        } else {
          recordingPreferences_ = value;
        }
      } else {
        recordingPreferencesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     */
    public Builder clearRecordingPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      recordingPreferences_ = null;
      if (recordingPreferencesBuilder_ != null) {
        recordingPreferencesBuilder_.dispose();
        recordingPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.RecordingPreferences.Builder getRecordingPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRecordingPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.RecordingPreferencesOrBuilder getRecordingPreferencesOrBuilder() {
      if (recordingPreferencesBuilder_ != null) {
        return recordingPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return recordingPreferences_ == null ?
            com.tcn.cloud.api.api.commons.org.RecordingPreferences.getDefaultInstance() : recordingPreferences_;
      }
    }
    /**
     * <pre>
     * Recording preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.RecordingPreferences recording_preferences = 1 [json_name = "recordingPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.RecordingPreferences, com.tcn.cloud.api.api.commons.org.RecordingPreferences.Builder, com.tcn.cloud.api.api.commons.org.RecordingPreferencesOrBuilder> 
        getRecordingPreferencesFieldBuilder() {
      if (recordingPreferencesBuilder_ == null) {
        recordingPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.RecordingPreferences, com.tcn.cloud.api.api.commons.org.RecordingPreferences.Builder, com.tcn.cloud.api.api.commons.org.RecordingPreferencesOrBuilder>(
                getRecordingPreferences(),
                getParentForChildren(),
                isClean());
        recordingPreferences_ = null;
      }
      return recordingPreferencesBuilder_;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     * @return Whether the fieldMask field is set.
     */
    public boolean hasFieldMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     * @return The fieldMask.
     */
    public com.google.protobuf.FieldMask getFieldMask() {
      if (fieldMaskBuilder_ == null) {
        return fieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      } else {
        return fieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldMask_ = value;
      } else {
        fieldMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder setFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder mergeFieldMask(com.google.protobuf.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          fieldMask_ != null &&
          fieldMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFieldMaskBuilder().mergeFrom(value);
        } else {
          fieldMask_ = value;
        }
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public Builder clearFieldMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fieldMask_ = null;
      if (fieldMaskBuilder_ != null) {
        fieldMaskBuilder_.dispose();
        fieldMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFieldMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder() {
      if (fieldMaskBuilder_ != null) {
        return fieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return fieldMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : fieldMask_;
      }
    }
    /**
     * <pre>
     * Field mask for filtering each field.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask field_mask = 10 [json_name = "fieldMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFieldMaskFieldBuilder() {
      if (fieldMaskBuilder_ == null) {
        fieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFieldMask(),
                getParentForChildren(),
                isClean());
        fieldMask_ = null;
      }
      return fieldMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateRecordingPreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateRecordingPreferencesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRecordingPreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateRecordingPreferencesRequest>() {
    @java.lang.Override
    public UpdateRecordingPreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateRecordingPreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRecordingPreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateRecordingPreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

