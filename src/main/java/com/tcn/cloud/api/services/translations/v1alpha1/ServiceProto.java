// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translations/v1alpha1/service.proto

package com.tcn.cloud.api.services.translations.v1alpha1;

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
      "\n,services/translations/v1alpha1/service" +
      ".proto\022\036services.translations.v1alpha1\032\027" +
      "annotations/authz.proto\032\034google/api/anno" +
      "tations.proto\032-services/translations/v1a" +
      "lpha1/entities.proto2\205\017\n\023TranslationsSer" +
      "vice\022\315\001\n\021TranslateTemplate\0228.services.tr" +
      "anslations.v1alpha1.TranslateTemplateReq" +
      "uest\0329.services.translations.v1alpha1.Tr" +
      "anslateTemplateResponse\"C\272\270\221\002\002\030\001\202\323\344\223\0026\"1" +
      "/services/translations/v1alpha1/translat" +
      "etemplate:\001*\022\314\001\n\020ListTranslations\0227.serv" +
      "ices.translations.v1alpha1.ListTranslati" +
      "onsRequest\0328.services.translations.v1alp" +
      "ha1.ListTranslationsResponse\"E\272\270\221\002\005\n\003\010\310\001" +
      "\202\323\344\223\0025\"0/services/translations/v1alpha1/" +
      "listtranslations:\001*\022\300\001\n\rListLanguages\0224." +
      "services.translations.v1alpha1.ListLangu" +
      "agesRequest\0325.services.translations.v1al" +
      "pha1.ListLanguagesResponse\"B\272\270\221\002\005\n\003\010\310\001\202\323" +
      "\344\223\0022\"-/services/translations/v1alpha1/li" +
      "stlanguages:\001*\022\320\001\n\021UpdateTranslation\0228.s" +
      "ervices.translations.v1alpha1.UpdateTran" +
      "slationRequest\0329.services.translations.v" +
      "1alpha1.UpdateTranslationResponse\"F\272\270\221\002\005" +
      "\n\003\010\310\001\202\323\344\223\0026\"1/services/translations/v1al" +
      "pha1/updatetranslation:\001*\022\340\001\n\025TriggerLLM" +
      "Translation\022<.services.translations.v1al" +
      "pha1.TriggerLLMTranslationRequest\032=.serv" +
      "ices.translations.v1alpha1.TriggerLLMTra" +
      "nslationResponse\"J\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002:\"5/ser" +
      "vices/translations/v1alpha1/triggerllmtr" +
      "anslation:\001*\022\344\001\n\026TriggerLLMTranslations\022" +
      "=.services.translations.v1alpha1.Trigger" +
      "LLMTranslationsRequest\032>.services.transl" +
      "ations.v1alpha1.TriggerLLMTranslationsRe" +
      "sponse\"K\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002;\"6/services/tran" +
      "slations/v1alpha1/triggerllmtranslations" +
      ":\001*\022\314\001\n\020SetSystemMessage\0227.services.tran" +
      "slations.v1alpha1.SetSystemMessageReques" +
      "t\0328.services.translations.v1alpha1.SetSy" +
      "stemMessageResponse\"E\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0025\"0/" +
      "services/translations/v1alpha1/setsystem" +
      "message:\001*\022\314\001\n\020GetSystemMessage\0227.servic" +
      "es.translations.v1alpha1.GetSystemMessag" +
      "eRequest\0328.services.translations.v1alpha" +
      "1.GetSystemMessageResponse\"E\272\270\221\002\005\n\003\010\310\001\202\323" +
      "\344\223\0025\"0/services/translations/v1alpha1/ge" +
      "tsystemmessage:\001*\022\320\001\n\021TestSystemMessage\022" +
      "8.services.translations.v1alpha1.TestSys" +
      "temMessageRequest\0329.services.translation" +
      "s.v1alpha1.TestSystemMessageResponse\"F\272\270" +
      "\221\002\005\n\003\010\310\001\202\323\344\223\0026\"1/services/translations/v" +
      "1alpha1/testsystemmessage:\001*B\332\001\n0com.tcn" +
      ".cloud.api.services.translations.v1alpha" +
      "1B\014ServiceProtoP\001\242\002\003STX\252\002\036Services.Trans" +
      "lations.V1alpha1\312\002\036Services\\Translations" +
      "\\V1alpha1\342\002*Services\\Translations\\V1alph" +
      "a1\\GPBMetadata\352\002 Services::Translations:" +
      ":V1alpha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcn.cloud.api.services.translations.v1alpha1.EntitiesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
