// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.RecommendedDashboard}
 */
public final class RecommendedDashboard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.RecommendedDashboard)
    RecommendedDashboardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecommendedDashboard.newBuilder() to construct.
  private RecommendedDashboard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecommendedDashboard() {
    dashboardId_ = "";
    title_ = "";
    rootId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecommendedDashboard();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_RecommendedDashboard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_RecommendedDashboard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.RecommendedDashboard.class, com.tcn.cloud.api.api.v0alpha.RecommendedDashboard.Builder.class);
  }

  public static final int DASHBOARD_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object dashboardId_ = "";
  /**
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The dashboardId.
   */
  @java.lang.Override
  public java.lang.String getDashboardId() {
    java.lang.Object ref = dashboardId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dashboardId_ = s;
      return s;
    }
  }
  /**
   * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
   * @return The bytes for dashboardId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDashboardIdBytes() {
    java.lang.Object ref = dashboardId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dashboardId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object rootId_ = "";
  /**
   * <code>string root_id = 3 [json_name = "rootId"];</code>
   * @return The rootId.
   */
  @java.lang.Override
  public java.lang.String getRootId() {
    java.lang.Object ref = rootId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rootId_ = s;
      return s;
    }
  }
  /**
   * <code>string root_id = 3 [json_name = "rootId"];</code>
   * @return The bytes for rootId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRootIdBytes() {
    java.lang.Object ref = rootId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rootId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TCN_STANDARD_FIELD_NUMBER = 4;
  private boolean tcnStandard_ = false;
  /**
   * <code>bool tcn_standard = 4 [json_name = "tcnStandard"];</code>
   * @return The tcnStandard.
   */
  @java.lang.Override
  public boolean getTcnStandard() {
    return tcnStandard_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dashboardId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dashboardId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rootId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, rootId_);
    }
    if (tcnStandard_ != false) {
      output.writeBool(4, tcnStandard_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dashboardId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dashboardId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rootId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, rootId_);
    }
    if (tcnStandard_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, tcnStandard_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.RecommendedDashboard)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.RecommendedDashboard other = (com.tcn.cloud.api.api.v0alpha.RecommendedDashboard) obj;

    if (!getDashboardId()
        .equals(other.getDashboardId())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getRootId()
        .equals(other.getRootId())) return false;
    if (getTcnStandard()
        != other.getTcnStandard()) return false;
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
    hash = (37 * hash) + DASHBOARD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDashboardId().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + ROOT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRootId().hashCode();
    hash = (37 * hash) + TCN_STANDARD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTcnStandard());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.RecommendedDashboard prototype) {
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
   * Protobuf type {@code api.v0alpha.RecommendedDashboard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.RecommendedDashboard)
      com.tcn.cloud.api.api.v0alpha.RecommendedDashboardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_RecommendedDashboard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_RecommendedDashboard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.RecommendedDashboard.class, com.tcn.cloud.api.api.v0alpha.RecommendedDashboard.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.RecommendedDashboard.newBuilder()
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
      dashboardId_ = "";
      title_ = "";
      rootId_ = "";
      tcnStandard_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_RecommendedDashboard_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RecommendedDashboard getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.RecommendedDashboard.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RecommendedDashboard build() {
      com.tcn.cloud.api.api.v0alpha.RecommendedDashboard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RecommendedDashboard buildPartial() {
      com.tcn.cloud.api.api.v0alpha.RecommendedDashboard result = new com.tcn.cloud.api.api.v0alpha.RecommendedDashboard(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.RecommendedDashboard result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dashboardId_ = dashboardId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.rootId_ = rootId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.tcnStandard_ = tcnStandard_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.RecommendedDashboard) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.RecommendedDashboard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.RecommendedDashboard other) {
      if (other == com.tcn.cloud.api.api.v0alpha.RecommendedDashboard.getDefaultInstance()) return this;
      if (!other.getDashboardId().isEmpty()) {
        dashboardId_ = other.dashboardId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getRootId().isEmpty()) {
        rootId_ = other.rootId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getTcnStandard() != false) {
        setTcnStandard(other.getTcnStandard());
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
              dashboardId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              rootId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              tcnStandard_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object dashboardId_ = "";
    /**
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @return The dashboardId.
     */
    public java.lang.String getDashboardId() {
      java.lang.Object ref = dashboardId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dashboardId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @return The bytes for dashboardId.
     */
    public com.google.protobuf.ByteString
        getDashboardIdBytes() {
      java.lang.Object ref = dashboardId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dashboardId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @param value The dashboardId to set.
     * @return This builder for chaining.
     */
    public Builder setDashboardId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      dashboardId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDashboardId() {
      dashboardId_ = getDefaultInstance().getDashboardId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string dashboard_id = 1 [json_name = "dashboardId"];</code>
     * @param value The bytes for dashboardId to set.
     * @return This builder for chaining.
     */
    public Builder setDashboardIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      dashboardId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2 [json_name = "title"];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2 [json_name = "title"];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2 [json_name = "title"];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2 [json_name = "title"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2 [json_name = "title"];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object rootId_ = "";
    /**
     * <code>string root_id = 3 [json_name = "rootId"];</code>
     * @return The rootId.
     */
    public java.lang.String getRootId() {
      java.lang.Object ref = rootId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rootId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string root_id = 3 [json_name = "rootId"];</code>
     * @return The bytes for rootId.
     */
    public com.google.protobuf.ByteString
        getRootIdBytes() {
      java.lang.Object ref = rootId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rootId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string root_id = 3 [json_name = "rootId"];</code>
     * @param value The rootId to set.
     * @return This builder for chaining.
     */
    public Builder setRootId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      rootId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string root_id = 3 [json_name = "rootId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRootId() {
      rootId_ = getDefaultInstance().getRootId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string root_id = 3 [json_name = "rootId"];</code>
     * @param value The bytes for rootId to set.
     * @return This builder for chaining.
     */
    public Builder setRootIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rootId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean tcnStandard_ ;
    /**
     * <code>bool tcn_standard = 4 [json_name = "tcnStandard"];</code>
     * @return The tcnStandard.
     */
    @java.lang.Override
    public boolean getTcnStandard() {
      return tcnStandard_;
    }
    /**
     * <code>bool tcn_standard = 4 [json_name = "tcnStandard"];</code>
     * @param value The tcnStandard to set.
     * @return This builder for chaining.
     */
    public Builder setTcnStandard(boolean value) {

      tcnStandard_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool tcn_standard = 4 [json_name = "tcnStandard"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTcnStandard() {
      bitField0_ = (bitField0_ & ~0x00000008);
      tcnStandard_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.RecommendedDashboard)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.RecommendedDashboard)
  private static final com.tcn.cloud.api.api.v0alpha.RecommendedDashboard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.RecommendedDashboard();
  }

  public static com.tcn.cloud.api.api.v0alpha.RecommendedDashboard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecommendedDashboard>
      PARSER = new com.google.protobuf.AbstractParser<RecommendedDashboard>() {
    @java.lang.Override
    public RecommendedDashboard parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecommendedDashboard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecommendedDashboard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RecommendedDashboard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

