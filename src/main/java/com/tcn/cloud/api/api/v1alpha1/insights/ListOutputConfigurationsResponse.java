// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/output_configuration.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * Response for listing output configurations
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.insights.ListOutputConfigurationsResponse}
 */
public final class ListOutputConfigurationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.insights.ListOutputConfigurationsResponse)
    ListOutputConfigurationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListOutputConfigurationsResponse.newBuilder() to construct.
  private ListOutputConfigurationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListOutputConfigurationsResponse() {
    outputConfigurations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListOutputConfigurationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationProto.internal_static_api_v1alpha1_insights_ListOutputConfigurationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationProto.internal_static_api_v1alpha1_insights_ListOutputConfigurationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.class, com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.Builder.class);
  }

  public static final int OUTPUT_CONFIGURATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration> outputConfigurations_;
  /**
   * <pre>
   * The requested output configurations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration> getOutputConfigurationsList() {
    return outputConfigurations_;
  }
  /**
   * <pre>
   * The requested output configurations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder> 
      getOutputConfigurationsOrBuilderList() {
    return outputConfigurations_;
  }
  /**
   * <pre>
   * The requested output configurations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
   */
  @java.lang.Override
  public int getOutputConfigurationsCount() {
    return outputConfigurations_.size();
  }
  /**
   * <pre>
   * The requested output configurations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration getOutputConfigurations(int index) {
    return outputConfigurations_.get(index);
  }
  /**
   * <pre>
   * The requested output configurations
   * </pre>
   *
   * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder getOutputConfigurationsOrBuilder(
      int index) {
    return outputConfigurations_.get(index);
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
    for (int i = 0; i < outputConfigurations_.size(); i++) {
      output.writeMessage(1, outputConfigurations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < outputConfigurations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, outputConfigurations_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse other = (com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse) obj;

    if (!getOutputConfigurationsList()
        .equals(other.getOutputConfigurationsList())) return false;
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
    if (getOutputConfigurationsCount() > 0) {
      hash = (37 * hash) + OUTPUT_CONFIGURATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOutputConfigurationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse prototype) {
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
   * Response for listing output configurations
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.insights.ListOutputConfigurationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.insights.ListOutputConfigurationsResponse)
      com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationProto.internal_static_api_v1alpha1_insights_ListOutputConfigurationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationProto.internal_static_api_v1alpha1_insights_ListOutputConfigurationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.class, com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.newBuilder()
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
      if (outputConfigurationsBuilder_ == null) {
        outputConfigurations_ = java.util.Collections.emptyList();
      } else {
        outputConfigurations_ = null;
        outputConfigurationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationProto.internal_static_api_v1alpha1_insights_ListOutputConfigurationsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse result = new com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse result) {
      if (outputConfigurationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          outputConfigurations_ = java.util.Collections.unmodifiableList(outputConfigurations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.outputConfigurations_ = outputConfigurations_;
      } else {
        result.outputConfigurations_ = outputConfigurationsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse.getDefaultInstance()) return this;
      if (outputConfigurationsBuilder_ == null) {
        if (!other.outputConfigurations_.isEmpty()) {
          if (outputConfigurations_.isEmpty()) {
            outputConfigurations_ = other.outputConfigurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOutputConfigurationsIsMutable();
            outputConfigurations_.addAll(other.outputConfigurations_);
          }
          onChanged();
        }
      } else {
        if (!other.outputConfigurations_.isEmpty()) {
          if (outputConfigurationsBuilder_.isEmpty()) {
            outputConfigurationsBuilder_.dispose();
            outputConfigurationsBuilder_ = null;
            outputConfigurations_ = other.outputConfigurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            outputConfigurationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOutputConfigurationsFieldBuilder() : null;
          } else {
            outputConfigurationsBuilder_.addAllMessages(other.outputConfigurations_);
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
              com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.parser(),
                      extensionRegistry);
              if (outputConfigurationsBuilder_ == null) {
                ensureOutputConfigurationsIsMutable();
                outputConfigurations_.add(m);
              } else {
                outputConfigurationsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration> outputConfigurations_ =
      java.util.Collections.emptyList();
    private void ensureOutputConfigurationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        outputConfigurations_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration>(outputConfigurations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder> outputConfigurationsBuilder_;

    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration> getOutputConfigurationsList() {
      if (outputConfigurationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(outputConfigurations_);
      } else {
        return outputConfigurationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public int getOutputConfigurationsCount() {
      if (outputConfigurationsBuilder_ == null) {
        return outputConfigurations_.size();
      } else {
        return outputConfigurationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration getOutputConfigurations(int index) {
      if (outputConfigurationsBuilder_ == null) {
        return outputConfigurations_.get(index);
      } else {
        return outputConfigurationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder setOutputConfigurations(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration value) {
      if (outputConfigurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutputConfigurationsIsMutable();
        outputConfigurations_.set(index, value);
        onChanged();
      } else {
        outputConfigurationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder setOutputConfigurations(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder builderForValue) {
      if (outputConfigurationsBuilder_ == null) {
        ensureOutputConfigurationsIsMutable();
        outputConfigurations_.set(index, builderForValue.build());
        onChanged();
      } else {
        outputConfigurationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder addOutputConfigurations(com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration value) {
      if (outputConfigurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutputConfigurationsIsMutable();
        outputConfigurations_.add(value);
        onChanged();
      } else {
        outputConfigurationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder addOutputConfigurations(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration value) {
      if (outputConfigurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOutputConfigurationsIsMutable();
        outputConfigurations_.add(index, value);
        onChanged();
      } else {
        outputConfigurationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder addOutputConfigurations(
        com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder builderForValue) {
      if (outputConfigurationsBuilder_ == null) {
        ensureOutputConfigurationsIsMutable();
        outputConfigurations_.add(builderForValue.build());
        onChanged();
      } else {
        outputConfigurationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder addOutputConfigurations(
        int index, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder builderForValue) {
      if (outputConfigurationsBuilder_ == null) {
        ensureOutputConfigurationsIsMutable();
        outputConfigurations_.add(index, builderForValue.build());
        onChanged();
      } else {
        outputConfigurationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder addAllOutputConfigurations(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration> values) {
      if (outputConfigurationsBuilder_ == null) {
        ensureOutputConfigurationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, outputConfigurations_);
        onChanged();
      } else {
        outputConfigurationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder clearOutputConfigurations() {
      if (outputConfigurationsBuilder_ == null) {
        outputConfigurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        outputConfigurationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public Builder removeOutputConfigurations(int index) {
      if (outputConfigurationsBuilder_ == null) {
        ensureOutputConfigurationsIsMutable();
        outputConfigurations_.remove(index);
        onChanged();
      } else {
        outputConfigurationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder getOutputConfigurationsBuilder(
        int index) {
      return getOutputConfigurationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder getOutputConfigurationsOrBuilder(
        int index) {
      if (outputConfigurationsBuilder_ == null) {
        return outputConfigurations_.get(index);  } else {
        return outputConfigurationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder> 
         getOutputConfigurationsOrBuilderList() {
      if (outputConfigurationsBuilder_ != null) {
        return outputConfigurationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(outputConfigurations_);
      }
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder addOutputConfigurationsBuilder() {
      return getOutputConfigurationsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.getDefaultInstance());
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder addOutputConfigurationsBuilder(
        int index) {
      return getOutputConfigurationsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.getDefaultInstance());
    }
    /**
     * <pre>
     * The requested output configurations
     * </pre>
     *
     * <code>repeated .api.v1alpha1.insights.OutputConfiguration output_configurations = 1 [json_name = "outputConfigurations"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder> 
         getOutputConfigurationsBuilderList() {
      return getOutputConfigurationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder> 
        getOutputConfigurationsFieldBuilder() {
      if (outputConfigurationsBuilder_ == null) {
        outputConfigurationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfiguration.Builder, com.tcn.cloud.api.api.v1alpha1.insights.OutputConfigurationOrBuilder>(
                outputConfigurations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        outputConfigurations_ = null;
      }
      return outputConfigurationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.insights.ListOutputConfigurationsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.insights.ListOutputConfigurationsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOutputConfigurationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListOutputConfigurationsResponse>() {
    @java.lang.Override
    public ListOutputConfigurationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOutputConfigurationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOutputConfigurationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.insights.ListOutputConfigurationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

