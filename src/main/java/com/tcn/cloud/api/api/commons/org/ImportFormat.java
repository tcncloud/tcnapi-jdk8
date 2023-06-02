// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * Contact import template type.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.ImportFormat}
 */
public final class ImportFormat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.ImportFormat)
    ImportFormatOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportFormat.newBuilder() to construct.
  private ImportFormat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportFormat() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportFormat();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ImportFormat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ImportFormat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.ImportFormat.class, com.tcn.cloud.api.api.commons.org.ImportFormat.Builder.class);
  }

  private int formatCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object format_;
  public enum FormatCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STANDARD(1),
    CUSTOM(2),
    FORMAT_NOT_SET(0);
    private final int value;
    private FormatCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FormatCase valueOf(int value) {
      return forNumber(value);
    }

    public static FormatCase forNumber(int value) {
      switch (value) {
        case 1: return STANDARD;
        case 2: return CUSTOM;
        case 0: return FORMAT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FormatCase
  getFormatCase() {
    return FormatCase.forNumber(
        formatCase_);
  }

  public static final int STANDARD_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Import format enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
   * @return Whether the standard field is set.
   */
  public boolean hasStandard() {
    return formatCase_ == 1;
  }
  /**
   * <pre>
   * Import format enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
   * @return The enum numeric value on the wire for standard.
   */
  public int getStandardValue() {
    if (formatCase_ == 1) {
      return (java.lang.Integer) format_;
    }
    return 0;
  }
  /**
   * <pre>
   * Import format enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
   * @return The standard.
   */
  public com.tcn.cloud.api.api.commons.StandardImportFormat getStandard() {
    if (formatCase_ == 1) {
      com.tcn.cloud.api.api.commons.StandardImportFormat result = com.tcn.cloud.api.api.commons.StandardImportFormat.forNumber(
          (java.lang.Integer) format_);
      return result == null ? com.tcn.cloud.api.api.commons.StandardImportFormat.UNRECOGNIZED : result;
    }
    return com.tcn.cloud.api.api.commons.StandardImportFormat.STANDARD_IMPORT_FORMAT_TAB_DELIMITED;
  }

  public static final int CUSTOM_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Client-defined import format.
   * </pre>
   *
   * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
   * @return Whether the custom field is set.
   */
  @java.lang.Override
  public boolean hasCustom() {
    return formatCase_ == 2;
  }
  /**
   * <pre>
   * Client-defined import format.
   * </pre>
   *
   * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
   * @return The custom.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.CustomImportFormat getCustom() {
    if (formatCase_ == 2) {
       return (com.tcn.cloud.api.api.commons.org.CustomImportFormat) format_;
    }
    return com.tcn.cloud.api.api.commons.org.CustomImportFormat.getDefaultInstance();
  }
  /**
   * <pre>
   * Client-defined import format.
   * </pre>
   *
   * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.CustomImportFormatOrBuilder getCustomOrBuilder() {
    if (formatCase_ == 2) {
       return (com.tcn.cloud.api.api.commons.org.CustomImportFormat) format_;
    }
    return com.tcn.cloud.api.api.commons.org.CustomImportFormat.getDefaultInstance();
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
    if (formatCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) format_));
    }
    if (formatCase_ == 2) {
      output.writeMessage(2, (com.tcn.cloud.api.api.commons.org.CustomImportFormat) format_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (formatCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) format_));
    }
    if (formatCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.tcn.cloud.api.api.commons.org.CustomImportFormat) format_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.ImportFormat)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.ImportFormat other = (com.tcn.cloud.api.api.commons.org.ImportFormat) obj;

    if (!getFormatCase().equals(other.getFormatCase())) return false;
    switch (formatCase_) {
      case 1:
        if (getStandardValue()
            != other.getStandardValue()) return false;
        break;
      case 2:
        if (!getCustom()
            .equals(other.getCustom())) return false;
        break;
      case 0:
      default:
    }
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
    switch (formatCase_) {
      case 1:
        hash = (37 * hash) + STANDARD_FIELD_NUMBER;
        hash = (53 * hash) + getStandardValue();
        break;
      case 2:
        hash = (37 * hash) + CUSTOM_FIELD_NUMBER;
        hash = (53 * hash) + getCustom().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.ImportFormat parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.ImportFormat prototype) {
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
   * Contact import template type.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.ImportFormat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.ImportFormat)
      com.tcn.cloud.api.api.commons.org.ImportFormatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ImportFormat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ImportFormat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.ImportFormat.class, com.tcn.cloud.api.api.commons.org.ImportFormat.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.ImportFormat.newBuilder()
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
      if (customBuilder_ != null) {
        customBuilder_.clear();
      }
      formatCase_ = 0;
      format_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ImportFormat_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.ImportFormat getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.ImportFormat.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.ImportFormat build() {
      com.tcn.cloud.api.api.commons.org.ImportFormat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.ImportFormat buildPartial() {
      com.tcn.cloud.api.api.commons.org.ImportFormat result = new com.tcn.cloud.api.api.commons.org.ImportFormat(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.ImportFormat result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.commons.org.ImportFormat result) {
      result.formatCase_ = formatCase_;
      result.format_ = this.format_;
      if (formatCase_ == 2 &&
          customBuilder_ != null) {
        result.format_ = customBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.ImportFormat) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.ImportFormat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.ImportFormat other) {
      if (other == com.tcn.cloud.api.api.commons.org.ImportFormat.getDefaultInstance()) return this;
      switch (other.getFormatCase()) {
        case STANDARD: {
          setStandardValue(other.getStandardValue());
          break;
        }
        case CUSTOM: {
          mergeCustom(other.getCustom());
          break;
        }
        case FORMAT_NOT_SET: {
          break;
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
            case 8: {
              int rawValue = input.readEnum();
              formatCase_ = 1;
              format_ = rawValue;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getCustomFieldBuilder().getBuilder(),
                  extensionRegistry);
              formatCase_ = 2;
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
    private int formatCase_ = 0;
    private java.lang.Object format_;
    public FormatCase
        getFormatCase() {
      return FormatCase.forNumber(
          formatCase_);
    }

    public Builder clearFormat() {
      formatCase_ = 0;
      format_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * Import format enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
     * @return Whether the standard field is set.
     */
    @java.lang.Override
    public boolean hasStandard() {
      return formatCase_ == 1;
    }
    /**
     * <pre>
     * Import format enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
     * @return The enum numeric value on the wire for standard.
     */
    @java.lang.Override
    public int getStandardValue() {
      if (formatCase_ == 1) {
        return ((java.lang.Integer) format_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * Import format enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
     * @param value The enum numeric value on the wire for standard to set.
     * @return This builder for chaining.
     */
    public Builder setStandardValue(int value) {
      formatCase_ = 1;
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Import format enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
     * @return The standard.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.StandardImportFormat getStandard() {
      if (formatCase_ == 1) {
        com.tcn.cloud.api.api.commons.StandardImportFormat result = com.tcn.cloud.api.api.commons.StandardImportFormat.forNumber(
            (java.lang.Integer) format_);
        return result == null ? com.tcn.cloud.api.api.commons.StandardImportFormat.UNRECOGNIZED : result;
      }
      return com.tcn.cloud.api.api.commons.StandardImportFormat.STANDARD_IMPORT_FORMAT_TAB_DELIMITED;
    }
    /**
     * <pre>
     * Import format enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
     * @param value The standard to set.
     * @return This builder for chaining.
     */
    public Builder setStandard(com.tcn.cloud.api.api.commons.StandardImportFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      formatCase_ = 1;
      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Import format enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardImportFormat standard = 1 [json_name = "standard"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStandard() {
      if (formatCase_ == 1) {
        formatCase_ = 0;
        format_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.CustomImportFormat, com.tcn.cloud.api.api.commons.org.CustomImportFormat.Builder, com.tcn.cloud.api.api.commons.org.CustomImportFormatOrBuilder> customBuilder_;
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     * @return Whether the custom field is set.
     */
    @java.lang.Override
    public boolean hasCustom() {
      return formatCase_ == 2;
    }
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     * @return The custom.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.CustomImportFormat getCustom() {
      if (customBuilder_ == null) {
        if (formatCase_ == 2) {
          return (com.tcn.cloud.api.api.commons.org.CustomImportFormat) format_;
        }
        return com.tcn.cloud.api.api.commons.org.CustomImportFormat.getDefaultInstance();
      } else {
        if (formatCase_ == 2) {
          return customBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.commons.org.CustomImportFormat.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     */
    public Builder setCustom(com.tcn.cloud.api.api.commons.org.CustomImportFormat value) {
      if (customBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        format_ = value;
        onChanged();
      } else {
        customBuilder_.setMessage(value);
      }
      formatCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     */
    public Builder setCustom(
        com.tcn.cloud.api.api.commons.org.CustomImportFormat.Builder builderForValue) {
      if (customBuilder_ == null) {
        format_ = builderForValue.build();
        onChanged();
      } else {
        customBuilder_.setMessage(builderForValue.build());
      }
      formatCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     */
    public Builder mergeCustom(com.tcn.cloud.api.api.commons.org.CustomImportFormat value) {
      if (customBuilder_ == null) {
        if (formatCase_ == 2 &&
            format_ != com.tcn.cloud.api.api.commons.org.CustomImportFormat.getDefaultInstance()) {
          format_ = com.tcn.cloud.api.api.commons.org.CustomImportFormat.newBuilder((com.tcn.cloud.api.api.commons.org.CustomImportFormat) format_)
              .mergeFrom(value).buildPartial();
        } else {
          format_ = value;
        }
        onChanged();
      } else {
        if (formatCase_ == 2) {
          customBuilder_.mergeFrom(value);
        } else {
          customBuilder_.setMessage(value);
        }
      }
      formatCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     */
    public Builder clearCustom() {
      if (customBuilder_ == null) {
        if (formatCase_ == 2) {
          formatCase_ = 0;
          format_ = null;
          onChanged();
        }
      } else {
        if (formatCase_ == 2) {
          formatCase_ = 0;
          format_ = null;
        }
        customBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.CustomImportFormat.Builder getCustomBuilder() {
      return getCustomFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.CustomImportFormatOrBuilder getCustomOrBuilder() {
      if ((formatCase_ == 2) && (customBuilder_ != null)) {
        return customBuilder_.getMessageOrBuilder();
      } else {
        if (formatCase_ == 2) {
          return (com.tcn.cloud.api.api.commons.org.CustomImportFormat) format_;
        }
        return com.tcn.cloud.api.api.commons.org.CustomImportFormat.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Client-defined import format.
     * </pre>
     *
     * <code>.api.commons.org.CustomImportFormat custom = 2 [json_name = "custom"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.CustomImportFormat, com.tcn.cloud.api.api.commons.org.CustomImportFormat.Builder, com.tcn.cloud.api.api.commons.org.CustomImportFormatOrBuilder> 
        getCustomFieldBuilder() {
      if (customBuilder_ == null) {
        if (!(formatCase_ == 2)) {
          format_ = com.tcn.cloud.api.api.commons.org.CustomImportFormat.getDefaultInstance();
        }
        customBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.CustomImportFormat, com.tcn.cloud.api.api.commons.org.CustomImportFormat.Builder, com.tcn.cloud.api.api.commons.org.CustomImportFormatOrBuilder>(
                (com.tcn.cloud.api.api.commons.org.CustomImportFormat) format_,
                getParentForChildren(),
                isClean());
        format_ = null;
      }
      formatCase_ = 2;
      onChanged();
      return customBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.ImportFormat)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.ImportFormat)
  private static final com.tcn.cloud.api.api.commons.org.ImportFormat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.ImportFormat();
  }

  public static com.tcn.cloud.api.api.commons.org.ImportFormat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportFormat>
      PARSER = new com.google.protobuf.AbstractParser<ImportFormat>() {
    @java.lang.Override
    public ImportFormat parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportFormat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportFormat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.ImportFormat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

