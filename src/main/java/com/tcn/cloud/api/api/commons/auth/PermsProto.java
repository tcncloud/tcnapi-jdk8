// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/auth/perms.proto

package com.tcn.cloud.api.api.commons.auth;

public final class PermsProto {
  private PermsProto() {}
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
      "\n\034api/commons/auth/perms.proto\022\020api.comm" +
      "ons.auth\032\033annotations/perms/tcn.proto*\205\036" +
      "\n\nPermission\022\032\n\026PERMISSION_UNSPECIFIED\020\000" +
      "\022\022\n\016PERMISSION_DEV\020\001\022\031\n\025PERMISSION_LEARN" +
      "_EDIT\020\n\022!\n\023PERMISSION_ORG_EDIT\020d\032\010\212\265\030\004\020\t" +
      "\030\001\022K\n\023PERMISSION_ORG_VIEW\020e\0322\212\265\030.\020\t\030\001\"\010O" +
      "verview\"\021Campaign Settings\"\013Preferences\022" +
      "L\n\037PERMISSION_OWNING_ORG_IMITATION\020\202\001\032&\212" +
      "\265\030\"\020\t\030\001\"\034Imitate Within Org Hierarchy\022$\n" +
      "\026PERMISSION_USER_CREATE\020v\032\010\212\265\030\004\020\t\030\002\022\"\n\024P" +
      "ERMISSION_USER_EDIT\020w\032\010\212\265\030\004\020\t\030\002\022+\n\035PERMI" +
      "SSION_USER_EDIT_PASSWORD\020x\032\010\212\265\030\004\020\t\030\002\022*\n\034" +
      "PERMISSION_USER_EDIT_OPTIONS\020y\032\010\212\265\030\004\020\t\030\002" +
      "\022+\n\034PERMISSION_LOGIN_CONNECTIONS\020\204\002\032\010\212\265\030" +
      "\004\020\t\030\002\0222\n$PERMISSION_USER_EDIT_AGENT_CALL" +
      "ER_ID\020z\032\010\212\265\030\004\020\t\030\003\022d\n\033PERMISSION_AGENT_MA" +
      "NAGEMENT\020\220\003\032B\212\265\030>\020\t\030\003\"\016Profile Groups\"\nE" +
      "xtensions\"\024Statistics Templates\"\006Skills\022" +
      ".\n PERMISSION_PERMISSION_GROUP_EDIT\020n\032\010\212" +
      "\265\030\004\020\t\030\004\0220\n\"PERMISSION_PERMISSION_GROUP_A" +
      "SSIGN\020o\032\010\212\265\030\004\020\t\030\004\022*\n\033PERMISSION_LABEL_MA" +
      "NAGEMENT\020\226\001\032\010\212\265\030\004\020\t\030\005\022,\n\033PERMISSION_TRUS" +
      "T_MANAGEMENT\020\240\001\032\n\212\265\030\006\010\001\020\t\030\006\022\225\001\n\031PERMISSI" +
      "ON_HUNTGROUP_VIEW\020\354\016\032u\212\265\030q\020\t\030\007\"\rGroup Sc" +
      "ripts\"\rPause Options\"\022Web Link Templates" +
      "\"\020Group Extensions\"\021Trigger Templates\"\024D" +
      "isplay Limited Keys\022(\n\031PERMISSION_HUNTGR" +
      "OUP_EDIT\020\355\016\032\010\212\265\030\004\020\t\030\007\022)\n\032PERMISSION_SOUN" +
      "DBOARD_VIEW\020\244\r\032\010\212\265\030\004\020\t\030\010\022)\n\032PERMISSION_S" +
      "OUNDBOARD_EDIT\020\245\r\032\010\212\265\030\004\020\t\030\010\022Y\n\"PERMISSIO" +
      "N_SUBSCRIPTION_MANAGEMENT\020\214\001\0320\212\265\030,\020\t\030\t\"\020" +
      "My Subscriptions\"\024Manage Subscriptions\022 " +
      "\n\033PERMISSION_CUSTOMER_SUPPORT\020\310\001\022\031\n\024PERM" +
      "ISSION_IMITATION\020\322\001\022\034\n\027PERMISSION_BILLIN" +
      "G_EDIT\020\334\001\022\"\n\035PERMISSION_TCN_ADMIN_SETTIN" +
      "GS\020\346\001\022\033\n\026PERMISSION_TCN_BILLING\020\360\001\022\035\n\020PE" +
      "RMISSION_AGENT\020\254\002\032\006\212\265\030\002\020\001\022+\n\036PERMISSION_" +
      "ACCEPT_QUEUED_CALLS\020\266\002\032\006\212\265\030\002\020\001\0220\n#PERMIS" +
      "SION_VIEW_CAMPAIGN_COMPLETION\020\300\002\032\006\212\265\030\002\020\001" +
      "\022\'\n\032PERMISSION_VIEW_VOICE_MAIL\020\301\002\032\006\212\265\030\002\020" +
      "\001\022:\n-PERMISSION_AGENT_COMPLIANCE_SCRUBLI" +
      "ST_OPTIONS\020\312\002\032\006\212\265\030\002\020\001\022&\n\031PERMISSION_EXTE" +
      "NSION_EDIT\020\370\n\032\006\212\265\030\002\020\001\022*\n\035PERMISSION_VOIC" +
      "EMAIL_DOWNLOAD\020\371\n\032\006\212\265\030\002\020\001\022Q\n\032PERMISSION_" +
      "VOICE_ANALYTICS\020\364\003\0320\212\265\030,\020\016\"\007Billing\"\017Mon" +
      "thly Billing\"\016Billing Report\022,\n\037PERMISSI" +
      "ON_VOICE_ANALYTICS_FLAG\020\365\003\032\006\212\265\030\002\020\016\022.\n!PE" +
      "RMISSION_VOICE_ANALYTICS_CONFIG\020\366\003\032\006\212\265\030\002" +
      "\020\016\022:\n-PERMISSION_VOICE_ANALYTICS_RECORDI" +
      "NG_DOWNLOAD\020\367\003\032\006\212\265\030\002\020\016\022;\n.PERMISSION_VOI" +
      "CE_ANALYTICS_TRANSCRIPT_DOWNLOAD\020\370\003\032\006\212\265\030" +
      "\002\020\016\0228\n+PERMISSION_VOICE_ANALYTICS_SCREEN" +
      "_RECORDING\020\371\003\032\006\212\265\030\002\020\016\0229\n,PERMISSION_VOIC" +
      "E_ANALYTICS_TRANSCRIPT_DELETE\020\372\003\032\006\212\265\030\002\020\016" +
      "\022A\n2PERMISSION_VOICE_ANALYTICS_SCREEN_RE" +
      "CORDING_DELETE\020\373\003\032\010\212\265\030\004\010\001\020\016\022P\n PERMISSIO" +
      "N_BUSINESS_INTELLIGENCE\020\330\004\032)\212\265\030%\020\002\"\006View" +
      "er\"\007Builder\"\020Legacy Analytics\022/\n\032PERMISS" +
      "ION_DASHBOARDS_VIEW\020\331\004\032\016\212\265\030\n\020\002\"\006Viewer\022B" +
      "\n\032PERMISSION_DASHBOARDS_EDIT\020\332\004\032!\212\265\030\035\020\002\"" +
      "\007Builder\"\020Legacy Analytics\0228\n)PERMISSION" +
      "_INSIGHTS_COMMON_LIBRARY_MANAGE\020\333\004\032\010\212\265\030\004" +
      "\010\001\020\002\0228\n\032PERMISSION_INSIGHTS_MANAGE\020\334\004\032\027\212" +
      "\265\030\023\020\002\"\017Insight Builder\022Y\n\022PERMISSION_ROO" +
      "M303\020\274\005\032@\212\265\030<\020\n\"\017Unread Messages\"\005Rooms\"" +
      "\017Direct Messages\"\017System Messages\022J\n\035PER" +
      "MISSION_AGENT_CALL_SCRIPTS\020\240\006\032&\212\265\030\"\020\014\"\016S" +
      "cript Builder\"\016Script Mapping\022E\n\025PERMISS" +
      "ION_COMPLIANCE\020\204\007\032)\212\265\030%\020\007\"\tRule Sets\"\013Sc" +
      "rub Lists\"\tScenarios\0223\n\035PERMISSION_COMPL" +
      "IANCE_CONSENT\020\216\007\032\017\212\265\030\013\020\007\"\007Consent\022\226\001\n\023PE" +
      "RMISSION_LMS_VIEW\020\350\007\032|\212\265\030x\020\006\"\014Data Manag" +
      "er\"\025File Template Manager\"\035File Field De" +
      "finition Manager\"\025Journey Data Explorer\"" +
      "\031New File Template Manager\022 \n\023PERMISSION" +
      "_LMS_EDIT\020\351\007\032\006\212\265\030\002\020\006\022n\n\024PERMISSION_OMNI_" +
      "BOSS\020\260\t\032S\212\265\030O\020\010\"\014SSO Settings\"\013Form Emai" +
      "ls\"\017Canned Messages\"\014Dispositions\"\021Unsub" +
      "scribe Links\022K\n\034PERMISSION_INTEGRATIONS_" +
      "VIEW\020\224\n\032(\212\265\030$\020\005\"\016Configurations\"\007Plugins" +
      "\"\007Portals\022B\n\037PERMISSION_INTEGRATIONS_PAY" +
      "MENT\020\225\n\032\034\212\265\030\030\020\005\"\024Payment Integrations\022B\n" +
      "\037PERMISSION_INTEGRATIONS_JOURNEY\020\226\n\032\034\212\265\030" +
      "\030\020\005\"\024Journey Integrations\022\260\001\n\016PERMISSION" +
      "_WFM\020\334\013\032\232\001\212\265\030\225\001\020\017\"\nForecaster\"\016Skill Pro" +
      "files\"\026Forecasting Parameters\"\023Profile F" +
      "orecasting\"\026Regression Forecasting\"\023Curr" +
      "ent Forecasting\"\tScheduler\"\020Agent Manage" +
      "ment\022\"\n\025PERMISSION_SCORECARDS\020\300\014\032\006\212\265\030\002\020\013" +
      "\022)\n\034PERMISSION_SCORECARDS_MANAGE\020\301\014\032\006\212\265\030" +
      "\002\020\013\022+\n\036PERMISSION_SCORECARDS_EVALUATE\020\302\014" +
      "\032\006\212\265\030\002\020\013\022/\n\024PERMISSION_DEV_TOOLS\020\210\016\032\024\212\265\030" +
      "\020\020\004\"\014API Explorer\0223\n&PERMISSION_DELIVERY" +
      "_NOTIFICATIONS_VIEW\020\320\017\032\006\212\265\030\002\020\003\0223\n&PERMIS" +
      "SION_DELIVERY_NOTIFICATIONS_EDIT\020\321\017\032\006\212\265\030" +
      "\002\020\003\022%\n\026PERMISSION_TICKETS_APP\020\234\030\032\010\212\265\030\004\010\001" +
      "\020\r\022\'\n\030PERMISSION_TICKETS_ADMIN\020\235\030\032\010\212\265\030\004\010" +
      "\001\020\r\022(\n\031PERMISSION_WORKFLOWS_EDIT\020\240\037\032\010\212\265\030" +
      "\004\010\001\020\020B\222\001\n\"com.tcn.cloud.api.api.commons." +
      "authB\nPermsProtoP\001\242\002\003ACA\252\002\020Api.Commons.A" +
      "uth\312\002\020Api\\Commons\\Auth\342\002\034Api\\Commons\\Aut" +
      "h\\GPBMetadata\352\002\022Api::Commons::Authb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.perms.TcnProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.perms.TcnProto.options);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.perms.TcnProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
