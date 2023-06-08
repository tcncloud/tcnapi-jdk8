// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/compliance.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.PhoneTypeExp}
 */
public final class PhoneTypeExp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.PhoneTypeExp)
    PhoneTypeExpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhoneTypeExp.newBuilder() to construct.
  private PhoneTypeExp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhoneTypeExp() {
    phoneType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhoneTypeExp();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_PhoneTypeExp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_PhoneTypeExp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.PhoneTypeExp.class, com.tcn.cloud.api.api.commons.PhoneTypeExp.Builder.class);
  }

  public static final int PHONE_TYPE_FIELD_NUMBER = 1;
  private int phoneType_ = 0;
  /**
   * <code>.api.commons.PhoneType phone_type = 1 [json_name = "phoneType"];</code>
   * @return The enum numeric value on the wire for phoneType.
   */
  @java.lang.Override public int getPhoneTypeValue() {
    return phoneType_;
  }
  /**
   * <code>.api.commons.PhoneType phone_type = 1 [json_name = "phoneType"];</code>
   * @return The phoneType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.PhoneType getPhoneType() {
    com.tcn.cloud.api.api.commons.PhoneType result = com.tcn.cloud.api.api.commons.PhoneType.forNumber(phoneType_);
    return result == null ? com.tcn.cloud.api.api.commons.PhoneType.UNRECOGNIZED : result;
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
    if (phoneType_ != com.tcn.cloud.api.api.commons.PhoneType.CELL.getNumber()) {
      output.writeEnum(1, phoneType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (phoneType_ != com.tcn.cloud.api.api.commons.PhoneType.CELL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, phoneType_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.PhoneTypeExp)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.PhoneTypeExp other = (com.tcn.cloud.api.api.commons.PhoneTypeExp) obj;

    if (phoneType_ != other.phoneType_) return false;
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
    hash = (37 * hash) + PHONE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + phoneType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.PhoneTypeExp parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.PhoneTypeExp prototype) {
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
   * Protobuf type {@code api.commons.PhoneTypeExp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.PhoneTypeExp)
      com.tcn.cloud.api.api.commons.PhoneTypeExpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_PhoneTypeExp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_PhoneTypeExp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.PhoneTypeExp.class, com.tcn.cloud.api.api.commons.PhoneTypeExp.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.PhoneTypeExp.newBuilder()
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
      phoneType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.ComplianceProto.internal_static_api_commons_PhoneTypeExp_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.PhoneTypeExp getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.PhoneTypeExp.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.PhoneTypeExp build() {
      com.tcn.cloud.api.api.commons.PhoneTypeExp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.PhoneTypeExp buildPartial() {
      com.tcn.cloud.api.api.commons.PhoneTypeExp result = new com.tcn.cloud.api.api.commons.PhoneTypeExp(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.PhoneTypeExp result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.phoneType_ = phoneType_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.PhoneTypeExp) {
        return mergeFrom((com.tcn.cloud.api.api.commons.PhoneTypeExp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.PhoneTypeExp other) {
      if (other == com.tcn.cloud.api.api.commons.PhoneTypeExp.getDefaultInstance()) return this;
      if (other.phoneType_ != 0) {
        setPhoneTypeValue(other.getPhoneTypeValue());
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
              phoneType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int phoneType_ = 0;
    /**
     * <code>.api.commons.PhoneType phone_type = 1 [json_name = "phoneType"];</code>
     * @return The enum numeric value on the wire for phoneType.
     */
    @java.lang.Override public int getPhoneTypeValue() {
      return phoneType_;
    }
    /**
     * <code>.api.commons.PhoneType phone_type = 1 [json_name = "phoneType"];</code>
     * @param value The enum numeric value on the wire for phoneType to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneTypeValue(int value) {
      phoneType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.PhoneType phone_type = 1 [json_name = "phoneType"];</code>
     * @return The phoneType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.PhoneType getPhoneType() {
      com.tcn.cloud.api.api.commons.PhoneType result = com.tcn.cloud.api.api.commons.PhoneType.forNumber(phoneType_);
      return result == null ? com.tcn.cloud.api.api.commons.PhoneType.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.PhoneType phone_type = 1 [json_name = "phoneType"];</code>
     * @param value The phoneType to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneType(com.tcn.cloud.api.api.commons.PhoneType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      phoneType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.PhoneType phone_type = 1 [json_name = "phoneType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      phoneType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.PhoneTypeExp)
  }

  // @@protoc_insertion_point(class_scope:api.commons.PhoneTypeExp)
  private static final com.tcn.cloud.api.api.commons.PhoneTypeExp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.PhoneTypeExp();
  }

  public static com.tcn.cloud.api.api.commons.PhoneTypeExp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhoneTypeExp>
      PARSER = new com.google.protobuf.AbstractParser<PhoneTypeExp>() {
    @java.lang.Override
    public PhoneTypeExp parsePartialFrom(
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

  public static com.google.protobuf.Parser<PhoneTypeExp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhoneTypeExp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.PhoneTypeExp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

