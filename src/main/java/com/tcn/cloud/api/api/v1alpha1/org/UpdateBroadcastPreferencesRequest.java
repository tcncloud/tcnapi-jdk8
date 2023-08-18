// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request for the UpdateBroadcastPreferences RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateBroadcastPreferencesRequest}
 */
public final class UpdateBroadcastPreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateBroadcastPreferencesRequest)
    UpdateBroadcastPreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBroadcastPreferencesRequest.newBuilder() to construct.
  private UpdateBroadcastPreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBroadcastPreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBroadcastPreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateBroadcastPreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateBroadcastPreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int BROADCAST_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.BroadcastPreferences broadcastPreferences_;
  /**
   * <pre>
   * Broadcast preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
   * @return Whether the broadcastPreferences field is set.
   */
  @java.lang.Override
  public boolean hasBroadcastPreferences() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Broadcast preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
   * @return The broadcastPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.BroadcastPreferences getBroadcastPreferences() {
    return broadcastPreferences_ == null ? com.tcn.cloud.api.api.commons.org.BroadcastPreferences.getDefaultInstance() : broadcastPreferences_;
  }
  /**
   * <pre>
   * Broadcast preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.BroadcastPreferencesOrBuilder getBroadcastPreferencesOrBuilder() {
    return broadcastPreferences_ == null ? com.tcn.cloud.api.api.commons.org.BroadcastPreferences.getDefaultInstance() : broadcastPreferences_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getBroadcastPreferences());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(10, getFieldMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBroadcastPreferences());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest) obj;

    if (hasBroadcastPreferences() != other.hasBroadcastPreferences()) return false;
    if (hasBroadcastPreferences()) {
      if (!getBroadcastPreferences()
          .equals(other.getBroadcastPreferences())) return false;
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
    if (hasBroadcastPreferences()) {
      hash = (37 * hash) + BROADCAST_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getBroadcastPreferences().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest prototype) {
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
   * Request for the UpdateBroadcastPreferences RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateBroadcastPreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateBroadcastPreferencesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateBroadcastPreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateBroadcastPreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getBroadcastPreferencesFieldBuilder();
        getFieldMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      broadcastPreferences_ = null;
      if (broadcastPreferencesBuilder_ != null) {
        broadcastPreferencesBuilder_.dispose();
        broadcastPreferencesBuilder_ = null;
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
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_UpdateBroadcastPreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.broadcastPreferences_ = broadcastPreferencesBuilder_ == null
            ? broadcastPreferences_
            : broadcastPreferencesBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldMask_ = fieldMaskBuilder_ == null
            ? fieldMask_
            : fieldMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest.getDefaultInstance()) return this;
      if (other.hasBroadcastPreferences()) {
        mergeBroadcastPreferences(other.getBroadcastPreferences());
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
                  getBroadcastPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.org.BroadcastPreferences broadcastPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.BroadcastPreferences, com.tcn.cloud.api.api.commons.org.BroadcastPreferences.Builder, com.tcn.cloud.api.api.commons.org.BroadcastPreferencesOrBuilder> broadcastPreferencesBuilder_;
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     * @return Whether the broadcastPreferences field is set.
     */
    public boolean hasBroadcastPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     * @return The broadcastPreferences.
     */
    public com.tcn.cloud.api.api.commons.org.BroadcastPreferences getBroadcastPreferences() {
      if (broadcastPreferencesBuilder_ == null) {
        return broadcastPreferences_ == null ? com.tcn.cloud.api.api.commons.org.BroadcastPreferences.getDefaultInstance() : broadcastPreferences_;
      } else {
        return broadcastPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     */
    public Builder setBroadcastPreferences(com.tcn.cloud.api.api.commons.org.BroadcastPreferences value) {
      if (broadcastPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        broadcastPreferences_ = value;
      } else {
        broadcastPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     */
    public Builder setBroadcastPreferences(
        com.tcn.cloud.api.api.commons.org.BroadcastPreferences.Builder builderForValue) {
      if (broadcastPreferencesBuilder_ == null) {
        broadcastPreferences_ = builderForValue.build();
      } else {
        broadcastPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     */
    public Builder mergeBroadcastPreferences(com.tcn.cloud.api.api.commons.org.BroadcastPreferences value) {
      if (broadcastPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          broadcastPreferences_ != null &&
          broadcastPreferences_ != com.tcn.cloud.api.api.commons.org.BroadcastPreferences.getDefaultInstance()) {
          getBroadcastPreferencesBuilder().mergeFrom(value);
        } else {
          broadcastPreferences_ = value;
        }
      } else {
        broadcastPreferencesBuilder_.mergeFrom(value);
      }
      if (broadcastPreferences_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     */
    public Builder clearBroadcastPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      broadcastPreferences_ = null;
      if (broadcastPreferencesBuilder_ != null) {
        broadcastPreferencesBuilder_.dispose();
        broadcastPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.BroadcastPreferences.Builder getBroadcastPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBroadcastPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.BroadcastPreferencesOrBuilder getBroadcastPreferencesOrBuilder() {
      if (broadcastPreferencesBuilder_ != null) {
        return broadcastPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return broadcastPreferences_ == null ?
            com.tcn.cloud.api.api.commons.org.BroadcastPreferences.getDefaultInstance() : broadcastPreferences_;
      }
    }
    /**
     * <pre>
     * Broadcast preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.BroadcastPreferences broadcast_preferences = 1 [json_name = "broadcastPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.BroadcastPreferences, com.tcn.cloud.api.api.commons.org.BroadcastPreferences.Builder, com.tcn.cloud.api.api.commons.org.BroadcastPreferencesOrBuilder> 
        getBroadcastPreferencesFieldBuilder() {
      if (broadcastPreferencesBuilder_ == null) {
        broadcastPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.BroadcastPreferences, com.tcn.cloud.api.api.commons.org.BroadcastPreferences.Builder, com.tcn.cloud.api.api.commons.org.BroadcastPreferencesOrBuilder>(
                getBroadcastPreferences(),
                getParentForChildren(),
                isClean());
        broadcastPreferences_ = null;
      }
      return broadcastPreferencesBuilder_;
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
      if (fieldMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateBroadcastPreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateBroadcastPreferencesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBroadcastPreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBroadcastPreferencesRequest>() {
    @java.lang.Override
    public UpdateBroadcastPreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateBroadcastPreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBroadcastPreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateBroadcastPreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

