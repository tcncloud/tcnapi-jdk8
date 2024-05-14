// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response for the GetResponseEvaluator RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.GetResponseEvaluatorResponse}
 */
public final class GetResponseEvaluatorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.GetResponseEvaluatorResponse)
    GetResponseEvaluatorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetResponseEvaluatorResponse.newBuilder() to construct.
  private GetResponseEvaluatorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetResponseEvaluatorResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetResponseEvaluatorResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetResponseEvaluatorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetResponseEvaluatorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse.Builder.class);
  }

  public static final int EVALUATOR_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.ResponseEvaluator evaluator_;
  /**
   * <pre>
   * Requested evaluator.
   * </pre>
   *
   * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
   * @return Whether the evaluator field is set.
   */
  @java.lang.Override
  public boolean hasEvaluator() {
    return evaluator_ != null;
  }
  /**
   * <pre>
   * Requested evaluator.
   * </pre>
   *
   * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
   * @return The evaluator.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.ResponseEvaluator getEvaluator() {
    return evaluator_ == null ? com.tcn.cloud.api.api.commons.org.ResponseEvaluator.getDefaultInstance() : evaluator_;
  }
  /**
   * <pre>
   * Requested evaluator.
   * </pre>
   *
   * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.ResponseEvaluatorOrBuilder getEvaluatorOrBuilder() {
    return evaluator_ == null ? com.tcn.cloud.api.api.commons.org.ResponseEvaluator.getDefaultInstance() : evaluator_;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse other = (com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse) obj;

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

  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse prototype) {
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
   * Response for the GetResponseEvaluator RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.GetResponseEvaluatorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.GetResponseEvaluatorResponse)
      com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetResponseEvaluatorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetResponseEvaluatorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse.newBuilder()
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
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_GetResponseEvaluatorResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse result = new com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse.getDefaultInstance()) return this;
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

    private com.tcn.cloud.api.api.commons.org.ResponseEvaluator evaluator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.ResponseEvaluator, com.tcn.cloud.api.api.commons.org.ResponseEvaluator.Builder, com.tcn.cloud.api.api.commons.org.ResponseEvaluatorOrBuilder> evaluatorBuilder_;
    /**
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     * @return Whether the evaluator field is set.
     */
    public boolean hasEvaluator() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     * @return The evaluator.
     */
    public com.tcn.cloud.api.api.commons.org.ResponseEvaluator getEvaluator() {
      if (evaluatorBuilder_ == null) {
        return evaluator_ == null ? com.tcn.cloud.api.api.commons.org.ResponseEvaluator.getDefaultInstance() : evaluator_;
      } else {
        return evaluatorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public Builder setEvaluator(com.tcn.cloud.api.api.commons.org.ResponseEvaluator value) {
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
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public Builder setEvaluator(
        com.tcn.cloud.api.api.commons.org.ResponseEvaluator.Builder builderForValue) {
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
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public Builder mergeEvaluator(com.tcn.cloud.api.api.commons.org.ResponseEvaluator value) {
      if (evaluatorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          evaluator_ != null &&
          evaluator_ != com.tcn.cloud.api.api.commons.org.ResponseEvaluator.getDefaultInstance()) {
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
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
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
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ResponseEvaluator.Builder getEvaluatorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEvaluatorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ResponseEvaluatorOrBuilder getEvaluatorOrBuilder() {
      if (evaluatorBuilder_ != null) {
        return evaluatorBuilder_.getMessageOrBuilder();
      } else {
        return evaluator_ == null ?
            com.tcn.cloud.api.api.commons.org.ResponseEvaluator.getDefaultInstance() : evaluator_;
      }
    }
    /**
     * <pre>
     * Requested evaluator.
     * </pre>
     *
     * <code>.api.commons.org.ResponseEvaluator evaluator = 1 [json_name = "evaluator"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.ResponseEvaluator, com.tcn.cloud.api.api.commons.org.ResponseEvaluator.Builder, com.tcn.cloud.api.api.commons.org.ResponseEvaluatorOrBuilder> 
        getEvaluatorFieldBuilder() {
      if (evaluatorBuilder_ == null) {
        evaluatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.ResponseEvaluator, com.tcn.cloud.api.api.commons.org.ResponseEvaluator.Builder, com.tcn.cloud.api.api.commons.org.ResponseEvaluatorOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.GetResponseEvaluatorResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.GetResponseEvaluatorResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetResponseEvaluatorResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetResponseEvaluatorResponse>() {
    @java.lang.Override
    public GetResponseEvaluatorResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetResponseEvaluatorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetResponseEvaluatorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.GetResponseEvaluatorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

