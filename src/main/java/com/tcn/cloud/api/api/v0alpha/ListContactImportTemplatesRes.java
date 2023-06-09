// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListContactImportTemplatesRes}
 */
public final class ListContactImportTemplatesRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListContactImportTemplatesRes)
    ListContactImportTemplatesResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListContactImportTemplatesRes.newBuilder() to construct.
  private ListContactImportTemplatesRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListContactImportTemplatesRes() {
    contactImportTemplate_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListContactImportTemplatesRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactImportTemplatesRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactImportTemplatesRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.class, com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.Builder.class);
  }

  public static final int CONTACT_IMPORT_TEMPLATE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.ContactImportTemplate> contactImportTemplate_;
  /**
   * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.ContactImportTemplate> getContactImportTemplateList() {
    return contactImportTemplate_;
  }
  /**
   * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ContactImportTemplateOrBuilder> 
      getContactImportTemplateOrBuilderList() {
    return contactImportTemplate_;
  }
  /**
   * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
   */
  @java.lang.Override
  public int getContactImportTemplateCount() {
    return contactImportTemplate_.size();
  }
  /**
   * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ContactImportTemplate getContactImportTemplate(int index) {
    return contactImportTemplate_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ContactImportTemplateOrBuilder getContactImportTemplateOrBuilder(
      int index) {
    return contactImportTemplate_.get(index);
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
    for (int i = 0; i < contactImportTemplate_.size(); i++) {
      output.writeMessage(1, contactImportTemplate_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < contactImportTemplate_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, contactImportTemplate_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes other = (com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes) obj;

    if (!getContactImportTemplateList()
        .equals(other.getContactImportTemplateList())) return false;
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
    if (getContactImportTemplateCount() > 0) {
      hash = (37 * hash) + CONTACT_IMPORT_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getContactImportTemplateList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ListContactImportTemplatesRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListContactImportTemplatesRes)
      com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactImportTemplatesRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactImportTemplatesRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.class, com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.newBuilder()
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
      if (contactImportTemplateBuilder_ == null) {
        contactImportTemplate_ = java.util.Collections.emptyList();
      } else {
        contactImportTemplate_ = null;
        contactImportTemplateBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListContactImportTemplatesRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes build() {
      com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes result = new com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes result) {
      if (contactImportTemplateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contactImportTemplate_ = java.util.Collections.unmodifiableList(contactImportTemplate_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contactImportTemplate_ = contactImportTemplate_;
      } else {
        result.contactImportTemplate_ = contactImportTemplateBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes.getDefaultInstance()) return this;
      if (contactImportTemplateBuilder_ == null) {
        if (!other.contactImportTemplate_.isEmpty()) {
          if (contactImportTemplate_.isEmpty()) {
            contactImportTemplate_ = other.contactImportTemplate_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContactImportTemplateIsMutable();
            contactImportTemplate_.addAll(other.contactImportTemplate_);
          }
          onChanged();
        }
      } else {
        if (!other.contactImportTemplate_.isEmpty()) {
          if (contactImportTemplateBuilder_.isEmpty()) {
            contactImportTemplateBuilder_.dispose();
            contactImportTemplateBuilder_ = null;
            contactImportTemplate_ = other.contactImportTemplate_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contactImportTemplateBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getContactImportTemplateFieldBuilder() : null;
          } else {
            contactImportTemplateBuilder_.addAllMessages(other.contactImportTemplate_);
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
              com.tcn.cloud.api.api.v0alpha.ContactImportTemplate m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.parser(),
                      extensionRegistry);
              if (contactImportTemplateBuilder_ == null) {
                ensureContactImportTemplateIsMutable();
                contactImportTemplate_.add(m);
              } else {
                contactImportTemplateBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.ContactImportTemplate> contactImportTemplate_ =
      java.util.Collections.emptyList();
    private void ensureContactImportTemplateIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contactImportTemplate_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.ContactImportTemplate>(contactImportTemplate_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ContactImportTemplate, com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder, com.tcn.cloud.api.api.v0alpha.ContactImportTemplateOrBuilder> contactImportTemplateBuilder_;

    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.ContactImportTemplate> getContactImportTemplateList() {
      if (contactImportTemplateBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contactImportTemplate_);
      } else {
        return contactImportTemplateBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public int getContactImportTemplateCount() {
      if (contactImportTemplateBuilder_ == null) {
        return contactImportTemplate_.size();
      } else {
        return contactImportTemplateBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactImportTemplate getContactImportTemplate(int index) {
      if (contactImportTemplateBuilder_ == null) {
        return contactImportTemplate_.get(index);
      } else {
        return contactImportTemplateBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder setContactImportTemplate(
        int index, com.tcn.cloud.api.api.v0alpha.ContactImportTemplate value) {
      if (contactImportTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactImportTemplateIsMutable();
        contactImportTemplate_.set(index, value);
        onChanged();
      } else {
        contactImportTemplateBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder setContactImportTemplate(
        int index, com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder builderForValue) {
      if (contactImportTemplateBuilder_ == null) {
        ensureContactImportTemplateIsMutable();
        contactImportTemplate_.set(index, builderForValue.build());
        onChanged();
      } else {
        contactImportTemplateBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder addContactImportTemplate(com.tcn.cloud.api.api.v0alpha.ContactImportTemplate value) {
      if (contactImportTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactImportTemplateIsMutable();
        contactImportTemplate_.add(value);
        onChanged();
      } else {
        contactImportTemplateBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder addContactImportTemplate(
        int index, com.tcn.cloud.api.api.v0alpha.ContactImportTemplate value) {
      if (contactImportTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContactImportTemplateIsMutable();
        contactImportTemplate_.add(index, value);
        onChanged();
      } else {
        contactImportTemplateBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder addContactImportTemplate(
        com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder builderForValue) {
      if (contactImportTemplateBuilder_ == null) {
        ensureContactImportTemplateIsMutable();
        contactImportTemplate_.add(builderForValue.build());
        onChanged();
      } else {
        contactImportTemplateBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder addContactImportTemplate(
        int index, com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder builderForValue) {
      if (contactImportTemplateBuilder_ == null) {
        ensureContactImportTemplateIsMutable();
        contactImportTemplate_.add(index, builderForValue.build());
        onChanged();
      } else {
        contactImportTemplateBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder addAllContactImportTemplate(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.ContactImportTemplate> values) {
      if (contactImportTemplateBuilder_ == null) {
        ensureContactImportTemplateIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contactImportTemplate_);
        onChanged();
      } else {
        contactImportTemplateBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder clearContactImportTemplate() {
      if (contactImportTemplateBuilder_ == null) {
        contactImportTemplate_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contactImportTemplateBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public Builder removeContactImportTemplate(int index) {
      if (contactImportTemplateBuilder_ == null) {
        ensureContactImportTemplateIsMutable();
        contactImportTemplate_.remove(index);
        onChanged();
      } else {
        contactImportTemplateBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder getContactImportTemplateBuilder(
        int index) {
      return getContactImportTemplateFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactImportTemplateOrBuilder getContactImportTemplateOrBuilder(
        int index) {
      if (contactImportTemplateBuilder_ == null) {
        return contactImportTemplate_.get(index);  } else {
        return contactImportTemplateBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ContactImportTemplateOrBuilder> 
         getContactImportTemplateOrBuilderList() {
      if (contactImportTemplateBuilder_ != null) {
        return contactImportTemplateBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contactImportTemplate_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder addContactImportTemplateBuilder() {
      return getContactImportTemplateFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder addContactImportTemplateBuilder(
        int index) {
      return getContactImportTemplateFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.ContactImportTemplate contact_import_template = 1 [json_name = "contactImportTemplate"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder> 
         getContactImportTemplateBuilderList() {
      return getContactImportTemplateFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ContactImportTemplate, com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder, com.tcn.cloud.api.api.v0alpha.ContactImportTemplateOrBuilder> 
        getContactImportTemplateFieldBuilder() {
      if (contactImportTemplateBuilder_ == null) {
        contactImportTemplateBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ContactImportTemplate, com.tcn.cloud.api.api.v0alpha.ContactImportTemplate.Builder, com.tcn.cloud.api.api.v0alpha.ContactImportTemplateOrBuilder>(
                contactImportTemplate_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        contactImportTemplate_ = null;
      }
      return contactImportTemplateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListContactImportTemplatesRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListContactImportTemplatesRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListContactImportTemplatesRes>
      PARSER = new com.google.protobuf.AbstractParser<ListContactImportTemplatesRes>() {
    @java.lang.Override
    public ListContactImportTemplatesRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListContactImportTemplatesRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListContactImportTemplatesRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListContactImportTemplatesRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

