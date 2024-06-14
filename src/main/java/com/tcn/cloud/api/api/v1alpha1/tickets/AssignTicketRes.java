// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * AssignTicketRes
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.AssignTicketRes}
 */
public final class AssignTicketRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.AssignTicketRes)
    AssignTicketResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignTicketRes.newBuilder() to construct.
  private AssignTicketRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignTicketRes() {
    assigneeList_ = "";
    assignedId_ = "";
    ticketCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignTicketRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_AssignTicketRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_AssignTicketRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.class, com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.Builder.class);
  }

  public static final int TICKET_SID_FIELD_NUMBER = 1;
  private long ticketSid_ = 0L;
  /**
   * <code>int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.v1alpha1.tickets.AssignTicketRes.ticket_sid is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=213
   * @return The ticketSid.
   */
  @java.lang.Override
  @java.lang.Deprecated public long getTicketSid() {
    return ticketSid_;
  }

  public static final int ASSIGNEE_LIST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object assigneeList_ = "";
  /**
   * <code>string assignee_list = 2 [json_name = "assigneeList"];</code>
   * @return The assigneeList.
   */
  @java.lang.Override
  public java.lang.String getAssigneeList() {
    java.lang.Object ref = assigneeList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assigneeList_ = s;
      return s;
    }
  }
  /**
   * <code>string assignee_list = 2 [json_name = "assigneeList"];</code>
   * @return The bytes for assigneeList.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssigneeListBytes() {
    java.lang.Object ref = assigneeList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assigneeList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSIGNED_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object assignedId_ = "";
  /**
   * <code>string assigned_id = 3 [json_name = "assignedId"];</code>
   * @return The assignedId.
   */
  @java.lang.Override
  public java.lang.String getAssignedId() {
    java.lang.Object ref = assignedId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assignedId_ = s;
      return s;
    }
  }
  /**
   * <code>string assigned_id = 3 [json_name = "assignedId"];</code>
   * @return The bytes for assignedId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssignedIdBytes() {
    java.lang.Object ref = assignedId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assignedId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TICKET_CODE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ticketCode_ = "";
  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
   * @return The ticketCode.
   */
  @java.lang.Override
  public java.lang.String getTicketCode() {
    java.lang.Object ref = ticketCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ticketCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
   * @return The bytes for ticketCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTicketCodeBytes() {
    java.lang.Object ref = ticketCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ticketCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assigneeList_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assigneeList_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assignedId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, assignedId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ticketCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ticketCode_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assigneeList_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assigneeList_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assignedId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, assignedId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ticketCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, ticketCode_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes other = (com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes) obj;

    if (getTicketSid()
        != other.getTicketSid()) return false;
    if (!getAssigneeList()
        .equals(other.getAssigneeList())) return false;
    if (!getAssignedId()
        .equals(other.getAssignedId())) return false;
    if (!getTicketCode()
        .equals(other.getTicketCode())) return false;
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
    hash = (37 * hash) + ASSIGNEE_LIST_FIELD_NUMBER;
    hash = (53 * hash) + getAssigneeList().hashCode();
    hash = (37 * hash) + ASSIGNED_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAssignedId().hashCode();
    hash = (37 * hash) + TICKET_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getTicketCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes prototype) {
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
   * AssignTicketRes
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.AssignTicketRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.AssignTicketRes)
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_AssignTicketRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_AssignTicketRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.class, com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.newBuilder()
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
      assigneeList_ = "";
      assignedId_ = "";
      ticketCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_AssignTicketRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes result = new com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketSid_ = ticketSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assigneeList_ = assigneeList_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.assignedId_ = assignedId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.ticketCode_ = ticketCode_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.getDefaultInstance()) return this;
      if (other.getTicketSid() != 0L) {
        setTicketSid(other.getTicketSid());
      }
      if (!other.getAssigneeList().isEmpty()) {
        assigneeList_ = other.assigneeList_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAssignedId().isEmpty()) {
        assignedId_ = other.assignedId_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getTicketCode().isEmpty()) {
        ticketCode_ = other.ticketCode_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              assigneeList_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              assignedId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              ticketCode_ = input.readStringRequireUtf8();
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

    private long ticketSid_ ;
    /**
     * <code>int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.AssignTicketRes.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=213
     * @return The ticketSid.
     */
    @java.lang.Override
    @java.lang.Deprecated public long getTicketSid() {
      return ticketSid_;
    }
    /**
     * <code>int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.AssignTicketRes.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=213
     * @param value The ticketSid to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setTicketSid(long value) {

      ticketSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ticket_sid = 1 [json_name = "ticketSid", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.AssignTicketRes.ticket_sid is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=213
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearTicketSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ticketSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object assigneeList_ = "";
    /**
     * <code>string assignee_list = 2 [json_name = "assigneeList"];</code>
     * @return The assigneeList.
     */
    public java.lang.String getAssigneeList() {
      java.lang.Object ref = assigneeList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assigneeList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string assignee_list = 2 [json_name = "assigneeList"];</code>
     * @return The bytes for assigneeList.
     */
    public com.google.protobuf.ByteString
        getAssigneeListBytes() {
      java.lang.Object ref = assigneeList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assigneeList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string assignee_list = 2 [json_name = "assigneeList"];</code>
     * @param value The assigneeList to set.
     * @return This builder for chaining.
     */
    public Builder setAssigneeList(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      assigneeList_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string assignee_list = 2 [json_name = "assigneeList"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssigneeList() {
      assigneeList_ = getDefaultInstance().getAssigneeList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string assignee_list = 2 [json_name = "assigneeList"];</code>
     * @param value The bytes for assigneeList to set.
     * @return This builder for chaining.
     */
    public Builder setAssigneeListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      assigneeList_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object assignedId_ = "";
    /**
     * <code>string assigned_id = 3 [json_name = "assignedId"];</code>
     * @return The assignedId.
     */
    public java.lang.String getAssignedId() {
      java.lang.Object ref = assignedId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assignedId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string assigned_id = 3 [json_name = "assignedId"];</code>
     * @return The bytes for assignedId.
     */
    public com.google.protobuf.ByteString
        getAssignedIdBytes() {
      java.lang.Object ref = assignedId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assignedId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string assigned_id = 3 [json_name = "assignedId"];</code>
     * @param value The assignedId to set.
     * @return This builder for chaining.
     */
    public Builder setAssignedId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      assignedId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string assigned_id = 3 [json_name = "assignedId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssignedId() {
      assignedId_ = getDefaultInstance().getAssignedId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string assigned_id = 3 [json_name = "assignedId"];</code>
     * @param value The bytes for assignedId to set.
     * @return This builder for chaining.
     */
    public Builder setAssignedIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      assignedId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object ticketCode_ = "";
    /**
     * <pre>
     * ticket_code
     * </pre>
     *
     * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
     * @return The ticketCode.
     */
    public java.lang.String getTicketCode() {
      java.lang.Object ref = ticketCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ticketCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * ticket_code
     * </pre>
     *
     * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
     * @return The bytes for ticketCode.
     */
    public com.google.protobuf.ByteString
        getTicketCodeBytes() {
      java.lang.Object ref = ticketCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ticketCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * ticket_code
     * </pre>
     *
     * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
     * @param value The ticketCode to set.
     * @return This builder for chaining.
     */
    public Builder setTicketCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ticketCode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ticket_code
     * </pre>
     *
     * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketCode() {
      ticketCode_ = getDefaultInstance().getTicketCode();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ticket_code
     * </pre>
     *
     * <code>string ticket_code = 4 [json_name = "ticketCode"];</code>
     * @param value The bytes for ticketCode to set.
     * @return This builder for chaining.
     */
    public Builder setTicketCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ticketCode_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.AssignTicketRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.AssignTicketRes)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignTicketRes>
      PARSER = new com.google.protobuf.AbstractParser<AssignTicketRes>() {
    @java.lang.Override
    public AssignTicketRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignTicketRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignTicketRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

