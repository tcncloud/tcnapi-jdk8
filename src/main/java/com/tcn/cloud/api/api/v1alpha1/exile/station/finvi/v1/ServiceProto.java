// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/exile/station/finvi/v1/service.proto

package com.tcn.cloud.api.api.v1alpha1.exile.station.finvi.v1;

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
    internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1api/v1alpha1/exile/station/finvi/v1/se" +
      "rvice.proto\022#api.v1alpha1.exile.station." +
      "finvi.v1\032\027annotations/authz.proto\032\034googl" +
      "e/api/annotations.proto\032\036google/protobuf" +
      "/duration.proto\"\254\001\n\rPopAccountReq\022\033\n\trec" +
      "ord_id\030\n \001(\tR\010recordId\022\027\n\007user_id\030\013 \001(\tR" +
      "\006userId\022!\n\014alternate_id\030\014 \001(\tR\013alternate" +
      "Id\022\031\n\010call_sid\030\r \001(\003R\007callSid\022\033\n\tcall_ty" +
      "pe\030\016 \001(\tR\010callTypeJ\004\010\001\020\002J\004\010\002\020\003\"<\n\rPopAcc" +
      "ountRes\022\025\n\006job_id\030\001 \001(\003R\005jobId\022\024\n\005async\030" +
      "\002 \001(\010R\005async2\346\001\n\023GenericFinviService\022\316\001\n" +
      "\nPopAccount\0222.api.v1alpha1.exile.station" +
      ".finvi.v1.PopAccountReq\0322.api.v1alpha1.e" +
      "xile.station.finvi.v1.PopAccountRes\"X\272\270\221" +
      "\002\005\n\003\010\254\002\202\323\344\223\002H\"C/api/v1alpha1/exile/stati" +
      "on/finvi/v1/genericfinviservice/popaccou" +
      "nt:\001*B\370\001\n5com.tcn.cloud.api.api.v1alpha1" +
      ".exile.station.finvi.v1B\014ServiceProtoP\001\242" +
      "\002\005AVESF\252\002#Api.V1alpha1.Exile.Station.Fin" +
      "vi.V1\312\002#Api\\V1alpha1\\Exile\\Station\\Finvi" +
      "\\V1\342\002/Api\\V1alpha1\\Exile\\Station\\Finvi\\V" +
      "1\\GPBMetadata\352\002(Api::V1alpha1::Exile::St" +
      "ation::Finvi::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountReq_descriptor,
        new java.lang.String[] { "RecordId", "UserId", "AlternateId", "CallSid", "CallType", });
    internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_exile_station_finvi_v1_PopAccountRes_descriptor,
        new java.lang.String[] { "JobId", "Async", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
