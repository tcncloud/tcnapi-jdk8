// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface SpanNearOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.SpanNear)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * slop is the number of extra terms that can be in the query that
   * are not being searched for. For example: slop of 2 when searching for
   * "This is my dog" would allow "This is my quick brown dog".
   * </pre>
   *
   * <code>int32 slop = 1 [json_name = "slop"];</code>
   * @return The slop.
   */
  int getSlop();

  /**
   * <pre>
   * when in_order is true then the terms must be found in the order given.
   * </pre>
   *
   * <code>bool in_order = 2 [json_name = "inOrder"];</code>
   * @return The inOrder.
   */
  boolean getInOrder();

  /**
   * <pre>
   * TODO: ???
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  java.util.List<com.tcn.cloud.api.wfo.vanalytics.v2.SpanNear.Clause> 
      getClausesList();
  /**
   * <pre>
   * TODO: ???
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.SpanNear.Clause getClauses(int index);
  /**
   * <pre>
   * TODO: ???
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  int getClausesCount();
  /**
   * <pre>
   * TODO: ???
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.wfo.vanalytics.v2.SpanNear.ClauseOrBuilder> 
      getClausesOrBuilderList();
  /**
   * <pre>
   * TODO: ???
   * </pre>
   *
   * <code>repeated .wfo.vanalytics.v2.SpanNear.Clause clauses = 3 [json_name = "clauses"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.SpanNear.ClauseOrBuilder getClausesOrBuilder(
      int index);
}