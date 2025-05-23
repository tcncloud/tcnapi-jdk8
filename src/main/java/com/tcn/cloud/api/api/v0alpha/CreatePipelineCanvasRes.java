// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreatePipelineCanvasRes}
 */
public final class CreatePipelineCanvasRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreatePipelineCanvasRes)
    CreatePipelineCanvasResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreatePipelineCanvasRes.newBuilder() to construct.
  private CreatePipelineCanvasRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreatePipelineCanvasRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreatePipelineCanvasRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CreatePipelineCanvasRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CreatePipelineCanvasRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes.class, com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes.Builder.class);
  }

  public static final int PIPELINE_CANVAS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.PipelineCanvas pipelineCanvas_;
  /**
   * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
   * @return Whether the pipelineCanvas field is set.
   */
  @java.lang.Override
  public boolean hasPipelineCanvas() {
    return pipelineCanvas_ != null;
  }
  /**
   * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
   * @return The pipelineCanvas.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PipelineCanvas getPipelineCanvas() {
    return pipelineCanvas_ == null ? com.tcn.cloud.api.api.v0alpha.PipelineCanvas.getDefaultInstance() : pipelineCanvas_;
  }
  /**
   * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PipelineCanvasOrBuilder getPipelineCanvasOrBuilder() {
    return pipelineCanvas_ == null ? com.tcn.cloud.api.api.v0alpha.PipelineCanvas.getDefaultInstance() : pipelineCanvas_;
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
    if (pipelineCanvas_ != null) {
      output.writeMessage(1, getPipelineCanvas());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pipelineCanvas_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPipelineCanvas());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes other = (com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes) obj;

    if (hasPipelineCanvas() != other.hasPipelineCanvas()) return false;
    if (hasPipelineCanvas()) {
      if (!getPipelineCanvas()
          .equals(other.getPipelineCanvas())) return false;
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
    if (hasPipelineCanvas()) {
      hash = (37 * hash) + PIPELINE_CANVAS_FIELD_NUMBER;
      hash = (53 * hash) + getPipelineCanvas().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes prototype) {
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
   * Protobuf type {@code api.v0alpha.CreatePipelineCanvasRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreatePipelineCanvasRes)
      com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CreatePipelineCanvasRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CreatePipelineCanvasRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes.class, com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes.newBuilder()
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
      pipelineCanvas_ = null;
      if (pipelineCanvasBuilder_ != null) {
        pipelineCanvasBuilder_.dispose();
        pipelineCanvasBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_CreatePipelineCanvasRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes build() {
      com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes result = new com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pipelineCanvas_ = pipelineCanvasBuilder_ == null
            ? pipelineCanvas_
            : pipelineCanvasBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes.getDefaultInstance()) return this;
      if (other.hasPipelineCanvas()) {
        mergePipelineCanvas(other.getPipelineCanvas());
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
                  getPipelineCanvasFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.PipelineCanvas pipelineCanvas_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PipelineCanvas, com.tcn.cloud.api.api.v0alpha.PipelineCanvas.Builder, com.tcn.cloud.api.api.v0alpha.PipelineCanvasOrBuilder> pipelineCanvasBuilder_;
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     * @return Whether the pipelineCanvas field is set.
     */
    public boolean hasPipelineCanvas() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     * @return The pipelineCanvas.
     */
    public com.tcn.cloud.api.api.v0alpha.PipelineCanvas getPipelineCanvas() {
      if (pipelineCanvasBuilder_ == null) {
        return pipelineCanvas_ == null ? com.tcn.cloud.api.api.v0alpha.PipelineCanvas.getDefaultInstance() : pipelineCanvas_;
      } else {
        return pipelineCanvasBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     */
    public Builder setPipelineCanvas(com.tcn.cloud.api.api.v0alpha.PipelineCanvas value) {
      if (pipelineCanvasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pipelineCanvas_ = value;
      } else {
        pipelineCanvasBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     */
    public Builder setPipelineCanvas(
        com.tcn.cloud.api.api.v0alpha.PipelineCanvas.Builder builderForValue) {
      if (pipelineCanvasBuilder_ == null) {
        pipelineCanvas_ = builderForValue.build();
      } else {
        pipelineCanvasBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     */
    public Builder mergePipelineCanvas(com.tcn.cloud.api.api.v0alpha.PipelineCanvas value) {
      if (pipelineCanvasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          pipelineCanvas_ != null &&
          pipelineCanvas_ != com.tcn.cloud.api.api.v0alpha.PipelineCanvas.getDefaultInstance()) {
          getPipelineCanvasBuilder().mergeFrom(value);
        } else {
          pipelineCanvas_ = value;
        }
      } else {
        pipelineCanvasBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     */
    public Builder clearPipelineCanvas() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pipelineCanvas_ = null;
      if (pipelineCanvasBuilder_ != null) {
        pipelineCanvasBuilder_.dispose();
        pipelineCanvasBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PipelineCanvas.Builder getPipelineCanvasBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPipelineCanvasFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PipelineCanvasOrBuilder getPipelineCanvasOrBuilder() {
      if (pipelineCanvasBuilder_ != null) {
        return pipelineCanvasBuilder_.getMessageOrBuilder();
      } else {
        return pipelineCanvas_ == null ?
            com.tcn.cloud.api.api.v0alpha.PipelineCanvas.getDefaultInstance() : pipelineCanvas_;
      }
    }
    /**
     * <code>.api.v0alpha.PipelineCanvas pipeline_canvas = 1 [json_name = "pipelineCanvas"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PipelineCanvas, com.tcn.cloud.api.api.v0alpha.PipelineCanvas.Builder, com.tcn.cloud.api.api.v0alpha.PipelineCanvasOrBuilder> 
        getPipelineCanvasFieldBuilder() {
      if (pipelineCanvasBuilder_ == null) {
        pipelineCanvasBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.PipelineCanvas, com.tcn.cloud.api.api.v0alpha.PipelineCanvas.Builder, com.tcn.cloud.api.api.v0alpha.PipelineCanvasOrBuilder>(
                getPipelineCanvas(),
                getParentForChildren(),
                isClean());
        pipelineCanvas_ = null;
      }
      return pipelineCanvasBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreatePipelineCanvasRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreatePipelineCanvasRes)
  private static final com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePipelineCanvasRes>
      PARSER = new com.google.protobuf.AbstractParser<CreatePipelineCanvasRes>() {
    @java.lang.Override
    public CreatePipelineCanvasRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePipelineCanvasRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePipelineCanvasRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreatePipelineCanvasRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

