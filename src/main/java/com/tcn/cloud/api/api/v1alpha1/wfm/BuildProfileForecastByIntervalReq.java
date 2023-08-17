// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the BuildProfileForecastByInterval RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.BuildProfileForecastByIntervalReq}
 */
public final class BuildProfileForecastByIntervalReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.BuildProfileForecastByIntervalReq)
    BuildProfileForecastByIntervalReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildProfileForecastByIntervalReq.newBuilder() to construct.
  private BuildProfileForecastByIntervalReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildProfileForecastByIntervalReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildProfileForecastByIntervalReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildProfileForecastByIntervalReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildProfileForecastByIntervalReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.Builder.class);
  }

  private int bitField0_;
  public static final int CALL_PROFILE_TEMPLATE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate callProfileTemplate_;
  /**
   * <pre>
   * Template to use to generate the profile forecast.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   * @return Whether the callProfileTemplate field is set.
   */
  @java.lang.Override
  public boolean hasCallProfileTemplate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Template to use to generate the profile forecast.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   * @return The callProfileTemplate.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate getCallProfileTemplate() {
    return callProfileTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance() : callProfileTemplate_;
  }
  /**
   * <pre>
   * Template to use to generate the profile forecast.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder getCallProfileTemplateOrBuilder() {
    return callProfileTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance() : callProfileTemplate_;
  }

  public static final int FIXED_AVERAGES_FORECAST_FIELD_NUMBER = 2;
  private boolean fixedAveragesForecast_ = false;
  /**
   * <pre>
   * If &#64;fixed_averages_forecast is set to true it will do a fixed averages forecast,
   * and will only use the fixed averages fields and &#64;total_calls_profile from the &#64;call_profile_template.
   * Otherwise, it will do a regular profile forecast and only the fixed averages fields &#64;call_profile_template will be ignored.
   * </pre>
   *
   * <code>bool fixed_averages_forecast = 2 [json_name = "fixedAveragesForecast"];</code>
   * @return The fixedAveragesForecast.
   */
  @java.lang.Override
  public boolean getFixedAveragesForecast() {
    return fixedAveragesForecast_;
  }

  public static final int SKILL_PROFILE_SID_FIELD_NUMBER = 3;
  private long skillProfileSid_ = 0L;
  /**
   * <pre>
   * ID of the skill profile that the forecast will belong to.
   * </pre>
   *
   * <code>int64 skill_profile_sid = 3 [json_name = "skillProfileSid"];</code>
   * @return The skillProfileSid.
   */
  @java.lang.Override
  public long getSkillProfileSid() {
    return skillProfileSid_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCallProfileTemplate());
    }
    if (fixedAveragesForecast_ != false) {
      output.writeBool(2, fixedAveragesForecast_);
    }
    if (skillProfileSid_ != 0L) {
      output.writeInt64(3, skillProfileSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCallProfileTemplate());
    }
    if (fixedAveragesForecast_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, fixedAveragesForecast_);
    }
    if (skillProfileSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, skillProfileSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq) obj;

    if (hasCallProfileTemplate() != other.hasCallProfileTemplate()) return false;
    if (hasCallProfileTemplate()) {
      if (!getCallProfileTemplate()
          .equals(other.getCallProfileTemplate())) return false;
    }
    if (getFixedAveragesForecast()
        != other.getFixedAveragesForecast()) return false;
    if (getSkillProfileSid()
        != other.getSkillProfileSid()) return false;
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
    if (hasCallProfileTemplate()) {
      hash = (37 * hash) + CALL_PROFILE_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getCallProfileTemplate().hashCode();
    }
    hash = (37 * hash) + FIXED_AVERAGES_FORECAST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFixedAveragesForecast());
    hash = (37 * hash) + SKILL_PROFILE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSkillProfileSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq prototype) {
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
   * Request message for the BuildProfileForecastByInterval RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.BuildProfileForecastByIntervalReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.BuildProfileForecastByIntervalReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildProfileForecastByIntervalReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildProfileForecastByIntervalReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCallProfileTemplateFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      callProfileTemplate_ = null;
      if (callProfileTemplateBuilder_ != null) {
        callProfileTemplateBuilder_.dispose();
        callProfileTemplateBuilder_ = null;
      }
      fixedAveragesForecast_ = false;
      skillProfileSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildProfileForecastByIntervalReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callProfileTemplate_ = callProfileTemplateBuilder_ == null
            ? callProfileTemplate_
            : callProfileTemplateBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fixedAveragesForecast_ = fixedAveragesForecast_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.skillProfileSid_ = skillProfileSid_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq.getDefaultInstance()) return this;
      if (other.hasCallProfileTemplate()) {
        mergeCallProfileTemplate(other.getCallProfileTemplate());
      }
      if (other.getFixedAveragesForecast() != false) {
        setFixedAveragesForecast(other.getFixedAveragesForecast());
      }
      if (other.getSkillProfileSid() != 0L) {
        setSkillProfileSid(other.getSkillProfileSid());
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
              input.readMessage(
                  getCallProfileTemplateFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              fixedAveragesForecast_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              skillProfileSid_ = input.readInt64();
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
    private int bitField0_;

    private com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate callProfileTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder> callProfileTemplateBuilder_;
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     * @return Whether the callProfileTemplate field is set.
     */
    public boolean hasCallProfileTemplate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     * @return The callProfileTemplate.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate getCallProfileTemplate() {
      if (callProfileTemplateBuilder_ == null) {
        return callProfileTemplate_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance() : callProfileTemplate_;
      } else {
        return callProfileTemplateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public Builder setCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate value) {
      if (callProfileTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        callProfileTemplate_ = value;
      } else {
        callProfileTemplateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public Builder setCallProfileTemplate(
        com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder builderForValue) {
      if (callProfileTemplateBuilder_ == null) {
        callProfileTemplate_ = builderForValue.build();
      } else {
        callProfileTemplateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public Builder mergeCallProfileTemplate(com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate value) {
      if (callProfileTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          callProfileTemplate_ != null &&
          callProfileTemplate_ != com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance()) {
          getCallProfileTemplateBuilder().mergeFrom(value);
        } else {
          callProfileTemplate_ = value;
        }
      } else {
        callProfileTemplateBuilder_.mergeFrom(value);
      }
      if (callProfileTemplate_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public Builder clearCallProfileTemplate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callProfileTemplate_ = null;
      if (callProfileTemplateBuilder_ != null) {
        callProfileTemplateBuilder_.dispose();
        callProfileTemplateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder getCallProfileTemplateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCallProfileTemplateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder getCallProfileTemplateOrBuilder() {
      if (callProfileTemplateBuilder_ != null) {
        return callProfileTemplateBuilder_.getMessageOrBuilder();
      } else {
        return callProfileTemplate_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.getDefaultInstance() : callProfileTemplate_;
      }
    }
    /**
     * <pre>
     * Template to use to generate the profile forecast.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.CallProfileTemplate call_profile_template = 1 [json_name = "callProfileTemplate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder> 
        getCallProfileTemplateFieldBuilder() {
      if (callProfileTemplateBuilder_ == null) {
        callProfileTemplateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.CallProfileTemplateOrBuilder>(
                getCallProfileTemplate(),
                getParentForChildren(),
                isClean());
        callProfileTemplate_ = null;
      }
      return callProfileTemplateBuilder_;
    }

    private boolean fixedAveragesForecast_ ;
    /**
     * <pre>
     * If &#64;fixed_averages_forecast is set to true it will do a fixed averages forecast,
     * and will only use the fixed averages fields and &#64;total_calls_profile from the &#64;call_profile_template.
     * Otherwise, it will do a regular profile forecast and only the fixed averages fields &#64;call_profile_template will be ignored.
     * </pre>
     *
     * <code>bool fixed_averages_forecast = 2 [json_name = "fixedAveragesForecast"];</code>
     * @return The fixedAveragesForecast.
     */
    @java.lang.Override
    public boolean getFixedAveragesForecast() {
      return fixedAveragesForecast_;
    }
    /**
     * <pre>
     * If &#64;fixed_averages_forecast is set to true it will do a fixed averages forecast,
     * and will only use the fixed averages fields and &#64;total_calls_profile from the &#64;call_profile_template.
     * Otherwise, it will do a regular profile forecast and only the fixed averages fields &#64;call_profile_template will be ignored.
     * </pre>
     *
     * <code>bool fixed_averages_forecast = 2 [json_name = "fixedAveragesForecast"];</code>
     * @param value The fixedAveragesForecast to set.
     * @return This builder for chaining.
     */
    public Builder setFixedAveragesForecast(boolean value) {

      fixedAveragesForecast_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If &#64;fixed_averages_forecast is set to true it will do a fixed averages forecast,
     * and will only use the fixed averages fields and &#64;total_calls_profile from the &#64;call_profile_template.
     * Otherwise, it will do a regular profile forecast and only the fixed averages fields &#64;call_profile_template will be ignored.
     * </pre>
     *
     * <code>bool fixed_averages_forecast = 2 [json_name = "fixedAveragesForecast"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFixedAveragesForecast() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fixedAveragesForecast_ = false;
      onChanged();
      return this;
    }

    private long skillProfileSid_ ;
    /**
     * <pre>
     * ID of the skill profile that the forecast will belong to.
     * </pre>
     *
     * <code>int64 skill_profile_sid = 3 [json_name = "skillProfileSid"];</code>
     * @return The skillProfileSid.
     */
    @java.lang.Override
    public long getSkillProfileSid() {
      return skillProfileSid_;
    }
    /**
     * <pre>
     * ID of the skill profile that the forecast will belong to.
     * </pre>
     *
     * <code>int64 skill_profile_sid = 3 [json_name = "skillProfileSid"];</code>
     * @param value The skillProfileSid to set.
     * @return This builder for chaining.
     */
    public Builder setSkillProfileSid(long value) {

      skillProfileSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the skill profile that the forecast will belong to.
     * </pre>
     *
     * <code>int64 skill_profile_sid = 3 [json_name = "skillProfileSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillProfileSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      skillProfileSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.BuildProfileForecastByIntervalReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.BuildProfileForecastByIntervalReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildProfileForecastByIntervalReq>
      PARSER = new com.google.protobuf.AbstractParser<BuildProfileForecastByIntervalReq>() {
    @java.lang.Override
    public BuildProfileForecastByIntervalReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildProfileForecastByIntervalReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildProfileForecastByIntervalReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.BuildProfileForecastByIntervalReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

