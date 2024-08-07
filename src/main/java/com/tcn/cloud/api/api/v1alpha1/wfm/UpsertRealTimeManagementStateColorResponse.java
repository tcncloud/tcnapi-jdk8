// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for UpsertRealTimeManagementStateColor
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse}
 */
public final class UpsertRealTimeManagementStateColorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse)
    UpsertRealTimeManagementStateColorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpsertRealTimeManagementStateColorResponse.newBuilder() to construct.
  private UpsertRealTimeManagementStateColorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpsertRealTimeManagementStateColorResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpsertRealTimeManagementStateColorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertRealTimeManagementStateColorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertRealTimeManagementStateColorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse.Builder.class);
  }

  public static final int STATE_COLOR_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor stateColor_;
  /**
   * <pre>
   * The resulting real time management state color.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
   * @return Whether the stateColor field is set.
   */
  @java.lang.Override
  public boolean hasStateColor() {
    return stateColor_ != null;
  }
  /**
   * <pre>
   * The resulting real time management state color.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
   * @return The stateColor.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor getStateColor() {
    return stateColor_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.getDefaultInstance() : stateColor_;
  }
  /**
   * <pre>
   * The resulting real time management state color.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColorOrBuilder getStateColorOrBuilder() {
    return stateColor_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.getDefaultInstance() : stateColor_;
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
    if (stateColor_ != null) {
      output.writeMessage(1, getStateColor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stateColor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStateColor());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse other = (com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse) obj;

    if (hasStateColor() != other.hasStateColor()) return false;
    if (hasStateColor()) {
      if (!getStateColor()
          .equals(other.getStateColor())) return false;
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
    if (hasStateColor()) {
      hash = (37 * hash) + STATE_COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getStateColor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse prototype) {
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
   * Response message for UpsertRealTimeManagementStateColor
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse)
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertRealTimeManagementStateColorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertRealTimeManagementStateColorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse.class, com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse.newBuilder()
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
      stateColor_ = null;
      if (stateColorBuilder_ != null) {
        stateColorBuilder_.dispose();
        stateColorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_UpsertRealTimeManagementStateColorResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse result = new com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.stateColor_ = stateColorBuilder_ == null
            ? stateColor_
            : stateColorBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse.getDefaultInstance()) return this;
      if (other.hasStateColor()) {
        mergeStateColor(other.getStateColor());
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
                  getStateColorFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor stateColor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor, com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColorOrBuilder> stateColorBuilder_;
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     * @return Whether the stateColor field is set.
     */
    public boolean hasStateColor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     * @return The stateColor.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor getStateColor() {
      if (stateColorBuilder_ == null) {
        return stateColor_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.getDefaultInstance() : stateColor_;
      } else {
        return stateColorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     */
    public Builder setStateColor(com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor value) {
      if (stateColorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stateColor_ = value;
      } else {
        stateColorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     */
    public Builder setStateColor(
        com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.Builder builderForValue) {
      if (stateColorBuilder_ == null) {
        stateColor_ = builderForValue.build();
      } else {
        stateColorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     */
    public Builder mergeStateColor(com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor value) {
      if (stateColorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          stateColor_ != null &&
          stateColor_ != com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.getDefaultInstance()) {
          getStateColorBuilder().mergeFrom(value);
        } else {
          stateColor_ = value;
        }
      } else {
        stateColorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     */
    public Builder clearStateColor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      stateColor_ = null;
      if (stateColorBuilder_ != null) {
        stateColorBuilder_.dispose();
        stateColorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.Builder getStateColorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStateColorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColorOrBuilder getStateColorOrBuilder() {
      if (stateColorBuilder_ != null) {
        return stateColorBuilder_.getMessageOrBuilder();
      } else {
        return stateColor_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.getDefaultInstance() : stateColor_;
      }
    }
    /**
     * <pre>
     * The resulting real time management state color.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.RealTimeManagementStateColor state_color = 1 [json_name = "stateColor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor, com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColorOrBuilder> 
        getStateColorFieldBuilder() {
      if (stateColorBuilder_ == null) {
        stateColorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor, com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColor.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.RealTimeManagementStateColorOrBuilder>(
                getStateColor(),
                getParentForChildren(),
                isClean());
        stateColor_ = null;
      }
      return stateColorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpsertRealTimeManagementStateColorResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpsertRealTimeManagementStateColorResponse>() {
    @java.lang.Override
    public UpsertRealTimeManagementStateColorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpsertRealTimeManagementStateColorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpsertRealTimeManagementStateColorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.UpsertRealTimeManagementStateColorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

