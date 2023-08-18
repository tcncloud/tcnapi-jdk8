// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.CreateScenarioRes}
 */
public final class CreateScenarioRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateScenarioRes)
    CreateScenarioResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateScenarioRes.newBuilder() to construct.
  private CreateScenarioRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateScenarioRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateScenarioRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateScenarioRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateScenarioRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.class, com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.Builder.class);
  }

  private int bitField0_;
  public static final int SCENARIO_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.Scenario scenario_;
  /**
   * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
   * @return Whether the scenario field is set.
   */
  @java.lang.Override
  public boolean hasScenario() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
   * @return The scenario.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Scenario getScenario() {
    return scenario_ == null ? com.tcn.cloud.api.api.v0alpha.Scenario.getDefaultInstance() : scenario_;
  }
  /**
   * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder getScenarioOrBuilder() {
    return scenario_ == null ? com.tcn.cloud.api.api.v0alpha.Scenario.getDefaultInstance() : scenario_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getScenario());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getScenario());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateScenarioRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateScenarioRes other = (com.tcn.cloud.api.api.v0alpha.CreateScenarioRes) obj;

    if (hasScenario() != other.hasScenario()) return false;
    if (hasScenario()) {
      if (!getScenario()
          .equals(other.getScenario())) return false;
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
    if (hasScenario()) {
      hash = (37 * hash) + SCENARIO_FIELD_NUMBER;
      hash = (53 * hash) + getScenario().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateScenarioRes prototype) {
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
   * Protobuf type {@code api.v0alpha.CreateScenarioRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateScenarioRes)
      com.tcn.cloud.api.api.v0alpha.CreateScenarioResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateScenarioRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateScenarioRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.class, com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getScenarioFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scenario_ = null;
      if (scenarioBuilder_ != null) {
        scenarioBuilder_.dispose();
        scenarioBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_CreateScenarioRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateScenarioRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateScenarioRes build() {
      com.tcn.cloud.api.api.v0alpha.CreateScenarioRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateScenarioRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateScenarioRes result = new com.tcn.cloud.api.api.v0alpha.CreateScenarioRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateScenarioRes result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scenario_ = scenarioBuilder_ == null
            ? scenario_
            : scenarioBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateScenarioRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateScenarioRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateScenarioRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateScenarioRes.getDefaultInstance()) return this;
      if (other.hasScenario()) {
        mergeScenario(other.getScenario());
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
              input.readMessage(
                  getScenarioFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.v0alpha.Scenario scenario_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Scenario, com.tcn.cloud.api.api.v0alpha.Scenario.Builder, com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder> scenarioBuilder_;
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     * @return Whether the scenario field is set.
     */
    public boolean hasScenario() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     * @return The scenario.
     */
    public com.tcn.cloud.api.api.v0alpha.Scenario getScenario() {
      if (scenarioBuilder_ == null) {
        return scenario_ == null ? com.tcn.cloud.api.api.v0alpha.Scenario.getDefaultInstance() : scenario_;
      } else {
        return scenarioBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     */
    public Builder setScenario(com.tcn.cloud.api.api.v0alpha.Scenario value) {
      if (scenarioBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        scenario_ = value;
      } else {
        scenarioBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     */
    public Builder setScenario(
        com.tcn.cloud.api.api.v0alpha.Scenario.Builder builderForValue) {
      if (scenarioBuilder_ == null) {
        scenario_ = builderForValue.build();
      } else {
        scenarioBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     */
    public Builder mergeScenario(com.tcn.cloud.api.api.v0alpha.Scenario value) {
      if (scenarioBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          scenario_ != null &&
          scenario_ != com.tcn.cloud.api.api.v0alpha.Scenario.getDefaultInstance()) {
          getScenarioBuilder().mergeFrom(value);
        } else {
          scenario_ = value;
        }
      } else {
        scenarioBuilder_.mergeFrom(value);
      }
      if (scenario_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     */
    public Builder clearScenario() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scenario_ = null;
      if (scenarioBuilder_ != null) {
        scenarioBuilder_.dispose();
        scenarioBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Scenario.Builder getScenarioBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getScenarioFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder getScenarioOrBuilder() {
      if (scenarioBuilder_ != null) {
        return scenarioBuilder_.getMessageOrBuilder();
      } else {
        return scenario_ == null ?
            com.tcn.cloud.api.api.v0alpha.Scenario.getDefaultInstance() : scenario_;
      }
    }
    /**
     * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Scenario, com.tcn.cloud.api.api.v0alpha.Scenario.Builder, com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder> 
        getScenarioFieldBuilder() {
      if (scenarioBuilder_ == null) {
        scenarioBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Scenario, com.tcn.cloud.api.api.v0alpha.Scenario.Builder, com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder>(
                getScenario(),
                getParentForChildren(),
                isClean());
        scenario_ = null;
      }
      return scenarioBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateScenarioRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateScenarioRes)
  private static final com.tcn.cloud.api.api.v0alpha.CreateScenarioRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateScenarioRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateScenarioRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateScenarioRes>
      PARSER = new com.google.protobuf.AbstractParser<CreateScenarioRes>() {
    @java.lang.Override
    public CreateScenarioRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateScenarioRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateScenarioRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateScenarioRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

