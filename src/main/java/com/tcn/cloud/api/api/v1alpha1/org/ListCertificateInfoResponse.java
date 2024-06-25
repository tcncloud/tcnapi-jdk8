// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * ListCertificateInfoResponse is the response for listing certificate info.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.ListCertificateInfoResponse}
 */
public final class ListCertificateInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.ListCertificateInfoResponse)
    ListCertificateInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCertificateInfoResponse.newBuilder() to construct.
  private ListCertificateInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCertificateInfoResponse() {
    certificateInfoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCertificateInfoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_ListCertificateInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_ListCertificateInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse.class, com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse.Builder.class);
  }

  public static final int CERTIFICATE_INFO_LIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.org.CertificateInfo> certificateInfoList_;
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.org.CertificateInfo> getCertificateInfoListList() {
    return certificateInfoList_;
  }
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder> 
      getCertificateInfoListOrBuilderList() {
    return certificateInfoList_;
  }
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  @java.lang.Override
  public int getCertificateInfoListCount() {
    return certificateInfoList_.size();
  }
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.CertificateInfo getCertificateInfoList(int index) {
    return certificateInfoList_.get(index);
  }
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder getCertificateInfoListOrBuilder(
      int index) {
    return certificateInfoList_.get(index);
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
    for (int i = 0; i < certificateInfoList_.size(); i++) {
      output.writeMessage(1, certificateInfoList_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < certificateInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, certificateInfoList_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse other = (com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse) obj;

    if (!getCertificateInfoListList()
        .equals(other.getCertificateInfoListList())) return false;
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
    if (getCertificateInfoListCount() > 0) {
      hash = (37 * hash) + CERTIFICATE_INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getCertificateInfoListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse prototype) {
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
   * ListCertificateInfoResponse is the response for listing certificate info.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.ListCertificateInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.ListCertificateInfoResponse)
      com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_ListCertificateInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_ListCertificateInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse.class, com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse.newBuilder()
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
      if (certificateInfoListBuilder_ == null) {
        certificateInfoList_ = java.util.Collections.emptyList();
      } else {
        certificateInfoList_ = null;
        certificateInfoListBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.PreferencesProto.internal_static_api_v1alpha1_org_ListCertificateInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse result = new com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse result) {
      if (certificateInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          certificateInfoList_ = java.util.Collections.unmodifiableList(certificateInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.certificateInfoList_ = certificateInfoList_;
      } else {
        result.certificateInfoList_ = certificateInfoListBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse.getDefaultInstance()) return this;
      if (certificateInfoListBuilder_ == null) {
        if (!other.certificateInfoList_.isEmpty()) {
          if (certificateInfoList_.isEmpty()) {
            certificateInfoList_ = other.certificateInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCertificateInfoListIsMutable();
            certificateInfoList_.addAll(other.certificateInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.certificateInfoList_.isEmpty()) {
          if (certificateInfoListBuilder_.isEmpty()) {
            certificateInfoListBuilder_.dispose();
            certificateInfoListBuilder_ = null;
            certificateInfoList_ = other.certificateInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            certificateInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCertificateInfoListFieldBuilder() : null;
          } else {
            certificateInfoListBuilder_.addAllMessages(other.certificateInfoList_);
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
              com.tcn.cloud.api.api.commons.org.CertificateInfo m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.org.CertificateInfo.parser(),
                      extensionRegistry);
              if (certificateInfoListBuilder_ == null) {
                ensureCertificateInfoListIsMutable();
                certificateInfoList_.add(m);
              } else {
                certificateInfoListBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.org.CertificateInfo> certificateInfoList_ =
      java.util.Collections.emptyList();
    private void ensureCertificateInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        certificateInfoList_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.org.CertificateInfo>(certificateInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.CertificateInfo, com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder, com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder> certificateInfoListBuilder_;

    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.CertificateInfo> getCertificateInfoListList() {
      if (certificateInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(certificateInfoList_);
      } else {
        return certificateInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public int getCertificateInfoListCount() {
      if (certificateInfoListBuilder_ == null) {
        return certificateInfoList_.size();
      } else {
        return certificateInfoListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.CertificateInfo getCertificateInfoList(int index) {
      if (certificateInfoListBuilder_ == null) {
        return certificateInfoList_.get(index);
      } else {
        return certificateInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder setCertificateInfoList(
        int index, com.tcn.cloud.api.api.commons.org.CertificateInfo value) {
      if (certificateInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificateInfoListIsMutable();
        certificateInfoList_.set(index, value);
        onChanged();
      } else {
        certificateInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder setCertificateInfoList(
        int index, com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder builderForValue) {
      if (certificateInfoListBuilder_ == null) {
        ensureCertificateInfoListIsMutable();
        certificateInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        certificateInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder addCertificateInfoList(com.tcn.cloud.api.api.commons.org.CertificateInfo value) {
      if (certificateInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificateInfoListIsMutable();
        certificateInfoList_.add(value);
        onChanged();
      } else {
        certificateInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder addCertificateInfoList(
        int index, com.tcn.cloud.api.api.commons.org.CertificateInfo value) {
      if (certificateInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCertificateInfoListIsMutable();
        certificateInfoList_.add(index, value);
        onChanged();
      } else {
        certificateInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder addCertificateInfoList(
        com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder builderForValue) {
      if (certificateInfoListBuilder_ == null) {
        ensureCertificateInfoListIsMutable();
        certificateInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        certificateInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder addCertificateInfoList(
        int index, com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder builderForValue) {
      if (certificateInfoListBuilder_ == null) {
        ensureCertificateInfoListIsMutable();
        certificateInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        certificateInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder addAllCertificateInfoList(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.org.CertificateInfo> values) {
      if (certificateInfoListBuilder_ == null) {
        ensureCertificateInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, certificateInfoList_);
        onChanged();
      } else {
        certificateInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder clearCertificateInfoList() {
      if (certificateInfoListBuilder_ == null) {
        certificateInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        certificateInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public Builder removeCertificateInfoList(int index) {
      if (certificateInfoListBuilder_ == null) {
        ensureCertificateInfoListIsMutable();
        certificateInfoList_.remove(index);
        onChanged();
      } else {
        certificateInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder getCertificateInfoListBuilder(
        int index) {
      return getCertificateInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder getCertificateInfoListOrBuilder(
        int index) {
      if (certificateInfoListBuilder_ == null) {
        return certificateInfoList_.get(index);  } else {
        return certificateInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder> 
         getCertificateInfoListOrBuilderList() {
      if (certificateInfoListBuilder_ != null) {
        return certificateInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(certificateInfoList_);
      }
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder addCertificateInfoListBuilder() {
      return getCertificateInfoListFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.org.CertificateInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder addCertificateInfoListBuilder(
        int index) {
      return getCertificateInfoListFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.org.CertificateInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of certificate info.
     * </pre>
     *
     * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder> 
         getCertificateInfoListBuilderList() {
      return getCertificateInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.CertificateInfo, com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder, com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder> 
        getCertificateInfoListFieldBuilder() {
      if (certificateInfoListBuilder_ == null) {
        certificateInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.CertificateInfo, com.tcn.cloud.api.api.commons.org.CertificateInfo.Builder, com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder>(
                certificateInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        certificateInfoList_ = null;
      }
      return certificateInfoListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.ListCertificateInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.ListCertificateInfoResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCertificateInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCertificateInfoResponse>() {
    @java.lang.Override
    public ListCertificateInfoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCertificateInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCertificateInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.ListCertificateInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

