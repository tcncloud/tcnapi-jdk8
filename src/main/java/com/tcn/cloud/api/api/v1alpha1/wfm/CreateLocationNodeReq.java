// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreateLocationNode RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateLocationNodeReq}
 */
public final class CreateLocationNodeReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateLocationNodeReq)
    CreateLocationNodeReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateLocationNodeReq.newBuilder() to construct.
  private CreateLocationNodeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateLocationNodeReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateLocationNodeReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateLocationNodeReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateLocationNodeReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.Builder.class);
  }

  public static final int NODE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode node_;
  /**
   * <pre>
   * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
   * @return Whether the node field is set.
   */
  @java.lang.Override
  public boolean hasNode() {
    return node_ != null;
  }
  /**
   * <pre>
   * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
   * @return The node.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode getNode() {
    return node_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.getDefaultInstance() : node_;
  }
  /**
   * <pre>
   * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.LocationNodeOrBuilder getNodeOrBuilder() {
    return node_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.getDefaultInstance() : node_;
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
    if (node_ != null) {
      output.writeMessage(1, getNode());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (node_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNode());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq) obj;

    if (hasNode() != other.hasNode()) return false;
    if (hasNode()) {
      if (!getNode()
          .equals(other.getNode())) return false;
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
    if (hasNode()) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNode().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq prototype) {
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
   * Request message for the CreateLocationNode RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateLocationNodeReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateLocationNodeReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateLocationNodeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateLocationNodeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.newBuilder()
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
      node_ = null;
      if (nodeBuilder_ != null) {
        nodeBuilder_.dispose();
        nodeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateLocationNodeReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.node_ = nodeBuilder_ == null
            ? node_
            : nodeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq.getDefaultInstance()) return this;
      if (other.hasNode()) {
        mergeNode(other.getNode());
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
                  getNodeFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode node_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode, com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.LocationNodeOrBuilder> nodeBuilder_;
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     * @return Whether the node field is set.
     */
    public boolean hasNode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     * @return The node.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode getNode() {
      if (nodeBuilder_ == null) {
        return node_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.getDefaultInstance() : node_;
      } else {
        return nodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     */
    public Builder setNode(com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
      } else {
        nodeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     */
    public Builder setNode(
        com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        node_ = builderForValue.build();
      } else {
        nodeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     */
    public Builder mergeNode(com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode value) {
      if (nodeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          node_ != null &&
          node_ != com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.getDefaultInstance()) {
          getNodeBuilder().mergeFrom(value);
        } else {
          node_ = value;
        }
      } else {
        nodeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     */
    public Builder clearNode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      node_ = null;
      if (nodeBuilder_ != null) {
        nodeBuilder_.dispose();
        nodeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.Builder getNodeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.LocationNodeOrBuilder getNodeOrBuilder() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilder();
      } else {
        return node_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.getDefaultInstance() : node_;
      }
    }
    /**
     * <pre>
     * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode, com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.LocationNodeOrBuilder> 
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode, com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.LocationNodeOrBuilder>(
                getNode(),
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      return nodeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateLocationNodeReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateLocationNodeReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateLocationNodeReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateLocationNodeReq>() {
    @java.lang.Override
    public CreateLocationNodeReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateLocationNodeReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateLocationNodeReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateLocationNodeReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

