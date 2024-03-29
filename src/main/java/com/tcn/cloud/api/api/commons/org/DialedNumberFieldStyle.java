// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * The DialedNumberFieldStyle contains the field style for Dialed Number Field
 * </pre>
 *
 * Protobuf type {@code api.commons.org.DialedNumberFieldStyle}
 */
public final class DialedNumberFieldStyle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.DialedNumberFieldStyle)
    DialedNumberFieldStyleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DialedNumberFieldStyle.newBuilder() to construct.
  private DialedNumberFieldStyle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DialedNumberFieldStyle() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DialedNumberFieldStyle();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_DialedNumberFieldStyle_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_DialedNumberFieldStyle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle.class, com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle.Builder.class);
  }

  public static final int FIELD_STYLE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.org.FieldStyle fieldStyle_;
  /**
   * <pre>
   * The field style of the dialed number field
   * </pre>
   *
   * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
   * @return Whether the fieldStyle field is set.
   */
  @java.lang.Override
  public boolean hasFieldStyle() {
    return fieldStyle_ != null;
  }
  /**
   * <pre>
   * The field style of the dialed number field
   * </pre>
   *
   * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
   * @return The fieldStyle.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.FieldStyle getFieldStyle() {
    return fieldStyle_ == null ? com.tcn.cloud.api.api.commons.org.FieldStyle.getDefaultInstance() : fieldStyle_;
  }
  /**
   * <pre>
   * The field style of the dialed number field
   * </pre>
   *
   * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.FieldStyleOrBuilder getFieldStyleOrBuilder() {
    return fieldStyle_ == null ? com.tcn.cloud.api.api.commons.org.FieldStyle.getDefaultInstance() : fieldStyle_;
  }

  public static final int DISPLAY_TO_AGENT_FIELD_NUMBER = 2;
  private boolean displayToAgent_ = false;
  /**
   * <pre>
   * Display the dialed number field to the agent
   * </pre>
   *
   * <code>bool display_to_agent = 2 [json_name = "displayToAgent"];</code>
   * @return The displayToAgent.
   */
  @java.lang.Override
  public boolean getDisplayToAgent() {
    return displayToAgent_;
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
    if (fieldStyle_ != null) {
      output.writeMessage(1, getFieldStyle());
    }
    if (displayToAgent_ != false) {
      output.writeBool(2, displayToAgent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fieldStyle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFieldStyle());
    }
    if (displayToAgent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, displayToAgent_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle other = (com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle) obj;

    if (hasFieldStyle() != other.hasFieldStyle()) return false;
    if (hasFieldStyle()) {
      if (!getFieldStyle()
          .equals(other.getFieldStyle())) return false;
    }
    if (getDisplayToAgent()
        != other.getDisplayToAgent()) return false;
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
    if (hasFieldStyle()) {
      hash = (37 * hash) + FIELD_STYLE_FIELD_NUMBER;
      hash = (53 * hash) + getFieldStyle().hashCode();
    }
    hash = (37 * hash) + DISPLAY_TO_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisplayToAgent());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle prototype) {
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
   * The DialedNumberFieldStyle contains the field style for Dialed Number Field
   * </pre>
   *
   * Protobuf type {@code api.commons.org.DialedNumberFieldStyle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.DialedNumberFieldStyle)
      com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_DialedNumberFieldStyle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_DialedNumberFieldStyle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle.class, com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle.newBuilder()
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
      fieldStyle_ = null;
      if (fieldStyleBuilder_ != null) {
        fieldStyleBuilder_.dispose();
        fieldStyleBuilder_ = null;
      }
      displayToAgent_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.HuntgroupProto.internal_static_api_commons_org_DialedNumberFieldStyle_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle build() {
      com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle buildPartial() {
      com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle result = new com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fieldStyle_ = fieldStyleBuilder_ == null
            ? fieldStyle_
            : fieldStyleBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.displayToAgent_ = displayToAgent_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle other) {
      if (other == com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle.getDefaultInstance()) return this;
      if (other.hasFieldStyle()) {
        mergeFieldStyle(other.getFieldStyle());
      }
      if (other.getDisplayToAgent() != false) {
        setDisplayToAgent(other.getDisplayToAgent());
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
              input.readMessage(
                  getFieldStyleFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              displayToAgent_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.tcn.cloud.api.api.commons.org.FieldStyle fieldStyle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.FieldStyle, com.tcn.cloud.api.api.commons.org.FieldStyle.Builder, com.tcn.cloud.api.api.commons.org.FieldStyleOrBuilder> fieldStyleBuilder_;
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     * @return Whether the fieldStyle field is set.
     */
    public boolean hasFieldStyle() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     * @return The fieldStyle.
     */
    public com.tcn.cloud.api.api.commons.org.FieldStyle getFieldStyle() {
      if (fieldStyleBuilder_ == null) {
        return fieldStyle_ == null ? com.tcn.cloud.api.api.commons.org.FieldStyle.getDefaultInstance() : fieldStyle_;
      } else {
        return fieldStyleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     */
    public Builder setFieldStyle(com.tcn.cloud.api.api.commons.org.FieldStyle value) {
      if (fieldStyleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldStyle_ = value;
      } else {
        fieldStyleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     */
    public Builder setFieldStyle(
        com.tcn.cloud.api.api.commons.org.FieldStyle.Builder builderForValue) {
      if (fieldStyleBuilder_ == null) {
        fieldStyle_ = builderForValue.build();
      } else {
        fieldStyleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     */
    public Builder mergeFieldStyle(com.tcn.cloud.api.api.commons.org.FieldStyle value) {
      if (fieldStyleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          fieldStyle_ != null &&
          fieldStyle_ != com.tcn.cloud.api.api.commons.org.FieldStyle.getDefaultInstance()) {
          getFieldStyleBuilder().mergeFrom(value);
        } else {
          fieldStyle_ = value;
        }
      } else {
        fieldStyleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     */
    public Builder clearFieldStyle() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fieldStyle_ = null;
      if (fieldStyleBuilder_ != null) {
        fieldStyleBuilder_.dispose();
        fieldStyleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.FieldStyle.Builder getFieldStyleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFieldStyleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.FieldStyleOrBuilder getFieldStyleOrBuilder() {
      if (fieldStyleBuilder_ != null) {
        return fieldStyleBuilder_.getMessageOrBuilder();
      } else {
        return fieldStyle_ == null ?
            com.tcn.cloud.api.api.commons.org.FieldStyle.getDefaultInstance() : fieldStyle_;
      }
    }
    /**
     * <pre>
     * The field style of the dialed number field
     * </pre>
     *
     * <code>.api.commons.org.FieldStyle field_style = 1 [json_name = "fieldStyle"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.FieldStyle, com.tcn.cloud.api.api.commons.org.FieldStyle.Builder, com.tcn.cloud.api.api.commons.org.FieldStyleOrBuilder> 
        getFieldStyleFieldBuilder() {
      if (fieldStyleBuilder_ == null) {
        fieldStyleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.FieldStyle, com.tcn.cloud.api.api.commons.org.FieldStyle.Builder, com.tcn.cloud.api.api.commons.org.FieldStyleOrBuilder>(
                getFieldStyle(),
                getParentForChildren(),
                isClean());
        fieldStyle_ = null;
      }
      return fieldStyleBuilder_;
    }

    private boolean displayToAgent_ ;
    /**
     * <pre>
     * Display the dialed number field to the agent
     * </pre>
     *
     * <code>bool display_to_agent = 2 [json_name = "displayToAgent"];</code>
     * @return The displayToAgent.
     */
    @java.lang.Override
    public boolean getDisplayToAgent() {
      return displayToAgent_;
    }
    /**
     * <pre>
     * Display the dialed number field to the agent
     * </pre>
     *
     * <code>bool display_to_agent = 2 [json_name = "displayToAgent"];</code>
     * @param value The displayToAgent to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayToAgent(boolean value) {

      displayToAgent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Display the dialed number field to the agent
     * </pre>
     *
     * <code>bool display_to_agent = 2 [json_name = "displayToAgent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayToAgent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      displayToAgent_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.DialedNumberFieldStyle)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.DialedNumberFieldStyle)
  private static final com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle();
  }

  public static com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DialedNumberFieldStyle>
      PARSER = new com.google.protobuf.AbstractParser<DialedNumberFieldStyle>() {
    @java.lang.Override
    public DialedNumberFieldStyle parsePartialFrom(
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

  public static com.google.protobuf.Parser<DialedNumberFieldStyle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DialedNumberFieldStyle> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

