// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetCountriesListResponse}
 */
public final class GetCountriesListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetCountriesListResponse)
    GetCountriesListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCountriesListResponse.newBuilder() to construct.
  private GetCountriesListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCountriesListResponse() {
    countries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCountriesListResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetCountriesListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetCountriesListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.class, com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.Builder.class);
  }

  public static final int COUNTRIES_FIELD_NUMBER = 10;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.Country> countries_;
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.Country> getCountriesList() {
    return countries_;
  }
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CountryOrBuilder> 
      getCountriesOrBuilderList() {
    return countries_;
  }
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  @java.lang.Override
  public int getCountriesCount() {
    return countries_.size();
  }
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Country getCountries(int index) {
    return countries_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CountryOrBuilder getCountriesOrBuilder(
      int index) {
    return countries_.get(index);
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
    for (int i = 0; i < countries_.size(); i++) {
      output.writeMessage(10, countries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < countries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, countries_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse other = (com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse) obj;

    if (!getCountriesList()
        .equals(other.getCountriesList())) return false;
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
    if (getCountriesCount() > 0) {
      hash = (37 * hash) + COUNTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getCountriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse prototype) {
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
   * Protobuf type {@code api.v0alpha.GetCountriesListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetCountriesListResponse)
      com.tcn.cloud.api.api.v0alpha.GetCountriesListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetCountriesListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetCountriesListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.class, com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.newBuilder()
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
      if (countriesBuilder_ == null) {
        countries_ = java.util.Collections.emptyList();
      } else {
        countries_ = null;
        countriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_GetCountriesListResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse build() {
      com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse result = new com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse result) {
      if (countriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          countries_ = java.util.Collections.unmodifiableList(countries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.countries_ = countries_;
      } else {
        result.countries_ = countriesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse.getDefaultInstance()) return this;
      if (countriesBuilder_ == null) {
        if (!other.countries_.isEmpty()) {
          if (countries_.isEmpty()) {
            countries_ = other.countries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCountriesIsMutable();
            countries_.addAll(other.countries_);
          }
          onChanged();
        }
      } else {
        if (!other.countries_.isEmpty()) {
          if (countriesBuilder_.isEmpty()) {
            countriesBuilder_.dispose();
            countriesBuilder_ = null;
            countries_ = other.countries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            countriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCountriesFieldBuilder() : null;
          } else {
            countriesBuilder_.addAllMessages(other.countries_);
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
            case 82: {
              com.tcn.cloud.api.api.v0alpha.Country m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.Country.parser(),
                      extensionRegistry);
              if (countriesBuilder_ == null) {
                ensureCountriesIsMutable();
                countries_.add(m);
              } else {
                countriesBuilder_.addMessage(m);
              }
              break;
            } // case 82
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.Country> countries_ =
      java.util.Collections.emptyList();
    private void ensureCountriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        countries_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.Country>(countries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Country, com.tcn.cloud.api.api.v0alpha.Country.Builder, com.tcn.cloud.api.api.v0alpha.CountryOrBuilder> countriesBuilder_;

    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Country> getCountriesList() {
      if (countriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(countries_);
      } else {
        return countriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public int getCountriesCount() {
      if (countriesBuilder_ == null) {
        return countries_.size();
      } else {
        return countriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Country getCountries(int index) {
      if (countriesBuilder_ == null) {
        return countries_.get(index);
      } else {
        return countriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder setCountries(
        int index, com.tcn.cloud.api.api.v0alpha.Country value) {
      if (countriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCountriesIsMutable();
        countries_.set(index, value);
        onChanged();
      } else {
        countriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder setCountries(
        int index, com.tcn.cloud.api.api.v0alpha.Country.Builder builderForValue) {
      if (countriesBuilder_ == null) {
        ensureCountriesIsMutable();
        countries_.set(index, builderForValue.build());
        onChanged();
      } else {
        countriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder addCountries(com.tcn.cloud.api.api.v0alpha.Country value) {
      if (countriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCountriesIsMutable();
        countries_.add(value);
        onChanged();
      } else {
        countriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder addCountries(
        int index, com.tcn.cloud.api.api.v0alpha.Country value) {
      if (countriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCountriesIsMutable();
        countries_.add(index, value);
        onChanged();
      } else {
        countriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder addCountries(
        com.tcn.cloud.api.api.v0alpha.Country.Builder builderForValue) {
      if (countriesBuilder_ == null) {
        ensureCountriesIsMutable();
        countries_.add(builderForValue.build());
        onChanged();
      } else {
        countriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder addCountries(
        int index, com.tcn.cloud.api.api.v0alpha.Country.Builder builderForValue) {
      if (countriesBuilder_ == null) {
        ensureCountriesIsMutable();
        countries_.add(index, builderForValue.build());
        onChanged();
      } else {
        countriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder addAllCountries(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.Country> values) {
      if (countriesBuilder_ == null) {
        ensureCountriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, countries_);
        onChanged();
      } else {
        countriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder clearCountries() {
      if (countriesBuilder_ == null) {
        countries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        countriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public Builder removeCountries(int index) {
      if (countriesBuilder_ == null) {
        ensureCountriesIsMutable();
        countries_.remove(index);
        onChanged();
      } else {
        countriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Country.Builder getCountriesBuilder(
        int index) {
      return getCountriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.CountryOrBuilder getCountriesOrBuilder(
        int index) {
      if (countriesBuilder_ == null) {
        return countries_.get(index);  } else {
        return countriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.CountryOrBuilder> 
         getCountriesOrBuilderList() {
      if (countriesBuilder_ != null) {
        return countriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(countries_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Country.Builder addCountriesBuilder() {
      return getCountriesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.Country.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Country.Builder addCountriesBuilder(
        int index) {
      return getCountriesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.Country.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Country countries = 10 [json_name = "countries"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Country.Builder> 
         getCountriesBuilderList() {
      return getCountriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Country, com.tcn.cloud.api.api.v0alpha.Country.Builder, com.tcn.cloud.api.api.v0alpha.CountryOrBuilder> 
        getCountriesFieldBuilder() {
      if (countriesBuilder_ == null) {
        countriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Country, com.tcn.cloud.api.api.v0alpha.Country.Builder, com.tcn.cloud.api.api.v0alpha.CountryOrBuilder>(
                countries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        countries_ = null;
      }
      return countriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetCountriesListResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetCountriesListResponse)
  private static final com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCountriesListResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCountriesListResponse>() {
    @java.lang.Override
    public GetCountriesListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCountriesListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCountriesListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetCountriesListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

