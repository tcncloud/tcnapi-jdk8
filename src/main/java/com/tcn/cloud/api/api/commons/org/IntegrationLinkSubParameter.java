// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * IntegrationLinkSubParameter defines a sub parameter for an integration link.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.IntegrationLinkSubParameter}
 */
public final class IntegrationLinkSubParameter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.IntegrationLinkSubParameter)
    IntegrationLinkSubParameterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IntegrationLinkSubParameter.newBuilder() to construct.
  private IntegrationLinkSubParameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IntegrationLinkSubParameter() {
    key_ = "";
    parts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IntegrationLinkSubParameter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_IntegrationLinkSubParameter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_IntegrationLinkSubParameter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter.class, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   * <pre>
   * The sub parameter key is the field name of the integration link.
   * </pre>
   *
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The sub parameter key is the field name of the integration link.
   * </pre>
   *
   * <code>string key = 1 [json_name = "key"];</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart> parts_;
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart> getPartsList() {
    return parts_;
  }
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder> 
      getPartsOrBuilderList() {
    return parts_;
  }
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  @java.lang.Override
  public int getPartsCount() {
    return parts_.size();
  }
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart getParts(int index) {
    return parts_.get(index);
  }
  /**
   * <pre>
   * The parts of the sub parameter.
   * </pre>
   *
   * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder getPartsOrBuilder(
      int index) {
    return parts_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    for (int i = 0; i < parts_.size(); i++) {
      output.writeMessage(2, parts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    for (int i = 0; i < parts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, parts_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter other = (com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getPartsList()
        .equals(other.getPartsList())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (getPartsCount() > 0) {
      hash = (37 * hash) + PARTS_FIELD_NUMBER;
      hash = (53 * hash) + getPartsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter prototype) {
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
   * IntegrationLinkSubParameter defines a sub parameter for an integration link.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.IntegrationLinkSubParameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.IntegrationLinkSubParameter)
      com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_IntegrationLinkSubParameter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_IntegrationLinkSubParameter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter.class, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter.newBuilder()
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
      key_ = "";
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
      } else {
        parts_ = null;
        partsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_IntegrationLinkSubParameter_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter build() {
      com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter buildPartial() {
      com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter result = new com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter result) {
      if (partsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          parts_ = java.util.Collections.unmodifiableList(parts_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.parts_ = parts_;
      } else {
        result.parts_ = partsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter other) {
      if (other == com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (partsBuilder_ == null) {
        if (!other.parts_.isEmpty()) {
          if (parts_.isEmpty()) {
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePartsIsMutable();
            parts_.addAll(other.parts_);
          }
          onChanged();
        }
      } else {
        if (!other.parts_.isEmpty()) {
          if (partsBuilder_.isEmpty()) {
            partsBuilder_.dispose();
            partsBuilder_ = null;
            parts_ = other.parts_;
            bitField0_ = (bitField0_ & ~0x00000002);
            partsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPartsFieldBuilder() : null;
          } else {
            partsBuilder_.addAllMessages(other.parts_);
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
              key_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.parser(),
                      extensionRegistry);
              if (partsBuilder_ == null) {
                ensurePartsIsMutable();
                parts_.add(m);
              } else {
                partsBuilder_.addMessage(m);
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

    private java.lang.Object key_ = "";
    /**
     * <pre>
     * The sub parameter key is the field name of the integration link.
     * </pre>
     *
     * <code>string key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The sub parameter key is the field name of the integration link.
     * </pre>
     *
     * <code>string key = 1 [json_name = "key"];</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The sub parameter key is the field name of the integration link.
     * </pre>
     *
     * <code>string key = 1 [json_name = "key"];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sub parameter key is the field name of the integration link.
     * </pre>
     *
     * <code>string key = 1 [json_name = "key"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sub parameter key is the field name of the integration link.
     * </pre>
     *
     * <code>string key = 1 [json_name = "key"];</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart> parts_ =
      java.util.Collections.emptyList();
    private void ensurePartsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        parts_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart>(parts_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder> partsBuilder_;

    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart> getPartsList() {
      if (partsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parts_);
      } else {
        return partsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public int getPartsCount() {
      if (partsBuilder_ == null) {
        return parts_.size();
      } else {
        return partsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart getParts(int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);
      } else {
        return partsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder setParts(
        int index, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.set(index, value);
        onChanged();
      } else {
        partsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder setParts(
        int index, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.set(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder addParts(com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(value);
        onChanged();
      } else {
        partsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder addParts(
        int index, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart value) {
      if (partsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartsIsMutable();
        parts_.add(index, value);
        onChanged();
      } else {
        partsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder addParts(
        com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder addParts(
        int index, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder builderForValue) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.add(index, builderForValue.build());
        onChanged();
      } else {
        partsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder addAllParts(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart> values) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parts_);
        onChanged();
      } else {
        partsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder clearParts() {
      if (partsBuilder_ == null) {
        parts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        partsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public Builder removeParts(int index) {
      if (partsBuilder_ == null) {
        ensurePartsIsMutable();
        parts_.remove(index);
        onChanged();
      } else {
        partsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder getPartsBuilder(
        int index) {
      return getPartsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder getPartsOrBuilder(
        int index) {
      if (partsBuilder_ == null) {
        return parts_.get(index);  } else {
        return partsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder> 
         getPartsOrBuilderList() {
      if (partsBuilder_ != null) {
        return partsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parts_);
      }
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder addPartsBuilder() {
      return getPartsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.getDefaultInstance());
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder addPartsBuilder(
        int index) {
      return getPartsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.getDefaultInstance());
    }
    /**
     * <pre>
     * The parts of the sub parameter.
     * </pre>
     *
     * <code>repeated .api.commons.org.IntegrationLinkSubParameterPart parts = 2 [json_name = "parts"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder> 
         getPartsBuilderList() {
      return getPartsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder> 
        getPartsFieldBuilder() {
      if (partsBuilder_ == null) {
        partsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPart.Builder, com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameterPartOrBuilder>(
                parts_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        parts_ = null;
      }
      return partsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.IntegrationLinkSubParameter)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.IntegrationLinkSubParameter)
  private static final com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter();
  }

  public static com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IntegrationLinkSubParameter>
      PARSER = new com.google.protobuf.AbstractParser<IntegrationLinkSubParameter>() {
    @java.lang.Override
    public IntegrationLinkSubParameter parsePartialFrom(
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

  public static com.google.protobuf.Parser<IntegrationLinkSubParameter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IntegrationLinkSubParameter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.IntegrationLinkSubParameter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

