// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/auth/user.proto

package com.tcn.cloud.api.api.commons.auth;

/**
 * <pre>
 * AuthenticatedUser is a proto serialized version of AuthUser. It can be used to pass all AuthUser information towards the backends
 * </pre>
 *
 * Protobuf type {@code api.commons.auth.AuthenticatedUser}
 */
public final class AuthenticatedUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.auth.AuthenticatedUser)
    AuthenticatedUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthenticatedUser.newBuilder() to construct.
  private AuthenticatedUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthenticatedUser() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthenticatedUser();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.auth.UserProto.internal_static_api_commons_auth_AuthenticatedUser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.auth.UserProto.internal_static_api_commons_auth_AuthenticatedUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.auth.AuthenticatedUser.class, com.tcn.cloud.api.api.commons.auth.AuthenticatedUser.Builder.class);
  }

  public static final int CLAIMS_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.auth.AuthClaims claims_;
  /**
   * <pre>
   * JWT Claims
   * </pre>
   *
   * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
   * @return Whether the claims field is set.
   */
  @java.lang.Override
  public boolean hasClaims() {
    return claims_ != null;
  }
  /**
   * <pre>
   * JWT Claims
   * </pre>
   *
   * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
   * @return The claims.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.auth.AuthClaims getClaims() {
    return claims_ == null ? com.tcn.cloud.api.api.commons.auth.AuthClaims.getDefaultInstance() : claims_;
  }
  /**
   * <pre>
   * JWT Claims
   * </pre>
   *
   * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.auth.AuthClaimsOrBuilder getClaimsOrBuilder() {
    return claims_ == null ? com.tcn.cloud.api.api.commons.auth.AuthClaims.getDefaultInstance() : claims_;
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
    if (claims_ != null) {
      output.writeMessage(1, getClaims());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (claims_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClaims());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.auth.AuthenticatedUser)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.auth.AuthenticatedUser other = (com.tcn.cloud.api.api.commons.auth.AuthenticatedUser) obj;

    if (hasClaims() != other.hasClaims()) return false;
    if (hasClaims()) {
      if (!getClaims()
          .equals(other.getClaims())) return false;
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
    if (hasClaims()) {
      hash = (37 * hash) + CLAIMS_FIELD_NUMBER;
      hash = (53 * hash) + getClaims().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.auth.AuthenticatedUser prototype) {
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
   * AuthenticatedUser is a proto serialized version of AuthUser. It can be used to pass all AuthUser information towards the backends
   * </pre>
   *
   * Protobuf type {@code api.commons.auth.AuthenticatedUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.auth.AuthenticatedUser)
      com.tcn.cloud.api.api.commons.auth.AuthenticatedUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.auth.UserProto.internal_static_api_commons_auth_AuthenticatedUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.auth.UserProto.internal_static_api_commons_auth_AuthenticatedUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.auth.AuthenticatedUser.class, com.tcn.cloud.api.api.commons.auth.AuthenticatedUser.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.auth.AuthenticatedUser.newBuilder()
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
      claims_ = null;
      if (claimsBuilder_ != null) {
        claimsBuilder_.dispose();
        claimsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.auth.UserProto.internal_static_api_commons_auth_AuthenticatedUser_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.auth.AuthenticatedUser getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.auth.AuthenticatedUser.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.auth.AuthenticatedUser build() {
      com.tcn.cloud.api.api.commons.auth.AuthenticatedUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.auth.AuthenticatedUser buildPartial() {
      com.tcn.cloud.api.api.commons.auth.AuthenticatedUser result = new com.tcn.cloud.api.api.commons.auth.AuthenticatedUser(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.auth.AuthenticatedUser result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.claims_ = claimsBuilder_ == null
            ? claims_
            : claimsBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.auth.AuthenticatedUser) {
        return mergeFrom((com.tcn.cloud.api.api.commons.auth.AuthenticatedUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.auth.AuthenticatedUser other) {
      if (other == com.tcn.cloud.api.api.commons.auth.AuthenticatedUser.getDefaultInstance()) return this;
      if (other.hasClaims()) {
        mergeClaims(other.getClaims());
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
                  getClaimsFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.auth.AuthClaims claims_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.auth.AuthClaims, com.tcn.cloud.api.api.commons.auth.AuthClaims.Builder, com.tcn.cloud.api.api.commons.auth.AuthClaimsOrBuilder> claimsBuilder_;
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     * @return Whether the claims field is set.
     */
    public boolean hasClaims() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     * @return The claims.
     */
    public com.tcn.cloud.api.api.commons.auth.AuthClaims getClaims() {
      if (claimsBuilder_ == null) {
        return claims_ == null ? com.tcn.cloud.api.api.commons.auth.AuthClaims.getDefaultInstance() : claims_;
      } else {
        return claimsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     */
    public Builder setClaims(com.tcn.cloud.api.api.commons.auth.AuthClaims value) {
      if (claimsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        claims_ = value;
      } else {
        claimsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     */
    public Builder setClaims(
        com.tcn.cloud.api.api.commons.auth.AuthClaims.Builder builderForValue) {
      if (claimsBuilder_ == null) {
        claims_ = builderForValue.build();
      } else {
        claimsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     */
    public Builder mergeClaims(com.tcn.cloud.api.api.commons.auth.AuthClaims value) {
      if (claimsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          claims_ != null &&
          claims_ != com.tcn.cloud.api.api.commons.auth.AuthClaims.getDefaultInstance()) {
          getClaimsBuilder().mergeFrom(value);
        } else {
          claims_ = value;
        }
      } else {
        claimsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     */
    public Builder clearClaims() {
      bitField0_ = (bitField0_ & ~0x00000001);
      claims_ = null;
      if (claimsBuilder_ != null) {
        claimsBuilder_.dispose();
        claimsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     */
    public com.tcn.cloud.api.api.commons.auth.AuthClaims.Builder getClaimsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getClaimsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     */
    public com.tcn.cloud.api.api.commons.auth.AuthClaimsOrBuilder getClaimsOrBuilder() {
      if (claimsBuilder_ != null) {
        return claimsBuilder_.getMessageOrBuilder();
      } else {
        return claims_ == null ?
            com.tcn.cloud.api.api.commons.auth.AuthClaims.getDefaultInstance() : claims_;
      }
    }
    /**
     * <pre>
     * JWT Claims
     * </pre>
     *
     * <code>.api.commons.auth.AuthClaims claims = 1 [json_name = "claims"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.auth.AuthClaims, com.tcn.cloud.api.api.commons.auth.AuthClaims.Builder, com.tcn.cloud.api.api.commons.auth.AuthClaimsOrBuilder> 
        getClaimsFieldBuilder() {
      if (claimsBuilder_ == null) {
        claimsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.auth.AuthClaims, com.tcn.cloud.api.api.commons.auth.AuthClaims.Builder, com.tcn.cloud.api.api.commons.auth.AuthClaimsOrBuilder>(
                getClaims(),
                getParentForChildren(),
                isClean());
        claims_ = null;
      }
      return claimsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.auth.AuthenticatedUser)
  }

  // @@protoc_insertion_point(class_scope:api.commons.auth.AuthenticatedUser)
  private static final com.tcn.cloud.api.api.commons.auth.AuthenticatedUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.auth.AuthenticatedUser();
  }

  public static com.tcn.cloud.api.api.commons.auth.AuthenticatedUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthenticatedUser>
      PARSER = new com.google.protobuf.AbstractParser<AuthenticatedUser>() {
    @java.lang.Override
    public AuthenticatedUser parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuthenticatedUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthenticatedUser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.auth.AuthenticatedUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

