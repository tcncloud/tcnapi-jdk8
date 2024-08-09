// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Represents an adherence agent rule clause.
 * </pre>
 *
 * Protobuf type {@code api.commons.AdherenceAgentRuleClause}
 */
public final class AdherenceAgentRuleClause extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.AdherenceAgentRuleClause)
    AdherenceAgentRuleClauseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdherenceAgentRuleClause.newBuilder() to construct.
  private AdherenceAgentRuleClause(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdherenceAgentRuleClause() {
    condition_ = 0;
    unit_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdherenceAgentRuleClause();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentRuleClause_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentRuleClause_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause.class, com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause.Builder.class);
  }

  public static final int ADHERENCE_AGENT_RULE_CLAUSE_ID_FIELD_NUMBER = 1;
  private long adherenceAgentRuleClauseId_ = 0L;
  /**
   * <pre>
   * ID of this agent rule clause.
   * </pre>
   *
   * <code>int64 adherence_agent_rule_clause_id = 1 [json_name = "adherenceAgentRuleClauseId"];</code>
   * @return The adherenceAgentRuleClauseId.
   */
  @java.lang.Override
  public long getAdherenceAgentRuleClauseId() {
    return adherenceAgentRuleClauseId_;
  }

  public static final int ADHERENCE_AGENT_RULE_ID_FIELD_NUMBER = 2;
  private long adherenceAgentRuleId_ = 0L;
  /**
   * <pre>
   * ID of the agent rule that this clause belongs to.
   * </pre>
   *
   * <code>int64 adherence_agent_rule_id = 2 [json_name = "adherenceAgentRuleId"];</code>
   * @return The adherenceAgentRuleId.
   */
  @java.lang.Override
  public long getAdherenceAgentRuleId() {
    return adherenceAgentRuleId_;
  }

  public static final int ACTION_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction action_;
  /**
   * <pre>
   * Action that this agent rule clause evaluates.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
   * @return Whether the action field is set.
   */
  @java.lang.Override
  public boolean hasAction() {
    return action_ != null;
  }
  /**
   * <pre>
   * Action that this agent rule clause evaluates.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
   * @return The action.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction getAction() {
    return action_ == null ? com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.getDefaultInstance() : action_;
  }
  /**
   * <pre>
   * Action that this agent rule clause evaluates.
   * </pre>
   *
   * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AdherenceAgentRuleActionOrBuilder getActionOrBuilder() {
    return action_ == null ? com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.getDefaultInstance() : action_;
  }

  public static final int CONDITION_FIELD_NUMBER = 4;
  private int condition_ = 0;
  /**
   * <pre>
   * Condition that will be evaluated between the &#64;action and the &#64;amount.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleCondition condition = 4 [json_name = "condition"];</code>
   * @return The enum numeric value on the wire for condition.
   */
  @java.lang.Override public int getConditionValue() {
    return condition_;
  }
  /**
   * <pre>
   * Condition that will be evaluated between the &#64;action and the &#64;amount.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleCondition condition = 4 [json_name = "condition"];</code>
   * @return The condition.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.AdherenceRuleCondition getCondition() {
    com.tcn.cloud.api.api.commons.AdherenceRuleCondition result = com.tcn.cloud.api.api.commons.AdherenceRuleCondition.forNumber(condition_);
    return result == null ? com.tcn.cloud.api.api.commons.AdherenceRuleCondition.UNRECOGNIZED : result;
  }

  public static final int AMOUNT_FIELD_NUMBER = 5;
  private int amount_ = 0;
  /**
   * <pre>
   * Amount to evaluate.
   * </pre>
   *
   * <code>int32 amount = 5 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public int getAmount() {
    return amount_;
  }

  public static final int UNIT_FIELD_NUMBER = 6;
  private int unit_ = 0;
  /**
   * <pre>
   * Unit that the &#64;amount is on.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleUnit unit = 6 [json_name = "unit"];</code>
   * @return The enum numeric value on the wire for unit.
   */
  @java.lang.Override public int getUnitValue() {
    return unit_;
  }
  /**
   * <pre>
   * Unit that the &#64;amount is on.
   * </pre>
   *
   * <code>.api.commons.AdherenceRuleUnit unit = 6 [json_name = "unit"];</code>
   * @return The unit.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.AdherenceRuleUnit getUnit() {
    com.tcn.cloud.api.api.commons.AdherenceRuleUnit result = com.tcn.cloud.api.api.commons.AdherenceRuleUnit.forNumber(unit_);
    return result == null ? com.tcn.cloud.api.api.commons.AdherenceRuleUnit.UNRECOGNIZED : result;
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
    if (adherenceAgentRuleClauseId_ != 0L) {
      output.writeInt64(1, adherenceAgentRuleClauseId_);
    }
    if (adherenceAgentRuleId_ != 0L) {
      output.writeInt64(2, adherenceAgentRuleId_);
    }
    if (action_ != null) {
      output.writeMessage(3, getAction());
    }
    if (condition_ != com.tcn.cloud.api.api.commons.AdherenceRuleCondition.ADHERENCE_RULE_CONDITION_GREATER_THAN.getNumber()) {
      output.writeEnum(4, condition_);
    }
    if (amount_ != 0) {
      output.writeInt32(5, amount_);
    }
    if (unit_ != com.tcn.cloud.api.api.commons.AdherenceRuleUnit.ADHERENCE_RULE_UNIT_SECONDS.getNumber()) {
      output.writeEnum(6, unit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adherenceAgentRuleClauseId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, adherenceAgentRuleClauseId_);
    }
    if (adherenceAgentRuleId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, adherenceAgentRuleId_);
    }
    if (action_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAction());
    }
    if (condition_ != com.tcn.cloud.api.api.commons.AdherenceRuleCondition.ADHERENCE_RULE_CONDITION_GREATER_THAN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, condition_);
    }
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, amount_);
    }
    if (unit_ != com.tcn.cloud.api.api.commons.AdherenceRuleUnit.ADHERENCE_RULE_UNIT_SECONDS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, unit_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause other = (com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause) obj;

    if (getAdherenceAgentRuleClauseId()
        != other.getAdherenceAgentRuleClauseId()) return false;
    if (getAdherenceAgentRuleId()
        != other.getAdherenceAgentRuleId()) return false;
    if (hasAction() != other.hasAction()) return false;
    if (hasAction()) {
      if (!getAction()
          .equals(other.getAction())) return false;
    }
    if (condition_ != other.condition_) return false;
    if (getAmount()
        != other.getAmount()) return false;
    if (unit_ != other.unit_) return false;
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
    hash = (37 * hash) + ADHERENCE_AGENT_RULE_CLAUSE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAdherenceAgentRuleClauseId());
    hash = (37 * hash) + ADHERENCE_AGENT_RULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAdherenceAgentRuleId());
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    hash = (37 * hash) + CONDITION_FIELD_NUMBER;
    hash = (53 * hash) + condition_;
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause prototype) {
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
   * Represents an adherence agent rule clause.
   * </pre>
   *
   * Protobuf type {@code api.commons.AdherenceAgentRuleClause}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.AdherenceAgentRuleClause)
      com.tcn.cloud.api.api.commons.AdherenceAgentRuleClauseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentRuleClause_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentRuleClause_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause.class, com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause.newBuilder()
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
      adherenceAgentRuleClauseId_ = 0L;
      adherenceAgentRuleId_ = 0L;
      action_ = null;
      if (actionBuilder_ != null) {
        actionBuilder_.dispose();
        actionBuilder_ = null;
      }
      condition_ = 0;
      amount_ = 0;
      unit_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.WfmProto.internal_static_api_commons_AdherenceAgentRuleClause_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause build() {
      com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause buildPartial() {
      com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause result = new com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.adherenceAgentRuleClauseId_ = adherenceAgentRuleClauseId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adherenceAgentRuleId_ = adherenceAgentRuleId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.action_ = actionBuilder_ == null
            ? action_
            : actionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.condition_ = condition_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.unit_ = unit_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause) {
        return mergeFrom((com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause other) {
      if (other == com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause.getDefaultInstance()) return this;
      if (other.getAdherenceAgentRuleClauseId() != 0L) {
        setAdherenceAgentRuleClauseId(other.getAdherenceAgentRuleClauseId());
      }
      if (other.getAdherenceAgentRuleId() != 0L) {
        setAdherenceAgentRuleId(other.getAdherenceAgentRuleId());
      }
      if (other.hasAction()) {
        mergeAction(other.getAction());
      }
      if (other.condition_ != 0) {
        setConditionValue(other.getConditionValue());
      }
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
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
              adherenceAgentRuleClauseId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              adherenceAgentRuleId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getActionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              condition_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              amount_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              unit_ = input.readEnum();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private long adherenceAgentRuleClauseId_ ;
    /**
     * <pre>
     * ID of this agent rule clause.
     * </pre>
     *
     * <code>int64 adherence_agent_rule_clause_id = 1 [json_name = "adherenceAgentRuleClauseId"];</code>
     * @return The adherenceAgentRuleClauseId.
     */
    @java.lang.Override
    public long getAdherenceAgentRuleClauseId() {
      return adherenceAgentRuleClauseId_;
    }
    /**
     * <pre>
     * ID of this agent rule clause.
     * </pre>
     *
     * <code>int64 adherence_agent_rule_clause_id = 1 [json_name = "adherenceAgentRuleClauseId"];</code>
     * @param value The adherenceAgentRuleClauseId to set.
     * @return This builder for chaining.
     */
    public Builder setAdherenceAgentRuleClauseId(long value) {

      adherenceAgentRuleClauseId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of this agent rule clause.
     * </pre>
     *
     * <code>int64 adherence_agent_rule_clause_id = 1 [json_name = "adherenceAgentRuleClauseId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdherenceAgentRuleClauseId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adherenceAgentRuleClauseId_ = 0L;
      onChanged();
      return this;
    }

    private long adherenceAgentRuleId_ ;
    /**
     * <pre>
     * ID of the agent rule that this clause belongs to.
     * </pre>
     *
     * <code>int64 adherence_agent_rule_id = 2 [json_name = "adherenceAgentRuleId"];</code>
     * @return The adherenceAgentRuleId.
     */
    @java.lang.Override
    public long getAdherenceAgentRuleId() {
      return adherenceAgentRuleId_;
    }
    /**
     * <pre>
     * ID of the agent rule that this clause belongs to.
     * </pre>
     *
     * <code>int64 adherence_agent_rule_id = 2 [json_name = "adherenceAgentRuleId"];</code>
     * @param value The adherenceAgentRuleId to set.
     * @return This builder for chaining.
     */
    public Builder setAdherenceAgentRuleId(long value) {

      adherenceAgentRuleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the agent rule that this clause belongs to.
     * </pre>
     *
     * <code>int64 adherence_agent_rule_id = 2 [json_name = "adherenceAgentRuleId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdherenceAgentRuleId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      adherenceAgentRuleId_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction action_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction, com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.Builder, com.tcn.cloud.api.api.commons.AdherenceAgentRuleActionOrBuilder> actionBuilder_;
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     * @return Whether the action field is set.
     */
    public boolean hasAction() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     * @return The action.
     */
    public com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction getAction() {
      if (actionBuilder_ == null) {
        return action_ == null ? com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.getDefaultInstance() : action_;
      } else {
        return actionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     */
    public Builder setAction(com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction value) {
      if (actionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
      } else {
        actionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     */
    public Builder setAction(
        com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.Builder builderForValue) {
      if (actionBuilder_ == null) {
        action_ = builderForValue.build();
      } else {
        actionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     */
    public Builder mergeAction(com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction value) {
      if (actionBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          action_ != null &&
          action_ != com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.getDefaultInstance()) {
          getActionBuilder().mergeFrom(value);
        } else {
          action_ = value;
        }
      } else {
        actionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     */
    public Builder clearAction() {
      bitField0_ = (bitField0_ & ~0x00000004);
      action_ = null;
      if (actionBuilder_ != null) {
        actionBuilder_.dispose();
        actionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.Builder getActionBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getActionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     */
    public com.tcn.cloud.api.api.commons.AdherenceAgentRuleActionOrBuilder getActionOrBuilder() {
      if (actionBuilder_ != null) {
        return actionBuilder_.getMessageOrBuilder();
      } else {
        return action_ == null ?
            com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.getDefaultInstance() : action_;
      }
    }
    /**
     * <pre>
     * Action that this agent rule clause evaluates.
     * </pre>
     *
     * <code>.api.commons.AdherenceAgentRuleAction action = 3 [json_name = "action"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction, com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.Builder, com.tcn.cloud.api.api.commons.AdherenceAgentRuleActionOrBuilder> 
        getActionFieldBuilder() {
      if (actionBuilder_ == null) {
        actionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction, com.tcn.cloud.api.api.commons.AdherenceAgentRuleAction.Builder, com.tcn.cloud.api.api.commons.AdherenceAgentRuleActionOrBuilder>(
                getAction(),
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      return actionBuilder_;
    }

    private int condition_ = 0;
    /**
     * <pre>
     * Condition that will be evaluated between the &#64;action and the &#64;amount.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleCondition condition = 4 [json_name = "condition"];</code>
     * @return The enum numeric value on the wire for condition.
     */
    @java.lang.Override public int getConditionValue() {
      return condition_;
    }
    /**
     * <pre>
     * Condition that will be evaluated between the &#64;action and the &#64;amount.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleCondition condition = 4 [json_name = "condition"];</code>
     * @param value The enum numeric value on the wire for condition to set.
     * @return This builder for chaining.
     */
    public Builder setConditionValue(int value) {
      condition_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Condition that will be evaluated between the &#64;action and the &#64;amount.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleCondition condition = 4 [json_name = "condition"];</code>
     * @return The condition.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AdherenceRuleCondition getCondition() {
      com.tcn.cloud.api.api.commons.AdherenceRuleCondition result = com.tcn.cloud.api.api.commons.AdherenceRuleCondition.forNumber(condition_);
      return result == null ? com.tcn.cloud.api.api.commons.AdherenceRuleCondition.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Condition that will be evaluated between the &#64;action and the &#64;amount.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleCondition condition = 4 [json_name = "condition"];</code>
     * @param value The condition to set.
     * @return This builder for chaining.
     */
    public Builder setCondition(com.tcn.cloud.api.api.commons.AdherenceRuleCondition value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      condition_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Condition that will be evaluated between the &#64;action and the &#64;amount.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleCondition condition = 4 [json_name = "condition"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCondition() {
      bitField0_ = (bitField0_ & ~0x00000008);
      condition_ = 0;
      onChanged();
      return this;
    }

    private int amount_ ;
    /**
     * <pre>
     * Amount to evaluate.
     * </pre>
     *
     * <code>int32 amount = 5 [json_name = "amount"];</code>
     * @return The amount.
     */
    @java.lang.Override
    public int getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * Amount to evaluate.
     * </pre>
     *
     * <code>int32 amount = 5 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(int value) {

      amount_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Amount to evaluate.
     * </pre>
     *
     * <code>int32 amount = 5 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000010);
      amount_ = 0;
      onChanged();
      return this;
    }

    private int unit_ = 0;
    /**
     * <pre>
     * Unit that the &#64;amount is on.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleUnit unit = 6 [json_name = "unit"];</code>
     * @return The enum numeric value on the wire for unit.
     */
    @java.lang.Override public int getUnitValue() {
      return unit_;
    }
    /**
     * <pre>
     * Unit that the &#64;amount is on.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleUnit unit = 6 [json_name = "unit"];</code>
     * @param value The enum numeric value on the wire for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unit that the &#64;amount is on.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleUnit unit = 6 [json_name = "unit"];</code>
     * @return The unit.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AdherenceRuleUnit getUnit() {
      com.tcn.cloud.api.api.commons.AdherenceRuleUnit result = com.tcn.cloud.api.api.commons.AdherenceRuleUnit.forNumber(unit_);
      return result == null ? com.tcn.cloud.api.api.commons.AdherenceRuleUnit.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Unit that the &#64;amount is on.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleUnit unit = 6 [json_name = "unit"];</code>
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(com.tcn.cloud.api.api.commons.AdherenceRuleUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000020;
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unit that the &#64;amount is on.
     * </pre>
     *
     * <code>.api.commons.AdherenceRuleUnit unit = 6 [json_name = "unit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      bitField0_ = (bitField0_ & ~0x00000020);
      unit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.AdherenceAgentRuleClause)
  }

  // @@protoc_insertion_point(class_scope:api.commons.AdherenceAgentRuleClause)
  private static final com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause();
  }

  public static com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdherenceAgentRuleClause>
      PARSER = new com.google.protobuf.AbstractParser<AdherenceAgentRuleClause>() {
    @java.lang.Override
    public AdherenceAgentRuleClause parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdherenceAgentRuleClause> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdherenceAgentRuleClause> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AdherenceAgentRuleClause getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

