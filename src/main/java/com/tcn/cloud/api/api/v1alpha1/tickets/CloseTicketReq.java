// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * CloseTicketReq - Close Ticket Request Messages
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.CloseTicketReq}
 */
public final class CloseTicketReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.CloseTicketReq)
    CloseTicketReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloseTicketReq.newBuilder() to construct.
  private CloseTicketReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloseTicketReq() {
    comment_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloseTicketReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.class, com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.Builder.class);
  }

  public static final int TICKET_SID_FIELD_NUMBER = 1;
  private long ticketSid_ = 0L;
  /**
   * <pre>
   * ticket Id of the ticket which needs to be closed
   * </pre>
   *
   * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
   * @return The ticketSid.
   */
  @java.lang.Override
  public long getTicketSid() {
    return ticketSid_;
  }

  public static final int COMMENT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object comment_ = "";
  /**
   * <pre>
   * description of the comment
   * </pre>
   *
   * <code>string comment = 2 [json_name = "comment"];</code>
   * @return The comment.
   */
  @java.lang.Override
  public java.lang.String getComment() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comment_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * description of the comment
   * </pre>
   *
   * <code>string comment = 2 [json_name = "comment"];</code>
   * @return The bytes for comment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommentBytes() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      comment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FROM_STATUS_FIELD_NUMBER = 3;
  private long fromStatus_ = 0L;
  /**
   * <pre>
   * from status of the ticket
   * </pre>
   *
   * <code>int64 from_status = 3 [json_name = "fromStatus", jstype = JS_STRING];</code>
   * @return The fromStatus.
   */
  @java.lang.Override
  public long getFromStatus() {
    return fromStatus_;
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
    if (ticketSid_ != 0L) {
      output.writeInt64(1, ticketSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, comment_);
    }
    if (fromStatus_ != 0L) {
      output.writeInt64(3, fromStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ticketSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, ticketSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, comment_);
    }
    if (fromStatus_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, fromStatus_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq other = (com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq) obj;

    if (getTicketSid()
        != other.getTicketSid()) return false;
    if (!getComment()
        .equals(other.getComment())) return false;
    if (getFromStatus()
        != other.getFromStatus()) return false;
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
    hash = (37 * hash) + TICKET_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTicketSid());
    hash = (37 * hash) + COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getComment().hashCode();
    hash = (37 * hash) + FROM_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFromStatus());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq prototype) {
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
   * CloseTicketReq - Close Ticket Request Messages
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.CloseTicketReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.CloseTicketReq)
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.class, com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.newBuilder()
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
      ticketSid_ = 0L;
      comment_ = "";
      fromStatus_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq result = new com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketSid_ = ticketSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.comment_ = comment_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fromStatus_ = fromStatus_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.getDefaultInstance()) return this;
      if (other.getTicketSid() != 0L) {
        setTicketSid(other.getTicketSid());
      }
      if (!other.getComment().isEmpty()) {
        comment_ = other.comment_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getFromStatus() != 0L) {
        setFromStatus(other.getFromStatus());
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
              ticketSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              comment_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              fromStatus_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private long ticketSid_ ;
    /**
     * <pre>
     * ticket Id of the ticket which needs to be closed
     * </pre>
     *
     * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
     * @return The ticketSid.
     */
    @java.lang.Override
    public long getTicketSid() {
      return ticketSid_;
    }
    /**
     * <pre>
     * ticket Id of the ticket which needs to be closed
     * </pre>
     *
     * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
     * @param value The ticketSid to set.
     * @return This builder for chaining.
     */
    public Builder setTicketSid(long value) {

      ticketSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ticket Id of the ticket which needs to be closed
     * </pre>
     *
     * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ticketSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object comment_ = "";
    /**
     * <pre>
     * description of the comment
     * </pre>
     *
     * <code>string comment = 2 [json_name = "comment"];</code>
     * @return The comment.
     */
    public java.lang.String getComment() {
      java.lang.Object ref = comment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * description of the comment
     * </pre>
     *
     * <code>string comment = 2 [json_name = "comment"];</code>
     * @return The bytes for comment.
     */
    public com.google.protobuf.ByteString
        getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * description of the comment
     * </pre>
     *
     * <code>string comment = 2 [json_name = "comment"];</code>
     * @param value The comment to set.
     * @return This builder for chaining.
     */
    public Builder setComment(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      comment_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * description of the comment
     * </pre>
     *
     * <code>string comment = 2 [json_name = "comment"];</code>
     * @return This builder for chaining.
     */
    public Builder clearComment() {
      comment_ = getDefaultInstance().getComment();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * description of the comment
     * </pre>
     *
     * <code>string comment = 2 [json_name = "comment"];</code>
     * @param value The bytes for comment to set.
     * @return This builder for chaining.
     */
    public Builder setCommentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      comment_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long fromStatus_ ;
    /**
     * <pre>
     * from status of the ticket
     * </pre>
     *
     * <code>int64 from_status = 3 [json_name = "fromStatus", jstype = JS_STRING];</code>
     * @return The fromStatus.
     */
    @java.lang.Override
    public long getFromStatus() {
      return fromStatus_;
    }
    /**
     * <pre>
     * from status of the ticket
     * </pre>
     *
     * <code>int64 from_status = 3 [json_name = "fromStatus", jstype = JS_STRING];</code>
     * @param value The fromStatus to set.
     * @return This builder for chaining.
     */
    public Builder setFromStatus(long value) {

      fromStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * from status of the ticket
     * </pre>
     *
     * <code>int64 from_status = 3 [json_name = "fromStatus", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearFromStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      fromStatus_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.CloseTicketReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.CloseTicketReq)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloseTicketReq>
      PARSER = new com.google.protobuf.AbstractParser<CloseTicketReq>() {
    @java.lang.Override
    public CloseTicketReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloseTicketReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloseTicketReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

