// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/support_service.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public final class SupportServiceProto {
  private SupportServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-api/v1alpha1/scorecards/support_servic" +
      "e.proto\022\027api.v1alpha1.scorecards\032\027annota" +
      "tions/authz.proto\032-api/v1alpha1/scorecar" +
      "ds/auto_evaluation.proto\032&api/v1alpha1/s" +
      "corecards/category.proto\032(api/v1alpha1/s" +
      "corecards/evaluation.proto\032\'api/v1alpha1" +
      "/scorecards/scorecard.proto\032\034google/api/" +
      "annotations.proto2\261\016\n\021ScorecardsSupport\022" +
      "\332\001\n\026ListEvaluationsByOrgId\0226.api.v1alpha" +
      "1.scorecards.ListEvaluationsByOrgIdReque" +
      "st\0320.api.v1alpha1.scorecards.ListEvaluat" +
      "ionsResponse\"V\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002F\"A/api/v1a" +
      "lpha1/scorecards/scorecardssupport/liste" +
      "valuationsbyorgid:\001*\022\352\001\n\032ListAutoEvaluat" +
      "ionsByOrgId\022:.api.v1alpha1.scorecards.Li" +
      "stAutoEvaluationsByOrgIdRequest\0324.api.v1" +
      "alpha1.scorecards.ListAutoEvaluationsRes" +
      "ponse\"Z\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002J\"E/api/v1alpha1/s" +
      "corecards/scorecardssupport/listautoeval" +
      "uationsbyorgid:\001*\022\335\001\n\025BulkDeleteEvaluati" +
      "ons\0225.api.v1alpha1.scorecards.BulkDelete" +
      "EvaluationsRequest\0326.api.v1alpha1.scorec" +
      "ards.BulkDeleteEvaluationsResponse\"U\272\270\221\002" +
      "\005\n\003\010\310\001\202\323\344\223\002E\"@/api/v1alpha1/scorecards/s" +
      "corecardssupport/bulkdeleteevaluations:\001" +
      "*\022\355\001\n\031BulkDeleteAutoEvaluations\0229.api.v1" +
      "alpha1.scorecards.BulkDeleteAutoEvaluati" +
      "onsRequest\032:.api.v1alpha1.scorecards.Bul" +
      "kDeleteAutoEvaluationsResponse\"Y\272\270\221\002\005\n\003\010" +
      "\310\001\202\323\344\223\002I\"D/api/v1alpha1/scorecards/score" +
      "cardssupport/bulkdeleteautoevaluations:\001" +
      "*\022\336\001\n\027DeleteEvaluationByOrgId\0227.api.v1al" +
      "pha1.scorecards.DeleteEvaluationByOrgIdR" +
      "equest\0321.api.v1alpha1.scorecards.DeleteE" +
      "valuationResponse\"W\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002G\"B/ap" +
      "i/v1alpha1/scorecards/scorecardssupport/" +
      "deleteevaluationbyorgid:\001*\022\356\001\n\033DeleteAut" +
      "oEvaluationByOrgId\022;.api.v1alpha1.scorec" +
      "ards.DeleteAutoEvaluationByOrgIdRequest\032" +
      "5.api.v1alpha1.scorecards.DeleteAutoEval" +
      "uationResponse\"[\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002K\"F/api/v" +
      "1alpha1/scorecards/scorecardssupport/del" +
      "eteautoevaluationbyorgid:\001*\022\326\001\n\025ListScor" +
      "ecardsByOrgId\0225.api.v1alpha1.scorecards." +
      "ListScorecardsByOrgIdRequest\032/.api.v1alp" +
      "ha1.scorecards.ListScorecardsResponse\"U\272" +
      "\270\221\002\005\n\003\010\310\001\202\323\344\223\002E\"@/api/v1alpha1/scorecard" +
      "s/scorecardssupport/listscorecardsbyorgi" +
      "d:\001*\022\326\001\n\025ListCategoriesByOrgId\0225.api.v1a" +
      "lpha1.scorecards.ListCategoriesByOrgIdRe" +
      "quest\032/.api.v1alpha1.scorecards.ListCate" +
      "goriesResponse\"U\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002E\"@/api/v" +
      "1alpha1/scorecards/scorecardssupport/lis" +
      "tcategoriesbyorgid:\001*B\276\001\n)com.tcn.cloud." +
      "api.api.v1alpha1.scorecardsB\023SupportServ" +
      "iceProtoP\001\242\002\003AVS\252\002\027Api.V1alpha1.Scorecar" +
      "ds\312\002\027Api\\V1alpha1\\Scorecards\342\002#Api\\V1alp" +
      "ha1\\Scorecards\\GPBMetadata\352\002\031Api::V1alph" +
      "a1::Scorecardsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
