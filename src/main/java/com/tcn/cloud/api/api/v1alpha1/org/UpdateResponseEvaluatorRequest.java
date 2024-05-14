// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/response_evaluator.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request for the UpdateResponseEvaluator RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateResponseEvaluatorRequest}
 */
public final class UpdateResponseEvaluatorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateResponseEvaluatorRequest)
    UpdateResponseEvaluatorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateResponseEvaluatorRequest.newBuilder() to construct.
  private UpdateResponseEvaluatorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateResponseEvaluatorRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateResponseEvaluatorRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorProto.internal_static_api_v1alpha1_org_UpdateResponseEvaluatorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorProto.internal_static_api_v1alpha1_org_UpdateResponseEvaluatorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest.Builder.class);
  }

  public static final int EVALUATOR_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator evaluator_;
  /**
   * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
   * @return Whether the evaluator field is set.
   */
  @java.lang.Override
  public boolean hasEvaluator() {
    return evaluator_ != null;
  }
  /**
   * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
   * @return The evaluator.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator getEvaluator() {
    return evaluator_ == null ? com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.getDefaultInstance() : evaluator_;
  }
  /**
   * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorOrBuilder getEvaluatorOrBuilder() {
    return evaluator_ == null ? com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.getDefaultInstance() : evaluator_;
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
    if (evaluator_ != null) {
      output.writeMessage(1, getEvaluator());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (evaluator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEvaluator());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest) obj;

    if (hasEvaluator() != other.hasEvaluator()) return false;
    if (hasEvaluator()) {
      if (!getEvaluator()
          .equals(other.getEvaluator())) return false;
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
    if (hasEvaluator()) {
      hash = (37 * hash) + EVALUATOR_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluator().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest prototype) {
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
   * Request for the UpdateResponseEvaluator RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateResponseEvaluatorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateResponseEvaluatorRequest)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorProto.internal_static_api_v1alpha1_org_UpdateResponseEvaluatorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorProto.internal_static_api_v1alpha1_org_UpdateResponseEvaluatorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest.newBuilder()
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
      evaluator_ = null;
      if (evaluatorBuilder_ != null) {
        evaluatorBuilder_.dispose();
        evaluatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorProto.internal_static_api_v1alpha1_org_UpdateResponseEvaluatorRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evaluator_ = evaluatorBuilder_ == null
            ? evaluator_
            : evaluatorBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest.getDefaultInstance()) return this;
      if (other.hasEvaluator()) {
        mergeEvaluator(other.getEvaluator());
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
                  getEvaluatorFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator evaluator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator, com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.Builder, com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorOrBuilder> evaluatorBuilder_;
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     * @return Whether the evaluator field is set.
     */
    public boolean hasEvaluator() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     * @return The evaluator.
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator getEvaluator() {
      if (evaluatorBuilder_ == null) {
        return evaluator_ == null ? com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.getDefaultInstance() : evaluator_;
      } else {
        return evaluatorBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public Builder setEvaluator(com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator value) {
      if (evaluatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evaluator_ = value;
      } else {
        evaluatorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public Builder setEvaluator(
        com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.Builder builderForValue) {
      if (evaluatorBuilder_ == null) {
        evaluator_ = builderForValue.build();
      } else {
        evaluatorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public Builder mergeEvaluator(com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator value) {
      if (evaluatorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          evaluator_ != null &&
          evaluator_ != com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.getDefaultInstance()) {
          getEvaluatorBuilder().mergeFrom(value);
        } else {
          evaluator_ = value;
        }
      } else {
        evaluatorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public Builder clearEvaluator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      evaluator_ = null;
      if (evaluatorBuilder_ != null) {
        evaluatorBuilder_.dispose();
        evaluatorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.Builder getEvaluatorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEvaluatorFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorOrBuilder getEvaluatorOrBuilder() {
      if (evaluatorBuilder_ != null) {
        return evaluatorBuilder_.getMessageOrBuilder();
      } else {
        return evaluator_ == null ?
            com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.getDefaultInstance() : evaluator_;
      }
    }
    /**
     * <code>.api.v1alpha1.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator, com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.Builder, com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorOrBuilder> 
        getEvaluatorFieldBuilder() {
      if (evaluatorBuilder_ == null) {
        evaluatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator, com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluator.Builder, com.tcn.cloud.api.api.v1alpha1.org.ResponseEvaluatorOrBuilder>(
                getEvaluator(),
                getParentForChildren(),
                isClean());
        evaluator_ = null;
      }
      return evaluatorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateResponseEvaluatorRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateResponseEvaluatorRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateResponseEvaluatorRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateResponseEvaluatorRequest>() {
    @java.lang.Override
    public UpdateResponseEvaluatorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateResponseEvaluatorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateResponseEvaluatorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateResponseEvaluatorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

