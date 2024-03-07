// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

/**
 * <pre>
 * New Proto's For Get and List - Contact List and Contact Entries
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.contactmanager.GetContactListRequest}
 */
public final class GetContactListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.contactmanager.GetContactListRequest)
    GetContactListRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetContactListRequest.newBuilder() to construct.
  private GetContactListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetContactListRequest() {
    orgId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetContactListRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.Builder.class);
  }

  public static final int REQUEST_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask requestMask_;
  /**
   * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
   * @return Whether the requestMask field is set.
   */
  @java.lang.Override
  public boolean hasRequestMask() {
    return requestMask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
   * @return The requestMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getRequestMask() {
    return requestMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : requestMask_;
  }
  /**
   * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getRequestMaskOrBuilder() {
    return requestMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : requestMask_;
  }

  public static final int ORG_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
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
   * <code>string org_id = 2 [json_name = "orgId"];</code>
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

  public static final int PROJECT_ID_FIELD_NUMBER = 3;
  private long projectId_ = 0L;
  /**
   * <code>int64 project_id = 3 [json_name = "projectId", jstype = JS_STRING];</code>
   * @return The projectId.
   */
  @java.lang.Override
  public long getProjectId() {
    return projectId_;
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
    if (requestMask_ != null) {
      output.writeMessage(1, getRequestMask());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orgId_);
    }
    if (projectId_ != 0L) {
      output.writeInt64(3, projectId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequestMask());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orgId_);
    }
    if (projectId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, projectId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest other = (com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest) obj;

    if (hasRequestMask() != other.hasRequestMask()) return false;
    if (hasRequestMask()) {
      if (!getRequestMask()
          .equals(other.getRequestMask())) return false;
    }
    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (getProjectId()
        != other.getProjectId()) return false;
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
    if (hasRequestMask()) {
      hash = (37 * hash) + REQUEST_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getRequestMask().hashCode();
    }
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProjectId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest prototype) {
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
   * New Proto's For Get and List - Contact List and Contact Entries
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.contactmanager.GetContactListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.contactmanager.GetContactListRequest)
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.newBuilder()
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
      requestMask_ = null;
      if (requestMaskBuilder_ != null) {
        requestMaskBuilder_.dispose();
        requestMaskBuilder_ = null;
      }
      orgId_ = "";
      projectId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest build() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest result = new com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestMask_ = requestMaskBuilder_ == null
            ? requestMask_
            : requestMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.projectId_ = projectId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.getDefaultInstance()) return this;
      if (other.hasRequestMask()) {
        mergeRequestMask(other.getRequestMask());
      }
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getProjectId() != 0L) {
        setProjectId(other.getProjectId());
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
                  getRequestMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              projectId_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.google.protobuf.FieldMask requestMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> requestMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     * @return Whether the requestMask field is set.
     */
    public boolean hasRequestMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     * @return The requestMask.
     */
    public com.google.protobuf.FieldMask getRequestMask() {
      if (requestMaskBuilder_ == null) {
        return requestMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : requestMask_;
      } else {
        return requestMaskBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     */
    public Builder setRequestMask(com.google.protobuf.FieldMask value) {
      if (requestMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestMask_ = value;
      } else {
        requestMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     */
    public Builder setRequestMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (requestMaskBuilder_ == null) {
        requestMask_ = builderForValue.build();
      } else {
        requestMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     */
    public Builder mergeRequestMask(com.google.protobuf.FieldMask value) {
      if (requestMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          requestMask_ != null &&
          requestMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getRequestMaskBuilder().mergeFrom(value);
        } else {
          requestMask_ = value;
        }
      } else {
        requestMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     */
    public Builder clearRequestMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestMask_ = null;
      if (requestMaskBuilder_ != null) {
        requestMaskBuilder_.dispose();
        requestMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getRequestMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRequestMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getRequestMaskOrBuilder() {
      if (requestMaskBuilder_ != null) {
        return requestMaskBuilder_.getMessageOrBuilder();
      } else {
        return requestMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : requestMask_;
      }
    }
    /**
     * <code>.google.protobuf.FieldMask request_mask = 1 [json_name = "requestMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getRequestMaskFieldBuilder() {
      if (requestMaskBuilder_ == null) {
        requestMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getRequestMask(),
                getParentForChildren(),
                isClean());
        requestMask_ = null;
      }
      return requestMaskBuilder_;
    }

    private java.lang.Object orgId_ = "";
    /**
     * <code>string org_id = 2 [json_name = "orgId"];</code>
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
     * <code>string org_id = 2 [json_name = "orgId"];</code>
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
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long projectId_ ;
    /**
     * <code>int64 project_id = 3 [json_name = "projectId", jstype = JS_STRING];</code>
     * @return The projectId.
     */
    @java.lang.Override
    public long getProjectId() {
      return projectId_;
    }
    /**
     * <code>int64 project_id = 3 [json_name = "projectId", jstype = JS_STRING];</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(long value) {

      projectId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 project_id = 3 [json_name = "projectId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      projectId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.contactmanager.GetContactListRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.contactmanager.GetContactListRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetContactListRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetContactListRequest>() {
    @java.lang.Override
    public GetContactListRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetContactListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetContactListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
