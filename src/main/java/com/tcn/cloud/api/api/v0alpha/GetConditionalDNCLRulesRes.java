// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetConditionalDNCLRulesRes}
 */
public final class GetConditionalDNCLRulesRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetConditionalDNCLRulesRes)
    GetConditionalDNCLRulesResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetConditionalDNCLRulesRes.newBuilder() to construct.
  private GetConditionalDNCLRulesRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetConditionalDNCLRulesRes() {
    dispositionRules_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetConditionalDNCLRulesRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetConditionalDNCLRulesRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetConditionalDNCLRulesRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.class, com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.Builder.class);
  }

  public static final int DISPOSITION_RULES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable> dispositionRules_;
  /**
   * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable> getDispositionRulesList() {
    return dispositionRules_;
  }
  /**
   * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTableOrBuilder> 
      getDispositionRulesOrBuilderList() {
    return dispositionRules_;
  }
  /**
   * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
   */
  @java.lang.Override
  public int getDispositionRulesCount() {
    return dispositionRules_.size();
  }
  /**
   * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable getDispositionRules(int index) {
    return dispositionRules_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTableOrBuilder getDispositionRulesOrBuilder(
      int index) {
    return dispositionRules_.get(index);
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
    for (int i = 0; i < dispositionRules_.size(); i++) {
      output.writeMessage(1, dispositionRules_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dispositionRules_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dispositionRules_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes other = (com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes) obj;

    if (!getDispositionRulesList()
        .equals(other.getDispositionRulesList())) return false;
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
    if (getDispositionRulesCount() > 0) {
      hash = (37 * hash) + DISPOSITION_RULES_FIELD_NUMBER;
      hash = (53 * hash) + getDispositionRulesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes prototype) {
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
   * Protobuf type {@code api.v0alpha.GetConditionalDNCLRulesRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetConditionalDNCLRulesRes)
      com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetConditionalDNCLRulesRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetConditionalDNCLRulesRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.class, com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.newBuilder()
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
      if (dispositionRulesBuilder_ == null) {
        dispositionRules_ = java.util.Collections.emptyList();
      } else {
        dispositionRules_ = null;
        dispositionRulesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetConditionalDNCLRulesRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes build() {
      com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes result = new com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes result) {
      if (dispositionRulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dispositionRules_ = java.util.Collections.unmodifiableList(dispositionRules_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dispositionRules_ = dispositionRules_;
      } else {
        result.dispositionRules_ = dispositionRulesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes.getDefaultInstance()) return this;
      if (dispositionRulesBuilder_ == null) {
        if (!other.dispositionRules_.isEmpty()) {
          if (dispositionRules_.isEmpty()) {
            dispositionRules_ = other.dispositionRules_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDispositionRulesIsMutable();
            dispositionRules_.addAll(other.dispositionRules_);
          }
          onChanged();
        }
      } else {
        if (!other.dispositionRules_.isEmpty()) {
          if (dispositionRulesBuilder_.isEmpty()) {
            dispositionRulesBuilder_.dispose();
            dispositionRulesBuilder_ = null;
            dispositionRules_ = other.dispositionRules_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dispositionRulesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDispositionRulesFieldBuilder() : null;
          } else {
            dispositionRulesBuilder_.addAllMessages(other.dispositionRules_);
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
              com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.parser(),
                      extensionRegistry);
              if (dispositionRulesBuilder_ == null) {
                ensureDispositionRulesIsMutable();
                dispositionRules_.add(m);
              } else {
                dispositionRulesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable> dispositionRules_ =
      java.util.Collections.emptyList();
    private void ensureDispositionRulesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dispositionRules_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable>(dispositionRules_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTableOrBuilder> dispositionRulesBuilder_;

    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable> getDispositionRulesList() {
      if (dispositionRulesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dispositionRules_);
      } else {
        return dispositionRulesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public int getDispositionRulesCount() {
      if (dispositionRulesBuilder_ == null) {
        return dispositionRules_.size();
      } else {
        return dispositionRulesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable getDispositionRules(int index) {
      if (dispositionRulesBuilder_ == null) {
        return dispositionRules_.get(index);
      } else {
        return dispositionRulesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder setDispositionRules(
        int index, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable value) {
      if (dispositionRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDispositionRulesIsMutable();
        dispositionRules_.set(index, value);
        onChanged();
      } else {
        dispositionRulesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder setDispositionRules(
        int index, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder builderForValue) {
      if (dispositionRulesBuilder_ == null) {
        ensureDispositionRulesIsMutable();
        dispositionRules_.set(index, builderForValue.build());
        onChanged();
      } else {
        dispositionRulesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder addDispositionRules(com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable value) {
      if (dispositionRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDispositionRulesIsMutable();
        dispositionRules_.add(value);
        onChanged();
      } else {
        dispositionRulesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder addDispositionRules(
        int index, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable value) {
      if (dispositionRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDispositionRulesIsMutable();
        dispositionRules_.add(index, value);
        onChanged();
      } else {
        dispositionRulesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder addDispositionRules(
        com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder builderForValue) {
      if (dispositionRulesBuilder_ == null) {
        ensureDispositionRulesIsMutable();
        dispositionRules_.add(builderForValue.build());
        onChanged();
      } else {
        dispositionRulesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder addDispositionRules(
        int index, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder builderForValue) {
      if (dispositionRulesBuilder_ == null) {
        ensureDispositionRulesIsMutable();
        dispositionRules_.add(index, builderForValue.build());
        onChanged();
      } else {
        dispositionRulesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder addAllDispositionRules(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable> values) {
      if (dispositionRulesBuilder_ == null) {
        ensureDispositionRulesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dispositionRules_);
        onChanged();
      } else {
        dispositionRulesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder clearDispositionRules() {
      if (dispositionRulesBuilder_ == null) {
        dispositionRules_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dispositionRulesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public Builder removeDispositionRules(int index) {
      if (dispositionRulesBuilder_ == null) {
        ensureDispositionRulesIsMutable();
        dispositionRules_.remove(index);
        onChanged();
      } else {
        dispositionRulesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder getDispositionRulesBuilder(
        int index) {
      return getDispositionRulesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTableOrBuilder getDispositionRulesOrBuilder(
        int index) {
      if (dispositionRulesBuilder_ == null) {
        return dispositionRules_.get(index);  } else {
        return dispositionRulesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTableOrBuilder> 
         getDispositionRulesOrBuilderList() {
      if (dispositionRulesBuilder_ != null) {
        return dispositionRulesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dispositionRules_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder addDispositionRulesBuilder() {
      return getDispositionRulesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder addDispositionRulesBuilder(
        int index) {
      return getDispositionRulesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable disposition_rules = 1 [json_name = "dispositionRules"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder> 
         getDispositionRulesBuilderList() {
      return getDispositionRulesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTableOrBuilder> 
        getDispositionRulesFieldBuilder() {
      if (dispositionRulesBuilder_ == null) {
        dispositionRulesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTable.Builder, com.tcn.cloud.api.api.v0alpha.AgentDispositionConditionalDncl.DispositionRulesTableOrBuilder>(
                dispositionRules_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dispositionRules_ = null;
      }
      return dispositionRulesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetConditionalDNCLRulesRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetConditionalDNCLRulesRes)
  private static final com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetConditionalDNCLRulesRes>
      PARSER = new com.google.protobuf.AbstractParser<GetConditionalDNCLRulesRes>() {
    @java.lang.Override
    public GetConditionalDNCLRulesRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetConditionalDNCLRulesRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetConditionalDNCLRulesRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetConditionalDNCLRulesRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

