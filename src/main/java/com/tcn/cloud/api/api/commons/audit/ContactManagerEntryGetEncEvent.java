// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/contactmanager_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * Protobuf type {@code api.commons.audit.ContactManagerEntryGetEncEvent}
 */
public final class ContactManagerEntryGetEncEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.ContactManagerEntryGetEncEvent)
    ContactManagerEntryGetEncEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContactManagerEntryGetEncEvent.newBuilder() to construct.
  private ContactManagerEntryGetEncEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContactManagerEntryGetEncEvent() {
    createdById_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContactManagerEntryGetEncEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent.class, com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent.Builder.class);
  }

  public static final int CONTACT_MANAGER_LIST_ID_FIELD_NUMBER = 1;
  private long contactManagerListId_ = 0L;
  /**
   * <code>int64 contact_manager_list_id = 1 [json_name = "contactManagerListId"];</code>
   * @return The contactManagerListId.
   */
  @java.lang.Override
  public long getContactManagerListId() {
    return contactManagerListId_;
  }

  public static final int CONTACT_MANAGER_ENTRY_ID_FIELD_NUMBER = 2;
  private long contactManagerEntryId_ = 0L;
  /**
   * <code>int64 contact_manager_entry_id = 2 [json_name = "contactManagerEntryId"];</code>
   * @return The contactManagerEntryId.
   */
  @java.lang.Override
  public long getContactManagerEntryId() {
    return contactManagerEntryId_;
  }

  public static final int CREATED_BY_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object createdById_ = "";
  /**
   * <code>string created_by_id = 3 [json_name = "createdById"];</code>
   * @return The createdById.
   */
  @java.lang.Override
  public java.lang.String getCreatedById() {
    java.lang.Object ref = createdById_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createdById_ = s;
      return s;
    }
  }
  /**
   * <code>string created_by_id = 3 [json_name = "createdById"];</code>
   * @return The bytes for createdById.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreatedByIdBytes() {
    java.lang.Object ref = createdById_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createdById_ = b;
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
    if (contactManagerListId_ != 0L) {
      output.writeInt64(1, contactManagerListId_);
    }
    if (contactManagerEntryId_ != 0L) {
      output.writeInt64(2, contactManagerEntryId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(createdById_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, createdById_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contactManagerListId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, contactManagerListId_);
    }
    if (contactManagerEntryId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, contactManagerEntryId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(createdById_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, createdById_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent other = (com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent) obj;

    if (getContactManagerListId()
        != other.getContactManagerListId()) return false;
    if (getContactManagerEntryId()
        != other.getContactManagerEntryId()) return false;
    if (!getCreatedById()
        .equals(other.getCreatedById())) return false;
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
    hash = (37 * hash) + CONTACT_MANAGER_LIST_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getContactManagerListId());
    hash = (37 * hash) + CONTACT_MANAGER_ENTRY_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getContactManagerEntryId());
    hash = (37 * hash) + CREATED_BY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCreatedById().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent prototype) {
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
   * Protobuf type {@code api.commons.audit.ContactManagerEntryGetEncEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.ContactManagerEntryGetEncEvent)
      com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent.class, com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent.newBuilder()
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
      contactManagerListId_ = 0L;
      contactManagerEntryId_ = 0L;
      createdById_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryGetEncEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent build() {
      com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent result = new com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contactManagerListId_ = contactManagerListId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.contactManagerEntryId_ = contactManagerEntryId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.createdById_ = createdById_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent.getDefaultInstance()) return this;
      if (other.getContactManagerListId() != 0L) {
        setContactManagerListId(other.getContactManagerListId());
      }
      if (other.getContactManagerEntryId() != 0L) {
        setContactManagerEntryId(other.getContactManagerEntryId());
      }
      if (!other.getCreatedById().isEmpty()) {
        createdById_ = other.createdById_;
        bitField0_ |= 0x00000004;
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
              contactManagerListId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              contactManagerEntryId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              createdById_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
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

    private long contactManagerListId_ ;
    /**
     * <code>int64 contact_manager_list_id = 1 [json_name = "contactManagerListId"];</code>
     * @return The contactManagerListId.
     */
    @java.lang.Override
    public long getContactManagerListId() {
      return contactManagerListId_;
    }
    /**
     * <code>int64 contact_manager_list_id = 1 [json_name = "contactManagerListId"];</code>
     * @param value The contactManagerListId to set.
     * @return This builder for chaining.
     */
    public Builder setContactManagerListId(long value) {

      contactManagerListId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 contact_manager_list_id = 1 [json_name = "contactManagerListId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactManagerListId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      contactManagerListId_ = 0L;
      onChanged();
      return this;
    }

    private long contactManagerEntryId_ ;
    /**
     * <code>int64 contact_manager_entry_id = 2 [json_name = "contactManagerEntryId"];</code>
     * @return The contactManagerEntryId.
     */
    @java.lang.Override
    public long getContactManagerEntryId() {
      return contactManagerEntryId_;
    }
    /**
     * <code>int64 contact_manager_entry_id = 2 [json_name = "contactManagerEntryId"];</code>
     * @param value The contactManagerEntryId to set.
     * @return This builder for chaining.
     */
    public Builder setContactManagerEntryId(long value) {

      contactManagerEntryId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 contact_manager_entry_id = 2 [json_name = "contactManagerEntryId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactManagerEntryId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      contactManagerEntryId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object createdById_ = "";
    /**
     * <code>string created_by_id = 3 [json_name = "createdById"];</code>
     * @return The createdById.
     */
    public java.lang.String getCreatedById() {
      java.lang.Object ref = createdById_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createdById_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string created_by_id = 3 [json_name = "createdById"];</code>
     * @return The bytes for createdById.
     */
    public com.google.protobuf.ByteString
        getCreatedByIdBytes() {
      java.lang.Object ref = createdById_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createdById_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string created_by_id = 3 [json_name = "createdById"];</code>
     * @param value The createdById to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedById(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      createdById_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string created_by_id = 3 [json_name = "createdById"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatedById() {
      createdById_ = getDefaultInstance().getCreatedById();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string created_by_id = 3 [json_name = "createdById"];</code>
     * @param value The bytes for createdById to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedByIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      createdById_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.ContactManagerEntryGetEncEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.ContactManagerEntryGetEncEvent)
  private static final com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactManagerEntryGetEncEvent>
      PARSER = new com.google.protobuf.AbstractParser<ContactManagerEntryGetEncEvent>() {
    @java.lang.Override
    public ContactManagerEntryGetEncEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContactManagerEntryGetEncEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContactManagerEntryGetEncEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.ContactManagerEntryGetEncEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

