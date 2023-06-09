// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/entities.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

/**
 * <pre>
 * SaveFlowDefinitionRequest is the request object for creating/updating a flow definition
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.workflows.SaveFlowDefinitionRequest}
 */
public final class SaveFlowDefinitionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.workflows.SaveFlowDefinitionRequest)
    SaveFlowDefinitionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SaveFlowDefinitionRequest.newBuilder() to construct.
  private SaveFlowDefinitionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveFlowDefinitionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SaveFlowDefinitionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.workflows.EntitiesProto.internal_static_api_v1alpha1_workflows_SaveFlowDefinitionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.workflows.EntitiesProto.internal_static_api_v1alpha1_workflows_SaveFlowDefinitionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.class, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.Builder.class);
  }

  public static final int FLOW_DEFINITION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.workflows.FlowDefinition flowDefinition_;
  /**
   * <pre>
   * The flow definition to save
   * </pre>
   *
   * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
   * @return Whether the flowDefinition field is set.
   */
  @java.lang.Override
  public boolean hasFlowDefinition() {
    return flowDefinition_ != null;
  }
  /**
   * <pre>
   * The flow definition to save
   * </pre>
   *
   * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
   * @return The flowDefinition.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.FlowDefinition getFlowDefinition() {
    return flowDefinition_ == null ? com.tcn.cloud.api.api.commons.workflows.FlowDefinition.getDefaultInstance() : flowDefinition_;
  }
  /**
   * <pre>
   * The flow definition to save
   * </pre>
   *
   * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.FlowDefinitionOrBuilder getFlowDefinitionOrBuilder() {
    return flowDefinition_ == null ? com.tcn.cloud.api.api.commons.workflows.FlowDefinition.getDefaultInstance() : flowDefinition_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * The fields to update
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * The fields to update
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * The fields to update
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (flowDefinition_ != null) {
      output.writeMessage(1, getFlowDefinition());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (flowDefinition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFlowDefinition());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest other = (com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest) obj;

    if (hasFlowDefinition() != other.hasFlowDefinition()) return false;
    if (hasFlowDefinition()) {
      if (!getFlowDefinition()
          .equals(other.getFlowDefinition())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasFlowDefinition()) {
      hash = (37 * hash) + FLOW_DEFINITION_FIELD_NUMBER;
      hash = (53 * hash) + getFlowDefinition().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest prototype) {
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
   * SaveFlowDefinitionRequest is the request object for creating/updating a flow definition
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.workflows.SaveFlowDefinitionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.workflows.SaveFlowDefinitionRequest)
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.EntitiesProto.internal_static_api_v1alpha1_workflows_SaveFlowDefinitionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.EntitiesProto.internal_static_api_v1alpha1_workflows_SaveFlowDefinitionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.class, com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.newBuilder()
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
      flowDefinition_ = null;
      if (flowDefinitionBuilder_ != null) {
        flowDefinitionBuilder_.dispose();
        flowDefinitionBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.EntitiesProto.internal_static_api_v1alpha1_workflows_SaveFlowDefinitionRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest build() {
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest result = new com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.flowDefinition_ = flowDefinitionBuilder_ == null
            ? flowDefinition_
            : flowDefinitionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest.getDefaultInstance()) return this;
      if (other.hasFlowDefinition()) {
        mergeFlowDefinition(other.getFlowDefinition());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getFlowDefinitionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.workflows.FlowDefinition flowDefinition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.workflows.FlowDefinition, com.tcn.cloud.api.api.commons.workflows.FlowDefinition.Builder, com.tcn.cloud.api.api.commons.workflows.FlowDefinitionOrBuilder> flowDefinitionBuilder_;
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     * @return Whether the flowDefinition field is set.
     */
    public boolean hasFlowDefinition() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     * @return The flowDefinition.
     */
    public com.tcn.cloud.api.api.commons.workflows.FlowDefinition getFlowDefinition() {
      if (flowDefinitionBuilder_ == null) {
        return flowDefinition_ == null ? com.tcn.cloud.api.api.commons.workflows.FlowDefinition.getDefaultInstance() : flowDefinition_;
      } else {
        return flowDefinitionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     */
    public Builder setFlowDefinition(com.tcn.cloud.api.api.commons.workflows.FlowDefinition value) {
      if (flowDefinitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        flowDefinition_ = value;
      } else {
        flowDefinitionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     */
    public Builder setFlowDefinition(
        com.tcn.cloud.api.api.commons.workflows.FlowDefinition.Builder builderForValue) {
      if (flowDefinitionBuilder_ == null) {
        flowDefinition_ = builderForValue.build();
      } else {
        flowDefinitionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     */
    public Builder mergeFlowDefinition(com.tcn.cloud.api.api.commons.workflows.FlowDefinition value) {
      if (flowDefinitionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          flowDefinition_ != null &&
          flowDefinition_ != com.tcn.cloud.api.api.commons.workflows.FlowDefinition.getDefaultInstance()) {
          getFlowDefinitionBuilder().mergeFrom(value);
        } else {
          flowDefinition_ = value;
        }
      } else {
        flowDefinitionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     */
    public Builder clearFlowDefinition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      flowDefinition_ = null;
      if (flowDefinitionBuilder_ != null) {
        flowDefinitionBuilder_.dispose();
        flowDefinitionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     */
    public com.tcn.cloud.api.api.commons.workflows.FlowDefinition.Builder getFlowDefinitionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFlowDefinitionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     */
    public com.tcn.cloud.api.api.commons.workflows.FlowDefinitionOrBuilder getFlowDefinitionOrBuilder() {
      if (flowDefinitionBuilder_ != null) {
        return flowDefinitionBuilder_.getMessageOrBuilder();
      } else {
        return flowDefinition_ == null ?
            com.tcn.cloud.api.api.commons.workflows.FlowDefinition.getDefaultInstance() : flowDefinition_;
      }
    }
    /**
     * <pre>
     * The flow definition to save
     * </pre>
     *
     * <code>.api.commons.workflows.FlowDefinition flow_definition = 1 [json_name = "flowDefinition"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.workflows.FlowDefinition, com.tcn.cloud.api.api.commons.workflows.FlowDefinition.Builder, com.tcn.cloud.api.api.commons.workflows.FlowDefinitionOrBuilder> 
        getFlowDefinitionFieldBuilder() {
      if (flowDefinitionBuilder_ == null) {
        flowDefinitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.workflows.FlowDefinition, com.tcn.cloud.api.api.commons.workflows.FlowDefinition.Builder, com.tcn.cloud.api.api.commons.workflows.FlowDefinitionOrBuilder>(
                getFlowDefinition(),
                getParentForChildren(),
                isClean());
        flowDefinition_ = null;
      }
      return flowDefinitionBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * The fields to update
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.workflows.SaveFlowDefinitionRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.workflows.SaveFlowDefinitionRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveFlowDefinitionRequest>
      PARSER = new com.google.protobuf.AbstractParser<SaveFlowDefinitionRequest>() {
    @java.lang.Override
    public SaveFlowDefinitionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SaveFlowDefinitionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveFlowDefinitionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.workflows.SaveFlowDefinitionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

