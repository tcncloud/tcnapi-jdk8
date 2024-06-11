// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/auto_evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public final class AutoEvaluationProto {
  private AutoEvaluationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_GetAutoEvaluationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_GetAutoEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_GetAutoEvaluationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_GetAutoEvaluationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_CallSidFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_CallSidFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_CallSidFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_CallSidFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationByOrgIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationByOrgIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-api/v1alpha1/scorecards/auto_evaluatio" +
      "n.proto\022\027api.v1alpha1.scorecards\032\034api/co" +
      "mmons/scorecards.proto\"H\n\030GetAutoEvaluat" +
      "ionRequest\022,\n\022auto_evaluation_id\030\002 \001(\003R\020" +
      "autoEvaluationId\"a\n\031GetAutoEvaluationRes" +
      "ponse\022D\n\017auto_evaluation\030\001 \001(\0132\033.api.com" +
      "mons.AutoEvaluationR\016autoEvaluation\"\260\004\n\032" +
      "ListAutoEvaluationsRequest\022#\n\rscorecard_" +
      "ids\030\002 \003(\003R\014scorecardIds\022:\n\014completed_at\030" +
      "\003 \001(\0132\027.api.commons.TimeFilterR\013complete" +
      "dAt\022!\n\014category_ids\030\005 \003(\003R\013categoryIds\022\\" +
      "\n\010call_sid\030\006 \001(\0132A.api.v1alpha1.scorecar" +
      "ds.ListAutoEvaluationsRequest.CallSidFil" +
      "terR\007callSid\022$\n\016agent_user_ids\030\007 \003(\tR\014ag" +
      "entUserIds\022\033\n\tpage_size\030\010 \001(\005R\010pageSize\022" +
      "\031\n\010order_by\030\t \001(\tR\007orderBy\022\035\n\npage_token" +
      "\030\n \001(\tR\tpageToken\0227\n\013risk_levels\030\013 \003(\0162\026" +
      ".api.commons.RiskLevelR\nriskLevels\032z\n\rCa" +
      "llSidFilter\022\025\n\006any_of\030\001 \003(\003R\005anyOf\022\016\n\002eq" +
      "\030\002 \001(\003R\002eq\022\020\n\003gte\030\003 \001(\003R\003gte\022\020\n\003lte\030\004 \001(" +
      "\003R\003lte\022\016\n\002gt\030\005 \001(\003R\002gt\022\016\n\002lt\030\006 \001(\003R\002lt\"\215" +
      "\001\n\033ListAutoEvaluationsResponse\022F\n\020auto_e" +
      "valuations\030\001 \003(\0132\033.api.commons.AutoEvalu" +
      "ationR\017autoEvaluations\022&\n\017next_page_toke" +
      "n\030\002 \001(\tR\rnextPageToken\"K\n\033DeleteAutoEval" +
      "uationRequest\022,\n\022auto_evaluation_id\030\002 \001(" +
      "\003R\020autoEvaluationId\"d\n\034DeleteAutoEvaluat" +
      "ionResponse\022D\n\017auto_evaluation\030\001 \001(\0132\033.a" +
      "pi.commons.AutoEvaluationR\016autoEvaluatio" +
      "n\"\177\n\034StreamAutoEvaluationsRequest\022#\n\rsco" +
      "recard_ids\030\002 \003(\003R\014scorecardIds\022:\n\014comple" +
      "ted_at\030\003 \001(\0132\027.api.commons.TimeFilterR\013c" +
      "ompletedAt\"e\n\035StreamAutoEvaluationsRespo" +
      "nse\022D\n\017auto_evaluation\030\001 \001(\0132\033.api.commo" +
      "ns.AutoEvaluationR\016autoEvaluation\"\325\004\n!Li" +
      "stAutoEvaluationsByOrgIdRequest\022\025\n\006org_i" +
      "d\030\001 \001(\tR\005orgId\022#\n\rscorecard_ids\030\002 \003(\003R\014s" +
      "corecardIds\022:\n\014completed_at\030\003 \001(\0132\027.api." +
      "commons.TimeFilterR\013completedAt\022!\n\014categ" +
      "ory_ids\030\005 \003(\003R\013categoryIds\022c\n\010call_sid\030\006" +
      " \001(\0132H.api.v1alpha1.scorecards.ListAutoE" +
      "valuationsByOrgIdRequest.CallSidFilterR\007" +
      "callSid\022$\n\016agent_user_ids\030\007 \003(\tR\014agentUs" +
      "erIds\022\033\n\tpage_size\030\010 \001(\005R\010pageSize\022\031\n\010or" +
      "der_by\030\t \001(\tR\007orderBy\022\035\n\npage_token\030\n \001(" +
      "\tR\tpageToken\0227\n\013risk_levels\030\013 \003(\0162\026.api." +
      "commons.RiskLevelR\nriskLevels\032z\n\rCallSid" +
      "Filter\022\025\n\006any_of\030\001 \003(\003R\005anyOf\022\016\n\002eq\030\002 \001(" +
      "\003R\002eq\022\020\n\003gte\030\003 \001(\003R\003gte\022\020\n\003lte\030\004 \001(\003R\003lt" +
      "e\022\016\n\002gt\030\005 \001(\003R\002gt\022\016\n\002lt\030\006 \001(\003R\002lt\"i\n\"Del" +
      "eteAutoEvaluationByOrgIdRequest\022\025\n\006org_i" +
      "d\030\001 \001(\tR\005orgId\022,\n\022auto_evaluation_id\030\002 \001" +
      "(\003R\020autoEvaluationId\"i\n BulkDeleteAutoEv" +
      "aluationsRequest\022\025\n\006org_id\030\001 \001(\tR\005orgId\022" +
      ".\n\023auto_evaluation_ids\030\002 \003(\003R\021autoEvalua" +
      "tionIds\"#\n!BulkDeleteAutoEvaluationsResp" +
      "onseB\276\001\n)com.tcn.cloud.api.api.v1alpha1." +
      "scorecardsB\023AutoEvaluationProtoP\001\242\002\003AVS\252" +
      "\002\027Api.V1alpha1.Scorecards\312\002\027Api\\V1alpha1" +
      "\\Scorecards\342\002#Api\\V1alpha1\\Scorecards\\GP" +
      "BMetadata\352\002\031Api::V1alpha1::Scorecardsb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_scorecards_GetAutoEvaluationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_scorecards_GetAutoEvaluationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_GetAutoEvaluationRequest_descriptor,
        new java.lang.String[] { "AutoEvaluationId", });
    internal_static_api_v1alpha1_scorecards_GetAutoEvaluationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_scorecards_GetAutoEvaluationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_GetAutoEvaluationResponse_descriptor,
        new java.lang.String[] { "AutoEvaluation", });
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_descriptor,
        new java.lang.String[] { "ScorecardIds", "CompletedAt", "CategoryIds", "CallSid", "AgentUserIds", "PageSize", "OrderBy", "PageToken", "RiskLevels", });
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_CallSidFilter_descriptor =
      internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_CallSidFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsRequest_CallSidFilter_descriptor,
        new java.lang.String[] { "AnyOf", "Eq", "Gte", "Lte", "Gt", "Lt", });
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsResponse_descriptor,
        new java.lang.String[] { "AutoEvaluations", "NextPageToken", });
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationRequest_descriptor,
        new java.lang.String[] { "AutoEvaluationId", });
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationResponse_descriptor,
        new java.lang.String[] { "AutoEvaluation", });
    internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsRequest_descriptor,
        new java.lang.String[] { "ScorecardIds", "CompletedAt", });
    internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_StreamAutoEvaluationsResponse_descriptor,
        new java.lang.String[] { "AutoEvaluation", });
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_descriptor,
        new java.lang.String[] { "OrgId", "ScorecardIds", "CompletedAt", "CategoryIds", "CallSid", "AgentUserIds", "PageSize", "OrderBy", "PageToken", "RiskLevels", });
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_CallSidFilter_descriptor =
      internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_CallSidFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListAutoEvaluationsByOrgIdRequest_CallSidFilter_descriptor,
        new java.lang.String[] { "AnyOf", "Eq", "Gte", "Lte", "Gt", "Lt", });
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationByOrgIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationByOrgIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteAutoEvaluationByOrgIdRequest_descriptor,
        new java.lang.String[] { "OrgId", "AutoEvaluationId", });
    internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsRequest_descriptor,
        new java.lang.String[] { "OrgId", "AutoEvaluationIds", });
    internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_BulkDeleteAutoEvaluationsResponse_descriptor,
        new java.lang.String[] { });
    com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
