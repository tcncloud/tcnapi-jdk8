// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface DispositionSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.DispositionSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.DispositionPair> 
      getDispositionsList();
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DispositionPair getDispositions(int index);
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  int getDispositionsCount();
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder> 
      getDispositionsOrBuilderList();
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder getDispositionsOrBuilder(
      int index);
}
