// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response for the GetDashboardQueuePreferences RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.GetDashboardQueuePreferencesResponse}
 */
public final class GetDashboardQueuePreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.GetDashboardQueuePreferencesResponse)
    GetDashboardQueuePreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDashboardQueuePreferencesResponse.newBuilder() to construct.
  private GetDashboardQueuePreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDashboardQueuePreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDashboardQueuePreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetDashboardQueuePreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetDashboardQueuePreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DASHBOARD_QUEUE_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences dashboardQueuePreferences_;
  /**
   * <pre>
   * Dashboard queue preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   * @return Whether the dashboardQueuePreferences field is set.
   */
  @java.lang.Override
  public boolean hasDashboardQueuePreferences() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Dashboard queue preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   * @return The dashboardQueuePreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences getDashboardQueuePreferences() {
    return dashboardQueuePreferences_ == null ? com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
  }
  /**
   * <pre>
   * Dashboard queue preferences entity.
   * </pre>
   *
   * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.DashboardQueuePreferencesOrBuilder getDashboardQueuePreferencesOrBuilder() {
    return dashboardQueuePreferences_ == null ? com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
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
      output.writeMessage(1, getDashboardQueuePreferences());
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
        .computeMessageSize(1, getDashboardQueuePreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse) obj;

    if (hasDashboardQueuePreferences() != other.hasDashboardQueuePreferences()) return false;
    if (hasDashboardQueuePreferences()) {
      if (!getDashboardQueuePreferences()
          .equals(other.getDashboardQueuePreferences())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse prototype) {
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
   * Response for the GetDashboardQueuePreferences RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.GetDashboardQueuePreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.GetDashboardQueuePreferencesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetDashboardQueuePreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetDashboardQueuePreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_GetDashboardQueuePreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dashboardQueuePreferences_ = dashboardQueuePreferencesBuilder_ == null
            ? dashboardQueuePreferences_
            : dashboardQueuePreferencesBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse.getDefaultInstance()) return this;
      if (other.hasDashboardQueuePreferences()) {
        mergeDashboardQueuePreferences(other.getDashboardQueuePreferences());
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
                  getDashboardQueuePreferencesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences dashboardQueuePreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences, com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.Builder, com.tcn.cloud.api.api.commons.org.DashboardQueuePreferencesOrBuilder> dashboardQueuePreferencesBuilder_;
    /**
     * <pre>
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     * @return Whether the dashboardQueuePreferences field is set.
     */
    public boolean hasDashboardQueuePreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     * @return The dashboardQueuePreferences.
     */
    public com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences getDashboardQueuePreferences() {
      if (dashboardQueuePreferencesBuilder_ == null) {
        return dashboardQueuePreferences_ == null ? com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
      } else {
        return dashboardQueuePreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     */
    public Builder setDashboardQueuePreferences(com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences value) {
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
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     */
    public Builder setDashboardQueuePreferences(
        com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.Builder builderForValue) {
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
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     */
    public Builder mergeDashboardQueuePreferences(com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences value) {
      if (dashboardQueuePreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dashboardQueuePreferences_ != null &&
          dashboardQueuePreferences_ != com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.getDefaultInstance()) {
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
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
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
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.Builder getDashboardQueuePreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDashboardQueuePreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DashboardQueuePreferencesOrBuilder getDashboardQueuePreferencesOrBuilder() {
      if (dashboardQueuePreferencesBuilder_ != null) {
        return dashboardQueuePreferencesBuilder_.getMessageOrBuilder();
      } else {
        return dashboardQueuePreferences_ == null ?
            com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
      }
    }
    /**
     * <pre>
     * Dashboard queue preferences entity.
     * </pre>
     *
     * <code>.api.commons.org.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences, com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.Builder, com.tcn.cloud.api.api.commons.org.DashboardQueuePreferencesOrBuilder> 
        getDashboardQueuePreferencesFieldBuilder() {
      if (dashboardQueuePreferencesBuilder_ == null) {
        dashboardQueuePreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences, com.tcn.cloud.api.api.commons.org.DashboardQueuePreferences.Builder, com.tcn.cloud.api.api.commons.org.DashboardQueuePreferencesOrBuilder>(
                getDashboardQueuePreferences(),
                getParentForChildren(),
                isClean());
        dashboardQueuePreferences_ = null;
      }
      return dashboardQueuePreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.GetDashboardQueuePreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.GetDashboardQueuePreferencesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDashboardQueuePreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDashboardQueuePreferencesResponse>() {
    @java.lang.Override
    public GetDashboardQueuePreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDashboardQueuePreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDashboardQueuePreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.GetDashboardQueuePreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

