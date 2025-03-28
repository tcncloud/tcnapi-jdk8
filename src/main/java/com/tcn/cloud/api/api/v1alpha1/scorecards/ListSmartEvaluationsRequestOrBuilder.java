// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/smart_evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public interface ListSmartEvaluationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.scorecards.ListSmartEvaluationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The order by which smart evaluations will be listed. Follows sql
   * order by syntax. Defaults to "complete_time desc, smart_evaluation_id desc".
   * </pre>
   *
   * <code>string order_by = 2 [json_name = "orderBy"];</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Optional. The order by which smart evaluations will be listed. Follows sql
   * order by syntax. Defaults to "complete_time desc, smart_evaluation_id desc".
   * </pre>
   *
   * <code>string order_by = 2 [json_name = "orderBy"];</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Optional - number of smart evaluations included in response. Defaults to 500.
   * </pre>
   *
   * <code>int32 page_size = 3 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string page_token = 4 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Required. Fields to return.
   *
   * Example selecting score, section points, and question answer:
   * {
   *   paths: [
   *     "score",
   *     "smart_evaluation_section.points",
   *     "smart_evaluation_section.smart_evaluation_question.answer"
   *   ]
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask return_fields = 5 [json_name = "returnFields"];</code>
   * @return Whether the returnFields field is set.
   */
  boolean hasReturnFields();
  /**
   * <pre>
   * Required. Fields to return.
   *
   * Example selecting score, section points, and question answer:
   * {
   *   paths: [
   *     "score",
   *     "smart_evaluation_section.points",
   *     "smart_evaluation_section.smart_evaluation_question.answer"
   *   ]
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask return_fields = 5 [json_name = "returnFields"];</code>
   * @return The returnFields.
   */
  com.google.protobuf.FieldMask getReturnFields();
  /**
   * <pre>
   * Required. Fields to return.
   *
   * Example selecting score, section points, and question answer:
   * {
   *   paths: [
   *     "score",
   *     "smart_evaluation_section.points",
   *     "smart_evaluation_section.smart_evaluation_question.answer"
   *   ]
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask return_fields = 5 [json_name = "returnFields"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReturnFieldsOrBuilder();

  /**
   * <pre>
   *
   *Optional. The standard list filter as described in https://google.aip.dev/160.
   *Multiple comparisons can be provided when separated with a logical AND
   *operator. Supported fields, operators and functions are listed below.
   *
   *+----------------------------+-----------+-----------------+-----------+
   *|                      field |      type |       operators | functions |
   *+----------------------------+-----------+-----------------+-----------+
   *|               scorecard_id |   integer |               = |       any |
   *|                category_id |   integer |               = |       any |
   *|              agent_user_id |    string |               = |       any |
   *|             transcript_sid |   integer | =, &gt;=, &lt;=, &gt;, &lt; |           |
   *|              complete_time | timestamp | =, &gt;=, &lt;=, &gt;, &lt; |           |
   *|               channel_type |   integer |               = |       any |
   *+----------------------------+-----------+-----------------+-----------+
   *
   *Examples:
   *transcript_sid &gt;= 1
   *
   *scorecard_id = 0 AND
   *agent_user_id = any("00000000-0000-0000-0000-000000000000", "00000000-0000-0000-0000-000000000001") AND
   *complete_time &gt;= '2012-04-21T11:30:00-04:00'
   * </pre>
   *
   * <code>string filter = 6 [json_name = "filter"];</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   *
   *Optional. The standard list filter as described in https://google.aip.dev/160.
   *Multiple comparisons can be provided when separated with a logical AND
   *operator. Supported fields, operators and functions are listed below.
   *
   *+----------------------------+-----------+-----------------+-----------+
   *|                      field |      type |       operators | functions |
   *+----------------------------+-----------+-----------------+-----------+
   *|               scorecard_id |   integer |               = |       any |
   *|                category_id |   integer |               = |       any |
   *|              agent_user_id |    string |               = |       any |
   *|             transcript_sid |   integer | =, &gt;=, &lt;=, &gt;, &lt; |           |
   *|              complete_time | timestamp | =, &gt;=, &lt;=, &gt;, &lt; |           |
   *|               channel_type |   integer |               = |       any |
   *+----------------------------+-----------+-----------------+-----------+
   *
   *Examples:
   *transcript_sid &gt;= 1
   *
   *scorecard_id = 0 AND
   *agent_user_id = any("00000000-0000-0000-0000-000000000000", "00000000-0000-0000-0000-000000000001") AND
   *complete_time &gt;= '2012-04-21T11:30:00-04:00'
   * </pre>
   *
   * <code>string filter = 6 [json_name = "filter"];</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
