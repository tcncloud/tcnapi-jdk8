// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

/**
 * Protobuf type {@code api.v1alpha1.org.legacy.ScorecardsPreferences}
 */
public final class ScorecardsPreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.legacy.ScorecardsPreferences)
    ScorecardsPreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScorecardsPreferences.newBuilder() to construct.
  private ScorecardsPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScorecardsPreferences() {
    evaluationInterval_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScorecardsPreferences();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ScorecardsPreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ScorecardsPreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences.Builder.class);
  }

  public static final int CALL_SAMPLE_PERCENTAGE_FIELD_NUMBER = 2;
  private int callSamplePercentage_ = 0;
  /**
   * <pre>
   * The percentage of randomized calls shown to the user for evaluation.
   * Must be between 1-100.
   * </pre>
   *
   * <code>uint32 call_sample_percentage = 2 [json_name = "callSamplePercentage"];</code>
   * @return The callSamplePercentage.
   */
  @java.lang.Override
  public int getCallSamplePercentage() {
    return callSamplePercentage_;
  }

  public static final int MAX_USER_EVALUATIONS_FIELD_NUMBER = 3;
  private int maxUserEvaluations_ = 0;
  /**
   * <pre>
   * Maximum number of evaluations per user, per category,
   * over the given time interval
   * </pre>
   *
   * <code>uint32 max_user_evaluations = 3 [json_name = "maxUserEvaluations"];</code>
   * @return The maxUserEvaluations.
   */
  @java.lang.Override
  public int getMaxUserEvaluations() {
    return maxUserEvaluations_;
  }

  public static final int EVALUATION_INTERVAL_FIELD_NUMBER = 4;
  private int evaluationInterval_ = 0;
  /**
   * <pre>
   * The time interval over which calls are listed for scoring.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
   * @return The enum numeric value on the wire for evaluationInterval.
   */
  @java.lang.Override public int getEvaluationIntervalValue() {
    return evaluationInterval_;
  }
  /**
   * <pre>
   * The time interval over which calls are listed for scoring.
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
   * @return The evaluationInterval.
   */
  @java.lang.Override public com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval getEvaluationInterval() {
    com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval result = com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval.forNumber(evaluationInterval_);
    return result == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval.UNRECOGNIZED : result;
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
    if (callSamplePercentage_ != 0) {
      output.writeUInt32(2, callSamplePercentage_);
    }
    if (maxUserEvaluations_ != 0) {
      output.writeUInt32(3, maxUserEvaluations_);
    }
    if (evaluationInterval_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval.EVALUATION_INTERVAL_DAY_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, evaluationInterval_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (callSamplePercentage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, callSamplePercentage_);
    }
    if (maxUserEvaluations_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, maxUserEvaluations_);
    }
    if (evaluationInterval_ != com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval.EVALUATION_INTERVAL_DAY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, evaluationInterval_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences other = (com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences) obj;

    if (getCallSamplePercentage()
        != other.getCallSamplePercentage()) return false;
    if (getMaxUserEvaluations()
        != other.getMaxUserEvaluations()) return false;
    if (evaluationInterval_ != other.evaluationInterval_) return false;
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
    hash = (37 * hash) + CALL_SAMPLE_PERCENTAGE_FIELD_NUMBER;
    hash = (53 * hash) + getCallSamplePercentage();
    hash = (37 * hash) + MAX_USER_EVALUATIONS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxUserEvaluations();
    hash = (37 * hash) + EVALUATION_INTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + evaluationInterval_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences prototype) {
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
   * Protobuf type {@code api.v1alpha1.org.legacy.ScorecardsPreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.legacy.ScorecardsPreferences)
      com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ScorecardsPreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ScorecardsPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences.class, com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences.newBuilder()
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
      callSamplePercentage_ = 0;
      maxUserEvaluations_ = 0;
      evaluationInterval_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.EntitiesProto.internal_static_api_v1alpha1_org_legacy_ScorecardsPreferences_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences build() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences result = new com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callSamplePercentage_ = callSamplePercentage_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxUserEvaluations_ = maxUserEvaluations_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.evaluationInterval_ = evaluationInterval_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences.getDefaultInstance()) return this;
      if (other.getCallSamplePercentage() != 0) {
        setCallSamplePercentage(other.getCallSamplePercentage());
      }
      if (other.getMaxUserEvaluations() != 0) {
        setMaxUserEvaluations(other.getMaxUserEvaluations());
      }
      if (other.evaluationInterval_ != 0) {
        setEvaluationIntervalValue(other.getEvaluationIntervalValue());
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
            case 16: {
              callSamplePercentage_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 16
            case 24: {
              maxUserEvaluations_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 32: {
              evaluationInterval_ = input.readEnum();
              bitField0_ |= 0x00000004;
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

    private int callSamplePercentage_ ;
    /**
     * <pre>
     * The percentage of randomized calls shown to the user for evaluation.
     * Must be between 1-100.
     * </pre>
     *
     * <code>uint32 call_sample_percentage = 2 [json_name = "callSamplePercentage"];</code>
     * @return The callSamplePercentage.
     */
    @java.lang.Override
    public int getCallSamplePercentage() {
      return callSamplePercentage_;
    }
    /**
     * <pre>
     * The percentage of randomized calls shown to the user for evaluation.
     * Must be between 1-100.
     * </pre>
     *
     * <code>uint32 call_sample_percentage = 2 [json_name = "callSamplePercentage"];</code>
     * @param value The callSamplePercentage to set.
     * @return This builder for chaining.
     */
    public Builder setCallSamplePercentage(int value) {

      callSamplePercentage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The percentage of randomized calls shown to the user for evaluation.
     * Must be between 1-100.
     * </pre>
     *
     * <code>uint32 call_sample_percentage = 2 [json_name = "callSamplePercentage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallSamplePercentage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callSamplePercentage_ = 0;
      onChanged();
      return this;
    }

    private int maxUserEvaluations_ ;
    /**
     * <pre>
     * Maximum number of evaluations per user, per category,
     * over the given time interval
     * </pre>
     *
     * <code>uint32 max_user_evaluations = 3 [json_name = "maxUserEvaluations"];</code>
     * @return The maxUserEvaluations.
     */
    @java.lang.Override
    public int getMaxUserEvaluations() {
      return maxUserEvaluations_;
    }
    /**
     * <pre>
     * Maximum number of evaluations per user, per category,
     * over the given time interval
     * </pre>
     *
     * <code>uint32 max_user_evaluations = 3 [json_name = "maxUserEvaluations"];</code>
     * @param value The maxUserEvaluations to set.
     * @return This builder for chaining.
     */
    public Builder setMaxUserEvaluations(int value) {

      maxUserEvaluations_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Maximum number of evaluations per user, per category,
     * over the given time interval
     * </pre>
     *
     * <code>uint32 max_user_evaluations = 3 [json_name = "maxUserEvaluations"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxUserEvaluations() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxUserEvaluations_ = 0;
      onChanged();
      return this;
    }

    private int evaluationInterval_ = 0;
    /**
     * <pre>
     * The time interval over which calls are listed for scoring.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
     * @return The enum numeric value on the wire for evaluationInterval.
     */
    @java.lang.Override public int getEvaluationIntervalValue() {
      return evaluationInterval_;
    }
    /**
     * <pre>
     * The time interval over which calls are listed for scoring.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
     * @param value The enum numeric value on the wire for evaluationInterval to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluationIntervalValue(int value) {
      evaluationInterval_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time interval over which calls are listed for scoring.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
     * @return The evaluationInterval.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval getEvaluationInterval() {
      com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval result = com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval.forNumber(evaluationInterval_);
      return result == null ? com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The time interval over which calls are listed for scoring.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
     * @param value The evaluationInterval to set.
     * @return This builder for chaining.
     */
    public Builder setEvaluationInterval(com.tcn.cloud.api.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      evaluationInterval_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The time interval over which calls are listed for scoring.
     * </pre>
     *
     * <code>.api.v1alpha1.org.legacy.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEvaluationInterval() {
      bitField0_ = (bitField0_ & ~0x00000004);
      evaluationInterval_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.legacy.ScorecardsPreferences)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.legacy.ScorecardsPreferences)
  private static final com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScorecardsPreferences>
      PARSER = new com.google.protobuf.AbstractParser<ScorecardsPreferences>() {
    @java.lang.Override
    public ScorecardsPreferences parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScorecardsPreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScorecardsPreferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.legacy.ScorecardsPreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

