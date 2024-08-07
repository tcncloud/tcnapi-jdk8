// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/hunt_groups/v1alpha1/entities.proto

package com.tcn.cloud.api.services.org.hunt_groups.v1alpha1;

/**
 * <pre>
 * ExileLinkParameter describes the data or data source.
 * </pre>
 *
 * Protobuf type {@code services.org.hunt_groups.v1alpha1.ExileLinkParameter}
 */
public final class ExileLinkParameter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.org.hunt_groups.v1alpha1.ExileLinkParameter)
    ExileLinkParameterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExileLinkParameter.newBuilder() to construct.
  private ExileLinkParameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExileLinkParameter() {
    helperValue_ = "";
    parameterSourceType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExileLinkParameter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_ExileLinkParameter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_ExileLinkParameter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter.class, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter.Builder.class);
  }

  public static final int CONTACT_FIELD_SID_FIELD_NUMBER = 1;
  private long contactFieldSid_ = 0L;
  /**
   * <pre>
   * The ID for the contact field.
   * </pre>
   *
   * <code>int64 contact_field_sid = 1 [json_name = "contactFieldSid"];</code>
   * @return The contactFieldSid.
   */
  @java.lang.Override
  public long getContactFieldSid() {
    return contactFieldSid_;
  }

  public static final int HELPER_VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object helperValue_ = "";
  /**
   * <pre>
   * The helper value of the parameter.
   * </pre>
   *
   * <code>string helper_value = 2 [json_name = "helperValue"];</code>
   * @return The helperValue.
   */
  @java.lang.Override
  public java.lang.String getHelperValue() {
    java.lang.Object ref = helperValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      helperValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The helper value of the parameter.
   * </pre>
   *
   * <code>string helper_value = 2 [json_name = "helperValue"];</code>
   * @return The bytes for helperValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHelperValueBytes() {
    java.lang.Object ref = helperValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      helperValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMETER_SOURCE_TYPE_FIELD_NUMBER = 3;
  private int parameterSourceType_ = 0;
  /**
   * <pre>
   * The source type of the parameter.
   * </pre>
   *
   * <code>.api.commons.org.ParameterSourceType parameter_source_type = 3 [json_name = "parameterSourceType"];</code>
   * @return The enum numeric value on the wire for parameterSourceType.
   */
  @java.lang.Override public int getParameterSourceTypeValue() {
    return parameterSourceType_;
  }
  /**
   * <pre>
   * The source type of the parameter.
   * </pre>
   *
   * <code>.api.commons.org.ParameterSourceType parameter_source_type = 3 [json_name = "parameterSourceType"];</code>
   * @return The parameterSourceType.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.org.ParameterSourceType getParameterSourceType() {
    com.tcn.cloud.api.api.commons.org.ParameterSourceType result = com.tcn.cloud.api.api.commons.org.ParameterSourceType.forNumber(parameterSourceType_);
    return result == null ? com.tcn.cloud.api.api.commons.org.ParameterSourceType.UNRECOGNIZED : result;
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
    if (contactFieldSid_ != 0L) {
      output.writeInt64(1, contactFieldSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(helperValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, helperValue_);
    }
    if (parameterSourceType_ != com.tcn.cloud.api.api.commons.org.ParameterSourceType.PARAMETER_SOURCE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, parameterSourceType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contactFieldSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, contactFieldSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(helperValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, helperValue_);
    }
    if (parameterSourceType_ != com.tcn.cloud.api.api.commons.org.ParameterSourceType.PARAMETER_SOURCE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, parameterSourceType_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter other = (com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter) obj;

    if (getContactFieldSid()
        != other.getContactFieldSid()) return false;
    if (!getHelperValue()
        .equals(other.getHelperValue())) return false;
    if (parameterSourceType_ != other.parameterSourceType_) return false;
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
    hash = (37 * hash) + CONTACT_FIELD_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getContactFieldSid());
    hash = (37 * hash) + HELPER_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getHelperValue().hashCode();
    hash = (37 * hash) + PARAMETER_SOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + parameterSourceType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter prototype) {
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
   * ExileLinkParameter describes the data or data source.
   * </pre>
   *
   * Protobuf type {@code services.org.hunt_groups.v1alpha1.ExileLinkParameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.org.hunt_groups.v1alpha1.ExileLinkParameter)
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_ExileLinkParameter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_ExileLinkParameter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter.class, com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter.newBuilder()
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
      contactFieldSid_ = 0L;
      helperValue_ = "";
      parameterSourceType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.internal_static_services_org_hunt_groups_v1alpha1_ExileLinkParameter_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter build() {
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter buildPartial() {
      com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter result = new com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contactFieldSid_ = contactFieldSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.helperValue_ = helperValue_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.parameterSourceType_ = parameterSourceType_;
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
      if (other instanceof com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter) {
        return mergeFrom((com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter other) {
      if (other == com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter.getDefaultInstance()) return this;
      if (other.getContactFieldSid() != 0L) {
        setContactFieldSid(other.getContactFieldSid());
      }
      if (!other.getHelperValue().isEmpty()) {
        helperValue_ = other.helperValue_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.parameterSourceType_ != 0) {
        setParameterSourceTypeValue(other.getParameterSourceTypeValue());
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
              contactFieldSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              helperValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              parameterSourceType_ = input.readEnum();
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

    private long contactFieldSid_ ;
    /**
     * <pre>
     * The ID for the contact field.
     * </pre>
     *
     * <code>int64 contact_field_sid = 1 [json_name = "contactFieldSid"];</code>
     * @return The contactFieldSid.
     */
    @java.lang.Override
    public long getContactFieldSid() {
      return contactFieldSid_;
    }
    /**
     * <pre>
     * The ID for the contact field.
     * </pre>
     *
     * <code>int64 contact_field_sid = 1 [json_name = "contactFieldSid"];</code>
     * @param value The contactFieldSid to set.
     * @return This builder for chaining.
     */
    public Builder setContactFieldSid(long value) {

      contactFieldSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID for the contact field.
     * </pre>
     *
     * <code>int64 contact_field_sid = 1 [json_name = "contactFieldSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactFieldSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      contactFieldSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object helperValue_ = "";
    /**
     * <pre>
     * The helper value of the parameter.
     * </pre>
     *
     * <code>string helper_value = 2 [json_name = "helperValue"];</code>
     * @return The helperValue.
     */
    public java.lang.String getHelperValue() {
      java.lang.Object ref = helperValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        helperValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The helper value of the parameter.
     * </pre>
     *
     * <code>string helper_value = 2 [json_name = "helperValue"];</code>
     * @return The bytes for helperValue.
     */
    public com.google.protobuf.ByteString
        getHelperValueBytes() {
      java.lang.Object ref = helperValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        helperValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The helper value of the parameter.
     * </pre>
     *
     * <code>string helper_value = 2 [json_name = "helperValue"];</code>
     * @param value The helperValue to set.
     * @return This builder for chaining.
     */
    public Builder setHelperValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      helperValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The helper value of the parameter.
     * </pre>
     *
     * <code>string helper_value = 2 [json_name = "helperValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHelperValue() {
      helperValue_ = getDefaultInstance().getHelperValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The helper value of the parameter.
     * </pre>
     *
     * <code>string helper_value = 2 [json_name = "helperValue"];</code>
     * @param value The bytes for helperValue to set.
     * @return This builder for chaining.
     */
    public Builder setHelperValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      helperValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int parameterSourceType_ = 0;
    /**
     * <pre>
     * The source type of the parameter.
     * </pre>
     *
     * <code>.api.commons.org.ParameterSourceType parameter_source_type = 3 [json_name = "parameterSourceType"];</code>
     * @return The enum numeric value on the wire for parameterSourceType.
     */
    @java.lang.Override public int getParameterSourceTypeValue() {
      return parameterSourceType_;
    }
    /**
     * <pre>
     * The source type of the parameter.
     * </pre>
     *
     * <code>.api.commons.org.ParameterSourceType parameter_source_type = 3 [json_name = "parameterSourceType"];</code>
     * @param value The enum numeric value on the wire for parameterSourceType to set.
     * @return This builder for chaining.
     */
    public Builder setParameterSourceTypeValue(int value) {
      parameterSourceType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source type of the parameter.
     * </pre>
     *
     * <code>.api.commons.org.ParameterSourceType parameter_source_type = 3 [json_name = "parameterSourceType"];</code>
     * @return The parameterSourceType.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.org.ParameterSourceType getParameterSourceType() {
      com.tcn.cloud.api.api.commons.org.ParameterSourceType result = com.tcn.cloud.api.api.commons.org.ParameterSourceType.forNumber(parameterSourceType_);
      return result == null ? com.tcn.cloud.api.api.commons.org.ParameterSourceType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The source type of the parameter.
     * </pre>
     *
     * <code>.api.commons.org.ParameterSourceType parameter_source_type = 3 [json_name = "parameterSourceType"];</code>
     * @param value The parameterSourceType to set.
     * @return This builder for chaining.
     */
    public Builder setParameterSourceType(com.tcn.cloud.api.api.commons.org.ParameterSourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      parameterSourceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The source type of the parameter.
     * </pre>
     *
     * <code>.api.commons.org.ParameterSourceType parameter_source_type = 3 [json_name = "parameterSourceType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParameterSourceType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      parameterSourceType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:services.org.hunt_groups.v1alpha1.ExileLinkParameter)
  }

  // @@protoc_insertion_point(class_scope:services.org.hunt_groups.v1alpha1.ExileLinkParameter)
  private static final com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter();
  }

  public static com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExileLinkParameter>
      PARSER = new com.google.protobuf.AbstractParser<ExileLinkParameter>() {
    @java.lang.Override
    public ExileLinkParameter parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExileLinkParameter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExileLinkParameter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.ExileLinkParameter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

