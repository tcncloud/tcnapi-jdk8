// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

/**
 * Protobuf type {@code api.v1alpha1.delivery.Credentials}
 */
public final class Credentials extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.delivery.Credentials)
    CredentialsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Credentials.newBuilder() to construct.
  private Credentials(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Credentials() {
    entities_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Credentials();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Credentials_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Credentials_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.class, com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.Builder.class);
  }

  public static final int ENTITIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Credential> entities_;
  /**
   * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Credential> getEntitiesList() {
    return entities_;
  }
  /**
   * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.delivery.CredentialOrBuilder> 
      getEntitiesOrBuilderList() {
    return entities_;
  }
  /**
   * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
   */
  @java.lang.Override
  public int getEntitiesCount() {
    return entities_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.Credential getEntities(int index) {
    return entities_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.CredentialOrBuilder getEntitiesOrBuilder(
      int index) {
    return entities_.get(index);
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
    for (int i = 0; i < entities_.size(); i++) {
      output.writeMessage(1, entities_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, entities_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.delivery.Credentials)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.delivery.Credentials other = (com.tcn.cloud.api.api.v1alpha1.delivery.Credentials) obj;

    if (!getEntitiesList()
        .equals(other.getEntitiesList())) return false;
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
    if (getEntitiesCount() > 0) {
      hash = (37 * hash) + ENTITIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntitiesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.delivery.Credentials prototype) {
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
   * Protobuf type {@code api.v1alpha1.delivery.Credentials}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.delivery.Credentials)
      com.tcn.cloud.api.api.v1alpha1.delivery.CredentialsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Credentials_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Credentials_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.class, com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.newBuilder()
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
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
      } else {
        entities_ = null;
        entitiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.ServiceProto.internal_static_api_v1alpha1_delivery_Credentials_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credentials getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credentials build() {
      com.tcn.cloud.api.api.v1alpha1.delivery.Credentials result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credentials buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.delivery.Credentials result = new com.tcn.cloud.api.api.v1alpha1.delivery.Credentials(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.delivery.Credentials result) {
      if (entitiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entities_ = java.util.Collections.unmodifiableList(entities_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entities_ = entities_;
      } else {
        result.entities_ = entitiesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.delivery.Credentials result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.delivery.Credentials) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.delivery.Credentials)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.delivery.Credentials other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.delivery.Credentials.getDefaultInstance()) return this;
      if (entitiesBuilder_ == null) {
        if (!other.entities_.isEmpty()) {
          if (entities_.isEmpty()) {
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntitiesIsMutable();
            entities_.addAll(other.entities_);
          }
          onChanged();
        }
      } else {
        if (!other.entities_.isEmpty()) {
          if (entitiesBuilder_.isEmpty()) {
            entitiesBuilder_.dispose();
            entitiesBuilder_ = null;
            entities_ = other.entities_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entitiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntitiesFieldBuilder() : null;
          } else {
            entitiesBuilder_.addAllMessages(other.entities_);
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
              com.tcn.cloud.api.api.v1alpha1.delivery.Credential m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.delivery.Credential.parser(),
                      extensionRegistry);
              if (entitiesBuilder_ == null) {
                ensureEntitiesIsMutable();
                entities_.add(m);
              } else {
                entitiesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Credential> entities_ =
      java.util.Collections.emptyList();
    private void ensureEntitiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entities_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.delivery.Credential>(entities_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.Credential, com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.CredentialOrBuilder> entitiesBuilder_;

    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Credential> getEntitiesList() {
      if (entitiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entities_);
      } else {
        return entitiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public int getEntitiesCount() {
      if (entitiesBuilder_ == null) {
        return entities_.size();
      } else {
        return entitiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credential getEntities(int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);
      } else {
        return entitiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder setEntities(
        int index, com.tcn.cloud.api.api.v1alpha1.delivery.Credential value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.set(index, value);
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder setEntities(
        int index, com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.set(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder addEntities(com.tcn.cloud.api.api.v1alpha1.delivery.Credential value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder addEntities(
        int index, com.tcn.cloud.api.api.v1alpha1.delivery.Credential value) {
      if (entitiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntitiesIsMutable();
        entities_.add(index, value);
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder addEntities(
        com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder addEntities(
        int index, com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder builderForValue) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.add(index, builderForValue.build());
        onChanged();
      } else {
        entitiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder addAllEntities(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.delivery.Credential> values) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entities_);
        onChanged();
      } else {
        entitiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder clearEntities() {
      if (entitiesBuilder_ == null) {
        entities_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entitiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public Builder removeEntities(int index) {
      if (entitiesBuilder_ == null) {
        ensureEntitiesIsMutable();
        entities_.remove(index);
        onChanged();
      } else {
        entitiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder getEntitiesBuilder(
        int index) {
      return getEntitiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.CredentialOrBuilder getEntitiesOrBuilder(
        int index) {
      if (entitiesBuilder_ == null) {
        return entities_.get(index);  } else {
        return entitiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.delivery.CredentialOrBuilder> 
         getEntitiesOrBuilderList() {
      if (entitiesBuilder_ != null) {
        return entitiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entities_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder addEntitiesBuilder() {
      return getEntitiesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.delivery.Credential.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder addEntitiesBuilder(
        int index) {
      return getEntitiesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.delivery.Credential.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.delivery.Credential entities = 1 [json_name = "entities"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder> 
         getEntitiesBuilderList() {
      return getEntitiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.delivery.Credential, com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.CredentialOrBuilder> 
        getEntitiesFieldBuilder() {
      if (entitiesBuilder_ == null) {
        entitiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.delivery.Credential, com.tcn.cloud.api.api.v1alpha1.delivery.Credential.Builder, com.tcn.cloud.api.api.v1alpha1.delivery.CredentialOrBuilder>(
                entities_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        entities_ = null;
      }
      return entitiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.delivery.Credentials)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.delivery.Credentials)
  private static final com.tcn.cloud.api.api.v1alpha1.delivery.Credentials DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.delivery.Credentials();
  }

  public static com.tcn.cloud.api.api.v1alpha1.delivery.Credentials getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Credentials>
      PARSER = new com.google.protobuf.AbstractParser<Credentials>() {
    @java.lang.Override
    public Credentials parsePartialFrom(
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

  public static com.google.protobuf.Parser<Credentials> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Credentials> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.delivery.Credentials getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

