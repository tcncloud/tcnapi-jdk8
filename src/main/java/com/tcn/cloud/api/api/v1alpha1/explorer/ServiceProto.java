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
    internal_static_api_v1alpha1_explorer_GetWeeksOfDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_GetWeeksOfDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_GetWeeksOfDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_GetWeeksOfDataResponse_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_SupportQueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_SupportQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_SupportQueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_SupportQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_QueryExplainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_QueryExplainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_explorer_QueryExplainResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_explorer_QueryExplainResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#api/v1alpha1/explorer/service.proto\022\025a" +
      "pi.v1alpha1.explorer\032\027annotations/authz." +
      "proto\032$api/v1alpha1/explorer/entities.pr" +
      "oto\032+api/v1alpha1/insights/insight_conte" +
      "nt.proto\032\034google/api/annotations.proto\032\037" +
      "google/protobuf/timestamp.proto\".\n\025GetWe" +
      "eksOfDataRequest\022\025\n\006org_id\030\001 \001(\tR\005orgId\"" +
      "\204\001\n\026GetWeeksOfDataResponse\022\"\n\rweeks_of_d" +
      "ata\030\001 \001(\005R\013weeksOfData\022F\n\021access_start_d" +
      "ate\030\002 \001(\0132\032.google.protobuf.TimestampR\017a" +
      "ccessStartDate\"\231\001\n\034ListDatasourceSchemas" +
      "Request\022)\n\020datasource_names\030\001 \003(\tR\017datas" +
      "ourceNames\022N\n\017datasource_type\030\002 \001(\0162%.ap" +
      "i.v1alpha1.explorer.DatasourceTypeR\016data" +
      "sourceType\"X\n\035ListDatasourceSchemasRespo" +
      "nse\0227\n\007schemas\030\001 \003(\0132\035.api.v1alpha1.expl" +
      "orer.SchemaR\007schemas\"\376\004\n\014QueryRequest\022\'\n" +
      "\017datasource_name\030\001 \001(\tR\016datasourceName\022N" +
      "\n\017datasource_type\030\002 \001(\0162%.api.v1alpha1.e" +
      "xplorer.DatasourceTypeR\016datasourceType\022\034" +
      "\n\010pipeline\030\003 \001(\tH\000R\010pipeline\022\024\n\004prql\030\004 \001" +
      "(\tH\000R\004prql\022F\n\rpipeline_node\030\r \001(\0132\037.api." +
      "v1alpha1.insights.PipelineH\000R\014pipelineNo" +
      "de\022\027\n\007org_ids\030\005 \003(\tR\006orgIds\0229\n\nstart_tim" +
      "e\030\006 \001(\0132\032.google.protobuf.TimestampR\tsta" +
      "rtTime\0225\n\010end_time\030\007 \001(\0132\032.google.protob" +
      "uf.TimestampR\007endTime\022\032\n\010timezone\030\010 \001(\tR" +
      "\010timezone\022R\n\023pipeline_parameters\030\t \001(\0132!" +
      ".api.v1alpha1.explorer.ParametersR\022pipel" +
      "ineParameters\022\036\n\013ui_trace_id\030\n \001(\tR\tuiTr" +
      "aceId\022\030\n\007comment\030\013 \001(\tR\007comment\022;\n\006forma" +
      "t\030\014 \001(\0162#.api.v1alpha1.explorer.ExportFo" +
      "rmatR\006formatB\007\n\005query\"Z\n\rQueryResponse\022\035" +
      "\n\nresult_url\030\001 \001(\tR\tresultUrl\022*\n\021result_" +
      "size_bytes\030\002 \001(\003R\017resultSizeBytes\"u\n\023Sup" +
      "portQueryRequest\022H\n\rquery_request\030\001 \001(\0132" +
      "#.api.v1alpha1.explorer.QueryRequestR\014qu" +
      "eryRequest\022\024\n\005debug\030\002 \001(\010R\005debug\"\241\001\n\024Sup" +
      "portQueryResponse\022\035\n\nresult_url\030\001 \001(\tR\tr" +
      "esultUrl\022*\n\021result_size_bytes\030\002 \001(\003R\017res" +
      "ultSizeBytes\022\022\n\004prql\030\003 \001(\tR\004prql\022\020\n\003sql\030" +
      "\004 \001(\tR\003sql\022\030\n\007explain\030\005 \001(\tR\007explain\"_\n\023" +
      "QueryExplainRequest\022H\n\rquery_request\030\001 \001" +
      "(\0132#.api.v1alpha1.explorer.QueryRequestR" +
      "\014queryRequest\"\241\001\n\024QueryExplainResponse\022\035" +
      "\n\nresult_url\030\001 \001(\tR\tresultUrl\022*\n\021result_" +
      "size_bytes\030\002 \001(\003R\017resultSizeBytes\022\022\n\004prq" +
      "l\030\003 \001(\tR\004prql\022\020\n\003sql\030\004 \001(\tR\003sql\022\030\n\007expla" +
      "in\030\005 \001(\tR\007explain2\205\007\n\017ExplorerService\022\313\001" +
      "\n\025ListDatasourceSchemas\0223.api.v1alpha1.e" +
      "xplorer.ListDatasourceSchemasRequest\0324.a" +
      "pi.v1alpha1.explorer.ListDatasourceSchem" +
      "asResponse\"G\272\270\221\002\002\030\001\202\323\344\223\002:\"5/api/v1alpha1" +
      "/explorer/explorer/listdatasourceschemas" +
      ":\001*\022\213\001\n\005Query\022#.api.v1alpha1.explorer.Qu" +
      "eryRequest\032$.api.v1alpha1.explorer.Query" +
      "Response\"7\272\270\221\002\002\030\001\202\323\344\223\002*\"%/api/v1alpha1/e" +
      "xplorer/explorer/query:\001*\022\260\001\n\017GetSupport" +
      "Query\022*.api.v1alpha1.explorer.SupportQue" +
      "ryRequest\032+.api.v1alpha1.explorer.Suppor" +
      "tQueryResponse\"D\272\270\221\002\005\n\003\010\372\001\202\323\344\223\0024\"//api/v" +
      "1alpha1/explorer/explorer/getsupportquer" +
      "y:\001*\022\260\001\n\017GetQueryExplain\022*.api.v1alpha1." +
      "explorer.QueryExplainRequest\032+.api.v1alp" +
      "ha1.explorer.QueryExplainResponse\"D\272\270\221\002\005" +
      "\n\003\010\310\001\202\323\344\223\0024\"//api/v1alpha1/explorer/expl" +
      "orer/getqueryexplain:\001*\022\257\001\n\016GetWeeksOfDa" +
      "ta\022,.api.v1alpha1.explorer.GetWeeksOfDat" +
      "aRequest\032-.api.v1alpha1.explorer.GetWeek" +
      "sOfDataResponse\"@\272\270\221\002\002\030\001\202\323\344\223\0023\"./api/v1a" +
      "lpha1/explorer/explorer/getweeksofdata:\001" +
      "*B\255\001\n\'com.tcn.cloud.api.api.v1alpha1.exp" +
      "lorerB\014ServiceProtoP\001\242\002\003AVE\252\002\025Api.V1alph" +
      "a1.Explorer\312\002\025Api\\V1alpha1\\Explorer\342\002!Ap" +
      "i\\V1alpha1\\Explorer\\GPBMetadata\352\002\027Api::V" +
      "1alpha1::Explorerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_explorer_GetWeeksOfDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_explorer_GetWeeksOfDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_GetWeeksOfDataRequest_descriptor,
        new java.lang.String[] { "OrgId", });
    internal_static_api_v1alpha1_explorer_GetWeeksOfDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_explorer_GetWeeksOfDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_GetWeeksOfDataResponse_descriptor,
        new java.lang.String[] { "WeeksOfData", "AccessStartDate", });
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_ListDatasourceSchemasRequest_descriptor,
        new java.lang.String[] { "DatasourceNames", "DatasourceType", });
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_explorer_ListDatasourceSchemasResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_ListDatasourceSchemasResponse_descriptor,
        new java.lang.String[] { "Schemas", });
    internal_static_api_v1alpha1_explorer_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_explorer_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_QueryRequest_descriptor,
        new java.lang.String[] { "DatasourceName", "DatasourceType", "Pipeline", "Prql", "PipelineNode", "OrgIds", "StartTime", "EndTime", "Timezone", "PipelineParameters", "UiTraceId", "Comment", "Format", "Query", });
    internal_static_api_v1alpha1_explorer_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_explorer_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_QueryResponse_descriptor,
        new java.lang.String[] { "ResultUrl", "ResultSizeBytes", });
    internal_static_api_v1alpha1_explorer_SupportQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_explorer_SupportQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_SupportQueryRequest_descriptor,
        new java.lang.String[] { "QueryRequest", "Debug", });
    internal_static_api_v1alpha1_explorer_SupportQueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_explorer_SupportQueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_SupportQueryResponse_descriptor,
        new java.lang.String[] { "ResultUrl", "ResultSizeBytes", "Prql", "Sql", "Explain", });
    internal_static_api_v1alpha1_explorer_QueryExplainRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_explorer_QueryExplainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_QueryExplainRequest_descriptor,
        new java.lang.String[] { "QueryRequest", });
    internal_static_api_v1alpha1_explorer_QueryExplainResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_explorer_QueryExplainResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_explorer_QueryExplainResponse_descriptor,
        new java.lang.String[] { "ResultUrl", "ResultSizeBytes", "Prql", "Sql", "Explain", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.insights.InsightContentProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
