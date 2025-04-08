// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/entities.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

/**
 * <pre>
 * Message for Export Options
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.explorer.ExportOptions}
 */
public final class ExportOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.explorer.ExportOptions)
    ExportOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportOptions.newBuilder() to construct.
  private ExportOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportOptions() {
    delimiter_ = "";
    quoteCharacter_ = 0;
    fileExtension_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_ExportOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_ExportOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions.class, com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions.Builder.class);
  }

  public static final int DELIMITER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object delimiter_ = "";
  /**
   * <pre>
   * Delimiter for file exports
   * </pre>
   *
   * <code>string delimiter = 1 [json_name = "delimiter"];</code>
   * @return The delimiter.
   */
  @java.lang.Override
  public java.lang.String getDelimiter() {
    java.lang.Object ref = delimiter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      delimiter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Delimiter for file exports
   * </pre>
   *
   * <code>string delimiter = 1 [json_name = "delimiter"];</code>
   * @return The bytes for delimiter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDelimiterBytes() {
    java.lang.Object ref = delimiter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      delimiter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUOTE_CHARACTER_FIELD_NUMBER = 2;
  private int quoteCharacter_ = 0;
  /**
   * <pre>
   * Quote character for file exports
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
   * @return The enum numeric value on the wire for quoteCharacter.
   */
  @java.lang.Override public int getQuoteCharacterValue() {
    return quoteCharacter_;
  }
  /**
   * <pre>
   * Quote character for file exports
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
   * @return The quoteCharacter.
   */
  @java.lang.Override public com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter getQuoteCharacter() {
    com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter result = com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter.forNumber(quoteCharacter_);
    return result == null ? com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter.UNRECOGNIZED : result;
  }

  public static final int NO_HEADER_FIELD_NUMBER = 3;
  private boolean noHeader_ = false;
  /**
   * <pre>
   * Flag to include header in file exports
   * </pre>
   *
   * <code>bool no_header = 3 [json_name = "noHeader"];</code>
   * @return The noHeader.
   */
  @java.lang.Override
  public boolean getNoHeader() {
    return noHeader_;
  }

  public static final int FILE_EXTENSION_FIELD_NUMBER = 4;
  private int fileExtension_ = 0;
  /**
   * <pre>
   * File extension for exporting
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
   * @return The enum numeric value on the wire for fileExtension.
   */
  @java.lang.Override public int getFileExtensionValue() {
    return fileExtension_;
  }
  /**
   * <pre>
   * File extension for exporting
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
   * @return The fileExtension.
   */
  @java.lang.Override public com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension getFileExtension() {
    com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension result = com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension.forNumber(fileExtension_);
    return result == null ? com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delimiter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, delimiter_);
    }
    if (quoteCharacter_ != com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter.QUOTE_CHARACTER_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, quoteCharacter_);
    }
    if (noHeader_ != false) {
      output.writeBool(3, noHeader_);
    }
    if (fileExtension_ != com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension.FILE_EXTENSION_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, fileExtension_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(delimiter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, delimiter_);
    }
    if (quoteCharacter_ != com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter.QUOTE_CHARACTER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, quoteCharacter_);
    }
    if (noHeader_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, noHeader_);
    }
    if (fileExtension_ != com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension.FILE_EXTENSION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, fileExtension_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions other = (com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions) obj;

    if (!getDelimiter()
        .equals(other.getDelimiter())) return false;
    if (quoteCharacter_ != other.quoteCharacter_) return false;
    if (getNoHeader()
        != other.getNoHeader()) return false;
    if (fileExtension_ != other.fileExtension_) return false;
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
    hash = (37 * hash) + DELIMITER_FIELD_NUMBER;
    hash = (53 * hash) + getDelimiter().hashCode();
    hash = (37 * hash) + QUOTE_CHARACTER_FIELD_NUMBER;
    hash = (53 * hash) + quoteCharacter_;
    hash = (37 * hash) + NO_HEADER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNoHeader());
    hash = (37 * hash) + FILE_EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + fileExtension_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions prototype) {
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
   * Message for Export Options
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.explorer.ExportOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.explorer.ExportOptions)
      com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_ExportOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_ExportOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions.class, com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions.newBuilder()
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
      delimiter_ = "";
      quoteCharacter_ = 0;
      noHeader_ = false;
      fileExtension_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.internal_static_api_v1alpha1_explorer_ExportOptions_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions build() {
      com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions result = new com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.delimiter_ = delimiter_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.quoteCharacter_ = quoteCharacter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.noHeader_ = noHeader_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fileExtension_ = fileExtension_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions.getDefaultInstance()) return this;
      if (!other.getDelimiter().isEmpty()) {
        delimiter_ = other.delimiter_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.quoteCharacter_ != 0) {
        setQuoteCharacterValue(other.getQuoteCharacterValue());
      }
      if (other.getNoHeader() != false) {
        setNoHeader(other.getNoHeader());
      }
      if (other.fileExtension_ != 0) {
        setFileExtensionValue(other.getFileExtensionValue());
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
              delimiter_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              quoteCharacter_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              noHeader_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              fileExtension_ = input.readEnum();
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

    private java.lang.Object delimiter_ = "";
    /**
     * <pre>
     * Delimiter for file exports
     * </pre>
     *
     * <code>string delimiter = 1 [json_name = "delimiter"];</code>
     * @return The delimiter.
     */
    public java.lang.String getDelimiter() {
      java.lang.Object ref = delimiter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        delimiter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Delimiter for file exports
     * </pre>
     *
     * <code>string delimiter = 1 [json_name = "delimiter"];</code>
     * @return The bytes for delimiter.
     */
    public com.google.protobuf.ByteString
        getDelimiterBytes() {
      java.lang.Object ref = delimiter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delimiter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Delimiter for file exports
     * </pre>
     *
     * <code>string delimiter = 1 [json_name = "delimiter"];</code>
     * @param value The delimiter to set.
     * @return This builder for chaining.
     */
    public Builder setDelimiter(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      delimiter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Delimiter for file exports
     * </pre>
     *
     * <code>string delimiter = 1 [json_name = "delimiter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDelimiter() {
      delimiter_ = getDefaultInstance().getDelimiter();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Delimiter for file exports
     * </pre>
     *
     * <code>string delimiter = 1 [json_name = "delimiter"];</code>
     * @param value The bytes for delimiter to set.
     * @return This builder for chaining.
     */
    public Builder setDelimiterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      delimiter_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int quoteCharacter_ = 0;
    /**
     * <pre>
     * Quote character for file exports
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
     * @return The enum numeric value on the wire for quoteCharacter.
     */
    @java.lang.Override public int getQuoteCharacterValue() {
      return quoteCharacter_;
    }
    /**
     * <pre>
     * Quote character for file exports
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
     * @param value The enum numeric value on the wire for quoteCharacter to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteCharacterValue(int value) {
      quoteCharacter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Quote character for file exports
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
     * @return The quoteCharacter.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter getQuoteCharacter() {
      com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter result = com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter.forNumber(quoteCharacter_);
      return result == null ? com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Quote character for file exports
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
     * @param value The quoteCharacter to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteCharacter(com.tcn.cloud.api.api.v1alpha1.explorer.QuoteCharacter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      quoteCharacter_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Quote character for file exports
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.QuoteCharacter quote_character = 2 [json_name = "quoteCharacter"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuoteCharacter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      quoteCharacter_ = 0;
      onChanged();
      return this;
    }

    private boolean noHeader_ ;
    /**
     * <pre>
     * Flag to include header in file exports
     * </pre>
     *
     * <code>bool no_header = 3 [json_name = "noHeader"];</code>
     * @return The noHeader.
     */
    @java.lang.Override
    public boolean getNoHeader() {
      return noHeader_;
    }
    /**
     * <pre>
     * Flag to include header in file exports
     * </pre>
     *
     * <code>bool no_header = 3 [json_name = "noHeader"];</code>
     * @param value The noHeader to set.
     * @return This builder for chaining.
     */
    public Builder setNoHeader(boolean value) {

      noHeader_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flag to include header in file exports
     * </pre>
     *
     * <code>bool no_header = 3 [json_name = "noHeader"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNoHeader() {
      bitField0_ = (bitField0_ & ~0x00000004);
      noHeader_ = false;
      onChanged();
      return this;
    }

    private int fileExtension_ = 0;
    /**
     * <pre>
     * File extension for exporting
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
     * @return The enum numeric value on the wire for fileExtension.
     */
    @java.lang.Override public int getFileExtensionValue() {
      return fileExtension_;
    }
    /**
     * <pre>
     * File extension for exporting
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
     * @param value The enum numeric value on the wire for fileExtension to set.
     * @return This builder for chaining.
     */
    public Builder setFileExtensionValue(int value) {
      fileExtension_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * File extension for exporting
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
     * @return The fileExtension.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension getFileExtension() {
      com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension result = com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension.forNumber(fileExtension_);
      return result == null ? com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * File extension for exporting
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
     * @param value The fileExtension to set.
     * @return This builder for chaining.
     */
    public Builder setFileExtension(com.tcn.cloud.api.api.v1alpha1.explorer.FileExtension value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      fileExtension_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * File extension for exporting
     * </pre>
     *
     * <code>.api.v1alpha1.explorer.FileExtension file_extension = 4 [json_name = "fileExtension"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFileExtension() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fileExtension_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.explorer.ExportOptions)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.explorer.ExportOptions)
  private static final com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions();
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportOptions>
      PARSER = new com.google.protobuf.AbstractParser<ExportOptions>() {
    @java.lang.Override
    public ExportOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.explorer.ExportOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

