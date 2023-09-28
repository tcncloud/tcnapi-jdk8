// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/service.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

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
    internal_static_api_v1alpha1_vanalytics_AuditRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_AuditRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_AuditResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_AuditResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_GetRecordingUrlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_GetRecordingUrlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_GetRecordingUrlResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_GetRecordingUrlResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_ListBillingSpanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_ListBillingSpanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_vanalytics_BillingSpan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_vanalytics_BillingSpan_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%api/v1alpha1/vanalytics/service.proto\022" +
      "\027api.v1alpha1.vanalytics\032\027annotations/au" +
      "thz.proto\032(api/v1alpha1/vanalytics/corre" +
      "ction.proto\032$api/v1alpha1/vanalytics/fil" +
      "ter.proto\032\"api/v1alpha1/vanalytics/flag." +
      "proto\032)api/v1alpha1/vanalytics/flag_filt" +
      "er.proto\032)api/v1alpha1/vanalytics/flag_r" +
      "eview.proto\032+api/v1alpha1/vanalytics/fla" +
      "g_snapshot.proto\032-api/v1alpha1/vanalytic" +
      "s/flag_transcript.proto\0324api/v1alpha1/va" +
      "nalytics/flag_transcript_filter.proto\032(a" +
      "pi/v1alpha1/vanalytics/transcript.proto\032" +
      "\034google/api/annotations.proto\032\037google/pr" +
      "otobuf/timestamp.proto\"r\n\014AuditRequest\0220" +
      "\n\005since\030\002 \001(\0132\032.google.protobuf.Timestam" +
      "pR\005since\0220\n\005until\030\003 \001(\0132\032.google.protobu" +
      "f.TimestampR\005until\"\304\001\n\rAuditResponse\022\035\n\n" +
      "audio_time\030\001 \001(\001R\taudioTime\022*\n\021billed_au" +
      "dio_time\030\002 \001(\001R\017billedAudioTime\0229\n\nlast_" +
      "usage\030\003 \001(\0132\032.google.protobuf.TimestampR" +
      "\tlastUsage\022-\n\022billed_transcripts\030\004 \001(\003R\021" +
      "billedTranscripts\"S\n\026GetRecordingUrlRequ" +
      "est\022%\n\016transcript_sid\030\002 \001(\003R\rtranscriptS" +
      "id\022\022\n\004kind\030\004 \001(\tR\004kind\"+\n\027GetRecordingUr" +
      "lResponse\022\020\n\003url\030\001 \001(\tR\003url\"T\n\026ListBilli" +
      "ngSpanRequest\022\033\n\tpage_size\030\001 \001(\rR\010pageSi" +
      "ze\022\035\n\npage_token\030\002 \001(\tR\tpageToken\"}\n\027Lis" +
      "tBillingSpanResponse\022&\n\017next_page_token\030" +
      "\001 \001(\tR\rnextPageToken\022:\n\005spans\030\002 \003(\0132$.ap" +
      "i.v1alpha1.vanalytics.BillingSpanR\005spans" +
      "\"\277\001\n\013BillingSpan\022\024\n\005calls\030\001 \001(\003R\005calls\022\024" +
      "\n\005hours\030\002 \001(\003R\005hours\022\022\n\004cost\030\003 \001(\001R\004cost" +
      "\0229\n\nstart_time\030\004 \001(\0132\032.google.protobuf.T" +
      "imestampR\tstartTime\0225\n\010end_time\030\005 \001(\0132\032." +
      "google.protobuf.TimestampR\007endTime2\353*\n\nV" +
      "analytics\022\226\001\n\005Audit\022%.api.v1alpha1.vanal" +
      "ytics.AuditRequest\032&.api.v1alpha1.vanaly" +
      "tics.AuditResponse\">\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002.\")/a" +
      "pi/v1alpha1/vanalytics/vanalytics/audit:" +
      "\001*\022\276\001\n\017GetRecordingUrl\022/.api.v1alpha1.va" +
      "nalytics.GetRecordingUrlRequest\0320.api.v1" +
      "alpha1.vanalytics.GetRecordingUrlRespons" +
      "e\"H\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0028\"3/api/v1alpha1/vanal" +
      "ytics/vanalytics/getrecordingurl:\001*\022\276\001\n\017" +
      "ListBillingSpan\022/.api.v1alpha1.vanalytic" +
      "s.ListBillingSpanRequest\0320.api.v1alpha1." +
      "vanalytics.ListBillingSpanResponse\"H\272\270\221\002" +
      "\005\n\003\010\364\003\202\323\344\223\0028\"3/api/v1alpha1/vanalytics/v" +
      "analytics/listbillingspan:\001*\022\232\001\n\006Search\022" +
      "&.api.v1alpha1.vanalytics.SearchRequest\032" +
      "\'.api.v1alpha1.vanalytics.SearchResponse" +
      "\"?\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002/\"*/api/v1alpha1/vanaly" +
      "tics/vanalytics/search:\001*\022\342\001\n\030ListTransc" +
      "riptGroupNames\0228.api.v1alpha1.vanalytics" +
      ".ListTranscriptGroupNamesRequest\0329.api.v" +
      "1alpha1.vanalytics.ListTranscriptGroupNa" +
      "mesResponse\"Q\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002A\"</api/v1al" +
      "pha1/vanalytics/vanalytics/listtranscrip" +
      "tgroupnames:\001*\022\326\001\n\025BulkDeleteTranscripts" +
      "\0225.api.v1alpha1.vanalytics.BulkDeleteTra" +
      "nscriptsRequest\0326.api.v1alpha1.vanalytic" +
      "s.BulkDeleteTranscriptsResponse\"N\272\270\221\002\005\n\003" +
      "\010\372\003\202\323\344\223\002>\"9/api/v1alpha1/vanalytics/vana" +
      "lytics/bulkdeletetranscripts:\001*\022\332\001\n\026Bulk" +
      "RestoreTranscripts\0226.api.v1alpha1.vanaly" +
      "tics.BulkRestoreTranscriptsRequest\0327.api" +
      ".v1alpha1.vanalytics.BulkRestoreTranscri" +
      "ptsResponse\"O\272\270\221\002\005\n\003\010\372\003\202\323\344\223\002?\":/api/v1al" +
      "pha1/vanalytics/vanalytics/bulkrestoretr" +
      "anscripts:\001*\022\336\001\n\027ListAgentResponseValues" +
      "\0227.api.v1alpha1.vanalytics.ListAgentResp" +
      "onseValuesRequest\0328.api.v1alpha1.vanalyt" +
      "ics.ListAgentResponseValuesResponse\"P\272\270\221" +
      "\002\005\n\003\010\364\003\202\323\344\223\002@\";/api/v1alpha1/vanalytics/" +
      "vanalytics/listagentresponsevalues:\001*\022\244\001" +
      "\n\014CreateFilter\022,.api.v1alpha1.vanalytics" +
      ".CreateFilterRequest\032\037.api.v1alpha1.vana" +
      "lytics.Filter\"E\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0025\"0/api/v1" +
      "alpha1/vanalytics/vanalytics/createfilte" +
      "r:\001*\022\256\001\n\013ListFilters\022+.api.v1alpha1.vana" +
      "lytics.ListFiltersRequest\032,.api.v1alpha1" +
      ".vanalytics.ListFiltersResponse\"D\272\270\221\002\005\n\003" +
      "\010\364\003\202\323\344\223\0024\"//api/v1alpha1/vanalytics/vana" +
      "lytics/listfilters:\001*\022\244\001\n\014UpdateFilter\022," +
      ".api.v1alpha1.vanalytics.UpdateFilterReq" +
      "uest\032\037.api.v1alpha1.vanalytics.Filter\"E\272" +
      "\270\221\002\005\n\003\010\364\003\202\323\344\223\0025\"0/api/v1alpha1/vanalytic" +
      "s/vanalytics/updatefilter:\001*\022\262\001\n\014DeleteF" +
      "ilter\022,.api.v1alpha1.vanalytics.DeleteFi" +
      "lterRequest\032-.api.v1alpha1.vanalytics.De" +
      "leteFilterResponse\"E\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0025\"0/a" +
      "pi/v1alpha1/vanalytics/vanalytics/delete" +
      "filter:\001*\022\233\001\n\tGetFilter\022).api.v1alpha1.v" +
      "analytics.GetFilterRequest\032\037.api.v1alpha" +
      "1.vanalytics.Filter\"B\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0022\"-/" +
      "api/v1alpha1/vanalytics/vanalytics/getfi" +
      "lter:\001*\022\223\001\n\007GetFlag\022\'.api.v1alpha1.vanal" +
      "ytics.GetFlagRequest\032\035.api.v1alpha1.vana" +
      "lytics.Flag\"@\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0020\"+/api/v1al" +
      "pha1/vanalytics/vanalytics/getflag:\001*\022\234\001" +
      "\n\nCreateFlag\022*.api.v1alpha1.vanalytics.C" +
      "reateFlagRequest\032\035.api.v1alpha1.vanalyti" +
      "cs.Flag\"C\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0023\"./api/v1alpha1" +
      "/vanalytics/vanalytics/createflag:\001*\022\246\001\n" +
      "\tListFlags\022).api.v1alpha1.vanalytics.Lis" +
      "tFlagsRequest\032*.api.v1alpha1.vanalytics." +
      "ListFlagsResponse\"B\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0022\"-/ap" +
      "i/v1alpha1/vanalytics/vanalytics/listfla" +
      "gs:\001*\022\234\001\n\nUpdateFlag\022*.api.v1alpha1.vana" +
      "lytics.UpdateFlagRequest\032\035.api.v1alpha1." +
      "vanalytics.Flag\"C\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0023\"./api/" +
      "v1alpha1/vanalytics/vanalytics/updatefla" +
      "g:\001*\022\252\001\n\nDeleteFlag\022*.api.v1alpha1.vanal" +
      "ytics.DeleteFlagRequest\032+.api.v1alpha1.v" +
      "analytics.DeleteFlagResponse\"C\272\270\221\002\005\n\003\010\364\003" +
      "\202\323\344\223\0023\"./api/v1alpha1/vanalytics/vanalyt" +
      "ics/deleteflag:\001*\022\264\001\n\020CreateFlagReview\0220" +
      ".api.v1alpha1.vanalytics.CreateFlagRevie" +
      "wRequest\032#.api.v1alpha1.vanalytics.FlagR" +
      "eview\"I\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0029\"4/api/v1alpha1/v" +
      "analytics/vanalytics/createflagreview:\001*" +
      "\022\322\001\n\024BulkCreateFlagReview\0224.api.v1alpha1" +
      ".vanalytics.BulkCreateFlagReviewRequest\032" +
      "5.api.v1alpha1.vanalytics.BulkCreateFlag" +
      "ReviewResponse\"M\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002=\"8/api/v" +
      "1alpha1/vanalytics/vanalytics/bulkcreate" +
      "flagreview:\001*\022\276\001\n\017ListFlagReviews\022/.api." +
      "v1alpha1.vanalytics.ListFlagReviewsReque" +
      "st\0320.api.v1alpha1.vanalytics.ListFlagRev" +
      "iewsResponse\"H\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0028\"3/api/v1a" +
      "lpha1/vanalytics/vanalytics/listflagrevi" +
      "ews:\001*\022\322\001\n\024CreateFlagTranscript\0224.api.v1" +
      "alpha1.vanalytics.CreateFlagTranscriptRe" +
      "quest\0325.api.v1alpha1.vanalytics.CreateFl" +
      "agTranscriptResponse\"M\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002=\"8" +
      "/api/v1alpha1/vanalytics/vanalytics/crea" +
      "teflagtranscript:\001*\022\326\001\n\025SearchFlagTransc" +
      "ripts\0225.api.v1alpha1.vanalytics.SearchFl" +
      "agTranscriptsRequest\0326.api.v1alpha1.vana" +
      "lytics.SearchFlagTranscriptsResponse\"N\272\270" +
      "\221\002\005\n\003\010\364\003\202\323\344\223\002>\"9/api/v1alpha1/vanalytics" +
      "/vanalytics/searchflagtranscripts:\001*\022\264\001\n" +
      "\020CreateFlagFilter\0220.api.v1alpha1.vanalyt" +
      "ics.CreateFlagFilterRequest\032#.api.v1alph" +
      "a1.vanalytics.FlagFilter\"I\272\270\221\002\005\n\003\010\364\003\202\323\344\223" +
      "\0029\"4/api/v1alpha1/vanalytics/vanalytics/" +
      "createflagfilter:\001*\022\276\001\n\017ListFlagFilters\022" +
      "/.api.v1alpha1.vanalytics.ListFlagFilter" +
      "sRequest\0320.api.v1alpha1.vanalytics.ListF" +
      "lagFiltersResponse\"H\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0028\"3/a" +
      "pi/v1alpha1/vanalytics/vanalytics/listfl" +
      "agfilters:\001*\022\302\001\n\020DeleteFlagFilter\0220.api." +
      "v1alpha1.vanalytics.DeleteFlagFilterRequ" +
      "est\0321.api.v1alpha1.vanalytics.DeleteFlag" +
      "FilterResponse\"I\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0029\"4/api/v" +
      "1alpha1/vanalytics/vanalytics/deleteflag" +
      "filter:\001*\022\306\001\n\021ListFlagSnapshots\0221.api.v1" +
      "alpha1.vanalytics.ListFlagSnapshotsReque" +
      "st\0322.api.v1alpha1.vanalytics.ListFlagSna" +
      "pshotsResponse\"J\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002:\"5/api/v" +
      "1alpha1/vanalytics/vanalytics/listflagSn" +
      "apshots:\001*\022\346\001\n\031ListFlagTranscriptFilters" +
      "\0229.api.v1alpha1.vanalytics.ListFlagTrans" +
      "criptFiltersRequest\032:.api.v1alpha1.vanal" +
      "ytics.ListFlagTranscriptFiltersResponse\"" +
      "R\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002B\"=/api/v1alpha1/vanalyt" +
      "ics/vanalytics/listflagtranscriptfilters" +
      ":\001*\022\302\001\n\020CreateCorrection\0220.api.v1alpha1." +
      "vanalytics.CreateCorrectionRequest\0321.api" +
      ".v1alpha1.vanalytics.CreateCorrectionRes" +
      "ponse\"I\272\270\221\002\005\n\003\010\364\003\202\323\344\223\0029\"4/api/v1alpha1/v" +
      "analytics/vanalytics/createcorrection:\001*" +
      "B\267\001\n)com.tcn.cloud.api.api.v1alpha1.vana" +
      "lyticsB\014ServiceProtoP\001\242\002\003AVV\252\002\027Api.V1alp" +
      "ha1.Vanalytics\312\002\027Api\\V1alpha1\\Vanalytics" +
      "\342\002#Api\\V1alpha1\\Vanalytics\\GPBMetadata\352\002" +
      "\031Api::V1alpha1::Vanalyticsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.CorrectionProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReviewProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshotProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_vanalytics_AuditRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_vanalytics_AuditRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_AuditRequest_descriptor,
        new java.lang.String[] { "Since", "Until", });
    internal_static_api_v1alpha1_vanalytics_AuditResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_vanalytics_AuditResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_AuditResponse_descriptor,
        new java.lang.String[] { "AudioTime", "BilledAudioTime", "LastUsage", "BilledTranscripts", });
    internal_static_api_v1alpha1_vanalytics_GetRecordingUrlRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_vanalytics_GetRecordingUrlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_GetRecordingUrlRequest_descriptor,
        new java.lang.String[] { "TranscriptSid", "Kind", });
    internal_static_api_v1alpha1_vanalytics_GetRecordingUrlResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_vanalytics_GetRecordingUrlResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_GetRecordingUrlResponse_descriptor,
        new java.lang.String[] { "Url", });
    internal_static_api_v1alpha1_vanalytics_ListBillingSpanRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_vanalytics_ListBillingSpanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_ListBillingSpanRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_ListBillingSpanResponse_descriptor,
        new java.lang.String[] { "NextPageToken", "Spans", });
    internal_static_api_v1alpha1_vanalytics_BillingSpan_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_vanalytics_BillingSpan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_vanalytics_BillingSpan_descriptor,
        new java.lang.String[] { "Calls", "Hours", "Cost", "StartTime", "EndTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.CorrectionProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.FilterProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilterProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReviewProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagSnapshotProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagTranscriptFilterProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
