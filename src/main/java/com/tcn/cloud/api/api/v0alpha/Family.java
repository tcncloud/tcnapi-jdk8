// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.Family}
 */
public final class Family extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.Family)
    FamilyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Family.newBuilder() to construct.
  private Family(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Family() {
    clientName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Family();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Family_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Family_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.Family.class, com.tcn.cloud.api.api.v0alpha.Family.Builder.class);
  }

  public static final int CLIENT_SID_FIELD_NUMBER = 1;
  private long clientSid_ = 0L;
  /**
   * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
   * @return The clientSid.
   */
  @java.lang.Override
  public long getClientSid() {
    return clientSid_;
  }

  public static final int CLIENT_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientName_ = "";
  /**
   * <code>string client_name = 2 [json_name = "clientName"];</code>
   * @return The clientName.
   */
  @java.lang.Override
  public java.lang.String getClientName() {
    java.lang.Object ref = clientName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientName_ = s;
      return s;
    }
  }
  /**
   * <code>string client_name = 2 [json_name = "clientName"];</code>
   * @return The bytes for clientName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientNameBytes() {
    java.lang.Object ref = clientName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARENTS_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v0alpha.Relations parents_;
  /**
   * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
   * @return Whether the parents field is set.
   */
  @java.lang.Override
  public boolean hasParents() {
    return parents_ != null;
  }
  /**
   * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
   * @return The parents.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Relations getParents() {
    return parents_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : parents_;
  }
  /**
   * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getParentsOrBuilder() {
    return parents_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : parents_;
  }

  public static final int CHILDREN_FIELD_NUMBER = 4;
  private com.tcn.cloud.api.api.v0alpha.Relations children_;
  /**
   * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
   * @return Whether the children field is set.
   */
  @java.lang.Override
  public boolean hasChildren() {
    return children_ != null;
  }
  /**
   * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
   * @return The children.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Relations getChildren() {
    return children_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : children_;
  }
  /**
   * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getChildrenOrBuilder() {
    return children_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : children_;
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
    if (clientSid_ != 0L) {
      output.writeInt64(1, clientSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clientName_);
    }
    if (parents_ != null) {
      output.writeMessage(3, getParents());
    }
    if (children_ != null) {
      output.writeMessage(4, getChildren());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, clientSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clientName_);
    }
    if (parents_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getParents());
    }
    if (children_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getChildren());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.Family)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.Family other = (com.tcn.cloud.api.api.v0alpha.Family) obj;

    if (getClientSid()
        != other.getClientSid()) return false;
    if (!getClientName()
        .equals(other.getClientName())) return false;
    if (hasParents() != other.hasParents()) return false;
    if (hasParents()) {
      if (!getParents()
          .equals(other.getParents())) return false;
    }
    if (hasChildren() != other.hasChildren()) return false;
    if (hasChildren()) {
      if (!getChildren()
          .equals(other.getChildren())) return false;
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
    hash = (37 * hash) + CLIENT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getClientSid());
    hash = (37 * hash) + CLIENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getClientName().hashCode();
    if (hasParents()) {
      hash = (37 * hash) + PARENTS_FIELD_NUMBER;
      hash = (53 * hash) + getParents().hashCode();
    }
    if (hasChildren()) {
      hash = (37 * hash) + CHILDREN_FIELD_NUMBER;
      hash = (53 * hash) + getChildren().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.Family parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.Family parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Family parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.Family prototype) {
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
   * Protobuf type {@code api.v0alpha.Family}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.Family)
      com.tcn.cloud.api.api.v0alpha.FamilyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Family_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Family_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.Family.class, com.tcn.cloud.api.api.v0alpha.Family.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.Family.newBuilder()
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
      clientSid_ = 0L;
      clientName_ = "";
      parents_ = null;
      if (parentsBuilder_ != null) {
        parentsBuilder_.dispose();
        parentsBuilder_ = null;
      }
      children_ = null;
      if (childrenBuilder_ != null) {
        childrenBuilder_.dispose();
        childrenBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Family_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Family getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.Family.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Family build() {
      com.tcn.cloud.api.api.v0alpha.Family result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Family buildPartial() {
      com.tcn.cloud.api.api.v0alpha.Family result = new com.tcn.cloud.api.api.v0alpha.Family(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.Family result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientSid_ = clientSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientName_ = clientName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.parents_ = parentsBuilder_ == null
            ? parents_
            : parentsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.children_ = childrenBuilder_ == null
            ? children_
            : childrenBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.Family) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.Family)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.Family other) {
      if (other == com.tcn.cloud.api.api.v0alpha.Family.getDefaultInstance()) return this;
      if (other.getClientSid() != 0L) {
        setClientSid(other.getClientSid());
      }
      if (!other.getClientName().isEmpty()) {
        clientName_ = other.clientName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasParents()) {
        mergeParents(other.getParents());
      }
      if (other.hasChildren()) {
        mergeChildren(other.getChildren());
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
              clientSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              clientName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getParentsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getChildrenFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private long clientSid_ ;
    /**
     * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
     * @return The clientSid.
     */
    @java.lang.Override
    public long getClientSid() {
      return clientSid_;
    }
    /**
     * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
     * @param value The clientSid to set.
     * @return This builder for chaining.
     */
    public Builder setClientSid(long value) {

      clientSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      clientSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object clientName_ = "";
    /**
     * <code>string client_name = 2 [json_name = "clientName"];</code>
     * @return The clientName.
     */
    public java.lang.String getClientName() {
      java.lang.Object ref = clientName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string client_name = 2 [json_name = "clientName"];</code>
     * @return The bytes for clientName.
     */
    public com.google.protobuf.ByteString
        getClientNameBytes() {
      java.lang.Object ref = clientName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client_name = 2 [json_name = "clientName"];</code>
     * @param value The clientName to set.
     * @return This builder for chaining.
     */
    public Builder setClientName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string client_name = 2 [json_name = "clientName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientName() {
      clientName_ = getDefaultInstance().getClientName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string client_name = 2 [json_name = "clientName"];</code>
     * @param value The bytes for clientName to set.
     * @return This builder for chaining.
     */
    public Builder setClientNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.Relations parents_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder> parentsBuilder_;
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     * @return Whether the parents field is set.
     */
    public boolean hasParents() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     * @return The parents.
     */
    public com.tcn.cloud.api.api.v0alpha.Relations getParents() {
      if (parentsBuilder_ == null) {
        return parents_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : parents_;
      } else {
        return parentsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     */
    public Builder setParents(com.tcn.cloud.api.api.v0alpha.Relations value) {
      if (parentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parents_ = value;
      } else {
        parentsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     */
    public Builder setParents(
        com.tcn.cloud.api.api.v0alpha.Relations.Builder builderForValue) {
      if (parentsBuilder_ == null) {
        parents_ = builderForValue.build();
      } else {
        parentsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     */
    public Builder mergeParents(com.tcn.cloud.api.api.v0alpha.Relations value) {
      if (parentsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          parents_ != null &&
          parents_ != com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance()) {
          getParentsBuilder().mergeFrom(value);
        } else {
          parents_ = value;
        }
      } else {
        parentsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     */
    public Builder clearParents() {
      bitField0_ = (bitField0_ & ~0x00000004);
      parents_ = null;
      if (parentsBuilder_ != null) {
        parentsBuilder_.dispose();
        parentsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Relations.Builder getParentsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getParentsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getParentsOrBuilder() {
      if (parentsBuilder_ != null) {
        return parentsBuilder_.getMessageOrBuilder();
      } else {
        return parents_ == null ?
            com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : parents_;
      }
    }
    /**
     * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder> 
        getParentsFieldBuilder() {
      if (parentsBuilder_ == null) {
        parentsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder>(
                getParents(),
                getParentForChildren(),
                isClean());
        parents_ = null;
      }
      return parentsBuilder_;
    }

    private com.tcn.cloud.api.api.v0alpha.Relations children_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder> childrenBuilder_;
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     * @return Whether the children field is set.
     */
    public boolean hasChildren() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     * @return The children.
     */
    public com.tcn.cloud.api.api.v0alpha.Relations getChildren() {
      if (childrenBuilder_ == null) {
        return children_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : children_;
      } else {
        return childrenBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     */
    public Builder setChildren(com.tcn.cloud.api.api.v0alpha.Relations value) {
      if (childrenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        children_ = value;
      } else {
        childrenBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     */
    public Builder setChildren(
        com.tcn.cloud.api.api.v0alpha.Relations.Builder builderForValue) {
      if (childrenBuilder_ == null) {
        children_ = builderForValue.build();
      } else {
        childrenBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     */
    public Builder mergeChildren(com.tcn.cloud.api.api.v0alpha.Relations value) {
      if (childrenBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          children_ != null &&
          children_ != com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance()) {
          getChildrenBuilder().mergeFrom(value);
        } else {
          children_ = value;
        }
      } else {
        childrenBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     */
    public Builder clearChildren() {
      bitField0_ = (bitField0_ & ~0x00000008);
      children_ = null;
      if (childrenBuilder_ != null) {
        childrenBuilder_.dispose();
        childrenBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Relations.Builder getChildrenBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getChildrenFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getChildrenOrBuilder() {
      if (childrenBuilder_ != null) {
        return childrenBuilder_.getMessageOrBuilder();
      } else {
        return children_ == null ?
            com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : children_;
      }
    }
    /**
     * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder> 
        getChildrenFieldBuilder() {
      if (childrenBuilder_ == null) {
        childrenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder>(
                getChildren(),
                getParentForChildren(),
                isClean());
        children_ = null;
      }
      return childrenBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.Family)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.Family)
  private static final com.tcn.cloud.api.api.v0alpha.Family DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.Family();
  }

  public static com.tcn.cloud.api.api.v0alpha.Family getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Family>
      PARSER = new com.google.protobuf.AbstractParser<Family>() {
    @java.lang.Override
    public Family parsePartialFrom(
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

  public static com.google.protobuf.Parser<Family> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Family> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Family getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

