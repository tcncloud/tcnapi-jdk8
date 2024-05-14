// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Request for the DeleteResponseEvaluator RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.DeleteResponseEvaluatorRequest}
 */
public final class DeleteResponseEvaluatorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.DeleteResponseEvaluatorRequest)
    DeleteResponseEvaluatorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteResponseEvaluatorRequest.newBuilder() to construct.
  private DeleteResponseEvaluatorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteResponseEvaluatorRequest() {
    evaluatorId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteResponseEvaluatorRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteResponseEvaluatorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteResponseEvaluatorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest.class, com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest.Builder.class);
  }

  public static final int EVALUATOR_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object evaluatorId_ = "";
  /**
   * <code>string evaluator_id = 1 [json_name = "evaluatorId"];</code>
   * @return The evaluatorId.
   */
  @java.lang.Override
  public java.lang.String getEvaluatorId() {
    java.lang.Object ref = evaluatorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      evaluatorId_ = s;
      return s;
    }
  }
  /**
   * <code>string evaluator_id = 1 [json_name = "evaluatorId"];</code>
   * @return The bytes for evaluatorId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEvaluatorIdBytes() {
    java.lang.Object ref = evaluatorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      evaluatorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(evaluatorId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, evaluatorId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(evaluatorId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, evaluatorId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest other = (com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest) obj;

    if (!getEvaluatorId()
        .equals(other.getEvaluatorId())) return false;
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
    hash = (37 * hash) + EVALUATOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEvaluatorId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest prototype) {
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
   * Request for the DeleteResponseEvaluator RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.DeleteResponseEvaluatorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.DeleteResponseEvaluatorRequest)
      com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteResponseEvaluatorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteResponseEvaluatorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest.class, com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest.newBuilder()
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
      evaluatorId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_DeleteResponseEvaluatorRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest result = new com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.evaluatorId_ = evaluatorId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest.getDefaultInstance()) return this;
      if (!other.getEvaluatorId().isEmpty()) {
        evaluatorId_ = other.evaluatorId_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              evaluatorId_ = input.readStringRequireUtf8();
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

    private java.lang.Object evaluatorId_ = "";
    /**
     * <code>string evaluator_id = 1 [json_name = "evaluatorId"];</code>
     * @return The evaluatorId.
     */
    public java.lang.String getEvaluatorId() {
      java.lang.Object ref = evaluatorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        evaluatorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string evaluator_id = 1 [json_name = "evaluatorId"];</code>
     * @return The bytes for evaluatorId.
     */
    public com.google.protobuf.ByteString
        getEvaluatorIdBytes() {
      java.lang.Object ref = evaluatorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        evaluatorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string evaluator_id = 1 [json_name = "evaluatorId"];</code>
     * @param value The evaluatorId to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluatorId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      evaluatorId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string evaluator_id = 1 [json_name = "evaluatorId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEvaluatorId() {
      evaluatorId_ = getDefaultInstance().getEvaluatorId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string evaluator_id = 1 [json_name = "evaluatorId"];</code>
     * @param value The bytes for evaluatorId to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluatorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      evaluatorId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.DeleteResponseEvaluatorRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.DeleteResponseEvaluatorRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteResponseEvaluatorRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteResponseEvaluatorRequest>() {
    @java.lang.Override
    public DeleteResponseEvaluatorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteResponseEvaluatorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteResponseEvaluatorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.DeleteResponseEvaluatorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

