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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamResponse_fieldAccessorTable;

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
      "annotations/authz.proto\032#api/commons/bir" +
      "eportgenerator.proto\032-api/v1alpha1/birep" +
      "ortgenerator/entities.proto\032\034google/api/" +
      "annotations.proto\032 google/protobuf/field" +
      "_mask.proto\032\037google/protobuf/timestamp.p" +
      "roto\"b\n\026CreateReportJobRequest\022H\n\nreport" +
      "_job\030\001 \001(\0132).api.v1alpha1.bireportgenera" +
      "tor.ReportJobR\treportJob\"c\n\027CreateReport" +
      "JobResponse\022H\n\nreport_job\030\001 \001(\0132).api.v1" +
      "alpha1.bireportgenerator.ReportJobR\trepo" +
      "rtJob\"\027\n\025ListReportJobsRequest\"d\n\026ListRe" +
      "portJobsResponse\022J\n\013report_jobs\030\001 \003(\0132)." +
      "api.v1alpha1.bireportgenerator.ReportJob" +
      "R\nreportJobs\"\237\001\n\026UpdateReportJobRequest\022" +
      "H\n\nreport_job\030\001 \001(\0132).api.v1alpha1.birep" +
      "ortgenerator.ReportJobR\treportJob\022;\n\013upd" +
      "ate_mask\030\002 \001(\0132\032.google.protobuf.FieldMa" +
      "skR\nupdateMask\"c\n\027UpdateReportJobRespons" +
      "e\022H\n\nreport_job\030\001 \001(\0132).api.v1alpha1.bir" +
      "eportgenerator.ReportJobR\treportJob\"<\n\026D" +
      "eleteReportJobRequest\022\"\n\rreport_job_id\030\001" +
      " \001(\tR\013reportJobId\"\031\n\027DeleteReportJobResp" +
      "onse\"9\n\023GetReportJobRequest\022\"\n\rreport_jo" +
      "b_id\030\001 \001(\tR\013reportJobId\"`\n\024GetReportJobR" +
      "esponse\022H\n\nreport_job\030\001 \001(\0132).api.v1alph" +
      "a1.bireportgenerator.ReportJobR\treportJo" +
      "b\"\244\001\n\025GenerateReportRequest\022H\n\nreport_jo" +
      "b\030\001 \001(\0132).api.v1alpha1.bireportgenerator" +
      ".ReportJobR\treportJob\022A\n\017send_as_of_date" +
      "\030\002 \001(\0132\032.google.protobuf.TimestampR\014send" +
      "AsOfDate\"\030\n\026GenerateReportResponse\"\217\001\n\033L" +
      "istReportLogsStreamRequest\0229\n\nstart_time" +
      "\030\001 \001(\0132\032.google.protobuf.TimestampR\tstar" +
      "tTime\0225\n\010end_time\030\002 \001(\0132\032.google.protobu" +
      "f.TimestampR\007endTime\"h\n\034ListReportLogsSt" +
      "reamResponse\022H\n\nreport_log\030\001 \001(\0132).api.v" +
      "1alpha1.bireportgenerator.ReportLogR\trep" +
      "ortLog2\213\014\n\030BIReportGeneratorService\022\326\001\n\017" +
      "CreateReportJob\0226.api.v1alpha1.bireportg" +
      "enerator.CreateReportJobRequest\0327.api.v1" +
      "alpha1.bireportgenerator.CreateReportJob" +
      "Response\"R\272\270\221\002\005\n\003\010\341\004\202\323\344\223\002B\"=/api/v1alpha" +
      "1/reportgenerator/reportgenerator/create" +
      "reportjob:\001*\022\322\001\n\016ListReportJobs\0225.api.v1" +
      "alpha1.bireportgenerator.ListReportJobsR" +
      "equest\0326.api.v1alpha1.bireportgenerator." +
      "ListReportJobsResponse\"Q\272\270\221\002\005\n\003\010\341\004\202\323\344\223\002A" +
      "\"</api/v1alpha1/reportgenerator/reportge" +
      "nerator/listreportjobs:\001*\022\326\001\n\017UpdateRepo" +
      "rtJob\0226.api.v1alpha1.bireportgenerator.U" +
      "pdateReportJobRequest\0327.api.v1alpha1.bir" +
      "eportgenerator.UpdateReportJobResponse\"R" +
      "\272\270\221\002\005\n\003\010\341\004\202\323\344\223\002B\"=/api/v1alpha1/reportge" +
      "nerator/reportgenerator/updatereportjob:" +
      "\001*\022\326\001\n\017DeleteReportJob\0226.api.v1alpha1.bi" +
      "reportgenerator.DeleteReportJobRequest\0327" +
      ".api.v1alpha1.bireportgenerator.DeleteRe" +
      "portJobResponse\"R\272\270\221\002\005\n\003\010\341\004\202\323\344\223\002B\"=/api/" +
      "v1alpha1/reportgenerator/reportgenerator" +
      "/deletereportjob:\001*\022\312\001\n\014GetReportJob\0223.a" +
      "pi.v1alpha1.bireportgenerator.GetReportJ" +
      "obRequest\0324.api.v1alpha1.bireportgenerat" +
      "or.GetReportJobResponse\"O\272\270\221\002\005\n\003\010\341\004\202\323\344\223\002" +
      "?\":/api/v1alpha1/reportgenerator/reportg" +
      "enerator/getreportjob:\001*\022\322\001\n\016GenerateRep" +
      "ort\0225.api.v1alpha1.bireportgenerator.Gen" +
      "erateReportRequest\0326.api.v1alpha1.birepo" +
      "rtgenerator.GenerateReportResponse\"Q\272\270\221\002" +
      "\005\n\003\010\341\004\202\323\344\223\002A\"</api/v1alpha1/reportgenera" +
      "tor/reportgenerator/generatereport:\001*\022\354\001" +
      "\n\024ListReportLogsStream\022;.api.v1alpha1.bi" +
      "reportgenerator.ListReportLogsStreamRequ" +
      "est\032<.api.v1alpha1.bireportgenerator.Lis" +
      "tReportLogsStreamResponse\"W\272\270\221\002\005\n\003\010\341\004\202\323\344" +
      "\223\002G\"B/api/v1alpha1/reportgenerator/repor" +
      "tgenerator/listreportlogsstream:\001*0\001B\332\001\n" +
      "0com.tcn.cloud.api.api.v1alpha1.bireport" +
      "generatorB\014ServiceProtoP\001\242\002\003AVB\252\002\036Api.V1" +
      "alpha1.Bireportgenerator\312\002\036Api\\V1alpha1\\" +
      "Bireportgenerator\342\002*Api\\V1alpha1\\Birepor" +
      "tgenerator\\GPBMetadata\352\002 Api::V1alpha1::" +
      "Bireportgeneratorb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.BireportgeneratorProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.bireportgenerator.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
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
        new java.lang.String[] { "ReportJob", "SendAsOfDate", });
    internal_static_api_v1alpha1_bireportgenerator_GenerateReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_bireportgenerator_GenerateReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_GenerateReportResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamRequest_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", });
    internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_bireportgenerator_ListReportLogsStreamResponse_descriptor,
        new java.lang.String[] { "ReportLog", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.commons.BireportgeneratorProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.bireportgenerator.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
