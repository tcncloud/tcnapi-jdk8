// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.FileTemplateFields}
 */
public final class FileTemplateFields extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.FileTemplateFields)
    FileTemplateFieldsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileTemplateFields.newBuilder() to construct.
  private FileTemplateFields(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileTemplateFields() {
    fields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileTemplateFields();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_FileTemplateFields_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_FileTemplateFields_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.FileTemplateFields.class, com.tcn.cloud.api.api.v0alpha.FileTemplateFields.Builder.class);
  }

  public static final int FIELDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.FileTemplateField> fields_;
  /**
   * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.FileTemplateField> getFieldsList() {
    return fields_;
  }
  /**
   * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.FileTemplateFieldOrBuilder> 
      getFieldsOrBuilderList() {
    return fields_;
  }
  /**
   * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FileTemplateField getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FileTemplateFieldOrBuilder getFieldsOrBuilder(
      int index) {
    return fields_.get(index);
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
    for (int i = 0; i < fields_.size(); i++) {
      output.writeMessage(1, fields_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, fields_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.FileTemplateFields)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.FileTemplateFields other = (com.tcn.cloud.api.api.v0alpha.FileTemplateFields) obj;

    if (!getFieldsList()
        .equals(other.getFieldsList())) return false;
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
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.FileTemplateFields prototype) {
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
   * Protobuf type {@code api.v0alpha.FileTemplateFields}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.FileTemplateFields)
      com.tcn.cloud.api.api.v0alpha.FileTemplateFieldsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_FileTemplateFields_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_FileTemplateFields_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.FileTemplateFields.class, com.tcn.cloud.api.api.v0alpha.FileTemplateFields.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.FileTemplateFields.newBuilder()
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
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
      } else {
        fields_ = null;
        fieldsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_FileTemplateFields_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.FileTemplateFields getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.FileTemplateFields.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.FileTemplateFields build() {
      com.tcn.cloud.api.api.v0alpha.FileTemplateFields result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.FileTemplateFields buildPartial() {
      com.tcn.cloud.api.api.v0alpha.FileTemplateFields result = new com.tcn.cloud.api.api.v0alpha.FileTemplateFields(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.FileTemplateFields result) {
      if (fieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fields_ = fields_;
      } else {
        result.fields_ = fieldsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.FileTemplateFields result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.FileTemplateFields) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.FileTemplateFields)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.FileTemplateFields other) {
      if (other == com.tcn.cloud.api.api.v0alpha.FileTemplateFields.getDefaultInstance()) return this;
      if (fieldsBuilder_ == null) {
        if (!other.fields_.isEmpty()) {
          if (fields_.isEmpty()) {
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFieldsIsMutable();
            fields_.addAll(other.fields_);
          }
          onChanged();
        }
      } else {
        if (!other.fields_.isEmpty()) {
          if (fieldsBuilder_.isEmpty()) {
            fieldsBuilder_.dispose();
            fieldsBuilder_ = null;
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fieldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFieldsFieldBuilder() : null;
          } else {
            fieldsBuilder_.addAllMessages(other.fields_);
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
              com.tcn.cloud.api.api.v0alpha.FileTemplateField m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.FileTemplateField.parser(),
                      extensionRegistry);
              if (fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                fields_.add(m);
              } else {
                fieldsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.FileTemplateField> fields_ =
      java.util.Collections.emptyList();
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fields_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.FileTemplateField>(fields_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.FileTemplateField, com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder, com.tcn.cloud.api.api.v0alpha.FileTemplateFieldOrBuilder> fieldsBuilder_;

    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.FileTemplateField> getFieldsList() {
      if (fieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fields_);
      } else {
        return fieldsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public int getFieldsCount() {
      if (fieldsBuilder_ == null) {
        return fields_.size();
      } else {
        return fieldsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplateField getFields(int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);
      } else {
        return fieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder setFields(
        int index, com.tcn.cloud.api.api.v0alpha.FileTemplateField value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.set(index, value);
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder setFields(
        int index, com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder addFields(com.tcn.cloud.api.api.v0alpha.FileTemplateField value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder addFields(
        int index, com.tcn.cloud.api.api.v0alpha.FileTemplateField value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(index, value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder addFields(
        com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder addFields(
        int index, com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.FileTemplateField> values) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fields_);
        onChanged();
      } else {
        fieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder clearFields() {
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public Builder removeFields(int index) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.remove(index);
        onChanged();
      } else {
        fieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder getFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplateFieldOrBuilder getFieldsOrBuilder(
        int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);  } else {
        return fieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.FileTemplateFieldOrBuilder> 
         getFieldsOrBuilderList() {
      if (fieldsBuilder_ != null) {
        return fieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fields_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder addFieldsBuilder() {
      return getFieldsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.FileTemplateField.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder addFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.FileTemplateField.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.FileTemplateField fields = 1 [json_name = "fields"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder> 
         getFieldsBuilderList() {
      return getFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.FileTemplateField, com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder, com.tcn.cloud.api.api.v0alpha.FileTemplateFieldOrBuilder> 
        getFieldsFieldBuilder() {
      if (fieldsBuilder_ == null) {
        fieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.FileTemplateField, com.tcn.cloud.api.api.v0alpha.FileTemplateField.Builder, com.tcn.cloud.api.api.v0alpha.FileTemplateFieldOrBuilder>(
                fields_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fields_ = null;
      }
      return fieldsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.FileTemplateFields)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.FileTemplateFields)
  private static final com.tcn.cloud.api.api.v0alpha.FileTemplateFields DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.FileTemplateFields();
  }

  public static com.tcn.cloud.api.api.v0alpha.FileTemplateFields getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileTemplateFields>
      PARSER = new com.google.protobuf.AbstractParser<FileTemplateFields>() {
    @java.lang.Override
    public FileTemplateFields parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileTemplateFields> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileTemplateFields> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FileTemplateFields getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

