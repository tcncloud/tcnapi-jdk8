// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/smart_question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public final class SmartQuestionProto {
  private SmartQuestionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_CreateSmartQuestionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_CreateSmartQuestionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_CreateSmartQuestionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_CreateSmartQuestionResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,api/v1alpha1/scorecards/smart_question" +
      ".proto\022\027api.v1alpha1.scorecards\032\034api/com" +
      "mons/scorecards.proto\"_\n\032CreateSmartQues" +
      "tionRequest\022A\n\016smart_question\030\001 \001(\0132\032.ap" +
      "i.commons.SmartQuestionR\rsmartQuestion\"`" +
      "\n\033CreateSmartQuestionResponse\022A\n\016smart_q" +
      "uestion\030\001 \001(\0132\032.api.commons.SmartQuestio" +
      "nR\rsmartQuestionB\275\001\n)com.tcn.cloud.api.a" +
      "pi.v1alpha1.scorecardsB\022SmartQuestionPro" +
      "toP\001\242\002\003AVS\252\002\027Api.V1alpha1.Scorecards\312\002\027A" +
      "pi\\V1alpha1\\Scorecards\342\002#Api\\V1alpha1\\Sc" +
      "orecards\\GPBMetadata\352\002\031Api::V1alpha1::Sc" +
      "orecardsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_scorecards_CreateSmartQuestionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_scorecards_CreateSmartQuestionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_CreateSmartQuestionRequest_descriptor,
        new java.lang.String[] { "SmartQuestion", });
    internal_static_api_v1alpha1_scorecards_CreateSmartQuestionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_scorecards_CreateSmartQuestionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_CreateSmartQuestionResponse_descriptor,
        new java.lang.String[] { "SmartQuestion", });
    com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
