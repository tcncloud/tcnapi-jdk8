// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * Protobuf type {@code api.v1alpha1.tickets.ChangeTicketStatusRequest}
 */
public final class ChangeTicketStatusRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.ChangeTicketStatusRequest)
    ChangeTicketStatusRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeTicketStatusRequest.newBuilder() to construct.
  private ChangeTicketStatusRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeTicketStatusRequest() {
    ticketStatus_ = 0;
    ticketCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangeTicketStatusRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ChangeTicketStatusRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ChangeTicketStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.Builder.class);
  }

  public static final int TICKET_ID_FIELD_NUMBER = 1;
  private long ticketId_ = 0L;
  /**
   * <code>int64 ticket_id = 1 [json_name = "ticketId", deprecated = true, jstype = JS_STRING];</code>
   * @deprecated api.v1alpha1.tickets.ChangeTicketStatusRequest.ticket_id is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=424
   * @return The ticketId.
   */
  @java.lang.Override
  @java.lang.Deprecated public long getTicketId() {
    return ticketId_;
  }

  public static final int STATUS_ID_FIELD_NUMBER = 2;
  private long statusId_ = 0L;
  /**
   * <code>int64 status_id = 2 [json_name = "statusId", jstype = JS_STRING];</code>
   * @return The statusId.
   */
  @java.lang.Override
  public long getStatusId() {
    return statusId_;
  }

  public static final int TICKET_STATUS_FIELD_NUMBER = 3;
  private int ticketStatus_ = 0;
  /**
   * <code>.api.commons.TicketStatus ticket_status = 3 [json_name = "ticketStatus"];</code>
   * @return The enum numeric value on the wire for ticketStatus.
   */
  @java.lang.Override public int getTicketStatusValue() {
    return ticketStatus_;
  }
  /**
   * <code>.api.commons.TicketStatus ticket_status = 3 [json_name = "ticketStatus"];</code>
   * @return The ticketStatus.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.TicketStatus getTicketStatus() {
    com.tcn.cloud.api.api.commons.TicketStatus result = com.tcn.cloud.api.api.commons.TicketStatus.forNumber(ticketStatus_);
    return result == null ? com.tcn.cloud.api.api.commons.TicketStatus.UNRECOGNIZED : result;
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
    if (ticketId_ != 0L) {
      output.writeInt64(1, ticketId_);
    }
    if (statusId_ != 0L) {
      output.writeInt64(2, statusId_);
    }
    if (ticketStatus_ != com.tcn.cloud.api.api.commons.TicketStatus.TICKET_STATUS_NEW.getNumber()) {
      output.writeEnum(3, ticketStatus_);
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
    if (ticketId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, ticketId_);
    }
    if (statusId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, statusId_);
    }
    if (ticketStatus_ != com.tcn.cloud.api.api.commons.TicketStatus.TICKET_STATUS_NEW.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ticketStatus_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest other = (com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest) obj;

    if (getTicketId()
        != other.getTicketId()) return false;
    if (getStatusId()
        != other.getStatusId()) return false;
    if (ticketStatus_ != other.ticketStatus_) return false;
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
    hash = (37 * hash) + TICKET_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTicketId());
    hash = (37 * hash) + STATUS_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStatusId());
    hash = (37 * hash) + TICKET_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + ticketStatus_;
    hash = (37 * hash) + TICKET_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getTicketCode().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest prototype) {
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
   * Protobuf type {@code api.v1alpha1.tickets.ChangeTicketStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.ChangeTicketStatusRequest)
      com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ChangeTicketStatusRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ChangeTicketStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.newBuilder()
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
      ticketId_ = 0L;
      statusId_ = 0L;
      ticketStatus_ = 0;
      ticketCode_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ChangeTicketStatusRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest result = new com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketId_ = ticketId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.statusId_ = statusId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ticketStatus_ = ticketStatus_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.getDefaultInstance()) return this;
      if (other.getTicketId() != 0L) {
        setTicketId(other.getTicketId());
      }
      if (other.getStatusId() != 0L) {
        setStatusId(other.getStatusId());
      }
      if (other.ticketStatus_ != 0) {
        setTicketStatusValue(other.getTicketStatusValue());
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
              ticketId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              statusId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              ticketStatus_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private long ticketId_ ;
    /**
     * <code>int64 ticket_id = 1 [json_name = "ticketId", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ChangeTicketStatusRequest.ticket_id is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=424
     * @return The ticketId.
     */
    @java.lang.Override
    @java.lang.Deprecated public long getTicketId() {
      return ticketId_;
    }
    /**
     * <code>int64 ticket_id = 1 [json_name = "ticketId", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ChangeTicketStatusRequest.ticket_id is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=424
     * @param value The ticketId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setTicketId(long value) {

      ticketId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 ticket_id = 1 [json_name = "ticketId", deprecated = true, jstype = JS_STRING];</code>
     * @deprecated api.v1alpha1.tickets.ChangeTicketStatusRequest.ticket_id is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=424
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearTicketId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ticketId_ = 0L;
      onChanged();
      return this;
    }

    private long statusId_ ;
    /**
     * <code>int64 status_id = 2 [json_name = "statusId", jstype = JS_STRING];</code>
     * @return The statusId.
     */
    @java.lang.Override
    public long getStatusId() {
      return statusId_;
    }
    /**
     * <code>int64 status_id = 2 [json_name = "statusId", jstype = JS_STRING];</code>
     * @param value The statusId to set.
     * @return This builder for chaining.
     */
    public Builder setStatusId(long value) {

      statusId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 status_id = 2 [json_name = "statusId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatusId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      statusId_ = 0L;
      onChanged();
      return this;
    }

    private int ticketStatus_ = 0;
    /**
     * <code>.api.commons.TicketStatus ticket_status = 3 [json_name = "ticketStatus"];</code>
     * @return The enum numeric value on the wire for ticketStatus.
     */
    @java.lang.Override public int getTicketStatusValue() {
      return ticketStatus_;
    }
    /**
     * <code>.api.commons.TicketStatus ticket_status = 3 [json_name = "ticketStatus"];</code>
     * @param value The enum numeric value on the wire for ticketStatus to set.
     * @return This builder for chaining.
     */
    public Builder setTicketStatusValue(int value) {
      ticketStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TicketStatus ticket_status = 3 [json_name = "ticketStatus"];</code>
     * @return The ticketStatus.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TicketStatus getTicketStatus() {
      com.tcn.cloud.api.api.commons.TicketStatus result = com.tcn.cloud.api.api.commons.TicketStatus.forNumber(ticketStatus_);
      return result == null ? com.tcn.cloud.api.api.commons.TicketStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.TicketStatus ticket_status = 3 [json_name = "ticketStatus"];</code>
     * @param value The ticketStatus to set.
     * @return This builder for chaining.
     */
    public Builder setTicketStatus(com.tcn.cloud.api.api.commons.TicketStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      ticketStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TicketStatus ticket_status = 3 [json_name = "ticketStatus"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ticketStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.ChangeTicketStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.ChangeTicketStatusRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeTicketStatusRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChangeTicketStatusRequest>() {
    @java.lang.Override
    public ChangeTicketStatusRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChangeTicketStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeTicketStatusRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

