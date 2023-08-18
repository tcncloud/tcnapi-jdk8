// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request for UpdateDashboardQueuePreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.UpdateDashboardQueuePreferencesRequest}
 */
public final class UpdateDashboardQueuePreferencesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateDashboardQueuePreferencesRequest)
    UpdateDashboardQueuePreferencesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDashboardQueuePreferencesRequest.newBuilder() to construct.
  private UpdateDashboardQueuePreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDashboardQueuePreferencesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateDashboardQueuePreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateDashboardQueuePreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateDashboardQueuePreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DASHBOARD_QUEUE_PREFERENCES_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences dashboardQueuePreferences_;
  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
   * @return Whether the dashboardQueuePreferences field is set.
   */
  @java.lang.Override
  public boolean hasDashboardQueuePreferences() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
   * @return The dashboardQueuePreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences getDashboardQueuePreferences() {
    return dashboardQueuePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
  }
  /**
   * <pre>
   * The preferences to be updated.
   * </pre>
   *
   * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferencesOrBuilder getDashboardQueuePreferencesOrBuilder() {
    return dashboardQueuePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 10;
  private com.google.protobuf.FieldMask fieldMask_;
  /**
   * <pre>
   * The mask indicating which fields.
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
   * The mask indicating which fields.
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
   * The mask indicating which fields.
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
      output.writeMessage(2, getDashboardQueuePreferences());
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
        .computeMessageSize(2, getDashboardQueuePreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest other = (com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest) obj;

    if (hasDashboardQueuePreferences() != other.hasDashboardQueuePreferences()) return false;
    if (hasDashboardQueuePreferences()) {
      if (!getDashboardQueuePreferences()
          .equals(other.getDashboardQueuePreferences())) return false;
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
    if (hasDashboardQueuePreferences()) {
      hash = (37 * hash) + DASHBOARD_QUEUE_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getDashboardQueuePreferences().hashCode();
    }
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest prototype) {
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
   * Request for UpdateDashboardQueuePreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.UpdateDashboardQueuePreferencesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateDashboardQueuePreferencesRequest)
      com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateDashboardQueuePreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateDashboardQueuePreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.class, com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.newBuilder()
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
        getDashboardQueuePreferencesFieldBuilder();
        getFieldMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dashboardQueuePreferences_ = null;
      if (dashboardQueuePreferencesBuilder_ != null) {
        dashboardQueuePreferencesBuilder_.dispose();
        dashboardQueuePreferencesBuilder_ = null;
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
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_UpdateDashboardQueuePreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest build() {
      com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest result = new com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dashboardQueuePreferences_ = dashboardQueuePreferencesBuilder_ == null
            ? dashboardQueuePreferences_
            : dashboardQueuePreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest.getDefaultInstance()) return this;
      if (other.hasDashboardQueuePreferences()) {
        mergeDashboardQueuePreferences(other.getDashboardQueuePreferences());
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
            case 18: {
              input.readMessage(
                  getDashboardQueuePreferencesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 18
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

    private com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences dashboardQueuePreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferencesOrBuilder> dashboardQueuePreferencesBuilder_;
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     * @return Whether the dashboardQueuePreferences field is set.
     */
    public boolean hasDashboardQueuePreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     * @return The dashboardQueuePreferences.
     */
    public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences getDashboardQueuePreferences() {
      if (dashboardQueuePreferencesBuilder_ == null) {
        return dashboardQueuePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
      } else {
        return dashboardQueuePreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     */
    public Builder setDashboardQueuePreferences(com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences value) {
      if (dashboardQueuePreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dashboardQueuePreferences_ = value;
      } else {
        dashboardQueuePreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     */
    public Builder setDashboardQueuePreferences(
        com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder builderForValue) {
      if (dashboardQueuePreferencesBuilder_ == null) {
        dashboardQueuePreferences_ = builderForValue.build();
      } else {
        dashboardQueuePreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     */
    public Builder mergeDashboardQueuePreferences(com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences value) {
      if (dashboardQueuePreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dashboardQueuePreferences_ != null &&
          dashboardQueuePreferences_ != com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance()) {
          getDashboardQueuePreferencesBuilder().mergeFrom(value);
        } else {
          dashboardQueuePreferences_ = value;
        }
      } else {
        dashboardQueuePreferencesBuilder_.mergeFrom(value);
      }
      if (dashboardQueuePreferences_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     */
    public Builder clearDashboardQueuePreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dashboardQueuePreferences_ = null;
      if (dashboardQueuePreferencesBuilder_ != null) {
        dashboardQueuePreferencesBuilder_.dispose();
        dashboardQueuePreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder getDashboardQueuePreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDashboardQueuePreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferencesOrBuilder getDashboardQueuePreferencesOrBuilder() {
      if (dashboardQueuePreferencesBuilder_ != null) {
        return dashboardQueuePreferencesBuilder_.getMessageOrBuilder();
      } else {
        return dashboardQueuePreferences_ == null ?
            com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
      }
    }
    /**
     * <pre>
     * The preferences to be updated.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 2 [json_name = "dashboardQueuePreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferencesOrBuilder> 
        getDashboardQueuePreferencesFieldBuilder() {
      if (dashboardQueuePreferencesBuilder_ == null) {
        dashboardQueuePreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferencesOrBuilder>(
                getDashboardQueuePreferences(),
                getParentForChildren(),
                isClean());
        dashboardQueuePreferences_ = null;
      }
      return dashboardQueuePreferencesBuilder_;
    }

    private com.google.protobuf.FieldMask fieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <pre>
     * The mask indicating which fields.
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
     * The mask indicating which fields.
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
     * The mask indicating which fields.
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
     * The mask indicating which fields.
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
     * The mask indicating which fields.
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
     * The mask indicating which fields.
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
     * The mask indicating which fields.
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
     * The mask indicating which fields.
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
     * The mask indicating which fields.
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateDashboardQueuePreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateDashboardQueuePreferencesRequest)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDashboardQueuePreferencesRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDashboardQueuePreferencesRequest>() {
    @java.lang.Override
    public UpdateDashboardQueuePreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDashboardQueuePreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDashboardQueuePreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateDashboardQueuePreferencesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

