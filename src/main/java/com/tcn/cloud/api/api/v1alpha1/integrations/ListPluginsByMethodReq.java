// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.ListPluginsByMethodReq}
 */
public final class ListPluginsByMethodReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.ListPluginsByMethodReq)
    ListPluginsByMethodReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPluginsByMethodReq.newBuilder() to construct.
  private ListPluginsByMethodReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPluginsByMethodReq() {
    methodId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPluginsByMethodReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListPluginsByMethodReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListPluginsByMethodReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq.class, com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq.Builder.class);
  }

  public static final int METHOD_ID_FIELD_NUMBER = 1;
  private int methodId_ = 0;
  /**
   * <code>.api.commons.integrations.RequestMethod method_id = 1 [json_name = "methodId"];</code>
   * @return The enum numeric value on the wire for methodId.
   */
  @java.lang.Override public int getMethodIdValue() {
    return methodId_;
  }
  /**
   * <code>.api.commons.integrations.RequestMethod method_id = 1 [json_name = "methodId"];</code>
   * @return The methodId.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.integrations.RequestMethod getMethodId() {
    com.tcn.cloud.api.api.commons.integrations.RequestMethod result = com.tcn.cloud.api.api.commons.integrations.RequestMethod.forNumber(methodId_);
    return result == null ? com.tcn.cloud.api.api.commons.integrations.RequestMethod.UNRECOGNIZED : result;
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
    if (methodId_ != com.tcn.cloud.api.api.commons.integrations.RequestMethod.REQUEST_METHOD_UNKNOWN.getNumber()) {
      output.writeEnum(1, methodId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (methodId_ != com.tcn.cloud.api.api.commons.integrations.RequestMethod.REQUEST_METHOD_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, methodId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq other = (com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq) obj;

    if (methodId_ != other.methodId_) return false;
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
    hash = (37 * hash) + METHOD_ID_FIELD_NUMBER;
    hash = (53 * hash) + methodId_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.ListPluginsByMethodReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.ListPluginsByMethodReq)
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListPluginsByMethodReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListPluginsByMethodReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq.class, com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq.newBuilder()
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
      methodId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListPluginsByMethodReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq result = new com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.methodId_ = methodId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq.getDefaultInstance()) return this;
      if (other.methodId_ != 0) {
        setMethodIdValue(other.getMethodIdValue());
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
            case 8: {
              methodId_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int methodId_ = 0;
    /**
     * <code>.api.commons.integrations.RequestMethod method_id = 1 [json_name = "methodId"];</code>
     * @return The enum numeric value on the wire for methodId.
     */
    @java.lang.Override public int getMethodIdValue() {
      return methodId_;
    }
    /**
     * <code>.api.commons.integrations.RequestMethod method_id = 1 [json_name = "methodId"];</code>
     * @param value The enum numeric value on the wire for methodId to set.
     * @return This builder for chaining.
     */
    public Builder setMethodIdValue(int value) {
      methodId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.integrations.RequestMethod method_id = 1 [json_name = "methodId"];</code>
     * @return The methodId.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.integrations.RequestMethod getMethodId() {
      com.tcn.cloud.api.api.commons.integrations.RequestMethod result = com.tcn.cloud.api.api.commons.integrations.RequestMethod.forNumber(methodId_);
      return result == null ? com.tcn.cloud.api.api.commons.integrations.RequestMethod.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.integrations.RequestMethod method_id = 1 [json_name = "methodId"];</code>
     * @param value The methodId to set.
     * @return This builder for chaining.
     */
    public Builder setMethodId(com.tcn.cloud.api.api.commons.integrations.RequestMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      methodId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.integrations.RequestMethod method_id = 1 [json_name = "methodId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMethodId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      methodId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.ListPluginsByMethodReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.ListPluginsByMethodReq)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPluginsByMethodReq>
      PARSER = new com.google.protobuf.AbstractParser<ListPluginsByMethodReq>() {
    @java.lang.Override
    public ListPluginsByMethodReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPluginsByMethodReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPluginsByMethodReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.ListPluginsByMethodReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
