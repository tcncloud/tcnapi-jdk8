// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/service.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

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
      "\n\'services/billing/v1alpha3/service.prot" +
      "o\022\031services.billing.v1alpha3\032\027annotation" +
      "s/authz.proto\032\034google/api/annotations.pr" +
      "oto\032(services/billing/v1alpha3/defaults." +
      "proto\032\'services/billing/v1alpha3/invoice" +
      ".proto\032$services/billing/v1alpha3/plan.p" +
      "roto\032\'services/billing/v1alpha3/product." +
      "proto2\224(\n\016BillingService\022\260\001\n\014ListProduct" +
      "s\022..services.billing.v1alpha3.ListProduc" +
      "tsRequest\032/.services.billing.v1alpha3.Li" +
      "stProductsResponse\"?\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\002,\"" +
      "\'/services/billing/v1alpha3/listproducts" +
      ":\001*\022\321\001\n\025ApplyBillingPlanDraft\0227.services" +
      ".billing.v1alpha3.ApplyBillingPlanDraftR" +
      "equest\0328.services.billing.v1alpha3.Apply" +
      "BillingPlanDraftResponse\"E\272\270\221\002\005\n\003\010\310\001\202\323\344\223" +
      "\0025\"0/services/billing/v1alpha3/applybill" +
      "ingplandraft:\001*\022\301\001\n\021CreateBillingPlan\0223." +
      "services.billing.v1alpha3.CreateBillingP" +
      "lanRequest\0324.services.billing.v1alpha3.C" +
      "reateBillingPlanResponse\"A\272\270\221\002\005\n\003\010\310\001\202\323\344\223" +
      "\0021\",/services/billing/v1alpha3/createbil" +
      "lingplan:\001*\022\301\001\n\021DeleteBillingPlan\0223.serv" +
      "ices.billing.v1alpha3.DeleteBillingPlanR" +
      "equest\0324.services.billing.v1alpha3.Delet" +
      "eBillingPlanResponse\"A\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0021\"," +
      "/services/billing/v1alpha3/deletebilling" +
      "plan:\001*\022\301\001\n\021GetOrgBillingPlan\0223.services" +
      ".billing.v1alpha3.GetOrgBillingPlanReque" +
      "st\0324.services.billing.v1alpha3.GetOrgBil" +
      "lingPlanResponse\"A\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0021\",/ser" +
      "vices/billing/v1alpha3/getorgbillingplan" +
      ":\001*\022\311\001\n\023ListOrgBillingPlans\0225.services.b" +
      "illing.v1alpha3.ListOrgBillingPlansReque" +
      "st\0326.services.billing.v1alpha3.ListOrgBi" +
      "llingPlansResponse\"C\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0023\"./s" +
      "ervices/billing/v1alpha3/listorgbillingp" +
      "lans:\001*\022\301\001\n\021UpdateBillingPlan\0223.services" +
      ".billing.v1alpha3.UpdateBillingPlanReque" +
      "st\0324.services.billing.v1alpha3.UpdateBil" +
      "lingPlanResponse\"A\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0021\",/ser" +
      "vices/billing/v1alpha3/updatebillingplan" +
      ":\001*\022\360\001\n\034ApplyDefaultBillingPlanDraft\022>.s" +
      "ervices.billing.v1alpha3.ApplyDefaultBil" +
      "lingPlanDraftRequest\032?.services.billing." +
      "v1alpha3.ApplyDefaultBillingPlanDraftRes" +
      "ponse\"O\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\002<\"7/services/bi" +
      "lling/v1alpha3/applydefaultbillingplandr" +
      "aft:\001*\022\340\001\n\030CreateDefaultBillingPlan\022:.se" +
      "rvices.billing.v1alpha3.CreateDefaultBil" +
      "lingPlanRequest\032;.services.billing.v1alp" +
      "ha3.CreateDefaultBillingPlanResponse\"K\272\270" +
      "\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\0028\"3/services/billing/v1a" +
      "lpha3/createdefaultbillingplan:\001*\022\340\001\n\030De" +
      "leteDefaultBillingPlan\022:.services.billin" +
      "g.v1alpha3.DeleteDefaultBillingPlanReque" +
      "st\032;.services.billing.v1alpha3.DeleteDef" +
      "aultBillingPlanResponse\"K\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323" +
      "\344\223\0028\"3/services/billing/v1alpha3/deleted" +
      "efaultbillingplan:\001*\022\324\001\n\025GetDefaultBilli" +
      "ngPlan\0227.services.billing.v1alpha3.GetDe" +
      "faultBillingPlanRequest\0328.services.billi" +
      "ng.v1alpha3.GetDefaultBillingPlanRespons" +
      "e\"H\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\0025\"0/services/billin" +
      "g/v1alpha3/getdefaultbillingplan:\001*\022\334\001\n\027" +
      "ListDefaultBillingPlans\0229.services.billi" +
      "ng.v1alpha3.ListDefaultBillingPlansReque" +
      "st\032:.services.billing.v1alpha3.ListDefau" +
      "ltBillingPlansResponse\"J\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344" +
      "\223\0027\"2/services/billing/v1alpha3/listdefa" +
      "ultbillingplans:\001*\022\340\001\n\030UpdateDefaultBill" +
      "ingPlan\022:.services.billing.v1alpha3.Upda" +
      "teDefaultBillingPlanRequest\032;.services.b" +
      "illing.v1alpha3.UpdateDefaultBillingPlan" +
      "Response\"K\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\0028\"3/services" +
      "/billing/v1alpha3/updatedefaultbillingpl" +
      "an:\001*\022\315\001\n\024CreateRateDefinition\0226.service" +
      "s.billing.v1alpha3.CreateRateDefinitionR" +
      "equest\0327.services.billing.v1alpha3.Creat" +
      "eRateDefinitionResponse\"D\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002" +
      "4\"//services/billing/v1alpha3/createrate" +
      "definition:\001*\022\315\001\n\024DeleteRateDefinition\0226" +
      ".services.billing.v1alpha3.DeleteRateDef" +
      "initionRequest\0327.services.billing.v1alph" +
      "a3.DeleteRateDefinitionResponse\"D\272\270\221\002\005\n\003" +
      "\010\310\001\202\323\344\223\0024\"//services/billing/v1alpha3/de" +
      "leteratedefinition:\001*\022\301\001\n\021GetRateDefinit" +
      "ion\0223.services.billing.v1alpha3.GetRateD" +
      "efinitionRequest\0324.services.billing.v1al" +
      "pha3.GetRateDefinitionResponse\"A\272\270\221\002\005\n\003\010" +
      "\310\001\202\323\344\223\0021\",/services/billing/v1alpha3/get" +
      "ratedefinition:\001*\022\311\001\n\023ListRateDefinition" +
      "s\0225.services.billing.v1alpha3.ListRateDe" +
      "finitionsRequest\0326.services.billing.v1al" +
      "pha3.ListRateDefinitionsResponse\"C\272\270\221\002\005\n" +
      "\003\010\310\001\202\323\344\223\0023\"./services/billing/v1alpha3/l" +
      "istratedefinitions:\001*\022\315\001\n\024UpdateRateDefi" +
      "nition\0226.services.billing.v1alpha3.Updat" +
      "eRateDefinitionRequest\0327.services.billin" +
      "g.v1alpha3.UpdateRateDefinitionResponse\"" +
      "D\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0024\"//services/billing/v1a" +
      "lpha3/updateratedefinition:\001*\022\354\001\n\033Create" +
      "DefaultRateDefinition\022=.services.billing" +
      ".v1alpha3.CreateDefaultRateDefinitionReq" +
      "uest\032>.services.billing.v1alpha3.CreateD" +
      "efaultRateDefinitionResponse\"N\272\270\221\002\010\n\006\010\310\001" +
      "\010\361\001\202\323\344\223\002;\"6/services/billing/v1alpha3/cr" +
      "eatedefaultratedefinition:\001*\022\354\001\n\033DeleteD" +
      "efaultRateDefinition\022=.services.billing." +
      "v1alpha3.DeleteDefaultRateDefinitionRequ" +
      "est\032>.services.billing.v1alpha3.DeleteDe" +
      "faultRateDefinitionResponse\"N\272\270\221\002\010\n\006\010\310\001\010" +
      "\361\001\202\323\344\223\002;\"6/services/billing/v1alpha3/del" +
      "etedefaultratedefinition:\001*\022\340\001\n\030GetDefau" +
      "ltRateDefinition\022:.services.billing.v1al" +
      "pha3.GetDefaultRateDefinitionRequest\032;.s" +
      "ervices.billing.v1alpha3.GetDefaultRateD" +
      "efinitionResponse\"K\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\0028\"3" +
      "/services/billing/v1alpha3/getdefaultrat" +
      "edefinition:\001*\022\350\001\n\032ListDefaultRateDefini" +
      "tions\022<.services.billing.v1alpha3.ListDe" +
      "faultRateDefinitionsRequest\032=.services.b" +
      "illing.v1alpha3.ListDefaultRateDefinitio" +
      "nsResponse\"M\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\002:\"5/servic" +
      "es/billing/v1alpha3/listdefaultratedefin" +
      "itions:\001*\022\354\001\n\033UpdateDefaultRateDefinitio" +
      "n\022=.services.billing.v1alpha3.UpdateDefa" +
      "ultRateDefinitionRequest\032>.services.bill" +
      "ing.v1alpha3.UpdateDefaultRateDefinition" +
      "Response\"N\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\002;\"6/services" +
      "/billing/v1alpha3/updatedefaultratedefin" +
      "ition:\001*\022\261\001\n\rExportInvoice\022/.services.bi" +
      "lling.v1alpha3.ExportInvoiceRequest\0320.se" +
      "rvices.billing.v1alpha3.ExportInvoiceRes" +
      "ponse\"=\272\270\221\002\005\n\003\010\361\001\202\323\344\223\002-\"(/services/billi" +
      "ng/v1alpha3/exportinvoice:\001*B\301\001\n+com.tcn" +
      ".cloud.api.services.billing.v1alpha3B\014Se" +
      "rviceProtoP\001\242\002\003SBX\252\002\031Services.Billing.V1" +
      "alpha3\312\002\031Services\\Billing\\V1alpha3\342\002%Ser" +
      "vices\\Billing\\V1alpha3\\GPBMetadata\352\002\033Ser" +
      "vices::Billing::V1alpha3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha3.InvoiceProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha3.PlanProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha3.ProductProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha3.DefaultsProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha3.InvoiceProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha3.PlanProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha3.ProductProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
