// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface SpanNearOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.SpanNear)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 slop = 1 [json_name = "slop"];</code>
   * @return The slop.
   */
  int getSlop();

  /**
   * <code>bool in_order = 2 [json_name = "inOrder"];</code>
   * @return The inOrder.
   */
  boolean getInOrder();

  /**
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.SpanNear.Clause> 
      getClausesList();
  /**
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.SpanNear.Clause getClauses(int index);
  /**
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  int getClausesCount();
  /**
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.SpanNear.ClauseOrBuilder> 
      getClausesOrBuilderList();
  /**
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.SpanNear.ClauseOrBuilder getClausesOrBuilder(
      int index);
}
