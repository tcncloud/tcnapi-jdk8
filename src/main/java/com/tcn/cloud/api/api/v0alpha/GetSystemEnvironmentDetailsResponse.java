// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response used to return system environment details
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.GetSystemEnvironmentDetailsResponse}
 */
public final class GetSystemEnvironmentDetailsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetSystemEnvironmentDetailsResponse)
    GetSystemEnvironmentDetailsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSystemEnvironmentDetailsResponse.newBuilder() to construct.
  private GetSystemEnvironmentDetailsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSystemEnvironmentDetailsResponse() {
    regionId_ = "";
    clusterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSystemEnvironmentDetailsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSystemEnvironmentDetailsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSystemEnvironmentDetailsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.class, com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.Builder.class);
  }

  public static final int REGION_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object regionId_ = "";
  /**
   * <pre>
   * the region id for the backend that answered this request
   * </pre>
   *
   * <code>string region_id = 1 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  @java.lang.Override
  public java.lang.String getRegionId() {
    java.lang.Object ref = regionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      regionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the region id for the backend that answered this request
   * </pre>
   *
   * <code>string region_id = 1 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionIdBytes() {
    java.lang.Object ref = regionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      regionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clusterId_ = "";
  /**
   * <pre>
   * the cluster id for the backend that answered this request
   * </pre>
   *
   * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
   * @return The clusterId.
   */
  @java.lang.Override
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the cluster id for the backend that answered this request
   * </pre>
   *
   * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
   * @return The bytes for clusterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, regionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clusterId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, regionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clusterId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clusterId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse other = (com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse) obj;

    if (!getRegionId()
        .equals(other.getRegionId())) return false;
    if (!getClusterId()
        .equals(other.getClusterId())) return false;
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
    hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRegionId().hashCode();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse prototype) {
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
   * Response used to return system environment details
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.GetSystemEnvironmentDetailsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetSystemEnvironmentDetailsResponse)
      com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSystemEnvironmentDetailsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSystemEnvironmentDetailsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.class, com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.newBuilder()
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
      regionId_ = "";
      clusterId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetSystemEnvironmentDetailsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse result = new com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.regionId_ = regionId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clusterId_ = clusterId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse.getDefaultInstance()) return this;
      if (!other.getRegionId().isEmpty()) {
        regionId_ = other.regionId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        bitField0_ |= 0x00000002;
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
            case 10: {
              regionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              clusterId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.lang.Object regionId_ = "";
    /**
     * <pre>
     * the region id for the backend that answered this request
     * </pre>
     *
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @return The regionId.
     */
    public java.lang.String getRegionId() {
      java.lang.Object ref = regionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        regionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the region id for the backend that answered this request
     * </pre>
     *
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @return The bytes for regionId.
     */
    public com.google.protobuf.ByteString
        getRegionIdBytes() {
      java.lang.Object ref = regionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        regionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the region id for the backend that answered this request
     * </pre>
     *
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @param value The regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      regionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the region id for the backend that answered this request
     * </pre>
     *
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionId() {
      regionId_ = getDefaultInstance().getRegionId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the region id for the backend that answered this request
     * </pre>
     *
     * <code>string region_id = 1 [json_name = "regionId"];</code>
     * @param value The bytes for regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      regionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     * <pre>
     * the cluster id for the backend that answered this request
     * </pre>
     *
     * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
     * @return The clusterId.
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the cluster id for the backend that answered this request
     * </pre>
     *
     * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
     * @return The bytes for clusterId.
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the cluster id for the backend that answered this request
     * </pre>
     *
     * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
     * @param value The clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clusterId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the cluster id for the backend that answered this request
     * </pre>
     *
     * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClusterId() {
      clusterId_ = getDefaultInstance().getClusterId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the cluster id for the backend that answered this request
     * </pre>
     *
     * <code>string cluster_id = 2 [json_name = "clusterId"];</code>
     * @param value The bytes for clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clusterId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetSystemEnvironmentDetailsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetSystemEnvironmentDetailsResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSystemEnvironmentDetailsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSystemEnvironmentDetailsResponse>() {
    @java.lang.Override
    public GetSystemEnvironmentDetailsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetSystemEnvironmentDetailsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSystemEnvironmentDetailsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetSystemEnvironmentDetailsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

