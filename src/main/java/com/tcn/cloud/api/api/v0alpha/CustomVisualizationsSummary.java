// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CustomVisualizationsSummary}
 */
public final class CustomVisualizationsSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CustomVisualizationsSummary)
    CustomVisualizationsSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomVisualizationsSummary.newBuilder() to construct.
  private CustomVisualizationsSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomVisualizationsSummary() {
    customVisualizationsEditor_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomVisualizationsSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomVisualizationsSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomVisualizationsSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary.class, com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary.Builder.class);
  }

  public static final int VISUALIZATIONS_CURRENT_FIELD_NUMBER = 1;
  private long visualizationsCurrent_ = 0L;
  /**
   * <code>int64 visualizations_current = 1 [json_name = "visualizationsCurrent"];</code>
   * @return The visualizationsCurrent.
   */
  @java.lang.Override
  public long getVisualizationsCurrent() {
    return visualizationsCurrent_;
  }

  public static final int VISUALIZATIONS_PEAK_FIELD_NUMBER = 2;
  private long visualizationsPeak_ = 0L;
  /**
   * <code>int64 visualizations_peak = 2 [json_name = "visualizationsPeak"];</code>
   * @return The visualizationsPeak.
   */
  @java.lang.Override
  public long getVisualizationsPeak() {
    return visualizationsPeak_;
  }

  public static final int CUSTOM_VISUALIZATIONS_EDITOR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customVisualizationsEditor_ = "";
  /**
   * <code>string custom_visualizations_editor = 3 [json_name = "customVisualizationsEditor"];</code>
   * @return The customVisualizationsEditor.
   */
  @java.lang.Override
  public java.lang.String getCustomVisualizationsEditor() {
    java.lang.Object ref = customVisualizationsEditor_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customVisualizationsEditor_ = s;
      return s;
    }
  }
  /**
   * <code>string custom_visualizations_editor = 3 [json_name = "customVisualizationsEditor"];</code>
   * @return The bytes for customVisualizationsEditor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomVisualizationsEditorBytes() {
    java.lang.Object ref = customVisualizationsEditor_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customVisualizationsEditor_ = b;
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
    if (visualizationsCurrent_ != 0L) {
      output.writeInt64(1, visualizationsCurrent_);
    }
    if (visualizationsPeak_ != 0L) {
      output.writeInt64(2, visualizationsPeak_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customVisualizationsEditor_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, customVisualizationsEditor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (visualizationsCurrent_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, visualizationsCurrent_);
    }
    if (visualizationsPeak_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, visualizationsPeak_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customVisualizationsEditor_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, customVisualizationsEditor_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary other = (com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary) obj;

    if (getVisualizationsCurrent()
        != other.getVisualizationsCurrent()) return false;
    if (getVisualizationsPeak()
        != other.getVisualizationsPeak()) return false;
    if (!getCustomVisualizationsEditor()
        .equals(other.getCustomVisualizationsEditor())) return false;
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
    hash = (37 * hash) + VISUALIZATIONS_CURRENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVisualizationsCurrent());
    hash = (37 * hash) + VISUALIZATIONS_PEAK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVisualizationsPeak());
    hash = (37 * hash) + CUSTOM_VISUALIZATIONS_EDITOR_FIELD_NUMBER;
    hash = (53 * hash) + getCustomVisualizationsEditor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary prototype) {
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
   * Protobuf type {@code api.v0alpha.CustomVisualizationsSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CustomVisualizationsSummary)
      com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomVisualizationsSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomVisualizationsSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary.class, com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary.newBuilder()
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
      visualizationsCurrent_ = 0L;
      visualizationsPeak_ = 0L;
      customVisualizationsEditor_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_CustomVisualizationsSummary_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary build() {
      com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary result = new com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.visualizationsCurrent_ = visualizationsCurrent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.visualizationsPeak_ = visualizationsPeak_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.customVisualizationsEditor_ = customVisualizationsEditor_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary.getDefaultInstance()) return this;
      if (other.getVisualizationsCurrent() != 0L) {
        setVisualizationsCurrent(other.getVisualizationsCurrent());
      }
      if (other.getVisualizationsPeak() != 0L) {
        setVisualizationsPeak(other.getVisualizationsPeak());
      }
      if (!other.getCustomVisualizationsEditor().isEmpty()) {
        customVisualizationsEditor_ = other.customVisualizationsEditor_;
        bitField0_ |= 0x00000004;
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
              visualizationsCurrent_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              visualizationsPeak_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              customVisualizationsEditor_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private long visualizationsCurrent_ ;
    /**
     * <code>int64 visualizations_current = 1 [json_name = "visualizationsCurrent"];</code>
     * @return The visualizationsCurrent.
     */
    @java.lang.Override
    public long getVisualizationsCurrent() {
      return visualizationsCurrent_;
    }
    /**
     * <code>int64 visualizations_current = 1 [json_name = "visualizationsCurrent"];</code>
     * @param value The visualizationsCurrent to set.
     * @return This builder for chaining.
     */
    public Builder setVisualizationsCurrent(long value) {

      visualizationsCurrent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 visualizations_current = 1 [json_name = "visualizationsCurrent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVisualizationsCurrent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      visualizationsCurrent_ = 0L;
      onChanged();
      return this;
    }

    private long visualizationsPeak_ ;
    /**
     * <code>int64 visualizations_peak = 2 [json_name = "visualizationsPeak"];</code>
     * @return The visualizationsPeak.
     */
    @java.lang.Override
    public long getVisualizationsPeak() {
      return visualizationsPeak_;
    }
    /**
     * <code>int64 visualizations_peak = 2 [json_name = "visualizationsPeak"];</code>
     * @param value The visualizationsPeak to set.
     * @return This builder for chaining.
     */
    public Builder setVisualizationsPeak(long value) {

      visualizationsPeak_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 visualizations_peak = 2 [json_name = "visualizationsPeak"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVisualizationsPeak() {
      bitField0_ = (bitField0_ & ~0x00000002);
      visualizationsPeak_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object customVisualizationsEditor_ = "";
    /**
     * <code>string custom_visualizations_editor = 3 [json_name = "customVisualizationsEditor"];</code>
     * @return The customVisualizationsEditor.
     */
    public java.lang.String getCustomVisualizationsEditor() {
      java.lang.Object ref = customVisualizationsEditor_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customVisualizationsEditor_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string custom_visualizations_editor = 3 [json_name = "customVisualizationsEditor"];</code>
     * @return The bytes for customVisualizationsEditor.
     */
    public com.google.protobuf.ByteString
        getCustomVisualizationsEditorBytes() {
      java.lang.Object ref = customVisualizationsEditor_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customVisualizationsEditor_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string custom_visualizations_editor = 3 [json_name = "customVisualizationsEditor"];</code>
     * @param value The customVisualizationsEditor to set.
     * @return This builder for chaining.
     */
    public Builder setCustomVisualizationsEditor(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customVisualizationsEditor_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string custom_visualizations_editor = 3 [json_name = "customVisualizationsEditor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomVisualizationsEditor() {
      customVisualizationsEditor_ = getDefaultInstance().getCustomVisualizationsEditor();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string custom_visualizations_editor = 3 [json_name = "customVisualizationsEditor"];</code>
     * @param value The bytes for customVisualizationsEditor to set.
     * @return This builder for chaining.
     */
    public Builder setCustomVisualizationsEditorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customVisualizationsEditor_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CustomVisualizationsSummary)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CustomVisualizationsSummary)
  private static final com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary();
  }

  public static com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomVisualizationsSummary>
      PARSER = new com.google.protobuf.AbstractParser<CustomVisualizationsSummary>() {
    @java.lang.Override
    public CustomVisualizationsSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomVisualizationsSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomVisualizationsSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CustomVisualizationsSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

