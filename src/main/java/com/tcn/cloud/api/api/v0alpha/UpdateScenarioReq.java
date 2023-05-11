// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.UpdateScenarioReq}
 */
public final class UpdateScenarioReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.UpdateScenarioReq)
    UpdateScenarioReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateScenarioReq.newBuilder() to construct.
  private UpdateScenarioReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateScenarioReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateScenarioReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateScenarioReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateScenarioReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.class, com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.Builder.class);
  }

  public static final int SCENARIO_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.Scenario scenario_;
  /**
   * <code>.api.v0alpha.Scenario scenario = 1 [json_name = "scenario"];</code>
   * @return Whether the scenario field is set.
   */
  @java.lang.Override
  public boolean hasScenario() {
    return scenario_ != null;
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
    if (scenario_ != null) {
      output.writeMessage(1, getScenario());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scenario_ != null) {
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq other = (com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq) obj;

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

  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq prototype) {
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
   * Protobuf type {@code api.v0alpha.UpdateScenarioReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.UpdateScenarioReq)
      com.tcn.cloud.api.api.v0alpha.UpdateScenarioReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateScenarioReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateScenarioReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.class, com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.newBuilder()
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
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_UpdateScenarioReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq build() {
      com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq result = new com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scenario_ = scenarioBuilder_ == null
            ? scenario_
            : scenarioBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq.getDefaultInstance()) return this;
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
      bitField0_ |= 0x00000001;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.UpdateScenarioReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.UpdateScenarioReq)
  private static final com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateScenarioReq>
      PARSER = new com.google.protobuf.AbstractParser<UpdateScenarioReq>() {
    @java.lang.Override
    public UpdateScenarioReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateScenarioReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateScenarioReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.UpdateScenarioReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

