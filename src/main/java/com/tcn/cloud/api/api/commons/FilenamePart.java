// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/bireportgenerator.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.FilenamePart}
 */
public final class FilenamePart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.FilenamePart)
    FilenamePartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilenamePart.newBuilder() to construct.
  private FilenamePart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilenamePart() {
    type_ = 0;
    staticText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FilenamePart();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_FilenamePart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_FilenamePart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.FilenamePart.class, com.tcn.cloud.api.api.commons.FilenamePart.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * type is the type of the filename part.
   * </pre>
   *
   * <code>.api.commons.FilenamePartType type = 1 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * type is the type of the filename part.
   * </pre>
   *
   * <code>.api.commons.FilenamePartType type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.FilenamePartType getType() {
    com.tcn.cloud.api.api.commons.FilenamePartType result = com.tcn.cloud.api.api.commons.FilenamePartType.forNumber(type_);
    return result == null ? com.tcn.cloud.api.api.commons.FilenamePartType.UNRECOGNIZED : result;
  }

  public static final int STATIC_TEXT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object staticText_ = "";
  /**
   * <pre>
   * static_text is the static text for the filename part.
   * </pre>
   *
   * <code>string static_text = 2 [json_name = "staticText"];</code>
   * @return The staticText.
   */
  @java.lang.Override
  public java.lang.String getStaticText() {
    java.lang.Object ref = staticText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      staticText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * static_text is the static text for the filename part.
   * </pre>
   *
   * <code>string static_text = 2 [json_name = "staticText"];</code>
   * @return The bytes for staticText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStaticTextBytes() {
    java.lang.Object ref = staticText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      staticText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (type_ != com.tcn.cloud.api.api.commons.FilenamePartType.FILENAME_PART_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staticText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, staticText_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.tcn.cloud.api.api.commons.FilenamePartType.FILENAME_PART_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(staticText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, staticText_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.FilenamePart)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.FilenamePart other = (com.tcn.cloud.api.api.commons.FilenamePart) obj;

    if (type_ != other.type_) return false;
    if (!getStaticText()
        .equals(other.getStaticText())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + STATIC_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getStaticText().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.FilenamePart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.FilenamePart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.FilenamePart parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.FilenamePart prototype) {
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
   * Protobuf type {@code api.commons.FilenamePart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.FilenamePart)
      com.tcn.cloud.api.api.commons.FilenamePartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_FilenamePart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_FilenamePart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.FilenamePart.class, com.tcn.cloud.api.api.commons.FilenamePart.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.FilenamePart.newBuilder()
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
      type_ = 0;
      staticText_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_FilenamePart_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.FilenamePart getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.FilenamePart.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.FilenamePart build() {
      com.tcn.cloud.api.api.commons.FilenamePart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.FilenamePart buildPartial() {
      com.tcn.cloud.api.api.commons.FilenamePart result = new com.tcn.cloud.api.api.commons.FilenamePart(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.FilenamePart result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.staticText_ = staticText_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.FilenamePart) {
        return mergeFrom((com.tcn.cloud.api.api.commons.FilenamePart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.FilenamePart other) {
      if (other == com.tcn.cloud.api.api.commons.FilenamePart.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getStaticText().isEmpty()) {
        staticText_ = other.staticText_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              staticText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private int type_ = 0;
    /**
     * <pre>
     * type is the type of the filename part.
     * </pre>
     *
     * <code>.api.commons.FilenamePartType type = 1 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * type is the type of the filename part.
     * </pre>
     *
     * <code>.api.commons.FilenamePartType type = 1 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * type is the type of the filename part.
     * </pre>
     *
     * <code>.api.commons.FilenamePartType type = 1 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.FilenamePartType getType() {
      com.tcn.cloud.api.api.commons.FilenamePartType result = com.tcn.cloud.api.api.commons.FilenamePartType.forNumber(type_);
      return result == null ? com.tcn.cloud.api.api.commons.FilenamePartType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * type is the type of the filename part.
     * </pre>
     *
     * <code>.api.commons.FilenamePartType type = 1 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.tcn.cloud.api.api.commons.FilenamePartType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * type is the type of the filename part.
     * </pre>
     *
     * <code>.api.commons.FilenamePartType type = 1 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object staticText_ = "";
    /**
     * <pre>
     * static_text is the static text for the filename part.
     * </pre>
     *
     * <code>string static_text = 2 [json_name = "staticText"];</code>
     * @return The staticText.
     */
    public java.lang.String getStaticText() {
      java.lang.Object ref = staticText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        staticText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * static_text is the static text for the filename part.
     * </pre>
     *
     * <code>string static_text = 2 [json_name = "staticText"];</code>
     * @return The bytes for staticText.
     */
    public com.google.protobuf.ByteString
        getStaticTextBytes() {
      java.lang.Object ref = staticText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        staticText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * static_text is the static text for the filename part.
     * </pre>
     *
     * <code>string static_text = 2 [json_name = "staticText"];</code>
     * @param value The staticText to set.
     * @return This builder for chaining.
     */
    public Builder setStaticText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      staticText_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * static_text is the static text for the filename part.
     * </pre>
     *
     * <code>string static_text = 2 [json_name = "staticText"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStaticText() {
      staticText_ = getDefaultInstance().getStaticText();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * static_text is the static text for the filename part.
     * </pre>
     *
     * <code>string static_text = 2 [json_name = "staticText"];</code>
     * @param value The bytes for staticText to set.
     * @return This builder for chaining.
     */
    public Builder setStaticTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      staticText_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.commons.FilenamePart)
  }

  // @@protoc_insertion_point(class_scope:api.commons.FilenamePart)
  private static final com.tcn.cloud.api.api.commons.FilenamePart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.FilenamePart();
  }

  public static com.tcn.cloud.api.api.commons.FilenamePart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilenamePart>
      PARSER = new com.google.protobuf.AbstractParser<FilenamePart>() {
    @java.lang.Override
    public FilenamePart parsePartialFrom(
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

  public static com.google.protobuf.Parser<FilenamePart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilenamePart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.FilenamePart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

