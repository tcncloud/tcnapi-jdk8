// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/vana_events.proto

package com.tcn.cloud.api.api.commons.audit;

public final class VanaEventsProto {
  private VanaEventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_VanaFlagEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_VanaFlagEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_VanaFlagReviewEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_VanaFlagReviewEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_VanaBillingReportEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_VanaBillingReportEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_VanaFlagSummaryEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_VanaFlagSummaryEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_VanaFlagSummaryEvent_FlagSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_VanaFlagSummaryEvent_FlagSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_VanaPhraseCorrectionEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_VanaPhraseCorrectionEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#api/commons/audit/vana_events.proto\022\021a" +
      "pi.commons.audit\032\036google/protobuf/durati" +
      "on.proto\032\037google/protobuf/timestamp.prot" +
      "o\"\236\001\n\rVanaFlagEvent\022\033\n\tflag_name\030\001 \001(\tR\010" +
      "flagName\022\031\n\010flag_sid\030\002 \001(\003R\007flagSid\022\020\n\003u" +
      "rl\030\003 \001(\tR\003url\022\'\n\017num_transcripts\030\004 \001(\003R\016" +
      "numTranscripts\022\032\n\010priority\030\005 \001(\005R\010priori" +
      "ty\"\244\001\n\023VanaFlagReviewEvent\022\033\n\tflag_name\030" +
      "\001 \001(\tR\010flagName\022\031\n\010flag_sid\030\002 \001(\003R\007flagS" +
      "id\022\020\n\003url\030\003 \001(\tR\003url\022\'\n\017num_transcripts\030" +
      "\004 \001(\003R\016numTranscripts\022\032\n\010priority\030\005 \001(\005R" +
      "\010priority\"\234\001\n\026VanaBillingReportEvent\0229\n\n" +
      "start_time\030\001 \001(\0132\032.google.protobuf.Times" +
      "tampR\tstartTime\0225\n\010end_time\030\002 \001(\0132\032.goog" +
      "le.protobuf.TimestampR\007endTime\022\020\n\003url\030\003 " +
      "\001(\tR\003url\"\267\002\n\024VanaFlagSummaryEvent\0229\n\nsta" +
      "rt_time\030\001 \001(\0132\032.google.protobuf.Timestam" +
      "pR\tstartTime\0225\n\010end_time\030\002 \001(\0132\032.google." +
      "protobuf.TimestampR\007endTime\022Z\n\016flag_summ" +
      "aries\030\003 \003(\01323.api.commons.audit.VanaFlag" +
      "SummaryEvent.FlagSummaryR\rflagSummaries\032" +
      "Q\n\013FlagSummary\022%\n\016transcript_sid\030\001 \001(\003R\r" +
      "transcriptSid\022\033\n\tflag_sids\030\002 \003(\003R\010flagSi" +
      "ds\"\211\002\n\031VanaPhraseCorrectionEvent\022<\n\014star" +
      "t_offset\030\001 \001(\0132\031.google.protobuf.Duratio" +
      "nR\013startOffset\0228\n\nend_offset\030\002 \001(\0132\031.goo" +
      "gle.protobuf.DurationR\tendOffset\022#\n\rorig" +
      "inal_text\030\003 \001(\tR\014originalText\022#\n\rpropose" +
      "d_text\030\004 \001(\tR\014proposedText\022\020\n\003url\030\005 \001(\tR" +
      "\003url\022\030\n\007channel\030\006 \001(\rR\007channelB\234\001\n#com.t" +
      "cn.cloud.api.api.commons.auditB\017VanaEven" +
      "tsProtoP\001\242\002\003ACA\252\002\021Api.Commons.Audit\312\002\021Ap" +
      "i\\Commons\\Audit\342\002\035Api\\Commons\\Audit\\GPBM" +
      "etadata\352\002\023Api::Commons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_audit_VanaFlagEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_VanaFlagEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_VanaFlagEvent_descriptor,
        new java.lang.String[] { "FlagName", "FlagSid", "Url", "NumTranscripts", "Priority", });
    internal_static_api_commons_audit_VanaFlagReviewEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_audit_VanaFlagReviewEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_VanaFlagReviewEvent_descriptor,
        new java.lang.String[] { "FlagName", "FlagSid", "Url", "NumTranscripts", "Priority", });
    internal_static_api_commons_audit_VanaBillingReportEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_audit_VanaBillingReportEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_VanaBillingReportEvent_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Url", });
    internal_static_api_commons_audit_VanaFlagSummaryEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_audit_VanaFlagSummaryEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_VanaFlagSummaryEvent_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "FlagSummaries", });
    internal_static_api_commons_audit_VanaFlagSummaryEvent_FlagSummary_descriptor =
      internal_static_api_commons_audit_VanaFlagSummaryEvent_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_audit_VanaFlagSummaryEvent_FlagSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_VanaFlagSummaryEvent_FlagSummary_descriptor,
        new java.lang.String[] { "TranscriptSid", "FlagSids", });
    internal_static_api_commons_audit_VanaPhraseCorrectionEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_audit_VanaPhraseCorrectionEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_VanaPhraseCorrectionEvent_descriptor,
        new java.lang.String[] { "StartOffset", "EndOffset", "OriginalText", "ProposedText", "Url", "Channel", });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
