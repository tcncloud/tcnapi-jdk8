// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/permissions.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response message for the GetOrgLicenses RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.GetOrgLicensesResponse}
 */
public final class GetOrgLicensesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.GetOrgLicensesResponse)
    GetOrgLicensesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetOrgLicensesResponse.newBuilder() to construct.
  private GetOrgLicensesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetOrgLicensesResponse() {
    licenses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetOrgLicensesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PermissionsProto.internal_static_api_v1alpha1_org_GetOrgLicensesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PermissionsProto.internal_static_api_v1alpha1_org_GetOrgLicensesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.Builder.class);
  }

  public static final int LICENSES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.org.License> licenses_;
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.org.License> getLicensesList() {
    return licenses_;
  }
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.org.LicenseOrBuilder> 
      getLicensesOrBuilderList() {
    return licenses_;
  }
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public int getLicensesCount() {
    return licenses_.size();
  }
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.License getLicenses(int index) {
    return licenses_.get(index);
  }
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.LicenseOrBuilder getLicensesOrBuilder(
      int index) {
    return licenses_.get(index);
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
    for (int i = 0; i < licenses_.size(); i++) {
      output.writeMessage(1, licenses_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < licenses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, licenses_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse) obj;

    if (!getLicensesList()
        .equals(other.getLicensesList())) return false;
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
    if (getLicensesCount() > 0) {
      hash = (37 * hash) + LICENSES_FIELD_NUMBER;
      hash = (53 * hash) + getLicensesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse prototype) {
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
   * Response message for the GetOrgLicenses RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.GetOrgLicensesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.GetOrgLicensesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PermissionsProto.internal_static_api_v1alpha1_org_GetOrgLicensesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PermissionsProto.internal_static_api_v1alpha1_org_GetOrgLicensesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.newBuilder()
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
      if (licensesBuilder_ == null) {
        licenses_ = java.util.Collections.emptyList();
      } else {
        licenses_ = null;
        licensesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.PermissionsProto.internal_static_api_v1alpha1_org_GetOrgLicensesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse result) {
      if (licensesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          licenses_ = java.util.Collections.unmodifiableList(licenses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.licenses_ = licenses_;
      } else {
        result.licenses_ = licensesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse.getDefaultInstance()) return this;
      if (licensesBuilder_ == null) {
        if (!other.licenses_.isEmpty()) {
          if (licenses_.isEmpty()) {
            licenses_ = other.licenses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLicensesIsMutable();
            licenses_.addAll(other.licenses_);
          }
          onChanged();
        }
      } else {
        if (!other.licenses_.isEmpty()) {
          if (licensesBuilder_.isEmpty()) {
            licensesBuilder_.dispose();
            licensesBuilder_ = null;
            licenses_ = other.licenses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            licensesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLicensesFieldBuilder() : null;
          } else {
            licensesBuilder_.addAllMessages(other.licenses_);
          }
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
            case 10: {
              com.tcn.cloud.api.api.commons.org.License m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.org.License.parser(),
                      extensionRegistry);
              if (licensesBuilder_ == null) {
                ensureLicensesIsMutable();
                licenses_.add(m);
              } else {
                licensesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.commons.org.License> licenses_ =
      java.util.Collections.emptyList();
    private void ensureLicensesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        licenses_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.org.License>(licenses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.License, com.tcn.cloud.api.api.commons.org.License.Builder, com.tcn.cloud.api.api.commons.org.LicenseOrBuilder> licensesBuilder_;

    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.License> getLicensesList() {
      if (licensesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(licenses_);
      } else {
        return licensesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public int getLicensesCount() {
      if (licensesBuilder_ == null) {
        return licenses_.size();
      } else {
        return licensesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.License getLicenses(int index) {
      if (licensesBuilder_ == null) {
        return licenses_.get(index);
      } else {
        return licensesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder setLicenses(
        int index, com.tcn.cloud.api.api.commons.org.License value) {
      if (licensesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLicensesIsMutable();
        licenses_.set(index, value);
        onChanged();
      } else {
        licensesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder setLicenses(
        int index, com.tcn.cloud.api.api.commons.org.License.Builder builderForValue) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        licenses_.set(index, builderForValue.build());
        onChanged();
      } else {
        licensesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addLicenses(com.tcn.cloud.api.api.commons.org.License value) {
      if (licensesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLicensesIsMutable();
        licenses_.add(value);
        onChanged();
      } else {
        licensesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addLicenses(
        int index, com.tcn.cloud.api.api.commons.org.License value) {
      if (licensesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLicensesIsMutable();
        licenses_.add(index, value);
        onChanged();
      } else {
        licensesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addLicenses(
        com.tcn.cloud.api.api.commons.org.License.Builder builderForValue) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        licenses_.add(builderForValue.build());
        onChanged();
      } else {
        licensesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addLicenses(
        int index, com.tcn.cloud.api.api.commons.org.License.Builder builderForValue) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        licenses_.add(index, builderForValue.build());
        onChanged();
      } else {
        licensesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder addAllLicenses(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.org.License> values) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, licenses_);
        onChanged();
      } else {
        licensesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder clearLicenses() {
      if (licensesBuilder_ == null) {
        licenses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        licensesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public Builder removeLicenses(int index) {
      if (licensesBuilder_ == null) {
        ensureLicensesIsMutable();
        licenses_.remove(index);
        onChanged();
      } else {
        licensesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.License.Builder getLicensesBuilder(
        int index) {
      return getLicensesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.LicenseOrBuilder getLicensesOrBuilder(
        int index) {
      if (licensesBuilder_ == null) {
        return licenses_.get(index);  } else {
        return licensesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.org.LicenseOrBuilder> 
         getLicensesOrBuilderList() {
      if (licensesBuilder_ != null) {
        return licensesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(licenses_);
      }
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.License.Builder addLicensesBuilder() {
      return getLicensesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.org.License.getDefaultInstance());
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.License.Builder addLicensesBuilder(
        int index) {
      return getLicensesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.org.License.getDefaultInstance());
    }
    /**
     * <pre>
     * List of licenses organization is authorized for.
     * </pre>
     *
     * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.License.Builder> 
         getLicensesBuilderList() {
      return getLicensesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.License, com.tcn.cloud.api.api.commons.org.License.Builder, com.tcn.cloud.api.api.commons.org.LicenseOrBuilder> 
        getLicensesFieldBuilder() {
      if (licensesBuilder_ == null) {
        licensesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.License, com.tcn.cloud.api.api.commons.org.License.Builder, com.tcn.cloud.api.api.commons.org.LicenseOrBuilder>(
                licenses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        licenses_ = null;
      }
      return licensesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.GetOrgLicensesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.GetOrgLicensesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOrgLicensesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetOrgLicensesResponse>() {
    @java.lang.Override
    public GetOrgLicensesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetOrgLicensesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOrgLicensesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.GetOrgLicensesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

