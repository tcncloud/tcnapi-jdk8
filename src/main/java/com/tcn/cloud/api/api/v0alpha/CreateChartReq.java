// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateChartReq}
 */
public final class CreateChartReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateChartReq)
    CreateChartReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateChartReq.newBuilder() to construct.
  private CreateChartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateChartReq() {
    title_ = "";
    displayLabels_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateChartReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CreateChartReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CreateChartReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateChartReq.class, com.tcn.cloud.api.api.v0alpha.CreateChartReq.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHART_DETAILS_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v0alpha.ChartDetails chartDetails_;
  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
   * @return Whether the chartDetails field is set.
   */
  @java.lang.Override
  public boolean hasChartDetails() {
    return chartDetails_ != null;
  }
  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
   * @return The chartDetails.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ChartDetails getChartDetails() {
    return chartDetails_ == null ? com.tcn.cloud.api.api.v0alpha.ChartDetails.getDefaultInstance() : chartDetails_;
  }
  /**
   * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ChartDetailsOrBuilder getChartDetailsOrBuilder() {
    return chartDetails_ == null ? com.tcn.cloud.api.api.v0alpha.ChartDetails.getDefaultInstance() : chartDetails_;
  }

  public static final int DISPLAY_LABELS_FIELD_NUMBER = 3;
  private int displayLabels_ = 0;
  /**
   * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
   * @return The enum numeric value on the wire for displayLabels.
   */
  @java.lang.Override public int getDisplayLabelsValue() {
    return displayLabels_;
  }
  /**
   * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
   * @return The displayLabels.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ChartDisplayLabels getDisplayLabels() {
    com.tcn.cloud.api.api.commons.ChartDisplayLabels result = com.tcn.cloud.api.api.commons.ChartDisplayLabels.forNumber(displayLabels_);
    return result == null ? com.tcn.cloud.api.api.commons.ChartDisplayLabels.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (chartDetails_ != null) {
      output.writeMessage(2, getChartDetails());
    }
    if (displayLabels_ != com.tcn.cloud.api.api.commons.ChartDisplayLabels.CHART_DISPLAY_LABELS_NEVER.getNumber()) {
      output.writeEnum(3, displayLabels_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (chartDetails_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChartDetails());
    }
    if (displayLabels_ != com.tcn.cloud.api.api.commons.ChartDisplayLabels.CHART_DISPLAY_LABELS_NEVER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, displayLabels_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateChartReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateChartReq other = (com.tcn.cloud.api.api.v0alpha.CreateChartReq) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (hasChartDetails() != other.hasChartDetails()) return false;
    if (hasChartDetails()) {
      if (!getChartDetails()
          .equals(other.getChartDetails())) return false;
    }
    if (displayLabels_ != other.displayLabels_) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    if (hasChartDetails()) {
      hash = (37 * hash) + CHART_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getChartDetails().hashCode();
    }
    hash = (37 * hash) + DISPLAY_LABELS_FIELD_NUMBER;
    hash = (53 * hash) + displayLabels_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateChartReq prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateChartReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateChartReq)
      com.tcn.cloud.api.api.v0alpha.CreateChartReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CreateChartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CreateChartReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateChartReq.class, com.tcn.cloud.api.api.v0alpha.CreateChartReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateChartReq.newBuilder()
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
      title_ = "";
      chartDetails_ = null;
      if (chartDetailsBuilder_ != null) {
        chartDetailsBuilder_.dispose();
        chartDetailsBuilder_ = null;
      }
      displayLabels_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CreateChartReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateChartReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateChartReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateChartReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateChartReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateChartReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateChartReq result = new com.tcn.cloud.api.api.v0alpha.CreateChartReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateChartReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.chartDetails_ = chartDetailsBuilder_ == null
            ? chartDetails_
            : chartDetailsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.displayLabels_ = displayLabels_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateChartReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateChartReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateChartReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateChartReq.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasChartDetails()) {
        mergeChartDetails(other.getChartDetails());
      }
      if (other.displayLabels_ != 0) {
        setDisplayLabelsValue(other.getDisplayLabelsValue());
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
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getChartDetailsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              displayLabels_ = input.readEnum();
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

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1 [json_name = "title"];</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.ChartDetails chartDetails_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ChartDetails, com.tcn.cloud.api.api.v0alpha.ChartDetails.Builder, com.tcn.cloud.api.api.v0alpha.ChartDetailsOrBuilder> chartDetailsBuilder_;
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     * @return Whether the chartDetails field is set.
     */
    public boolean hasChartDetails() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     * @return The chartDetails.
     */
    public com.tcn.cloud.api.api.v0alpha.ChartDetails getChartDetails() {
      if (chartDetailsBuilder_ == null) {
        return chartDetails_ == null ? com.tcn.cloud.api.api.v0alpha.ChartDetails.getDefaultInstance() : chartDetails_;
      } else {
        return chartDetailsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     */
    public Builder setChartDetails(com.tcn.cloud.api.api.v0alpha.ChartDetails value) {
      if (chartDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chartDetails_ = value;
      } else {
        chartDetailsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     */
    public Builder setChartDetails(
        com.tcn.cloud.api.api.v0alpha.ChartDetails.Builder builderForValue) {
      if (chartDetailsBuilder_ == null) {
        chartDetails_ = builderForValue.build();
      } else {
        chartDetailsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     */
    public Builder mergeChartDetails(com.tcn.cloud.api.api.v0alpha.ChartDetails value) {
      if (chartDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          chartDetails_ != null &&
          chartDetails_ != com.tcn.cloud.api.api.v0alpha.ChartDetails.getDefaultInstance()) {
          getChartDetailsBuilder().mergeFrom(value);
        } else {
          chartDetails_ = value;
        }
      } else {
        chartDetailsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     */
    public Builder clearChartDetails() {
      bitField0_ = (bitField0_ & ~0x00000002);
      chartDetails_ = null;
      if (chartDetailsBuilder_ != null) {
        chartDetailsBuilder_.dispose();
        chartDetailsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ChartDetails.Builder getChartDetailsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getChartDetailsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ChartDetailsOrBuilder getChartDetailsOrBuilder() {
      if (chartDetailsBuilder_ != null) {
        return chartDetailsBuilder_.getMessageOrBuilder();
      } else {
        return chartDetails_ == null ?
            com.tcn.cloud.api.api.v0alpha.ChartDetails.getDefaultInstance() : chartDetails_;
      }
    }
    /**
     * <code>.api.v0alpha.ChartDetails chart_details = 2 [json_name = "chartDetails"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ChartDetails, com.tcn.cloud.api.api.v0alpha.ChartDetails.Builder, com.tcn.cloud.api.api.v0alpha.ChartDetailsOrBuilder> 
        getChartDetailsFieldBuilder() {
      if (chartDetailsBuilder_ == null) {
        chartDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ChartDetails, com.tcn.cloud.api.api.v0alpha.ChartDetails.Builder, com.tcn.cloud.api.api.v0alpha.ChartDetailsOrBuilder>(
                getChartDetails(),
                getParentForChildren(),
                isClean());
        chartDetails_ = null;
      }
      return chartDetailsBuilder_;
    }

    private int displayLabels_ = 0;
    /**
     * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
     * @return The enum numeric value on the wire for displayLabels.
     */
    @java.lang.Override public int getDisplayLabelsValue() {
      return displayLabels_;
    }
    /**
     * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
     * @param value The enum numeric value on the wire for displayLabels to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayLabelsValue(int value) {
      displayLabels_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
     * @return The displayLabels.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ChartDisplayLabels getDisplayLabels() {
      com.tcn.cloud.api.api.commons.ChartDisplayLabels result = com.tcn.cloud.api.api.commons.ChartDisplayLabels.forNumber(displayLabels_);
      return result == null ? com.tcn.cloud.api.api.commons.ChartDisplayLabels.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
     * @param value The displayLabels to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayLabels(com.tcn.cloud.api.api.commons.ChartDisplayLabels value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      displayLabels_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ChartDisplayLabels display_labels = 3 [json_name = "displayLabels"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayLabels() {
      bitField0_ = (bitField0_ & ~0x00000004);
      displayLabels_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateChartReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateChartReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateChartReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateChartReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateChartReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateChartReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateChartReq>() {
    @java.lang.Override
    public CreateChartReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateChartReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateChartReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateChartReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

