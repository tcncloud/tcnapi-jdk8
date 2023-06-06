// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/cfg.proto

package com.tcn.cloud.api.api.v0alpha;

public final class CfgProto {
  private CfgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v0alpha_GetConfigReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v0alpha_GetConfigReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v0alpha_WebAgent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v0alpha_WebAgent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v0alpha_WebAgent_OpenSips_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v0alpha_WebAgent_OpenSips_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v0alpha_WebAgent_EnginePriority_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v0alpha_WebAgent_EnginePriority_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v0alpha_WebAgent_Server_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v0alpha_WebAgent_Server_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025api/v0alpha/cfg.proto\022\013api.v0alpha\032\027an" +
      "notations/authz.proto\032\034google/api/annota" +
      "tions.proto\"+\n\014GetConfigReq\022\033\n\tregion_id" +
      "\030\001 \001(\tR\010regionId\"\225\006\n\010WebAgent\022;\n\topen_si" +
      "ps\030\001 \001(\0132\036.api.v0alpha.WebAgent.OpenSips" +
      "R\010openSips\022M\n\017engine_priority\030\002 \001(\0132$.ap" +
      "i.v0alpha.WebAgent.EnginePriorityR\016engin" +
      "ePriority\022\033\n\tlog_level\030\003 \001(\003R\010logLevel\022\031" +
      "\n\010use_stun\030\004 \001(\003R\007useStun\022\"\n\ruse_fast_st" +
      "un\030\005 \001(\003R\013useFastStun\022 \n\014use_fast_ice\030\006 " +
      "\001(\003R\nuseFastIce\022\037\n\013ice_timeout\030\007 \001(\003R\nic" +
      "eTimeout\022&\n\017set_final_codec\030\010 \001(\003R\rsetFi" +
      "nalCodec\022\033\n\tuse_rport\030\t \001(\003R\010useRport\0224\n" +
      "\006server\030\n \001(\0132\034.api.v0alpha.WebAgent.Ser" +
      "verR\006server\022\031\n\010base_url\030\013 \001(\tR\007baseUrl\022." +
      "\n\023stun_server_address\030\014 \001(\tR\021stunServerA" +
      "ddress\032$\n\010OpenSips\022\030\n\007address\030\001 \001(\tR\007add" +
      "ress\032\275\001\n\016EnginePriority\022\022\n\004java\030\001 \001(\003R\004j" +
      "ava\022\026\n\006webrtc\030\002 \001(\003R\006webrtc\022\016\n\002ns\030\003 \001(\003R" +
      "\002ns\022\024\n\005flash\030\004 \001(\003R\005flash\022\020\n\003app\030\005 \001(\003R\003" +
      "app\022\020\n\003p2p\030\006 \001(\003R\003p2p\022\035\n\naccess_num\030\007 \001(" +
      "\003R\taccessNum\022\026\n\006native\030\010 \001(\003R\006native\0322\n\006" +
      "Server\022\020\n\003sip\030\001 \001(\tR\003sip\022\026\n\006webrtc\030\002 \001(\t" +
      "R\006webrtc2\202\001\n\003Cfg\022{\n\021GetWebAgentConfig\022\031." +
      "api.v0alpha.GetConfigReq\032\025.api.v0alpha.W" +
      "ebAgent\"4\272\270\221\002\002\030\001\202\323\344\223\002\'\"\"/api/v0alpha/cfg" +
      "/getwebagentconfig:\001*Bv\n\035com.tcn.cloud.a" +
      "pi.api.v0alphaB\010CfgProtoP\001\242\002\003AVX\252\002\013Api.V" +
      "0alpha\312\002\013Api\\V0alpha\342\002\027Api\\V0alpha\\GPBMe" +
      "tadata\352\002\014Api::V0alphab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_api_v0alpha_GetConfigReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v0alpha_GetConfigReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v0alpha_GetConfigReq_descriptor,
        new java.lang.String[] { "RegionId", });
    internal_static_api_v0alpha_WebAgent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v0alpha_WebAgent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v0alpha_WebAgent_descriptor,
        new java.lang.String[] { "OpenSips", "EnginePriority", "LogLevel", "UseStun", "UseFastStun", "UseFastIce", "IceTimeout", "SetFinalCodec", "UseRport", "Server", "BaseUrl", "StunServerAddress", });
    internal_static_api_v0alpha_WebAgent_OpenSips_descriptor =
      internal_static_api_v0alpha_WebAgent_descriptor.getNestedTypes().get(0);
    internal_static_api_v0alpha_WebAgent_OpenSips_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v0alpha_WebAgent_OpenSips_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_api_v0alpha_WebAgent_EnginePriority_descriptor =
      internal_static_api_v0alpha_WebAgent_descriptor.getNestedTypes().get(1);
    internal_static_api_v0alpha_WebAgent_EnginePriority_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v0alpha_WebAgent_EnginePriority_descriptor,
        new java.lang.String[] { "Java", "Webrtc", "Ns", "Flash", "App", "P2P", "AccessNum", "Native", });
    internal_static_api_v0alpha_WebAgent_Server_descriptor =
      internal_static_api_v0alpha_WebAgent_descriptor.getNestedTypes().get(2);
    internal_static_api_v0alpha_WebAgent_Server_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v0alpha_WebAgent_Server_descriptor,
        new java.lang.String[] { "Sip", "Webrtc", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
