// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/entities.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

public interface ParseHintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.classifier.ParseHints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.classifier.ParseOpts parse_opts = 1 [json_name = "parseOpts"];</code>
   * @return Whether the parseOpts field is set.
   */
  boolean hasParseOpts();
  /**
   * <code>.api.v1alpha1.classifier.ParseOpts parse_opts = 1 [json_name = "parseOpts"];</code>
   * @return The parseOpts.
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.ParseOpts getParseOpts();
  /**
   * <code>.api.v1alpha1.classifier.ParseOpts parse_opts = 1 [json_name = "parseOpts"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.ParseOptsOrBuilder getParseOptsOrBuilder();

  /**
   * <code>.api.v1alpha1.classifier.Constraints constraints = 2 [json_name = "constraints"];</code>
   * @return Whether the constraints field is set.
   */
  boolean hasConstraints();
  /**
   * <code>.api.v1alpha1.classifier.Constraints constraints = 2 [json_name = "constraints"];</code>
   * @return The constraints.
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.Constraints getConstraints();
  /**
   * <code>.api.v1alpha1.classifier.Constraints constraints = 2 [json_name = "constraints"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.ConstraintsOrBuilder getConstraintsOrBuilder();
}