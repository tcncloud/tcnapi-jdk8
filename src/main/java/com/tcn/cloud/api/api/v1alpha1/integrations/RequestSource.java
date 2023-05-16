// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.RequestSource}
 */
public final class RequestSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.RequestSource)
    RequestSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestSource.newBuilder() to construct.
  private RequestSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestSource() {
    requestSource_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RequestSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RequestSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource.class, com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource.Builder.class);
  }

  public static final int REQUEST_SOURCE_FIELD_NUMBER = 1;
  private int requestSource_ = 0;
  /**
   * <code>.api.commons.public.RequestSource request_source = 1 [json_name = "requestSource"];</code>
   * @return The enum numeric value on the wire for requestSource.
   */
  @java.lang.Override public int getRequestSourceValue() {
    return requestSource_;
  }
  /**
   * <code>.api.commons.public.RequestSource request_source = 1 [json_name = "requestSource"];</code>
   * @return The requestSource.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.public.RequestSource getRequestSource() {
    com.tcn.cloud.api.api.commons.public.RequestSource result = com.tcn.cloud.api.api.commons.public.RequestSource.forNumber(requestSource_);
    return result == null ? com.tcn.cloud.api.api.commons.public.RequestSource.UNRECOGNIZED : result;
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
    if (requestSource_ != com.tcn.cloud.api.api.commons.public.RequestSource.REQUEST_SOURCE_IVR.getNumber()) {
      output.writeEnum(1, requestSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestSource_ != com.tcn.cloud.api.api.commons.public.RequestSource.REQUEST_SOURCE_IVR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, requestSource_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource other = (com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource) obj;

    if (requestSource_ != other.requestSource_) return false;
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
    hash = (37 * hash) + REQUEST_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + requestSource_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.RequestSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.RequestSource)
      com.tcn.cloud.api.api.v1alpha1.integrations.RequestSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RequestSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RequestSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource.class, com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource.newBuilder()
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
      requestSource_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_RequestSource_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource result = new com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestSource_ = requestSource_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource.getDefaultInstance()) return this;
      if (other.requestSource_ != 0) {
        setRequestSourceValue(other.getRequestSourceValue());
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
              requestSource_ = input.readEnum();
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

    private int requestSource_ = 0;
    /**
     * <code>.api.commons.public.RequestSource request_source = 1 [json_name = "requestSource"];</code>
     * @return The enum numeric value on the wire for requestSource.
     */
    @java.lang.Override public int getRequestSourceValue() {
      return requestSource_;
    }
    /**
     * <code>.api.commons.public.RequestSource request_source = 1 [json_name = "requestSource"];</code>
     * @param value The enum numeric value on the wire for requestSource to set.
     * @return This builder for chaining.
     */
    public Builder setRequestSourceValue(int value) {
      requestSource_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.public.RequestSource request_source = 1 [json_name = "requestSource"];</code>
     * @return The requestSource.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.public.RequestSource getRequestSource() {
      com.tcn.cloud.api.api.commons.public.RequestSource result = com.tcn.cloud.api.api.commons.public.RequestSource.forNumber(requestSource_);
      return result == null ? com.tcn.cloud.api.api.commons.public.RequestSource.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.public.RequestSource request_source = 1 [json_name = "requestSource"];</code>
     * @param value The requestSource to set.
     * @return This builder for chaining.
     */
    public Builder setRequestSource(com.tcn.cloud.api.api.commons.public.RequestSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      requestSource_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.public.RequestSource request_source = 1 [json_name = "requestSource"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestSource() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestSource_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.RequestSource)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.RequestSource)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestSource>
      PARSER = new com.google.protobuf.AbstractParser<RequestSource>() {
    @java.lang.Override
    public RequestSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<RequestSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.RequestSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

