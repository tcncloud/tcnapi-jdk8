// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/service.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

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
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_ListDatasourceSchemasResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_QueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_QueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_QueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#api/v1alpha1/explorer/service.proto\022\025a" +
      "pi.v1alpha1.explorer\032$api/v1alpha1/explo" +
      "rer/entities.proto\032\037google/protobuf/time" +
      "stamp.proto\"\036\n\034ListDatasourceSchemasRequ" +
      "est\"X\n\035ListDatasourceSchemasResponse\0227\n\007" +
      "schemas\030\001 \003(\0132\035.api.v1alpha1.explorer.Sc" +
      "hemaR\007schemas\"\371\003\n\014QueryRequest\022\'\n\017dataso" +
      "urce_name\030\001 \001(\tR\016datasourceName\022N\n\017datas" +
      "ource_type\030\002 \001(\0162%.api.v1alpha1.explorer" +
      ".DatasourceTypeR\016datasourceType\022\034\n\010pipel" +
      "ine\030\003 \001(\tH\000R\010pipeline\022\024\n\004prql\030\004 \001(\tH\000R\004p" +
      "rql\022\027\n\007org_ids\030\005 \003(\tR\006orgIds\0229\n\nstart_ti" +
      "me\030\006 \001(\0132\032.google.protobuf.TimestampR\tst" +
      "artTime\0225\n\010end_time\030\007 \001(\0132\032.google.proto" +
      "buf.TimestampR\007endTime\022\032\n\010timezone\030\010 \001(\t" +
      "R\010timezone\022R\n\023pipeline_parameters\030\t \001(\0132" +
      "!.api.v1alpha1.explorer.ParametersR\022pipe" +
      "lineParameters\022\036\n\013ui_trace_id\030\n \001(\tR\tuiT" +
      "raceId\022\030\n\007comment\030\013 \001(\tR\007commentB\007\n\005quer" +
      "y\"Z\n\rQueryResponse\022\035\n\nresult_url\030\001 \001(\tR\t" +
      "resultUrl\022*\n\021result_size_bytes\030\002 \001(\003R\017re" +
      "sultSizeBytes2\352\001\n\017ExplorerService\022\202\001\n\025Li" +
      "stDatasourceSchemas\0223.api.v1alpha1.explo" +
      "rer.ListDatasourceSchemasRequest\0324.api.v" +
      "1alpha1.explorer.ListDatasourceSchemasRe" +
      "sponse\022R\n\005Query\022#.api.v1alpha1.explorer." +
      "QueryRequest\032$.api.v1alpha1.explorer.Que" +
      "ryResponseB\255\001\n\'com.tcn.cloud.api.api.v1a" +
      "lpha1.explorerB\014ServiceProtoP\001\242\002\003AVE\252\002\025A" +
      "pi.V1alpha1.Explorer\312\002\025Api\\V1alpha1\\Expl" +
      "orer\342\002!Api\\V1alpha1\\Explorer\\GPBMetadata" +
      "\352\002\027Api::V1alpha1::Explorerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_ListDatasourceSchemasResponse_descriptor,
        new java.lang.String[] { "Schemas", });
    internal_static_api_v1alpha1_explorer_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_explorer_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_QueryRequest_descriptor,
        new java.lang.String[] { "DatasourceName", "DatasourceType", "Pipeline", "Prql", "OrgIds", "StartTime", "EndTime", "Timezone", "PipelineParameters", "UiTraceId", "Comment", "Query", });
    internal_static_api_v1alpha1_explorer_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_explorer_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_QueryResponse_descriptor,
        new java.lang.String[] { "ResultUrl", "ResultSizeBytes", });
    com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
