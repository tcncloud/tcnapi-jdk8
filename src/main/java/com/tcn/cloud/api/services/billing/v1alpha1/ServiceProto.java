// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/service.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

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
      "\n\'services/billing/v1alpha1/service.prot" +
      "o\022\031services.billing.v1alpha1\032\027annotation" +
      "s/authz.proto\032\034google/api/annotations.pr" +
      "oto\032(services/billing/v1alpha1/invoices." +
      "proto\032%services/billing/v1alpha1/plans.p" +
      "roto\032%services/billing/v1alpha1/rates.pr" +
      "oto2\250+\n\016BillingService\022\301\001\n\021CommitBilling" +
      "Plan\0223.services.billing.v1alpha1.CommitB" +
      "illingPlanRequest\0324.services.billing.v1a" +
      "lpha1.CommitBillingPlanResponse\"A\272\270\221\002\005\n\003" +
      "\010\310\001\202\323\344\223\0021\",/services/billing/v1alpha1/co" +
      "mmitbillingplan:\001*\022\340\001\n\030CommitDefaultBill" +
      "ingPlan\022:.services.billing.v1alpha1.Comm" +
      "itDefaultBillingPlanRequest\032;.services.b" +
      "illing.v1alpha1.CommitDefaultBillingPlan" +
      "Response\"K\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\0028\"3/services" +
      "/billing/v1alpha1/commitdefaultbillingpl" +
      "an:\001*\022\301\001\n\021CreateBillingPlan\0223.services.b" +
      "illing.v1alpha1.CreateBillingPlanRequest" +
      "\0324.services.billing.v1alpha1.CreateBilli" +
      "ngPlanResponse\"A\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0021\",/servi" +
      "ces/billing/v1alpha1/createbillingplan:\001" +
      "*\022\340\001\n\030CreateDefaultBillingPlan\022:.service" +
      "s.billing.v1alpha1.CreateDefaultBillingP" +
      "lanRequest\032;.services.billing.v1alpha1.C" +
      "reateDefaultBillingPlanResponse\"K\272\270\221\002\010\n\006" +
      "\010\310\001\010\361\001\202\323\344\223\0028\"3/services/billing/v1alpha1" +
      "/createdefaultbillingplan:\001*\022\354\001\n\033CreateD" +
      "efaultRateDefinition\022=.services.billing." +
      "v1alpha1.CreateDefaultRateDefinitionRequ" +
      "est\032>.services.billing.v1alpha1.CreateDe" +
      "faultRateDefinitionResponse\"N\272\270\221\002\010\n\006\010\310\001\010" +
      "\361\001\202\323\344\223\002;\"6/services/billing/v1alpha1/cre" +
      "atedefaultratedefinition:\001*\022\261\001\n\rCreateIn" +
      "voice\022/.services.billing.v1alpha1.Create" +
      "InvoiceRequest\0320.services.billing.v1alph" +
      "a1.CreateInvoiceResponse\"=\272\270\221\002\005\n\003\010\310\001\202\323\344\223" +
      "\002-\"(/services/billing/v1alpha1/createinv" +
      "oice:\001*\022\315\001\n\024CreateRateDefinition\0226.servi" +
      "ces.billing.v1alpha1.CreateRateDefinitio" +
      "nRequest\0327.services.billing.v1alpha1.Cre" +
      "ateRateDefinitionResponse\"D\272\270\221\002\005\n\003\010\310\001\202\323\344" +
      "\223\0024\"//services/billing/v1alpha1/createra" +
      "tedefinition:\001*\022\301\001\n\021DeleteBillingPlan\0223." +
      "services.billing.v1alpha1.DeleteBillingP" +
      "lanRequest\0324.services.billing.v1alpha1.D" +
      "eleteBillingPlanResponse\"A\272\270\221\002\005\n\003\010\310\001\202\323\344\223" +
      "\0021\",/services/billing/v1alpha1/deletebil" +
      "lingplan:\001*\022\340\001\n\030DeleteDefaultBillingPlan" +
      "\022:.services.billing.v1alpha1.DeleteDefau" +
      "ltBillingPlanRequest\032;.services.billing." +
      "v1alpha1.DeleteDefaultBillingPlanRespons" +
      "e\"K\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\0028\"3/services/billin" +
      "g/v1alpha1/deletedefaultbillingplan:\001*\022\354" +
      "\001\n\033DeleteDefaultRateDefinition\022=.service" +
      "s.billing.v1alpha1.DeleteDefaultRateDefi" +
      "nitionRequest\032>.services.billing.v1alpha" +
      "1.DeleteDefaultRateDefinitionResponse\"N\272" +
      "\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\002;\"6/services/billing/v1" +
      "alpha1/deletedefaultratedefinition:\001*\022\261\001" +
      "\n\rDeleteInvoice\022/.services.billing.v1alp" +
      "ha1.DeleteInvoiceRequest\0320.services.bill" +
      "ing.v1alpha1.DeleteInvoiceResponse\"=\272\270\221\002" +
      "\005\n\003\010\310\001\202\323\344\223\002-\"(/services/billing/v1alpha1" +
      "/deleteinvoice:\001*\022\315\001\n\024DeleteRateDefiniti" +
      "on\0226.services.billing.v1alpha1.DeleteRat" +
      "eDefinitionRequest\0327.services.billing.v1" +
      "alpha1.DeleteRateDefinitionResponse\"D\272\270\221" +
      "\002\005\n\003\010\310\001\202\323\344\223\0024\"//services/billing/v1alpha" +
      "1/deleteratedefinition:\001*\022\315\001\n\024DuplicateB" +
      "illingPlan\0226.services.billing.v1alpha1.D" +
      "uplicateBillingPlanRequest\0327.services.bi" +
      "lling.v1alpha1.DuplicateBillingPlanRespo" +
      "nse\"D\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0024\"//services/billing" +
      "/v1alpha1/duplicatebillingplan:\001*\022\354\001\n\033Du" +
      "plicateDefaultBillingPlan\022=.services.bil" +
      "ling.v1alpha1.DuplicateDefaultBillingPla" +
      "nRequest\032>.services.billing.v1alpha1.Dup" +
      "licateDefaultBillingPlanResponse\"N\272\270\221\002\010\n" +
      "\006\010\310\001\010\361\001\202\323\344\223\002;\"6/services/billing/v1alpha" +
      "1/duplicatedefaultbillingplan:\001*\022\261\001\n\rExp" +
      "ortInvoice\022/.services.billing.v1alpha1.E" +
      "xportInvoiceRequest\0320.services.billing.v" +
      "1alpha1.ExportInvoiceResponse\"=\272\270\221\002\005\n\003\010\310" +
      "\001\202\323\344\223\002-\"(/services/billing/v1alpha1/expo" +
      "rtinvoice:\001*\022\315\001\n\024GetActiveBillingPlan\0226." +
      "services.billing.v1alpha1.GetActiveBilli" +
      "ngPlanRequest\0327.services.billing.v1alpha" +
      "1.GetActiveBillingPlanResponse\"D\272\270\221\002\005\n\003\010" +
      "\310\001\202\323\344\223\0024\"//services/billing/v1alpha1/get" +
      "activebillingplan:\001*\022\265\001\n\016GetBillingPlan\022" +
      "0.services.billing.v1alpha1.GetBillingPl" +
      "anRequest\0321.services.billing.v1alpha1.Ge" +
      "tBillingPlanResponse\">\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002.\")" +
      "/services/billing/v1alpha1/getbillingpla" +
      "n:\001*\022\245\001\n\nGetInvoice\022,.services.billing.v" +
      "1alpha1.GetInvoiceRequest\032-.services.bil" +
      "ling.v1alpha1.GetInvoiceResponse\":\272\270\221\002\005\n" +
      "\003\010\310\001\202\323\344\223\002*\"%/services/billing/v1alpha1/g" +
      "etinvoice:\001*\022\301\001\n\021GetRateDefinition\0223.ser" +
      "vices.billing.v1alpha1.GetRateDefinition" +
      "Request\0324.services.billing.v1alpha1.GetR" +
      "ateDefinitionResponse\"A\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0021\"" +
      ",/services/billing/v1alpha1/getratedefin" +
      "ition:\001*\022\275\001\n\020ListBillingPlans\0222.services" +
      ".billing.v1alpha1.ListBillingPlansReques" +
      "t\0323.services.billing.v1alpha1.ListBillin" +
      "gPlansResponse\"@\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0020\"+/servi" +
      "ces/billing/v1alpha1/listbillingplans:\001*" +
      "\022\255\001\n\014ListInvoices\022..services.billing.v1a" +
      "lpha1.ListInvoicesRequest\032/.services.bil" +
      "ling.v1alpha1.ListInvoicesResponse\"<\272\270\221\002" +
      "\005\n\003\010\310\001\202\323\344\223\002,\"\'/services/billing/v1alpha1" +
      "/listinvoices:\001*\022\311\001\n\023ListRateDefinitions" +
      "\0225.services.billing.v1alpha1.ListRateDef" +
      "initionsRequest\0326.services.billing.v1alp" +
      "ha1.ListRateDefinitionsResponse\"C\272\270\221\002\005\n\003" +
      "\010\310\001\202\323\344\223\0023\"./services/billing/v1alpha1/li" +
      "stratedefinitions:\001*\022\301\001\n\021UpdateBillingPl" +
      "an\0223.services.billing.v1alpha1.UpdateBil" +
      "lingPlanRequest\0324.services.billing.v1alp" +
      "ha1.UpdateBillingPlanResponse\"A\272\270\221\002\005\n\003\010\310" +
      "\001\202\323\344\223\0021\",/services/billing/v1alpha1/upda" +
      "tebillingplan:\001*\022\340\001\n\030UpdateDefaultBillin" +
      "gPlan\022:.services.billing.v1alpha1.Update" +
      "DefaultBillingPlanRequest\032;.services.bil" +
      "ling.v1alpha1.UpdateDefaultBillingPlanRe" +
      "sponse\"K\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\0028\"3/services/b" +
      "illing/v1alpha1/updatedefaultbillingplan" +
      ":\001*\022\354\001\n\033UpdateDefaultRateDefinition\022=.se" +
      "rvices.billing.v1alpha1.UpdateDefaultRat" +
      "eDefinitionRequest\032>.services.billing.v1" +
      "alpha1.UpdateDefaultRateDefinitionRespon" +
      "se\"N\272\270\221\002\010\n\006\010\310\001\010\361\001\202\323\344\223\002;\"6/services/billi" +
      "ng/v1alpha1/updatedefaultratedefinition:" +
      "\001*\022\261\001\n\rUpdateInvoice\022/.services.billing." +
      "v1alpha1.UpdateInvoiceRequest\0320.services" +
      ".billing.v1alpha1.UpdateInvoiceResponse\"" +
      "=\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002-\"(/services/billing/v1a" +
      "lpha1/updateinvoice:\001*\022\315\001\n\024UpdateRateDef" +
      "inition\0226.services.billing.v1alpha1.Upda" +
      "teRateDefinitionRequest\0327.services.billi" +
      "ng.v1alpha1.UpdateRateDefinitionResponse" +
      "\"D\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0024\"//services/billing/v1" +
      "alpha1/updateratedefinition:\001*B\301\001\n+com.t" +
      "cn.cloud.api.services.billing.v1alpha1B\014" +
      "ServiceProtoP\001\242\002\003SBX\252\002\031Services.Billing." +
      "V1alpha1\312\002\031Services\\Billing\\V1alpha1\342\002%S" +
      "ervices\\Billing\\V1alpha1\\GPBMetadata\352\002\033S" +
      "ervices::Billing::V1alpha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha1.InvoicesProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.getDescriptor(),
          com.tcn.cloud.api.services.billing.v1alpha1.RatesProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha1.InvoicesProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.getDescriptor();
    com.tcn.cloud.api.services.billing.v1alpha1.RatesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}