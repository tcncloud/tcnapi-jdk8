// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response for GetDashboardQueuePreferences
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.GetDashboardQueuePreferencesResponse}
 */
public final class GetDashboardQueuePreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetDashboardQueuePreferencesResponse)
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
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetDashboardQueuePreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetDashboardQueuePreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.Builder.class);
  }

  public static final int DASHBOARD_QUEUE_PREFERENCES_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences dashboardQueuePreferences_;
  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   * @return Whether the dashboardQueuePreferences field is set.
   */
  @java.lang.Override
  public boolean hasDashboardQueuePreferences() {
    return dashboardQueuePreferences_ != null;
  }
  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   * @return The dashboardQueuePreferences.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences getDashboardQueuePreferences() {
    return dashboardQueuePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
  }
  /**
   * <pre>
   * The requested preferences.
   * </pre>
   *
   * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferencesOrBuilder getDashboardQueuePreferencesOrBuilder() {
    return dashboardQueuePreferences_ == null ? com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.getDefaultInstance() : dashboardQueuePreferences_;
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
    if (dashboardQueuePreferences_ != null) {
      output.writeMessage(1, getDashboardQueuePreferences());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dashboardQueuePreferences_ != null) {
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse other = (com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse) obj;

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

  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse prototype) {
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
   * Response for GetDashboardQueuePreferences
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.GetDashboardQueuePreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetDashboardQueuePreferencesResponse)
      com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetDashboardQueuePreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetDashboardQueuePreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.class, com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.newBuilder()
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
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetDashboardQueuePreferencesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse result = new com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dashboardQueuePreferences_ = dashboardQueuePreferencesBuilder_ == null
            ? dashboardQueuePreferences_
            : dashboardQueuePreferencesBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse.getDefaultInstance()) return this;
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

    private com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences dashboardQueuePreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder, com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferencesOrBuilder> dashboardQueuePreferencesBuilder_;
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     * @return Whether the dashboardQueuePreferences field is set.
     */
    public boolean hasDashboardQueuePreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
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
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
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
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
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
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
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
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DashboardQueuePreferences.Builder getDashboardQueuePreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDashboardQueuePreferencesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
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
     * The requested preferences.
     * </pre>
     *
     * <code>.api.v0alpha.DashboardQueuePreferences dashboard_queue_preferences = 1 [json_name = "dashboardQueuePreferences"];</code>
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetDashboardQueuePreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetDashboardQueuePreferencesResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse getDefaultInstance() {
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
  public com.tcn.cloud.api.api.v0alpha.GetDashboardQueuePreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

