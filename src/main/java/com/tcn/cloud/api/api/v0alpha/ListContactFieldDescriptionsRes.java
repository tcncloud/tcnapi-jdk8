// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListContactFieldDescriptionsRes}
 */
public final class ListContactFieldDescriptionsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListContactFieldDescriptionsRes)
    ListContactFieldDescriptionsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListContactFieldDescriptionsRes.newBuilder() to construct.
  private ListContactFieldDescriptionsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListContactFieldDescriptionsRes() {
    contactFieldDescription_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListContactFieldDescriptionsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactFieldDescriptionsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactFieldDescriptionsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.class, com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.Builder.class);
  }

  public static final int CONTACT_FIELD_DESCRIPTION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.ContactFieldDescription> contactFieldDescription_;
  /**
   * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.ContactFieldDescription> getContactFieldDescriptionList() {
    return contactFieldDescription_;
  }
  /**
   * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ContactFieldDescriptionOrBuilder> 
      getContactFieldDescriptionOrBuilderList() {
    return contactFieldDescription_;
  }
  /**
   * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
   */
  @java.lang.Override
  public int getContactFieldDescriptionCount() {
    return contactFieldDescription_.size();
  }
  /**
   * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription getContactFieldDescription(int index) {
    return contactFieldDescription_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ContactFieldDescriptionOrBuilder getContactFieldDescriptionOrBuilder(
      int index) {
    return contactFieldDescription_.get(index);
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
    for (int i = 0; i < contactFieldDescription_.size(); i++) {
      output.writeMessage(1, contactFieldDescription_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < contactFieldDescription_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, contactFieldDescription_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes other = (com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes) obj;

    if (!getContactFieldDescriptionList()
        .equals(other.getContactFieldDescriptionList())) return false;
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
    if (getContactFieldDescriptionCount() > 0) {
      hash = (37 * hash) + CONTACT_FIELD_DESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getContactFieldDescriptionList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ListContactFieldDescriptionsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListContactFieldDescriptionsRes)
      com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactFieldDescriptionsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactFieldDescriptionsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.class, com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.newBuilder()
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
      if (contactFieldDescriptionBuilder_ == null) {
        contactFieldDescription_ = java.util.Collections.emptyList();
      } else {
        contactFieldDescription_ = null;
        contactFieldDescriptionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactFieldDescriptionsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes build() {
      com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes result = new com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes result) {
      if (contactFieldDescriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contactFieldDescription_ = java.util.Collections.unmodifiableList(contactFieldDescription_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contactFieldDescription_ = contactFieldDescription_;
      } else {
        result.contactFieldDescription_ = contactFieldDescriptionBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes.getDefaultInstance()) return this;
      if (contactFieldDescriptionBuilder_ == null) {
        if (!other.contactFieldDescription_.isEmpty()) {
          if (contactFieldDescription_.isEmpty()) {
            contactFieldDescription_ = other.contactFieldDescription_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContactFieldDescriptionIsMutable();
            contactFieldDescription_.addAll(other.contactFieldDescription_);
          }
          onChanged();
        }
      } else {
        if (!other.contactFieldDescription_.isEmpty()) {
          if (contactFieldDescriptionBuilder_.isEmpty()) {
            contactFieldDescriptionBuilder_.dispose();
            contactFieldDescriptionBuilder_ = null;
            contactFieldDescription_ = other.contactFieldDescription_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contactFieldDescriptionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContactFieldDescriptionFieldBuilder() : null;
          } else {
            contactFieldDescriptionBuilder_.addAllMessages(other.contactFieldDescription_);
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
              com.tcn.cloud.api.api.v0alpha.ContactFieldDescription m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.parser(),
                      extensionRegistry);
              if (contactFieldDescriptionBuilder_ == null) {
                ensureContactFieldDescriptionIsMutable();
                contactFieldDescription_.add(m);
              } else {
                contactFieldDescriptionBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.ContactFieldDescription> contactFieldDescription_ =
      java.util.Collections.emptyList();
    private void ensureContactFieldDescriptionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contactFieldDescription_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.ContactFieldDescription>(contactFieldDescription_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ContactFieldDescription, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder, com.tcn.cloud.api.api.v0alpha.ContactFieldDescriptionOrBuilder> contactFieldDescriptionBuilder_;

    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.ContactFieldDescription> getContactFieldDescriptionList() {
      if (contactFieldDescriptionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contactFieldDescription_);
      } else {
        return contactFieldDescriptionBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public int getContactFieldDescriptionCount() {
      if (contactFieldDescriptionBuilder_ == null) {
        return contactFieldDescription_.size();
      } else {
        return contactFieldDescriptionBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription getContactFieldDescription(int index) {
      if (contactFieldDescriptionBuilder_ == null) {
        return contactFieldDescription_.get(index);
      } else {
        return contactFieldDescriptionBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder setContactFieldDescription(
        int index, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription value) {
      if (contactFieldDescriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactFieldDescriptionIsMutable();
        contactFieldDescription_.set(index, value);
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder setContactFieldDescription(
        int index, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder builderForValue) {
      if (contactFieldDescriptionBuilder_ == null) {
        ensureContactFieldDescriptionIsMutable();
        contactFieldDescription_.set(index, builderForValue.build());
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder addContactFieldDescription(com.tcn.cloud.api.api.v0alpha.ContactFieldDescription value) {
      if (contactFieldDescriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactFieldDescriptionIsMutable();
        contactFieldDescription_.add(value);
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder addContactFieldDescription(
        int index, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription value) {
      if (contactFieldDescriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactFieldDescriptionIsMutable();
        contactFieldDescription_.add(index, value);
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder addContactFieldDescription(
        com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder builderForValue) {
      if (contactFieldDescriptionBuilder_ == null) {
        ensureContactFieldDescriptionIsMutable();
        contactFieldDescription_.add(builderForValue.build());
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder addContactFieldDescription(
        int index, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder builderForValue) {
      if (contactFieldDescriptionBuilder_ == null) {
        ensureContactFieldDescriptionIsMutable();
        contactFieldDescription_.add(index, builderForValue.build());
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder addAllContactFieldDescription(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.ContactFieldDescription> values) {
      if (contactFieldDescriptionBuilder_ == null) {
        ensureContactFieldDescriptionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contactFieldDescription_);
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder clearContactFieldDescription() {
      if (contactFieldDescriptionBuilder_ == null) {
        contactFieldDescription_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public Builder removeContactFieldDescription(int index) {
      if (contactFieldDescriptionBuilder_ == null) {
        ensureContactFieldDescriptionIsMutable();
        contactFieldDescription_.remove(index);
        onChanged();
      } else {
        contactFieldDescriptionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder getContactFieldDescriptionBuilder(
        int index) {
      return getContactFieldDescriptionFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactFieldDescriptionOrBuilder getContactFieldDescriptionOrBuilder(
        int index) {
      if (contactFieldDescriptionBuilder_ == null) {
        return contactFieldDescription_.get(index);  } else {
        return contactFieldDescriptionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ContactFieldDescriptionOrBuilder> 
         getContactFieldDescriptionOrBuilderList() {
      if (contactFieldDescriptionBuilder_ != null) {
        return contactFieldDescriptionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contactFieldDescription_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder addContactFieldDescriptionBuilder() {
      return getContactFieldDescriptionFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder addContactFieldDescriptionBuilder(
        int index) {
      return getContactFieldDescriptionFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.ContactFieldDescription contact_field_description = 1 [json_name = "contactFieldDescription"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder> 
         getContactFieldDescriptionBuilderList() {
      return getContactFieldDescriptionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ContactFieldDescription, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder, com.tcn.cloud.api.api.v0alpha.ContactFieldDescriptionOrBuilder> 
        getContactFieldDescriptionFieldBuilder() {
      if (contactFieldDescriptionBuilder_ == null) {
        contactFieldDescriptionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ContactFieldDescription, com.tcn.cloud.api.api.v0alpha.ContactFieldDescription.Builder, com.tcn.cloud.api.api.v0alpha.ContactFieldDescriptionOrBuilder>(
                contactFieldDescription_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        contactFieldDescription_ = null;
      }
      return contactFieldDescriptionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListContactFieldDescriptionsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListContactFieldDescriptionsRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListContactFieldDescriptionsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListContactFieldDescriptionsRes>() {
    @java.lang.Override
    public ListContactFieldDescriptionsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListContactFieldDescriptionsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListContactFieldDescriptionsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListContactFieldDescriptionsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

