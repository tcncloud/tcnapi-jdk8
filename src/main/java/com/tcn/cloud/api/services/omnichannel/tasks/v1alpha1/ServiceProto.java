// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/tasks/v1alpha1/service.proto

package com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1;

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
      "\n1services/omnichannel/tasks/v1alpha1/se" +
      "rvice.proto\022#services.omnichannel.tasks." +
      "v1alpha1\032\027annotations/authz.proto\032\034googl" +
      "e/api/annotations.proto\0322services/omnich" +
      "annel/tasks/v1alpha1/entities.proto2\256\003\n\014" +
      "TasksService\022\307\001\n\013CancelTasks\0227.services." +
      "omnichannel.tasks.v1alpha1.CancelTasksRe" +
      "quest\0328.services.omnichannel.tasks.v1alp" +
      "ha1.CancelTasksResponse\"E\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002" +
      "5\"0/services/omnichannel/tasks/v1alpha1/" +
      "canceltasks:\001*\022\323\001\n\016CancelAllTasks\022:.serv" +
      "ices.omnichannel.tasks.v1alpha1.CancelAl" +
      "lTasksRequest\032;.services.omnichannel.tas" +
      "ks.v1alpha1.CancelAllTasksResponse\"H\272\270\221\002" +
      "\005\n\003\010\260\t\202\323\344\223\0028\"3/services/omnichannel/task" +
      "s/v1alpha1/cancelalltasks:\001*B\364\001\n5com.tcn" +
      ".cloud.api.services.omnichannel.tasks.v1" +
      "alpha1B\014ServiceProtoP\001\242\002\003SOT\252\002#Services." +
      "Omnichannel.Tasks.V1alpha1\312\002#Services\\Om" +
      "nichannel\\Tasks\\V1alpha1\342\002/Services\\Omni" +
      "channel\\Tasks\\V1alpha1\\GPBMetadata\352\002&Ser" +
      "vices::Omnichannel::Tasks::V1alpha1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.EntitiesProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1.EntitiesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
