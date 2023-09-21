// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the ListTourShiftInstanceConfigs RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes}
 */
public final class ListTourShiftInstanceConfigsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes)
    ListTourShiftInstanceConfigsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTourShiftInstanceConfigsRes.newBuilder() to construct.
  private ListTourShiftInstanceConfigsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTourShiftInstanceConfigsRes() {
    tourShiftInstanceConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTourShiftInstanceConfigsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListTourShiftInstanceConfigsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListTourShiftInstanceConfigsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes.Builder.class);
  }

  public static final int TOUR_SHIFT_INSTANCE_CONFIGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.TourShiftInstanceConfig> tourShiftInstanceConfigs_;
  /**
   * <pre>
   * Requested tour shift instance configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.TourShiftInstanceConfig> getTourShiftInstanceConfigsList() {
    return tourShiftInstanceConfigs_;
  }
  /**
   * <pre>
   * Requested tour shift instance configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.TourShiftInstanceConfigOrBuilder> 
      getTourShiftInstanceConfigsOrBuilderList() {
    return tourShiftInstanceConfigs_;
  }
  /**
   * <pre>
   * Requested tour shift instance configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
   */
  @java.lang.Override
  public int getTourShiftInstanceConfigsCount() {
    return tourShiftInstanceConfigs_.size();
  }
  /**
   * <pre>
   * Requested tour shift instance configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.TourShiftInstanceConfig getTourShiftInstanceConfigs(int index) {
    return tourShiftInstanceConfigs_.get(index);
  }
  /**
   * <pre>
   * Requested tour shift instance configs.
   * </pre>
   *
   * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.TourShiftInstanceConfigOrBuilder getTourShiftInstanceConfigsOrBuilder(
      int index) {
    return tourShiftInstanceConfigs_.get(index);
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
    for (int i = 0; i < tourShiftInstanceConfigs_.size(); i++) {
      output.writeMessage(1, tourShiftInstanceConfigs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tourShiftInstanceConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tourShiftInstanceConfigs_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes) obj;

    if (!getTourShiftInstanceConfigsList()
        .equals(other.getTourShiftInstanceConfigsList())) return false;
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
    if (getTourShiftInstanceConfigsCount() > 0) {
      hash = (37 * hash) + TOUR_SHIFT_INSTANCE_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getTourShiftInstanceConfigsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes prototype) {
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
   * Response message for the ListTourShiftInstanceConfigs RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListTourShiftInstanceConfigsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListTourShiftInstanceConfigsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes.newBuilder()
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
      if (tourShiftInstanceConfigsBuilder_ == null) {
        tourShiftInstanceConfigs_ = java.util.Collections.emptyList();
      } else {
        tourShiftInstanceConfigs_ = null;
        tourShiftInstanceConfigsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListTourShiftInstanceConfigsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes result) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tourShiftInstanceConfigs_ = java.util.Collections.unmodifiableList(tourShiftInstanceConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tourShiftInstanceConfigs_ = tourShiftInstanceConfigs_;
      } else {
        result.tourShiftInstanceConfigs_ = tourShiftInstanceConfigsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes.getDefaultInstance()) return this;
      if (tourShiftInstanceConfigsBuilder_ == null) {
        if (!other.tourShiftInstanceConfigs_.isEmpty()) {
          if (tourShiftInstanceConfigs_.isEmpty()) {
            tourShiftInstanceConfigs_ = other.tourShiftInstanceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTourShiftInstanceConfigsIsMutable();
            tourShiftInstanceConfigs_.addAll(other.tourShiftInstanceConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.tourShiftInstanceConfigs_.isEmpty()) {
          if (tourShiftInstanceConfigsBuilder_.isEmpty()) {
            tourShiftInstanceConfigsBuilder_.dispose();
            tourShiftInstanceConfigsBuilder_ = null;
            tourShiftInstanceConfigs_ = other.tourShiftInstanceConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tourShiftInstanceConfigsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTourShiftInstanceConfigsFieldBuilder() : null;
          } else {
            tourShiftInstanceConfigsBuilder_.addAllMessages(other.tourShiftInstanceConfigs_);
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
              com.tcn.cloud.api.api.commons.TourShiftInstanceConfig m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.parser(),
                      extensionRegistry);
              if (tourShiftInstanceConfigsBuilder_ == null) {
                ensureTourShiftInstanceConfigsIsMutable();
                tourShiftInstanceConfigs_.add(m);
              } else {
                tourShiftInstanceConfigsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.TourShiftInstanceConfig> tourShiftInstanceConfigs_ =
      java.util.Collections.emptyList();
    private void ensureTourShiftInstanceConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tourShiftInstanceConfigs_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.TourShiftInstanceConfig>(tourShiftInstanceConfigs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.TourShiftInstanceConfig, com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder, com.tcn.cloud.api.api.commons.TourShiftInstanceConfigOrBuilder> tourShiftInstanceConfigsBuilder_;

    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.TourShiftInstanceConfig> getTourShiftInstanceConfigsList() {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tourShiftInstanceConfigs_);
      } else {
        return tourShiftInstanceConfigsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public int getTourShiftInstanceConfigsCount() {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        return tourShiftInstanceConfigs_.size();
      } else {
        return tourShiftInstanceConfigsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public com.tcn.cloud.api.api.commons.TourShiftInstanceConfig getTourShiftInstanceConfigs(int index) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        return tourShiftInstanceConfigs_.get(index);
      } else {
        return tourShiftInstanceConfigsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder setTourShiftInstanceConfigs(
        int index, com.tcn.cloud.api.api.commons.TourShiftInstanceConfig value) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTourShiftInstanceConfigsIsMutable();
        tourShiftInstanceConfigs_.set(index, value);
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder setTourShiftInstanceConfigs(
        int index, com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder builderForValue) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        ensureTourShiftInstanceConfigsIsMutable();
        tourShiftInstanceConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder addTourShiftInstanceConfigs(com.tcn.cloud.api.api.commons.TourShiftInstanceConfig value) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTourShiftInstanceConfigsIsMutable();
        tourShiftInstanceConfigs_.add(value);
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder addTourShiftInstanceConfigs(
        int index, com.tcn.cloud.api.api.commons.TourShiftInstanceConfig value) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTourShiftInstanceConfigsIsMutable();
        tourShiftInstanceConfigs_.add(index, value);
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder addTourShiftInstanceConfigs(
        com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder builderForValue) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        ensureTourShiftInstanceConfigsIsMutable();
        tourShiftInstanceConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder addTourShiftInstanceConfigs(
        int index, com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder builderForValue) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        ensureTourShiftInstanceConfigsIsMutable();
        tourShiftInstanceConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder addAllTourShiftInstanceConfigs(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.TourShiftInstanceConfig> values) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        ensureTourShiftInstanceConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tourShiftInstanceConfigs_);
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder clearTourShiftInstanceConfigs() {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        tourShiftInstanceConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public Builder removeTourShiftInstanceConfigs(int index) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        ensureTourShiftInstanceConfigsIsMutable();
        tourShiftInstanceConfigs_.remove(index);
        onChanged();
      } else {
        tourShiftInstanceConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder getTourShiftInstanceConfigsBuilder(
        int index) {
      return getTourShiftInstanceConfigsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public com.tcn.cloud.api.api.commons.TourShiftInstanceConfigOrBuilder getTourShiftInstanceConfigsOrBuilder(
        int index) {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        return tourShiftInstanceConfigs_.get(index);  } else {
        return tourShiftInstanceConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.TourShiftInstanceConfigOrBuilder> 
         getTourShiftInstanceConfigsOrBuilderList() {
      if (tourShiftInstanceConfigsBuilder_ != null) {
        return tourShiftInstanceConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tourShiftInstanceConfigs_);
      }
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder addTourShiftInstanceConfigsBuilder() {
      return getTourShiftInstanceConfigsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder addTourShiftInstanceConfigsBuilder(
        int index) {
      return getTourShiftInstanceConfigsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * Requested tour shift instance configs.
     * </pre>
     *
     * <code>repeated .api.commons.TourShiftInstanceConfig tour_shift_instance_configs = 1 [json_name = "tourShiftInstanceConfigs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder> 
         getTourShiftInstanceConfigsBuilderList() {
      return getTourShiftInstanceConfigsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.TourShiftInstanceConfig, com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder, com.tcn.cloud.api.api.commons.TourShiftInstanceConfigOrBuilder> 
        getTourShiftInstanceConfigsFieldBuilder() {
      if (tourShiftInstanceConfigsBuilder_ == null) {
        tourShiftInstanceConfigsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.TourShiftInstanceConfig, com.tcn.cloud.api.api.commons.TourShiftInstanceConfig.Builder, com.tcn.cloud.api.api.commons.TourShiftInstanceConfigOrBuilder>(
                tourShiftInstanceConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tourShiftInstanceConfigs_ = null;
      }
      return tourShiftInstanceConfigsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTourShiftInstanceConfigsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListTourShiftInstanceConfigsRes>() {
    @java.lang.Override
    public ListTourShiftInstanceConfigsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTourShiftInstanceConfigsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTourShiftInstanceConfigsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListTourShiftInstanceConfigsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

