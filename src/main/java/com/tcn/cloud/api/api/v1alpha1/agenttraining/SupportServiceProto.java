// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/agenttraining/support_service.proto

package com.tcn.cloud.api.api.v1alpha1.agenttraining;

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
      "\n0api/v1alpha1/agenttraining/support_ser" +
      "vice.proto\022\032api.v1alpha1.agenttraining\032\027" +
      "annotations/authz.proto\0325api/v1alpha1/ag" +
      "enttraining/learning_opportunity.proto\032\034" +
      "google/api/annotations.proto2\315\004\n\033AgentTr" +
      "ainingSupportService\022\225\002\n ListLearningOpp" +
      "ortunitiesByOrgId\022C.api.v1alpha1.agenttr" +
      "aining.ListLearningOpportunitiesByOrgIdR" +
      "equest\032=.api.v1alpha1.agenttraining.List" +
      "LearningOpportunitiesResponse\"m\272\270\221\002\005\n\003\010\310" +
      "\001\202\323\344\223\002]\"X/api/v1alpha1/agenttraining/age" +
      "nttrainingsupportservice/listlearningopp" +
      "ortunitiesbyorgid:\001*\022\225\002\n DeleteLearningO" +
      "pportunityByOrgId\022C.api.v1alpha1.agenttr" +
      "aining.DeleteLearningOpportunityByOrgIdR" +
      "equest\032=.api.v1alpha1.agenttraining.Dele" +
      "teLearningOpportunityResponse\"m\272\270\221\002\005\n\003\010\310" +
      "\001\202\323\344\223\002]\"X/api/v1alpha1/agenttraining/age" +
      "nttrainingsupportservice/deletelearningo" +
      "pportunitybyorgid:\001*B\315\001\n,com.tcn.cloud.a" +
      "pi.api.v1alpha1.agenttrainingB\023SupportSe" +
      "rviceProtoP\001\242\002\003AVA\252\002\032Api.V1alpha1.Agentt" +
      "raining\312\002\032Api\\V1alpha1\\Agenttraining\342\002&A" +
      "pi\\V1alpha1\\Agenttraining\\GPBMetadata\352\002\034" +
      "Api::V1alpha1::Agenttrainingb\006proto3"
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
