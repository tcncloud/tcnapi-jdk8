// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/types.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.Int32ValueArraySql}
 */
public final class Int32ValueArraySql extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.Int32ValueArraySql)
    Int32ValueArraySqlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int32ValueArraySql.newBuilder() to construct.
  private Int32ValueArraySql(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int32ValueArraySql() {
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Int32ValueArraySql();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int32ValueArraySql_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int32ValueArraySql_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.Int32ValueArraySql.class, com.tcn.cloud.api.api.commons.Int32ValueArraySql.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Int32Value> values_;
  /**
   * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Int32Value> getValuesList() {
    return values_;
  }
  /**
   * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.Int32ValueOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getValues(int index) {
    return values_.get(index);
  }
  /**
   * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32ValueOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(1, values_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, values_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.Int32ValueArraySql)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.Int32ValueArraySql other = (com.tcn.cloud.api.api.commons.Int32ValueArraySql) obj;

    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.Int32ValueArraySql prototype) {
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
   * Protobuf type {@code api.commons.Int32ValueArraySql}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.Int32ValueArraySql)
      com.tcn.cloud.api.api.commons.Int32ValueArraySqlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int32ValueArraySql_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int32ValueArraySql_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.Int32ValueArraySql.class, com.tcn.cloud.api.api.commons.Int32ValueArraySql.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.Int32ValueArraySql.newBuilder()
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
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
      } else {
        values_ = null;
        valuesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.TypesProto.internal_static_api_commons_Int32ValueArraySql_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Int32ValueArraySql getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.Int32ValueArraySql.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Int32ValueArraySql build() {
      com.tcn.cloud.api.api.commons.Int32ValueArraySql result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.Int32ValueArraySql buildPartial() {
      com.tcn.cloud.api.api.commons.Int32ValueArraySql result = new com.tcn.cloud.api.api.commons.Int32ValueArraySql(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.Int32ValueArraySql result) {
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.Int32ValueArraySql result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.Int32ValueArraySql) {
        return mergeFrom((com.tcn.cloud.api.api.commons.Int32ValueArraySql)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.Int32ValueArraySql other) {
      if (other == com.tcn.cloud.api.api.commons.Int32ValueArraySql.getDefaultInstance()) return this;
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
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
              com.google.protobuf.Int32Value m =
                  input.readMessage(
                      com.google.protobuf.Int32Value.parser(),
                      extensionRegistry);
              if (valuesBuilder_ == null) {
                ensureValuesIsMutable();
                values_.add(m);
              } else {
                valuesBuilder_.addMessage(m);
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

    private java.util.List<com.google.protobuf.Int32Value> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<com.google.protobuf.Int32Value>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> valuesBuilder_;

    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public java.util.List<com.google.protobuf.Int32Value> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public com.google.protobuf.Int32Value getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder setValues(
        int index, com.google.protobuf.Int32Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder setValues(
        int index, com.google.protobuf.Int32Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder addValues(com.google.protobuf.Int32Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder addValues(
        int index, com.google.protobuf.Int32Value value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder addValues(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder addValues(
        int index, com.google.protobuf.Int32Value.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.google.protobuf.Int32Value> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public com.google.protobuf.Int32Value.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public com.google.protobuf.Int32ValueOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public java.util.List<? extends com.google.protobuf.Int32ValueOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public com.google.protobuf.Int32Value.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          com.google.protobuf.Int32Value.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public com.google.protobuf.Int32Value.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, com.google.protobuf.Int32Value.getDefaultInstance());
    }
    /**
     * <code>repeated .google.protobuf.Int32Value values = 1 [json_name = "values"];</code>
     */
    public java.util.List<com.google.protobuf.Int32Value.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Int32Value, com.google.protobuf.Int32Value.Builder, com.google.protobuf.Int32ValueOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.Int32ValueArraySql)
  }

  // @@protoc_insertion_point(class_scope:api.commons.Int32ValueArraySql)
  private static final com.tcn.cloud.api.api.commons.Int32ValueArraySql DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.Int32ValueArraySql();
  }

  public static com.tcn.cloud.api.api.commons.Int32ValueArraySql getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int32ValueArraySql>
      PARSER = new com.google.protobuf.AbstractParser<Int32ValueArraySql>() {
    @java.lang.Override
    public Int32ValueArraySql parsePartialFrom(
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

  public static com.google.protobuf.Parser<Int32ValueArraySql> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int32ValueArraySql> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Int32ValueArraySql getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

