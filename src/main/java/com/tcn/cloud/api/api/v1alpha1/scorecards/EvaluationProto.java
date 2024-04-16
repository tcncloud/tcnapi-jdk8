// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/evaluation.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public final class EvaluationProto {
  private EvaluationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_CreateEvaluationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_CreateEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_CreateEvaluationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_CreateEvaluationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_UpdateEvaluationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_UpdateEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_UpdateEvaluationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_UpdateEvaluationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteEvaluationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_GetEvaluationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_GetEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ScoreEvaluationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ScoreEvaluationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ScoreEvaluationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ScoreEvaluationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListEvaluationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListEvaluationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListEvaluationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListEvaluationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListEvaluationsByOrgIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListEvaluationsByOrgIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationByOrgIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteEvaluationByOrgIdRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(api/v1alpha1/scorecards/evaluation.pro" +
      "to\022\027api.v1alpha1.scorecards\032\034api/commons" +
      "/scorecards.proto\032 google/protobuf/field" +
      "_mask.proto\"R\n\027CreateEvaluationRequest\0227" +
      "\n\nevaluation\030\001 \001(\0132\027.api.commons.Evaluat" +
      "ionR\nevaluation\"S\n\030CreateEvaluationRespo" +
      "nse\0227\n\nevaluation\030\001 \001(\0132\027.api.commons.Ev" +
      "aluationR\nevaluation\"\217\001\n\027UpdateEvaluatio" +
      "nRequest\0227\n\nevaluation\030\001 \001(\0132\027.api.commo" +
      "ns.EvaluationR\nevaluation\022;\n\013update_mask" +
      "\030\002 \001(\0132\032.google.protobuf.FieldMaskR\nupda" +
      "teMask\"S\n\030UpdateEvaluationResponse\0227\n\nev" +
      "aluation\030\001 \001(\0132\027.api.commons.EvaluationR" +
      "\nevaluation\">\n\027DeleteEvaluationRequest\022#" +
      "\n\revaluation_id\030\002 \001(\003R\014evaluationId\"S\n\030D" +
      "eleteEvaluationResponse\0227\n\nevaluation\030\001 " +
      "\001(\0132\027.api.commons.EvaluationR\nevaluation" +
      "\";\n\024GetEvaluationRequest\022#\n\revaluation_i" +
      "d\030\002 \001(\003R\014evaluationId\"P\n\025GetEvaluationRe" +
      "sponse\0227\n\nevaluation\030\001 \001(\0132\027.api.commons" +
      ".EvaluationR\nevaluation\"=\n\026ScoreEvaluati" +
      "onRequest\022#\n\revaluation_id\030\003 \001(\003R\014evalua" +
      "tionId\"R\n\027ScoreEvaluationResponse\0227\n\neva" +
      "luation\030\001 \001(\0132\027.api.commons.EvaluationR\n" +
      "evaluation\"\240\002\n\026ListEvaluationsRequest\022\033\n" +
      "\tscorer_id\030\002 \003(\tR\010scorerId\022:\n\014completed_" +
      "at\030\003 \001(\0132\027.api.commons.TimeFilterR\013compl" +
      "etedAt\022!\n\014category_ids\030\004 \003(\003R\013categoryId" +
      "s\022$\n\016agent_user_ids\030\005 \003(\tR\014agentUserIds\022" +
      "#\n\rscorecard_ids\030\006 \003(\003R\014scorecardIds\022?\n\r" +
      "return_fields\030\n \001(\0132\032.google.protobuf.Fi" +
      "eldMaskR\014returnFields\"T\n\027ListEvaluations" +
      "Response\0229\n\013evaluations\030\001 \003(\0132\027.api.comm" +
      "ons.EvaluationR\013evaluations\"\216\001\n\035PreviewE" +
      "valuationScoreRequest\0227\n\nevaluation\030\002 \001(" +
      "\0132\027.api.commons.EvaluationR\nevaluation\0224" +
      "\n\tscorecard\030\003 \001(\0132\026.api.commons.Scorecar" +
      "dR\tscorecard\"Y\n\036PreviewEvaluationScoreRe" +
      "sponse\0227\n\nevaluation\030\001 \001(\0132\027.api.commons" +
      ".EvaluationR\nevaluation\"\276\002\n\035ListEvaluati" +
      "onsByOrgIdRequest\022\025\n\006org_id\030\001 \001(\tR\005orgId" +
      "\022\033\n\tscorer_id\030\002 \003(\tR\010scorerId\022:\n\014complet" +
      "ed_at\030\003 \001(\0132\027.api.commons.TimeFilterR\013co" +
      "mpletedAt\022!\n\014category_ids\030\004 \003(\003R\013categor" +
      "yIds\022$\n\016agent_user_ids\030\005 \003(\tR\014agentUserI" +
      "ds\022#\n\rscorecard_ids\030\006 \003(\003R\014scorecardIds\022" +
      "?\n\rreturn_fields\030\n \001(\0132\032.google.protobuf" +
      ".FieldMaskR\014returnFields\"\\\n\036DeleteEvalua" +
      "tionByOrgIdRequest\022\025\n\006org_id\030\001 \001(\tR\005orgI" +
      "d\022#\n\revaluation_id\030\002 \001(\003R\014evaluationIdB\272" +
      "\001\n)com.tcn.cloud.api.api.v1alpha1.scorec" +
      "ardsB\017EvaluationProtoP\001\242\002\003AVS\252\002\027Api.V1al" +
      "pha1.Scorecards\312\002\027Api\\V1alpha1\\Scorecard" +
      "s\342\002#Api\\V1alpha1\\Scorecards\\GPBMetadata\352" +
      "\002\031Api::V1alpha1::Scorecardsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_scorecards_CreateEvaluationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_scorecards_CreateEvaluationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_CreateEvaluationRequest_descriptor,
        new java.lang.String[] { "Evaluation", });
    internal_static_api_v1alpha1_scorecards_CreateEvaluationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_scorecards_CreateEvaluationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_CreateEvaluationResponse_descriptor,
        new java.lang.String[] { "Evaluation", });
    internal_static_api_v1alpha1_scorecards_UpdateEvaluationRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_scorecards_UpdateEvaluationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_UpdateEvaluationRequest_descriptor,
        new java.lang.String[] { "Evaluation", "UpdateMask", });
    internal_static_api_v1alpha1_scorecards_UpdateEvaluationResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_scorecards_UpdateEvaluationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_UpdateEvaluationResponse_descriptor,
        new java.lang.String[] { "Evaluation", });
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteEvaluationRequest_descriptor,
        new java.lang.String[] { "EvaluationId", });
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteEvaluationResponse_descriptor,
        new java.lang.String[] { "Evaluation", });
    internal_static_api_v1alpha1_scorecards_GetEvaluationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_scorecards_GetEvaluationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_GetEvaluationRequest_descriptor,
        new java.lang.String[] { "EvaluationId", });
    internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_GetEvaluationResponse_descriptor,
        new java.lang.String[] { "Evaluation", });
    internal_static_api_v1alpha1_scorecards_ScoreEvaluationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_scorecards_ScoreEvaluationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ScoreEvaluationRequest_descriptor,
        new java.lang.String[] { "EvaluationId", });
    internal_static_api_v1alpha1_scorecards_ScoreEvaluationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_scorecards_ScoreEvaluationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ScoreEvaluationResponse_descriptor,
        new java.lang.String[] { "Evaluation", });
    internal_static_api_v1alpha1_scorecards_ListEvaluationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_scorecards_ListEvaluationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListEvaluationsRequest_descriptor,
        new java.lang.String[] { "ScorerId", "CompletedAt", "CategoryIds", "AgentUserIds", "ScorecardIds", "ReturnFields", });
    internal_static_api_v1alpha1_scorecards_ListEvaluationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_scorecards_ListEvaluationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListEvaluationsResponse_descriptor,
        new java.lang.String[] { "Evaluations", });
    internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreRequest_descriptor,
        new java.lang.String[] { "Evaluation", "Scorecard", });
    internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_PreviewEvaluationScoreResponse_descriptor,
        new java.lang.String[] { "Evaluation", });
    internal_static_api_v1alpha1_scorecards_ListEvaluationsByOrgIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_v1alpha1_scorecards_ListEvaluationsByOrgIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListEvaluationsByOrgIdRequest_descriptor,
        new java.lang.String[] { "OrgId", "ScorerId", "CompletedAt", "CategoryIds", "AgentUserIds", "ScorecardIds", "ReturnFields", });
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationByOrgIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_api_v1alpha1_scorecards_DeleteEvaluationByOrgIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteEvaluationByOrgIdRequest_descriptor,
        new java.lang.String[] { "OrgId", "EvaluationId", });
    com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
