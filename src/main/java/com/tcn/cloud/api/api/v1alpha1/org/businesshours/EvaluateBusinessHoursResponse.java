// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/businesshours/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.businesshours;

/**
 * <pre>
 * Response for EvaluateBusinessHours
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse}
 */
public final class EvaluateBusinessHoursResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse)
    EvaluateBusinessHoursResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EvaluateBusinessHoursResponse.newBuilder() to construct.
  private EvaluateBusinessHoursResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EvaluateBusinessHoursResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EvaluateBusinessHoursResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.businesshours.EntitiesProto.internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.businesshours.EntitiesProto.internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.class, com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.Builder.class);
  }

  public static final int WITHIN_RANGE_FIELD_NUMBER = 1;
  private boolean withinRange_ = false;
  /**
   * <pre>
   * Resulting boolean if the current time is within
   * a day interval of a business hours object
   * </pre>
   *
   * <code>bool within_range = 1 [json_name = "withinRange"];</code>
   * @return The withinRange.
   */
  @java.lang.Override
  public boolean getWithinRange() {
    return withinRange_;
  }

  public static final int RESULT_EXPIRATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp resultExpiration_;
  /**
   * <pre>
   * indicates how long this result can be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
   * @return Whether the resultExpiration field is set.
   */
  @java.lang.Override
  public boolean hasResultExpiration() {
    return resultExpiration_ != null;
  }
  /**
   * <pre>
   * indicates how long this result can be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
   * @return The resultExpiration.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getResultExpiration() {
    return resultExpiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : resultExpiration_;
  }
  /**
   * <pre>
   * indicates how long this result can be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getResultExpirationOrBuilder() {
    return resultExpiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : resultExpiration_;
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
    if (withinRange_ != false) {
      output.writeBool(1, withinRange_);
    }
    if (resultExpiration_ != null) {
      output.writeMessage(2, getResultExpiration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (withinRange_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, withinRange_);
    }
    if (resultExpiration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResultExpiration());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse other = (com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse) obj;

    if (getWithinRange()
        != other.getWithinRange()) return false;
    if (hasResultExpiration() != other.hasResultExpiration()) return false;
    if (hasResultExpiration()) {
      if (!getResultExpiration()
          .equals(other.getResultExpiration())) return false;
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
    hash = (37 * hash) + WITHIN_RANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithinRange());
    if (hasResultExpiration()) {
      hash = (37 * hash) + RESULT_EXPIRATION_FIELD_NUMBER;
      hash = (53 * hash) + getResultExpiration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse prototype) {
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
   * Response for EvaluateBusinessHours
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse)
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.businesshours.EntitiesProto.internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.businesshours.EntitiesProto.internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.class, com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.newBuilder()
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
      withinRange_ = false;
      resultExpiration_ = null;
      if (resultExpirationBuilder_ != null) {
        resultExpirationBuilder_.dispose();
        resultExpirationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.businesshours.EntitiesProto.internal_static_api_v1alpha1_org_businesshours_EvaluateBusinessHoursResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse result = new com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.withinRange_ = withinRange_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resultExpiration_ = resultExpirationBuilder_ == null
            ? resultExpiration_
            : resultExpirationBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse.getDefaultInstance()) return this;
      if (other.getWithinRange() != false) {
        setWithinRange(other.getWithinRange());
      }
      if (other.hasResultExpiration()) {
        mergeResultExpiration(other.getResultExpiration());
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
              withinRange_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getResultExpirationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private boolean withinRange_ ;
    /**
     * <pre>
     * Resulting boolean if the current time is within
     * a day interval of a business hours object
     * </pre>
     *
     * <code>bool within_range = 1 [json_name = "withinRange"];</code>
     * @return The withinRange.
     */
    @java.lang.Override
    public boolean getWithinRange() {
      return withinRange_;
    }
    /**
     * <pre>
     * Resulting boolean if the current time is within
     * a day interval of a business hours object
     * </pre>
     *
     * <code>bool within_range = 1 [json_name = "withinRange"];</code>
     * @param value The withinRange to set.
     * @return This builder for chaining.
     */
    public Builder setWithinRange(boolean value) {

      withinRange_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resulting boolean if the current time is within
     * a day interval of a business hours object
     * </pre>
     *
     * <code>bool within_range = 1 [json_name = "withinRange"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithinRange() {
      bitField0_ = (bitField0_ & ~0x00000001);
      withinRange_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp resultExpiration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> resultExpirationBuilder_;
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     * @return Whether the resultExpiration field is set.
     */
    public boolean hasResultExpiration() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     * @return The resultExpiration.
     */
    public com.google.protobuf.Timestamp getResultExpiration() {
      if (resultExpirationBuilder_ == null) {
        return resultExpiration_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : resultExpiration_;
      } else {
        return resultExpirationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     */
    public Builder setResultExpiration(com.google.protobuf.Timestamp value) {
      if (resultExpirationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resultExpiration_ = value;
      } else {
        resultExpirationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     */
    public Builder setResultExpiration(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (resultExpirationBuilder_ == null) {
        resultExpiration_ = builderForValue.build();
      } else {
        resultExpirationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     */
    public Builder mergeResultExpiration(com.google.protobuf.Timestamp value) {
      if (resultExpirationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          resultExpiration_ != null &&
          resultExpiration_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getResultExpirationBuilder().mergeFrom(value);
        } else {
          resultExpiration_ = value;
        }
      } else {
        resultExpirationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     */
    public Builder clearResultExpiration() {
      bitField0_ = (bitField0_ & ~0x00000002);
      resultExpiration_ = null;
      if (resultExpirationBuilder_ != null) {
        resultExpirationBuilder_.dispose();
        resultExpirationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getResultExpirationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResultExpirationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getResultExpirationOrBuilder() {
      if (resultExpirationBuilder_ != null) {
        return resultExpirationBuilder_.getMessageOrBuilder();
      } else {
        return resultExpiration_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : resultExpiration_;
      }
    }
    /**
     * <pre>
     * indicates how long this result can be used.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp result_expiration = 2 [json_name = "resultExpiration"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getResultExpirationFieldBuilder() {
      if (resultExpirationBuilder_ == null) {
        resultExpirationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getResultExpiration(),
                getParentForChildren(),
                isClean());
        resultExpiration_ = null;
      }
      return resultExpirationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvaluateBusinessHoursResponse>
      PARSER = new com.google.protobuf.AbstractParser<EvaluateBusinessHoursResponse>() {
    @java.lang.Override
    public EvaluateBusinessHoursResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<EvaluateBusinessHoursResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvaluateBusinessHoursResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.businesshours.EvaluateBusinessHoursResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

