// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * EditCustomFieldRequest -
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.EditCustomFieldRequest}
 */
public final class EditCustomFieldRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.EditCustomFieldRequest)
    EditCustomFieldRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EditCustomFieldRequest.newBuilder() to construct.
  private EditCustomFieldRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EditCustomFieldRequest() {
    ticketCode_ = "";
    editValue_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EditCustomFieldRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditCustomFieldRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditCustomFieldRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.Builder.class);
  }

  public static final int TICKET_CODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ticketCode_ = "";
  /**
   * <pre>
   * ticket_code
   * </pre>
   *
   * <code>string ticket_code = 1 [json_name = "ticketCode"];</code>
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
   * <code>string ticket_code = 1 [json_name = "ticketCode"];</code>
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

  public static final int CUSTOM_FIELD_PROJECT_ID_FIELD_NUMBER = 2;
  private long customFieldProjectId_ = 0L;
  /**
   * <pre>
   * custom_field_project_id
   * </pre>
   *
   * <code>int64 custom_field_project_id = 2 [json_name = "customFieldProjectId", jstype = JS_STRING];</code>
   * @return The customFieldProjectId.
   */
  @java.lang.Override
  public long getCustomFieldProjectId() {
    return customFieldProjectId_;
  }

  public static final int EDIT_VALUE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.CustomField> editValue_;
  /**
   * <pre>
   * repeated custom fields
   * </pre>
   *
   * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.CustomField> getEditValueList() {
    return editValue_;
  }
  /**
   * <pre>
   * repeated custom fields
   * </pre>
   *
   * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.CustomFieldOrBuilder> 
      getEditValueOrBuilderList() {
    return editValue_;
  }
  /**
   * <pre>
   * repeated custom fields
   * </pre>
   *
   * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
   */
  @java.lang.Override
  public int getEditValueCount() {
    return editValue_.size();
  }
  /**
   * <pre>
   * repeated custom fields
   * </pre>
   *
   * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.CustomField getEditValue(int index) {
    return editValue_.get(index);
  }
  /**
   * <pre>
   * repeated custom fields
   * </pre>
   *
   * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.CustomFieldOrBuilder getEditValueOrBuilder(
      int index) {
    return editValue_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ticketCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ticketCode_);
    }
    if (customFieldProjectId_ != 0L) {
      output.writeInt64(2, customFieldProjectId_);
    }
    for (int i = 0; i < editValue_.size(); i++) {
      output.writeMessage(3, editValue_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ticketCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ticketCode_);
    }
    if (customFieldProjectId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, customFieldProjectId_);
    }
    for (int i = 0; i < editValue_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, editValue_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest other = (com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest) obj;

    if (!getTicketCode()
        .equals(other.getTicketCode())) return false;
    if (getCustomFieldProjectId()
        != other.getCustomFieldProjectId()) return false;
    if (!getEditValueList()
        .equals(other.getEditValueList())) return false;
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
    hash = (37 * hash) + TICKET_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getTicketCode().hashCode();
    hash = (37 * hash) + CUSTOM_FIELD_PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCustomFieldProjectId());
    if (getEditValueCount() > 0) {
      hash = (37 * hash) + EDIT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getEditValueList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest prototype) {
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
   * EditCustomFieldRequest -
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.EditCustomFieldRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.EditCustomFieldRequest)
      com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditCustomFieldRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditCustomFieldRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.newBuilder()
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
      ticketCode_ = "";
      customFieldProjectId_ = 0L;
      if (editValueBuilder_ == null) {
        editValue_ = java.util.Collections.emptyList();
      } else {
        editValue_ = null;
        editValueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_EditCustomFieldRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest result = new com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest result) {
      if (editValueBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          editValue_ = java.util.Collections.unmodifiableList(editValue_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.editValue_ = editValue_;
      } else {
        result.editValue_ = editValueBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketCode_ = ticketCode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.customFieldProjectId_ = customFieldProjectId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.getDefaultInstance()) return this;
      if (!other.getTicketCode().isEmpty()) {
        ticketCode_ = other.ticketCode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getCustomFieldProjectId() != 0L) {
        setCustomFieldProjectId(other.getCustomFieldProjectId());
      }
      if (editValueBuilder_ == null) {
        if (!other.editValue_.isEmpty()) {
          if (editValue_.isEmpty()) {
            editValue_ = other.editValue_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEditValueIsMutable();
            editValue_.addAll(other.editValue_);
          }
          onChanged();
        }
      } else {
        if (!other.editValue_.isEmpty()) {
          if (editValueBuilder_.isEmpty()) {
            editValueBuilder_.dispose();
            editValueBuilder_ = null;
            editValue_ = other.editValue_;
            bitField0_ = (bitField0_ & ~0x00000004);
            editValueBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEditValueFieldBuilder() : null;
          } else {
            editValueBuilder_.addAllMessages(other.editValue_);
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
            case 10: {
              ticketCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              customFieldProjectId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              com.tcn.cloud.api.api.commons.CustomField m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.CustomField.parser(),
                      extensionRegistry);
              if (editValueBuilder_ == null) {
                ensureEditValueIsMutable();
                editValue_.add(m);
              } else {
                editValueBuilder_.addMessage(m);
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

    private java.lang.Object ticketCode_ = "";
    /**
     * <pre>
     * ticket_code
     * </pre>
     *
     * <code>string ticket_code = 1 [json_name = "ticketCode"];</code>
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
     * <code>string ticket_code = 1 [json_name = "ticketCode"];</code>
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
     * <code>string ticket_code = 1 [json_name = "ticketCode"];</code>
     * @param value The ticketCode to set.
     * @return This builder for chaining.
     */
    public Builder setTicketCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ticketCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ticket_code
     * </pre>
     *
     * <code>string ticket_code = 1 [json_name = "ticketCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketCode() {
      ticketCode_ = getDefaultInstance().getTicketCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ticket_code
     * </pre>
     *
     * <code>string ticket_code = 1 [json_name = "ticketCode"];</code>
     * @param value The bytes for ticketCode to set.
     * @return This builder for chaining.
     */
    public Builder setTicketCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ticketCode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long customFieldProjectId_ ;
    /**
     * <pre>
     * custom_field_project_id
     * </pre>
     *
     * <code>int64 custom_field_project_id = 2 [json_name = "customFieldProjectId", jstype = JS_STRING];</code>
     * @return The customFieldProjectId.
     */
    @java.lang.Override
    public long getCustomFieldProjectId() {
      return customFieldProjectId_;
    }
    /**
     * <pre>
     * custom_field_project_id
     * </pre>
     *
     * <code>int64 custom_field_project_id = 2 [json_name = "customFieldProjectId", jstype = JS_STRING];</code>
     * @param value The customFieldProjectId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomFieldProjectId(long value) {

      customFieldProjectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * custom_field_project_id
     * </pre>
     *
     * <code>int64 custom_field_project_id = 2 [json_name = "customFieldProjectId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomFieldProjectId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      customFieldProjectId_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.commons.CustomField> editValue_ =
      java.util.Collections.emptyList();
    private void ensureEditValueIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        editValue_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.CustomField>(editValue_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.CustomField, com.tcn.cloud.api.api.commons.CustomField.Builder, com.tcn.cloud.api.api.commons.CustomFieldOrBuilder> editValueBuilder_;

    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.CustomField> getEditValueList() {
      if (editValueBuilder_ == null) {
        return java.util.Collections.unmodifiableList(editValue_);
      } else {
        return editValueBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public int getEditValueCount() {
      if (editValueBuilder_ == null) {
        return editValue_.size();
      } else {
        return editValueBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.CustomField getEditValue(int index) {
      if (editValueBuilder_ == null) {
        return editValue_.get(index);
      } else {
        return editValueBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder setEditValue(
        int index, com.tcn.cloud.api.api.commons.CustomField value) {
      if (editValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditValueIsMutable();
        editValue_.set(index, value);
        onChanged();
      } else {
        editValueBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder setEditValue(
        int index, com.tcn.cloud.api.api.commons.CustomField.Builder builderForValue) {
      if (editValueBuilder_ == null) {
        ensureEditValueIsMutable();
        editValue_.set(index, builderForValue.build());
        onChanged();
      } else {
        editValueBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder addEditValue(com.tcn.cloud.api.api.commons.CustomField value) {
      if (editValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditValueIsMutable();
        editValue_.add(value);
        onChanged();
      } else {
        editValueBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder addEditValue(
        int index, com.tcn.cloud.api.api.commons.CustomField value) {
      if (editValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEditValueIsMutable();
        editValue_.add(index, value);
        onChanged();
      } else {
        editValueBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder addEditValue(
        com.tcn.cloud.api.api.commons.CustomField.Builder builderForValue) {
      if (editValueBuilder_ == null) {
        ensureEditValueIsMutable();
        editValue_.add(builderForValue.build());
        onChanged();
      } else {
        editValueBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder addEditValue(
        int index, com.tcn.cloud.api.api.commons.CustomField.Builder builderForValue) {
      if (editValueBuilder_ == null) {
        ensureEditValueIsMutable();
        editValue_.add(index, builderForValue.build());
        onChanged();
      } else {
        editValueBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder addAllEditValue(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.CustomField> values) {
      if (editValueBuilder_ == null) {
        ensureEditValueIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, editValue_);
        onChanged();
      } else {
        editValueBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder clearEditValue() {
      if (editValueBuilder_ == null) {
        editValue_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        editValueBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public Builder removeEditValue(int index) {
      if (editValueBuilder_ == null) {
        ensureEditValueIsMutable();
        editValue_.remove(index);
        onChanged();
      } else {
        editValueBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.CustomField.Builder getEditValueBuilder(
        int index) {
      return getEditValueFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.CustomFieldOrBuilder getEditValueOrBuilder(
        int index) {
      if (editValueBuilder_ == null) {
        return editValue_.get(index);  } else {
        return editValueBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.CustomFieldOrBuilder> 
         getEditValueOrBuilderList() {
      if (editValueBuilder_ != null) {
        return editValueBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(editValue_);
      }
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.CustomField.Builder addEditValueBuilder() {
      return getEditValueFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.CustomField.getDefaultInstance());
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public com.tcn.cloud.api.api.commons.CustomField.Builder addEditValueBuilder(
        int index) {
      return getEditValueFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.CustomField.getDefaultInstance());
    }
    /**
     * <pre>
     * repeated custom fields
     * </pre>
     *
     * <code>repeated .api.commons.CustomField edit_value = 3 [json_name = "editValue"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.CustomField.Builder> 
         getEditValueBuilderList() {
      return getEditValueFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.CustomField, com.tcn.cloud.api.api.commons.CustomField.Builder, com.tcn.cloud.api.api.commons.CustomFieldOrBuilder> 
        getEditValueFieldBuilder() {
      if (editValueBuilder_ == null) {
        editValueBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.CustomField, com.tcn.cloud.api.api.commons.CustomField.Builder, com.tcn.cloud.api.api.commons.CustomFieldOrBuilder>(
                editValue_,
                ((bitField0_ & 0x00000004) != 0),
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.EditCustomFieldRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.EditCustomFieldRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EditCustomFieldRequest>
      PARSER = new com.google.protobuf.AbstractParser<EditCustomFieldRequest>() {
    @java.lang.Override
    public EditCustomFieldRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<EditCustomFieldRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EditCustomFieldRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

