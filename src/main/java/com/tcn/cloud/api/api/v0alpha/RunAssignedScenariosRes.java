// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.RunAssignedScenariosRes}
 */
public final class RunAssignedScenariosRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.RunAssignedScenariosRes)
    RunAssignedScenariosResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RunAssignedScenariosRes.newBuilder() to construct.
  private RunAssignedScenariosRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RunAssignedScenariosRes() {
    results_ = java.util.Collections.emptyList();
    cplRuleSetName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RunAssignedScenariosRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_RunAssignedScenariosRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_RunAssignedScenariosRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.class, com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.ScenarioResult> results_;
  /**
   * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.ScenarioResult> getResultsList() {
    return results_;
  }
  /**
   * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.ScenarioResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ScenarioResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ScenarioResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  public static final int PASSED_VALUE_FIELD_NUMBER = 4;
  private boolean passedValue_ = false;
  /**
   * <code>bool passed_value = 4 [json_name = "passedValue"];</code>
   * @return The passedValue.
   */
  @java.lang.Override
  public boolean getPassedValue() {
    return passedValue_;
  }

  public static final int CPL_RULE_SET_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cplRuleSetName_ = "";
  /**
   * <code>string cpl_rule_set_name = 3 [json_name = "cplRuleSetName"];</code>
   * @return The cplRuleSetName.
   */
  @java.lang.Override
  public java.lang.String getCplRuleSetName() {
    java.lang.Object ref = cplRuleSetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cplRuleSetName_ = s;
      return s;
    }
  }
  /**
   * <code>string cpl_rule_set_name = 3 [json_name = "cplRuleSetName"];</code>
   * @return The bytes for cplRuleSetName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCplRuleSetNameBytes() {
    java.lang.Object ref = cplRuleSetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cplRuleSetName_ = b;
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(2, results_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cplRuleSetName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cplRuleSetName_);
    }
    if (passedValue_ != false) {
      output.writeBool(4, passedValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, results_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cplRuleSetName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cplRuleSetName_);
    }
    if (passedValue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, passedValue_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes other = (com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
    if (getPassedValue()
        != other.getPassedValue()) return false;
    if (!getCplRuleSetName()
        .equals(other.getCplRuleSetName())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (37 * hash) + PASSED_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPassedValue());
    hash = (37 * hash) + CPL_RULE_SET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getCplRuleSetName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes prototype) {
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
   * Protobuf type {@code api.v0alpha.RunAssignedScenariosRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.RunAssignedScenariosRes)
      com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_RunAssignedScenariosRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_RunAssignedScenariosRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.class, com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.newBuilder()
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
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      passedValue_ = false;
      cplRuleSetName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_RunAssignedScenariosRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes build() {
      com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes result = new com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes result) {
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.passedValue_ = passedValue_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.cplRuleSetName_ = cplRuleSetName_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
      }
      if (other.getPassedValue() != false) {
        setPassedValue(other.getPassedValue());
      }
      if (!other.getCplRuleSetName().isEmpty()) {
        cplRuleSetName_ = other.cplRuleSetName_;
        bitField0_ |= 0x00000004;
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
            case 18: {
              com.tcn.cloud.api.api.commons.ScenarioResult m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.ScenarioResult.parser(),
                      extensionRegistry);
              if (resultsBuilder_ == null) {
                ensureResultsIsMutable();
                results_.add(m);
              } else {
                resultsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              cplRuleSetName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              passedValue_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
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

    private java.util.List<com.tcn.cloud.api.api.commons.ScenarioResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.ScenarioResult>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ScenarioResult, com.tcn.cloud.api.api.commons.ScenarioResult.Builder, com.tcn.cloud.api.api.commons.ScenarioResultOrBuilder> resultsBuilder_;

    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.ScenarioResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScenarioResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder setResults(
        int index, com.tcn.cloud.api.api.commons.ScenarioResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder setResults(
        int index, com.tcn.cloud.api.api.commons.ScenarioResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder addResults(com.tcn.cloud.api.api.commons.ScenarioResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder addResults(
        int index, com.tcn.cloud.api.api.commons.ScenarioResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder addResults(
        com.tcn.cloud.api.api.commons.ScenarioResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder addResults(
        int index, com.tcn.cloud.api.api.commons.ScenarioResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.ScenarioResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScenarioResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScenarioResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.ScenarioResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScenarioResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.ScenarioResult.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public com.tcn.cloud.api.api.commons.ScenarioResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.ScenarioResult.getDefaultInstance());
    }
    /**
     * <code>repeated .api.commons.ScenarioResult results = 2 [json_name = "results"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.ScenarioResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ScenarioResult, com.tcn.cloud.api.api.commons.ScenarioResult.Builder, com.tcn.cloud.api.api.commons.ScenarioResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.ScenarioResult, com.tcn.cloud.api.api.commons.ScenarioResult.Builder, com.tcn.cloud.api.api.commons.ScenarioResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private boolean passedValue_ ;
    /**
     * <code>bool passed_value = 4 [json_name = "passedValue"];</code>
     * @return The passedValue.
     */
    @java.lang.Override
    public boolean getPassedValue() {
      return passedValue_;
    }
    /**
     * <code>bool passed_value = 4 [json_name = "passedValue"];</code>
     * @param value The passedValue to set.
     * @return This builder for chaining.
     */
    public Builder setPassedValue(boolean value) {

      passedValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool passed_value = 4 [json_name = "passedValue"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPassedValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      passedValue_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object cplRuleSetName_ = "";
    /**
     * <code>string cpl_rule_set_name = 3 [json_name = "cplRuleSetName"];</code>
     * @return The cplRuleSetName.
     */
    public java.lang.String getCplRuleSetName() {
      java.lang.Object ref = cplRuleSetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cplRuleSetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cpl_rule_set_name = 3 [json_name = "cplRuleSetName"];</code>
     * @return The bytes for cplRuleSetName.
     */
    public com.google.protobuf.ByteString
        getCplRuleSetNameBytes() {
      java.lang.Object ref = cplRuleSetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cplRuleSetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cpl_rule_set_name = 3 [json_name = "cplRuleSetName"];</code>
     * @param value The cplRuleSetName to set.
     * @return This builder for chaining.
     */
    public Builder setCplRuleSetName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cplRuleSetName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string cpl_rule_set_name = 3 [json_name = "cplRuleSetName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCplRuleSetName() {
      cplRuleSetName_ = getDefaultInstance().getCplRuleSetName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string cpl_rule_set_name = 3 [json_name = "cplRuleSetName"];</code>
     * @param value The bytes for cplRuleSetName to set.
     * @return This builder for chaining.
     */
    public Builder setCplRuleSetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cplRuleSetName_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.RunAssignedScenariosRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.RunAssignedScenariosRes)
  private static final com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunAssignedScenariosRes>
      PARSER = new com.google.protobuf.AbstractParser<RunAssignedScenariosRes>() {
    @java.lang.Override
    public RunAssignedScenariosRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<RunAssignedScenariosRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunAssignedScenariosRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RunAssignedScenariosRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

