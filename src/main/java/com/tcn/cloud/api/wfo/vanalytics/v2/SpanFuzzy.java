// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * Protobuf type {@code wfo.vanalytics.v2.SpanFuzzy}
 */
public final class SpanFuzzy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.SpanFuzzy)
    SpanFuzzyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpanFuzzy.newBuilder() to construct.
  private SpanFuzzy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpanFuzzy() {
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpanFuzzy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SpanFuzzy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SpanFuzzy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy.class, com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy.Builder.class);
  }

  private int fuzzinessCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object fuzziness_;
  public enum FuzzinessCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FUZZINESS_AUTO(10),
    FUZZINESS_VALUE(11),
    FUZZINESS_NOT_SET(0);
    private final int value;
    private FuzzinessCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FuzzinessCase valueOf(int value) {
      return forNumber(value);
    }

    public static FuzzinessCase forNumber(int value) {
      switch (value) {
        case 10: return FUZZINESS_AUTO;
        case 11: return FUZZINESS_VALUE;
        case 0: return FUZZINESS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public FuzzinessCase
  getFuzzinessCase() {
    return FuzzinessCase.forNumber(
        fuzzinessCase_);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <code>string value = 1 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 1 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FUZZINESS_AUTO_FIELD_NUMBER = 10;
  /**
   * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
   * @return Whether the fuzzinessAuto field is set.
   */
  @java.lang.Override
  public boolean hasFuzzinessAuto() {
    return fuzzinessCase_ == 10;
  }
  /**
   * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
   * @return The fuzzinessAuto.
   */
  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto getFuzzinessAuto() {
    if (fuzzinessCase_ == 10) {
       return (com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto) fuzziness_;
    }
    return com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.getDefaultInstance();
  }
  /**
   * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAutoOrBuilder getFuzzinessAutoOrBuilder() {
    if (fuzzinessCase_ == 10) {
       return (com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto) fuzziness_;
    }
    return com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.getDefaultInstance();
  }

  public static final int FUZZINESS_VALUE_FIELD_NUMBER = 11;
  /**
   * <code>uint32 fuzziness_value = 11 [json_name = "fuzzinessValue"];</code>
   * @return Whether the fuzzinessValue field is set.
   */
  @java.lang.Override
  public boolean hasFuzzinessValue() {
    return fuzzinessCase_ == 11;
  }
  /**
   * <code>uint32 fuzziness_value = 11 [json_name = "fuzzinessValue"];</code>
   * @return The fuzzinessValue.
   */
  @java.lang.Override
  public int getFuzzinessValue() {
    if (fuzzinessCase_ == 11) {
      return (java.lang.Integer) fuzziness_;
    }
    return 0;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
    }
    if (fuzzinessCase_ == 10) {
      output.writeMessage(10, (com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto) fuzziness_);
    }
    if (fuzzinessCase_ == 11) {
      output.writeUInt32(
          11, (int)((java.lang.Integer) fuzziness_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
    }
    if (fuzzinessCase_ == 10) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, (com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto) fuzziness_);
    }
    if (fuzzinessCase_ == 11) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(
            11, (int)((java.lang.Integer) fuzziness_));
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy other = (com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy) obj;

    if (!getValue()
        .equals(other.getValue())) return false;
    if (!getFuzzinessCase().equals(other.getFuzzinessCase())) return false;
    switch (fuzzinessCase_) {
      case 10:
        if (!getFuzzinessAuto()
            .equals(other.getFuzzinessAuto())) return false;
        break;
      case 11:
        if (getFuzzinessValue()
            != other.getFuzzinessValue()) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    switch (fuzzinessCase_) {
      case 10:
        hash = (37 * hash) + FUZZINESS_AUTO_FIELD_NUMBER;
        hash = (53 * hash) + getFuzzinessAuto().hashCode();
        break;
      case 11:
        hash = (37 * hash) + FUZZINESS_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getFuzzinessValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy prototype) {
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
   * Protobuf type {@code wfo.vanalytics.v2.SpanFuzzy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.SpanFuzzy)
      com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SpanFuzzy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SpanFuzzy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy.class, com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy.newBuilder()
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
      value_ = "";
      if (fuzzinessAutoBuilder_ != null) {
        fuzzinessAutoBuilder_.clear();
      }
      fuzzinessCase_ = 0;
      fuzziness_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.internal_static_wfo_vanalytics_v2_SpanFuzzy_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy result = new com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
    }

    private void buildPartialOneofs(com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy result) {
      result.fuzzinessCase_ = fuzzinessCase_;
      result.fuzziness_ = this.fuzziness_;
      if (fuzzinessCase_ == 10 &&
          fuzzinessAutoBuilder_ != null) {
        result.fuzziness_ = fuzzinessAutoBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy.getDefaultInstance()) return this;
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getFuzzinessCase()) {
        case FUZZINESS_AUTO: {
          mergeFuzzinessAuto(other.getFuzzinessAuto());
          break;
        }
        case FUZZINESS_VALUE: {
          setFuzzinessValue(other.getFuzzinessValue());
          break;
        }
        case FUZZINESS_NOT_SET: {
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
              value_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 82: {
              input.readMessage(
                  getFuzzinessAutoFieldBuilder().getBuilder(),
                  extensionRegistry);
              fuzzinessCase_ = 10;
              break;
            } // case 82
            case 88: {
              fuzziness_ = input.readUInt32();
              fuzzinessCase_ = 11;
              break;
            } // case 88
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
    private int fuzzinessCase_ = 0;
    private java.lang.Object fuzziness_;
    public FuzzinessCase
        getFuzzinessCase() {
      return FuzzinessCase.forNumber(
          fuzzinessCase_);
    }

    public Builder clearFuzziness() {
      fuzzinessCase_ = 0;
      fuzziness_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string value = 1 [json_name = "value"];</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto, com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAutoOrBuilder> fuzzinessAutoBuilder_;
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     * @return Whether the fuzzinessAuto field is set.
     */
    @java.lang.Override
    public boolean hasFuzzinessAuto() {
      return fuzzinessCase_ == 10;
    }
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     * @return The fuzzinessAuto.
     */
    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto getFuzzinessAuto() {
      if (fuzzinessAutoBuilder_ == null) {
        if (fuzzinessCase_ == 10) {
          return (com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto) fuzziness_;
        }
        return com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.getDefaultInstance();
      } else {
        if (fuzzinessCase_ == 10) {
          return fuzzinessAutoBuilder_.getMessage();
        }
        return com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.getDefaultInstance();
      }
    }
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     */
    public Builder setFuzzinessAuto(com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto value) {
      if (fuzzinessAutoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fuzziness_ = value;
        onChanged();
      } else {
        fuzzinessAutoBuilder_.setMessage(value);
      }
      fuzzinessCase_ = 10;
      return this;
    }
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     */
    public Builder setFuzzinessAuto(
        com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.Builder builderForValue) {
      if (fuzzinessAutoBuilder_ == null) {
        fuzziness_ = builderForValue.build();
        onChanged();
      } else {
        fuzzinessAutoBuilder_.setMessage(builderForValue.build());
      }
      fuzzinessCase_ = 10;
      return this;
    }
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     */
    public Builder mergeFuzzinessAuto(com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto value) {
      if (fuzzinessAutoBuilder_ == null) {
        if (fuzzinessCase_ == 10 &&
            fuzziness_ != com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.getDefaultInstance()) {
          fuzziness_ = com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.newBuilder((com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto) fuzziness_)
              .mergeFrom(value).buildPartial();
        } else {
          fuzziness_ = value;
        }
        onChanged();
      } else {
        if (fuzzinessCase_ == 10) {
          fuzzinessAutoBuilder_.mergeFrom(value);
        } else {
          fuzzinessAutoBuilder_.setMessage(value);
        }
      }
      fuzzinessCase_ = 10;
      return this;
    }
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     */
    public Builder clearFuzzinessAuto() {
      if (fuzzinessAutoBuilder_ == null) {
        if (fuzzinessCase_ == 10) {
          fuzzinessCase_ = 0;
          fuzziness_ = null;
          onChanged();
        }
      } else {
        if (fuzzinessCase_ == 10) {
          fuzzinessCase_ = 0;
          fuzziness_ = null;
        }
        fuzzinessAutoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     */
    public com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.Builder getFuzzinessAutoBuilder() {
      return getFuzzinessAutoFieldBuilder().getBuilder();
    }
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAutoOrBuilder getFuzzinessAutoOrBuilder() {
      if ((fuzzinessCase_ == 10) && (fuzzinessAutoBuilder_ != null)) {
        return fuzzinessAutoBuilder_.getMessageOrBuilder();
      } else {
        if (fuzzinessCase_ == 10) {
          return (com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto) fuzziness_;
        }
        return com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.getDefaultInstance();
      }
    }
    /**
     * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 10 [json_name = "fuzzinessAuto"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto, com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAutoOrBuilder> 
        getFuzzinessAutoFieldBuilder() {
      if (fuzzinessAutoBuilder_ == null) {
        if (!(fuzzinessCase_ == 10)) {
          fuzziness_ = com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.getDefaultInstance();
        }
        fuzzinessAutoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto, com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto.Builder, com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAutoOrBuilder>(
                (com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto) fuzziness_,
                getParentForChildren(),
                isClean());
        fuzziness_ = null;
      }
      fuzzinessCase_ = 10;
      onChanged();
      return fuzzinessAutoBuilder_;
    }

    /**
     * <code>uint32 fuzziness_value = 11 [json_name = "fuzzinessValue"];</code>
     * @return Whether the fuzzinessValue field is set.
     */
    public boolean hasFuzzinessValue() {
      return fuzzinessCase_ == 11;
    }
    /**
     * <code>uint32 fuzziness_value = 11 [json_name = "fuzzinessValue"];</code>
     * @return The fuzzinessValue.
     */
    public int getFuzzinessValue() {
      if (fuzzinessCase_ == 11) {
        return (java.lang.Integer) fuzziness_;
      }
      return 0;
    }
    /**
     * <code>uint32 fuzziness_value = 11 [json_name = "fuzzinessValue"];</code>
     * @param value The fuzzinessValue to set.
     * @return This builder for chaining.
     */
    public Builder setFuzzinessValue(int value) {

      fuzzinessCase_ = 11;
      fuzziness_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 fuzziness_value = 11 [json_name = "fuzzinessValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFuzzinessValue() {
      if (fuzzinessCase_ == 11) {
        fuzzinessCase_ = 0;
        fuzziness_ = null;
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.SpanFuzzy)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.SpanFuzzy)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpanFuzzy>
      PARSER = new com.google.protobuf.AbstractParser<SpanFuzzy>() {
    @java.lang.Override
    public SpanFuzzy parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpanFuzzy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpanFuzzy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.SpanFuzzy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

