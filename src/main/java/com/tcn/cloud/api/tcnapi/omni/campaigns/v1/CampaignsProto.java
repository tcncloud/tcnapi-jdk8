// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tcnapi/omni/campaigns/v1/campaigns.proto

package com.tcn.cloud.api.tcnapi.omni.campaigns.v1;

public final class CampaignsProto {
  private CampaignsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tcnapi_omni_campaigns_v1_Campaign_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tcnapi_omni_campaigns_v1_Campaign_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tcnapi_omni_campaigns_v1_Campaign_Module_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tcnapi_omni_campaigns_v1_Campaign_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(tcnapi/omni/campaigns/v1/campaigns.pro" +
      "to\022\030tcnapi.omni.campaigns.v1\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\032\037google/protobuf/timestamp.prot" +
      "o\"\337\007\n\010Campaign\022\027\n\004name\030\001 \001(\003B\003\340A\010R\004name\022" +
      "\031\n\005title\030\002 \001(\tB\003\340A\002R\005title\022%\n\013descriptio" +
      "n\030\003 \001(\tB\003\340A\002R\013description\0229\n\nstart_date\030" +
      "\004 \001(\0132\032.google.protobuf.TimestampR\tstart" +
      "Date\022I\n\006status\030\005 \001(\01621.tcnapi.omni.campa" +
      "igns.v1.Campaign.CampaignStatusR\006status\022" +
      "Q\n\014channel_type\030\006 \001(\0162..tcnapi.omni.camp" +
      "aigns.v1.Campaign.ChannelTypeR\013channelTy" +
      "pe\022@\n\013create_time\030\007 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\003R\ncreateTime\022@\n\013update_t" +
      "ime\030\010 \001(\0132\032.google.protobuf.TimestampB\003\340" +
      "A\003R\nupdateTime\022$\n\013project_sid\030\t \001(\003B\003\340A\002" +
      "R\nprojectSid\032\010\n\006Module\"\205\001\n\013ChannelType\022\026" +
      "\n\022CHANNEL_TYPE_EMAIL\020\000\022\024\n\020CHANNEL_TYPE_S" +
      "MS\020\001\022\025\n\021CHANNEL_TYPE_CHAT\020\002\022\026\n\022CHANNEL_T" +
      "YPE_VOICE\020\003\022\031\n\025CHANNEL_TYPE_WHATSAPP\020\004\"\362" +
      "\001\n\016CampaignStatus\022\016\n\nSCHEDULING\020\000\022\014\n\007RUN" +
      "NING\020\310\001\022\013\n\006PAUSED\020\220\003\022\016\n\tCOMPLETED\020\330\004\022\r\n\010" +
      "ARCHIVED\020\240\006\"\006\010\212\005\020\212\005\"\006\010\274\005\020\274\005\"\006\010\356\005\020\356\005\"\004\010d\020" +
      "d\"\006\010\372\001\020\372\001\"\006\010\254\002\020\254\002\"\006\010\364\003\020\364\003*\020COMPLETED_SUM" +
      "MED*\tCANCELLED*\020CANCELLED_SUMMED*\tPREPAR" +
      "ING*\rRUNNING_ERROR*\rERROR_STANDBY*\010RESUM" +
      "ING:n\352Ak\n\"campaigns.omni.tcnapi.com/Camp" +
      "aign\0220regions/{region}/orgs/{org}/campai" +
      "gns/{campaign}*\tcampaigns2\010campaignB\277\001\n*" +
      "com.tcn.cloud.api.tcnapi.omni.campaigns." +
      "v1B\016CampaignsProtoP\001\242\002\003TOC\252\002\030Tcnapi.Omni" +
      ".Campaigns.V1\312\002\030Tcnapi\\Omni\\Campaigns\\V1" +
      "\342\002$Tcnapi\\Omni\\Campaigns\\V1\\GPBMetadata\352" +
      "\002\033Tcnapi::Omni::Campaigns::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_tcnapi_omni_campaigns_v1_Campaign_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tcnapi_omni_campaigns_v1_Campaign_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tcnapi_omni_campaigns_v1_Campaign_descriptor,
        new java.lang.String[] { "Name", "Title", "Description", "StartDate", "Status", "ChannelType", "CreateTime", "UpdateTime", "ProjectSid", });
    internal_static_tcnapi_omni_campaigns_v1_Campaign_Module_descriptor =
      internal_static_tcnapi_omni_campaigns_v1_Campaign_descriptor.getNestedTypes().get(0);
    internal_static_tcnapi_omni_campaigns_v1_Campaign_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tcnapi_omni_campaigns_v1_Campaign_Module_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
