// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/service.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

public interface QueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.explorer.QueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * datasource_name is the name of the datasource to query.
   * </pre>
   *
   * <code>string datasource_name = 1 [json_name = "datasourceName"];</code>
   * @return The datasourceName.
   */
  java.lang.String getDatasourceName();
  /**
   * <pre>
   * datasource_name is the name of the datasource to query.
   * </pre>
   *
   * <code>string datasource_name = 1 [json_name = "datasourceName"];</code>
   * @return The bytes for datasourceName.
   */
  com.google.protobuf.ByteString
      getDatasourceNameBytes();

  /**
   * <pre>
   * datasource_type is the type of the datasource to query.
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.DatasourceType datasource_type = 2 [json_name = "datasourceType"];</code>
   * @return The enum numeric value on the wire for datasourceType.
   */
  int getDatasourceTypeValue();
  /**
   * <pre>
   * datasource_type is the type of the datasource to query.
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.DatasourceType datasource_type = 2 [json_name = "datasourceType"];</code>
   * @return The datasourceType.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.DatasourceType getDatasourceType();

  /**
   * <pre>
   * pipeline to be compiled to prql
   * </pre>
   *
   * <code>string pipeline = 3 [json_name = "pipeline"];</code>
   * @return Whether the pipeline field is set.
   */
  boolean hasPipeline();
  /**
   * <pre>
   * pipeline to be compiled to prql
   * </pre>
   *
   * <code>string pipeline = 3 [json_name = "pipeline"];</code>
   * @return The pipeline.
   */
  java.lang.String getPipeline();
  /**
   * <pre>
   * pipeline to be compiled to prql
   * </pre>
   *
   * <code>string pipeline = 3 [json_name = "pipeline"];</code>
   * @return The bytes for pipeline.
   */
  com.google.protobuf.ByteString
      getPipelineBytes();

  /**
   * <pre>
   * prql query to execute
   * </pre>
   *
   * <code>string prql = 4 [json_name = "prql"];</code>
   * @return Whether the prql field is set.
   */
  boolean hasPrql();
  /**
   * <pre>
   * prql query to execute
   * </pre>
   *
   * <code>string prql = 4 [json_name = "prql"];</code>
   * @return The prql.
   */
  java.lang.String getPrql();
  /**
   * <pre>
   * prql query to execute
   * </pre>
   *
   * <code>string prql = 4 [json_name = "prql"];</code>
   * @return The bytes for prql.
   */
  com.google.protobuf.ByteString
      getPrqlBytes();

  /**
   * <pre>
   * org_id for ownership of the data
   * </pre>
   *
   * <code>repeated string org_ids = 5 [json_name = "orgIds"];</code>
   * @return A list containing the orgIds.
   */
  java.util.List<java.lang.String>
      getOrgIdsList();
  /**
   * <pre>
   * org_id for ownership of the data
   * </pre>
   *
   * <code>repeated string org_ids = 5 [json_name = "orgIds"];</code>
   * @return The count of orgIds.
   */
  int getOrgIdsCount();
  /**
   * <pre>
   * org_id for ownership of the data
   * </pre>
   *
   * <code>repeated string org_ids = 5 [json_name = "orgIds"];</code>
   * @param index The index of the element to return.
   * @return The orgIds at the given index.
   */
  java.lang.String getOrgIds(int index);
  /**
   * <pre>
   * org_id for ownership of the data
   * </pre>
   *
   * <code>repeated string org_ids = 5 [json_name = "orgIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the orgIds at the given index.
   */
  com.google.protobuf.ByteString
      getOrgIdsBytes(int index);

  /**
   * <pre>
   * start_time is the start time of the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * start_time is the start time of the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * start_time is the start time of the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * end_time is the end time of the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [json_name = "endTime"];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * end_time is the end time of the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [json_name = "endTime"];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * end_time is the end time of the query.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [json_name = "endTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * timezone is IESG timezone name
   * this is how the timezone is represented in the query
   * </pre>
   *
   * <code>string timezone = 8 [json_name = "timezone"];</code>
   * @return The timezone.
   */
  java.lang.String getTimezone();
  /**
   * <pre>
   * timezone is IESG timezone name
   * this is how the timezone is represented in the query
   * </pre>
   *
   * <code>string timezone = 8 [json_name = "timezone"];</code>
   * @return The bytes for timezone.
   */
  com.google.protobuf.ByteString
      getTimezoneBytes();

  /**
   * <pre>
   * pipeline_parameters is the parameters for the pipeline.
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.Parameters pipeline_parameters = 9 [json_name = "pipelineParameters"];</code>
   * @return Whether the pipelineParameters field is set.
   */
  boolean hasPipelineParameters();
  /**
   * <pre>
   * pipeline_parameters is the parameters for the pipeline.
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.Parameters pipeline_parameters = 9 [json_name = "pipelineParameters"];</code>
   * @return The pipelineParameters.
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.Parameters getPipelineParameters();
  /**
   * <pre>
   * pipeline_parameters is the parameters for the pipeline.
   * </pre>
   *
   * <code>.api.v1alpha1.explorer.Parameters pipeline_parameters = 9 [json_name = "pipelineParameters"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.explorer.ParametersOrBuilder getPipelineParametersOrBuilder();

  /**
   * <pre>
   * ui_trace_id is the trace id of the query.
   * </pre>
   *
   * <code>string ui_trace_id = 10 [json_name = "uiTraceId"];</code>
   * @return The uiTraceId.
   */
  java.lang.String getUiTraceId();
  /**
   * <pre>
   * ui_trace_id is the trace id of the query.
   * </pre>
   *
   * <code>string ui_trace_id = 10 [json_name = "uiTraceId"];</code>
   * @return The bytes for uiTraceId.
   */
  com.google.protobuf.ByteString
      getUiTraceIdBytes();

  /**
   * <pre>
   * comment is the comment for the query.
   * </pre>
   *
   * <code>string comment = 11 [json_name = "comment"];</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <pre>
   * comment is the comment for the query.
   * </pre>
   *
   * <code>string comment = 11 [json_name = "comment"];</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <pre>
   * format is the format of the result.
   * </pre>
   *
   * <code>string format = 12 [json_name = "format"];</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * format is the format of the result.
   * </pre>
   *
   * <code>string format = 12 [json_name = "format"];</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  com.tcn.cloud.api.api.v1alpha1.explorer.QueryRequest.QueryCase getQueryCase();
}
