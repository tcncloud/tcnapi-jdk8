// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.WeeksSummary}
 */
public final class WeeksSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.WeeksSummary)
    WeeksSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeeksSummary.newBuilder() to construct.
  private WeeksSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeeksSummary() {
    weeksEditor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WeeksSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_WeeksSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_WeeksSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.WeeksSummary.class, com.tcn.cloud.api.api.v0alpha.WeeksSummary.Builder.class);
  }

  public static final int WEEKS_CURRENT_FIELD_NUMBER = 1;
  private long weeksCurrent_ = 0L;
  /**
   * <code>int64 weeks_current = 1 [json_name = "weeksCurrent"];</code>
   * @return The weeksCurrent.
   */
  @java.lang.Override
  public long getWeeksCurrent() {
    return weeksCurrent_;
  }

  public static final int WEEKS_PEAK_FIELD_NUMBER = 2;
  private long weeksPeak_ = 0L;
  /**
   * <code>int64 weeks_peak = 2 [json_name = "weeksPeak"];</code>
   * @return The weeksPeak.
   */
  @java.lang.Override
  public long getWeeksPeak() {
    return weeksPeak_;
  }

  public static final int WEEKS_EDITOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object weeksEditor_ = "";
  /**
   * <code>string weeks_editor = 3 [json_name = "weeksEditor"];</code>
   * @return The weeksEditor.
   */
  @java.lang.Override
  public java.lang.String getWeeksEditor() {
    java.lang.Object ref = weeksEditor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      weeksEditor_ = s;
      return s;
    }
  }
  /**
   * <code>string weeks_editor = 3 [json_name = "weeksEditor"];</code>
   * @return The bytes for weeksEditor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWeeksEditorBytes() {
    java.lang.Object ref = weeksEditor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      weeksEditor_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRO_STATUS_FIELD_NUMBER = 4;
  private boolean proStatus_ = false;
  /**
   * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
   * @return The proStatus.
   */
  @java.lang.Override
  public boolean getProStatus() {
    return proStatus_;
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
    if (weeksCurrent_ != 0L) {
      output.writeInt64(1, weeksCurrent_);
    }
    if (weeksPeak_ != 0L) {
      output.writeInt64(2, weeksPeak_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(weeksEditor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, weeksEditor_);
    }
    if (proStatus_ != false) {
      output.writeBool(4, proStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weeksCurrent_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, weeksCurrent_);
    }
    if (weeksPeak_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, weeksPeak_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(weeksEditor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, weeksEditor_);
    }
    if (proStatus_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, proStatus_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.WeeksSummary)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.WeeksSummary other = (com.tcn.cloud.api.api.v0alpha.WeeksSummary) obj;

    if (getWeeksCurrent()
        != other.getWeeksCurrent()) return false;
    if (getWeeksPeak()
        != other.getWeeksPeak()) return false;
    if (!getWeeksEditor()
        .equals(other.getWeeksEditor())) return false;
    if (getProStatus()
        != other.getProStatus()) return false;
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
    hash = (37 * hash) + WEEKS_CURRENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWeeksCurrent());
    hash = (37 * hash) + WEEKS_PEAK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWeeksPeak());
    hash = (37 * hash) + WEEKS_EDITOR_FIELD_NUMBER;
    hash = (53 * hash) + getWeeksEditor().hashCode();
    hash = (37 * hash) + PRO_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getProStatus());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.WeeksSummary prototype) {
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
   * Protobuf type {@code api.v0alpha.WeeksSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.WeeksSummary)
      com.tcn.cloud.api.api.v0alpha.WeeksSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_WeeksSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_WeeksSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.WeeksSummary.class, com.tcn.cloud.api.api.v0alpha.WeeksSummary.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.WeeksSummary.newBuilder()
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
      weeksCurrent_ = 0L;
      weeksPeak_ = 0L;
      weeksEditor_ = "";
      proStatus_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_WeeksSummary_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WeeksSummary getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.WeeksSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WeeksSummary build() {
      com.tcn.cloud.api.api.v0alpha.WeeksSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WeeksSummary buildPartial() {
      com.tcn.cloud.api.api.v0alpha.WeeksSummary result = new com.tcn.cloud.api.api.v0alpha.WeeksSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.WeeksSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.weeksCurrent_ = weeksCurrent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.weeksPeak_ = weeksPeak_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.weeksEditor_ = weeksEditor_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.proStatus_ = proStatus_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.WeeksSummary) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.WeeksSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.WeeksSummary other) {
      if (other == com.tcn.cloud.api.api.v0alpha.WeeksSummary.getDefaultInstance()) return this;
      if (other.getWeeksCurrent() != 0L) {
        setWeeksCurrent(other.getWeeksCurrent());
      }
      if (other.getWeeksPeak() != 0L) {
        setWeeksPeak(other.getWeeksPeak());
      }
      if (!other.getWeeksEditor().isEmpty()) {
        weeksEditor_ = other.weeksEditor_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getProStatus() != false) {
        setProStatus(other.getProStatus());
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
              weeksCurrent_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              weeksPeak_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              weeksEditor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              proStatus_ = input.readBool();
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

    private long weeksCurrent_ ;
    /**
     * <code>int64 weeks_current = 1 [json_name = "weeksCurrent"];</code>
     * @return The weeksCurrent.
     */
    @java.lang.Override
    public long getWeeksCurrent() {
      return weeksCurrent_;
    }
    /**
     * <code>int64 weeks_current = 1 [json_name = "weeksCurrent"];</code>
     * @param value The weeksCurrent to set.
     * @return This builder for chaining.
     */
    public Builder setWeeksCurrent(long value) {

      weeksCurrent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 weeks_current = 1 [json_name = "weeksCurrent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeksCurrent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      weeksCurrent_ = 0L;
      onChanged();
      return this;
    }

    private long weeksPeak_ ;
    /**
     * <code>int64 weeks_peak = 2 [json_name = "weeksPeak"];</code>
     * @return The weeksPeak.
     */
    @java.lang.Override
    public long getWeeksPeak() {
      return weeksPeak_;
    }
    /**
     * <code>int64 weeks_peak = 2 [json_name = "weeksPeak"];</code>
     * @param value The weeksPeak to set.
     * @return This builder for chaining.
     */
    public Builder setWeeksPeak(long value) {

      weeksPeak_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 weeks_peak = 2 [json_name = "weeksPeak"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeksPeak() {
      bitField0_ = (bitField0_ & ~0x00000002);
      weeksPeak_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object weeksEditor_ = "";
    /**
     * <code>string weeks_editor = 3 [json_name = "weeksEditor"];</code>
     * @return The weeksEditor.
     */
    public java.lang.String getWeeksEditor() {
      java.lang.Object ref = weeksEditor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        weeksEditor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string weeks_editor = 3 [json_name = "weeksEditor"];</code>
     * @return The bytes for weeksEditor.
     */
    public com.google.protobuf.ByteString
        getWeeksEditorBytes() {
      java.lang.Object ref = weeksEditor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        weeksEditor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string weeks_editor = 3 [json_name = "weeksEditor"];</code>
     * @param value The weeksEditor to set.
     * @return This builder for chaining.
     */
    public Builder setWeeksEditor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      weeksEditor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string weeks_editor = 3 [json_name = "weeksEditor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWeeksEditor() {
      weeksEditor_ = getDefaultInstance().getWeeksEditor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string weeks_editor = 3 [json_name = "weeksEditor"];</code>
     * @param value The bytes for weeksEditor to set.
     * @return This builder for chaining.
     */
    public Builder setWeeksEditorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      weeksEditor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean proStatus_ ;
    /**
     * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
     * @return The proStatus.
     */
    @java.lang.Override
    public boolean getProStatus() {
      return proStatus_;
    }
    /**
     * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
     * @param value The proStatus to set.
     * @return This builder for chaining.
     */
    public Builder setProStatus(boolean value) {

      proStatus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      proStatus_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.WeeksSummary)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.WeeksSummary)
  private static final com.tcn.cloud.api.api.v0alpha.WeeksSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.WeeksSummary();
  }

  public static com.tcn.cloud.api.api.v0alpha.WeeksSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeeksSummary>
      PARSER = new com.google.protobuf.AbstractParser<WeeksSummary>() {
    @java.lang.Override
    public WeeksSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<WeeksSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeeksSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.WeeksSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

