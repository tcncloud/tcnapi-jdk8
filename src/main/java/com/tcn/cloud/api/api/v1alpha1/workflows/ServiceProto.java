// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/service.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

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
      "\n$api/v1alpha1/workflows/service.proto\022\026" +
      "api.v1alpha1.workflows\032\027annotations/auth" +
      "z.proto\032%api/v1alpha1/workflows/entities" +
      ".proto\032\034google/api/annotations.proto2\260\006\n" +
      "\032WorkflowsDefinitionService\022\300\001\n\023ListFlow" +
      "Definitions\0222.api.v1alpha1.workflows.Lis" +
      "tFlowDefinitionsRequest\0323.api.v1alpha1.w" +
      "orkflows.ListFlowDefinitionsResponse\"@\272\270" +
      "\221\002\005\n\003\010\240\037\202\323\344\223\0020\"+/api/v1alpha1/workflows/" +
      "listflowdefinitions:\001*\022\274\001\n\022SaveFlowDefin" +
      "ition\0221.api.v1alpha1.workflows.SaveFlowD" +
      "efinitionRequest\0322.api.v1alpha1.workflow" +
      "s.SaveFlowDefinitionResponse\"?\272\270\221\002\005\n\003\010\240\037" +
      "\202\323\344\223\002/\"*/api/v1alpha1/workflows/saveflow" +
      "definition:\001*\022\270\001\n\021GetFlowDefinition\0220.ap" +
      "i.v1alpha1.workflows.GetFlowDefinitionRe" +
      "quest\0321.api.v1alpha1.workflows.GetFlowDe" +
      "finitionResponse\">\272\270\221\002\005\n\003\010\240\037\202\323\344\223\002.\")/api" +
      "/v1alpha1/workflows/getflowdefinition:\001*" +
      "\022\324\001\n\030DeleteFlowDefinitionById\0227.api.v1al" +
      "pha1.workflows.DeleteFlowDefinitionByIdR" +
      "equest\0328.api.v1alpha1.workflows.DeleteFl" +
      "owDefinitionByIdResponse\"E\272\270\221\002\005\n\003\010\240\037\202\323\344\223" +
      "\0025\"0/api/v1alpha1/workflows/deleteflowde" +
      "finitionbyid:\001*B\262\001\n(com.tcn.cloud.api.ap" +
      "i.v1alpha1.workflowsB\014ServiceProtoP\001\242\002\003A" +
      "VW\252\002\026Api.V1alpha1.Workflows\312\002\026Api\\V1alph" +
      "a1\\Workflows\342\002\"Api\\V1alpha1\\Workflows\\GP" +
      "BMetadata\352\002\030Api::V1alpha1::Workflowsb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.workflows.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.workflows.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
