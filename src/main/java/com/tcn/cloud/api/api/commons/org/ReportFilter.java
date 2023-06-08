// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * Report filter properties.
 * </pre>
 *
 * Protobuf type {@code api.commons.org.ReportFilter}
 */
public final class ReportFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.org.ReportFilter)
    ReportFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportFilter.newBuilder() to construct.
  private ReportFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportFilter() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReportFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ReportFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ReportFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.org.ReportFilter.class, com.tcn.cloud.api.api.commons.org.ReportFilter.Builder.class);
  }

  private int choiceCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object choice_;
  public enum ChoiceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STANDARD(1),
    CUSTOM(2),
    CHOICE_NOT_SET(0);
    private final int value;
    private ChoiceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ChoiceCase valueOf(int value) {
      return forNumber(value);
    }

    public static ChoiceCase forNumber(int value) {
      switch (value) {
        case 1: return STANDARD;
        case 2: return CUSTOM;
        case 0: return CHOICE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ChoiceCase
  getChoiceCase() {
    return ChoiceCase.forNumber(
        choiceCase_);
  }

  public static final int STANDARD_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Standard report filter enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
   * @return Whether the standard field is set.
   */
  public boolean hasStandard() {
    return choiceCase_ == 1;
  }
  /**
   * <pre>
   * Standard report filter enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
   * @return The enum numeric value on the wire for standard.
   */
  public int getStandardValue() {
    if (choiceCase_ == 1) {
      return (java.lang.Integer) choice_;
    }
    return 0;
  }
  /**
   * <pre>
   * Standard report filter enum choice.
   * </pre>
   *
   * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
   * @return The standard.
   */
  public com.tcn.cloud.api.api.commons.StandardReportFilter getStandard() {
    if (choiceCase_ == 1) {
      com.tcn.cloud.api.api.commons.StandardReportFilter result = com.tcn.cloud.api.api.commons.StandardReportFilter.forNumber(
          (java.lang.Integer) choice_);
      return result == null ? com.tcn.cloud.api.api.commons.StandardReportFilter.UNRECOGNIZED : result;
    }
    return com.tcn.cloud.api.api.commons.StandardReportFilter.NO_PREFERENCE;
  }

  public static final int CUSTOM_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Custom report filter xml property SID.
   * </pre>
   *
   * <code>int64 custom = 2 [json_name = "custom"];</code>
   * @return Whether the custom field is set.
   */
  @java.lang.Override
  public boolean hasCustom() {
    return choiceCase_ == 2;
  }
  /**
   * <pre>
   * Custom report filter xml property SID.
   * </pre>
   *
   * <code>int64 custom = 2 [json_name = "custom"];</code>
   * @return The custom.
   */
  @java.lang.Override
  public long getCustom() {
    if (choiceCase_ == 2) {
      return (java.lang.Long) choice_;
    }
    return 0L;
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
    if (choiceCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) choice_));
    }
    if (choiceCase_ == 2) {
      output.writeInt64(
          2, (long)((java.lang.Long) choice_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (choiceCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) choice_));
    }
    if (choiceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            2, (long)((java.lang.Long) choice_));
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.org.ReportFilter)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.org.ReportFilter other = (com.tcn.cloud.api.api.commons.org.ReportFilter) obj;

    if (!getChoiceCase().equals(other.getChoiceCase())) return false;
    switch (choiceCase_) {
      case 1:
        if (getStandardValue()
            != other.getStandardValue()) return false;
        break;
      case 2:
        if (getCustom()
            != other.getCustom()) return false;
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
    switch (choiceCase_) {
      case 1:
        hash = (37 * hash) + STANDARD_FIELD_NUMBER;
        hash = (53 * hash) + getStandardValue();
        break;
      case 2:
        hash = (37 * hash) + CUSTOM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getCustom());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.org.ReportFilter parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.org.ReportFilter prototype) {
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
   * Report filter properties.
   * </pre>
   *
   * Protobuf type {@code api.commons.org.ReportFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.org.ReportFilter)
      com.tcn.cloud.api.api.commons.org.ReportFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ReportFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ReportFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.org.ReportFilter.class, com.tcn.cloud.api.api.commons.org.ReportFilter.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.org.ReportFilter.newBuilder()
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
      choiceCase_ = 0;
      choice_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.org.PreferencesProto.internal_static_api_commons_org_ReportFilter_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.ReportFilter getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.org.ReportFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.ReportFilter build() {
      com.tcn.cloud.api.api.commons.org.ReportFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.ReportFilter buildPartial() {
      com.tcn.cloud.api.api.commons.org.ReportFilter result = new com.tcn.cloud.api.api.commons.org.ReportFilter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.org.ReportFilter result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.commons.org.ReportFilter result) {
      result.choiceCase_ = choiceCase_;
      result.choice_ = this.choice_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.org.ReportFilter) {
        return mergeFrom((com.tcn.cloud.api.api.commons.org.ReportFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.org.ReportFilter other) {
      if (other == com.tcn.cloud.api.api.commons.org.ReportFilter.getDefaultInstance()) return this;
      switch (other.getChoiceCase()) {
        case STANDARD: {
          setStandardValue(other.getStandardValue());
          break;
        }
        case CUSTOM: {
          setCustom(other.getCustom());
          break;
        }
        case CHOICE_NOT_SET: {
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
              choiceCase_ = 1;
              choice_ = rawValue;
              break;
            } // case 8
            case 16: {
              choice_ = input.readInt64();
              choiceCase_ = 2;
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
    private int choiceCase_ = 0;
    private java.lang.Object choice_;
    public ChoiceCase
        getChoiceCase() {
      return ChoiceCase.forNumber(
          choiceCase_);
    }

    public Builder clearChoice() {
      choiceCase_ = 0;
      choice_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * Standard report filter enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
     * @return Whether the standard field is set.
     */
    @java.lang.Override
    public boolean hasStandard() {
      return choiceCase_ == 1;
    }
    /**
     * <pre>
     * Standard report filter enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
     * @return The enum numeric value on the wire for standard.
     */
    @java.lang.Override
    public int getStandardValue() {
      if (choiceCase_ == 1) {
        return ((java.lang.Integer) choice_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * Standard report filter enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
     * @param value The enum numeric value on the wire for standard to set.
     * @return This builder for chaining.
     */
    public Builder setStandardValue(int value) {
      choiceCase_ = 1;
      choice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Standard report filter enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
     * @return The standard.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.StandardReportFilter getStandard() {
      if (choiceCase_ == 1) {
        com.tcn.cloud.api.api.commons.StandardReportFilter result = com.tcn.cloud.api.api.commons.StandardReportFilter.forNumber(
            (java.lang.Integer) choice_);
        return result == null ? com.tcn.cloud.api.api.commons.StandardReportFilter.UNRECOGNIZED : result;
      }
      return com.tcn.cloud.api.api.commons.StandardReportFilter.NO_PREFERENCE;
    }
    /**
     * <pre>
     * Standard report filter enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
     * @param value The standard to set.
     * @return This builder for chaining.
     */
    public Builder setStandard(com.tcn.cloud.api.api.commons.StandardReportFilter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      choiceCase_ = 1;
      choice_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Standard report filter enum choice.
     * </pre>
     *
     * <code>.api.commons.StandardReportFilter standard = 1 [json_name = "standard"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStandard() {
      if (choiceCase_ == 1) {
        choiceCase_ = 0;
        choice_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Custom report filter xml property SID.
     * </pre>
     *
     * <code>int64 custom = 2 [json_name = "custom"];</code>
     * @return Whether the custom field is set.
     */
    public boolean hasCustom() {
      return choiceCase_ == 2;
    }
    /**
     * <pre>
     * Custom report filter xml property SID.
     * </pre>
     *
     * <code>int64 custom = 2 [json_name = "custom"];</code>
     * @return The custom.
     */
    public long getCustom() {
      if (choiceCase_ == 2) {
        return (java.lang.Long) choice_;
      }
      return 0L;
    }
    /**
     * <pre>
     * Custom report filter xml property SID.
     * </pre>
     *
     * <code>int64 custom = 2 [json_name = "custom"];</code>
     * @param value The custom to set.
     * @return This builder for chaining.
     */
    public Builder setCustom(long value) {

      choiceCase_ = 2;
      choice_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Custom report filter xml property SID.
     * </pre>
     *
     * <code>int64 custom = 2 [json_name = "custom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustom() {
      if (choiceCase_ == 2) {
        choiceCase_ = 0;
        choice_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:api.commons.org.ReportFilter)
  }

  // @@protoc_insertion_point(class_scope:api.commons.org.ReportFilter)
  private static final com.tcn.cloud.api.api.commons.org.ReportFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.org.ReportFilter();
  }

  public static com.tcn.cloud.api.api.commons.org.ReportFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportFilter>
      PARSER = new com.google.protobuf.AbstractParser<ReportFilter>() {
    @java.lang.Override
    public ReportFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReportFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.ReportFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

