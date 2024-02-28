// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/api/entities/v1alpha1/flows.proto

package com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1;

/**
 * Protobuf type {@code services.omnichannel.api.entities.v1alpha1.FlowField}
 */
public final class FlowField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.omnichannel.api.entities.v1alpha1.FlowField)
    FlowFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlowField.newBuilder() to construct.
  private FlowField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlowField() {
    name_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlowField();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowsProto.internal_static_services_omnichannel_api_entities_v1alpha1_FlowField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowsProto.internal_static_services_omnichannel_api_entities_v1alpha1_FlowField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField.class, com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField.Builder.class);
  }

  private int valueCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    USER_INPUT(100),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 100: return USER_INPUT;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private int name_ = 0;
  /**
   * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
   * @return The enum numeric value on the wire for name.
   */
  @java.lang.Override public int getNameValue() {
    return name_;
  }
  /**
   * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override public com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName getName() {
    com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName result = com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName.forNumber(name_);
    return result == null ? com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName.UNRECOGNIZED : result;
  }

  public static final int USER_INPUT_FIELD_NUMBER = 100;
  /**
   * <code>string user_input = 100 [json_name = "userInput"];</code>
   * @return Whether the userInput field is set.
   */
  public boolean hasUserInput() {
    return valueCase_ == 100;
  }
  /**
   * <code>string user_input = 100 [json_name = "userInput"];</code>
   * @return The userInput.
   */
  public java.lang.String getUserInput() {
    java.lang.Object ref = "";
    if (valueCase_ == 100) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 100) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string user_input = 100 [json_name = "userInput"];</code>
   * @return The bytes for userInput.
   */
  public com.google.protobuf.ByteString
      getUserInputBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 100) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 100) {
        value_ = b;
      }
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
    if (name_ != com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName.FIELD_NAME_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, name_);
    }
    if (valueCase_ == 100) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 100, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (name_ != com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName.FIELD_NAME_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, name_);
    }
    if (valueCase_ == 100) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(100, value_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField other = (com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField) obj;

    if (name_ != other.name_) return false;
    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 100:
        if (!getUserInput()
            .equals(other.getUserInput())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + name_;
    switch (valueCase_) {
      case 100:
        hash = (37 * hash) + USER_INPUT_FIELD_NUMBER;
        hash = (53 * hash) + getUserInput().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField prototype) {
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
   * Protobuf type {@code services.omnichannel.api.entities.v1alpha1.FlowField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.omnichannel.api.entities.v1alpha1.FlowField)
      com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowsProto.internal_static_services_omnichannel_api_entities_v1alpha1_FlowField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowsProto.internal_static_services_omnichannel_api_entities_v1alpha1_FlowField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField.class, com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField.newBuilder()
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
      name_ = 0;
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowsProto.internal_static_services_omnichannel_api_entities_v1alpha1_FlowField_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField build() {
      com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField buildPartial() {
      com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField result = new com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
    }

    private void buildPartialOneofs(com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField result) {
      result.valueCase_ = valueCase_;
      result.value_ = this.value_;
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
      if (other instanceof com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField) {
        return mergeFrom((com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField other) {
      if (other == com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField.getDefaultInstance()) return this;
      if (other.name_ != 0) {
        setNameValue(other.getNameValue());
      }
      switch (other.getValueCase()) {
        case USER_INPUT: {
          valueCase_ = 100;
          value_ = other.value_;
          onChanged();
          break;
        }
        case VALUE_NOT_SET: {
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
            case 8: {
              name_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 802: {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 100;
              value_ = s;
              break;
            } // case 802
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
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private int name_ = 0;
    /**
     * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
     * @return The enum numeric value on the wire for name.
     */
    @java.lang.Override public int getNameValue() {
      return name_;
    }
    /**
     * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
     * @param value The enum numeric value on the wire for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameValue(int value) {
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    @java.lang.Override
    public com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName getName() {
      com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName result = com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName.forNumber(name_);
      return result == null ? com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName.UNRECOGNIZED : result;
    }
    /**
     * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowFieldName value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      name_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.services.omnichannel.api.entities.v1alpha1.FlowFieldName name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = 0;
      onChanged();
      return this;
    }

    /**
     * <code>string user_input = 100 [json_name = "userInput"];</code>
     * @return Whether the userInput field is set.
     */
    @java.lang.Override
    public boolean hasUserInput() {
      return valueCase_ == 100;
    }
    /**
     * <code>string user_input = 100 [json_name = "userInput"];</code>
     * @return The userInput.
     */
    @java.lang.Override
    public java.lang.String getUserInput() {
      java.lang.Object ref = "";
      if (valueCase_ == 100) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 100) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_input = 100 [json_name = "userInput"];</code>
     * @return The bytes for userInput.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUserInputBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 100) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 100) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_input = 100 [json_name = "userInput"];</code>
     * @param value The userInput to set.
     * @return This builder for chaining.
     */
    public Builder setUserInput(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valueCase_ = 100;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_input = 100 [json_name = "userInput"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserInput() {
      if (valueCase_ == 100) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string user_input = 100 [json_name = "userInput"];</code>
     * @param value The bytes for userInput to set.
     * @return This builder for chaining.
     */
    public Builder setUserInputBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valueCase_ = 100;
      value_ = value;
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


    // @@protoc_insertion_point(builder_scope:services.omnichannel.api.entities.v1alpha1.FlowField)
  }

  // @@protoc_insertion_point(class_scope:services.omnichannel.api.entities.v1alpha1.FlowField)
  private static final com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField();
  }

  public static com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlowField>
      PARSER = new com.google.protobuf.AbstractParser<FlowField>() {
    @java.lang.Override
    public FlowField parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlowField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlowField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.omnichannel.api.entities.v1alpha1.FlowField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
