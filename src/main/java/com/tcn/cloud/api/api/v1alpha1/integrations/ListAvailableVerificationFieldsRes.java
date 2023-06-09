// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * <pre>
 * the available fields for the verification flow
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.integrations.ListAvailableVerificationFieldsRes}
 */
public final class ListAvailableVerificationFieldsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.ListAvailableVerificationFieldsRes)
    ListAvailableVerificationFieldsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAvailableVerificationFieldsRes.newBuilder() to construct.
  private ListAvailableVerificationFieldsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAvailableVerificationFieldsRes() {
    verificationFields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAvailableVerificationFieldsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListAvailableVerificationFieldsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListAvailableVerificationFieldsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.class, com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.Builder.class);
  }

  public static final int VERIFICATION_FIELDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.integrations.FieldDefinition> verificationFields_;
  /**
   * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.integrations.FieldDefinition> getVerificationFieldsList() {
    return verificationFields_;
  }
  /**
   * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder> 
      getVerificationFieldsOrBuilderList() {
    return verificationFields_;
  }
  /**
   * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
   */
  @java.lang.Override
  public int getVerificationFieldsCount() {
    return verificationFields_.size();
  }
  /**
   * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.integrations.FieldDefinition getVerificationFields(int index) {
    return verificationFields_.get(index);
  }
  /**
   * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder getVerificationFieldsOrBuilder(
      int index) {
    return verificationFields_.get(index);
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
    for (int i = 0; i < verificationFields_.size(); i++) {
      output.writeMessage(2, verificationFields_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < verificationFields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, verificationFields_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes other = (com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes) obj;

    if (!getVerificationFieldsList()
        .equals(other.getVerificationFieldsList())) return false;
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
    if (getVerificationFieldsCount() > 0) {
      hash = (37 * hash) + VERIFICATION_FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getVerificationFieldsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes prototype) {
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
   * the available fields for the verification flow
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.integrations.ListAvailableVerificationFieldsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.ListAvailableVerificationFieldsRes)
      com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListAvailableVerificationFieldsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListAvailableVerificationFieldsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.class, com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.newBuilder()
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
      if (verificationFieldsBuilder_ == null) {
        verificationFields_ = java.util.Collections.emptyList();
      } else {
        verificationFields_ = null;
        verificationFieldsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalsProto.internal_static_api_v1alpha1_integrations_ListAvailableVerificationFieldsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes result = new com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes result) {
      if (verificationFieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          verificationFields_ = java.util.Collections.unmodifiableList(verificationFields_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.verificationFields_ = verificationFields_;
      } else {
        result.verificationFields_ = verificationFieldsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes.getDefaultInstance()) return this;
      if (verificationFieldsBuilder_ == null) {
        if (!other.verificationFields_.isEmpty()) {
          if (verificationFields_.isEmpty()) {
            verificationFields_ = other.verificationFields_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVerificationFieldsIsMutable();
            verificationFields_.addAll(other.verificationFields_);
          }
          onChanged();
        }
      } else {
        if (!other.verificationFields_.isEmpty()) {
          if (verificationFieldsBuilder_.isEmpty()) {
            verificationFieldsBuilder_.dispose();
            verificationFieldsBuilder_ = null;
            verificationFields_ = other.verificationFields_;
            bitField0_ = (bitField0_ & ~0x00000001);
            verificationFieldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVerificationFieldsFieldBuilder() : null;
          } else {
            verificationFieldsBuilder_.addAllMessages(other.verificationFields_);
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
              com.tcn.cloud.api.api.commons.integrations.FieldDefinition m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.integrations.FieldDefinition.parser(),
                      extensionRegistry);
              if (verificationFieldsBuilder_ == null) {
                ensureVerificationFieldsIsMutable();
                verificationFields_.add(m);
              } else {
                verificationFieldsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.integrations.FieldDefinition> verificationFields_ =
      java.util.Collections.emptyList();
    private void ensureVerificationFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        verificationFields_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.integrations.FieldDefinition>(verificationFields_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.integrations.FieldDefinition, com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder, com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder> verificationFieldsBuilder_;

    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.integrations.FieldDefinition> getVerificationFieldsList() {
      if (verificationFieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(verificationFields_);
      } else {
        return verificationFieldsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public int getVerificationFieldsCount() {
      if (verificationFieldsBuilder_ == null) {
        return verificationFields_.size();
      } else {
        return verificationFieldsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public com.tcn.cloud.api.api.commons.integrations.FieldDefinition getVerificationFields(int index) {
      if (verificationFieldsBuilder_ == null) {
        return verificationFields_.get(index);
      } else {
        return verificationFieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder setVerificationFields(
        int index, com.tcn.cloud.api.api.commons.integrations.FieldDefinition value) {
      if (verificationFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerificationFieldsIsMutable();
        verificationFields_.set(index, value);
        onChanged();
      } else {
        verificationFieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder setVerificationFields(
        int index, com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder builderForValue) {
      if (verificationFieldsBuilder_ == null) {
        ensureVerificationFieldsIsMutable();
        verificationFields_.set(index, builderForValue.build());
        onChanged();
      } else {
        verificationFieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder addVerificationFields(com.tcn.cloud.api.api.commons.integrations.FieldDefinition value) {
      if (verificationFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerificationFieldsIsMutable();
        verificationFields_.add(value);
        onChanged();
      } else {
        verificationFieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder addVerificationFields(
        int index, com.tcn.cloud.api.api.commons.integrations.FieldDefinition value) {
      if (verificationFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerificationFieldsIsMutable();
        verificationFields_.add(index, value);
        onChanged();
      } else {
        verificationFieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder addVerificationFields(
        com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder builderForValue) {
      if (verificationFieldsBuilder_ == null) {
        ensureVerificationFieldsIsMutable();
        verificationFields_.add(builderForValue.build());
        onChanged();
      } else {
        verificationFieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder addVerificationFields(
        int index, com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder builderForValue) {
      if (verificationFieldsBuilder_ == null) {
        ensureVerificationFieldsIsMutable();
        verificationFields_.add(index, builderForValue.build());
        onChanged();
      } else {
        verificationFieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder addAllVerificationFields(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.integrations.FieldDefinition> values) {
      if (verificationFieldsBuilder_ == null) {
        ensureVerificationFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, verificationFields_);
        onChanged();
      } else {
        verificationFieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder clearVerificationFields() {
      if (verificationFieldsBuilder_ == null) {
        verificationFields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        verificationFieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public Builder removeVerificationFields(int index) {
      if (verificationFieldsBuilder_ == null) {
        ensureVerificationFieldsIsMutable();
        verificationFields_.remove(index);
        onChanged();
      } else {
        verificationFieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder getVerificationFieldsBuilder(
        int index) {
      return getVerificationFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder getVerificationFieldsOrBuilder(
        int index) {
      if (verificationFieldsBuilder_ == null) {
        return verificationFields_.get(index);  } else {
        return verificationFieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder> 
         getVerificationFieldsOrBuilderList() {
      if (verificationFieldsBuilder_ != null) {
        return verificationFieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(verificationFields_);
      }
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder addVerificationFieldsBuilder() {
      return getVerificationFieldsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.integrations.FieldDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder addVerificationFieldsBuilder(
        int index) {
      return getVerificationFieldsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.integrations.FieldDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.integrations.FieldDefinition verification_fields = 2 [json_name = "verificationFields"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder> 
         getVerificationFieldsBuilderList() {
      return getVerificationFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.integrations.FieldDefinition, com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder, com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder> 
        getVerificationFieldsFieldBuilder() {
      if (verificationFieldsBuilder_ == null) {
        verificationFieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.integrations.FieldDefinition, com.tcn.cloud.api.api.commons.integrations.FieldDefinition.Builder, com.tcn.cloud.api.api.commons.integrations.FieldDefinitionOrBuilder>(
                verificationFields_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        verificationFields_ = null;
      }
      return verificationFieldsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.ListAvailableVerificationFieldsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.ListAvailableVerificationFieldsRes)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAvailableVerificationFieldsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListAvailableVerificationFieldsRes>() {
    @java.lang.Override
    public ListAvailableVerificationFieldsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAvailableVerificationFieldsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAvailableVerificationFieldsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.ListAvailableVerificationFieldsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

