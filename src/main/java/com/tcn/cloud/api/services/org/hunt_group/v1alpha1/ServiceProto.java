// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/hunt_group/v1alpha1/service.proto

package com.tcn.cloud.api.services.org.hunt_group.v1alpha1;

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
      "\n.services/org/hunt_group/v1alpha1/servi" +
      "ce.proto\022 services.org.hunt_group.v1alph" +
      "a1\032\027annotations/authz.proto\032\034google/api/" +
      "annotations.proto\032/services/org/hunt_gro" +
      "up/v1alpha1/entities.proto2\202\002\n\020HuntGroup" +
      "Service\022\355\001\n\027ListHuntGroupExileLinks\022@.se" +
      "rvices.org.hunt_group.v1alpha1.ListHuntG" +
      "roupExileLinksRequest\032A.services.org.hun" +
      "t_group.v1alpha1.ListHuntGroupExileLinks" +
      "Response\"M\272\270\221\002\005\n\003\010\354\016\202\323\344\223\002=\"8/services/or" +
      "g/huntgroup/v1alpha1/listhuntgroupexilel" +
      "inks:\001*B\341\001\n2com.tcn.cloud.api.services.o" +
      "rg.hunt_group.v1alpha1B\014ServiceProtoP\001\242\002" +
      "\003SOH\252\002\037Services.Org.HuntGroup.V1alpha1\312\002" +
      "\037Services\\Org\\HuntGroup\\V1alpha1\342\002+Servi" +
      "ces\\Org\\HuntGroup\\V1alpha1\\GPBMetadata\352\002" +
      "\"Services::Org::HuntGroup::V1alpha1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.services.org.hunt_group.v1alpha1.EntitiesProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcn.cloud.api.services.org.hunt_group.v1alpha1.EntitiesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
