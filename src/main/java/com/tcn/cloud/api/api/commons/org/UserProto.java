// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/user.proto

package com.tcn.cloud.api.api.commons.org;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_User_RegionSidMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_User_RegionSidMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_User_RegionSids_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_User_RegionSids_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_MfaInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_MfaInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_MfaInfo_NoneSelected_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_MfaInfo_NoneSelected_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_MfaInfo_OtpType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_MfaInfo_OtpType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_MfaInfo_OtpType_EmailDeliveryMethod_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_MfaInfo_OtpType_EmailDeliveryMethod_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_MfaInfo_Duo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_MfaInfo_Duo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_MfaInfo_Totp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_MfaInfo_Totp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_Skill_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_Skill_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_org_PasswordResetLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_org_PasswordResetLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032api/commons/org/user.proto\022\017api.common" +
      "s.org\032\025api/commons/org.proto\032\037google/pro" +
      "tobuf/timestamp.proto\032\036google/protobuf/w" +
      "rappers.proto\"\213\r\n\004User\022\027\n\007user_id\030\001 \001(\tR" +
      "\006userId\022\025\n\006org_id\030\002 \001(\tR\005orgId\022\032\n\010userna" +
      "me\030\003 \001(\tR\010username\0223\n\026p3_permission_grou" +
      "p_id\030\004 \001(\tR\023p3PermissionGroupId\022\033\n\tlogin" +
      "_sid\030\005 \001(\003R\010loginSid\022\033\n\tagent_sid\030\006 \001(\003R" +
      "\010agentSid\022\033\n\tregion_id\030\007 \001(\tR\010regionId\022(" +
      "\n\020partner_agent_id\030\010 \001(\tR\016partnerAgentId" +
      "\022\035\n\nclient_sid\030\013 \001(\003R\tclientSid\022M\n\016regio" +
      "n_sid_map\030\017 \003(\0132\'.api.commons.org.User.R" +
      "egionSidMapEntryR\014regionSidMap\022\027\n\007api_ke" +
      "y\030e \001(\tR\006apiKey\022\024\n\005email\030h \001(\tR\005email\022%\n" +
      "\016login_disabled\030p \001(\010R\rloginDisabled\022\035\n\n" +
      "caller_ids\030s \003(\tR\tcallerIds\022)\n\020linkback_" +
      "numbers\030t \003(\tR\017linkbackNumbers\022 \n\014auth_u" +
      "ser_id\030v \001(\tR\nauthUserId\022\035\n\nenable_mfa\030{" +
      " \001(\010R\tenableMfa\022\036\n\nfirst_name\030\241\001 \001(\tR\tfi" +
      "rstName\022\034\n\tlast_name\030\242\001 \001(\tR\010lastName\0225\n" +
      "\007created\030\243\001 \001(\0132\032.google.protobuf.Timest" +
      "ampR\007created\022>\n\014last_updated\030\244\001 \001(\0132\032.go" +
      "ogle.protobuf.TimestampR\013lastUpdated\0227\n\027" +
      "password_reset_required\030\245\001 \001(\010R\025password" +
      "ResetRequired\022B\n\rconnection_id\030\246\001 \001(\0132\034." +
      "google.protobuf.StringValueR\014connectionI" +
      "d\022K\n\022time_zone_override\030\247\001 \001(\0132\034.api.com" +
      "mons.TimeZoneWrapperR\020timeZoneOverride\0221" +
      "\n\024permission_group_ids\030\310\001 \003(\tR\022permissio" +
      "nGroupIds\022\034\n\ttrust_ids\030\321\001 \003(\tR\010trustIds\022" +
      "&\n\016default_region\030\312\001 \001(\tR\rdefaultRegion\022" +
      "S\n\023default_application\030\313\001 \001(\0162!.api.comm" +
      "ons.OperatorApplicationsR\022defaultApplica" +
      "tion\022%\n\016user_caller_id\030\315\001 \001(\tR\014userCalle" +
      "rId\0224\n\026agent_profile_group_id\030\317\001 \001(\tR\023ag" +
      "entProfileGroupId\022/\n\006skills\030\320\001 \003(\0132\026.api" +
      ".commons.org.SkillR\006skills\022\025\n\005agent\030\254\002 \001" +
      "(\010R\005agent\022$\n\raccount_owner\030\220\003 \001(\010R\014accou" +
      "ntOwner\022&\n\016email_verified\030\221\003 \001(\010R\remailV" +
      "erified\022(\n\017whitelisted_ips\030\222\003 \003(\tR\016white" +
      "listedIps\032a\n\021RegionSidMapEntry\022\020\n\003key\030\001 " +
      "\001(\tR\003key\0226\n\005value\030\002 \001(\0132 .api.commons.or" +
      "g.User.RegionSidsR\005value:\0028\001\032e\n\nRegionSi" +
      "ds\022\033\n\tlogin_sid\030\001 \001(\003R\010loginSid\022\033\n\tagent" +
      "_sid\030\002 \001(\003R\010agentSid\022\035\n\nclient_sid\030\003 \001(\003" +
      "R\tclientSid\"\274\004\n\007MfaInfo\022\025\n\006org_id\030\001 \001(\tR" +
      "\005orgId\022\027\n\007user_id\030\002 \001(\tR\006userId\022\037\n\013mfa_e" +
      "nabled\030\003 \001(\010R\nmfaEnabled\022;\n\004none\030\n \001(\0132%" +
      ".api.commons.org.MfaInfo.NoneSelectedH\000R" +
      "\004none\0224\n\003otp\030\013 \001(\0132 .api.commons.org.Mfa" +
      "Info.OtpTypeH\000R\003otp\0220\n\003duo\030\014 \001(\0132\034.api.c" +
      "ommons.org.MfaInfo.DuoH\000R\003duo\0223\n\004totp\030\r " +
      "\001(\0132\035.api.commons.org.MfaInfo.TotpH\000R\004to" +
      "tp\032D\n\014NoneSelected\0224\n\007timeout\030\001 \001(\0132\032.go" +
      "ogle.protobuf.TimestampR\007timeout\032\201\001\n\007Otp" +
      "Type\022L\n\005email\030\001 \001(\01324.api.commons.org.Mf" +
      "aInfo.OtpType.EmailDeliveryMethodH\000R\005ema" +
      "il\032\025\n\023EmailDeliveryMethodB\021\n\017delivery_me" +
      "thod\032(\n\003Duo\022!\n\014duo_username\030\001 \001(\tR\013duoUs" +
      "ername\032\006\n\004TotpB\n\n\010mfa_type\"p\n\005Skill\022\024\n\005l" +
      "evel\030\001 \001(\003R\005level\022\022\n\004name\030\002 \001(\tR\004name\022 \n" +
      "\013description\030\003 \001(\tR\013description\022\033\n\tskill" +
      "_sid\030\004 \001(\003R\010skillSid\"\230\001\n\021PasswordResetLi" +
      "nk\022\027\n\007link_id\030\001 \001(\tR\006linkId\022\027\n\007user_id\030\002" +
      " \001(\tR\006userId\022\025\n\006org_id\030\003 \001(\tR\005orgId\022:\n\ne" +
      "xpiration\030\004 \001(\0132\032.google.protobuf.Timest" +
      "ampR\nexpirationB\214\001\n!com.tcn.cloud.api.ap" +
      "i.commons.orgB\tUserProtoP\001\242\002\003ACO\252\002\017Api.C" +
      "ommons.Org\312\002\017Api\\Commons\\Org\342\002\033Api\\Commo" +
      "ns\\Org\\GPBMetadata\352\002\021Api::Commons::Orgb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.OrgProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_api_commons_org_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_org_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_User_descriptor,
        new java.lang.String[] { "UserId", "OrgId", "Username", "P3PermissionGroupId", "LoginSid", "AgentSid", "RegionId", "PartnerAgentId", "ClientSid", "RegionSidMap", "ApiKey", "Email", "LoginDisabled", "CallerIds", "LinkbackNumbers", "AuthUserId", "EnableMfa", "FirstName", "LastName", "Created", "LastUpdated", "PasswordResetRequired", "ConnectionId", "TimeZoneOverride", "PermissionGroupIds", "TrustIds", "DefaultRegion", "DefaultApplication", "UserCallerId", "AgentProfileGroupId", "Skills", "Agent", "AccountOwner", "EmailVerified", "WhitelistedIps", });
    internal_static_api_commons_org_User_RegionSidMapEntry_descriptor =
      internal_static_api_commons_org_User_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_org_User_RegionSidMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_User_RegionSidMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_commons_org_User_RegionSids_descriptor =
      internal_static_api_commons_org_User_descriptor.getNestedTypes().get(1);
    internal_static_api_commons_org_User_RegionSids_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_User_RegionSids_descriptor,
        new java.lang.String[] { "LoginSid", "AgentSid", "ClientSid", });
    internal_static_api_commons_org_MfaInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_org_MfaInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_MfaInfo_descriptor,
        new java.lang.String[] { "OrgId", "UserId", "MfaEnabled", "None", "Otp", "Duo", "Totp", "MfaType", });
    internal_static_api_commons_org_MfaInfo_NoneSelected_descriptor =
      internal_static_api_commons_org_MfaInfo_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_org_MfaInfo_NoneSelected_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_MfaInfo_NoneSelected_descriptor,
        new java.lang.String[] { "Timeout", });
    internal_static_api_commons_org_MfaInfo_OtpType_descriptor =
      internal_static_api_commons_org_MfaInfo_descriptor.getNestedTypes().get(1);
    internal_static_api_commons_org_MfaInfo_OtpType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_MfaInfo_OtpType_descriptor,
        new java.lang.String[] { "Email", "DeliveryMethod", });
    internal_static_api_commons_org_MfaInfo_OtpType_EmailDeliveryMethod_descriptor =
      internal_static_api_commons_org_MfaInfo_OtpType_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_org_MfaInfo_OtpType_EmailDeliveryMethod_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_MfaInfo_OtpType_EmailDeliveryMethod_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_org_MfaInfo_Duo_descriptor =
      internal_static_api_commons_org_MfaInfo_descriptor.getNestedTypes().get(2);
    internal_static_api_commons_org_MfaInfo_Duo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_MfaInfo_Duo_descriptor,
        new java.lang.String[] { "DuoUsername", });
    internal_static_api_commons_org_MfaInfo_Totp_descriptor =
      internal_static_api_commons_org_MfaInfo_descriptor.getNestedTypes().get(3);
    internal_static_api_commons_org_MfaInfo_Totp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_MfaInfo_Totp_descriptor,
        new java.lang.String[] { });
    internal_static_api_commons_org_Skill_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_org_Skill_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_Skill_descriptor,
        new java.lang.String[] { "Level", "Name", "Description", "SkillSid", });
    internal_static_api_commons_org_PasswordResetLink_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_org_PasswordResetLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_org_PasswordResetLink_descriptor,
        new java.lang.String[] { "LinkId", "UserId", "OrgId", "Expiration", });
    com.tcn.cloud.api.api.commons.OrgProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
