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
      "annel/tasks/v1alpha1/entities.proto2\330\001\n\014" +
      "TasksService\022\307\001\n\013CancelTasks\0227.services." +
      "omnichannel.tasks.v1alpha1.CancelTasksRe" +
      "quest\0328.services.omnichannel.tasks.v1alp" +
      "ha1.CancelTasksResponse\"E\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002" +
      "5\"0/services/omnichannel/tasks/v1alpha1/" +
      "canceltasks:\001*B\364\001\n5com.tcn.cloud.api.ser" +
      "vices.omnichannel.tasks.v1alpha1B\014Servic" +
      "eProtoP\001\242\002\003SOT\252\002#Services.Omnichannel.Ta" +
      "sks.V1alpha1\312\002#Services\\Omnichannel\\Task" +
      "s\\V1alpha1\342\002/Services\\Omnichannel\\Tasks\\" +
      "V1alpha1\\GPBMetadata\352\002&Services::Omnicha" +
      "nnel::Tasks::V1alpha1b\006proto3"
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