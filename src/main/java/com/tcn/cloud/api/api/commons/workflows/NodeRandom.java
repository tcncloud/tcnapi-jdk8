// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/example.proto

package com.tcn.cloud.api.api.commons.workflows;

/**
 * <pre>
 * sets the diceValue property to a random number between min and max
 * </pre>
 *
 * Protobuf type {@code api.commons.workflows.NodeRandom}
 */
public final class NodeRandom extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.workflows.NodeRandom)
    NodeRandomOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeRandom.newBuilder() to construct.
  private NodeRandom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeRandom() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NodeRandom();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeRandom_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeRandom_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.workflows.NodeRandom.class, com.tcn.cloud.api.api.commons.workflows.NodeRandom.Builder.class);
  }

  public static final int MIN_FIELD_NUMBER = 1;
  private int min_ = 0;
  /**
   * <code>int32 min = 1 [json_name = "min"];</code>
   * @return The min.
   */
  @java.lang.Override
  public int getMin() {
    return min_;
  }

  public static final int MAX_FIELD_NUMBER = 2;
  private int max_ = 0;
  /**
   * <code>int32 max = 2 [json_name = "max"];</code>
   * @return The max.
   */
  @java.lang.Override
  public int getMax() {
    return max_;
  }

  public static final int SINGLE_OUTPUT_FIELD_NUMBER = 3;
  private boolean singleOutput_ = false;
  /**
   * <code>bool single_output = 3 [json_name = "singleOutput"];</code>
   * @return The singleOutput.
   */
  @java.lang.Override
  public boolean getSingleOutput() {
    return singleOutput_;
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
    if (min_ != 0) {
      output.writeInt32(1, min_);
    }
    if (max_ != 0) {
      output.writeInt32(2, max_);
    }
    if (singleOutput_ != false) {
      output.writeBool(3, singleOutput_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (min_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, min_);
    }
    if (max_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, max_);
    }
    if (singleOutput_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, singleOutput_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.workflows.NodeRandom)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.workflows.NodeRandom other = (com.tcn.cloud.api.api.commons.workflows.NodeRandom) obj;

    if (getMin()
        != other.getMin()) return false;
    if (getMax()
        != other.getMax()) return false;
    if (getSingleOutput()
        != other.getSingleOutput()) return false;
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
    hash = (37 * hash) + MIN_FIELD_NUMBER;
    hash = (53 * hash) + getMin();
    hash = (37 * hash) + MAX_FIELD_NUMBER;
    hash = (53 * hash) + getMax();
    hash = (37 * hash) + SINGLE_OUTPUT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSingleOutput());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.workflows.NodeRandom prototype) {
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
   * sets the diceValue property to a random number between min and max
   * </pre>
   *
   * Protobuf type {@code api.commons.workflows.NodeRandom}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.workflows.NodeRandom)
      com.tcn.cloud.api.api.commons.workflows.NodeRandomOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeRandom_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeRandom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.workflows.NodeRandom.class, com.tcn.cloud.api.api.commons.workflows.NodeRandom.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.workflows.NodeRandom.newBuilder()
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
      min_ = 0;
      max_ = 0;
      singleOutput_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.workflows.ExampleProto.internal_static_api_commons_workflows_NodeRandom_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.NodeRandom getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.workflows.NodeRandom.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.NodeRandom build() {
      com.tcn.cloud.api.api.commons.workflows.NodeRandom result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.workflows.NodeRandom buildPartial() {
      com.tcn.cloud.api.api.commons.workflows.NodeRandom result = new com.tcn.cloud.api.api.commons.workflows.NodeRandom(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.workflows.NodeRandom result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.min_ = min_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.max_ = max_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.singleOutput_ = singleOutput_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.workflows.NodeRandom) {
        return mergeFrom((com.tcn.cloud.api.api.commons.workflows.NodeRandom)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.workflows.NodeRandom other) {
      if (other == com.tcn.cloud.api.api.commons.workflows.NodeRandom.getDefaultInstance()) return this;
      if (other.getMin() != 0) {
        setMin(other.getMin());
      }
      if (other.getMax() != 0) {
        setMax(other.getMax());
      }
      if (other.getSingleOutput() != false) {
        setSingleOutput(other.getSingleOutput());
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
              min_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              max_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              singleOutput_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int min_ ;
    /**
     * <code>int32 min = 1 [json_name = "min"];</code>
     * @return The min.
     */
    @java.lang.Override
    public int getMin() {
      return min_;
    }
    /**
     * <code>int32 min = 1 [json_name = "min"];</code>
     * @param value The min to set.
     * @return This builder for chaining.
     */
    public Builder setMin(int value) {

      min_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 min = 1 [json_name = "min"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMin() {
      bitField0_ = (bitField0_ & ~0x00000001);
      min_ = 0;
      onChanged();
      return this;
    }

    private int max_ ;
    /**
     * <code>int32 max = 2 [json_name = "max"];</code>
     * @return The max.
     */
    @java.lang.Override
    public int getMax() {
      return max_;
    }
    /**
     * <code>int32 max = 2 [json_name = "max"];</code>
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(int value) {

      max_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max = 2 [json_name = "max"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      bitField0_ = (bitField0_ & ~0x00000002);
      max_ = 0;
      onChanged();
      return this;
    }

    private boolean singleOutput_ ;
    /**
     * <code>bool single_output = 3 [json_name = "singleOutput"];</code>
     * @return The singleOutput.
     */
    @java.lang.Override
    public boolean getSingleOutput() {
      return singleOutput_;
    }
    /**
     * <code>bool single_output = 3 [json_name = "singleOutput"];</code>
     * @param value The singleOutput to set.
     * @return This builder for chaining.
     */
    public Builder setSingleOutput(boolean value) {

      singleOutput_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool single_output = 3 [json_name = "singleOutput"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSingleOutput() {
      bitField0_ = (bitField0_ & ~0x00000004);
      singleOutput_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.commons.workflows.NodeRandom)
  }

  // @@protoc_insertion_point(class_scope:api.commons.workflows.NodeRandom)
  private static final com.tcn.cloud.api.api.commons.workflows.NodeRandom DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.workflows.NodeRandom();
  }

  public static com.tcn.cloud.api.api.commons.workflows.NodeRandom getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeRandom>
      PARSER = new com.google.protobuf.AbstractParser<NodeRandom>() {
    @java.lang.Override
    public NodeRandom parsePartialFrom(
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

  public static com.google.protobuf.Parser<NodeRandom> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeRandom> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.workflows.NodeRandom getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

