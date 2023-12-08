// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * EditTicketReq - Request for EditTicketReq
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.EditTicketReq}
 */
@java.lang.Deprecated public final class EditTicketReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.EditTicketReq)
    EditTicketReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditTicketReq.newBuilder() to construct.
  private EditTicketReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditTicketReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditTicketReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditTicketReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditTicketReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.class, com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.Builder.class);
  }

  public static final int TICKET_SID_FIELD_NUMBER = 1;
  private long ticketSid_ = 0L;
  /**
   * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
   * @return The ticketSid.
   */
  @java.lang.Override
  public long getTicketSid() {
    return ticketSid_;
  }

  public static final int EDIT_VALUE_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.EditAttribute editValue_;
  /**
   * <pre>
   * The comment text
   * </pre>
   *
   * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
   * @return Whether the editValue field is set.
   */
  @java.lang.Override
  public boolean hasEditValue() {
    return editValue_ != null;
  }
  /**
   * <pre>
   * The comment text
   * </pre>
   *
   * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
   * @return The editValue.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.EditAttribute getEditValue() {
    return editValue_ == null ? com.tcn.cloud.api.api.commons.EditAttribute.getDefaultInstance() : editValue_;
  }
  /**
   * <pre>
   * The comment text
   * </pre>
   *
   * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.EditAttributeOrBuilder getEditValueOrBuilder() {
    return editValue_ == null ? com.tcn.cloud.api.api.commons.EditAttribute.getDefaultInstance() : editValue_;
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
    if (editValue_ != null) {
      output.writeMessage(2, getEditValue());
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
    if (editValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEditValue());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq other = (com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq) obj;

    if (getTicketSid()
        != other.getTicketSid()) return false;
    if (hasEditValue() != other.hasEditValue()) return false;
    if (hasEditValue()) {
      if (!getEditValue()
          .equals(other.getEditValue())) return false;
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
    hash = (37 * hash) + TICKET_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTicketSid());
    if (hasEditValue()) {
      hash = (37 * hash) + EDIT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getEditValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq prototype) {
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
   * EditTicketReq - Request for EditTicketReq
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.EditTicketReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.EditTicketReq)
      com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditTicketReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditTicketReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.class, com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.newBuilder()
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
      editValue_ = null;
      if (editValueBuilder_ != null) {
        editValueBuilder_.dispose();
        editValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditTicketReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq result = new com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketSid_ = ticketSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.editValue_ = editValueBuilder_ == null
            ? editValue_
            : editValueBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.getDefaultInstance()) return this;
      if (other.getTicketSid() != 0L) {
        setTicketSid(other.getTicketSid());
      }
      if (other.hasEditValue()) {
        mergeEditValue(other.getEditValue());
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
              input.readMessage(
                  getEditValueFieldBuilder().getBuilder(),
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

    private long ticketSid_ ;
    /**
     * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
     * @return The ticketSid.
     */
    @java.lang.Override
    public long getTicketSid() {
      return ticketSid_;
    }
    /**
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
     * <code>int64 ticket_sid = 1 [json_name = "ticketSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ticketSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.EditAttribute editValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.EditAttribute, com.tcn.cloud.api.api.commons.EditAttribute.Builder, com.tcn.cloud.api.api.commons.EditAttributeOrBuilder> editValueBuilder_;
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     * @return Whether the editValue field is set.
     */
    public boolean hasEditValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     * @return The editValue.
     */
    public com.tcn.cloud.api.api.commons.EditAttribute getEditValue() {
      if (editValueBuilder_ == null) {
        return editValue_ == null ? com.tcn.cloud.api.api.commons.EditAttribute.getDefaultInstance() : editValue_;
      } else {
        return editValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     */
    public Builder setEditValue(com.tcn.cloud.api.api.commons.EditAttribute value) {
      if (editValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        editValue_ = value;
      } else {
        editValueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     */
    public Builder setEditValue(
        com.tcn.cloud.api.api.commons.EditAttribute.Builder builderForValue) {
      if (editValueBuilder_ == null) {
        editValue_ = builderForValue.build();
      } else {
        editValueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     */
    public Builder mergeEditValue(com.tcn.cloud.api.api.commons.EditAttribute value) {
      if (editValueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          editValue_ != null &&
          editValue_ != com.tcn.cloud.api.api.commons.EditAttribute.getDefaultInstance()) {
          getEditValueBuilder().mergeFrom(value);
        } else {
          editValue_ = value;
        }
      } else {
        editValueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     */
    public Builder clearEditValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      editValue_ = null;
      if (editValueBuilder_ != null) {
        editValueBuilder_.dispose();
        editValueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.EditAttribute.Builder getEditValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEditValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.EditAttributeOrBuilder getEditValueOrBuilder() {
      if (editValueBuilder_ != null) {
        return editValueBuilder_.getMessageOrBuilder();
      } else {
        return editValue_ == null ?
            com.tcn.cloud.api.api.commons.EditAttribute.getDefaultInstance() : editValue_;
      }
    }
    /**
     * <pre>
     * The comment text
     * </pre>
     *
     * <code>.api.commons.EditAttribute edit_value = 2 [json_name = "editValue"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.EditAttribute, com.tcn.cloud.api.api.commons.EditAttribute.Builder, com.tcn.cloud.api.api.commons.EditAttributeOrBuilder> 
        getEditValueFieldBuilder() {
      if (editValueBuilder_ == null) {
        editValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.EditAttribute, com.tcn.cloud.api.api.commons.EditAttribute.Builder, com.tcn.cloud.api.api.commons.EditAttributeOrBuilder>(
                getEditValue(),
                getParentForChildren(),
                isClean());
        editValue_ = null;
      }
      return editValueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.EditTicketReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.EditTicketReq)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditTicketReq>
      PARSER = new com.google.protobuf.AbstractParser<EditTicketReq>() {
    @java.lang.Override
    public EditTicketReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<EditTicketReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditTicketReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

