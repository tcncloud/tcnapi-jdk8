// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/contactmanager_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 *payload for add/edit/decrypt
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.ContactManagerEntryEvent}
 */
public final class ContactManagerEntryEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.ContactManagerEntryEvent)
    ContactManagerEntryEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContactManagerEntryEvent.newBuilder() to construct.
  private ContactManagerEntryEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContactManagerEntryEvent() {
    contactManagerEntryListIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContactManagerEntryEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent.class, com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent.Builder.class);
  }

  public static final int CONTACTMANAGERLISTID_FIELD_NUMBER = 1;
  private long contactManagerListId_ = 0L;
  /**
   * <pre>
   *contact manager list id
   * </pre>
   *
   * <code>int64 ContactManagerListId = 1 [json_name = "ContactManagerListId"];</code>
   * @return The contactManagerListId.
   */
  @java.lang.Override
  public long getContactManagerListId() {
    return contactManagerListId_;
  }

  public static final int CONTACTMANAGERENTRYID_FIELD_NUMBER = 2;
  private long contactManagerEntryId_ = 0L;
  /**
   * <pre>
   *contact manager entry id
   * </pre>
   *
   * <code>int64 ContactManagerEntryId = 2 [json_name = "ContactManagerEntryId"];</code>
   * @return The contactManagerEntryId.
   */
  @java.lang.Override
  public long getContactManagerEntryId() {
    return contactManagerEntryId_;
  }

  public static final int CONTACTMANAGERENTRYLISTIDS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList contactManagerEntryListIds_;
  /**
   * <pre>
   *entry list Ids added/edited/decrypted
   * </pre>
   *
   * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
   * @return A list containing the contactManagerEntryListIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getContactManagerEntryListIdsList() {
    return contactManagerEntryListIds_;
  }
  /**
   * <pre>
   *entry list Ids added/edited/decrypted
   * </pre>
   *
   * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
   * @return The count of contactManagerEntryListIds.
   */
  public int getContactManagerEntryListIdsCount() {
    return contactManagerEntryListIds_.size();
  }
  /**
   * <pre>
   *entry list Ids added/edited/decrypted
   * </pre>
   *
   * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
   * @param index The index of the element to return.
   * @return The contactManagerEntryListIds at the given index.
   */
  public long getContactManagerEntryListIds(int index) {
    return contactManagerEntryListIds_.getLong(index);
  }
  private int contactManagerEntryListIdsMemoizedSerializedSize = -1;

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
    if (contactManagerListId_ != 0L) {
      output.writeInt64(1, contactManagerListId_);
    }
    if (contactManagerEntryId_ != 0L) {
      output.writeInt64(2, contactManagerEntryId_);
    }
    if (getContactManagerEntryListIdsList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(contactManagerEntryListIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < contactManagerEntryListIds_.size(); i++) {
      output.writeInt64NoTag(contactManagerEntryListIds_.getLong(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < contactManagerEntryListIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(contactManagerEntryListIds_.getLong(i));
      }
      size += dataSize;
      if (!getContactManagerEntryListIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      contactManagerEntryListIdsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent other = (com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent) obj;

    if (getContactManagerListId()
        != other.getContactManagerListId()) return false;
    if (getContactManagerEntryId()
        != other.getContactManagerEntryId()) return false;
    if (!getContactManagerEntryListIdsList()
        .equals(other.getContactManagerEntryListIdsList())) return false;
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
    hash = (37 * hash) + CONTACTMANAGERLISTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getContactManagerListId());
    hash = (37 * hash) + CONTACTMANAGERENTRYID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getContactManagerEntryId());
    if (getContactManagerEntryListIdsCount() > 0) {
      hash = (37 * hash) + CONTACTMANAGERENTRYLISTIDS_FIELD_NUMBER;
      hash = (53 * hash) + getContactManagerEntryListIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent prototype) {
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
   *payload for add/edit/decrypt
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.ContactManagerEntryEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.ContactManagerEntryEvent)
      com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent.class, com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent.newBuilder()
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
      contactManagerEntryListIds_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.ContactmanagerEventsProto.internal_static_api_commons_audit_ContactManagerEntryEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent build() {
      com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent result = new com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        contactManagerEntryListIds_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.contactManagerEntryListIds_ = contactManagerEntryListIds_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contactManagerListId_ = contactManagerListId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.contactManagerEntryId_ = contactManagerEntryId_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent.getDefaultInstance()) return this;
      if (other.getContactManagerListId() != 0L) {
        setContactManagerListId(other.getContactManagerListId());
      }
      if (other.getContactManagerEntryId() != 0L) {
        setContactManagerEntryId(other.getContactManagerEntryId());
      }
      if (!other.contactManagerEntryListIds_.isEmpty()) {
        if (contactManagerEntryListIds_.isEmpty()) {
          contactManagerEntryListIds_ = other.contactManagerEntryListIds_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureContactManagerEntryListIdsIsMutable();
          contactManagerEntryListIds_.addAll(other.contactManagerEntryListIds_);
        }
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
            case 24: {
              long v = input.readInt64();
              ensureContactManagerEntryListIdsIsMutable();
              contactManagerEntryListIds_.addLong(v);
              break;
            } // case 24
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureContactManagerEntryListIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                contactManagerEntryListIds_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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
     * <pre>
     *contact manager list id
     * </pre>
     *
     * <code>int64 ContactManagerListId = 1 [json_name = "ContactManagerListId"];</code>
     * @return The contactManagerListId.
     */
    @java.lang.Override
    public long getContactManagerListId() {
      return contactManagerListId_;
    }
    /**
     * <pre>
     *contact manager list id
     * </pre>
     *
     * <code>int64 ContactManagerListId = 1 [json_name = "ContactManagerListId"];</code>
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
     * <pre>
     *contact manager list id
     * </pre>
     *
     * <code>int64 ContactManagerListId = 1 [json_name = "ContactManagerListId"];</code>
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
     * <pre>
     *contact manager entry id
     * </pre>
     *
     * <code>int64 ContactManagerEntryId = 2 [json_name = "ContactManagerEntryId"];</code>
     * @return The contactManagerEntryId.
     */
    @java.lang.Override
    public long getContactManagerEntryId() {
      return contactManagerEntryId_;
    }
    /**
     * <pre>
     *contact manager entry id
     * </pre>
     *
     * <code>int64 ContactManagerEntryId = 2 [json_name = "ContactManagerEntryId"];</code>
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
     * <pre>
     *contact manager entry id
     * </pre>
     *
     * <code>int64 ContactManagerEntryId = 2 [json_name = "ContactManagerEntryId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactManagerEntryId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      contactManagerEntryId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList contactManagerEntryListIds_ = emptyLongList();
    private void ensureContactManagerEntryListIdsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        contactManagerEntryListIds_ = mutableCopy(contactManagerEntryListIds_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <pre>
     *entry list Ids added/edited/decrypted
     * </pre>
     *
     * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
     * @return A list containing the contactManagerEntryListIds.
     */
    public java.util.List<java.lang.Long>
        getContactManagerEntryListIdsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(contactManagerEntryListIds_) : contactManagerEntryListIds_;
    }
    /**
     * <pre>
     *entry list Ids added/edited/decrypted
     * </pre>
     *
     * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
     * @return The count of contactManagerEntryListIds.
     */
    public int getContactManagerEntryListIdsCount() {
      return contactManagerEntryListIds_.size();
    }
    /**
     * <pre>
     *entry list Ids added/edited/decrypted
     * </pre>
     *
     * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
     * @param index The index of the element to return.
     * @return The contactManagerEntryListIds at the given index.
     */
    public long getContactManagerEntryListIds(int index) {
      return contactManagerEntryListIds_.getLong(index);
    }
    /**
     * <pre>
     *entry list Ids added/edited/decrypted
     * </pre>
     *
     * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
     * @param index The index to set the value at.
     * @param value The contactManagerEntryListIds to set.
     * @return This builder for chaining.
     */
    public Builder setContactManagerEntryListIds(
        int index, long value) {

      ensureContactManagerEntryListIdsIsMutable();
      contactManagerEntryListIds_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *entry list Ids added/edited/decrypted
     * </pre>
     *
     * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
     * @param value The contactManagerEntryListIds to add.
     * @return This builder for chaining.
     */
    public Builder addContactManagerEntryListIds(long value) {

      ensureContactManagerEntryListIdsIsMutable();
      contactManagerEntryListIds_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *entry list Ids added/edited/decrypted
     * </pre>
     *
     * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
     * @param values The contactManagerEntryListIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllContactManagerEntryListIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureContactManagerEntryListIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, contactManagerEntryListIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *entry list Ids added/edited/decrypted
     * </pre>
     *
     * <code>repeated int64 ContactManagerEntryListIds = 3 [json_name = "ContactManagerEntryListIds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactManagerEntryListIds() {
      contactManagerEntryListIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.ContactManagerEntryEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.ContactManagerEntryEvent)
  private static final com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactManagerEntryEvent>
      PARSER = new com.google.protobuf.AbstractParser<ContactManagerEntryEvent>() {
    @java.lang.Override
    public ContactManagerEntryEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContactManagerEntryEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContactManagerEntryEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.ContactManagerEntryEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

