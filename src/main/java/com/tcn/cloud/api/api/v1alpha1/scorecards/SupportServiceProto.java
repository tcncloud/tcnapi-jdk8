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
      "ds/auto_evaluation.proto\032(api/v1alpha1/s" +
      "corecards/evaluation.proto\032\'api/v1alpha1" +
      "/scorecards/scorecard.proto\032\034google/api/" +
      "annotations.proto2\215\t\n\021ScorecardsSupport\022" +
      "\333\001\n\026ListEvaluationsByOrgId\0226.api.v1alpha" +
      "1.scorecards.ListEvaluationsByOrgIdReque" +
      "st\0320.api.v1alpha1.scorecards.ListEvaluat" +
      "ionsResponse\"W\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002G\"B/api/v1a" +
      "lpha1/scorecards/scorecards_support/list" +
      "evaluationsbyorgid:\001*\022\353\001\n\032ListAutoEvalua" +
      "tionsByOrgId\022:.api.v1alpha1.scorecards.L" +
      "istAutoEvaluationsByOrgIdRequest\0324.api.v" +
      "1alpha1.scorecards.ListAutoEvaluationsRe" +
      "sponse\"[\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002K\"F/api/v1alpha1/" +
      "scorecards/scorecards_support/listautoev" +
      "aluationsbyorgid:\001*\022\337\001\n\027DeleteEvaluation" +
      "ByOrgId\0227.api.v1alpha1.scorecards.Delete" +
      "EvaluationByOrgIdRequest\0321.api.v1alpha1." +
      "scorecards.DeleteEvaluationResponse\"X\272\270\221" +
      "\002\005\n\003\010\310\001\202\323\344\223\002H\"C/api/v1alpha1/scorecards/" +
      "scorecards_support/deleteevaluationbyorg" +
      "id:\001*\022\357\001\n\033DeleteAutoEvaluationByOrgId\022;." +
      "api.v1alpha1.scorecards.DeleteAutoEvalua" +
      "tionByOrgIdRequest\0325.api.v1alpha1.scorec" +
      "ards.DeleteAutoEvaluationResponse\"\\\272\270\221\002\005" +
      "\n\003\010\310\001\202\323\344\223\002L\"G/api/v1alpha1/scorecards/sc" +
      "orecards_support/deleteautoevaluationbyo" +
      "rgid:\001*\022\327\001\n\025ListScorecardsByOrgId\0225.api." +
      "v1alpha1.scorecards.ListScorecardsByOrgI" +
      "dRequest\032/.api.v1alpha1.scorecards.ListS" +
      "corecardsResponse\"V\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002F\"A/ap" +
      "i/v1alpha1/scorecards/scorecards_support" +
      "/listscorecardsbyorgid:\001*B\276\001\n)com.tcn.cl" +
      "oud.api.api.v1alpha1.scorecardsB\023Support" +
      "ServiceProtoP\001\242\002\003AVS\252\002\027Api.V1alpha1.Scor" +
      "ecards\312\002\027Api\\V1alpha1\\Scorecards\342\002#Api\\V" +
      "1alpha1\\Scorecards\\GPBMetadata\352\002\031Api::V1" +
      "alpha1::Scorecardsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.getDescriptor(),
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
    com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
