// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/agenttraining/service.proto

package com.tcn.cloud.api.api.v1alpha1.agenttraining;

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

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(api/v1alpha1/agenttraining/service.pro" +
      "to\022\032api.v1alpha1.agenttraining\032\027annotati" +
      "ons/authz.proto\0325api/v1alpha1/agenttrain" +
      "ing/learning_opportunity.proto\032\034google/a" +
      "pi/annotations.proto2\206\014\n\024AgentTrainingSe" +
      "rvice\022\371\001\n\031CreateLearningOpportunity\022<.ap" +
      "i.v1alpha1.agenttraining.CreateLearningO" +
      "pportunityRequest\032=.api.v1alpha1.agenttr" +
      "aining.CreateLearningOpportunityResponse" +
      "\"_\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002O\"J/api/v1alpha1/agentt" +
      "raining/agenttrainingservice/createlearn" +
      "ingopportunity:\001*\022\371\001\n\031ListLearningOpport" +
      "unities\022<.api.v1alpha1.agenttraining.Lis" +
      "tLearningOpportunitiesRequest\032=.api.v1al" +
      "pha1.agenttraining.ListLearningOpportuni" +
      "tiesResponse\"_\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002O\"J/api/v1a" +
      "lpha1/agenttraining/agenttrainingservice" +
      "/listlearningopportunities:\001*\022\215\002\n\036ListAg" +
      "entLearningOpportunities\022A.api.v1alpha1." +
      "agenttraining.ListAgentLearningOpportuni" +
      "tiesRequest\032B.api.v1alpha1.agenttraining" +
      ".ListAgentLearningOpportunitiesResponse\"" +
      "d\272\270\221\002\005\n\003\010\324\002\202\323\344\223\002T\"O/api/v1alpha1/agenttr" +
      "aining/agenttrainingservice/listagentlea" +
      "rningopportunities:\001*\022\371\001\n\031UpdateLearning" +
      "Opportunity\022<.api.v1alpha1.agenttraining" +
      ".UpdateLearningOpportunityRequest\032=.api." +
      "v1alpha1.agenttraining.UpdateLearningOpp" +
      "ortunityResponse\"_\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002O\"J/api" +
      "/v1alpha1/agenttraining/agenttrainingser" +
      "vice/updatelearningopportunity:\001*\022\371\001\n\031De" +
      "leteLearningOpportunity\022<.api.v1alpha1.a" +
      "genttraining.DeleteLearningOpportunityRe" +
      "quest\032=.api.v1alpha1.agenttraining.Delet" +
      "eLearningOpportunityResponse\"_\272\270\221\002\005\n\003\010\301\014" +
      "\202\323\344\223\002O\"J/api/v1alpha1/agenttraining/agen" +
      "ttrainingservice/deletelearningopportuni" +
      "ty:\001*\022\355\001\n\026GetLearningOpportunity\0229.api.v" +
      "1alpha1.agenttraining.GetLearningOpportu" +
      "nityRequest\032:.api.v1alpha1.agenttraining" +
      ".GetLearningOpportunityResponse\"\\\272\270\221\002\005\n\003" +
      "\010\301\014\202\323\344\223\002L\"G/api/v1alpha1/agenttraining/a" +
      "genttrainingservice/getlearningopportuni" +
      "ty:\001*B\306\001\n,com.tcn.cloud.api.api.v1alpha1" +
      ".agenttrainingB\014ServiceProtoP\001\242\002\003AVA\252\002\032A" +
      "pi.V1alpha1.Agenttraining\312\002\032Api\\V1alpha1" +
      "\\Agenttraining\342\002&Api\\V1alpha1\\Agenttrain" +
      "ing\\GPBMetadata\352\002\034Api::V1alpha1::Agenttr" +
      "ainingb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.agenttraining.LearningOpportunityProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
