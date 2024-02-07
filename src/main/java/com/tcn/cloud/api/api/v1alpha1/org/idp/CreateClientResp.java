// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/idp/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.idp;

/**
 * <pre>
 * CreateClientResp returns the response from creating a client.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.idp.CreateClientResp}
 */
public final class CreateClientResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.idp.CreateClientResp)
    CreateClientRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateClientResp.newBuilder() to construct.
  private CreateClientResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateClientResp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateClientResp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.idp.EntitiesProto.internal_static_api_v1alpha1_org_idp_CreateClientResp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.idp.EntitiesProto.internal_static_api_v1alpha1_org_idp_CreateClientResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp.class, com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp.Builder.class);
  }

  public static final int ALREADY_EXISTS_FIELD_NUMBER = 1;
  private boolean alreadyExists_ = false;
  /**
   * <code>bool already_exists = 1 [json_name = "alreadyExists"];</code>
   * @return The alreadyExists.
   */
  @java.lang.Override
  public boolean getAlreadyExists() {
    return alreadyExists_;
  }

  public static final int CLIENT_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.org.IdpClient client_;
  /**
   * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
   * @return Whether the client field is set.
   */
  @java.lang.Override
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
   * @return The client.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IdpClient getClient() {
    return client_ == null ? com.tcn.cloud.api.api.commons.org.IdpClient.getDefaultInstance() : client_;
  }
  /**
   * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IdpClientOrBuilder getClientOrBuilder() {
    return client_ == null ? com.tcn.cloud.api.api.commons.org.IdpClient.getDefaultInstance() : client_;
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
    if (alreadyExists_ != false) {
      output.writeBool(1, alreadyExists_);
    }
    if (client_ != null) {
      output.writeMessage(2, getClient());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (alreadyExists_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, alreadyExists_);
    }
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getClient());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp other = (com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp) obj;

    if (getAlreadyExists()
        != other.getAlreadyExists()) return false;
    if (hasClient() != other.hasClient()) return false;
    if (hasClient()) {
      if (!getClient()
          .equals(other.getClient())) return false;
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
    hash = (37 * hash) + ALREADY_EXISTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAlreadyExists());
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp prototype) {
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
   * CreateClientResp returns the response from creating a client.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.idp.CreateClientResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.idp.CreateClientResp)
      com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.idp.EntitiesProto.internal_static_api_v1alpha1_org_idp_CreateClientResp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.idp.EntitiesProto.internal_static_api_v1alpha1_org_idp_CreateClientResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp.class, com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp.newBuilder()
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
      alreadyExists_ = false;
      client_ = null;
      if (clientBuilder_ != null) {
        clientBuilder_.dispose();
        clientBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.idp.EntitiesProto.internal_static_api_v1alpha1_org_idp_CreateClientResp_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp build() {
      com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp result = new com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.alreadyExists_ = alreadyExists_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.client_ = clientBuilder_ == null
            ? client_
            : clientBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp.getDefaultInstance()) return this;
      if (other.getAlreadyExists() != false) {
        setAlreadyExists(other.getAlreadyExists());
      }
      if (other.hasClient()) {
        mergeClient(other.getClient());
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
              alreadyExists_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getClientFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private boolean alreadyExists_ ;
    /**
     * <code>bool already_exists = 1 [json_name = "alreadyExists"];</code>
     * @return The alreadyExists.
     */
    @java.lang.Override
    public boolean getAlreadyExists() {
      return alreadyExists_;
    }
    /**
     * <code>bool already_exists = 1 [json_name = "alreadyExists"];</code>
     * @param value The alreadyExists to set.
     * @return This builder for chaining.
     */
    public Builder setAlreadyExists(boolean value) {

      alreadyExists_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool already_exists = 1 [json_name = "alreadyExists"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAlreadyExists() {
      bitField0_ = (bitField0_ & ~0x00000001);
      alreadyExists_ = false;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.org.IdpClient client_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.IdpClient, com.tcn.cloud.api.api.commons.org.IdpClient.Builder, com.tcn.cloud.api.api.commons.org.IdpClientOrBuilder> clientBuilder_;
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     * @return Whether the client field is set.
     */
    public boolean hasClient() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     * @return The client.
     */
    public com.tcn.cloud.api.api.commons.org.IdpClient getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? com.tcn.cloud.api.api.commons.org.IdpClient.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     */
    public Builder setClient(com.tcn.cloud.api.api.commons.org.IdpClient value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
      } else {
        clientBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     */
    public Builder setClient(
        com.tcn.cloud.api.api.commons.org.IdpClient.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     */
    public Builder mergeClient(com.tcn.cloud.api.api.commons.org.IdpClient value) {
      if (clientBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          client_ != null &&
          client_ != com.tcn.cloud.api.api.commons.org.IdpClient.getDefaultInstance()) {
          getClientBuilder().mergeFrom(value);
        } else {
          client_ = value;
        }
      } else {
        clientBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     */
    public Builder clearClient() {
      bitField0_ = (bitField0_ & ~0x00000002);
      client_ = null;
      if (clientBuilder_ != null) {
        clientBuilder_.dispose();
        clientBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IdpClient.Builder getClientBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IdpClientOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            com.tcn.cloud.api.api.commons.org.IdpClient.getDefaultInstance() : client_;
      }
    }
    /**
     * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.IdpClient, com.tcn.cloud.api.api.commons.org.IdpClient.Builder, com.tcn.cloud.api.api.commons.org.IdpClientOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.IdpClient, com.tcn.cloud.api.api.commons.org.IdpClient.Builder, com.tcn.cloud.api.api.commons.org.IdpClientOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.idp.CreateClientResp)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.idp.CreateClientResp)
  private static final com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateClientResp>
      PARSER = new com.google.protobuf.AbstractParser<CreateClientResp>() {
    @java.lang.Override
    public CreateClientResp parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateClientResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClientResp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.idp.CreateClientResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

