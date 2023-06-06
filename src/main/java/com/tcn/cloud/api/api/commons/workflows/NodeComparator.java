// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/example.proto

package com.tcn.cloud.api.api.commons.workflows;

/**
 * <pre>
 * comparator has 3 outputs: smaller, equal, greater
 * the fields are evaluated using JSONata
 * </pre>
 *
 * Protobuf type {@code api.commons.workflows.NodeComparator}
 */
public final class NodeComparator extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.workflows.NodeComparator)
    NodeComparatorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeComparator.newBuilder() to construct.
  private NodeComparator(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeComparator() {
    firstField_ = "";
    secondField_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeComparator();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeComparator_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeComparator_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.workflows.NodeComparator.class, com.tcn.cloud.api.api.commons.workflows.NodeComparator.Builder.class);
  }

  public static final int FIRST_FIELD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object firstField_ = "";
  /**
   * <code>string first_field = 1 [json_name = "firstField"];</code>
   * @return The firstField.
   */
  @java.lang.Override
  public java.lang.String getFirstField() {
    java.lang.Object ref = firstField_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstField_ = s;
      return s;
    }
  }
  /**
   * <code>string first_field = 1 [json_name = "firstField"];</code>
   * @return The bytes for firstField.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFirstFieldBytes() {
    java.lang.Object ref = firstField_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstField_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECOND_FIELD_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object secondField_ = "";
  /**
   * <code>string second_field = 2 [json_name = "secondField"];</code>
   * @return The secondField.
   */
  @java.lang.Override
  public java.lang.String getSecondField() {
    java.lang.Object ref = secondField_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      secondField_ = s;
      return s;
    }
  }
  /**
   * <code>string second_field = 2 [json_name = "secondField"];</code>
   * @return The bytes for secondField.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSecondFieldBytes() {
    java.lang.Object ref = secondField_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      secondField_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firstField_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, firstField_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondField_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, secondField_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firstField_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, firstField_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(secondField_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, secondField_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.workflows.NodeComparator)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.workflows.NodeComparator other = (com.tcn.cloud.api.api.commons.workflows.NodeComparator) obj;

    if (!getFirstField()
        .equals(other.getFirstField())) return false;
    if (!getSecondField()
        .equals(other.getSecondField())) return false;
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
    hash = (37 * hash) + FIRST_FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getFirstField().hashCode();
    hash = (37 * hash) + SECOND_FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getSecondField().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.workflows.NodeComparator prototype) {
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
   * comparator has 3 outputs: smaller, equal, greater
   * the fields are evaluated using JSONata
   * </pre>
   *
   * Protobuf type {@code api.commons.workflows.NodeComparator}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.workflows.NodeComparator)
      com.tcn.cloud.api.api.commons.workflows.NodeComparatorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeComparator_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeComparator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.workflows.NodeComparator.class, com.tcn.cloud.api.api.commons.workflows.NodeComparator.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.workflows.NodeComparator.newBuilder()
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
      firstField_ = "";
      secondField_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeComparator_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.NodeComparator getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.workflows.NodeComparator.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.NodeComparator build() {
      com.tcn.cloud.api.api.commons.workflows.NodeComparator result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.NodeComparator buildPartial() {
      com.tcn.cloud.api.api.commons.workflows.NodeComparator result = new com.tcn.cloud.api.api.commons.workflows.NodeComparator(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.workflows.NodeComparator result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.firstField_ = firstField_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.secondField_ = secondField_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.workflows.NodeComparator) {
        return mergeFrom((com.tcn.cloud.api.api.commons.workflows.NodeComparator)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.workflows.NodeComparator other) {
      if (other == com.tcn.cloud.api.api.commons.workflows.NodeComparator.getDefaultInstance()) return this;
      if (!other.getFirstField().isEmpty()) {
        firstField_ = other.firstField_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSecondField().isEmpty()) {
        secondField_ = other.secondField_;
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
              firstField_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              secondField_ = input.readStringRequireUtf8();
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

    private java.lang.Object firstField_ = "";
    /**
     * <code>string first_field = 1 [json_name = "firstField"];</code>
     * @return The firstField.
     */
    public java.lang.String getFirstField() {
      java.lang.Object ref = firstField_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstField_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string first_field = 1 [json_name = "firstField"];</code>
     * @return The bytes for firstField.
     */
    public com.google.protobuf.ByteString
        getFirstFieldBytes() {
      java.lang.Object ref = firstField_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstField_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string first_field = 1 [json_name = "firstField"];</code>
     * @param value The firstField to set.
     * @return This builder for chaining.
     */
    public Builder setFirstField(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      firstField_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string first_field = 1 [json_name = "firstField"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstField() {
      firstField_ = getDefaultInstance().getFirstField();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string first_field = 1 [json_name = "firstField"];</code>
     * @param value The bytes for firstField to set.
     * @return This builder for chaining.
     */
    public Builder setFirstFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      firstField_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object secondField_ = "";
    /**
     * <code>string second_field = 2 [json_name = "secondField"];</code>
     * @return The secondField.
     */
    public java.lang.String getSecondField() {
      java.lang.Object ref = secondField_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        secondField_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string second_field = 2 [json_name = "secondField"];</code>
     * @return The bytes for secondField.
     */
    public com.google.protobuf.ByteString
        getSecondFieldBytes() {
      java.lang.Object ref = secondField_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        secondField_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string second_field = 2 [json_name = "secondField"];</code>
     * @param value The secondField to set.
     * @return This builder for chaining.
     */
    public Builder setSecondField(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      secondField_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string second_field = 2 [json_name = "secondField"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSecondField() {
      secondField_ = getDefaultInstance().getSecondField();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string second_field = 2 [json_name = "secondField"];</code>
     * @param value The bytes for secondField to set.
     * @return This builder for chaining.
     */
    public Builder setSecondFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      secondField_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.commons.workflows.NodeComparator)
  }

  // @@protoc_insertion_point(class_scope:api.commons.workflows.NodeComparator)
  private static final com.tcn.cloud.api.api.commons.workflows.NodeComparator DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.workflows.NodeComparator();
  }

  public static com.tcn.cloud.api.api.commons.workflows.NodeComparator getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeComparator>
      PARSER = new com.google.protobuf.AbstractParser<NodeComparator>() {
    @java.lang.Override
    public NodeComparator parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeComparator> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeComparator> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.NodeComparator getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

