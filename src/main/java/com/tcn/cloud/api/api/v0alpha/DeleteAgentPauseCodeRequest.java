// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request message for the DeleteAgentPauseCode RPC.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.DeleteAgentPauseCodeRequest}
 */
public final class DeleteAgentPauseCodeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DeleteAgentPauseCodeRequest)
    DeleteAgentPauseCodeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteAgentPauseCodeRequest.newBuilder() to construct.
  private DeleteAgentPauseCodeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteAgentPauseCodeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteAgentPauseCodeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DeleteAgentPauseCodeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DeleteAgentPauseCodeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.class, com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.Builder.class);
  }

  public static final int XML_CLIENT_PROPERTY_SID_FIELD_NUMBER = 1;
  private long xmlClientPropertySid_ = 0L;
  /**
   * <code>int64 xml_client_property_sid = 1 [json_name = "xmlClientPropertySid"];</code>
   * @return The xmlClientPropertySid.
   */
  @java.lang.Override
  public long getXmlClientPropertySid() {
    return xmlClientPropertySid_;
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
    if (xmlClientPropertySid_ != 0L) {
      output.writeInt64(1, xmlClientPropertySid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (xmlClientPropertySid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, xmlClientPropertySid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest other = (com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest) obj;

    if (getXmlClientPropertySid()
        != other.getXmlClientPropertySid()) return false;
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
    hash = (37 * hash) + XML_CLIENT_PROPERTY_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getXmlClientPropertySid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest prototype) {
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
   * Request message for the DeleteAgentPauseCode RPC.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.DeleteAgentPauseCodeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DeleteAgentPauseCodeRequest)
      com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DeleteAgentPauseCodeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DeleteAgentPauseCodeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.class, com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.newBuilder()
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
      xmlClientPropertySid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_DeleteAgentPauseCodeRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest build() {
      com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest result = new com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.xmlClientPropertySid_ = xmlClientPropertySid_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest.getDefaultInstance()) return this;
      if (other.getXmlClientPropertySid() != 0L) {
        setXmlClientPropertySid(other.getXmlClientPropertySid());
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
              xmlClientPropertySid_ = input.readInt64();
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

    private long xmlClientPropertySid_ ;
    /**
     * <code>int64 xml_client_property_sid = 1 [json_name = "xmlClientPropertySid"];</code>
     * @return The xmlClientPropertySid.
     */
    @java.lang.Override
    public long getXmlClientPropertySid() {
      return xmlClientPropertySid_;
    }
    /**
     * <code>int64 xml_client_property_sid = 1 [json_name = "xmlClientPropertySid"];</code>
     * @param value The xmlClientPropertySid to set.
     * @return This builder for chaining.
     */
    public Builder setXmlClientPropertySid(long value) {

      xmlClientPropertySid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 xml_client_property_sid = 1 [json_name = "xmlClientPropertySid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearXmlClientPropertySid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      xmlClientPropertySid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DeleteAgentPauseCodeRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DeleteAgentPauseCodeRequest)
  private static final com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteAgentPauseCodeRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteAgentPauseCodeRequest>() {
    @java.lang.Override
    public DeleteAgentPauseCodeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteAgentPauseCodeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteAgentPauseCodeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DeleteAgentPauseCodeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

