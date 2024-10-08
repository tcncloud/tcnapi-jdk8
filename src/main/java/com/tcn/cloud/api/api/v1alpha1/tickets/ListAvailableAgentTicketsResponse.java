// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * ListAvailableAgentTicketsResponse -
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.ListAvailableAgentTicketsResponse}
 */
public final class ListAvailableAgentTicketsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.ListAvailableAgentTicketsResponse)
    ListAvailableAgentTicketsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAvailableAgentTicketsResponse.newBuilder() to construct.
  private ListAvailableAgentTicketsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAvailableAgentTicketsResponse() {
    ticketSid_ = emptyLongList();
    ticket_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAvailableAgentTicketsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.class, com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.Builder.class);
  }

  public static final int TICKET_SID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList ticketSid_;
  /**
   * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=165
   * @return A list containing the ticketSid.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.util.List<java.lang.Long>
      getTicketSidList() {
    return ticketSid_;
  }
  /**
   * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=165
   * @return The count of ticketSid.
   */
  @java.lang.Deprecated public int getTicketSidCount() {
    return ticketSid_.size();
  }
  /**
   * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=165
   * @param index The index of the element to return.
   * @return The ticketSid at the given index.
   */
  @java.lang.Deprecated public long getTicketSid(int index) {
    return ticketSid_.getLong(index);
  }
  private int ticketSidMemoizedSerializedSize = -1;

  public static final int TICKET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.Ticket> ticket_;
  /**
   * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.Ticket> getTicketList() {
    return ticket_;
  }
  /**
   * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.TicketOrBuilder> 
      getTicketOrBuilderList() {
    return ticket_;
  }
  /**
   * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
   */
  @java.lang.Override
  public int getTicketCount() {
    return ticket_.size();
  }
  /**
   * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Ticket getTicket(int index) {
    return ticket_.get(index);
  }
  /**
   * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.TicketOrBuilder getTicketOrBuilder(
      int index) {
    return ticket_.get(index);
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
    getSerializedSize();
    if (getTicketSidList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(ticketSidMemoizedSerializedSize);
    }
    for (int i = 0; i < ticketSid_.size(); i++) {
      output.writeInt64NoTag(ticketSid_.getLong(i));
    }
    for (int i = 0; i < ticket_.size(); i++) {
      output.writeMessage(2, ticket_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ticketSid_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(ticketSid_.getLong(i));
      }
      size += dataSize;
      if (!getTicketSidList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      ticketSidMemoizedSerializedSize = dataSize;
    }
    for (int i = 0; i < ticket_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, ticket_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse other = (com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse) obj;

    if (!getTicketSidList()
        .equals(other.getTicketSidList())) return false;
    if (!getTicketList()
        .equals(other.getTicketList())) return false;
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
    if (getTicketSidCount() > 0) {
      hash = (37 * hash) + TICKET_SID_FIELD_NUMBER;
      hash = (53 * hash) + getTicketSidList().hashCode();
    }
    if (getTicketCount() > 0) {
      hash = (37 * hash) + TICKET_FIELD_NUMBER;
      hash = (53 * hash) + getTicketList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse prototype) {
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
   * ListAvailableAgentTicketsResponse -
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.ListAvailableAgentTicketsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.ListAvailableAgentTicketsResponse)
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.class, com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.newBuilder()
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
      ticketSid_ = emptyLongList();
      if (ticketBuilder_ == null) {
        ticket_ = java.util.Collections.emptyList();
      } else {
        ticket_ = null;
        ticketBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse result = new com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        ticketSid_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ticketSid_ = ticketSid_;
      if (ticketBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          ticket_ = java.util.Collections.unmodifiableList(ticket_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.ticket_ = ticket_;
      } else {
        result.ticket_ = ticketBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.getDefaultInstance()) return this;
      if (!other.ticketSid_.isEmpty()) {
        if (ticketSid_.isEmpty()) {
          ticketSid_ = other.ticketSid_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTicketSidIsMutable();
          ticketSid_.addAll(other.ticketSid_);
        }
        onChanged();
      }
      if (ticketBuilder_ == null) {
        if (!other.ticket_.isEmpty()) {
          if (ticket_.isEmpty()) {
            ticket_ = other.ticket_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTicketIsMutable();
            ticket_.addAll(other.ticket_);
          }
          onChanged();
        }
      } else {
        if (!other.ticket_.isEmpty()) {
          if (ticketBuilder_.isEmpty()) {
            ticketBuilder_.dispose();
            ticketBuilder_ = null;
            ticket_ = other.ticket_;
            bitField0_ = (bitField0_ & ~0x00000002);
            ticketBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTicketFieldBuilder() : null;
          } else {
            ticketBuilder_.addAllMessages(other.ticket_);
          }
        }
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
              long v = input.readInt64();
              ensureTicketSidIsMutable();
              ticketSid_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureTicketSidIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                ticketSid_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.commons.Ticket m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.Ticket.parser(),
                      extensionRegistry);
              if (ticketBuilder_ == null) {
                ensureTicketIsMutable();
                ticket_.add(m);
              } else {
                ticketBuilder_.addMessage(m);
              }
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

    private com.google.protobuf.Internal.LongList ticketSid_ = emptyLongList();
    private void ensureTicketSidIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ticketSid_ = mutableCopy(ticketSid_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=165
     * @return A list containing the ticketSid.
     */
    @java.lang.Deprecated public java.util.List<java.lang.Long>
        getTicketSidList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ticketSid_) : ticketSid_;
    }
    /**
     * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=165
     * @return The count of ticketSid.
     */
    @java.lang.Deprecated public int getTicketSidCount() {
      return ticketSid_.size();
    }
    /**
     * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=165
     * @param index The index of the element to return.
     * @return The ticketSid at the given index.
     */
    @java.lang.Deprecated public long getTicketSid(int index) {
      return ticketSid_.getLong(index);
    }
    /**
     * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=165
     * @param index The index to set the value at.
     * @param value The ticketSid to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setTicketSid(
        int index, long value) {

      ensureTicketSidIsMutable();
      ticketSid_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=165
     * @param value The ticketSid to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addTicketSid(long value) {

      ensureTicketSidIsMutable();
      ticketSid_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=165
     * @param values The ticketSid to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAllTicketSid(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureTicketSidIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ticketSid_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=165
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearTicketSid() {
      ticketSid_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.commons.Ticket> ticket_ =
      java.util.Collections.emptyList();
    private void ensureTicketIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        ticket_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.Ticket>(ticket_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Ticket, com.tcn.cloud.api.api.commons.Ticket.Builder, com.tcn.cloud.api.api.commons.TicketOrBuilder> ticketBuilder_;

    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.Ticket> getTicketList() {
      if (ticketBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ticket_);
      } else {
        return ticketBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public int getTicketCount() {
      if (ticketBuilder_ == null) {
        return ticket_.size();
      } else {
        return ticketBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public com.tcn.cloud.api.api.commons.Ticket getTicket(int index) {
      if (ticketBuilder_ == null) {
        return ticket_.get(index);
      } else {
        return ticketBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder setTicket(
        int index, com.tcn.cloud.api.api.commons.Ticket value) {
      if (ticketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTicketIsMutable();
        ticket_.set(index, value);
        onChanged();
      } else {
        ticketBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder setTicket(
        int index, com.tcn.cloud.api.api.commons.Ticket.Builder builderForValue) {
      if (ticketBuilder_ == null) {
        ensureTicketIsMutable();
        ticket_.set(index, builderForValue.build());
        onChanged();
      } else {
        ticketBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder addTicket(com.tcn.cloud.api.api.commons.Ticket value) {
      if (ticketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTicketIsMutable();
        ticket_.add(value);
        onChanged();
      } else {
        ticketBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder addTicket(
        int index, com.tcn.cloud.api.api.commons.Ticket value) {
      if (ticketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTicketIsMutable();
        ticket_.add(index, value);
        onChanged();
      } else {
        ticketBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder addTicket(
        com.tcn.cloud.api.api.commons.Ticket.Builder builderForValue) {
      if (ticketBuilder_ == null) {
        ensureTicketIsMutable();
        ticket_.add(builderForValue.build());
        onChanged();
      } else {
        ticketBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder addTicket(
        int index, com.tcn.cloud.api.api.commons.Ticket.Builder builderForValue) {
      if (ticketBuilder_ == null) {
        ensureTicketIsMutable();
        ticket_.add(index, builderForValue.build());
        onChanged();
      } else {
        ticketBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder addAllTicket(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.Ticket> values) {
      if (ticketBuilder_ == null) {
        ensureTicketIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ticket_);
        onChanged();
      } else {
        ticketBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder clearTicket() {
      if (ticketBuilder_ == null) {
        ticket_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        ticketBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public Builder removeTicket(int index) {
      if (ticketBuilder_ == null) {
        ensureTicketIsMutable();
        ticket_.remove(index);
        onChanged();
      } else {
        ticketBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public com.tcn.cloud.api.api.commons.Ticket.Builder getTicketBuilder(
        int index) {
      return getTicketFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public com.tcn.cloud.api.api.commons.TicketOrBuilder getTicketOrBuilder(
        int index) {
      if (ticketBuilder_ == null) {
        return ticket_.get(index);  } else {
        return ticketBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.TicketOrBuilder> 
         getTicketOrBuilderList() {
      if (ticketBuilder_ != null) {
        return ticketBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ticket_);
      }
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public com.tcn.cloud.api.api.commons.Ticket.Builder addTicketBuilder() {
      return getTicketFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.Ticket.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public com.tcn.cloud.api.api.commons.Ticket.Builder addTicketBuilder(
        int index) {
      return getTicketFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.Ticket.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.Ticket ticket = 2 [json_name = "ticket"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.Ticket.Builder> 
         getTicketBuilderList() {
      return getTicketFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Ticket, com.tcn.cloud.api.api.commons.Ticket.Builder, com.tcn.cloud.api.api.commons.TicketOrBuilder> 
        getTicketFieldBuilder() {
      if (ticketBuilder_ == null) {
        ticketBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Ticket, com.tcn.cloud.api.api.commons.Ticket.Builder, com.tcn.cloud.api.api.commons.TicketOrBuilder>(
                ticket_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        ticket_ = null;
      }
      return ticketBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.ListAvailableAgentTicketsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.ListAvailableAgentTicketsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAvailableAgentTicketsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListAvailableAgentTicketsResponse>() {
    @java.lang.Override
    public ListAvailableAgentTicketsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAvailableAgentTicketsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAvailableAgentTicketsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

