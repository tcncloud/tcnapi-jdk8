// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListAllScenariosRes}
 */
public final class ListAllScenariosRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListAllScenariosRes)
    ListAllScenariosResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAllScenariosRes.newBuilder() to construct.
  private ListAllScenariosRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAllScenariosRes() {
    scenarios_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAllScenariosRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAllScenariosRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAllScenariosRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.class, com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.Builder.class);
  }

  public static final int SCENARIOS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.Scenario> scenarios_;
  /**
   * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.Scenario> getScenariosList() {
    return scenarios_;
  }
  /**
   * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder> 
      getScenariosOrBuilderList() {
    return scenarios_;
  }
  /**
   * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
   */
  @java.lang.Override
  public int getScenariosCount() {
    return scenarios_.size();
  }
  /**
   * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Scenario getScenarios(int index) {
    return scenarios_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder getScenariosOrBuilder(
      int index) {
    return scenarios_.get(index);
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
    for (int i = 0; i < scenarios_.size(); i++) {
      output.writeMessage(1, scenarios_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < scenarios_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, scenarios_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes other = (com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes) obj;

    if (!getScenariosList()
        .equals(other.getScenariosList())) return false;
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
    if (getScenariosCount() > 0) {
      hash = (37 * hash) + SCENARIOS_FIELD_NUMBER;
      hash = (53 * hash) + getScenariosList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ListAllScenariosRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListAllScenariosRes)
      com.tcn.cloud.api.api.v0alpha.ListAllScenariosResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAllScenariosRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAllScenariosRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.class, com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.newBuilder()
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
      if (scenariosBuilder_ == null) {
        scenarios_ = java.util.Collections.emptyList();
      } else {
        scenarios_ = null;
        scenariosBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAllScenariosRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes build() {
      com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes result = new com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes result) {
      if (scenariosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          scenarios_ = java.util.Collections.unmodifiableList(scenarios_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.scenarios_ = scenarios_;
      } else {
        result.scenarios_ = scenariosBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes.getDefaultInstance()) return this;
      if (scenariosBuilder_ == null) {
        if (!other.scenarios_.isEmpty()) {
          if (scenarios_.isEmpty()) {
            scenarios_ = other.scenarios_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureScenariosIsMutable();
            scenarios_.addAll(other.scenarios_);
          }
          onChanged();
        }
      } else {
        if (!other.scenarios_.isEmpty()) {
          if (scenariosBuilder_.isEmpty()) {
            scenariosBuilder_.dispose();
            scenariosBuilder_ = null;
            scenarios_ = other.scenarios_;
            bitField0_ = (bitField0_ & ~0x00000001);
            scenariosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getScenariosFieldBuilder() : null;
          } else {
            scenariosBuilder_.addAllMessages(other.scenarios_);
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
              com.tcn.cloud.api.api.v0alpha.Scenario m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.Scenario.parser(),
                      extensionRegistry);
              if (scenariosBuilder_ == null) {
                ensureScenariosIsMutable();
                scenarios_.add(m);
              } else {
                scenariosBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.Scenario> scenarios_ =
      java.util.Collections.emptyList();
    private void ensureScenariosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scenarios_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.Scenario>(scenarios_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Scenario, com.tcn.cloud.api.api.v0alpha.Scenario.Builder, com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder> scenariosBuilder_;

    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Scenario> getScenariosList() {
      if (scenariosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(scenarios_);
      } else {
        return scenariosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public int getScenariosCount() {
      if (scenariosBuilder_ == null) {
        return scenarios_.size();
      } else {
        return scenariosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Scenario getScenarios(int index) {
      if (scenariosBuilder_ == null) {
        return scenarios_.get(index);
      } else {
        return scenariosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder setScenarios(
        int index, com.tcn.cloud.api.api.v0alpha.Scenario value) {
      if (scenariosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScenariosIsMutable();
        scenarios_.set(index, value);
        onChanged();
      } else {
        scenariosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder setScenarios(
        int index, com.tcn.cloud.api.api.v0alpha.Scenario.Builder builderForValue) {
      if (scenariosBuilder_ == null) {
        ensureScenariosIsMutable();
        scenarios_.set(index, builderForValue.build());
        onChanged();
      } else {
        scenariosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder addScenarios(com.tcn.cloud.api.api.v0alpha.Scenario value) {
      if (scenariosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScenariosIsMutable();
        scenarios_.add(value);
        onChanged();
      } else {
        scenariosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder addScenarios(
        int index, com.tcn.cloud.api.api.v0alpha.Scenario value) {
      if (scenariosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScenariosIsMutable();
        scenarios_.add(index, value);
        onChanged();
      } else {
        scenariosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder addScenarios(
        com.tcn.cloud.api.api.v0alpha.Scenario.Builder builderForValue) {
      if (scenariosBuilder_ == null) {
        ensureScenariosIsMutable();
        scenarios_.add(builderForValue.build());
        onChanged();
      } else {
        scenariosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder addScenarios(
        int index, com.tcn.cloud.api.api.v0alpha.Scenario.Builder builderForValue) {
      if (scenariosBuilder_ == null) {
        ensureScenariosIsMutable();
        scenarios_.add(index, builderForValue.build());
        onChanged();
      } else {
        scenariosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder addAllScenarios(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.Scenario> values) {
      if (scenariosBuilder_ == null) {
        ensureScenariosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, scenarios_);
        onChanged();
      } else {
        scenariosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder clearScenarios() {
      if (scenariosBuilder_ == null) {
        scenarios_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        scenariosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public Builder removeScenarios(int index) {
      if (scenariosBuilder_ == null) {
        ensureScenariosIsMutable();
        scenarios_.remove(index);
        onChanged();
      } else {
        scenariosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Scenario.Builder getScenariosBuilder(
        int index) {
      return getScenariosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder getScenariosOrBuilder(
        int index) {
      if (scenariosBuilder_ == null) {
        return scenarios_.get(index);  } else {
        return scenariosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder> 
         getScenariosOrBuilderList() {
      if (scenariosBuilder_ != null) {
        return scenariosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(scenarios_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Scenario.Builder addScenariosBuilder() {
      return getScenariosFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.Scenario.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Scenario.Builder addScenariosBuilder(
        int index) {
      return getScenariosFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.Scenario.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Scenario scenarios = 1 [json_name = "scenarios"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Scenario.Builder> 
         getScenariosBuilderList() {
      return getScenariosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Scenario, com.tcn.cloud.api.api.v0alpha.Scenario.Builder, com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder> 
        getScenariosFieldBuilder() {
      if (scenariosBuilder_ == null) {
        scenariosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Scenario, com.tcn.cloud.api.api.v0alpha.Scenario.Builder, com.tcn.cloud.api.api.v0alpha.ScenarioOrBuilder>(
                scenarios_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        scenarios_ = null;
      }
      return scenariosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListAllScenariosRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListAllScenariosRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAllScenariosRes>
      PARSER = new com.google.protobuf.AbstractParser<ListAllScenariosRes>() {
    @java.lang.Override
    public ListAllScenariosRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAllScenariosRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAllScenariosRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListAllScenariosRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

