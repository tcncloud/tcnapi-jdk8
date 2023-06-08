// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.IntegrationType}
 */
public final class IntegrationType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.IntegrationType)
    IntegrationTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntegrationType.newBuilder() to construct.
  private IntegrationType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntegrationType() {
    integrationId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntegrationType();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType.class, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType.Builder.class);
  }

  public static final int INTEGRATION_ID_FIELD_NUMBER = 1;
  private int integrationId_ = 0;
  /**
   * <code>.api.commons.integrations.IntegrationType integration_id = 1 [json_name = "integrationId"];</code>
   * @return The enum numeric value on the wire for integrationId.
   */
  @java.lang.Override public int getIntegrationIdValue() {
    return integrationId_;
  }
  /**
   * <code>.api.commons.integrations.IntegrationType integration_id = 1 [json_name = "integrationId"];</code>
   * @return The integrationId.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.integrations.IntegrationType getIntegrationId() {
    com.tcn.cloud.api.api.commons.integrations.IntegrationType result = com.tcn.cloud.api.api.commons.integrations.IntegrationType.forNumber(integrationId_);
    return result == null ? com.tcn.cloud.api.api.commons.integrations.IntegrationType.UNRECOGNIZED : result;
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
    if (integrationId_ != com.tcn.cloud.api.api.commons.integrations.IntegrationType.INTEGRATION_TYPE_UNKNOWN.getNumber()) {
      output.writeEnum(1, integrationId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (integrationId_ != com.tcn.cloud.api.api.commons.integrations.IntegrationType.INTEGRATION_TYPE_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, integrationId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType other = (com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType) obj;

    if (integrationId_ != other.integrationId_) return false;
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
    hash = (37 * hash) + INTEGRATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + integrationId_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.IntegrationType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.IntegrationType)
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType.class, com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType.newBuilder()
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
      integrationId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_IntegrationType_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType result = new com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.integrationId_ = integrationId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType.getDefaultInstance()) return this;
      if (other.integrationId_ != 0) {
        setIntegrationIdValue(other.getIntegrationIdValue());
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
              integrationId_ = input.readEnum();
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

    private int integrationId_ = 0;
    /**
     * <code>.api.commons.integrations.IntegrationType integration_id = 1 [json_name = "integrationId"];</code>
     * @return The enum numeric value on the wire for integrationId.
     */
    @java.lang.Override public int getIntegrationIdValue() {
      return integrationId_;
    }
    /**
     * <code>.api.commons.integrations.IntegrationType integration_id = 1 [json_name = "integrationId"];</code>
     * @param value The enum numeric value on the wire for integrationId to set.
     * @return This builder for chaining.
     */
    public Builder setIntegrationIdValue(int value) {
      integrationId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.integrations.IntegrationType integration_id = 1 [json_name = "integrationId"];</code>
     * @return The integrationId.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.integrations.IntegrationType getIntegrationId() {
      com.tcn.cloud.api.api.commons.integrations.IntegrationType result = com.tcn.cloud.api.api.commons.integrations.IntegrationType.forNumber(integrationId_);
      return result == null ? com.tcn.cloud.api.api.commons.integrations.IntegrationType.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.integrations.IntegrationType integration_id = 1 [json_name = "integrationId"];</code>
     * @param value The integrationId to set.
     * @return This builder for chaining.
     */
    public Builder setIntegrationId(com.tcn.cloud.api.api.commons.integrations.IntegrationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      integrationId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.integrations.IntegrationType integration_id = 1 [json_name = "integrationId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIntegrationId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      integrationId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.IntegrationType)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.IntegrationType)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntegrationType>
      PARSER = new com.google.protobuf.AbstractParser<IntegrationType>() {
    @java.lang.Override
    public IntegrationType parsePartialFrom(
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

  public static com.google.protobuf.Parser<IntegrationType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntegrationType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.IntegrationType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

