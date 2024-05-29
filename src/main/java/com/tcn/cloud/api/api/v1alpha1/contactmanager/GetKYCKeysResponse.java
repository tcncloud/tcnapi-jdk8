// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

/**
 * Protobuf type {@code api.v1alpha1.contactmanager.GetKYCKeysResponse}
 */
public final class GetKYCKeysResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.contactmanager.GetKYCKeysResponse)
    GetKYCKeysResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetKYCKeysResponse.newBuilder() to construct.
  private GetKYCKeysResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetKYCKeysResponse() {
    entryType_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetKYCKeysResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.Builder.class);
  }

  public static final int ENTRY_TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList entryType_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
   * @return A list containing the entryType.
   */
  public com.google.protobuf.ProtocolStringList
      getEntryTypeList() {
    return entryType_;
  }
  /**
   * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
   * @return The count of entryType.
   */
  public int getEntryTypeCount() {
    return entryType_.size();
  }
  /**
   * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
   * @param index The index of the element to return.
   * @return The entryType at the given index.
   */
  public java.lang.String getEntryType(int index) {
    return entryType_.get(index);
  }
  /**
   * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the entryType at the given index.
   */
  public com.google.protobuf.ByteString
      getEntryTypeBytes(int index) {
    return entryType_.getByteString(index);
  }

  public static final int KYC_LIMIT_FIELD_NUMBER = 2;
  private long kycLimit_ = 0L;
  /**
   * <code>int64 kyc_limit = 2 [json_name = "kycLimit", deprecated = true];</code>
   * @deprecated api.v1alpha1.contactmanager.GetKYCKeysResponse.kyc_limit is deprecated.
   *     See api/v1alpha1/contactmanager/contactmanager.proto;l=57
   * @return The kycLimit.
   */
  @java.lang.Override
  @java.lang.Deprecated public long getKycLimit() {
    return kycLimit_;
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
    for (int i = 0; i < entryType_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entryType_.getRaw(i));
    }
    if (kycLimit_ != 0L) {
      output.writeInt64(2, kycLimit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < entryType_.size(); i++) {
        dataSize += computeStringSizeNoTag(entryType_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntryTypeList().size();
    }
    if (kycLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, kycLimit_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse other = (com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse) obj;

    if (!getEntryTypeList()
        .equals(other.getEntryTypeList())) return false;
    if (getKycLimit()
        != other.getKycLimit()) return false;
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
    if (getEntryTypeCount() > 0) {
      hash = (37 * hash) + ENTRY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEntryTypeList().hashCode();
    }
    hash = (37 * hash) + KYC_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getKycLimit());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.contactmanager.GetKYCKeysResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.contactmanager.GetKYCKeysResponse)
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.newBuilder()
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
      entryType_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      kycLimit_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetKYCKeysResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse build() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse result = new com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        entryType_.makeImmutable();
        result.entryType_ = entryType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.kycLimit_ = kycLimit_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.getDefaultInstance()) return this;
      if (!other.entryType_.isEmpty()) {
        if (entryType_.isEmpty()) {
          entryType_ = other.entryType_;
          bitField0_ |= 0x00000001;
        } else {
          ensureEntryTypeIsMutable();
          entryType_.addAll(other.entryType_);
        }
        onChanged();
      }
      if (other.getKycLimit() != 0L) {
        setKycLimit(other.getKycLimit());
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureEntryTypeIsMutable();
              entryType_.add(s);
              break;
            } // case 10
            case 16: {
              kycLimit_ = input.readInt64();
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

    private com.google.protobuf.LazyStringArrayList entryType_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureEntryTypeIsMutable() {
      if (!entryType_.isModifiable()) {
        entryType_ = new com.google.protobuf.LazyStringArrayList(entryType_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @return A list containing the entryType.
     */
    public com.google.protobuf.ProtocolStringList
        getEntryTypeList() {
      entryType_.makeImmutable();
      return entryType_;
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @return The count of entryType.
     */
    public int getEntryTypeCount() {
      return entryType_.size();
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @param index The index of the element to return.
     * @return The entryType at the given index.
     */
    public java.lang.String getEntryType(int index) {
      return entryType_.get(index);
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the entryType at the given index.
     */
    public com.google.protobuf.ByteString
        getEntryTypeBytes(int index) {
      return entryType_.getByteString(index);
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @param index The index to set the value at.
     * @param value The entryType to set.
     * @return This builder for chaining.
     */
    public Builder setEntryType(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntryTypeIsMutable();
      entryType_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @param value The entryType to add.
     * @return This builder for chaining.
     */
    public Builder addEntryType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntryTypeIsMutable();
      entryType_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @param values The entryType to add.
     * @return This builder for chaining.
     */
    public Builder addAllEntryType(
        java.lang.Iterable<java.lang.String> values) {
      ensureEntryTypeIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, entryType_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntryType() {
      entryType_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string entry_type = 1 [json_name = "entryType"];</code>
     * @param value The bytes of the entryType to add.
     * @return This builder for chaining.
     */
    public Builder addEntryTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEntryTypeIsMutable();
      entryType_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long kycLimit_ ;
    /**
     * <code>int64 kyc_limit = 2 [json_name = "kycLimit", deprecated = true];</code>
     * @deprecated api.v1alpha1.contactmanager.GetKYCKeysResponse.kyc_limit is deprecated.
     *     See api/v1alpha1/contactmanager/contactmanager.proto;l=57
     * @return The kycLimit.
     */
    @java.lang.Override
    @java.lang.Deprecated public long getKycLimit() {
      return kycLimit_;
    }
    /**
     * <code>int64 kyc_limit = 2 [json_name = "kycLimit", deprecated = true];</code>
     * @deprecated api.v1alpha1.contactmanager.GetKYCKeysResponse.kyc_limit is deprecated.
     *     See api/v1alpha1/contactmanager/contactmanager.proto;l=57
     * @param value The kycLimit to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setKycLimit(long value) {

      kycLimit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 kyc_limit = 2 [json_name = "kycLimit", deprecated = true];</code>
     * @deprecated api.v1alpha1.contactmanager.GetKYCKeysResponse.kyc_limit is deprecated.
     *     See api/v1alpha1/contactmanager/contactmanager.proto;l=57
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearKycLimit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      kycLimit_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.contactmanager.GetKYCKeysResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.contactmanager.GetKYCKeysResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetKYCKeysResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetKYCKeysResponse>() {
    @java.lang.Override
    public GetKYCKeysResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetKYCKeysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetKYCKeysResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

