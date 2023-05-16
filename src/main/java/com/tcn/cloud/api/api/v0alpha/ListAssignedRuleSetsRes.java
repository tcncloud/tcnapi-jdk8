// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/compliance.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ListAssignedRuleSetsRes}
 */
public final class ListAssignedRuleSetsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListAssignedRuleSetsRes)
    ListAssignedRuleSetsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAssignedRuleSetsRes.newBuilder() to construct.
  private ListAssignedRuleSetsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAssignedRuleSetsRes() {
    ruleSets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAssignedRuleSetsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAssignedRuleSetsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAssignedRuleSetsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.class, com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.Builder.class);
  }

  public static final int RULE_SETS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.RuleSet> ruleSets_;
  /**
   * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.RuleSet> getRuleSetsList() {
    return ruleSets_;
  }
  /**
   * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.RuleSetOrBuilder> 
      getRuleSetsOrBuilderList() {
    return ruleSets_;
  }
  /**
   * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
   */
  @java.lang.Override
  public int getRuleSetsCount() {
    return ruleSets_.size();
  }
  /**
   * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RuleSet getRuleSets(int index) {
    return ruleSets_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RuleSetOrBuilder getRuleSetsOrBuilder(
      int index) {
    return ruleSets_.get(index);
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
    for (int i = 0; i < ruleSets_.size(); i++) {
      output.writeMessage(1, ruleSets_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ruleSets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ruleSets_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes other = (com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes) obj;

    if (!getRuleSetsList()
        .equals(other.getRuleSetsList())) return false;
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
    if (getRuleSetsCount() > 0) {
      hash = (37 * hash) + RULE_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getRuleSetsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes prototype) {
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
   * Protobuf type {@code api.v0alpha.ListAssignedRuleSetsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListAssignedRuleSetsRes)
      com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAssignedRuleSetsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAssignedRuleSetsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.class, com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.newBuilder()
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
      if (ruleSetsBuilder_ == null) {
        ruleSets_ = java.util.Collections.emptyList();
      } else {
        ruleSets_ = null;
        ruleSetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.ComplianceProto.internal_static_api_v0alpha_ListAssignedRuleSetsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes build() {
      com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes result = new com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes result) {
      if (ruleSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ruleSets_ = java.util.Collections.unmodifiableList(ruleSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ruleSets_ = ruleSets_;
      } else {
        result.ruleSets_ = ruleSetsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes.getDefaultInstance()) return this;
      if (ruleSetsBuilder_ == null) {
        if (!other.ruleSets_.isEmpty()) {
          if (ruleSets_.isEmpty()) {
            ruleSets_ = other.ruleSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRuleSetsIsMutable();
            ruleSets_.addAll(other.ruleSets_);
          }
          onChanged();
        }
      } else {
        if (!other.ruleSets_.isEmpty()) {
          if (ruleSetsBuilder_.isEmpty()) {
            ruleSetsBuilder_.dispose();
            ruleSetsBuilder_ = null;
            ruleSets_ = other.ruleSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ruleSetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRuleSetsFieldBuilder() : null;
          } else {
            ruleSetsBuilder_.addAllMessages(other.ruleSets_);
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
              com.tcn.cloud.api.api.v0alpha.RuleSet m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.RuleSet.parser(),
                      extensionRegistry);
              if (ruleSetsBuilder_ == null) {
                ensureRuleSetsIsMutable();
                ruleSets_.add(m);
              } else {
                ruleSetsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.RuleSet> ruleSets_ =
      java.util.Collections.emptyList();
    private void ensureRuleSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ruleSets_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.RuleSet>(ruleSets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.RuleSet, com.tcn.cloud.api.api.v0alpha.RuleSet.Builder, com.tcn.cloud.api.api.v0alpha.RuleSetOrBuilder> ruleSetsBuilder_;

    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.RuleSet> getRuleSetsList() {
      if (ruleSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ruleSets_);
      } else {
        return ruleSetsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public int getRuleSetsCount() {
      if (ruleSetsBuilder_ == null) {
        return ruleSets_.size();
      } else {
        return ruleSetsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RuleSet getRuleSets(int index) {
      if (ruleSetsBuilder_ == null) {
        return ruleSets_.get(index);
      } else {
        return ruleSetsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder setRuleSets(
        int index, com.tcn.cloud.api.api.v0alpha.RuleSet value) {
      if (ruleSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleSetsIsMutable();
        ruleSets_.set(index, value);
        onChanged();
      } else {
        ruleSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder setRuleSets(
        int index, com.tcn.cloud.api.api.v0alpha.RuleSet.Builder builderForValue) {
      if (ruleSetsBuilder_ == null) {
        ensureRuleSetsIsMutable();
        ruleSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        ruleSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder addRuleSets(com.tcn.cloud.api.api.v0alpha.RuleSet value) {
      if (ruleSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleSetsIsMutable();
        ruleSets_.add(value);
        onChanged();
      } else {
        ruleSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder addRuleSets(
        int index, com.tcn.cloud.api.api.v0alpha.RuleSet value) {
      if (ruleSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleSetsIsMutable();
        ruleSets_.add(index, value);
        onChanged();
      } else {
        ruleSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder addRuleSets(
        com.tcn.cloud.api.api.v0alpha.RuleSet.Builder builderForValue) {
      if (ruleSetsBuilder_ == null) {
        ensureRuleSetsIsMutable();
        ruleSets_.add(builderForValue.build());
        onChanged();
      } else {
        ruleSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder addRuleSets(
        int index, com.tcn.cloud.api.api.v0alpha.RuleSet.Builder builderForValue) {
      if (ruleSetsBuilder_ == null) {
        ensureRuleSetsIsMutable();
        ruleSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        ruleSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder addAllRuleSets(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.RuleSet> values) {
      if (ruleSetsBuilder_ == null) {
        ensureRuleSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ruleSets_);
        onChanged();
      } else {
        ruleSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder clearRuleSets() {
      if (ruleSetsBuilder_ == null) {
        ruleSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ruleSetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public Builder removeRuleSets(int index) {
      if (ruleSetsBuilder_ == null) {
        ensureRuleSetsIsMutable();
        ruleSets_.remove(index);
        onChanged();
      } else {
        ruleSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RuleSet.Builder getRuleSetsBuilder(
        int index) {
      return getRuleSetsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RuleSetOrBuilder getRuleSetsOrBuilder(
        int index) {
      if (ruleSetsBuilder_ == null) {
        return ruleSets_.get(index);  } else {
        return ruleSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.RuleSetOrBuilder> 
         getRuleSetsOrBuilderList() {
      if (ruleSetsBuilder_ != null) {
        return ruleSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ruleSets_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RuleSet.Builder addRuleSetsBuilder() {
      return getRuleSetsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.RuleSet.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RuleSet.Builder addRuleSetsBuilder(
        int index) {
      return getRuleSetsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.RuleSet.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.RuleSet rule_sets = 1 [json_name = "ruleSets"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.RuleSet.Builder> 
         getRuleSetsBuilderList() {
      return getRuleSetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.RuleSet, com.tcn.cloud.api.api.v0alpha.RuleSet.Builder, com.tcn.cloud.api.api.v0alpha.RuleSetOrBuilder> 
        getRuleSetsFieldBuilder() {
      if (ruleSetsBuilder_ == null) {
        ruleSetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.RuleSet, com.tcn.cloud.api.api.v0alpha.RuleSet.Builder, com.tcn.cloud.api.api.v0alpha.RuleSetOrBuilder>(
                ruleSets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ruleSets_ = null;
      }
      return ruleSetsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListAssignedRuleSetsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListAssignedRuleSetsRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAssignedRuleSetsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListAssignedRuleSetsRes>() {
    @java.lang.Override
    public ListAssignedRuleSetsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAssignedRuleSetsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAssignedRuleSetsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListAssignedRuleSetsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

