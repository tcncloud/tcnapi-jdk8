// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/service.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

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
      "\n)api/v1alpha1/contactmanager/service.pr" +
      "oto\022\033api.v1alpha1.contactmanager\032\027annota" +
      "tions/authz.proto\0320api/v1alpha1/contactm" +
      "anager/contactmanager.proto\032\034google/api/" +
      "annotations.proto2\210\007\n\016ContactManager\022\312\001\n" +
      "\016GetContactList\0222.api.v1alpha1.contactma" +
      "nager.GetContactListRequest\0323.api.v1alph" +
      "a1.contactmanager.GetContactListResponse" +
      "\"O\272\270\221\002\005\n\003\010\354\'\202\323\344\223\002?\":/api/v1alpha1/contac" +
      "tmanager/contactmanager/getcontactlist:\001" +
      "*\022\342\001\n\024ListContactEntryList\0228.api.v1alpha" +
      "1.contactmanager.ListContactEntryListReq" +
      "uest\0329.api.v1alpha1.contactmanager.ListC" +
      "ontactEntryListResponse\"U\272\270\221\002\005\n\003\010\354\'\202\323\344\223\002" +
      "E\"@/api/v1alpha1/contactmanager/contactm" +
      "anager/listcontactentrylist:\001*\022\332\001\n\022GetEn" +
      "cContactEntry\0226.api.v1alpha1.contactmana" +
      "ger.GetEncContactEntryRequest\0327.api.v1al" +
      "pha1.contactmanager.GetEncContactEntryRe" +
      "sponse\"S\272\270\221\002\005\n\003\010\354\'\202\323\344\223\002C\">/api/v1alpha1/" +
      "contactmanager/contactmanager/getenccont" +
      "actentry:\001*\022\346\001\n\025GetKYCEncContactEntry\0229." +
      "api.v1alpha1.contactmanager.GetKYCEncCon" +
      "tactEntryRequest\032:.api.v1alpha1.contactm" +
      "anager.GetKYCEncContactEntryResponse\"V\272\270" +
      "\221\002\005\n\003\010\355\'\202\323\344\223\002F\"A/api/v1alpha1/contactman" +
      "ager/contactmanager/getkycenccontactentr" +
      "y:\001*B\313\001\n-com.tcn.cloud.api.api.v1alpha1." +
      "contactmanagerB\014ServiceProtoP\001\242\002\003AVC\252\002\033A" +
      "pi.V1alpha1.Contactmanager\312\002\033Api\\V1alpha" +
      "1\\Contactmanager\342\002\'Api\\V1alpha1\\Contactm" +
      "anager\\GPBMetadata\352\002\035Api::V1alpha1::Cont" +
      "actmanagerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.contactmanager.ContactmanagerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
