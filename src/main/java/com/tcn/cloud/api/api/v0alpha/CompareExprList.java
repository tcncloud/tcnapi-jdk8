// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Compare expression list
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.CompareExprList}
 */
public final class CompareExprList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CompareExprList)
    CompareExprListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompareExprList.newBuilder() to construct.
  private CompareExprList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompareExprList() {
    simpleCompareExpression_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompareExprList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CompareExprList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CompareExprList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CompareExprList.class, com.tcn.cloud.api.api.v0alpha.CompareExprList.Builder.class);
  }

  public static final int SIMPLE_COMPARE_EXPRESSION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression> simpleCompareExpression_;
  /**
   * <pre>
   * List of simple compare expressions
   * </pre>
   *
   * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression> getSimpleCompareExpressionList() {
    return simpleCompareExpression_;
  }
  /**
   * <pre>
   * List of simple compare expressions
   * </pre>
   *
   * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SimpleCompareExpressionOrBuilder> 
      getSimpleCompareExpressionOrBuilderList() {
    return simpleCompareExpression_;
  }
  /**
   * <pre>
   * List of simple compare expressions
   * </pre>
   *
   * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
   */
  @java.lang.Override
  public int getSimpleCompareExpressionCount() {
    return simpleCompareExpression_.size();
  }
  /**
   * <pre>
   * List of simple compare expressions
   * </pre>
   *
   * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression getSimpleCompareExpression(int index) {
    return simpleCompareExpression_.get(index);
  }
  /**
   * <pre>
   * List of simple compare expressions
   * </pre>
   *
   * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SimpleCompareExpressionOrBuilder getSimpleCompareExpressionOrBuilder(
      int index) {
    return simpleCompareExpression_.get(index);
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
    for (int i = 0; i < simpleCompareExpression_.size(); i++) {
      output.writeMessage(1, simpleCompareExpression_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < simpleCompareExpression_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, simpleCompareExpression_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CompareExprList)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CompareExprList other = (com.tcn.cloud.api.api.v0alpha.CompareExprList) obj;

    if (!getSimpleCompareExpressionList()
        .equals(other.getSimpleCompareExpressionList())) return false;
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
    if (getSimpleCompareExpressionCount() > 0) {
      hash = (37 * hash) + SIMPLE_COMPARE_EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSimpleCompareExpressionList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CompareExprList parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CompareExprList prototype) {
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
   * Compare expression list
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.CompareExprList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CompareExprList)
      com.tcn.cloud.api.api.v0alpha.CompareExprListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CompareExprList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CompareExprList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CompareExprList.class, com.tcn.cloud.api.api.v0alpha.CompareExprList.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CompareExprList.newBuilder()
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
      if (simpleCompareExpressionBuilder_ == null) {
        simpleCompareExpression_ = java.util.Collections.emptyList();
      } else {
        simpleCompareExpression_ = null;
        simpleCompareExpressionBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_CompareExprList_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CompareExprList getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CompareExprList.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CompareExprList build() {
      com.tcn.cloud.api.api.v0alpha.CompareExprList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CompareExprList buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CompareExprList result = new com.tcn.cloud.api.api.v0alpha.CompareExprList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.CompareExprList result) {
      if (simpleCompareExpressionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          simpleCompareExpression_ = java.util.Collections.unmodifiableList(simpleCompareExpression_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.simpleCompareExpression_ = simpleCompareExpression_;
      } else {
        result.simpleCompareExpression_ = simpleCompareExpressionBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CompareExprList result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CompareExprList) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CompareExprList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CompareExprList other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CompareExprList.getDefaultInstance()) return this;
      if (simpleCompareExpressionBuilder_ == null) {
        if (!other.simpleCompareExpression_.isEmpty()) {
          if (simpleCompareExpression_.isEmpty()) {
            simpleCompareExpression_ = other.simpleCompareExpression_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSimpleCompareExpressionIsMutable();
            simpleCompareExpression_.addAll(other.simpleCompareExpression_);
          }
          onChanged();
        }
      } else {
        if (!other.simpleCompareExpression_.isEmpty()) {
          if (simpleCompareExpressionBuilder_.isEmpty()) {
            simpleCompareExpressionBuilder_.dispose();
            simpleCompareExpressionBuilder_ = null;
            simpleCompareExpression_ = other.simpleCompareExpression_;
            bitField0_ = (bitField0_ & ~0x00000001);
            simpleCompareExpressionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSimpleCompareExpressionFieldBuilder() : null;
          } else {
            simpleCompareExpressionBuilder_.addAllMessages(other.simpleCompareExpression_);
          }
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
              com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.parser(),
                      extensionRegistry);
              if (simpleCompareExpressionBuilder_ == null) {
                ensureSimpleCompareExpressionIsMutable();
                simpleCompareExpression_.add(m);
              } else {
                simpleCompareExpressionBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression> simpleCompareExpression_ =
      java.util.Collections.emptyList();
    private void ensureSimpleCompareExpressionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        simpleCompareExpression_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression>(simpleCompareExpression_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpressionOrBuilder> simpleCompareExpressionBuilder_;

    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression> getSimpleCompareExpressionList() {
      if (simpleCompareExpressionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(simpleCompareExpression_);
      } else {
        return simpleCompareExpressionBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public int getSimpleCompareExpressionCount() {
      if (simpleCompareExpressionBuilder_ == null) {
        return simpleCompareExpression_.size();
      } else {
        return simpleCompareExpressionBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression getSimpleCompareExpression(int index) {
      if (simpleCompareExpressionBuilder_ == null) {
        return simpleCompareExpression_.get(index);
      } else {
        return simpleCompareExpressionBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder setSimpleCompareExpression(
        int index, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression value) {
      if (simpleCompareExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSimpleCompareExpressionIsMutable();
        simpleCompareExpression_.set(index, value);
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder setSimpleCompareExpression(
        int index, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder builderForValue) {
      if (simpleCompareExpressionBuilder_ == null) {
        ensureSimpleCompareExpressionIsMutable();
        simpleCompareExpression_.set(index, builderForValue.build());
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder addSimpleCompareExpression(com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression value) {
      if (simpleCompareExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSimpleCompareExpressionIsMutable();
        simpleCompareExpression_.add(value);
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder addSimpleCompareExpression(
        int index, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression value) {
      if (simpleCompareExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSimpleCompareExpressionIsMutable();
        simpleCompareExpression_.add(index, value);
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder addSimpleCompareExpression(
        com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder builderForValue) {
      if (simpleCompareExpressionBuilder_ == null) {
        ensureSimpleCompareExpressionIsMutable();
        simpleCompareExpression_.add(builderForValue.build());
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder addSimpleCompareExpression(
        int index, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder builderForValue) {
      if (simpleCompareExpressionBuilder_ == null) {
        ensureSimpleCompareExpressionIsMutable();
        simpleCompareExpression_.add(index, builderForValue.build());
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder addAllSimpleCompareExpression(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression> values) {
      if (simpleCompareExpressionBuilder_ == null) {
        ensureSimpleCompareExpressionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, simpleCompareExpression_);
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder clearSimpleCompareExpression() {
      if (simpleCompareExpressionBuilder_ == null) {
        simpleCompareExpression_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public Builder removeSimpleCompareExpression(int index) {
      if (simpleCompareExpressionBuilder_ == null) {
        ensureSimpleCompareExpressionIsMutable();
        simpleCompareExpression_.remove(index);
        onChanged();
      } else {
        simpleCompareExpressionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder getSimpleCompareExpressionBuilder(
        int index) {
      return getSimpleCompareExpressionFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SimpleCompareExpressionOrBuilder getSimpleCompareExpressionOrBuilder(
        int index) {
      if (simpleCompareExpressionBuilder_ == null) {
        return simpleCompareExpression_.get(index);  } else {
        return simpleCompareExpressionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.SimpleCompareExpressionOrBuilder> 
         getSimpleCompareExpressionOrBuilderList() {
      if (simpleCompareExpressionBuilder_ != null) {
        return simpleCompareExpressionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(simpleCompareExpression_);
      }
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder addSimpleCompareExpressionBuilder() {
      return getSimpleCompareExpressionFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.getDefaultInstance());
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder addSimpleCompareExpressionBuilder(
        int index) {
      return getSimpleCompareExpressionFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.getDefaultInstance());
    }
    /**
     * <pre>
     * List of simple compare expressions
     * </pre>
     *
     * <code>repeated .api.v0alpha.SimpleCompareExpression simple_compare_expression = 1 [json_name = "simpleCompareExpression"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder> 
         getSimpleCompareExpressionBuilderList() {
      return getSimpleCompareExpressionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpressionOrBuilder> 
        getSimpleCompareExpressionFieldBuilder() {
      if (simpleCompareExpressionBuilder_ == null) {
        simpleCompareExpressionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpression.Builder, com.tcn.cloud.api.api.v0alpha.SimpleCompareExpressionOrBuilder>(
                simpleCompareExpression_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        simpleCompareExpression_ = null;
      }
      return simpleCompareExpressionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CompareExprList)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CompareExprList)
  private static final com.tcn.cloud.api.api.v0alpha.CompareExprList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CompareExprList();
  }

  public static com.tcn.cloud.api.api.v0alpha.CompareExprList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompareExprList>
      PARSER = new com.google.protobuf.AbstractParser<CompareExprList>() {
    @java.lang.Override
    public CompareExprList parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompareExprList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompareExprList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CompareExprList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

