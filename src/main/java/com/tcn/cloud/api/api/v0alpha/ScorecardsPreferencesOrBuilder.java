// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ScorecardsPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ScorecardsPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The percentage of randomized calls shown to the user for evaluation.
   * Must be between 1-100.
   * </pre>
   *
   * <code>uint32 call_sample_percentage = 2 [json_name = "callSamplePercentage"];</code>
   * @return The callSamplePercentage.
   */
  int getCallSamplePercentage();

  /**
   * <pre>
   * Maximum number of evaluations per user, per category,
   * over the given time interval
   * </pre>
   *
   * <code>uint32 max_user_evaluations = 3 [json_name = "maxUserEvaluations"];</code>
   * @return The maxUserEvaluations.
   */
  int getMaxUserEvaluations();

  /**
   * <pre>
   * The time interval over which calls are listed for scoring.
   * </pre>
   *
   * <code>.api.v0alpha.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
   * @return The enum numeric value on the wire for evaluationInterval.
   */
  int getEvaluationIntervalValue();
  /**
   * <pre>
   * The time interval over which calls are listed for scoring.
   * </pre>
   *
   * <code>.api.v0alpha.Scorecards.EvaluationInterval evaluation_interval = 4 [json_name = "evaluationInterval"];</code>
   * @return The evaluationInterval.
   */
  com.tcn.cloud.api.api.v0alpha.Scorecards.EvaluationInterval getEvaluationInterval();
}
