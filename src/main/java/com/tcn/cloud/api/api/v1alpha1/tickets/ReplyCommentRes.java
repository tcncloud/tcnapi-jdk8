// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * ReplyCommentRes - Reply Comment Response Messages
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.ReplyCommentRes}
 */
public final class ReplyCommentRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.ReplyCommentRes)
    ReplyCommentResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReplyCommentRes.newBuilder() to construct.
  private ReplyCommentRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReplyCommentRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReplyCommentRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ReplyCommentRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ReplyCommentRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.class, com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.Builder.class);
  }

  public static final int IS_CREATED_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.ConfirmReplyComment isCreated_;
  /**
   * <pre>
   * Returns boolen true OR False in the response
   * </pre>
   *
   * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
   * @return Whether the isCreated field is set.
   */
  @java.lang.Override
  public boolean hasIsCreated() {
    return isCreated_ != null;
  }
  /**
   * <pre>
   * Returns boolen true OR False in the response
   * </pre>
   *
   * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
   * @return The isCreated.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ConfirmReplyComment getIsCreated() {
    return isCreated_ == null ? com.tcn.cloud.api.api.commons.ConfirmReplyComment.getDefaultInstance() : isCreated_;
  }
  /**
   * <pre>
   * Returns boolen true OR False in the response
   * </pre>
   *
   * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ConfirmReplyCommentOrBuilder getIsCreatedOrBuilder() {
    return isCreated_ == null ? com.tcn.cloud.api.api.commons.ConfirmReplyComment.getDefaultInstance() : isCreated_;
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
    if (isCreated_ != null) {
      output.writeMessage(1, getIsCreated());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isCreated_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getIsCreated());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes other = (com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes) obj;

    if (hasIsCreated() != other.hasIsCreated()) return false;
    if (hasIsCreated()) {
      if (!getIsCreated()
          .equals(other.getIsCreated())) return false;
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
    if (hasIsCreated()) {
      hash = (37 * hash) + IS_CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getIsCreated().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes prototype) {
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
   * ReplyCommentRes - Reply Comment Response Messages
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.ReplyCommentRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.ReplyCommentRes)
      com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ReplyCommentRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ReplyCommentRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.class, com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.newBuilder()
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
      isCreated_ = null;
      if (isCreatedBuilder_ != null) {
        isCreatedBuilder_.dispose();
        isCreatedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ReplyCommentRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes result = new com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isCreated_ = isCreatedBuilder_ == null
            ? isCreated_
            : isCreatedBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.getDefaultInstance()) return this;
      if (other.hasIsCreated()) {
        mergeIsCreated(other.getIsCreated());
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
                  getIsCreatedFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.ConfirmReplyComment isCreated_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ConfirmReplyComment, com.tcn.cloud.api.api.commons.ConfirmReplyComment.Builder, com.tcn.cloud.api.api.commons.ConfirmReplyCommentOrBuilder> isCreatedBuilder_;
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     * @return Whether the isCreated field is set.
     */
    public boolean hasIsCreated() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     * @return The isCreated.
     */
    public com.tcn.cloud.api.api.commons.ConfirmReplyComment getIsCreated() {
      if (isCreatedBuilder_ == null) {
        return isCreated_ == null ? com.tcn.cloud.api.api.commons.ConfirmReplyComment.getDefaultInstance() : isCreated_;
      } else {
        return isCreatedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     */
    public Builder setIsCreated(com.tcn.cloud.api.api.commons.ConfirmReplyComment value) {
      if (isCreatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        isCreated_ = value;
      } else {
        isCreatedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     */
    public Builder setIsCreated(
        com.tcn.cloud.api.api.commons.ConfirmReplyComment.Builder builderForValue) {
      if (isCreatedBuilder_ == null) {
        isCreated_ = builderForValue.build();
      } else {
        isCreatedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     */
    public Builder mergeIsCreated(com.tcn.cloud.api.api.commons.ConfirmReplyComment value) {
      if (isCreatedBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          isCreated_ != null &&
          isCreated_ != com.tcn.cloud.api.api.commons.ConfirmReplyComment.getDefaultInstance()) {
          getIsCreatedBuilder().mergeFrom(value);
        } else {
          isCreated_ = value;
        }
      } else {
        isCreatedBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     */
    public Builder clearIsCreated() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isCreated_ = null;
      if (isCreatedBuilder_ != null) {
        isCreatedBuilder_.dispose();
        isCreatedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     */
    public com.tcn.cloud.api.api.commons.ConfirmReplyComment.Builder getIsCreatedBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIsCreatedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     */
    public com.tcn.cloud.api.api.commons.ConfirmReplyCommentOrBuilder getIsCreatedOrBuilder() {
      if (isCreatedBuilder_ != null) {
        return isCreatedBuilder_.getMessageOrBuilder();
      } else {
        return isCreated_ == null ?
            com.tcn.cloud.api.api.commons.ConfirmReplyComment.getDefaultInstance() : isCreated_;
      }
    }
    /**
     * <pre>
     * Returns boolen true OR False in the response
     * </pre>
     *
     * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ConfirmReplyComment, com.tcn.cloud.api.api.commons.ConfirmReplyComment.Builder, com.tcn.cloud.api.api.commons.ConfirmReplyCommentOrBuilder> 
        getIsCreatedFieldBuilder() {
      if (isCreatedBuilder_ == null) {
        isCreatedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.ConfirmReplyComment, com.tcn.cloud.api.api.commons.ConfirmReplyComment.Builder, com.tcn.cloud.api.api.commons.ConfirmReplyCommentOrBuilder>(
                getIsCreated(),
                getParentForChildren(),
                isClean());
        isCreated_ = null;
      }
      return isCreatedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.ReplyCommentRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.ReplyCommentRes)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReplyCommentRes>
      PARSER = new com.google.protobuf.AbstractParser<ReplyCommentRes>() {
    @java.lang.Override
    public ReplyCommentRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReplyCommentRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReplyCommentRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

