// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Request message for the CreateAgentPauseCode RPC.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.CreateAgentPauseCodeRequest}
 */
public final class CreateAgentPauseCodeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateAgentPauseCodeRequest)
    CreateAgentPauseCodeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAgentPauseCodeRequest.newBuilder() to construct.
  private CreateAgentPauseCodeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAgentPauseCodeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAgentPauseCodeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CreateAgentPauseCodeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CreateAgentPauseCodeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.class, com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.Builder.class);
  }

  public static final int PAUSE_CODE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.PauseCode pauseCode_;
  /**
   * <pre>
   * the pause_code.xml_client_property_sid field is
   * NOT used in this context. The pause code will
   * be created with a default xml_client_property sid.
   * </pre>
   *
   * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
   * @return Whether the pauseCode field is set.
   */
  @java.lang.Override
  public boolean hasPauseCode() {
    return pauseCode_ != null;
  }
  /**
   * <pre>
   * the pause_code.xml_client_property_sid field is
   * NOT used in this context. The pause code will
   * be created with a default xml_client_property sid.
   * </pre>
   *
   * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
   * @return The pauseCode.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PauseCode getPauseCode() {
    return pauseCode_ == null ? com.tcn.cloud.api.api.v0alpha.PauseCode.getDefaultInstance() : pauseCode_;
  }
  /**
   * <pre>
   * the pause_code.xml_client_property_sid field is
   * NOT used in this context. The pause code will
   * be created with a default xml_client_property sid.
   * </pre>
   *
   * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PauseCodeOrBuilder getPauseCodeOrBuilder() {
    return pauseCode_ == null ? com.tcn.cloud.api.api.v0alpha.PauseCode.getDefaultInstance() : pauseCode_;
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
    if (pauseCode_ != null) {
      output.writeMessage(1, getPauseCode());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pauseCode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPauseCode());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest other = (com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest) obj;

    if (hasPauseCode() != other.hasPauseCode()) return false;
    if (hasPauseCode()) {
      if (!getPauseCode()
          .equals(other.getPauseCode())) return false;
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
    if (hasPauseCode()) {
      hash = (37 * hash) + PAUSE_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getPauseCode().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest prototype) {
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
   * Request message for the CreateAgentPauseCode RPC.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.CreateAgentPauseCodeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateAgentPauseCodeRequest)
      com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CreateAgentPauseCodeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CreateAgentPauseCodeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.class, com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.newBuilder()
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
      pauseCode_ = null;
      if (pauseCodeBuilder_ != null) {
        pauseCodeBuilder_.dispose();
        pauseCodeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CreateAgentPauseCodeRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest build() {
      com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest result = new com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pauseCode_ = pauseCodeBuilder_ == null
            ? pauseCode_
            : pauseCodeBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest.getDefaultInstance()) return this;
      if (other.hasPauseCode()) {
        mergePauseCode(other.getPauseCode());
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
                  getPauseCodeFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.PauseCode pauseCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PauseCode, com.tcn.cloud.api.api.v0alpha.PauseCode.Builder, com.tcn.cloud.api.api.v0alpha.PauseCodeOrBuilder> pauseCodeBuilder_;
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     * @return Whether the pauseCode field is set.
     */
    public boolean hasPauseCode() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     * @return The pauseCode.
     */
    public com.tcn.cloud.api.api.v0alpha.PauseCode getPauseCode() {
      if (pauseCodeBuilder_ == null) {
        return pauseCode_ == null ? com.tcn.cloud.api.api.v0alpha.PauseCode.getDefaultInstance() : pauseCode_;
      } else {
        return pauseCodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     */
    public Builder setPauseCode(com.tcn.cloud.api.api.v0alpha.PauseCode value) {
      if (pauseCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pauseCode_ = value;
      } else {
        pauseCodeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     */
    public Builder setPauseCode(
        com.tcn.cloud.api.api.v0alpha.PauseCode.Builder builderForValue) {
      if (pauseCodeBuilder_ == null) {
        pauseCode_ = builderForValue.build();
      } else {
        pauseCodeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     */
    public Builder mergePauseCode(com.tcn.cloud.api.api.v0alpha.PauseCode value) {
      if (pauseCodeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          pauseCode_ != null &&
          pauseCode_ != com.tcn.cloud.api.api.v0alpha.PauseCode.getDefaultInstance()) {
          getPauseCodeBuilder().mergeFrom(value);
        } else {
          pauseCode_ = value;
        }
      } else {
        pauseCodeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     */
    public Builder clearPauseCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pauseCode_ = null;
      if (pauseCodeBuilder_ != null) {
        pauseCodeBuilder_.dispose();
        pauseCodeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PauseCode.Builder getPauseCodeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPauseCodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PauseCodeOrBuilder getPauseCodeOrBuilder() {
      if (pauseCodeBuilder_ != null) {
        return pauseCodeBuilder_.getMessageOrBuilder();
      } else {
        return pauseCode_ == null ?
            com.tcn.cloud.api.api.v0alpha.PauseCode.getDefaultInstance() : pauseCode_;
      }
    }
    /**
     * <pre>
     * the pause_code.xml_client_property_sid field is
     * NOT used in this context. The pause code will
     * be created with a default xml_client_property sid.
     * </pre>
     *
     * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PauseCode, com.tcn.cloud.api.api.v0alpha.PauseCode.Builder, com.tcn.cloud.api.api.v0alpha.PauseCodeOrBuilder> 
        getPauseCodeFieldBuilder() {
      if (pauseCodeBuilder_ == null) {
        pauseCodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.PauseCode, com.tcn.cloud.api.api.v0alpha.PauseCode.Builder, com.tcn.cloud.api.api.v0alpha.PauseCodeOrBuilder>(
                getPauseCode(),
                getParentForChildren(),
                isClean());
        pauseCode_ = null;
      }
      return pauseCodeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateAgentPauseCodeRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateAgentPauseCodeRequest)
  private static final com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAgentPauseCodeRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAgentPauseCodeRequest>() {
    @java.lang.Override
    public CreateAgentPauseCodeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAgentPauseCodeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAgentPauseCodeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateAgentPauseCodeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

