// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/projects/projects.proto

package com.tcn.cloud.api.api.v1alpha1.projects;

public interface ListProjectsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.projects.ListProjectsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * adding filter
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr filter = 1 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * adding filter
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr filter = 1 [json_name = "filter"];</code>
   * @return The filter.
   */
  com.google.api.expr.v1alpha1.ParsedExpr getFilter();
  /**
   * <pre>
   * adding filter
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.ParsedExpr filter = 1 [json_name = "filter"];</code>
   */
  com.google.api.expr.v1alpha1.ParsedExprOrBuilder getFilterOrBuilder();
}
