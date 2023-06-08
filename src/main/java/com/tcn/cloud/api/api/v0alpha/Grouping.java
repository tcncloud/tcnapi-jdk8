// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.Grouping}
 */
public final class Grouping extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.Grouping)
    GroupingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Grouping.newBuilder() to construct.
  private Grouping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Grouping() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Grouping();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Grouping_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Grouping_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.Grouping.class, com.tcn.cloud.api.api.v0alpha.Grouping.Builder.class);
  }

  private int formatCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object format_;
  public enum FormatCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DATAPOINT_ID(1),
    TIME_SCOPE(2),
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
        case 1: return DATAPOINT_ID;
        case 2: return TIME_SCOPE;
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

  public static final int DATAPOINT_ID_FIELD_NUMBER = 1;
  /**
   * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
   * @return Whether the datapointId field is set.
   */
  public boolean hasDatapointId() {
    return formatCase_ == 1;
  }
  /**
   * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
   * @return The datapointId.
   */
  public java.lang.String getDatapointId() {
    java.lang.Object ref = "";
    if (formatCase_ == 1) {
      ref = format_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (formatCase_ == 1) {
        format_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
   * @return The bytes for datapointId.
   */
  public com.google.protobuf.ByteString
      getDatapointIdBytes() {
    java.lang.Object ref = "";
    if (formatCase_ == 1) {
      ref = format_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (formatCase_ == 1) {
        format_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_SCOPE_FIELD_NUMBER = 2;
  /**
   * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
   * @return Whether the timeScope field is set.
   */
  public boolean hasTimeScope() {
    return formatCase_ == 2;
  }
  /**
   * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
   * @return The enum numeric value on the wire for timeScope.
   */
  public int getTimeScopeValue() {
    if (formatCase_ == 2) {
      return (java.lang.Integer) format_;
    }
    return 0;
  }
  /**
   * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
   * @return The timeScope.
   */
  public com.tcn.cloud.api.api.commons.TimeScope getTimeScope() {
    if (formatCase_ == 2) {
      com.tcn.cloud.api.api.commons.TimeScope result = com.tcn.cloud.api.api.commons.TimeScope.forNumber(
          (java.lang.Integer) format_);
      return result == null ? com.tcn.cloud.api.api.commons.TimeScope.UNRECOGNIZED : result;
    }
    return com.tcn.cloud.api.api.commons.TimeScope.ONE_DAY;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, format_);
    }
    if (formatCase_ == 2) {
      output.writeEnum(2, ((java.lang.Integer) format_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (formatCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, format_);
    }
    if (formatCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ((java.lang.Integer) format_));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.Grouping)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.Grouping other = (com.tcn.cloud.api.api.v0alpha.Grouping) obj;

    if (!getFormatCase().equals(other.getFormatCase())) return false;
    switch (formatCase_) {
      case 1:
        if (!getDatapointId()
            .equals(other.getDatapointId())) return false;
        break;
      case 2:
        if (getTimeScopeValue()
            != other.getTimeScopeValue()) return false;
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
        hash = (37 * hash) + DATAPOINT_ID_FIELD_NUMBER;
        hash = (53 * hash) + getDatapointId().hashCode();
        break;
      case 2:
        hash = (37 * hash) + TIME_SCOPE_FIELD_NUMBER;
        hash = (53 * hash) + getTimeScopeValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.Grouping parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.Grouping parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Grouping parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.Grouping prototype) {
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
   * Protobuf type {@code api.v0alpha.Grouping}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.Grouping)
      com.tcn.cloud.api.api.v0alpha.GroupingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Grouping_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Grouping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.Grouping.class, com.tcn.cloud.api.api.v0alpha.Grouping.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.Grouping.newBuilder()
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
      formatCase_ = 0;
      format_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Grouping_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Grouping getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.Grouping.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Grouping build() {
      com.tcn.cloud.api.api.v0alpha.Grouping result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Grouping buildPartial() {
      com.tcn.cloud.api.api.v0alpha.Grouping result = new com.tcn.cloud.api.api.v0alpha.Grouping(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.Grouping result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v0alpha.Grouping result) {
      result.formatCase_ = formatCase_;
      result.format_ = this.format_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.Grouping) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.Grouping)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.Grouping other) {
      if (other == com.tcn.cloud.api.api.v0alpha.Grouping.getDefaultInstance()) return this;
      switch (other.getFormatCase()) {
        case DATAPOINT_ID: {
          formatCase_ = 1;
          format_ = other.format_;
          onChanged();
          break;
        }
        case TIME_SCOPE: {
          setTimeScopeValue(other.getTimeScopeValue());
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              formatCase_ = 1;
              format_ = s;
              break;
            } // case 10
            case 16: {
              int rawValue = input.readEnum();
              formatCase_ = 2;
              format_ = rawValue;
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
     * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
     * @return Whether the datapointId field is set.
     */
    @java.lang.Override
    public boolean hasDatapointId() {
      return formatCase_ == 1;
    }
    /**
     * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
     * @return The datapointId.
     */
    @java.lang.Override
    public java.lang.String getDatapointId() {
      java.lang.Object ref = "";
      if (formatCase_ == 1) {
        ref = format_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (formatCase_ == 1) {
          format_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
     * @return The bytes for datapointId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDatapointIdBytes() {
      java.lang.Object ref = "";
      if (formatCase_ == 1) {
        ref = format_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (formatCase_ == 1) {
          format_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
     * @param value The datapointId to set.
     * @return This builder for chaining.
     */
    public Builder setDatapointId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      formatCase_ = 1;
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDatapointId() {
      if (formatCase_ == 1) {
        formatCase_ = 0;
        format_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string datapoint_id = 1 [json_name = "datapointId"];</code>
     * @param value The bytes for datapointId to set.
     * @return This builder for chaining.
     */
    public Builder setDatapointIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      formatCase_ = 1;
      format_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
     * @return Whether the timeScope field is set.
     */
    @java.lang.Override
    public boolean hasTimeScope() {
      return formatCase_ == 2;
    }
    /**
     * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
     * @return The enum numeric value on the wire for timeScope.
     */
    @java.lang.Override
    public int getTimeScopeValue() {
      if (formatCase_ == 2) {
        return ((java.lang.Integer) format_).intValue();
      }
      return 0;
    }
    /**
     * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
     * @param value The enum numeric value on the wire for timeScope to set.
     * @return This builder for chaining.
     */
    public Builder setTimeScopeValue(int value) {
      formatCase_ = 2;
      format_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
     * @return The timeScope.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TimeScope getTimeScope() {
      if (formatCase_ == 2) {
        com.tcn.cloud.api.api.commons.TimeScope result = com.tcn.cloud.api.api.commons.TimeScope.forNumber(
            (java.lang.Integer) format_);
        return result == null ? com.tcn.cloud.api.api.commons.TimeScope.UNRECOGNIZED : result;
      }
      return com.tcn.cloud.api.api.commons.TimeScope.ONE_DAY;
    }
    /**
     * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
     * @param value The timeScope to set.
     * @return This builder for chaining.
     */
    public Builder setTimeScope(com.tcn.cloud.api.api.commons.TimeScope value) {
      if (value == null) {
        throw new NullPointerException();
      }
      formatCase_ = 2;
      format_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TimeScope time_scope = 2 [json_name = "timeScope"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeScope() {
      if (formatCase_ == 2) {
        formatCase_ = 0;
        format_ = null;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.Grouping)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.Grouping)
  private static final com.tcn.cloud.api.api.v0alpha.Grouping DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.Grouping();
  }

  public static com.tcn.cloud.api.api.v0alpha.Grouping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Grouping>
      PARSER = new com.google.protobuf.AbstractParser<Grouping>() {
    @java.lang.Override
    public Grouping parsePartialFrom(
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

  public static com.google.protobuf.Parser<Grouping> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Grouping> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Grouping getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

