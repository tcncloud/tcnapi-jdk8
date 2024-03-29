// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/businesshours/service.proto

package com.tcn.cloud.api.api.v1alpha1.org.businesshours;

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
      "\n,api/v1alpha1/org/businesshours/service" +
      ".proto\022\036api.v1alpha1.org.businesshours\032\027" +
      "annotations/authz.proto\032-api/v1alpha1/or" +
      "g/businesshours/entities.proto\032\034google/a" +
      "pi/annotations.proto2\274\r\n\024BusinessHoursSe" +
      "rvice\022\302\001\n\021ListBusinessHours\0228.api.v1alph" +
      "a1.org.businesshours.ListBusinessHoursRe" +
      "quest\0329.api.v1alpha1.org.businesshours.L" +
      "istBusinessHoursResponse\"8\272\270\221\002\004\n\002\010e\202\323\344\223\002" +
      ")\"$/api/v1alpha1/org/businesshours/list:" +
      "\001*\022\276\001\n\020GetBusinessHours\0227.api.v1alpha1.o" +
      "rg.businesshours.GetBusinessHoursRequest" +
      "\0328.api.v1alpha1.org.businesshours.GetBus" +
      "inessHoursResponse\"7\272\270\221\002\004\n\002\010e\202\323\344\223\002(\"#/ap" +
      "i/v1alpha1/org/businesshours/get:\001*\022\276\001\n\020" +
      "SetBusinessHours\0227.api.v1alpha1.org.busi" +
      "nesshours.SetBusinessHoursRequest\0328.api." +
      "v1alpha1.org.businesshours.SetBusinessHo" +
      "ursResponse\"7\272\270\221\002\004\n\002\010d\202\323\344\223\002(\"#/api/v1alp" +
      "ha1/org/businesshours/set:\001*\022\344\001\n\032AddInte" +
      "rvalToBusinessHours\022A.api.v1alpha1.org.b" +
      "usinesshours.AddIntervalToBusinessHoursR" +
      "equest\032B.api.v1alpha1.org.businesshours." +
      "AddIntervalToBusinessHoursResponse\"?\272\270\221\002" +
      "\004\n\002\010d\202\323\344\223\0020\"+/api/v1alpha1/org/businessh" +
      "ours/addinterval:\001*\022\366\001\n\037RemoveIntervalFr" +
      "omBusinessHours\022F.api.v1alpha1.org.busin" +
      "esshours.RemoveIntervalFromBusinessHours" +
      "Request\032G.api.v1alpha1.org.businesshours" +
      ".RemoveIntervalFromBusinessHoursResponse" +
      "\"B\272\270\221\002\004\n\002\010d\202\323\344\223\0023\"./api/v1alpha1/org/bus" +
      "inesshours/removeinterval:\001*\022\332\001\n\027UpdateB" +
      "usinessHoursInfo\022>.api.v1alpha1.org.busi" +
      "nesshours.UpdateBusinessHoursInfoRequest" +
      "\032?.api.v1alpha1.org.businesshours.Update" +
      "BusinessHoursInfoResponse\">\272\270\221\002\004\n\002\010d\202\323\344\223" +
      "\002/\"*/api/v1alpha1/org/businesshours/upda" +
      "teinfo:\001*\022\312\001\n\023DeleteBusinessHours\022:.api." +
      "v1alpha1.org.businesshours.DeleteBusines" +
      "sHoursRequest\032;.api.v1alpha1.org.busines" +
      "shours.DeleteBusinessHoursResponse\":\272\270\221\002" +
      "\004\n\002\010d\202\323\344\223\002+\"&/api/v1alpha1/org/businessh" +
      "ours/delete:\001*\022\322\001\n\025EvaluateBusinessHours" +
      "\022<.api.v1alpha1.org.businesshours.Evalua" +
      "teBusinessHoursRequest\032=.api.v1alpha1.or" +
      "g.businesshours.EvaluateBusinessHoursRes" +
      "ponse\"<\272\270\221\002\004\n\002\010e\202\323\344\223\002-\"(/api/v1alpha1/or" +
      "g/businesshours/evaluate:\001*B\334\001\n0com.tcn." +
      "cloud.api.api.v1alpha1.org.businesshours" +
      "B\014ServiceProtoP\001\242\002\004AVOB\252\002\036Api.V1alpha1.O" +
      "rg.Businesshours\312\002\036Api\\V1alpha1\\Org\\Busi" +
      "nesshours\342\002*Api\\V1alpha1\\Org\\Businesshou" +
      "rs\\GPBMetadata\352\002!Api::V1alpha1::Org::Bus" +
      "inesshoursb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.org.businesshours.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.org.businesshours.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
