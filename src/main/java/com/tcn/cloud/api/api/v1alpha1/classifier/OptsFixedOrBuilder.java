// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/entities.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

public interface OptsFixedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.classifier.OptsFixed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * field opts keyed by field name
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.classifier.OptsFixed.FieldOpts&gt; positions = 1 [json_name = "positions"];</code>
   */
  int getPositionsCount();
  /**
   * <pre>
   * field opts keyed by field name
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.classifier.OptsFixed.FieldOpts&gt; positions = 1 [json_name = "positions"];</code>
   */
  boolean containsPositions(
      java.lang.String key);
  /**
   * Use {@link #getPositionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.classifier.OptsFixed.FieldOpts>
  getPositions();
  /**
   * <pre>
   * field opts keyed by field name
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.classifier.OptsFixed.FieldOpts&gt; positions = 1 [json_name = "positions"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.classifier.OptsFixed.FieldOpts>
  getPositionsMap();
  /**
   * <pre>
   * field opts keyed by field name
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.classifier.OptsFixed.FieldOpts&gt; positions = 1 [json_name = "positions"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.classifier.OptsFixed.FieldOpts getPositionsOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.classifier.OptsFixed.FieldOpts defaultValue);
  /**
   * <pre>
   * field opts keyed by field name
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.classifier.OptsFixed.FieldOpts&gt; positions = 1 [json_name = "positions"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.OptsFixed.FieldOpts getPositionsOrThrow(
      java.lang.String key);
}