// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request message for CopyDataDipTemplateToOrganization RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest}
 */
public final class CopyDataDipTemplateToOrganizationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest)
    CopyDataDipTemplateToOrganizationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CopyDataDipTemplateToOrganizationRequest.newBuilder() to construct.
  private CopyDataDipTemplateToOrganizationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CopyDataDipTemplateToOrganizationRequest() {
    orgId_ = "";
    configName_ = "";
    destinationOrgId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CopyDataDipTemplateToOrganizationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyDataDipTemplateToOrganizationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyDataDipTemplateToOrganizationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest.class, com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest.Builder.class);
  }

  public static final int ORG_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * Org ID.
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
   * Org ID.
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

  public static final int XML_CLIENT_PROPERTY_SID_FIELD_NUMBER = 2;
  private long xmlClientPropertySid_ = 0L;
  /**
   * <pre>
   * ID of the template to copy.
   * </pre>
   *
   * <code>int64 xml_client_property_sid = 2 [json_name = "xmlClientPropertySid"];</code>
   * @return The xmlClientPropertySid.
   */
  @java.lang.Override
  public long getXmlClientPropertySid() {
    return xmlClientPropertySid_;
  }

  public static final int CONFIG_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object configName_ = "";
  /**
   * <pre>
   * Name to give the new template.
   * </pre>
   *
   * <code>string config_name = 3 [json_name = "configName"];</code>
   * @return The configName.
   */
  @java.lang.Override
  public java.lang.String getConfigName() {
    java.lang.Object ref = configName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      configName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name to give the new template.
   * </pre>
   *
   * <code>string config_name = 3 [json_name = "configName"];</code>
   * @return The bytes for configName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConfigNameBytes() {
    java.lang.Object ref = configName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      configName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_ORG_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationOrgId_ = "";
  /**
   * <pre>
   * The ID of the org to copy to.
   * </pre>
   *
   * <code>string destination_org_id = 4 [json_name = "destinationOrgId"];</code>
   * @return The destinationOrgId.
   */
  @java.lang.Override
  public java.lang.String getDestinationOrgId() {
    java.lang.Object ref = destinationOrgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationOrgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the org to copy to.
   * </pre>
   *
   * <code>string destination_org_id = 4 [json_name = "destinationOrgId"];</code>
   * @return The bytes for destinationOrgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestinationOrgIdBytes() {
    java.lang.Object ref = destinationOrgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destinationOrgId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orgId_);
    }
    if (xmlClientPropertySid_ != 0L) {
      output.writeInt64(2, xmlClientPropertySid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(configName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, configName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationOrgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, destinationOrgId_);
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
    if (xmlClientPropertySid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, xmlClientPropertySid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(configName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, configName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationOrgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, destinationOrgId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest other = (com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest) obj;

    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (getXmlClientPropertySid()
        != other.getXmlClientPropertySid()) return false;
    if (!getConfigName()
        .equals(other.getConfigName())) return false;
    if (!getDestinationOrgId()
        .equals(other.getDestinationOrgId())) return false;
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
    hash = (37 * hash) + XML_CLIENT_PROPERTY_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getXmlClientPropertySid());
    hash = (37 * hash) + CONFIG_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getConfigName().hashCode();
    hash = (37 * hash) + DESTINATION_ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationOrgId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest prototype) {
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
   * Request message for CopyDataDipTemplateToOrganization RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest)
      com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyDataDipTemplateToOrganizationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyDataDipTemplateToOrganizationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest.class, com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest.newBuilder()
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
      xmlClientPropertySid_ = 0L;
      configName_ = "";
      destinationOrgId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_CopyDataDipTemplateToOrganizationRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest result = new com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.xmlClientPropertySid_ = xmlClientPropertySid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.configName_ = configName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.destinationOrgId_ = destinationOrgId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest.getDefaultInstance()) return this;
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getXmlClientPropertySid() != 0L) {
        setXmlClientPropertySid(other.getXmlClientPropertySid());
      }
      if (!other.getConfigName().isEmpty()) {
        configName_ = other.configName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDestinationOrgId().isEmpty()) {
        destinationOrgId_ = other.destinationOrgId_;
        bitField0_ |= 0x00000008;
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
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              xmlClientPropertySid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              configName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              destinationOrgId_ = input.readStringRequireUtf8();
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
     * <pre>
     * Org ID.
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
     * Org ID.
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
     * Org ID.
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
     * Org ID.
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
     * Org ID.
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

    private long xmlClientPropertySid_ ;
    /**
     * <pre>
     * ID of the template to copy.
     * </pre>
     *
     * <code>int64 xml_client_property_sid = 2 [json_name = "xmlClientPropertySid"];</code>
     * @return The xmlClientPropertySid.
     */
    @java.lang.Override
    public long getXmlClientPropertySid() {
      return xmlClientPropertySid_;
    }
    /**
     * <pre>
     * ID of the template to copy.
     * </pre>
     *
     * <code>int64 xml_client_property_sid = 2 [json_name = "xmlClientPropertySid"];</code>
     * @param value The xmlClientPropertySid to set.
     * @return This builder for chaining.
     */
    public Builder setXmlClientPropertySid(long value) {

      xmlClientPropertySid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the template to copy.
     * </pre>
     *
     * <code>int64 xml_client_property_sid = 2 [json_name = "xmlClientPropertySid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearXmlClientPropertySid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      xmlClientPropertySid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object configName_ = "";
    /**
     * <pre>
     * Name to give the new template.
     * </pre>
     *
     * <code>string config_name = 3 [json_name = "configName"];</code>
     * @return The configName.
     */
    public java.lang.String getConfigName() {
      java.lang.Object ref = configName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        configName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name to give the new template.
     * </pre>
     *
     * <code>string config_name = 3 [json_name = "configName"];</code>
     * @return The bytes for configName.
     */
    public com.google.protobuf.ByteString
        getConfigNameBytes() {
      java.lang.Object ref = configName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        configName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name to give the new template.
     * </pre>
     *
     * <code>string config_name = 3 [json_name = "configName"];</code>
     * @param value The configName to set.
     * @return This builder for chaining.
     */
    public Builder setConfigName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      configName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name to give the new template.
     * </pre>
     *
     * <code>string config_name = 3 [json_name = "configName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConfigName() {
      configName_ = getDefaultInstance().getConfigName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name to give the new template.
     * </pre>
     *
     * <code>string config_name = 3 [json_name = "configName"];</code>
     * @param value The bytes for configName to set.
     * @return This builder for chaining.
     */
    public Builder setConfigNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      configName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object destinationOrgId_ = "";
    /**
     * <pre>
     * The ID of the org to copy to.
     * </pre>
     *
     * <code>string destination_org_id = 4 [json_name = "destinationOrgId"];</code>
     * @return The destinationOrgId.
     */
    public java.lang.String getDestinationOrgId() {
      java.lang.Object ref = destinationOrgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationOrgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the org to copy to.
     * </pre>
     *
     * <code>string destination_org_id = 4 [json_name = "destinationOrgId"];</code>
     * @return The bytes for destinationOrgId.
     */
    public com.google.protobuf.ByteString
        getDestinationOrgIdBytes() {
      java.lang.Object ref = destinationOrgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destinationOrgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the org to copy to.
     * </pre>
     *
     * <code>string destination_org_id = 4 [json_name = "destinationOrgId"];</code>
     * @param value The destinationOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      destinationOrgId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the org to copy to.
     * </pre>
     *
     * <code>string destination_org_id = 4 [json_name = "destinationOrgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinationOrgId() {
      destinationOrgId_ = getDefaultInstance().getDestinationOrgId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the org to copy to.
     * </pre>
     *
     * <code>string destination_org_id = 4 [json_name = "destinationOrgId"];</code>
     * @param value The bytes for destinationOrgId to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      destinationOrgId_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CopyDataDipTemplateToOrganizationRequest>
      PARSER = new com.google.protobuf.AbstractParser<CopyDataDipTemplateToOrganizationRequest>() {
    @java.lang.Override
    public CopyDataDipTemplateToOrganizationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CopyDataDipTemplateToOrganizationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CopyDataDipTemplateToOrganizationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.CopyDataDipTemplateToOrganizationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
