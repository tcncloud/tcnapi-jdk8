// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/observedholidays/service.proto

package com.tcn.cloud.api.api.v1alpha1.org.observedholidays;

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
      "\n/api/v1alpha1/org/observedholidays/serv" +
      "ice.proto\022!api.v1alpha1.org.observedholi" +
      "days\032\027annotations/authz.proto\0320api/v1alp" +
      "ha1/org/observedholidays/entities.proto\032" +
      "\034google/api/annotations.proto2\213\016\n\027Observ" +
      "edHolidaysService\022\324\001\n\024ListObservedHolida" +
      "ys\022>.api.v1alpha1.org.observedholidays.L" +
      "istObservedHolidaysRequest\032?.api.v1alpha" +
      "1.org.observedholidays.ListObservedHolid" +
      "aysResponse\";\272\270\221\002\004\n\002\010e\202\323\344\223\002,\"\'/api/v1alp" +
      "ha1/org/observedholidays/list:\001*\022\320\001\n\023Get" +
      "ObservedHolidays\022=.api.v1alpha1.org.obse" +
      "rvedholidays.GetObservedHolidaysRequest\032" +
      ">.api.v1alpha1.org.observedholidays.GetO" +
      "bservedHolidaysResponse\":\272\270\221\002\004\n\002\010e\202\323\344\223\002+" +
      "\"&/api/v1alpha1/org/observedholidays/get" +
      ":\001*\022\320\001\n\023SetObservedHolidays\022=.api.v1alph" +
      "a1.org.observedholidays.SetObservedHolid" +
      "aysRequest\032>.api.v1alpha1.org.observedho" +
      "lidays.SetObservedHolidaysResponse\":\272\270\221\002" +
      "\004\n\002\010d\202\323\344\223\002+\"&/api/v1alpha1/org/observedh" +
      "olidays/set:\001*\022\326\001\n\025AddToObservedHolidays" +
      "\022?.api.v1alpha1.org.observedholidays.Add" +
      "ToObservedHolidaysRequest\032@.api.v1alpha1" +
      ".org.observedholidays.AddToObservedHolid" +
      "aysResponse\":\272\270\221\002\004\n\002\010d\202\323\344\223\002+\"&/api/v1alp" +
      "ha1/org/observedholidays/add:\001*\022\344\001\n\026Remo" +
      "veObservedHolidays\022D.api.v1alpha1.org.ob" +
      "servedholidays.RemoveFromObservedHoliday" +
      "sRequest\032E.api.v1alpha1.org.observedholi" +
      "days.RemoveFromObservedHolidaysResponse\"" +
      "=\272\270\221\002\004\n\002\010d\202\323\344\223\002.\")/api/v1alpha1/org/obse" +
      "rvedholidays/remove:\001*\022\354\001\n\032UpdateObserve" +
      "dHolidaysInfo\022D.api.v1alpha1.org.observe" +
      "dholidays.UpdateObservedHolidaysInfoRequ" +
      "est\032E.api.v1alpha1.org.observedholidays." +
      "UpdateObservedHolidaysInfoResponse\"A\272\270\221\002" +
      "\004\n\002\010d\202\323\344\223\0022\"-/api/v1alpha1/org/observedh" +
      "olidays/updateinfo:\001*\022\334\001\n\026DeleteObserved" +
      "Holidays\022@.api.v1alpha1.org.observedholi" +
      "days.DeleteObservedHolidaysRequest\032A.api" +
      ".v1alpha1.org.observedholidays.DeleteObs" +
      "ervedHolidaysResponse\"=\272\270\221\002\004\n\002\010d\202\323\344\223\002.\")" +
      "/api/v1alpha1/org/observedholidays/delet" +
      "e:\001*\022\344\001\n\030EvaluateObservedHolidays\022B.api." +
      "v1alpha1.org.observedholidays.EvaluateOb" +
      "servedHolidaysRequest\032C.api.v1alpha1.org" +
      ".observedholidays.EvaluateObservedHolida" +
      "ysResponse\"?\272\270\221\002\004\n\002\010e\202\323\344\223\0020\"+/api/v1alph" +
      "a1/org/observedholidays/evaluate:\001*B\353\001\n3" +
      "com.tcn.cloud.api.api.v1alpha1.org.obser" +
      "vedholidaysB\014ServiceProtoP\001\242\002\004AVOO\252\002!Api" +
      ".V1alpha1.Org.Observedholidays\312\002!Api\\V1a" +
      "lpha1\\Org\\Observedholidays\342\002-Api\\V1alpha" +
      "1\\Org\\Observedholidays\\GPBMetadata\352\002$Api" +
      "::V1alpha1::Org::Observedholidaysb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.org.observedholidays.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}