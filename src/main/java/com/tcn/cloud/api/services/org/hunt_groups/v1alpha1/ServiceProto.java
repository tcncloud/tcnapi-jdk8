// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/hunt_groups/v1alpha1/service.proto

package com.tcn.cloud.api.services.org.hunt_groups.v1alpha1;

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
      "\n/services/org/hunt_groups/v1alpha1/serv" +
      "ice.proto\022!services.org.hunt_groups.v1al" +
      "pha1\032\027annotations/authz.proto\032\034google/ap" +
      "i/annotations.proto\0320services/org/hunt_g" +
      "roups/v1alpha1/entities.proto2\361\013\n\021HuntGr" +
      "oupsService\022\360\001\n\027ListHuntGroupExileLinks\022" +
      "A.services.org.hunt_groups.v1alpha1.List" +
      "HuntGroupExileLinksRequest\032B.services.or" +
      "g.hunt_groups.v1alpha1.ListHuntGroupExil" +
      "eLinksResponse\"N\272\270\221\002\005\n\003\010\354\016\202\323\344\223\002>\"9/servi" +
      "ces/org/huntgroups/v1alpha1/listhuntgrou" +
      "pexilelinks:\001*\022\354\001\n\026CopyHuntGroupExileLin" +
      "k\022@.services.org.hunt_groups.v1alpha1.Co" +
      "pyHuntGroupExileLinkRequest\032A.services.o" +
      "rg.hunt_groups.v1alpha1.CopyHuntGroupExi" +
      "leLinkResponse\"M\272\270\221\002\005\n\003\010\355\016\202\323\344\223\002=\"8/servi" +
      "ces/org/huntgroups/v1alpha1/copyhuntgrou" +
      "pexilelink:\001*\022\370\001\n\031UpdateHuntGroupExileLi" +
      "nks\022C.services.org.hunt_groups.v1alpha1." +
      "UpdateHuntGroupExileLinksRequest\032D.servi" +
      "ces.org.hunt_groups.v1alpha1.UpdateHuntG" +
      "roupExileLinksResponse\"P\272\270\221\002\005\n\003\010\355\016\202\323\344\223\002@" +
      "\";/services/org/huntgroups/v1alpha1/upda" +
      "tehuntgroupexilelinks:\001*\022\374\001\n\032ListHuntGro" +
      "upAgentTriggers\022D.services.org.hunt_grou" +
      "ps.v1alpha1.ListHuntGroupAgentTriggersRe" +
      "quest\032E.services.org.hunt_groups.v1alpha" +
      "1.ListHuntGroupAgentTriggersResponse\"Q\272\270" +
      "\221\002\005\n\003\010\354\016\202\323\344\223\002A\"</services/org/huntgroups" +
      "/v1alpha1/listhuntgroupagenttriggers:\001*\022" +
      "\370\001\n\031CopyHuntGroupAgentTrigger\022C.services" +
      ".org.hunt_groups.v1alpha1.CopyHuntGroupA" +
      "gentTriggerRequest\032D.services.org.hunt_g" +
      "roups.v1alpha1.CopyHuntGroupAgentTrigger" +
      "Response\"P\272\270\221\002\005\n\003\010\355\016\202\323\344\223\002@\";/services/or" +
      "g/huntgroups/v1alpha1/copyhuntgroupagent" +
      "trigger:\001*\022\204\002\n\034UpdateHuntGroupAgentTrigg" +
      "ers\022F.services.org.hunt_groups.v1alpha1." +
      "UpdateHuntGroupAgentTriggersRequest\032G.se" +
      "rvices.org.hunt_groups.v1alpha1.UpdateHu" +
      "ntGroupAgentTriggersResponse\"S\272\270\221\002\005\n\003\010\355\016" +
      "\202\323\344\223\002C\">/services/org/huntgroups/v1alpha" +
      "1/updatehuntgroupagenttriggers:\001*B\346\001\n3co" +
      "m.tcn.cloud.api.services.org.hunt_groups" +
      ".v1alpha1B\014ServiceProtoP\001\242\002\003SOH\252\002 Servic" +
      "es.Org.HuntGroups.V1alpha1\312\002 Services\\Or" +
      "g\\HuntGroups\\V1alpha1\342\002,Services\\Org\\Hun" +
      "tGroups\\V1alpha1\\GPBMetadata\352\002#Services:" +
      ":Org::HuntGroups::V1alpha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcn.cloud.api.services.org.hunt_groups.v1alpha1.EntitiesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
