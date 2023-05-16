// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

/**
 * Protobuf type {@code api.v1alpha1.delivery.ListCredentialsRes}
 */
public final class ListCredentialsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.delivery.ListCredentialsRes)
    ListCredentialsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCredentialsRes.newBuilder() to construct.
  private ListCredentialsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCredentialsRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCredentialsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListCredentialsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListCredentialsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.class, com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.Builder.class);
  }

  public static final int CREDENTIALS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.delivery.Credentials credentials_;
  /**
   * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
   * @return Whether the credentials field is set.
   */
  @java.lang.Override
  public boolean hasCredentials() {
    return credentials_ != null;
  }
  /**
   * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
   * @return The credentials.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.Credentials getCredentials() {
    return credentials_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.getDefaultInstance() : credentials_;
  }
  /**
   * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.CredentialsOrBuilder getCredentialsOrBuilder() {
    return credentials_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.getDefaultInstance() : credentials_;
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
    if (credentials_ != null) {
      output.writeMessage(1, getCredentials());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (credentials_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCredentials());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes other = (com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes) obj;

    if (hasCredentials() != other.hasCredentials()) return false;
    if (hasCredentials()) {
      if (!getCredentials()
          .equals(other.getCredentials())) return false;
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
    if (hasCredentials()) {
      hash = (37 * hash) + CREDENTIALS_FIELD_NUMBER;
      hash = (53 * hash) + getCredentials().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes prototype) {
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
   * Protobuf type {@code api.v1alpha1.delivery.ListCredentialsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.delivery.ListCredentialsRes)
      com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListCredentialsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListCredentialsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.class, com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.newBuilder()
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
      credentials_ = null;
      if (credentialsBuilder_ != null) {
        credentialsBuilder_.dispose();
        credentialsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_ListCredentialsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes build() {
      com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes result = new com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.credentials_ = credentialsBuilder_ == null
            ? credentials_
            : credentialsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes.getDefaultInstance()) return this;
      if (other.hasCredentials()) {
        mergeCredentials(other.getCredentials());
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
                  getCredentialsFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.delivery.Credentials credentials_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.Credentials, com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.CredentialsOrBuilder> credentialsBuilder_;
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     * @return Whether the credentials field is set.
     */
    public boolean hasCredentials() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     * @return The credentials.
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credentials getCredentials() {
      if (credentialsBuilder_ == null) {
        return credentials_ == null ? com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.getDefaultInstance() : credentials_;
      } else {
        return credentialsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     */
    public Builder setCredentials(com.tcn.cloud.api.api.v1alpha1.delivery.Credentials value) {
      if (credentialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        credentials_ = value;
      } else {
        credentialsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     */
    public Builder setCredentials(
        com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.Builder builderForValue) {
      if (credentialsBuilder_ == null) {
        credentials_ = builderForValue.build();
      } else {
        credentialsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     */
    public Builder mergeCredentials(com.tcn.cloud.api.api.v1alpha1.delivery.Credentials value) {
      if (credentialsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          credentials_ != null &&
          credentials_ != com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.getDefaultInstance()) {
          getCredentialsBuilder().mergeFrom(value);
        } else {
          credentials_ = value;
        }
      } else {
        credentialsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     */
    public Builder clearCredentials() {
      bitField0_ = (bitField0_ & ~0x00000001);
      credentials_ = null;
      if (credentialsBuilder_ != null) {
        credentialsBuilder_.dispose();
        credentialsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.Builder getCredentialsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCredentialsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.CredentialsOrBuilder getCredentialsOrBuilder() {
      if (credentialsBuilder_ != null) {
        return credentialsBuilder_.getMessageOrBuilder();
      } else {
        return credentials_ == null ?
            com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.getDefaultInstance() : credentials_;
      }
    }
    /**
     * <code>.api.v1alpha1.delivery.Credentials credentials = 1 [json_name = "credentials"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.Credentials, com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.CredentialsOrBuilder> 
        getCredentialsFieldBuilder() {
      if (credentialsBuilder_ == null) {
        credentialsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.delivery.Credentials, com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.CredentialsOrBuilder>(
                getCredentials(),
                getParentForChildren(),
                isClean());
        credentials_ = null;
      }
      return credentialsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.delivery.ListCredentialsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.delivery.ListCredentialsRes)
  private static final com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCredentialsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListCredentialsRes>() {
    @java.lang.Override
    public ListCredentialsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCredentialsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCredentialsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.ListCredentialsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

