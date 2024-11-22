// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/hunt_groups/v1alpha1/entities.proto

package com.tcn.cloud.api.services.org.hunt_groups.v1alpha1;

/**
 * <pre>
 * Request to get an agent campaign client info display template by ID.
 * </pre>
 *
 * Protobuf type {@code services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest}
 */
public final class GetAgentClientInfoDisplayTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest)
    GetAgentClientInfoDisplayTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAgentClientInfoDisplayTemplateRequest.newBuilder() to construct.
  private GetAgentClientInfoDisplayTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAgentClientInfoDisplayTemplateRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAgentClientInfoDisplayTemplateRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_GetAgentClientInfoDisplayTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_GetAgentClientInfoDisplayTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.class, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.Builder.class);
  }

  public static final int TEMPLATE_SID_FIELD_NUMBER = 1;
  private long templateSid_ = 0L;
  /**
   * <code>int64 template_sid = 1 [json_name = "templateSid"];</code>
   * @return The templateSid.
   */
  @java.lang.Override
  public long getTemplateSid() {
    return templateSid_;
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
    if (templateSid_ != 0L) {
      output.writeInt64(1, templateSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (templateSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, templateSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest other = (com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest) obj;

    if (getTemplateSid()
        != other.getTemplateSid()) return false;
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
    hash = (37 * hash) + TEMPLATE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTemplateSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest prototype) {
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
   * Request to get an agent campaign client info display template by ID.
   * </pre>
   *
   * Protobuf type {@code services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest)
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_GetAgentClientInfoDisplayTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_GetAgentClientInfoDisplayTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.class, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.newBuilder()
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
      templateSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_GetAgentClientInfoDisplayTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest build() {
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest buildPartial() {
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest result = new com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.templateSid_ = templateSid_;
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
      if (other instanceof com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest) {
        return mergeFrom((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest other) {
      if (other == com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest.getDefaultInstance()) return this;
      if (other.getTemplateSid() != 0L) {
        setTemplateSid(other.getTemplateSid());
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
              templateSid_ = input.readInt64();
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

    private long templateSid_ ;
    /**
     * <code>int64 template_sid = 1 [json_name = "templateSid"];</code>
     * @return The templateSid.
     */
    @java.lang.Override
    public long getTemplateSid() {
      return templateSid_;
    }
    /**
     * <code>int64 template_sid = 1 [json_name = "templateSid"];</code>
     * @param value The templateSid to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateSid(long value) {

      templateSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 template_sid = 1 [json_name = "templateSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTemplateSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      templateSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest)
  private static final com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest();
  }

  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAgentClientInfoDisplayTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetAgentClientInfoDisplayTemplateRequest>() {
    @java.lang.Override
    public GetAgentClientInfoDisplayTemplateRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAgentClientInfoDisplayTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAgentClientInfoDisplayTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.GetAgentClientInfoDisplayTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

