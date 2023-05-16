// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.DeDupCriteria}
 */
public final class DeDupCriteria extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DeDupCriteria)
    DeDupCriteriaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeDupCriteria.newBuilder() to construct.
  private DeDupCriteria(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeDupCriteria() {
    action_ = 0;
    fields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeDupCriteria();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeDupCriteria_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeDupCriteria_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DeDupCriteria.class, com.tcn.cloud.api.api.v0alpha.DeDupCriteria.Builder.class);
  }

  public static final int ACTION_FIELD_NUMBER = 3;
  private int action_ = 0;
  /**
   * <code>.api.commons.DeDupActions action = 3 [json_name = "action"];</code>
   * @return The enum numeric value on the wire for action.
   */
  @java.lang.Override public int getActionValue() {
    return action_;
  }
  /**
   * <code>.api.commons.DeDupActions action = 3 [json_name = "action"];</code>
   * @return The action.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.DeDupActions getAction() {
    com.tcn.cloud.api.api.commons.DeDupActions result = com.tcn.cloud.api.api.commons.DeDupActions.forNumber(action_);
    return result == null ? com.tcn.cloud.api.api.commons.DeDupActions.UNRECOGNIZED : result;
  }

  public static final int FIELDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex> fields_;
  /**
   * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex> getFieldsList() {
    return fields_;
  }
  /**
   * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder> 
      getFieldsOrBuilderList() {
    return fields_;
  }
  /**
   * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FieldIndex getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder getFieldsOrBuilder(
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
      output.writeMessage(2, fields_.get(i));
    }
    if (action_ != com.tcn.cloud.api.api.commons.DeDupActions.DE_DUP_ACTIONS_KEEP_FIRST.getNumber()) {
      output.writeEnum(3, action_);
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
        .computeMessageSize(2, fields_.get(i));
    }
    if (action_ != com.tcn.cloud.api.api.commons.DeDupActions.DE_DUP_ACTIONS_KEEP_FIRST.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, action_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DeDupCriteria)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DeDupCriteria other = (com.tcn.cloud.api.api.v0alpha.DeDupCriteria) obj;

    if (action_ != other.action_) return false;
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
    hash = (37 * hash) + ACTION_FIELD_NUMBER;
    hash = (53 * hash) + action_;
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DeDupCriteria prototype) {
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
   * Protobuf type {@code api.v0alpha.DeDupCriteria}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DeDupCriteria)
      com.tcn.cloud.api.api.v0alpha.DeDupCriteriaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeDupCriteria_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeDupCriteria_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DeDupCriteria.class, com.tcn.cloud.api.api.v0alpha.DeDupCriteria.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DeDupCriteria.newBuilder()
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
      action_ = 0;
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
      } else {
        fields_ = null;
        fieldsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DeDupCriteria_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeDupCriteria getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DeDupCriteria.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeDupCriteria build() {
      com.tcn.cloud.api.api.v0alpha.DeDupCriteria result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DeDupCriteria buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DeDupCriteria result = new com.tcn.cloud.api.api.v0alpha.DeDupCriteria(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.DeDupCriteria result) {
      if (fieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.fields_ = fields_;
      } else {
        result.fields_ = fieldsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DeDupCriteria result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.action_ = action_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DeDupCriteria) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DeDupCriteria)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DeDupCriteria other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DeDupCriteria.getDefaultInstance()) return this;
      if (other.action_ != 0) {
        setActionValue(other.getActionValue());
      }
      if (fieldsBuilder_ == null) {
        if (!other.fields_.isEmpty()) {
          if (fields_.isEmpty()) {
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000002);
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
            bitField0_ = (bitField0_ & ~0x00000002);
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
            case 18: {
              com.tcn.cloud.api.api.v0alpha.FieldIndex m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.FieldIndex.parser(),
                      extensionRegistry);
              if (fieldsBuilder_ == null) {
                ensureFieldsIsMutable();
                fields_.add(m);
              } else {
                fieldsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 24: {
              action_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
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

    private int action_ = 0;
    /**
     * <code>.api.commons.DeDupActions action = 3 [json_name = "action"];</code>
     * @return The enum numeric value on the wire for action.
     */
    @java.lang.Override public int getActionValue() {
      return action_;
    }
    /**
     * <code>.api.commons.DeDupActions action = 3 [json_name = "action"];</code>
     * @param value The enum numeric value on the wire for action to set.
     * @return This builder for chaining.
     */
    public Builder setActionValue(int value) {
      action_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.DeDupActions action = 3 [json_name = "action"];</code>
     * @return The action.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DeDupActions getAction() {
      com.tcn.cloud.api.api.commons.DeDupActions result = com.tcn.cloud.api.api.commons.DeDupActions.forNumber(action_);
      return result == null ? com.tcn.cloud.api.api.commons.DeDupActions.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.DeDupActions action = 3 [json_name = "action"];</code>
     * @param value The action to set.
     * @return This builder for chaining.
     */
    public Builder setAction(com.tcn.cloud.api.api.commons.DeDupActions value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      action_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.DeDupActions action = 3 [json_name = "action"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      action_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex> fields_ =
      java.util.Collections.emptyList();
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        fields_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.FieldIndex>(fields_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.FieldIndex, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder, com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder> fieldsBuilder_;

    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex> getFieldsList() {
      if (fieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fields_);
      } else {
        return fieldsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public int getFieldsCount() {
      if (fieldsBuilder_ == null) {
        return fields_.size();
      } else {
        return fieldsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndex getFields(int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);
      } else {
        return fieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public Builder setFields(
        int index, com.tcn.cloud.api.api.v0alpha.FieldIndex value) {
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
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public Builder setFields(
        int index, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder builderForValue) {
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
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public Builder addFields(com.tcn.cloud.api.api.v0alpha.FieldIndex value) {
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
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public Builder addFields(
        int index, com.tcn.cloud.api.api.v0alpha.FieldIndex value) {
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
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public Builder addFields(
        com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder builderForValue) {
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
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public Builder addFields(
        int index, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder builderForValue) {
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
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.FieldIndex> values) {
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
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public Builder clearFields() {
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
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
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder getFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder getFieldsOrBuilder(
        int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);  } else {
        return fieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder> 
         getFieldsOrBuilderList() {
      if (fieldsBuilder_ != null) {
        return fieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fields_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder addFieldsBuilder() {
      return getFieldsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.FieldIndex.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder addFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.FieldIndex.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.FieldIndex fields = 2 [json_name = "fields"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder> 
         getFieldsBuilderList() {
      return getFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.FieldIndex, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder, com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder> 
        getFieldsFieldBuilder() {
      if (fieldsBuilder_ == null) {
        fieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.FieldIndex, com.tcn.cloud.api.api.v0alpha.FieldIndex.Builder, com.tcn.cloud.api.api.v0alpha.FieldIndexOrBuilder>(
                fields_,
                ((bitField0_ & 0x00000002) != 0),
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DeDupCriteria)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DeDupCriteria)
  private static final com.tcn.cloud.api.api.v0alpha.DeDupCriteria DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DeDupCriteria();
  }

  public static com.tcn.cloud.api.api.v0alpha.DeDupCriteria getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeDupCriteria>
      PARSER = new com.google.protobuf.AbstractParser<DeDupCriteria>() {
    @java.lang.Override
    public DeDupCriteria parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeDupCriteria> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeDupCriteria> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DeDupCriteria getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

