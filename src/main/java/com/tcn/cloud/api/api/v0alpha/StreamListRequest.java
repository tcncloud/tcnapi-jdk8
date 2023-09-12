// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.StreamListRequest}
 */
public final class StreamListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.StreamListRequest)
    StreamListRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StreamListRequest.newBuilder() to construct.
  private StreamListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StreamListRequest() {
    orgId_ = "";
    regionId_ = "";
    elementId_ = "";
    chunk_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StreamListRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_StreamListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_StreamListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.StreamListRequest.class, com.tcn.cloud.api.api.v0alpha.StreamListRequest.Builder.class);
  }

  public static final int ORG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
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
   * <code>string org_id = 1 [json_name = "orgId"];</code>
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

  public static final int REGION_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object regionId_ = "";
  /**
   * <code>string region_id = 2 [json_name = "regionId"];</code>
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
   * <code>string region_id = 2 [json_name = "regionId"];</code>
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

  public static final int ELEMENT_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object elementId_ = "";
  /**
   * <pre>
   * the element/node we want to upload the list to.
   * must be an api_entrypoint type element.
   * all chunks will be concat together in order for each element streamed.
   * if this field is ever empty the whole call will error.
   * </pre>
   *
   * <code>string element_id = 3 [json_name = "elementId"];</code>
   * @return The elementId.
   */
  @java.lang.Override
  public java.lang.String getElementId() {
    java.lang.Object ref = elementId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      elementId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the element/node we want to upload the list to.
   * must be an api_entrypoint type element.
   * all chunks will be concat together in order for each element streamed.
   * if this field is ever empty the whole call will error.
   * </pre>
   *
   * <code>string element_id = 3 [json_name = "elementId"];</code>
   * @return The bytes for elementId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getElementIdBytes() {
    java.lang.Object ref = elementId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      elementId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHUNK_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString chunk_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * up to 2mb of raw bytes of the list we are uploading.
   * all chunks streamed are concat together and uploaded after streaming ends.
   * </pre>
   *
   * <code>bytes chunk = 4 [json_name = "chunk"];</code>
   * @return The chunk.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getChunk() {
    return chunk_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, regionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(elementId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, elementId_);
    }
    if (!chunk_.isEmpty()) {
      output.writeBytes(4, chunk_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orgId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(regionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, regionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(elementId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, elementId_);
    }
    if (!chunk_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, chunk_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.StreamListRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.StreamListRequest other = (com.tcn.cloud.api.api.v0alpha.StreamListRequest) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (!getRegionId()
        .equals(other.getRegionId())) return false;
    if (!getElementId()
        .equals(other.getElementId())) return false;
    if (!getChunk()
        .equals(other.getChunk())) return false;
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
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRegionId().hashCode();
    hash = (37 * hash) + ELEMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getElementId().hashCode();
    hash = (37 * hash) + CHUNK_FIELD_NUMBER;
    hash = (53 * hash) + getChunk().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.StreamListRequest prototype) {
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
   * Protobuf type {@code api.v0alpha.StreamListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.StreamListRequest)
      com.tcn.cloud.api.api.v0alpha.StreamListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_StreamListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_StreamListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.StreamListRequest.class, com.tcn.cloud.api.api.v0alpha.StreamListRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.StreamListRequest.newBuilder()
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
      orgId_ = "";
      regionId_ = "";
      elementId_ = "";
      chunk_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_StreamListRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.StreamListRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.StreamListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.StreamListRequest build() {
      com.tcn.cloud.api.api.v0alpha.StreamListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.StreamListRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.StreamListRequest result = new com.tcn.cloud.api.api.v0alpha.StreamListRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.StreamListRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.regionId_ = regionId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.elementId_ = elementId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.chunk_ = chunk_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.StreamListRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.StreamListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.StreamListRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.StreamListRequest.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRegionId().isEmpty()) {
        regionId_ = other.regionId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getElementId().isEmpty()) {
        elementId_ = other.elementId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getChunk() != com.google.protobuf.ByteString.EMPTY) {
        setChunk(other.getChunk());
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
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              regionId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              elementId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              chunk_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object orgId_ = "";
    /**
     * <code>string org_id = 1 [json_name = "orgId"];</code>
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
     * <code>string org_id = 1 [json_name = "orgId"];</code>
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
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string org_id = 1 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object regionId_ = "";
    /**
     * <code>string region_id = 2 [json_name = "regionId"];</code>
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
     * <code>string region_id = 2 [json_name = "regionId"];</code>
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
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @param value The regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      regionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionId() {
      regionId_ = getDefaultInstance().getRegionId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @param value The bytes for regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      regionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object elementId_ = "";
    /**
     * <pre>
     * the element/node we want to upload the list to.
     * must be an api_entrypoint type element.
     * all chunks will be concat together in order for each element streamed.
     * if this field is ever empty the whole call will error.
     * </pre>
     *
     * <code>string element_id = 3 [json_name = "elementId"];</code>
     * @return The elementId.
     */
    public java.lang.String getElementId() {
      java.lang.Object ref = elementId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        elementId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the element/node we want to upload the list to.
     * must be an api_entrypoint type element.
     * all chunks will be concat together in order for each element streamed.
     * if this field is ever empty the whole call will error.
     * </pre>
     *
     * <code>string element_id = 3 [json_name = "elementId"];</code>
     * @return The bytes for elementId.
     */
    public com.google.protobuf.ByteString
        getElementIdBytes() {
      java.lang.Object ref = elementId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        elementId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the element/node we want to upload the list to.
     * must be an api_entrypoint type element.
     * all chunks will be concat together in order for each element streamed.
     * if this field is ever empty the whole call will error.
     * </pre>
     *
     * <code>string element_id = 3 [json_name = "elementId"];</code>
     * @param value The elementId to set.
     * @return This builder for chaining.
     */
    public Builder setElementId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      elementId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the element/node we want to upload the list to.
     * must be an api_entrypoint type element.
     * all chunks will be concat together in order for each element streamed.
     * if this field is ever empty the whole call will error.
     * </pre>
     *
     * <code>string element_id = 3 [json_name = "elementId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearElementId() {
      elementId_ = getDefaultInstance().getElementId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the element/node we want to upload the list to.
     * must be an api_entrypoint type element.
     * all chunks will be concat together in order for each element streamed.
     * if this field is ever empty the whole call will error.
     * </pre>
     *
     * <code>string element_id = 3 [json_name = "elementId"];</code>
     * @param value The bytes for elementId to set.
     * @return This builder for chaining.
     */
    public Builder setElementIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      elementId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString chunk_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * up to 2mb of raw bytes of the list we are uploading.
     * all chunks streamed are concat together and uploaded after streaming ends.
     * </pre>
     *
     * <code>bytes chunk = 4 [json_name = "chunk"];</code>
     * @return The chunk.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getChunk() {
      return chunk_;
    }
    /**
     * <pre>
     * up to 2mb of raw bytes of the list we are uploading.
     * all chunks streamed are concat together and uploaded after streaming ends.
     * </pre>
     *
     * <code>bytes chunk = 4 [json_name = "chunk"];</code>
     * @param value The chunk to set.
     * @return This builder for chaining.
     */
    public Builder setChunk(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      chunk_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * up to 2mb of raw bytes of the list we are uploading.
     * all chunks streamed are concat together and uploaded after streaming ends.
     * </pre>
     *
     * <code>bytes chunk = 4 [json_name = "chunk"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChunk() {
      bitField0_ = (bitField0_ & ~0x00000008);
      chunk_ = getDefaultInstance().getChunk();
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.StreamListRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.StreamListRequest)
  private static final com.tcn.cloud.api.api.v0alpha.StreamListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.StreamListRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.StreamListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamListRequest>
      PARSER = new com.google.protobuf.AbstractParser<StreamListRequest>() {
    @java.lang.Override
    public StreamListRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StreamListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.StreamListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
