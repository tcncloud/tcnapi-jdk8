// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface MatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.Match)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The text used to check a match.
   * </pre>
   *
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The text used to check a match.
   * </pre>
   *
   * <code>string text = 1 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * TODO: ???
   * </pre>
   *
   * <code>string operator = 2 [json_name = "operator"];</code>
   * @return The operator.
   */
  java.lang.String getOperator();
  /**
   * <pre>
   * TODO: ???
   * </pre>
   *
   * <code>string operator = 2 [json_name = "operator"];</code>
   * @return The bytes for operator.
   */
  com.google.protobuf.ByteString
      getOperatorBytes();

  /**
   * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 15 [json_name = "fuzzinessAuto"];</code>
   * @return Whether the fuzzinessAuto field is set.
   */
  boolean hasFuzzinessAuto();
  /**
   * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 15 [json_name = "fuzzinessAuto"];</code>
   * @return The fuzzinessAuto.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAuto getFuzzinessAuto();
  /**
   * <code>.wfo.vanalytics.v2.FuzzinessAuto fuzziness_auto = 15 [json_name = "fuzzinessAuto"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FuzzinessAutoOrBuilder getFuzzinessAutoOrBuilder();

  /**
   * <code>uint32 fuzziness_value = 16 [json_name = "fuzzinessValue"];</code>
   * @return Whether the fuzzinessValue field is set.
   */
  boolean hasFuzzinessValue();
  /**
   * <code>uint32 fuzziness_value = 16 [json_name = "fuzzinessValue"];</code>
   * @return The fuzzinessValue.
   */
  int getFuzzinessValue();

  com.tcn.cloud.api.wfo.vanalytics.v2.Match.FuzzinessCase getFuzzinessCase();
}