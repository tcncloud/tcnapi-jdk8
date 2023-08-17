// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * <pre>
 * Response for GetDashboardGeneralPreferences
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse}
 */
public final class GetDashboardGeneralPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse)
    GetDashboardGeneralPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDashboardGeneralPreferencesResponse.newBuilder() to construct.
  private GetDashboardGeneralPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDashboardGeneralPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDashboardGeneralPreferencesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetDashboardGeneralPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetDashboardGeneralPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DASHBOARD_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences dashboardPreferences_;
  /**
   * <pre>
   * Dashboard general preferences object
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
   * @return Whether the dashboardPreferences field is set.
   */
  @java.lang.Override
  public boolean hasDashboardPreferences() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Dashboard general preferences object
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
   * @return The dashboardPreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences getDashboardPreferences() {
    return dashboardPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.getDefaultInstance() : dashboardPreferences_;
  }
  /**
   * <pre>
   * Dashboard general preferences object
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferencesOrBuilder getDashboardPreferencesOrBuilder() {
    return dashboardPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.getDefaultInstance() : dashboardPreferences_;
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
      output.writeMessage(1, getDashboardPreferences());
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
        .computeMessageSize(1, getDashboardPreferences());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse) obj;

    if (hasDashboardPreferences() != other.hasDashboardPreferences()) return false;
    if (hasDashboardPreferences()) {
      if (!getDashboardPreferences()
          .equals(other.getDashboardPreferences())) return false;
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
    if (hasDashboardPreferences()) {
      hash = (37 * hash) + DASHBOARD_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getDashboardPreferences().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse prototype) {
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
   * Response for GetDashboardGeneralPreferences
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetDashboardGeneralPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetDashboardGeneralPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse.newBuilder()
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
        getDashboardPreferencesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dashboardPreferences_ = null;
      if (dashboardPreferencesBuilder_ != null) {
        dashboardPreferencesBuilder_.dispose();
        dashboardPreferencesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_GetDashboardGeneralPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dashboardPreferences_ = dashboardPreferencesBuilder_ == null
            ? dashboardPreferences_
            : dashboardPreferencesBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasDashboardPreferences()) {
        mergeDashboardPreferences(other.getDashboardPreferences());
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
                  getDashboardPreferencesFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences dashboardPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferencesOrBuilder> dashboardPreferencesBuilder_;
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     * @return Whether the dashboardPreferences field is set.
     */
    public boolean hasDashboardPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     * @return The dashboardPreferences.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences getDashboardPreferences() {
      if (dashboardPreferencesBuilder_ == null) {
        return dashboardPreferences_ == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.getDefaultInstance() : dashboardPreferences_;
      } else {
        return dashboardPreferencesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     */
    public Builder setDashboardPreferences(com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences value) {
      if (dashboardPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dashboardPreferences_ = value;
      } else {
        dashboardPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     */
    public Builder setDashboardPreferences(
        com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.Builder builderForValue) {
      if (dashboardPreferencesBuilder_ == null) {
        dashboardPreferences_ = builderForValue.build();
      } else {
        dashboardPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     */
    public Builder mergeDashboardPreferences(com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences value) {
      if (dashboardPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          dashboardPreferences_ != null &&
          dashboardPreferences_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.getDefaultInstance()) {
          getDashboardPreferencesBuilder().mergeFrom(value);
        } else {
          dashboardPreferences_ = value;
        }
      } else {
        dashboardPreferencesBuilder_.mergeFrom(value);
      }
      if (dashboardPreferences_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     */
    public Builder clearDashboardPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dashboardPreferences_ = null;
      if (dashboardPreferencesBuilder_ != null) {
        dashboardPreferencesBuilder_.dispose();
        dashboardPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.Builder getDashboardPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDashboardPreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferencesOrBuilder getDashboardPreferencesOrBuilder() {
      if (dashboardPreferencesBuilder_ != null) {
        return dashboardPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return dashboardPreferences_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.getDefaultInstance() : dashboardPreferences_;
      }
    }
    /**
     * <pre>
     * Dashboard general preferences object
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.DashboardPreferences dashboard_preferences = 1 [json_name = "dashboardPreferences"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferencesOrBuilder> 
        getDashboardPreferencesFieldBuilder() {
      if (dashboardPreferencesBuilder_ == null) {
        dashboardPreferencesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences, com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferences.Builder, com.tcn.cloud.api.api.v1alpha1.org.legacy.DashboardPreferencesOrBuilder>(
                getDashboardPreferences(),
                getParentForChildren(),
                isClean());
        dashboardPreferences_ = null;
      }
      return dashboardPreferencesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDashboardGeneralPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDashboardGeneralPreferencesResponse>() {
    @java.lang.Override
    public GetDashboardGeneralPreferencesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDashboardGeneralPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDashboardGeneralPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.GetDashboardGeneralPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

