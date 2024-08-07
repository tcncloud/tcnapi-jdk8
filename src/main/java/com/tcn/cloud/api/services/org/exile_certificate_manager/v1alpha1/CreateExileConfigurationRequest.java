// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1alpha1/exile_configuration.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1;

/**
 * <pre>
 * CreateExileConfigurationRequest is the request to create a exile configuration
 * </pre>
 *
 * Protobuf type {@code services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest}
 */
public final class CreateExileConfigurationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest)
    CreateExileConfigurationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateExileConfigurationRequest.newBuilder() to construct.
  private CreateExileConfigurationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateExileConfigurationRequest() {
    name_ = "";
    description_ = "";
    type_ = 0;
    parameters_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateExileConfigurationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationProto.internal_static_services_org_exile_certificate_manager_v1alpha1_CreateExileConfigurationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationProto.internal_static_services_org_exile_certificate_manager_v1alpha1_CreateExileConfigurationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.class, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The configuration name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The configuration name.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * The configuration description.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The configuration description.
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_ = 0;
  /**
   * <pre>
   * The type of exile configuration
   * </pre>
   *
   * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 3 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The type of exile configuration
   * </pre>
   *
   * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType getType() {
    com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType result = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType.forNumber(type_);
    return result == null ? com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType.UNRECOGNIZED : result;
  }

  public static final int PARAMETERS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parameters_ = "";
  /**
   * <pre>
   * The parameters of the exile configuration
   * See services.org.exile_certificate_manager.v1alpha1.ExileConfiguration
   * for the required information.
   * </pre>
   *
   * <code>string parameters = 4 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  @java.lang.Override
  public java.lang.String getParameters() {
    java.lang.Object ref = parameters_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parameters_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The parameters of the exile configuration
   * See services.org.exile_certificate_manager.v1alpha1.ExileConfiguration
   * for the required information.
   * </pre>
   *
   * <code>string parameters = 4 [json_name = "parameters"];</code>
   * @return The bytes for parameters.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParametersBytes() {
    java.lang.Object ref = parameters_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parameters_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (type_ != com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType.EXILE_CONFIGURATION_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parameters_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parameters_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (type_ != com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType.EXILE_CONFIGURATION_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parameters_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parameters_);
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
    if (!(obj instanceof com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest other = (com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (type_ != other.type_) return false;
    if (!getParameters()
        .equals(other.getParameters())) return false;
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
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
    hash = (53 * hash) + getParameters().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest prototype) {
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
   * CreateExileConfigurationRequest is the request to create a exile configuration
   * </pre>
   *
   * Protobuf type {@code services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest)
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationProto.internal_static_services_org_exile_certificate_manager_v1alpha1_CreateExileConfigurationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationProto.internal_static_services_org_exile_certificate_manager_v1alpha1_CreateExileConfigurationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.class, com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.newBuilder()
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
      name_ = "";
      description_ = "";
      type_ = 0;
      parameters_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationProto.internal_static_services_org_exile_certificate_manager_v1alpha1_CreateExileConfigurationRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest build() {
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest buildPartial() {
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest result = new com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.parameters_ = parameters_;
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
      if (other instanceof com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest) {
        return mergeFrom((com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest other) {
      if (other == com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getParameters().isEmpty()) {
        parameters_ = other.parameters_;
        bitField0_ |= 0x00000008;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              parameters_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The configuration name.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The configuration name.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The configuration name.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The configuration name.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The configuration name.
     * </pre>
     *
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * The configuration description.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The configuration description.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The configuration description.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The configuration description.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The configuration description.
     * </pre>
     *
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * The type of exile configuration
     * </pre>
     *
     * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 3 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The type of exile configuration
     * </pre>
     *
     * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 3 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of exile configuration
     * </pre>
     *
     * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 3 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType getType() {
      com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType result = com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType.forNumber(type_);
      return result == null ? com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of exile configuration
     * </pre>
     *
     * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 3 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of exile configuration
     * </pre>
     *
     * <code>.services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType type = 3 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object parameters_ = "";
    /**
     * <pre>
     * The parameters of the exile configuration
     * See services.org.exile_certificate_manager.v1alpha1.ExileConfiguration
     * for the required information.
     * </pre>
     *
     * <code>string parameters = 4 [json_name = "parameters"];</code>
     * @return The parameters.
     */
    public java.lang.String getParameters() {
      java.lang.Object ref = parameters_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parameters_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The parameters of the exile configuration
     * See services.org.exile_certificate_manager.v1alpha1.ExileConfiguration
     * for the required information.
     * </pre>
     *
     * <code>string parameters = 4 [json_name = "parameters"];</code>
     * @return The bytes for parameters.
     */
    public com.google.protobuf.ByteString
        getParametersBytes() {
      java.lang.Object ref = parameters_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parameters_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The parameters of the exile configuration
     * See services.org.exile_certificate_manager.v1alpha1.ExileConfiguration
     * for the required information.
     * </pre>
     *
     * <code>string parameters = 4 [json_name = "parameters"];</code>
     * @param value The parameters to set.
     * @return This builder for chaining.
     */
    public Builder setParameters(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parameters_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parameters of the exile configuration
     * See services.org.exile_certificate_manager.v1alpha1.ExileConfiguration
     * for the required information.
     * </pre>
     *
     * <code>string parameters = 4 [json_name = "parameters"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParameters() {
      parameters_ = getDefaultInstance().getParameters();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The parameters of the exile configuration
     * See services.org.exile_certificate_manager.v1alpha1.ExileConfiguration
     * for the required information.
     * </pre>
     *
     * <code>string parameters = 4 [json_name = "parameters"];</code>
     * @param value The bytes for parameters to set.
     * @return This builder for chaining.
     */
    public Builder setParametersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parameters_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest)
  }

  // @@protoc_insertion_point(class_scope:services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest)
  private static final com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest();
  }

  public static com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateExileConfigurationRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateExileConfigurationRequest>() {
    @java.lang.Override
    public CreateExileConfigurationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateExileConfigurationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateExileConfigurationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.CreateExileConfigurationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

