// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CustomReportsEnabledSummary}
 */
public final class CustomReportsEnabledSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CustomReportsEnabledSummary)
    CustomReportsEnabledSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomReportsEnabledSummary.newBuilder() to construct.
  private CustomReportsEnabledSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomReportsEnabledSummary() {
    customReportsEnabledEditor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomReportsEnabledSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomReportsEnabledSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomReportsEnabledSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary.class, com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary.Builder.class);
  }

  public static final int CUSTOM_REPORTS_ENABLED_CURRENT_FIELD_NUMBER = 1;
  private boolean customReportsEnabledCurrent_ = false;
  /**
   * <code>bool custom_reports_enabled_current = 1 [json_name = "customReportsEnabledCurrent"];</code>
   * @return The customReportsEnabledCurrent.
   */
  @java.lang.Override
  public boolean getCustomReportsEnabledCurrent() {
    return customReportsEnabledCurrent_;
  }

  public static final int CUSTOM_REPORTS_ENABLED_PEAK_FIELD_NUMBER = 2;
  private boolean customReportsEnabledPeak_ = false;
  /**
   * <code>bool custom_reports_enabled_peak = 2 [json_name = "customReportsEnabledPeak"];</code>
   * @return The customReportsEnabledPeak.
   */
  @java.lang.Override
  public boolean getCustomReportsEnabledPeak() {
    return customReportsEnabledPeak_;
  }

  public static final int CUSTOM_REPORTS_ENABLED_EDITOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customReportsEnabledEditor_ = "";
  /**
   * <code>string custom_reports_enabled_editor = 3 [json_name = "customReportsEnabledEditor"];</code>
   * @return The customReportsEnabledEditor.
   */
  @java.lang.Override
  public java.lang.String getCustomReportsEnabledEditor() {
    java.lang.Object ref = customReportsEnabledEditor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customReportsEnabledEditor_ = s;
      return s;
    }
  }
  /**
   * <code>string custom_reports_enabled_editor = 3 [json_name = "customReportsEnabledEditor"];</code>
   * @return The bytes for customReportsEnabledEditor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomReportsEnabledEditorBytes() {
    java.lang.Object ref = customReportsEnabledEditor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customReportsEnabledEditor_ = b;
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
    if (customReportsEnabledCurrent_ != false) {
      output.writeBool(1, customReportsEnabledCurrent_);
    }
    if (customReportsEnabledPeak_ != false) {
      output.writeBool(2, customReportsEnabledPeak_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customReportsEnabledEditor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customReportsEnabledEditor_);
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
    if (customReportsEnabledCurrent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, customReportsEnabledCurrent_);
    }
    if (customReportsEnabledPeak_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, customReportsEnabledPeak_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customReportsEnabledEditor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customReportsEnabledEditor_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary other = (com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary) obj;

    if (getCustomReportsEnabledCurrent()
        != other.getCustomReportsEnabledCurrent()) return false;
    if (getCustomReportsEnabledPeak()
        != other.getCustomReportsEnabledPeak()) return false;
    if (!getCustomReportsEnabledEditor()
        .equals(other.getCustomReportsEnabledEditor())) return false;
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
    hash = (37 * hash) + CUSTOM_REPORTS_ENABLED_CURRENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCustomReportsEnabledCurrent());
    hash = (37 * hash) + CUSTOM_REPORTS_ENABLED_PEAK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCustomReportsEnabledPeak());
    hash = (37 * hash) + CUSTOM_REPORTS_ENABLED_EDITOR_FIELD_NUMBER;
    hash = (53 * hash) + getCustomReportsEnabledEditor().hashCode();
    hash = (37 * hash) + PRO_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getProStatus());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary prototype) {
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
   * Protobuf type {@code api.v0alpha.CustomReportsEnabledSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CustomReportsEnabledSummary)
      com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomReportsEnabledSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomReportsEnabledSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary.class, com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary.newBuilder()
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
      customReportsEnabledCurrent_ = false;
      customReportsEnabledPeak_ = false;
      customReportsEnabledEditor_ = "";
      proStatus_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomReportsEnabledSummary_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary build() {
      com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary result = new com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customReportsEnabledCurrent_ = customReportsEnabledCurrent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.customReportsEnabledPeak_ = customReportsEnabledPeak_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.customReportsEnabledEditor_ = customReportsEnabledEditor_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary.getDefaultInstance()) return this;
      if (other.getCustomReportsEnabledCurrent() != false) {
        setCustomReportsEnabledCurrent(other.getCustomReportsEnabledCurrent());
      }
      if (other.getCustomReportsEnabledPeak() != false) {
        setCustomReportsEnabledPeak(other.getCustomReportsEnabledPeak());
      }
      if (!other.getCustomReportsEnabledEditor().isEmpty()) {
        customReportsEnabledEditor_ = other.customReportsEnabledEditor_;
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
              customReportsEnabledCurrent_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              customReportsEnabledPeak_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              customReportsEnabledEditor_ = input.readStringRequireUtf8();
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

    private boolean customReportsEnabledCurrent_ ;
    /**
     * <code>bool custom_reports_enabled_current = 1 [json_name = "customReportsEnabledCurrent"];</code>
     * @return The customReportsEnabledCurrent.
     */
    @java.lang.Override
    public boolean getCustomReportsEnabledCurrent() {
      return customReportsEnabledCurrent_;
    }
    /**
     * <code>bool custom_reports_enabled_current = 1 [json_name = "customReportsEnabledCurrent"];</code>
     * @param value The customReportsEnabledCurrent to set.
     * @return This builder for chaining.
     */
    public Builder setCustomReportsEnabledCurrent(boolean value) {

      customReportsEnabledCurrent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool custom_reports_enabled_current = 1 [json_name = "customReportsEnabledCurrent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomReportsEnabledCurrent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      customReportsEnabledCurrent_ = false;
      onChanged();
      return this;
    }

    private boolean customReportsEnabledPeak_ ;
    /**
     * <code>bool custom_reports_enabled_peak = 2 [json_name = "customReportsEnabledPeak"];</code>
     * @return The customReportsEnabledPeak.
     */
    @java.lang.Override
    public boolean getCustomReportsEnabledPeak() {
      return customReportsEnabledPeak_;
    }
    /**
     * <code>bool custom_reports_enabled_peak = 2 [json_name = "customReportsEnabledPeak"];</code>
     * @param value The customReportsEnabledPeak to set.
     * @return This builder for chaining.
     */
    public Builder setCustomReportsEnabledPeak(boolean value) {

      customReportsEnabledPeak_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool custom_reports_enabled_peak = 2 [json_name = "customReportsEnabledPeak"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomReportsEnabledPeak() {
      bitField0_ = (bitField0_ & ~0x00000002);
      customReportsEnabledPeak_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object customReportsEnabledEditor_ = "";
    /**
     * <code>string custom_reports_enabled_editor = 3 [json_name = "customReportsEnabledEditor"];</code>
     * @return The customReportsEnabledEditor.
     */
    public java.lang.String getCustomReportsEnabledEditor() {
      java.lang.Object ref = customReportsEnabledEditor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customReportsEnabledEditor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string custom_reports_enabled_editor = 3 [json_name = "customReportsEnabledEditor"];</code>
     * @return The bytes for customReportsEnabledEditor.
     */
    public com.google.protobuf.ByteString
        getCustomReportsEnabledEditorBytes() {
      java.lang.Object ref = customReportsEnabledEditor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customReportsEnabledEditor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string custom_reports_enabled_editor = 3 [json_name = "customReportsEnabledEditor"];</code>
     * @param value The customReportsEnabledEditor to set.
     * @return This builder for chaining.
     */
    public Builder setCustomReportsEnabledEditor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customReportsEnabledEditor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string custom_reports_enabled_editor = 3 [json_name = "customReportsEnabledEditor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomReportsEnabledEditor() {
      customReportsEnabledEditor_ = getDefaultInstance().getCustomReportsEnabledEditor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string custom_reports_enabled_editor = 3 [json_name = "customReportsEnabledEditor"];</code>
     * @param value The bytes for customReportsEnabledEditor to set.
     * @return This builder for chaining.
     */
    public Builder setCustomReportsEnabledEditorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customReportsEnabledEditor_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CustomReportsEnabledSummary)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CustomReportsEnabledSummary)
  private static final com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary();
  }

  public static com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomReportsEnabledSummary>
      PARSER = new com.google.protobuf.AbstractParser<CustomReportsEnabledSummary>() {
    @java.lang.Override
    public CustomReportsEnabledSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomReportsEnabledSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomReportsEnabledSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CustomReportsEnabledSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

