// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

/**
 * <pre>
 * List all Unencrypted Data. Encrypted Data would be sent On Double Click of the Record
 * Seperate API to List All Encrypted Data
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.contactmanager.ListContactEntryListResponse}
 */
public final class ListContactEntryListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.contactmanager.ListContactEntryListResponse)
    ListContactEntryListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListContactEntryListResponse.newBuilder() to construct.
  private ListContactEntryListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListContactEntryListResponse() {
    contactManagerEntry_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListContactEntryListResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.Builder.class);
  }

  public static final int CONTACT_MANAGER_ENTRY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry> contactManagerEntry_;
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry> getContactManagerEntryList() {
    return contactManagerEntry_;
  }
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder> 
      getContactManagerEntryOrBuilderList() {
    return contactManagerEntry_;
  }
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  @java.lang.Override
  public int getContactManagerEntryCount() {
    return contactManagerEntry_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry getContactManagerEntry(int index) {
    return contactManagerEntry_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder getContactManagerEntryOrBuilder(
      int index) {
    return contactManagerEntry_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * the next page token
   * </pre>
   *
   * <code>string next_page_token = 3 [json_name = "nextPageToken"];</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the next page token
   * </pre>
   *
   * <code>string next_page_token = 3 [json_name = "nextPageToken"];</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < contactManagerEntry_.size(); i++) {
      output.writeMessage(2, contactManagerEntry_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < contactManagerEntry_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, contactManagerEntry_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nextPageToken_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse other = (com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse) obj;

    if (!getContactManagerEntryList()
        .equals(other.getContactManagerEntryList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
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
    if (getContactManagerEntryCount() > 0) {
      hash = (37 * hash) + CONTACT_MANAGER_ENTRY_FIELD_NUMBER;
      hash = (53 * hash) + getContactManagerEntryList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse prototype) {
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
   * List all Unencrypted Data. Encrypted Data would be sent On Double Click of the Record
   * Seperate API to List All Encrypted Data
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.contactmanager.ListContactEntryListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.contactmanager.ListContactEntryListResponse)
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.newBuilder()
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
      if (contactManagerEntryBuilder_ == null) {
        contactManagerEntry_ = java.util.Collections.emptyList();
      } else {
        contactManagerEntry_ = null;
        contactManagerEntryBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_ListContactEntryListResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse build() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse result = new com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse result) {
      if (contactManagerEntryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contactManagerEntry_ = java.util.Collections.unmodifiableList(contactManagerEntry_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contactManagerEntry_ = contactManagerEntry_;
      } else {
        result.contactManagerEntry_ = contactManagerEntryBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.getDefaultInstance()) return this;
      if (contactManagerEntryBuilder_ == null) {
        if (!other.contactManagerEntry_.isEmpty()) {
          if (contactManagerEntry_.isEmpty()) {
            contactManagerEntry_ = other.contactManagerEntry_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContactManagerEntryIsMutable();
            contactManagerEntry_.addAll(other.contactManagerEntry_);
          }
          onChanged();
        }
      } else {
        if (!other.contactManagerEntry_.isEmpty()) {
          if (contactManagerEntryBuilder_.isEmpty()) {
            contactManagerEntryBuilder_.dispose();
            contactManagerEntryBuilder_ = null;
            contactManagerEntry_ = other.contactManagerEntry_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contactManagerEntryBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContactManagerEntryFieldBuilder() : null;
          } else {
            contactManagerEntryBuilder_.addAllMessages(other.contactManagerEntry_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
            case 18: {
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.parser(),
                      extensionRegistry);
              if (contactManagerEntryBuilder_ == null) {
                ensureContactManagerEntryIsMutable();
                contactManagerEntry_.add(m);
              } else {
                contactManagerEntryBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry> contactManagerEntry_ =
      java.util.Collections.emptyList();
    private void ensureContactManagerEntryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contactManagerEntry_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry>(contactManagerEntry_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder> contactManagerEntryBuilder_;

    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry> getContactManagerEntryList() {
      if (contactManagerEntryBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contactManagerEntry_);
      } else {
        return contactManagerEntryBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public int getContactManagerEntryCount() {
      if (contactManagerEntryBuilder_ == null) {
        return contactManagerEntry_.size();
      } else {
        return contactManagerEntryBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry getContactManagerEntry(int index) {
      if (contactManagerEntryBuilder_ == null) {
        return contactManagerEntry_.get(index);
      } else {
        return contactManagerEntryBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder setContactManagerEntry(
        int index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry value) {
      if (contactManagerEntryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactManagerEntryIsMutable();
        contactManagerEntry_.set(index, value);
        onChanged();
      } else {
        contactManagerEntryBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder setContactManagerEntry(
        int index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder builderForValue) {
      if (contactManagerEntryBuilder_ == null) {
        ensureContactManagerEntryIsMutable();
        contactManagerEntry_.set(index, builderForValue.build());
        onChanged();
      } else {
        contactManagerEntryBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder addContactManagerEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry value) {
      if (contactManagerEntryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactManagerEntryIsMutable();
        contactManagerEntry_.add(value);
        onChanged();
      } else {
        contactManagerEntryBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder addContactManagerEntry(
        int index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry value) {
      if (contactManagerEntryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactManagerEntryIsMutable();
        contactManagerEntry_.add(index, value);
        onChanged();
      } else {
        contactManagerEntryBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder addContactManagerEntry(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder builderForValue) {
      if (contactManagerEntryBuilder_ == null) {
        ensureContactManagerEntryIsMutable();
        contactManagerEntry_.add(builderForValue.build());
        onChanged();
      } else {
        contactManagerEntryBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder addContactManagerEntry(
        int index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder builderForValue) {
      if (contactManagerEntryBuilder_ == null) {
        ensureContactManagerEntryIsMutable();
        contactManagerEntry_.add(index, builderForValue.build());
        onChanged();
      } else {
        contactManagerEntryBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder addAllContactManagerEntry(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry> values) {
      if (contactManagerEntryBuilder_ == null) {
        ensureContactManagerEntryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contactManagerEntry_);
        onChanged();
      } else {
        contactManagerEntryBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder clearContactManagerEntry() {
      if (contactManagerEntryBuilder_ == null) {
        contactManagerEntry_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contactManagerEntryBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public Builder removeContactManagerEntry(int index) {
      if (contactManagerEntryBuilder_ == null) {
        ensureContactManagerEntryIsMutable();
        contactManagerEntry_.remove(index);
        onChanged();
      } else {
        contactManagerEntryBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder getContactManagerEntryBuilder(
        int index) {
      return getContactManagerEntryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder getContactManagerEntryOrBuilder(
        int index) {
      if (contactManagerEntryBuilder_ == null) {
        return contactManagerEntry_.get(index);  } else {
        return contactManagerEntryBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder> 
         getContactManagerEntryOrBuilderList() {
      if (contactManagerEntryBuilder_ != null) {
        return contactManagerEntryBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contactManagerEntry_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder addContactManagerEntryBuilder() {
      return getContactManagerEntryFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder addContactManagerEntryBuilder(
        int index) {
      return getContactManagerEntryFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerEntry contact_manager_entry = 2 [json_name = "contactManagerEntry"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder> 
         getContactManagerEntryBuilderList() {
      return getContactManagerEntryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder> 
        getContactManagerEntryFieldBuilder() {
      if (contactManagerEntryBuilder_ == null) {
        contactManagerEntryBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntry.Builder, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerEntryOrBuilder>(
                contactManagerEntry_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        contactManagerEntry_ = null;
      }
      return contactManagerEntryBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * the next page token
     * </pre>
     *
     * <code>string next_page_token = 3 [json_name = "nextPageToken"];</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the next page token
     * </pre>
     *
     * <code>string next_page_token = 3 [json_name = "nextPageToken"];</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the next page token
     * </pre>
     *
     * <code>string next_page_token = 3 [json_name = "nextPageToken"];</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the next page token
     * </pre>
     *
     * <code>string next_page_token = 3 [json_name = "nextPageToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the next page token
     * </pre>
     *
     * <code>string next_page_token = 3 [json_name = "nextPageToken"];</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.contactmanager.ListContactEntryListResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.contactmanager.ListContactEntryListResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListContactEntryListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListContactEntryListResponse>() {
    @java.lang.Override
    public ListContactEntryListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListContactEntryListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListContactEntryListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

