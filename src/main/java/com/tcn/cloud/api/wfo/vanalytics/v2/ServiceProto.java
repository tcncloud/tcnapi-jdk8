// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/service.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_AuditRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_AuditRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_AuditResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_AuditResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_GetRecordingUrlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_GetRecordingUrlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_GetRecordingUrlResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_GetRecordingUrlResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_ListBillingSpanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_ListBillingSpanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_ListBillingSpanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_ListBillingSpanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_BillingSpan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_BillingSpan_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037wfo/vanalytics/v2/service.proto\022\021wfo.v" +
      "analytics.v2\032\027annotations/authz.proto\032\034g" +
      "oogle/api/annotations.proto\032\037google/prot" +
      "obuf/timestamp.proto\032\"wfo/vanalytics/v2/" +
      "correction.proto\032\036wfo/vanalytics/v2/filt" +
      "er.proto\032\034wfo/vanalytics/v2/flag.proto\032#" +
      "wfo/vanalytics/v2/flag_filter.proto\032#wfo" +
      "/vanalytics/v2/flag_review.proto\032%wfo/va" +
      "nalytics/v2/flag_snapshot.proto\032\'wfo/van" +
      "alytics/v2/flag_transcript.proto\032.wfo/va" +
      "nalytics/v2/flag_transcript_filter.proto" +
      "\032\"wfo/vanalytics/v2/transcript.proto\032*wf" +
      "o/vanalytics/v2/transcript_summary.proto" +
      "\"r\n\014AuditRequest\0220\n\005since\030\002 \001(\0132\032.google" +
      ".protobuf.TimestampR\005since\0220\n\005until\030\003 \001(" +
      "\0132\032.google.protobuf.TimestampR\005until\"\304\001\n" +
      "\rAuditResponse\022\035\n\naudio_time\030\001 \001(\001R\taudi" +
      "oTime\022*\n\021billed_audio_time\030\002 \001(\001R\017billed" +
      "AudioTime\0229\n\nlast_usage\030\003 \001(\0132\032.google.p" +
      "rotobuf.TimestampR\tlastUsage\022-\n\022billed_t" +
      "ranscripts\030\004 \001(\003R\021billedTranscripts\"S\n\026G" +
      "etRecordingUrlRequest\022%\n\016transcript_sid\030" +
      "\002 \001(\003R\rtranscriptSid\022\022\n\004kind\030\004 \001(\tR\004kind" +
      "\"+\n\027GetRecordingUrlResponse\022\020\n\003url\030\001 \001(\t" +
      "R\003url\"T\n\026ListBillingSpanRequest\022\033\n\tpage_" +
      "size\030\001 \001(\rR\010pageSize\022\035\n\npage_token\030\002 \001(\t" +
      "R\tpageToken\"w\n\027ListBillingSpanResponse\022&" +
      "\n\017next_page_token\030\001 \001(\tR\rnextPageToken\0224" +
      "\n\005spans\030\002 \003(\0132\036.wfo.vanalytics.v2.Billin" +
      "gSpanR\005spans\"\277\001\n\013BillingSpan\022\024\n\005calls\030\001 " +
      "\001(\003R\005calls\022\024\n\005hours\030\002 \001(\003R\005hours\022\022\n\004cost" +
      "\030\003 \001(\001R\004cost\0229\n\nstart_time\030\004 \001(\0132\032.googl" +
      "e.protobuf.TimestampR\tstartTime\0225\n\010end_t" +
      "ime\030\005 \001(\0132\032.google.protobuf.TimestampR\007e" +
      "ndTime2\243\'\n\nVanalytics\022\204\001\n\005Audit\022\037.wfo.va" +
      "nalytics.v2.AuditRequest\032 .wfo.vanalytic" +
      "s.v2.AuditResponse\"8\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002(\"#/w" +
      "fo/vanalytics/v2/vanalytics/audit:\001*\022\246\001\n" +
      "\017GetRecordingUrl\022).wfo.vanalytics.v2.Get" +
      "RecordingUrlRequest\032*.wfo.vanalytics.v2." +
      "GetRecordingUrlResponse\"<\272\270\221\002\n\n\003\010\364\003\n\003\010\324\002" +
      "\202\323\344\223\002\'\"\"/wfo/vanalytics/v2/getrecordingu" +
      "rl:\001*\022\241\001\n\017ListBillingSpan\022).wfo.vanalyti" +
      "cs.v2.ListBillingSpanRequest\032*.wfo.vanal" +
      "ytics.v2.ListBillingSpanResponse\"7\272\270\221\002\005\n" +
      "\003\010\364\003\202\323\344\223\002\'\"\"/wfo/vanalytics/v2/listbilli" +
      "ngspan:\001*\022\256\001\n\021SearchTranscripts\022+.wfo.va" +
      "nalytics.v2.SearchTranscriptsRequest\032,.w" +
      "fo.vanalytics.v2.SearchTranscriptsRespon" +
      "se\">\272\270\221\002\n\n\003\010\364\003\n\003\010\324\002\202\323\344\223\002)\"$/wfo/vanalyti" +
      "cs/v2/searchtranscripts:\001*\022\271\001\n\025BulkDelet" +
      "eTranscripts\022/.wfo.vanalytics.v2.BulkDel" +
      "eteTranscriptsRequest\0320.wfo.vanalytics.v" +
      "2.BulkDeleteTranscriptsResponse\"=\272\270\221\002\005\n\003" +
      "\010\372\003\202\323\344\223\002-\"(/wfo/vanalytics/v2/bulkdelete" +
      "transcripts:\001*\022\275\001\n\026BulkRestoreTranscript" +
      "s\0220.wfo.vanalytics.v2.BulkRestoreTranscr" +
      "iptsRequest\0321.wfo.vanalytics.v2.BulkRest" +
      "oreTranscriptsResponse\">\272\270\221\002\005\n\003\010\372\003\202\323\344\223\002." +
      "\")/wfo/vanalytics/v2/bulkrestoretranscri" +
      "pts:\001*\022\305\001\n\030ListTranscriptGroupNames\0222.wf" +
      "o.vanalytics.v2.ListTranscriptGroupNames" +
      "Request\0323.wfo.vanalytics.v2.ListTranscri" +
      "ptGroupNamesResponse\"@\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0020\"+" +
      "/wfo/vanalytics/v2/listtranscriptgroupna" +
      "mes:\001*\022\301\001\n\027ListAgentResponseValues\0221.wfo" +
      ".vanalytics.v2.ListAgentResponseValuesRe" +
      "quest\0322.wfo.vanalytics.v2.ListAgentRespo" +
      "nseValuesResponse\"?\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002/\"*/wf" +
      "o/vanalytics/v2/listagentresponsevalues:" +
      "\001*\022\265\001\n\024GetTranscriptSummary\022..wfo.vanaly" +
      "tics.v2.GetTranscriptSummaryRequest\032/.wf" +
      "o.vanalytics.v2.GetTranscriptSummaryResp" +
      "onse\"<\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002,\"\'/wfo/vanalytics/" +
      "v2/gettranscriptsummary:\001*\022\207\001\n\014CreateFil" +
      "ter\022&.wfo.vanalytics.v2.CreateFilterRequ" +
      "est\032\031.wfo.vanalytics.v2.Filter\"4\272\270\221\002\005\n\003\010" +
      "\364\003\202\323\344\223\002$\"\037/wfo/vanalytics/v2/createfilte" +
      "r:\001*\022\226\001\n\013ListFilters\022%.wfo.vanalytics.v2" +
      ".ListFiltersRequest\032&.wfo.vanalytics.v2." +
      "ListFiltersResponse\"8\272\270\221\002\n\n\003\010\364\003\n\003\010\302\014\202\323\344\223" +
      "\002#\"\036/wfo/vanalytics/v2/listfilters:\001*\022\207\001" +
      "\n\014UpdateFilter\022&.wfo.vanalytics.v2.Updat" +
      "eFilterRequest\032\031.wfo.vanalytics.v2.Filte" +
      "r\"4\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002$\"\037/wfo/vanalytics/v2/" +
      "updatefilter:\001*\022\225\001\n\014DeleteFilter\022&.wfo.v" +
      "analytics.v2.DeleteFilterRequest\032\'.wfo.v" +
      "analytics.v2.DeleteFilterResponse\"4\272\270\221\002\005" +
      "\n\003\010\364\003\202\323\344\223\002$\"\037/wfo/vanalytics/v2/deletefi" +
      "lter:\001*\022~\n\tGetFilter\022#.wfo.vanalytics.v2" +
      ".GetFilterRequest\032\031.wfo.vanalytics.v2.Fi" +
      "lter\"1\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002!\"\034/wfo/vanalytics/" +
      "v2/getfilter:\001*\022\311\001\n\031ListFlagTranscriptFi" +
      "lters\0223.wfo.vanalytics.v2.ListFlagTransc" +
      "riptFiltersRequest\0324.wfo.vanalytics.v2.L" +
      "istFlagTranscriptFiltersResponse\"A\272\270\221\002\005\n" +
      "\003\010\364\003\202\323\344\223\0021\",/wfo/vanalytics/v2/listflagt" +
      "ranscriptfilters:\001*\022\241\001\n\017ListFlagFilters\022" +
      ").wfo.vanalytics.v2.ListFlagFiltersReque" +
      "st\032*.wfo.vanalytics.v2.ListFlagFiltersRe" +
      "sponse\"7\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002\'\"\"/wfo/vanalytic" +
      "s/v2/listflagfilters:\001*\022v\n\007GetFlag\022!.wfo" +
      ".vanalytics.v2.GetFlagRequest\032\027.wfo.vana" +
      "lytics.v2.Flag\"/\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002\037\"\032/wfo/v" +
      "analytics/v2/getflag:\001*\022\177\n\nCreateFlag\022$." +
      "wfo.vanalytics.v2.CreateFlagRequest\032\027.wf" +
      "o.vanalytics.v2.Flag\"2\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002\"\"\035" +
      "/wfo/vanalytics/v2/createflag:\001*\022\211\001\n\tLis" +
      "tFlags\022#.wfo.vanalytics.v2.ListFlagsRequ" +
      "est\032$.wfo.vanalytics.v2.ListFlagsRespons" +
      "e\"1\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002!\"\034/wfo/vanalytics/v2/" +
      "listflags:\001*\022\177\n\nUpdateFlag\022$.wfo.vanalyt" +
      "ics.v2.UpdateFlagRequest\032\027.wfo.vanalytic" +
      "s.v2.Flag\"2\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002\"\"\035/wfo/vanaly" +
      "tics/v2/updateflag:\001*\022\215\001\n\nDeleteFlag\022$.w" +
      "fo.vanalytics.v2.DeleteFlagRequest\032%.wfo" +
      ".vanalytics.v2.DeleteFlagResponse\"2\272\270\221\002\005" +
      "\n\003\010\364\003\202\323\344\223\002\"\"\035/wfo/vanalytics/v2/deletefl" +
      "ag:\001*\022\227\001\n\020CreateFlagReview\022*.wfo.vanalyt" +
      "ics.v2.CreateFlagReviewRequest\032\035.wfo.van" +
      "alytics.v2.FlagReview\"8\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002(\"" +
      "#/wfo/vanalytics/v2/createflagreview:\001*\022" +
      "\265\001\n\024BulkCreateFlagReview\022..wfo.vanalytic" +
      "s.v2.BulkCreateFlagReviewRequest\032/.wfo.v" +
      "analytics.v2.BulkCreateFlagReviewRespons" +
      "e\"<\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002,\"\'/wfo/vanalytics/v2/" +
      "bulkcreateflagreview:\001*\022\241\001\n\017ListFlagRevi" +
      "ews\022).wfo.vanalytics.v2.ListFlagReviewsR" +
      "equest\032*.wfo.vanalytics.v2.ListFlagRevie" +
      "wsResponse\"7\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002\'\"\"/wfo/vanal" +
      "ytics/v2/listflagreviews:\001*\022\265\001\n\024CreateFl" +
      "agTranscript\022..wfo.vanalytics.v2.CreateF" +
      "lagTranscriptRequest\032/.wfo.vanalytics.v2" +
      ".CreateFlagTranscriptResponse\"<\272\270\221\002\005\n\003\010\364" +
      "\003\202\323\344\223\002,\"\'/wfo/vanalytics/v2/createflagtr" +
      "anscript:\001*\022\251\001\n\021ListFlagSnapshots\022+.wfo." +
      "vanalytics.v2.ListFlagSnapshotsRequest\032," +
      ".wfo.vanalytics.v2.ListFlagSnapshotsResp" +
      "onse\"9\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002)\"$/wfo/vanalytics/" +
      "v2/listflagsnapshots:\001*\022\245\001\n\020CreateCorrec" +
      "tion\022*.wfo.vanalytics.v2.CreateCorrectio" +
      "nRequest\032+.wfo.vanalytics.v2.CreateCorre" +
      "ctionResponse\"8\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002(\"#/wfo/va" +
      "nalytics/v2/createcorrection:\001*\022\216\001\n\rGetC" +
      "orrection\022\'.wfo.vanalytics.v2.GetCorrect" +
      "ionRequest\032\035.wfo.vanalytics.v2.Correctio" +
      "n\"5\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002%\" /wfo/vanalytics/v2/" +
      "getcorrection:\001*\022\245\001\n\020DeleteCorrection\022*." +
      "wfo.vanalytics.v2.DeleteCorrectionReques" +
      "t\032+.wfo.vanalytics.v2.DeleteCorrectionRe" +
      "sponse\"8\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002(\"#/wfo/vanalytic" +
      "s/v2/deletecorrection:\001*\022\241\001\n\017ListCorrect" +
      "ions\022).wfo.vanalytics.v2.ListCorrections" +
      "Request\032*.wfo.vanalytics.v2.ListCorrecti" +
      "onsResponse\"7\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002\'\"\"/wfo/vana" +
      "lytics/v2/listcorrections:\001*\022\245\001\n\020UpdateC" +
      "orrection\022*.wfo.vanalytics.v2.UpdateCorr" +
      "ectionRequest\032+.wfo.vanalytics.v2.Update" +
      "CorrectionResponse\"8\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002(\"#/w" +
      "fo/vanalytics/v2/updatecorrection:\001*B\231\001\n" +
      "#com.tcn.cloud.api.wfo.vanalytics.v2B\014Se" +
      "rviceProtoP\001\242\002\003WVX\252\002\021Wfo.Vanalytics.V2\312\002" +
      "\021Wfo\\Vanalytics\\V2\342\002\035Wfo\\Vanalytics\\V2\\G" +
      "PBMetadata\352\002\023Wfo::Vanalytics::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.CorrectionProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FlagFilterProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FlagSnapshotProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptFilterProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.getDescriptor(),
        });
    internal_static_wfo_vanalytics_v2_AuditRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wfo_vanalytics_v2_AuditRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_AuditRequest_descriptor,
        new java.lang.String[] { "Since", "Until", });
    internal_static_wfo_vanalytics_v2_AuditResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wfo_vanalytics_v2_AuditResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_AuditResponse_descriptor,
        new java.lang.String[] { "AudioTime", "BilledAudioTime", "LastUsage", "BilledTranscripts", });
    internal_static_wfo_vanalytics_v2_GetRecordingUrlRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wfo_vanalytics_v2_GetRecordingUrlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_GetRecordingUrlRequest_descriptor,
        new java.lang.String[] { "TranscriptSid", "Kind", });
    internal_static_wfo_vanalytics_v2_GetRecordingUrlResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_wfo_vanalytics_v2_GetRecordingUrlResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_GetRecordingUrlResponse_descriptor,
        new java.lang.String[] { "Url", });
    internal_static_wfo_vanalytics_v2_ListBillingSpanRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_wfo_vanalytics_v2_ListBillingSpanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_ListBillingSpanRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_wfo_vanalytics_v2_ListBillingSpanResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_wfo_vanalytics_v2_ListBillingSpanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_ListBillingSpanResponse_descriptor,
        new java.lang.String[] { "NextPageToken", "Spans", });
    internal_static_wfo_vanalytics_v2_BillingSpan_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_wfo_vanalytics_v2_BillingSpan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_BillingSpan_descriptor,
        new java.lang.String[] { "Calls", "Hours", "Cost", "StartTime", "EndTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.CorrectionProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FlagFilterProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FlagReviewProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FlagSnapshotProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FlagTranscriptFilterProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptSummaryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
