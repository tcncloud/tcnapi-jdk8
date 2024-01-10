// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public interface TranscriptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wfo.vanalytics.v2.Transcript)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.wfo.vanalytics.v2.Call call = 1 [json_name = "call"];</code>
   * @return Whether the call field is set.
   */
  boolean hasCall();
  /**
   * <code>.wfo.vanalytics.v2.Call call = 1 [json_name = "call"];</code>
   * @return The call.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Call getCall();
  /**
   * <code>.wfo.vanalytics.v2.Call call = 1 [json_name = "call"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.CallOrBuilder getCallOrBuilder();

  /**
   * <code>.wfo.vanalytics.v2.Sms sms = 2 [json_name = "sms"];</code>
   * @return Whether the sms field is set.
   */
  boolean hasSms();
  /**
   * <code>.wfo.vanalytics.v2.Sms sms = 2 [json_name = "sms"];</code>
   * @return The sms.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Sms getSms();
  /**
   * <code>.wfo.vanalytics.v2.Sms sms = 2 [json_name = "sms"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.SmsOrBuilder getSmsOrBuilder();

  /**
   * <code>string org_id = 11 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 11 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>.wfo.vanalytics.v2.Channel channel = 12 [json_name = "channel"];</code>
   * @return The enum numeric value on the wire for channel.
   */
  int getChannelValue();
  /**
   * <code>.wfo.vanalytics.v2.Channel channel = 12 [json_name = "channel"];</code>
   * @return The channel.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.Channel getChannel();

  /**
   * <code>.google.protobuf.Timestamp start_time = 13 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 13 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 13 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp create_time = 14 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 14 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 14 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * The time this transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [json_name = "deleteTime"];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * The time this transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [json_name = "deleteTime"];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * The time this transcript was marked as deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 15 [json_name = "deleteTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <code>.wfo.vanalytics.v2.FlagSummary flag_summary = 16 [json_name = "flagSummary"];</code>
   * @return Whether the flagSummary field is set.
   */
  boolean hasFlagSummary();
  /**
   * <code>.wfo.vanalytics.v2.FlagSummary flag_summary = 16 [json_name = "flagSummary"];</code>
   * @return The flagSummary.
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagSummary getFlagSummary();
  /**
   * <code>.wfo.vanalytics.v2.FlagSummary flag_summary = 16 [json_name = "flagSummary"];</code>
   */
  com.tcn.cloud.api.wfo.vanalytics.v2.FlagSummaryOrBuilder getFlagSummaryOrBuilder();

  /**
   * <code>int64 transcript_sid = 17 [json_name = "transcriptSid"];</code>
   * @return The transcriptSid.
   */
  long getTranscriptSid();

  com.tcn.cloud.api.wfo.vanalytics.v2.Transcript.MetadataCase getMetadataCase();
}
