// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/service.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_CreateReportJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_CreateReportJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_CreateReportJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_CreateReportJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_ListReportJobsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_ListReportJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_ListReportJobsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_ListReportJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_GetReportJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_GetReportJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_GetReportJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_GetReportJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_GenerateReportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_GenerateReportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,api/v1alpha1/bireportgenerator/service" +
      ".proto\022\036api.v1alpha1.bireportgenerator\032\027" +
      "annotations/authz.proto\032-api/v1alpha1/bi" +
      "reportgenerator/entities.proto\032\034google/a" +
      "pi/annotations.proto\032 google/protobuf/fi" +
      "eld_mask.proto\"b\n\026CreateReportJobRequest" +
      "\022H\n\nreport_job\030\001 \001(\0132).api.v1alpha1.bire" +
      "portgenerator.ReportJobR\treportJob\"c\n\027Cr" +
      "eateReportJobResponse\022H\n\nreport_job\030\001 \001(" +
      "\0132).api.v1alpha1.bireportgenerator.Repor" +
      "tJobR\treportJob\"\027\n\025ListReportJobsRequest" +
      "\"d\n\026ListReportJobsResponse\022J\n\013report_job" +
      "s\030\001 \003(\0132).api.v1alpha1.bireportgenerator" +
      ".ReportJobR\nreportJobs\"\237\001\n\026UpdateReportJ" +
      "obRequest\022H\n\nreport_job\030\001 \001(\0132).api.v1al" +
      "pha1.bireportgenerator.ReportJobR\treport" +
      "Job\022;\n\013update_mask\030\002 \001(\0132\032.google.protob" +
      "uf.FieldMaskR\nupdateMask\"c\n\027UpdateReport" +
      "JobResponse\022H\n\nreport_job\030\001 \001(\0132).api.v1" +
      "alpha1.bireportgenerator.ReportJobR\trepo" +
      "rtJob\"<\n\026DeleteReportJobRequest\022\"\n\rrepor" +
      "t_job_id\030\001 \001(\tR\013reportJobId\"\031\n\027DeleteRep" +
      "ortJobResponse\"9\n\023GetReportJobRequest\022\"\n" +
      "\rreport_job_id\030\001 \001(\tR\013reportJobId\"`\n\024Get" +
      "ReportJobResponse\022H\n\nreport_job\030\001 \001(\0132)." +
      "api.v1alpha1.bireportgenerator.ReportJob" +
      "R\treportJob\"a\n\025GenerateReportRequest\022H\n\n" +
      "report_job\030\001 \001(\0132).api.v1alpha1.bireport" +
      "generator.ReportJobR\treportJob\"\030\n\026Genera" +
      "teReportResponse2\234\n\n\030BIReportGeneratorSe" +
      "rvice\022\326\001\n\017CreateReportJob\0226.api.v1alpha1" +
      ".bireportgenerator.CreateReportJobReques" +
      "t\0327.api.v1alpha1.bireportgenerator.Creat" +
      "eReportJobResponse\"R\272\270\221\002\005\n\003\010\331\004\202\323\344\223\002B\"=/a" +
      "pi/v1alpha1/reportgenerator/reportgenera" +
      "tor/createreportjob:\001*\022\322\001\n\016ListReportJob" +
      "s\0225.api.v1alpha1.bireportgenerator.ListR" +
      "eportJobsRequest\0326.api.v1alpha1.bireport" +
      "generator.ListReportJobsResponse\"Q\272\270\221\002\005\n" +
      "\003\010\331\004\202\323\344\223\002A\"</api/v1alpha1/reportgenerato" +
      "r/reportgenerator/listreportjobs:\001*\022\326\001\n\017" +
      "UpdateReportJob\0226.api.v1alpha1.bireportg" +
      "enerator.UpdateReportJobRequest\0327.api.v1" +
      "alpha1.bireportgenerator.UpdateReportJob" +
      "Response\"R\272\270\221\002\005\n\003\010\331\004\202\323\344\223\002B\"=/api/v1alpha" +
      "1/reportgenerator/reportgenerator/update" +
      "reportjob:\001*\022\326\001\n\017DeleteReportJob\0226.api.v" +
      "1alpha1.bireportgenerator.DeleteReportJo" +
      "bRequest\0327.api.v1alpha1.bireportgenerato" +
      "r.DeleteReportJobResponse\"R\272\270\221\002\005\n\003\010\331\004\202\323\344" +
      "\223\002B\"=/api/v1alpha1/reportgenerator/repor" +
      "tgenerator/deletereportjob:\001*\022\312\001\n\014GetRep" +
      "ortJob\0223.api.v1alpha1.bireportgenerator." +
      "GetReportJobRequest\0324.api.v1alpha1.birep" +
      "ortgenerator.GetReportJobResponse\"O\272\270\221\002\005" +
      "\n\003\010\331\004\202\323\344\223\002?\":/api/v1alpha1/reportgenerat" +
      "or/reportgenerator/getreportjob:\001*\022\322\001\n\016G" +
      "enerateReport\0225.api.v1alpha1.bireportgen" +
      "erator.GenerateReportRequest\0326.api.v1alp" +
      "ha1.bireportgenerator.GenerateReportResp" +
      "onse\"Q\272\270\221\002\005\n\003\010\331\004\202\323\344\223\002A\"</api/v1alpha1/re" +
      "portgenerator/reportgenerator/generatere" +
      "port:\001*B\332\001\n0com.tcn.cloud.api.api.v1alph" +
      "a1.bireportgeneratorB\014ServiceProtoP\001\242\002\003A" +
      "VB\252\002\036Api.V1alpha1.Bireportgenerator\312\002\036Ap" +
      "i\\V1alpha1\\Bireportgenerator\342\002*Api\\V1alp" +
      "ha1\\Bireportgenerator\\GPBMetadata\352\002 Api:" +
      ":V1alpha1::Bireportgeneratorb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.bireportgenerator.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_bireportgenerator_CreateReportJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_bireportgenerator_CreateReportJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_CreateReportJobRequest_descriptor,
        new java.lang.String[] { "ReportJob", });
    internal_static_api_v1alpha1_bireportgenerator_CreateReportJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_bireportgenerator_CreateReportJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_CreateReportJobResponse_descriptor,
        new java.lang.String[] { "ReportJob", });
    internal_static_api_v1alpha1_bireportgenerator_ListReportJobsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_bireportgenerator_ListReportJobsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_ListReportJobsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_bireportgenerator_ListReportJobsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_bireportgenerator_ListReportJobsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_ListReportJobsResponse_descriptor,
        new java.lang.String[] { "ReportJobs", });
    internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobRequest_descriptor,
        new java.lang.String[] { "ReportJob", "UpdateMask", });
    internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_UpdateReportJobResponse_descriptor,
        new java.lang.String[] { "ReportJob", });
    internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobRequest_descriptor,
        new java.lang.String[] { "ReportJobId", });
    internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_DeleteReportJobResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_bireportgenerator_GetReportJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_bireportgenerator_GetReportJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_GetReportJobRequest_descriptor,
        new java.lang.String[] { "ReportJobId", });
    internal_static_api_v1alpha1_bireportgenerator_GetReportJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_bireportgenerator_GetReportJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_GetReportJobResponse_descriptor,
        new java.lang.String[] { "ReportJob", });
    internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_descriptor,
        new java.lang.String[] { "ReportJob", });
    internal_static_api_v1alpha1_bireportgenerator_GenerateReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_bireportgenerator_GenerateReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_GenerateReportResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.bireportgenerator.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
