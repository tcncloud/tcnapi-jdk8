// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/matching.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

/**
 * Protobuf type {@code services.billing.entities.v1alpha1.MatchingConfigAreaCode}
 */
@java.lang.Deprecated public final class MatchingConfigAreaCode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.entities.v1alpha1.MatchingConfigAreaCode)
    MatchingConfigAreaCodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MatchingConfigAreaCode.newBuilder() to construct.
  private MatchingConfigAreaCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MatchingConfigAreaCode() {
    name_ = "";
    areaCodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MatchingConfigAreaCode();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingProto.internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingProto.internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode.class, com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1 [json_name = "name", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.name is deprecated.
   *     See services/billing/entities/v1alpha1/matching.proto;l=26
   * @return The name.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1 [json_name = "name", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.name is deprecated.
   *     See services/billing/entities/v1alpha1/matching.proto;l=26
   * @return The bytes for name.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AREA_CODES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList areaCodes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
   *     See services/billing/entities/v1alpha1/matching.proto;l=27
   * @return A list containing the areaCodes.
   */
  @java.lang.Deprecated public com.google.protobuf.ProtocolStringList
      getAreaCodesList() {
    return areaCodes_;
  }
  /**
   * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
   *     See services/billing/entities/v1alpha1/matching.proto;l=27
   * @return The count of areaCodes.
   */
  @java.lang.Deprecated public int getAreaCodesCount() {
    return areaCodes_.size();
  }
  /**
   * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
   *     See services/billing/entities/v1alpha1/matching.proto;l=27
   * @param index The index of the element to return.
   * @return The areaCodes at the given index.
   */
  @java.lang.Deprecated public java.lang.String getAreaCodes(int index) {
    return areaCodes_.get(index);
  }
  /**
   * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
   *     See services/billing/entities/v1alpha1/matching.proto;l=27
   * @param index The index of the value to return.
   * @return The bytes of the areaCodes at the given index.
   */
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getAreaCodesBytes(int index) {
    return areaCodes_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < areaCodes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, areaCodes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < areaCodes_.size(); i++) {
        dataSize += computeStringSizeNoTag(areaCodes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAreaCodesList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode other = (com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getAreaCodesList()
        .equals(other.getAreaCodesList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getAreaCodesCount() > 0) {
      hash = (37 * hash) + AREA_CODES_FIELD_NUMBER;
      hash = (53 * hash) + getAreaCodesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode prototype) {
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
   * Protobuf type {@code services.billing.entities.v1alpha1.MatchingConfigAreaCode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.entities.v1alpha1.MatchingConfigAreaCode)
      com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingProto.internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingProto.internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode.class, com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode.newBuilder()
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
      name_ = "";
      areaCodes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingProto.internal_static_services_billing_entities_v1alpha1_MatchingConfigAreaCode_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode build() {
      com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode buildPartial() {
      com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode result = new com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        areaCodes_.makeImmutable();
        result.areaCodes_ = areaCodes_;
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
      if (other instanceof com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode) {
        return mergeFrom((com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode other) {
      if (other == com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.areaCodes_.isEmpty()) {
        if (areaCodes_.isEmpty()) {
          areaCodes_ = other.areaCodes_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAreaCodesIsMutable();
          areaCodes_.addAll(other.areaCodes_);
        }
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAreaCodesIsMutable();
              areaCodes_.add(s);
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.name is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=26
     * @return The name.
     */
    @java.lang.Deprecated public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.name is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=26
     * @return The bytes for name.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.name is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=26
     * @param value The name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.name is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=26
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.name is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=26
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList areaCodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAreaCodesIsMutable() {
      if (!areaCodes_.isModifiable()) {
        areaCodes_ = new com.google.protobuf.LazyStringArrayList(areaCodes_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @return A list containing the areaCodes.
     */
    @java.lang.Deprecated public com.google.protobuf.ProtocolStringList
        getAreaCodesList() {
      areaCodes_.makeImmutable();
      return areaCodes_;
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @return The count of areaCodes.
     */
    @java.lang.Deprecated public int getAreaCodesCount() {
      return areaCodes_.size();
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @param index The index of the element to return.
     * @return The areaCodes at the given index.
     */
    @java.lang.Deprecated public java.lang.String getAreaCodes(int index) {
      return areaCodes_.get(index);
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @param index The index of the value to return.
     * @return The bytes of the areaCodes at the given index.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getAreaCodesBytes(int index) {
      return areaCodes_.getByteString(index);
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @param index The index to set the value at.
     * @param value The areaCodes to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setAreaCodes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAreaCodesIsMutable();
      areaCodes_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @param value The areaCodes to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAreaCodes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAreaCodesIsMutable();
      areaCodes_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @param values The areaCodes to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAllAreaCodes(
        java.lang.Iterable<java.lang.String> values) {
      ensureAreaCodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, areaCodes_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearAreaCodes() {
      areaCodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string area_codes = 2 [json_name = "areaCodes", deprecated = true];</code>
     * @deprecated services.billing.entities.v1alpha1.MatchingConfigAreaCode.area_codes is deprecated.
     *     See services/billing/entities/v1alpha1/matching.proto;l=27
     * @param value The bytes of the areaCodes to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAreaCodesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAreaCodesIsMutable();
      areaCodes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:services.billing.entities.v1alpha1.MatchingConfigAreaCode)
  }

  // @@protoc_insertion_point(class_scope:services.billing.entities.v1alpha1.MatchingConfigAreaCode)
  private static final com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode();
  }

  public static com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatchingConfigAreaCode>
      PARSER = new com.google.protobuf.AbstractParser<MatchingConfigAreaCode>() {
    @java.lang.Override
    public MatchingConfigAreaCode parsePartialFrom(
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

  public static com.google.protobuf.Parser<MatchingConfigAreaCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatchingConfigAreaCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.MatchingConfigAreaCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

