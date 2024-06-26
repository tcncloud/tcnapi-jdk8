// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

/**
 * Protobuf type {@code api.v1alpha1.contactmanager.GetContactListResponse}
 */
public final class GetContactListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.contactmanager.GetContactListResponse)
    GetContactListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetContactListResponse.newBuilder() to construct.
  private GetContactListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetContactListResponse() {
    contactManagerList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetContactListResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.Builder.class);
  }

  public static final int CONTACT_MANAGER_LIST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList> contactManagerList_;
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList> getContactManagerListList() {
    return contactManagerList_;
  }
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerListOrBuilder> 
      getContactManagerListOrBuilderList() {
    return contactManagerList_;
  }
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
   */
  @java.lang.Override
  public int getContactManagerListCount() {
    return contactManagerList_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList getContactManagerList(int index) {
    return contactManagerList_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerListOrBuilder getContactManagerListOrBuilder(
      int index) {
    return contactManagerList_.get(index);
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
    for (int i = 0; i < contactManagerList_.size(); i++) {
      output.writeMessage(2, contactManagerList_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < contactManagerList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, contactManagerList_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse other = (com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse) obj;

    if (!getContactManagerListList()
        .equals(other.getContactManagerListList())) return false;
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
    if (getContactManagerListCount() > 0) {
      hash = (37 * hash) + CONTACT_MANAGER_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getContactManagerListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.contactmanager.GetContactListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.contactmanager.GetContactListResponse)
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.class, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.newBuilder()
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
      if (contactManagerListBuilder_ == null) {
        contactManagerList_ = java.util.Collections.emptyList();
      } else {
        contactManagerList_ = null;
        contactManagerListBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.internal_static_api_v1alpha1_contactmanager_GetContactListResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse build() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse result = new com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse result) {
      if (contactManagerListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contactManagerList_ = java.util.Collections.unmodifiableList(contactManagerList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contactManagerList_ = contactManagerList_;
      } else {
        result.contactManagerList_ = contactManagerListBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.getDefaultInstance()) return this;
      if (contactManagerListBuilder_ == null) {
        if (!other.contactManagerList_.isEmpty()) {
          if (contactManagerList_.isEmpty()) {
            contactManagerList_ = other.contactManagerList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContactManagerListIsMutable();
            contactManagerList_.addAll(other.contactManagerList_);
          }
          onChanged();
        }
      } else {
        if (!other.contactManagerList_.isEmpty()) {
          if (contactManagerListBuilder_.isEmpty()) {
            contactManagerListBuilder_.dispose();
            contactManagerListBuilder_ = null;
            contactManagerList_ = other.contactManagerList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contactManagerListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContactManagerListFieldBuilder() : null;
          } else {
            contactManagerListBuilder_.addAllMessages(other.contactManagerList_);
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
            case 18: {
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.parser(),
                      extensionRegistry);
              if (contactManagerListBuilder_ == null) {
                ensureContactManagerListIsMutable();
                contactManagerList_.add(m);
              } else {
                contactManagerListBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList> contactManagerList_ =
      java.util.Collections.emptyList();
    private void ensureContactManagerListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contactManagerList_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList>(contactManagerList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerListOrBuilder> contactManagerListBuilder_;

    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList> getContactManagerListList() {
      if (contactManagerListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contactManagerList_);
      } else {
        return contactManagerListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public int getContactManagerListCount() {
      if (contactManagerListBuilder_ == null) {
        return contactManagerList_.size();
      } else {
        return contactManagerListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList getContactManagerList(int index) {
      if (contactManagerListBuilder_ == null) {
        return contactManagerList_.get(index);
      } else {
        return contactManagerListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder setContactManagerList(
        int index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList value) {
      if (contactManagerListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactManagerListIsMutable();
        contactManagerList_.set(index, value);
        onChanged();
      } else {
        contactManagerListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder setContactManagerList(
        int index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder builderForValue) {
      if (contactManagerListBuilder_ == null) {
        ensureContactManagerListIsMutable();
        contactManagerList_.set(index, builderForValue.build());
        onChanged();
      } else {
        contactManagerListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder addContactManagerList(com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList value) {
      if (contactManagerListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactManagerListIsMutable();
        contactManagerList_.add(value);
        onChanged();
      } else {
        contactManagerListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder addContactManagerList(
        int index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList value) {
      if (contactManagerListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactManagerListIsMutable();
        contactManagerList_.add(index, value);
        onChanged();
      } else {
        contactManagerListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder addContactManagerList(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder builderForValue) {
      if (contactManagerListBuilder_ == null) {
        ensureContactManagerListIsMutable();
        contactManagerList_.add(builderForValue.build());
        onChanged();
      } else {
        contactManagerListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder addContactManagerList(
        int index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder builderForValue) {
      if (contactManagerListBuilder_ == null) {
        ensureContactManagerListIsMutable();
        contactManagerList_.add(index, builderForValue.build());
        onChanged();
      } else {
        contactManagerListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder addAllContactManagerList(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList> values) {
      if (contactManagerListBuilder_ == null) {
        ensureContactManagerListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contactManagerList_);
        onChanged();
      } else {
        contactManagerListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder clearContactManagerList() {
      if (contactManagerListBuilder_ == null) {
        contactManagerList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contactManagerListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public Builder removeContactManagerList(int index) {
      if (contactManagerListBuilder_ == null) {
        ensureContactManagerListIsMutable();
        contactManagerList_.remove(index);
        onChanged();
      } else {
        contactManagerListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder getContactManagerListBuilder(
        int index) {
      return getContactManagerListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerListOrBuilder getContactManagerListOrBuilder(
        int index) {
      if (contactManagerListBuilder_ == null) {
        return contactManagerList_.get(index);  } else {
        return contactManagerListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerListOrBuilder> 
         getContactManagerListOrBuilderList() {
      if (contactManagerListBuilder_ != null) {
        return contactManagerListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contactManagerList_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder addContactManagerListBuilder() {
      return getContactManagerListFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder addContactManagerListBuilder(
        int index) {
      return getContactManagerListFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.contactmanager.ContactManagerList contact_manager_list = 2 [json_name = "contactManagerList"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder> 
         getContactManagerListBuilderList() {
      return getContactManagerListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerListOrBuilder> 
        getContactManagerListFieldBuilder() {
      if (contactManagerListBuilder_ == null) {
        contactManagerListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerList.Builder, com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactManagerListOrBuilder>(
                contactManagerList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        contactManagerList_ = null;
      }
      return contactManagerListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.contactmanager.GetContactListResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.contactmanager.GetContactListResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetContactListResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetContactListResponse>() {
    @java.lang.Override
    public GetContactListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetContactListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetContactListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

