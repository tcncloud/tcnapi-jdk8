// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/user.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for the ListUsersByOrgId rpc.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.ListUsersByOrgIdRequest}
 */
public final class ListUsersByOrgIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.ListUsersByOrgIdRequest)
    ListUsersByOrgIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUsersByOrgIdRequest.newBuilder() to construct.
  private ListUsersByOrgIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUsersByOrgIdRequest() {
    orgId_ = "";
    archivedFilter_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUsersByOrgIdRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_ListUsersByOrgIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_ListUsersByOrgIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.class, com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.Builder.class);
  }

  public static final int ORG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * Filter by org ID.
   * </pre>
   *
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
   * <pre>
   * Filter by org ID.
   * </pre>
   *
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

  public static final int ARCHIVED_FILTER_FIELD_NUMBER = 2;
  private int archivedFilter_ = 0;
  /**
   * <pre>
   * Filter by the user's archived status.
   * </pre>
   *
   * <code>.api.commons.UserArchivedStateFilter archived_filter = 2 [json_name = "archivedFilter"];</code>
   * @return The enum numeric value on the wire for archivedFilter.
   */
  @java.lang.Override public int getArchivedFilterValue() {
    return archivedFilter_;
  }
  /**
   * <pre>
   * Filter by the user's archived status.
   * </pre>
   *
   * <code>.api.commons.UserArchivedStateFilter archived_filter = 2 [json_name = "archivedFilter"];</code>
   * @return The archivedFilter.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.UserArchivedStateFilter getArchivedFilter() {
    com.tcn.cloud.api.api.commons.UserArchivedStateFilter result = com.tcn.cloud.api.api.commons.UserArchivedStateFilter.forNumber(archivedFilter_);
    return result == null ? com.tcn.cloud.api.api.commons.UserArchivedStateFilter.UNRECOGNIZED : result;
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
    if (archivedFilter_ != com.tcn.cloud.api.api.commons.UserArchivedStateFilter.USER_ARCHIVED_STATE_FILTER_ALL.getNumber()) {
      output.writeEnum(2, archivedFilter_);
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
    if (archivedFilter_ != com.tcn.cloud.api.api.commons.UserArchivedStateFilter.USER_ARCHIVED_STATE_FILTER_ALL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, archivedFilter_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest other = (com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (archivedFilter_ != other.archivedFilter_) return false;
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
    hash = (37 * hash) + ARCHIVED_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + archivedFilter_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest prototype) {
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
   * Request message for the ListUsersByOrgId rpc.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.ListUsersByOrgIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.ListUsersByOrgIdRequest)
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_ListUsersByOrgIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_ListUsersByOrgIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.class, com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.newBuilder()
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
      archivedFilter_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UserProto.internal_static_api_v1alpha1_org_ListUsersByOrgIdRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest result = new com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.archivedFilter_ = archivedFilter_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.archivedFilter_ != 0) {
        setArchivedFilterValue(other.getArchivedFilterValue());
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
            case 16: {
              archivedFilter_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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
     * <pre>
     * Filter by org ID.
     * </pre>
     *
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
     * <pre>
     * Filter by org ID.
     * </pre>
     *
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
     * <pre>
     * Filter by org ID.
     * </pre>
     *
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
     * <pre>
     * Filter by org ID.
     * </pre>
     *
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
     * <pre>
     * Filter by org ID.
     * </pre>
     *
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

    private int archivedFilter_ = 0;
    /**
     * <pre>
     * Filter by the user's archived status.
     * </pre>
     *
     * <code>.api.commons.UserArchivedStateFilter archived_filter = 2 [json_name = "archivedFilter"];</code>
     * @return The enum numeric value on the wire for archivedFilter.
     */
    @java.lang.Override public int getArchivedFilterValue() {
      return archivedFilter_;
    }
    /**
     * <pre>
     * Filter by the user's archived status.
     * </pre>
     *
     * <code>.api.commons.UserArchivedStateFilter archived_filter = 2 [json_name = "archivedFilter"];</code>
     * @param value The enum numeric value on the wire for archivedFilter to set.
     * @return This builder for chaining.
     */
    public Builder setArchivedFilterValue(int value) {
      archivedFilter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter by the user's archived status.
     * </pre>
     *
     * <code>.api.commons.UserArchivedStateFilter archived_filter = 2 [json_name = "archivedFilter"];</code>
     * @return The archivedFilter.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.UserArchivedStateFilter getArchivedFilter() {
      com.tcn.cloud.api.api.commons.UserArchivedStateFilter result = com.tcn.cloud.api.api.commons.UserArchivedStateFilter.forNumber(archivedFilter_);
      return result == null ? com.tcn.cloud.api.api.commons.UserArchivedStateFilter.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Filter by the user's archived status.
     * </pre>
     *
     * <code>.api.commons.UserArchivedStateFilter archived_filter = 2 [json_name = "archivedFilter"];</code>
     * @param value The archivedFilter to set.
     * @return This builder for chaining.
     */
    public Builder setArchivedFilter(com.tcn.cloud.api.api.commons.UserArchivedStateFilter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      archivedFilter_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter by the user's archived status.
     * </pre>
     *
     * <code>.api.commons.UserArchivedStateFilter archived_filter = 2 [json_name = "archivedFilter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearArchivedFilter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      archivedFilter_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.ListUsersByOrgIdRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.ListUsersByOrgIdRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUsersByOrgIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListUsersByOrgIdRequest>() {
    @java.lang.Override
    public ListUsersByOrgIdRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListUsersByOrgIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUsersByOrgIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.ListUsersByOrgIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

