// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * EditMaskTicketReq - Request for EditMaskTicket
 * EditTicketReq would be deprecated
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.EditMaskTicketReq}
 */
public final class EditMaskTicketReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.EditMaskTicketReq)
    EditMaskTicketReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditMaskTicketReq.newBuilder() to construct.
  private EditMaskTicketReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditMaskTicketReq() {
    editedFieldsMask_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditMaskTicketReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditMaskTicketReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditMaskTicketReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.class, com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.Builder.class);
  }

  private int bitField0_;
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
  private com.tcn.cloud.api.api.commons.Ticket editValue_;
  /**
   * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
   * @return Whether the editValue field is set.
   */
  @java.lang.Override
  public boolean hasEditValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
   * @return The editValue.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Ticket getEditValue() {
    return editValue_ == null ? com.tcn.cloud.api.api.commons.Ticket.getDefaultInstance() : editValue_;
  }
  /**
   * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.TicketOrBuilder getEditValueOrBuilder() {
    return editValue_ == null ? com.tcn.cloud.api.api.commons.Ticket.getDefaultInstance() : editValue_;
  }

  public static final int EDITED_FIELDS_MASK_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.FieldMask> editedFieldsMask_;
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.FieldMask> getEditedFieldsMaskList() {
    return editedFieldsMask_;
  }
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.FieldMaskOrBuilder> 
      getEditedFieldsMaskOrBuilderList() {
    return editedFieldsMask_;
  }
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  @java.lang.Override
  public int getEditedFieldsMaskCount() {
    return editedFieldsMask_.size();
  }
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getEditedFieldsMask(int index) {
    return editedFieldsMask_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getEditedFieldsMaskOrBuilder(
      int index) {
    return editedFieldsMask_.get(index);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEditValue());
    }
    for (int i = 0; i < editedFieldsMask_.size(); i++) {
      output.writeMessage(3, editedFieldsMask_.get(i));
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEditValue());
    }
    for (int i = 0; i < editedFieldsMask_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, editedFieldsMask_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq other = (com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq) obj;

    if (getTicketSid()
        != other.getTicketSid()) return false;
    if (hasEditValue() != other.hasEditValue()) return false;
    if (hasEditValue()) {
      if (!getEditValue()
          .equals(other.getEditValue())) return false;
    }
    if (!getEditedFieldsMaskList()
        .equals(other.getEditedFieldsMaskList())) return false;
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
    if (getEditedFieldsMaskCount() > 0) {
      hash = (37 * hash) + EDITED_FIELDS_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getEditedFieldsMaskList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq prototype) {
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
   * EditMaskTicketReq - Request for EditMaskTicket
   * EditTicketReq would be deprecated
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.EditMaskTicketReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.EditMaskTicketReq)
      com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditMaskTicketReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditMaskTicketReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.class, com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEditValueFieldBuilder();
        getEditedFieldsMaskFieldBuilder();
      }
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
      if (editedFieldsMaskBuilder_ == null) {
        editedFieldsMask_ = java.util.Collections.emptyList();
      } else {
        editedFieldsMask_ = null;
        editedFieldsMaskBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditMaskTicketReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq result = new com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq result) {
      if (editedFieldsMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          editedFieldsMask_ = java.util.Collections.unmodifiableList(editedFieldsMask_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.editedFieldsMask_ = editedFieldsMask_;
      } else {
        result.editedFieldsMask_ = editedFieldsMaskBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketSid_ = ticketSid_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.editValue_ = editValueBuilder_ == null
            ? editValue_
            : editValueBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.getDefaultInstance()) return this;
      if (other.getTicketSid() != 0L) {
        setTicketSid(other.getTicketSid());
      }
      if (other.hasEditValue()) {
        mergeEditValue(other.getEditValue());
      }
      if (editedFieldsMaskBuilder_ == null) {
        if (!other.editedFieldsMask_.isEmpty()) {
          if (editedFieldsMask_.isEmpty()) {
            editedFieldsMask_ = other.editedFieldsMask_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEditedFieldsMaskIsMutable();
            editedFieldsMask_.addAll(other.editedFieldsMask_);
          }
          onChanged();
        }
      } else {
        if (!other.editedFieldsMask_.isEmpty()) {
          if (editedFieldsMaskBuilder_.isEmpty()) {
            editedFieldsMaskBuilder_.dispose();
            editedFieldsMaskBuilder_ = null;
            editedFieldsMask_ = other.editedFieldsMask_;
            bitField0_ = (bitField0_ & ~0x00000004);
            editedFieldsMaskBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEditedFieldsMaskFieldBuilder() : null;
          } else {
            editedFieldsMaskBuilder_.addAllMessages(other.editedFieldsMask_);
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
            case 26: {
              com.google.protobuf.FieldMask m =
                  input.readMessage(
                      com.google.protobuf.FieldMask.parser(),
                      extensionRegistry);
              if (editedFieldsMaskBuilder_ == null) {
                ensureEditedFieldsMaskIsMutable();
                editedFieldsMask_.add(m);
              } else {
                editedFieldsMaskBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private com.tcn.cloud.api.api.commons.Ticket editValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Ticket, com.tcn.cloud.api.api.commons.Ticket.Builder, com.tcn.cloud.api.api.commons.TicketOrBuilder> editValueBuilder_;
    /**
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
     * @return Whether the editValue field is set.
     */
    public boolean hasEditValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
     * @return The editValue.
     */
    public com.tcn.cloud.api.api.commons.Ticket getEditValue() {
      if (editValueBuilder_ == null) {
        return editValue_ == null ? com.tcn.cloud.api.api.commons.Ticket.getDefaultInstance() : editValue_;
      } else {
        return editValueBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
     */
    public Builder setEditValue(com.tcn.cloud.api.api.commons.Ticket value) {
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
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
     */
    public Builder setEditValue(
        com.tcn.cloud.api.api.commons.Ticket.Builder builderForValue) {
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
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
     */
    public Builder mergeEditValue(com.tcn.cloud.api.api.commons.Ticket value) {
      if (editValueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          editValue_ != null &&
          editValue_ != com.tcn.cloud.api.api.commons.Ticket.getDefaultInstance()) {
          getEditValueBuilder().mergeFrom(value);
        } else {
          editValue_ = value;
        }
      } else {
        editValueBuilder_.mergeFrom(value);
      }
      if (editValue_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
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
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.Ticket.Builder getEditValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEditValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.TicketOrBuilder getEditValueOrBuilder() {
      if (editValueBuilder_ != null) {
        return editValueBuilder_.getMessageOrBuilder();
      } else {
        return editValue_ == null ?
            com.tcn.cloud.api.api.commons.Ticket.getDefaultInstance() : editValue_;
      }
    }
    /**
     * <code>.api.commons.Ticket edit_value = 2 [json_name = "editValue"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Ticket, com.tcn.cloud.api.api.commons.Ticket.Builder, com.tcn.cloud.api.api.commons.TicketOrBuilder> 
        getEditValueFieldBuilder() {
      if (editValueBuilder_ == null) {
        editValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Ticket, com.tcn.cloud.api.api.commons.Ticket.Builder, com.tcn.cloud.api.api.commons.TicketOrBuilder>(
                getEditValue(),
                getParentForChildren(),
                isClean());
        editValue_ = null;
      }
      return editValueBuilder_;
    }

    private java.util.List<com.google.protobuf.FieldMask> editedFieldsMask_ =
      java.util.Collections.emptyList();
    private void ensureEditedFieldsMaskIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        editedFieldsMask_ = new java.util.ArrayList<com.google.protobuf.FieldMask>(editedFieldsMask_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> editedFieldsMaskBuilder_;

    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public java.util.List<com.google.protobuf.FieldMask> getEditedFieldsMaskList() {
      if (editedFieldsMaskBuilder_ == null) {
        return java.util.Collections.unmodifiableList(editedFieldsMask_);
      } else {
        return editedFieldsMaskBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public int getEditedFieldsMaskCount() {
      if (editedFieldsMaskBuilder_ == null) {
        return editedFieldsMask_.size();
      } else {
        return editedFieldsMaskBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public com.google.protobuf.FieldMask getEditedFieldsMask(int index) {
      if (editedFieldsMaskBuilder_ == null) {
        return editedFieldsMask_.get(index);
      } else {
        return editedFieldsMaskBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder setEditedFieldsMask(
        int index, com.google.protobuf.FieldMask value) {
      if (editedFieldsMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditedFieldsMaskIsMutable();
        editedFieldsMask_.set(index, value);
        onChanged();
      } else {
        editedFieldsMaskBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder setEditedFieldsMask(
        int index, com.google.protobuf.FieldMask.Builder builderForValue) {
      if (editedFieldsMaskBuilder_ == null) {
        ensureEditedFieldsMaskIsMutable();
        editedFieldsMask_.set(index, builderForValue.build());
        onChanged();
      } else {
        editedFieldsMaskBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder addEditedFieldsMask(com.google.protobuf.FieldMask value) {
      if (editedFieldsMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditedFieldsMaskIsMutable();
        editedFieldsMask_.add(value);
        onChanged();
      } else {
        editedFieldsMaskBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder addEditedFieldsMask(
        int index, com.google.protobuf.FieldMask value) {
      if (editedFieldsMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditedFieldsMaskIsMutable();
        editedFieldsMask_.add(index, value);
        onChanged();
      } else {
        editedFieldsMaskBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder addEditedFieldsMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (editedFieldsMaskBuilder_ == null) {
        ensureEditedFieldsMaskIsMutable();
        editedFieldsMask_.add(builderForValue.build());
        onChanged();
      } else {
        editedFieldsMaskBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder addEditedFieldsMask(
        int index, com.google.protobuf.FieldMask.Builder builderForValue) {
      if (editedFieldsMaskBuilder_ == null) {
        ensureEditedFieldsMaskIsMutable();
        editedFieldsMask_.add(index, builderForValue.build());
        onChanged();
      } else {
        editedFieldsMaskBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder addAllEditedFieldsMask(
        java.lang.Iterable<? extends com.google.protobuf.FieldMask> values) {
      if (editedFieldsMaskBuilder_ == null) {
        ensureEditedFieldsMaskIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, editedFieldsMask_);
        onChanged();
      } else {
        editedFieldsMaskBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder clearEditedFieldsMask() {
      if (editedFieldsMaskBuilder_ == null) {
        editedFieldsMask_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        editedFieldsMaskBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public Builder removeEditedFieldsMask(int index) {
      if (editedFieldsMaskBuilder_ == null) {
        ensureEditedFieldsMaskIsMutable();
        editedFieldsMask_.remove(index);
        onChanged();
      } else {
        editedFieldsMaskBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getEditedFieldsMaskBuilder(
        int index) {
      return getEditedFieldsMaskFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getEditedFieldsMaskOrBuilder(
        int index) {
      if (editedFieldsMaskBuilder_ == null) {
        return editedFieldsMask_.get(index);  } else {
        return editedFieldsMaskBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public java.util.List<? extends com.google.protobuf.FieldMaskOrBuilder> 
         getEditedFieldsMaskOrBuilderList() {
      if (editedFieldsMaskBuilder_ != null) {
        return editedFieldsMaskBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(editedFieldsMask_);
      }
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder addEditedFieldsMaskBuilder() {
      return getEditedFieldsMaskFieldBuilder().addBuilder(
          com.google.protobuf.FieldMask.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder addEditedFieldsMaskBuilder(
        int index) {
      return getEditedFieldsMaskFieldBuilder().addBuilder(
          index, com.google.protobuf.FieldMask.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.FieldMask edited_fields_mask = 3 [json_name = "editedFieldsMask"];</code>
     */
    public java.util.List<com.google.protobuf.FieldMask.Builder> 
         getEditedFieldsMaskBuilderList() {
      return getEditedFieldsMaskFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getEditedFieldsMaskFieldBuilder() {
      if (editedFieldsMaskBuilder_ == null) {
        editedFieldsMaskBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                editedFieldsMask_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        editedFieldsMask_ = null;
      }
      return editedFieldsMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.EditMaskTicketReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.EditMaskTicketReq)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditMaskTicketReq>
      PARSER = new com.google.protobuf.AbstractParser<EditMaskTicketReq>() {
    @java.lang.Override
    public EditMaskTicketReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<EditMaskTicketReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditMaskTicketReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

