// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/pipeline/pipeline.proto

package com.tcn.cloud.api.api.v1alpha1.explorer.pipeline;

/**
 * <pre>
 * JoinColumn describes a join column
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.explorer.pipeline.JoinColumn}
 */
public final class JoinColumn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.explorer.pipeline.JoinColumn)
    JoinColumnOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinColumn.newBuilder() to construct.
  private JoinColumn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinColumn() {
    firstParentColumn_ = "";
    secondParentColumn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JoinColumn();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.PipelineProto.internal_static_api_v1alpha1_explorer_pipeline_JoinColumn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.PipelineProto.internal_static_api_v1alpha1_explorer_pipeline_JoinColumn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn.class, com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn.Builder.class);
  }

  public static final int FIRST_PARENT_COLUMN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object firstParentColumn_ = "";
  /**
   * <pre>
   * First parent column
   * </pre>
   *
   * <code>string first_parent_column = 1 [json_name = "firstParentColumn"];</code>
   * @return The firstParentColumn.
   */
  @java.lang.Override
  public java.lang.String getFirstParentColumn() {
    java.lang.Object ref = firstParentColumn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstParentColumn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * First parent column
   * </pre>
   *
   * <code>string first_parent_column = 1 [json_name = "firstParentColumn"];</code>
   * @return The bytes for firstParentColumn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFirstParentColumnBytes() {
    java.lang.Object ref = firstParentColumn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstParentColumn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECOND_PARENT_COLUMN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object secondParentColumn_ = "";
  /**
   * <pre>
   * second parent column
   * </pre>
   *
   * <code>string second_parent_column = 2 [json_name = "secondParentColumn"];</code>
   * @return The secondParentColumn.
   */
  @java.lang.Override
  public java.lang.String getSecondParentColumn() {
    java.lang.Object ref = secondParentColumn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secondParentColumn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * second parent column
   * </pre>
   *
   * <code>string second_parent_column = 2 [json_name = "secondParentColumn"];</code>
   * @return The bytes for secondParentColumn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecondParentColumnBytes() {
    java.lang.Object ref = secondParentColumn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      secondParentColumn_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firstParentColumn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, firstParentColumn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondParentColumn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secondParentColumn_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firstParentColumn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, firstParentColumn_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondParentColumn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secondParentColumn_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn other = (com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn) obj;

    if (!getFirstParentColumn()
        .equals(other.getFirstParentColumn())) return false;
    if (!getSecondParentColumn()
        .equals(other.getSecondParentColumn())) return false;
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
    hash = (37 * hash) + FIRST_PARENT_COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + getFirstParentColumn().hashCode();
    hash = (37 * hash) + SECOND_PARENT_COLUMN_FIELD_NUMBER;
    hash = (53 * hash) + getSecondParentColumn().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn prototype) {
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
   * JoinColumn describes a join column
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.explorer.pipeline.JoinColumn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.explorer.pipeline.JoinColumn)
      com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.PipelineProto.internal_static_api_v1alpha1_explorer_pipeline_JoinColumn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.PipelineProto.internal_static_api_v1alpha1_explorer_pipeline_JoinColumn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn.class, com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn.newBuilder()
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
      firstParentColumn_ = "";
      secondParentColumn_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.PipelineProto.internal_static_api_v1alpha1_explorer_pipeline_JoinColumn_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn build() {
      com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn result = new com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.firstParentColumn_ = firstParentColumn_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secondParentColumn_ = secondParentColumn_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn.getDefaultInstance()) return this;
      if (!other.getFirstParentColumn().isEmpty()) {
        firstParentColumn_ = other.firstParentColumn_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSecondParentColumn().isEmpty()) {
        secondParentColumn_ = other.secondParentColumn_;
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
            case 10: {
              firstParentColumn_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              secondParentColumn_ = input.readStringRequireUtf8();
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

    private java.lang.Object firstParentColumn_ = "";
    /**
     * <pre>
     * First parent column
     * </pre>
     *
     * <code>string first_parent_column = 1 [json_name = "firstParentColumn"];</code>
     * @return The firstParentColumn.
     */
    public java.lang.String getFirstParentColumn() {
      java.lang.Object ref = firstParentColumn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstParentColumn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * First parent column
     * </pre>
     *
     * <code>string first_parent_column = 1 [json_name = "firstParentColumn"];</code>
     * @return The bytes for firstParentColumn.
     */
    public com.google.protobuf.ByteString
        getFirstParentColumnBytes() {
      java.lang.Object ref = firstParentColumn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstParentColumn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * First parent column
     * </pre>
     *
     * <code>string first_parent_column = 1 [json_name = "firstParentColumn"];</code>
     * @param value The firstParentColumn to set.
     * @return This builder for chaining.
     */
    public Builder setFirstParentColumn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      firstParentColumn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * First parent column
     * </pre>
     *
     * <code>string first_parent_column = 1 [json_name = "firstParentColumn"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstParentColumn() {
      firstParentColumn_ = getDefaultInstance().getFirstParentColumn();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * First parent column
     * </pre>
     *
     * <code>string first_parent_column = 1 [json_name = "firstParentColumn"];</code>
     * @param value The bytes for firstParentColumn to set.
     * @return This builder for chaining.
     */
    public Builder setFirstParentColumnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      firstParentColumn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object secondParentColumn_ = "";
    /**
     * <pre>
     * second parent column
     * </pre>
     *
     * <code>string second_parent_column = 2 [json_name = "secondParentColumn"];</code>
     * @return The secondParentColumn.
     */
    public java.lang.String getSecondParentColumn() {
      java.lang.Object ref = secondParentColumn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secondParentColumn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * second parent column
     * </pre>
     *
     * <code>string second_parent_column = 2 [json_name = "secondParentColumn"];</code>
     * @return The bytes for secondParentColumn.
     */
    public com.google.protobuf.ByteString
        getSecondParentColumnBytes() {
      java.lang.Object ref = secondParentColumn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secondParentColumn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * second parent column
     * </pre>
     *
     * <code>string second_parent_column = 2 [json_name = "secondParentColumn"];</code>
     * @param value The secondParentColumn to set.
     * @return This builder for chaining.
     */
    public Builder setSecondParentColumn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      secondParentColumn_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * second parent column
     * </pre>
     *
     * <code>string second_parent_column = 2 [json_name = "secondParentColumn"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondParentColumn() {
      secondParentColumn_ = getDefaultInstance().getSecondParentColumn();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * second parent column
     * </pre>
     *
     * <code>string second_parent_column = 2 [json_name = "secondParentColumn"];</code>
     * @param value The bytes for secondParentColumn to set.
     * @return This builder for chaining.
     */
    public Builder setSecondParentColumnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      secondParentColumn_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.explorer.pipeline.JoinColumn)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.explorer.pipeline.JoinColumn)
  private static final com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn();
  }

  public static com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinColumn>
      PARSER = new com.google.protobuf.AbstractParser<JoinColumn>() {
    @java.lang.Override
    public JoinColumn parsePartialFrom(
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

  public static com.google.protobuf.Parser<JoinColumn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinColumn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.explorer.pipeline.JoinColumn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

