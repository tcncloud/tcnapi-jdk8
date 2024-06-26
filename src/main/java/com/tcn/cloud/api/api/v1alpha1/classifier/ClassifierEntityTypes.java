// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/entities.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

/**
 * Protobuf type {@code api.v1alpha1.classifier.ClassifierEntityTypes}
 */
public final class ClassifierEntityTypes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.classifier.ClassifierEntityTypes)
    ClassifierEntityTypesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClassifierEntityTypes.newBuilder() to construct.
  private ClassifierEntityTypes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClassifierEntityTypes() {
    types_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClassifierEntityTypes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.classifier.EntitiesProto.internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.classifier.EntitiesProto.internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes.class, com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes.Builder.class);
  }

  public static final int TYPES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> types_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.ClassifierEntityType> types_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.ClassifierEntityType>() {
            public com.tcn.cloud.api.api.commons.ClassifierEntityType convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.ClassifierEntityType result = com.tcn.cloud.api.api.commons.ClassifierEntityType.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.ClassifierEntityType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
   * @return A list containing the types.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.ClassifierEntityType> getTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.ClassifierEntityType>(types_, types_converter_);
  }
  /**
   * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
   * @return The count of types.
   */
  @java.lang.Override
  public int getTypesCount() {
    return types_.size();
  }
  /**
   * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
   * @param index The index of the element to return.
   * @return The types at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ClassifierEntityType getTypes(int index) {
    return types_converter_.convert(types_.get(index));
  }
  /**
   * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
   * @return A list containing the enum numeric values on the wire for types.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getTypesValueList() {
    return types_;
  }
  /**
   * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of types at the given index.
   */
  @java.lang.Override
  public int getTypesValue(int index) {
    return types_.get(index);
  }
  private int typesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getTypesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(typesMemoizedSerializedSize);
    }
    for (int i = 0; i < types_.size(); i++) {
      output.writeEnumNoTag(types_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < types_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(types_.get(i));
      }
      size += dataSize;
      if (!getTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }typesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes other = (com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes) obj;

    if (!types_.equals(other.types_)) return false;
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
    if (getTypesCount() > 0) {
      hash = (37 * hash) + TYPES_FIELD_NUMBER;
      hash = (53 * hash) + types_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes prototype) {
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
   * Protobuf type {@code api.v1alpha1.classifier.ClassifierEntityTypes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.classifier.ClassifierEntityTypes)
      com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.EntitiesProto.internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.EntitiesProto.internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes.class, com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes.newBuilder()
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
      types_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.EntitiesProto.internal_static_api_v1alpha1_classifier_ClassifierEntityTypes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes build() {
      com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes result = new com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        types_ = java.util.Collections.unmodifiableList(types_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.types_ = types_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes.getDefaultInstance()) return this;
      if (!other.types_.isEmpty()) {
        if (types_.isEmpty()) {
          types_ = other.types_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTypesIsMutable();
          types_.addAll(other.types_);
        }
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
              int tmpRaw = input.readEnum();
              ensureTypesIsMutable();
              types_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureTypesIsMutable();
                types_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
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

    private java.util.List<java.lang.Integer> types_ =
      java.util.Collections.emptyList();
    private void ensureTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        types_ = new java.util.ArrayList<java.lang.Integer>(types_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @return A list containing the types.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.ClassifierEntityType> getTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.ClassifierEntityType>(types_, types_converter_);
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @return The count of types.
     */
    public int getTypesCount() {
      return types_.size();
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @param index The index of the element to return.
     * @return The types at the given index.
     */
    public com.tcn.cloud.api.api.commons.ClassifierEntityType getTypes(int index) {
      return types_converter_.convert(types_.get(index));
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @param index The index to set the value at.
     * @param value The types to set.
     * @return This builder for chaining.
     */
    public Builder setTypes(
        int index, com.tcn.cloud.api.api.commons.ClassifierEntityType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTypesIsMutable();
      types_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @param value The types to add.
     * @return This builder for chaining.
     */
    public Builder addTypes(com.tcn.cloud.api.api.commons.ClassifierEntityType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTypesIsMutable();
      types_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @param values The types to add.
     * @return This builder for chaining.
     */
    public Builder addAllTypes(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.ClassifierEntityType> values) {
      ensureTypesIsMutable();
      for (com.tcn.cloud.api.api.commons.ClassifierEntityType value : values) {
        types_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTypes() {
      types_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @return A list containing the enum numeric values on the wire for types.
     */
    public java.util.List<java.lang.Integer>
    getTypesValueList() {
      return java.util.Collections.unmodifiableList(types_);
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of types at the given index.
     */
    public int getTypesValue(int index) {
      return types_.get(index);
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for types to set.
     * @return This builder for chaining.
     */
    public Builder setTypesValue(
        int index, int value) {
      ensureTypesIsMutable();
      types_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @param value The enum numeric value on the wire for types to add.
     * @return This builder for chaining.
     */
    public Builder addTypesValue(int value) {
      ensureTypesIsMutable();
      types_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .api.commons.ClassifierEntityType types = 1 [json_name = "types"];</code>
     * @param values The enum numeric values on the wire for types to add.
     * @return This builder for chaining.
     */
    public Builder addAllTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureTypesIsMutable();
      for (int value : values) {
        types_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.classifier.ClassifierEntityTypes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.classifier.ClassifierEntityTypes)
  private static final com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClassifierEntityTypes>
      PARSER = new com.google.protobuf.AbstractParser<ClassifierEntityTypes>() {
    @java.lang.Override
    public ClassifierEntityTypes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClassifierEntityTypes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClassifierEntityTypes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.classifier.ClassifierEntityTypes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

