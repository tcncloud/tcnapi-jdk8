// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the GetForecastingParameters RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.GetForecastingParametersRes}
 */
public final class GetForecastingParametersRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.GetForecastingParametersRes)
    GetForecastingParametersResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetForecastingParametersRes.newBuilder() to construct.
  private GetForecastingParametersRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetForecastingParametersRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetForecastingParametersRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetForecastingParametersRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetForecastingParametersRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.Builder.class);
  }

  public static final int FORECASTING_PARAMETERS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.ForecastingParameters forecastingParameters_;
  /**
   * <pre>
   * parameters used for forecasts and training data samples.
   * </pre>
   *
   * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
   * @return Whether the forecastingParameters field is set.
   */
  @java.lang.Override
  public boolean hasForecastingParameters() {
    return forecastingParameters_ != null;
  }
  /**
   * <pre>
   * parameters used for forecasts and training data samples.
   * </pre>
   *
   * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
   * @return The forecastingParameters.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ForecastingParameters getForecastingParameters() {
    return forecastingParameters_ == null ? com.tcn.cloud.api.api.commons.ForecastingParameters.getDefaultInstance() : forecastingParameters_;
  }
  /**
   * <pre>
   * parameters used for forecasts and training data samples.
   * </pre>
   *
   * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ForecastingParametersOrBuilder getForecastingParametersOrBuilder() {
    return forecastingParameters_ == null ? com.tcn.cloud.api.api.commons.ForecastingParameters.getDefaultInstance() : forecastingParameters_;
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
    if (forecastingParameters_ != null) {
      output.writeMessage(1, getForecastingParameters());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (forecastingParameters_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getForecastingParameters());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes) obj;

    if (hasForecastingParameters() != other.hasForecastingParameters()) return false;
    if (hasForecastingParameters()) {
      if (!getForecastingParameters()
          .equals(other.getForecastingParameters())) return false;
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
    if (hasForecastingParameters()) {
      hash = (37 * hash) + FORECASTING_PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + getForecastingParameters().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes prototype) {
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
   * Response message for the GetForecastingParameters RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.GetForecastingParametersRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.GetForecastingParametersRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetForecastingParametersRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetForecastingParametersRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.newBuilder()
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
      forecastingParameters_ = null;
      if (forecastingParametersBuilder_ != null) {
        forecastingParametersBuilder_.dispose();
        forecastingParametersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetForecastingParametersRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.forecastingParameters_ = forecastingParametersBuilder_ == null
            ? forecastingParameters_
            : forecastingParametersBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes.getDefaultInstance()) return this;
      if (other.hasForecastingParameters()) {
        mergeForecastingParameters(other.getForecastingParameters());
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
                  getForecastingParametersFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.commons.ForecastingParameters forecastingParameters_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ForecastingParameters, com.tcn.cloud.api.api.commons.ForecastingParameters.Builder, com.tcn.cloud.api.api.commons.ForecastingParametersOrBuilder> forecastingParametersBuilder_;
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     * @return Whether the forecastingParameters field is set.
     */
    public boolean hasForecastingParameters() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     * @return The forecastingParameters.
     */
    public com.tcn.cloud.api.api.commons.ForecastingParameters getForecastingParameters() {
      if (forecastingParametersBuilder_ == null) {
        return forecastingParameters_ == null ? com.tcn.cloud.api.api.commons.ForecastingParameters.getDefaultInstance() : forecastingParameters_;
      } else {
        return forecastingParametersBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     */
    public Builder setForecastingParameters(com.tcn.cloud.api.api.commons.ForecastingParameters value) {
      if (forecastingParametersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        forecastingParameters_ = value;
      } else {
        forecastingParametersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     */
    public Builder setForecastingParameters(
        com.tcn.cloud.api.api.commons.ForecastingParameters.Builder builderForValue) {
      if (forecastingParametersBuilder_ == null) {
        forecastingParameters_ = builderForValue.build();
      } else {
        forecastingParametersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     */
    public Builder mergeForecastingParameters(com.tcn.cloud.api.api.commons.ForecastingParameters value) {
      if (forecastingParametersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          forecastingParameters_ != null &&
          forecastingParameters_ != com.tcn.cloud.api.api.commons.ForecastingParameters.getDefaultInstance()) {
          getForecastingParametersBuilder().mergeFrom(value);
        } else {
          forecastingParameters_ = value;
        }
      } else {
        forecastingParametersBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     */
    public Builder clearForecastingParameters() {
      bitField0_ = (bitField0_ & ~0x00000001);
      forecastingParameters_ = null;
      if (forecastingParametersBuilder_ != null) {
        forecastingParametersBuilder_.dispose();
        forecastingParametersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     */
    public com.tcn.cloud.api.api.commons.ForecastingParameters.Builder getForecastingParametersBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getForecastingParametersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     */
    public com.tcn.cloud.api.api.commons.ForecastingParametersOrBuilder getForecastingParametersOrBuilder() {
      if (forecastingParametersBuilder_ != null) {
        return forecastingParametersBuilder_.getMessageOrBuilder();
      } else {
        return forecastingParameters_ == null ?
            com.tcn.cloud.api.api.commons.ForecastingParameters.getDefaultInstance() : forecastingParameters_;
      }
    }
    /**
     * <pre>
     * parameters used for forecasts and training data samples.
     * </pre>
     *
     * <code>.api.commons.ForecastingParameters forecasting_parameters = 1 [json_name = "forecastingParameters"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ForecastingParameters, com.tcn.cloud.api.api.commons.ForecastingParameters.Builder, com.tcn.cloud.api.api.commons.ForecastingParametersOrBuilder> 
        getForecastingParametersFieldBuilder() {
      if (forecastingParametersBuilder_ == null) {
        forecastingParametersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.ForecastingParameters, com.tcn.cloud.api.api.commons.ForecastingParameters.Builder, com.tcn.cloud.api.api.commons.ForecastingParametersOrBuilder>(
                getForecastingParameters(),
                getParentForChildren(),
                isClean());
        forecastingParameters_ = null;
      }
      return forecastingParametersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.GetForecastingParametersRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.GetForecastingParametersRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetForecastingParametersRes>
      PARSER = new com.google.protobuf.AbstractParser<GetForecastingParametersRes>() {
    @java.lang.Override
    public GetForecastingParametersRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetForecastingParametersRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetForecastingParametersRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.GetForecastingParametersRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

