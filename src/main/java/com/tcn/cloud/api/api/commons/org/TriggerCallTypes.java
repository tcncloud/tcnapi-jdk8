// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * TriggerCallTypes is the call types to use for the trigger
 * </pre>
 *
 * Protobuf type {@code api.commons.org.TriggerCallTypes}
 */
public final class TriggerCallTypes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.TriggerCallTypes)
    TriggerCallTypesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TriggerCallTypes.newBuilder() to construct.
  private TriggerCallTypes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TriggerCallTypes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TriggerCallTypes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_TriggerCallTypes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_TriggerCallTypes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.TriggerCallTypes.class, com.tcn.cloud.api.api.commons.org.TriggerCallTypes.Builder.class);
  }

  public static final int OUTBOUND_FIELD_NUMBER = 1;
  private boolean outbound_ = false;
  /**
   * <pre>
   * The call type for outbound calls
   * </pre>
   *
   * <code>bool outbound = 1 [json_name = "outbound"];</code>
   * @return The outbound.
   */
  @java.lang.Override
  public boolean getOutbound() {
    return outbound_;
  }

  public static final int INBOUND_FIELD_NUMBER = 2;
  private boolean inbound_ = false;
  /**
   * <pre>
   * The call type for inbound calls
   * </pre>
   *
   * <code>bool inbound = 2 [json_name = "inbound"];</code>
   * @return The inbound.
   */
  @java.lang.Override
  public boolean getInbound() {
    return inbound_;
  }

  public static final int MANUAL_FIELD_NUMBER = 3;
  private boolean manual_ = false;
  /**
   * <pre>
   * The call type for internal calls
   * </pre>
   *
   * <code>bool manual = 3 [json_name = "manual"];</code>
   * @return The manual.
   */
  @java.lang.Override
  public boolean getManual() {
    return manual_;
  }

  public static final int PREVIEW_FIELD_NUMBER = 4;
  private boolean preview_ = false;
  /**
   * <pre>
   * The call type for preview calls
   * </pre>
   *
   * <code>bool preview = 4 [json_name = "preview"];</code>
   * @return The preview.
   */
  @java.lang.Override
  public boolean getPreview() {
    return preview_;
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
    if (outbound_ != false) {
      output.writeBool(1, outbound_);
    }
    if (inbound_ != false) {
      output.writeBool(2, inbound_);
    }
    if (manual_ != false) {
      output.writeBool(3, manual_);
    }
    if (preview_ != false) {
      output.writeBool(4, preview_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (outbound_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, outbound_);
    }
    if (inbound_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, inbound_);
    }
    if (manual_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, manual_);
    }
    if (preview_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, preview_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.TriggerCallTypes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.TriggerCallTypes other = (com.tcn.cloud.api.api.commons.org.TriggerCallTypes) obj;

    if (getOutbound()
        != other.getOutbound()) return false;
    if (getInbound()
        != other.getInbound()) return false;
    if (getManual()
        != other.getManual()) return false;
    if (getPreview()
        != other.getPreview()) return false;
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
    hash = (37 * hash) + OUTBOUND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOutbound());
    hash = (37 * hash) + INBOUND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getInbound());
    hash = (37 * hash) + MANUAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getManual());
    hash = (37 * hash) + PREVIEW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPreview());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.TriggerCallTypes prototype) {
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
   * TriggerCallTypes is the call types to use for the trigger
   * </pre>
   *
   * Protobuf type {@code api.commons.org.TriggerCallTypes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.TriggerCallTypes)
      com.tcn.cloud.api.api.commons.org.TriggerCallTypesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_TriggerCallTypes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_TriggerCallTypes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.TriggerCallTypes.class, com.tcn.cloud.api.api.commons.org.TriggerCallTypes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.TriggerCallTypes.newBuilder()
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
      outbound_ = false;
      inbound_ = false;
      manual_ = false;
      preview_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_TriggerCallTypes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.TriggerCallTypes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.TriggerCallTypes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.TriggerCallTypes build() {
      com.tcn.cloud.api.api.commons.org.TriggerCallTypes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.TriggerCallTypes buildPartial() {
      com.tcn.cloud.api.api.commons.org.TriggerCallTypes result = new com.tcn.cloud.api.api.commons.org.TriggerCallTypes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.TriggerCallTypes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.outbound_ = outbound_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.inbound_ = inbound_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.manual_ = manual_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.preview_ = preview_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.TriggerCallTypes) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.TriggerCallTypes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.TriggerCallTypes other) {
      if (other == com.tcn.cloud.api.api.commons.org.TriggerCallTypes.getDefaultInstance()) return this;
      if (other.getOutbound() != false) {
        setOutbound(other.getOutbound());
      }
      if (other.getInbound() != false) {
        setInbound(other.getInbound());
      }
      if (other.getManual() != false) {
        setManual(other.getManual());
      }
      if (other.getPreview() != false) {
        setPreview(other.getPreview());
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
              outbound_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              inbound_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              manual_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              preview_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private boolean outbound_ ;
    /**
     * <pre>
     * The call type for outbound calls
     * </pre>
     *
     * <code>bool outbound = 1 [json_name = "outbound"];</code>
     * @return The outbound.
     */
    @java.lang.Override
    public boolean getOutbound() {
      return outbound_;
    }
    /**
     * <pre>
     * The call type for outbound calls
     * </pre>
     *
     * <code>bool outbound = 1 [json_name = "outbound"];</code>
     * @param value The outbound to set.
     * @return This builder for chaining.
     */
    public Builder setOutbound(boolean value) {

      outbound_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The call type for outbound calls
     * </pre>
     *
     * <code>bool outbound = 1 [json_name = "outbound"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOutbound() {
      bitField0_ = (bitField0_ & ~0x00000001);
      outbound_ = false;
      onChanged();
      return this;
    }

    private boolean inbound_ ;
    /**
     * <pre>
     * The call type for inbound calls
     * </pre>
     *
     * <code>bool inbound = 2 [json_name = "inbound"];</code>
     * @return The inbound.
     */
    @java.lang.Override
    public boolean getInbound() {
      return inbound_;
    }
    /**
     * <pre>
     * The call type for inbound calls
     * </pre>
     *
     * <code>bool inbound = 2 [json_name = "inbound"];</code>
     * @param value The inbound to set.
     * @return This builder for chaining.
     */
    public Builder setInbound(boolean value) {

      inbound_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The call type for inbound calls
     * </pre>
     *
     * <code>bool inbound = 2 [json_name = "inbound"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInbound() {
      bitField0_ = (bitField0_ & ~0x00000002);
      inbound_ = false;
      onChanged();
      return this;
    }

    private boolean manual_ ;
    /**
     * <pre>
     * The call type for internal calls
     * </pre>
     *
     * <code>bool manual = 3 [json_name = "manual"];</code>
     * @return The manual.
     */
    @java.lang.Override
    public boolean getManual() {
      return manual_;
    }
    /**
     * <pre>
     * The call type for internal calls
     * </pre>
     *
     * <code>bool manual = 3 [json_name = "manual"];</code>
     * @param value The manual to set.
     * @return This builder for chaining.
     */
    public Builder setManual(boolean value) {

      manual_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The call type for internal calls
     * </pre>
     *
     * <code>bool manual = 3 [json_name = "manual"];</code>
     * @return This builder for chaining.
     */
    public Builder clearManual() {
      bitField0_ = (bitField0_ & ~0x00000004);
      manual_ = false;
      onChanged();
      return this;
    }

    private boolean preview_ ;
    /**
     * <pre>
     * The call type for preview calls
     * </pre>
     *
     * <code>bool preview = 4 [json_name = "preview"];</code>
     * @return The preview.
     */
    @java.lang.Override
    public boolean getPreview() {
      return preview_;
    }
    /**
     * <pre>
     * The call type for preview calls
     * </pre>
     *
     * <code>bool preview = 4 [json_name = "preview"];</code>
     * @param value The preview to set.
     * @return This builder for chaining.
     */
    public Builder setPreview(boolean value) {

      preview_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The call type for preview calls
     * </pre>
     *
     * <code>bool preview = 4 [json_name = "preview"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPreview() {
      bitField0_ = (bitField0_ & ~0x00000008);
      preview_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.TriggerCallTypes)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.TriggerCallTypes)
  private static final com.tcn.cloud.api.api.commons.org.TriggerCallTypes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.TriggerCallTypes();
  }

  public static com.tcn.cloud.api.api.commons.org.TriggerCallTypes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TriggerCallTypes>
      PARSER = new com.google.protobuf.AbstractParser<TriggerCallTypes>() {
    @java.lang.Override
    public TriggerCallTypes parsePartialFrom(
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

  public static com.google.protobuf.Parser<TriggerCallTypes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TriggerCallTypes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.TriggerCallTypes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

