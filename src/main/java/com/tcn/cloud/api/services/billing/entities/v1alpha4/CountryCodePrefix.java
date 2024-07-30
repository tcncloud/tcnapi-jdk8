// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha4/matching.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha4;

/**
 * Protobuf type {@code services.billing.entities.v1alpha4.CountryCodePrefix}
 */
public final class CountryCodePrefix extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.entities.v1alpha4.CountryCodePrefix)
    CountryCodePrefixOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CountryCodePrefix.newBuilder() to construct.
  private CountryCodePrefix(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CountryCodePrefix() {
    prefixes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CountryCodePrefix();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.entities.v1alpha4.MatchingProto.internal_static_services_billing_entities_v1alpha4_CountryCodePrefix_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.entities.v1alpha4.MatchingProto.internal_static_services_billing_entities_v1alpha4_CountryCodePrefix_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix.class, com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix.Builder.class);
  }

  public static final int COUNTRY_CODE_FIELD_NUMBER = 1;
  private int countryCode_ = 0;
  /**
   * <pre>
   * The country code to match.
   * </pre>
   *
   * <code>int32 country_code = 1 [json_name = "countryCode"];</code>
   * @return The countryCode.
   */
  @java.lang.Override
  public int getCountryCode() {
    return countryCode_;
  }

  public static final int PREFIXES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList prefixes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The list of prefixes (if any) to match after successfully
   * matching the country code.
   * </pre>
   *
   * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
   * @return A list containing the prefixes.
   */
  public com.google.protobuf.ProtocolStringList
      getPrefixesList() {
    return prefixes_;
  }
  /**
   * <pre>
   * The list of prefixes (if any) to match after successfully
   * matching the country code.
   * </pre>
   *
   * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
   * @return The count of prefixes.
   */
  public int getPrefixesCount() {
    return prefixes_.size();
  }
  /**
   * <pre>
   * The list of prefixes (if any) to match after successfully
   * matching the country code.
   * </pre>
   *
   * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
   * @param index The index of the element to return.
   * @return The prefixes at the given index.
   */
  public java.lang.String getPrefixes(int index) {
    return prefixes_.get(index);
  }
  /**
   * <pre>
   * The list of prefixes (if any) to match after successfully
   * matching the country code.
   * </pre>
   *
   * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the prefixes at the given index.
   */
  public com.google.protobuf.ByteString
      getPrefixesBytes(int index) {
    return prefixes_.getByteString(index);
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
    if (countryCode_ != 0) {
      output.writeInt32(1, countryCode_);
    }
    for (int i = 0; i < prefixes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, prefixes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (countryCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, countryCode_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < prefixes_.size(); i++) {
        dataSize += computeStringSizeNoTag(prefixes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPrefixesList().size();
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix other = (com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix) obj;

    if (getCountryCode()
        != other.getCountryCode()) return false;
    if (!getPrefixesList()
        .equals(other.getPrefixesList())) return false;
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
    hash = (37 * hash) + COUNTRY_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCountryCode();
    if (getPrefixesCount() > 0) {
      hash = (37 * hash) + PREFIXES_FIELD_NUMBER;
      hash = (53 * hash) + getPrefixesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix prototype) {
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
   * Protobuf type {@code services.billing.entities.v1alpha4.CountryCodePrefix}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.entities.v1alpha4.CountryCodePrefix)
      com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefixOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.entities.v1alpha4.MatchingProto.internal_static_services_billing_entities_v1alpha4_CountryCodePrefix_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.entities.v1alpha4.MatchingProto.internal_static_services_billing_entities_v1alpha4_CountryCodePrefix_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix.class, com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix.newBuilder()
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
      countryCode_ = 0;
      prefixes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.entities.v1alpha4.MatchingProto.internal_static_services_billing_entities_v1alpha4_CountryCodePrefix_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix build() {
      com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix buildPartial() {
      com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix result = new com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.countryCode_ = countryCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        prefixes_.makeImmutable();
        result.prefixes_ = prefixes_;
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
      if (other instanceof com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix) {
        return mergeFrom((com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix other) {
      if (other == com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix.getDefaultInstance()) return this;
      if (other.getCountryCode() != 0) {
        setCountryCode(other.getCountryCode());
      }
      if (!other.prefixes_.isEmpty()) {
        if (prefixes_.isEmpty()) {
          prefixes_ = other.prefixes_;
          bitField0_ |= 0x00000002;
        } else {
          ensurePrefixesIsMutable();
          prefixes_.addAll(other.prefixes_);
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
            case 8: {
              countryCode_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePrefixesIsMutable();
              prefixes_.add(s);
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

    private int countryCode_ ;
    /**
     * <pre>
     * The country code to match.
     * </pre>
     *
     * <code>int32 country_code = 1 [json_name = "countryCode"];</code>
     * @return The countryCode.
     */
    @java.lang.Override
    public int getCountryCode() {
      return countryCode_;
    }
    /**
     * <pre>
     * The country code to match.
     * </pre>
     *
     * <code>int32 country_code = 1 [json_name = "countryCode"];</code>
     * @param value The countryCode to set.
     * @return This builder for chaining.
     */
    public Builder setCountryCode(int value) {

      countryCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The country code to match.
     * </pre>
     *
     * <code>int32 country_code = 1 [json_name = "countryCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountryCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      countryCode_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList prefixes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePrefixesIsMutable() {
      if (!prefixes_.isModifiable()) {
        prefixes_ = new com.google.protobuf.LazyStringArrayList(prefixes_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @return A list containing the prefixes.
     */
    public com.google.protobuf.ProtocolStringList
        getPrefixesList() {
      prefixes_.makeImmutable();
      return prefixes_;
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @return The count of prefixes.
     */
    public int getPrefixesCount() {
      return prefixes_.size();
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @param index The index of the element to return.
     * @return The prefixes at the given index.
     */
    public java.lang.String getPrefixes(int index) {
      return prefixes_.get(index);
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the prefixes at the given index.
     */
    public com.google.protobuf.ByteString
        getPrefixesBytes(int index) {
      return prefixes_.getByteString(index);
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @param index The index to set the value at.
     * @param value The prefixes to set.
     * @return This builder for chaining.
     */
    public Builder setPrefixes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePrefixesIsMutable();
      prefixes_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @param value The prefixes to add.
     * @return This builder for chaining.
     */
    public Builder addPrefixes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePrefixesIsMutable();
      prefixes_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @param values The prefixes to add.
     * @return This builder for chaining.
     */
    public Builder addAllPrefixes(
        java.lang.Iterable<java.lang.String> values) {
      ensurePrefixesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, prefixes_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPrefixes() {
      prefixes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The list of prefixes (if any) to match after successfully
     * matching the country code.
     * </pre>
     *
     * <code>repeated string prefixes = 2 [json_name = "prefixes"];</code>
     * @param value The bytes of the prefixes to add.
     * @return This builder for chaining.
     */
    public Builder addPrefixesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePrefixesIsMutable();
      prefixes_.add(value);
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


    // @@protoc_insertion_point(builder_scope:services.billing.entities.v1alpha4.CountryCodePrefix)
  }

  // @@protoc_insertion_point(class_scope:services.billing.entities.v1alpha4.CountryCodePrefix)
  private static final com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix();
  }

  public static com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CountryCodePrefix>
      PARSER = new com.google.protobuf.AbstractParser<CountryCodePrefix>() {
    @java.lang.Override
    public CountryCodePrefix parsePartialFrom(
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

  public static com.google.protobuf.Parser<CountryCodePrefix> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CountryCodePrefix> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha4.CountryCodePrefix getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

