// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/dashboards.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * DeleteApplicationDashboardRequest used in DeleteApplicationDashboard rpc
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.DeleteApplicationDashboardRequest}
 */
public final class DeleteApplicationDashboardRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DeleteApplicationDashboardRequest)
    DeleteApplicationDashboardRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteApplicationDashboardRequest.newBuilder() to construct.
  private DeleteApplicationDashboardRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteApplicationDashboardRequest() {
    application_ = 0;
    dashboardResourceId_ = "";
    orgId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteApplicationDashboardRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DeleteApplicationDashboardRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DeleteApplicationDashboardRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest.class, com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest.Builder.class);
  }

  public static final int APPLICATION_FIELD_NUMBER = 1;
  private int application_ = 0;
  /**
   * <pre>
   * application dashboard id
   * </pre>
   *
   * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
   * @return The enum numeric value on the wire for application.
   */
  @java.lang.Override public int getApplicationValue() {
    return application_;
  }
  /**
   * <pre>
   * application dashboard id
   * </pre>
   *
   * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
   * @return The application.
   */
  @java.lang.Override public com.tcn.cloud.api.annotations.perms.Application getApplication() {
    com.tcn.cloud.api.annotations.perms.Application result = com.tcn.cloud.api.annotations.perms.Application.forNumber(application_);
    return result == null ? com.tcn.cloud.api.annotations.perms.Application.UNRECOGNIZED : result;
  }

  public static final int DASHBOARD_RESOURCE_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dashboardResourceId_ = "";
  /**
   * <pre>
   * dashboard resource id
   * </pre>
   *
   * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
   * @return The dashboardResourceId.
   */
  @java.lang.Override
  public java.lang.String getDashboardResourceId() {
    java.lang.Object ref = dashboardResourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dashboardResourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * dashboard resource id
   * </pre>
   *
   * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
   * @return The bytes for dashboardResourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDashboardResourceIdBytes() {
    java.lang.Object ref = dashboardResourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dashboardResourceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORG_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * org id for ownership
   * </pre>
   *
   * <code>string org_id = 3 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  @java.lang.Override
  public java.lang.String getOrgId() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * org id for ownership
   * </pre>
   *
   * <code>string org_id = 3 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrgIdBytes() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgId_ = b;
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
    if (application_ != com.tcn.cloud.api.annotations.perms.Application.APPLICATION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, application_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dashboardResourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dashboardResourceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, orgId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (application_ != com.tcn.cloud.api.annotations.perms.Application.APPLICATION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, application_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dashboardResourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dashboardResourceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, orgId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest other = (com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest) obj;

    if (application_ != other.application_) return false;
    if (!getDashboardResourceId()
        .equals(other.getDashboardResourceId())) return false;
    if (!getOrgId()
        .equals(other.getOrgId())) return false;
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
    hash = (37 * hash) + APPLICATION_FIELD_NUMBER;
    hash = (53 * hash) + application_;
    hash = (37 * hash) + DASHBOARD_RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDashboardResourceId().hashCode();
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest prototype) {
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
   * DeleteApplicationDashboardRequest used in DeleteApplicationDashboard rpc
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.DeleteApplicationDashboardRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DeleteApplicationDashboardRequest)
      com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DeleteApplicationDashboardRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DeleteApplicationDashboardRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest.class, com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest.newBuilder()
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
      application_ = 0;
      dashboardResourceId_ = "";
      orgId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.DashboardsProto.internal_static_api_v0alpha_DeleteApplicationDashboardRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest build() {
      com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest result = new com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.application_ = application_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dashboardResourceId_ = dashboardResourceId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.orgId_ = orgId_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest.getDefaultInstance()) return this;
      if (other.application_ != 0) {
        setApplicationValue(other.getApplicationValue());
      }
      if (!other.getDashboardResourceId().isEmpty()) {
        dashboardResourceId_ = other.dashboardResourceId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
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
              application_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              dashboardResourceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              orgId_ = input.readStringRequireUtf8();
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

    private int application_ = 0;
    /**
     * <pre>
     * application dashboard id
     * </pre>
     *
     * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
     * @return The enum numeric value on the wire for application.
     */
    @java.lang.Override public int getApplicationValue() {
      return application_;
    }
    /**
     * <pre>
     * application dashboard id
     * </pre>
     *
     * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
     * @param value The enum numeric value on the wire for application to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationValue(int value) {
      application_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * application dashboard id
     * </pre>
     *
     * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
     * @return The application.
     */
    @java.lang.Override
    public com.tcn.cloud.api.annotations.perms.Application getApplication() {
      com.tcn.cloud.api.annotations.perms.Application result = com.tcn.cloud.api.annotations.perms.Application.forNumber(application_);
      return result == null ? com.tcn.cloud.api.annotations.perms.Application.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * application dashboard id
     * </pre>
     *
     * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
     * @param value The application to set.
     * @return This builder for chaining.
     */
    public Builder setApplication(com.tcn.cloud.api.annotations.perms.Application value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      application_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * application dashboard id
     * </pre>
     *
     * <code>.annotations.perms.Application application = 1 [json_name = "application"];</code>
     * @return This builder for chaining.
     */
    public Builder clearApplication() {
      bitField0_ = (bitField0_ & ~0x00000001);
      application_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object dashboardResourceId_ = "";
    /**
     * <pre>
     * dashboard resource id
     * </pre>
     *
     * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
     * @return The dashboardResourceId.
     */
    public java.lang.String getDashboardResourceId() {
      java.lang.Object ref = dashboardResourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dashboardResourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * dashboard resource id
     * </pre>
     *
     * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
     * @return The bytes for dashboardResourceId.
     */
    public com.google.protobuf.ByteString
        getDashboardResourceIdBytes() {
      java.lang.Object ref = dashboardResourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dashboardResourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * dashboard resource id
     * </pre>
     *
     * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
     * @param value The dashboardResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setDashboardResourceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dashboardResourceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dashboard resource id
     * </pre>
     *
     * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDashboardResourceId() {
      dashboardResourceId_ = getDefaultInstance().getDashboardResourceId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * dashboard resource id
     * </pre>
     *
     * <code>string dashboard_resource_id = 2 [json_name = "dashboardResourceId"];</code>
     * @param value The bytes for dashboardResourceId to set.
     * @return This builder for chaining.
     */
    public Builder setDashboardResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dashboardResourceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * org id for ownership
     * </pre>
     *
     * <code>string org_id = 3 [json_name = "orgId"];</code>
     * @return The orgId.
     */
    public java.lang.String getOrgId() {
      java.lang.Object ref = orgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * org id for ownership
     * </pre>
     *
     * <code>string org_id = 3 [json_name = "orgId"];</code>
     * @return The bytes for orgId.
     */
    public com.google.protobuf.ByteString
        getOrgIdBytes() {
      java.lang.Object ref = orgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * org id for ownership
     * </pre>
     *
     * <code>string org_id = 3 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * org id for ownership
     * </pre>
     *
     * <code>string org_id = 3 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * org id for ownership
     * </pre>
     *
     * <code>string org_id = 3 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DeleteApplicationDashboardRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DeleteApplicationDashboardRequest)
  private static final com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteApplicationDashboardRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteApplicationDashboardRequest>() {
    @java.lang.Override
    public DeleteApplicationDashboardRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteApplicationDashboardRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteApplicationDashboardRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DeleteApplicationDashboardRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
