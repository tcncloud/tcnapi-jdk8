// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/organization.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request for the ListOrganizations RPC, filtered by region.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.ListOrganizationsRequest}
 */
public final class ListOrganizationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.ListOrganizationsRequest)
    ListOrganizationsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOrganizationsRequest.newBuilder() to construct.
  private ListOrganizationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOrganizationsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOrganizationsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest.Builder.class);
  }

  private int identifierCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object identifier_;
  public enum IdentifierCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GLOBAL(1),
    REGION_ID(2),
    IDENTIFIER_NOT_SET(0);
    private final int value;
    private IdentifierCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IdentifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static IdentifierCase forNumber(int value) {
      switch (value) {
        case 1: return GLOBAL;
        case 2: return REGION_ID;
        case 0: return IDENTIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public IdentifierCase
  getIdentifierCase() {
    return IdentifierCase.forNumber(
        identifierCase_);
  }

  public static final int GLOBAL_FIELD_NUMBER = 1;
  /**
   * <pre>
   * No filter (get all global organizations).
   * </pre>
   *
   * <code>bool global = 1 [json_name = "global"];</code>
   * @return Whether the global field is set.
   */
  @java.lang.Override
  public boolean hasGlobal() {
    return identifierCase_ == 1;
  }
  /**
   * <pre>
   * No filter (get all global organizations).
   * </pre>
   *
   * <code>bool global = 1 [json_name = "global"];</code>
   * @return The global.
   */
  @java.lang.Override
  public boolean getGlobal() {
    if (identifierCase_ == 1) {
      return (java.lang.Boolean) identifier_;
    }
    return false;
  }

  public static final int REGION_ID_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Filter by region.
   * </pre>
   *
   * <code>string region_id = 2 [json_name = "regionId"];</code>
   * @return Whether the regionId field is set.
   */
  public boolean hasRegionId() {
    return identifierCase_ == 2;
  }
  /**
   * <pre>
   * Filter by region.
   * </pre>
   *
   * <code>string region_id = 2 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  public java.lang.String getRegionId() {
    java.lang.Object ref = "";
    if (identifierCase_ == 2) {
      ref = identifier_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (identifierCase_ == 2) {
        identifier_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Filter by region.
   * </pre>
   *
   * <code>string region_id = 2 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  public com.google.protobuf.ByteString
      getRegionIdBytes() {
    java.lang.Object ref = "";
    if (identifierCase_ == 2) {
      ref = identifier_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (identifierCase_ == 2) {
        identifier_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARCHIVED_FIELD_NUMBER = 3;
  private boolean archived_ = false;
  /**
   * <pre>
   * Get only archived or unarchived organizations.
   * </pre>
   *
   * <code>bool archived = 3 [json_name = "archived"];</code>
   * @return The archived.
   */
  @java.lang.Override
  public boolean getArchived() {
    return archived_;
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
    if (identifierCase_ == 1) {
      output.writeBool(
          1, (boolean)((java.lang.Boolean) identifier_));
    }
    if (identifierCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identifier_);
    }
    if (archived_ != false) {
      output.writeBool(3, archived_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (identifierCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            1, (boolean)((java.lang.Boolean) identifier_));
    }
    if (identifierCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identifier_);
    }
    if (archived_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, archived_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest other = (com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest) obj;

    if (getArchived()
        != other.getArchived()) return false;
    if (!getIdentifierCase().equals(other.getIdentifierCase())) return false;
    switch (identifierCase_) {
      case 1:
        if (getGlobal()
            != other.getGlobal()) return false;
        break;
      case 2:
        if (!getRegionId()
            .equals(other.getRegionId())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + ARCHIVED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getArchived());
    switch (identifierCase_) {
      case 1:
        hash = (37 * hash) + GLOBAL_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getGlobal());
        break;
      case 2:
        hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getRegionId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest prototype) {
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
   * Request for the ListOrganizations RPC, filtered by region.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.ListOrganizationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.ListOrganizationsRequest)
      com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest.newBuilder()
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
      archived_ = false;
      identifierCase_ = 0;
      identifier_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.OrganizationProto.internal_static_api_v1alpha1_org_ListOrganizationsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest result = new com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.archived_ = archived_;
      }
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest result) {
      result.identifierCase_ = identifierCase_;
      result.identifier_ = this.identifier_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest.getDefaultInstance()) return this;
      if (other.getArchived() != false) {
        setArchived(other.getArchived());
      }
      switch (other.getIdentifierCase()) {
        case GLOBAL: {
          setGlobal(other.getGlobal());
          break;
        }
        case REGION_ID: {
          identifierCase_ = 2;
          identifier_ = other.identifier_;
          onChanged();
          break;
        }
        case IDENTIFIER_NOT_SET: {
          break;
        }
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
              identifier_ = input.readBool();
              identifierCase_ = 1;
              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              identifierCase_ = 2;
              identifier_ = s;
              break;
            } // case 18
            case 24: {
              archived_ = input.readBool();
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
    private int identifierCase_ = 0;
    private java.lang.Object identifier_;
    public IdentifierCase
        getIdentifierCase() {
      return IdentifierCase.forNumber(
          identifierCase_);
    }

    public Builder clearIdentifier() {
      identifierCase_ = 0;
      identifier_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * No filter (get all global organizations).
     * </pre>
     *
     * <code>bool global = 1 [json_name = "global"];</code>
     * @return Whether the global field is set.
     */
    public boolean hasGlobal() {
      return identifierCase_ == 1;
    }
    /**
     * <pre>
     * No filter (get all global organizations).
     * </pre>
     *
     * <code>bool global = 1 [json_name = "global"];</code>
     * @return The global.
     */
    public boolean getGlobal() {
      if (identifierCase_ == 1) {
        return (java.lang.Boolean) identifier_;
      }
      return false;
    }
    /**
     * <pre>
     * No filter (get all global organizations).
     * </pre>
     *
     * <code>bool global = 1 [json_name = "global"];</code>
     * @param value The global to set.
     * @return This builder for chaining.
     */
    public Builder setGlobal(boolean value) {

      identifierCase_ = 1;
      identifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * No filter (get all global organizations).
     * </pre>
     *
     * <code>bool global = 1 [json_name = "global"];</code>
     * @return This builder for chaining.
     */
    public Builder clearGlobal() {
      if (identifierCase_ == 1) {
        identifierCase_ = 0;
        identifier_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Filter by region.
     * </pre>
     *
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @return Whether the regionId field is set.
     */
    @java.lang.Override
    public boolean hasRegionId() {
      return identifierCase_ == 2;
    }
    /**
     * <pre>
     * Filter by region.
     * </pre>
     *
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @return The regionId.
     */
    @java.lang.Override
    public java.lang.String getRegionId() {
      java.lang.Object ref = "";
      if (identifierCase_ == 2) {
        ref = identifier_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (identifierCase_ == 2) {
          identifier_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Filter by region.
     * </pre>
     *
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @return The bytes for regionId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRegionIdBytes() {
      java.lang.Object ref = "";
      if (identifierCase_ == 2) {
        ref = identifier_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (identifierCase_ == 2) {
          identifier_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Filter by region.
     * </pre>
     *
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @param value The regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      identifierCase_ = 2;
      identifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter by region.
     * </pre>
     *
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionId() {
      if (identifierCase_ == 2) {
        identifierCase_ = 0;
        identifier_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Filter by region.
     * </pre>
     *
     * <code>string region_id = 2 [json_name = "regionId"];</code>
     * @param value The bytes for regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      identifierCase_ = 2;
      identifier_ = value;
      onChanged();
      return this;
    }

    private boolean archived_ ;
    /**
     * <pre>
     * Get only archived or unarchived organizations.
     * </pre>
     *
     * <code>bool archived = 3 [json_name = "archived"];</code>
     * @return The archived.
     */
    @java.lang.Override
    public boolean getArchived() {
      return archived_;
    }
    /**
     * <pre>
     * Get only archived or unarchived organizations.
     * </pre>
     *
     * <code>bool archived = 3 [json_name = "archived"];</code>
     * @param value The archived to set.
     * @return This builder for chaining.
     */
    public Builder setArchived(boolean value) {

      archived_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Get only archived or unarchived organizations.
     * </pre>
     *
     * <code>bool archived = 3 [json_name = "archived"];</code>
     * @return This builder for chaining.
     */
    public Builder clearArchived() {
      bitField0_ = (bitField0_ & ~0x00000004);
      archived_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.ListOrganizationsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.ListOrganizationsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOrganizationsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListOrganizationsRequest>() {
    @java.lang.Override
    public ListOrganizationsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOrganizationsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOrganizationsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.ListOrganizationsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

