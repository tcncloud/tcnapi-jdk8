// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/manager.proto

package com.tcn.cloud.api.api.commons;

public final class ManagerProto {
  private ManagerProto() {}
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
      "\n\031api/commons/manager.proto\022\013api.commons" +
      "*\242\002\n\tAgentInfo\022\034\n\030AGENT_INFO_ACTIVE_AGEN" +
      "TS\020\000\022#\n\037AGENT_INFO_IN_CONFERENCE_AGENTS\020" +
      "\001\022\034\n\030AGENT_INFO_MANUAL_AGENTS\020\002\022\034\n\030AGENT" +
      "_INFO_PAUSED_AGENTS\020\003\022\035\n\031AGENT_INFO_PREV" +
      "IEW_AGENTS\020\004\022\033\n\027AGENT_INFO_READY_AGENTS\020" +
      "\005\022\033\n\027AGENT_INFO_TOTAL_AGENTS\020\006\022\036\n\032AGENT_" +
      "INFO_TRANSFER_AGENTS\020\007\022\035\n\031AGENT_INFO_WRA" +
      "P_UP_AGENTS\020\010*\366\005\n\nSkillStats\022\"\n\036SKILL_ST" +
      "ATS_AGENT_PEERED_CALLS\020\000\022\036\n\032SKILL_STATS_" +
      "AVERAGE_LENGTH\020\001\022\032\n\026SKILL_STATS_CALL_COU" +
      "NT\020\002\022\036\n\032SKILL_STATS_CALL_SKILL_MAP\020\003\022\031\n\025" +
      "SKILL_STATS_CALL_TYPE\020\004\022\032\n\026SKILL_STATS_C" +
      "ALLS_LIST\020\005\022#\n\037SKILL_STATS_DAILY_BY_SKIL" +
      "LS_KEY\020\006\022 \n\034SKILL_STATS_LONGEST_IN_QUEUE" +
      "\020\007\022\"\n\036SKILL_STATS_MATCHING_AGENTS_MD\020\010\022\"" +
      "\n\036SKILL_STATS_MATCHING_AGENTS_PC\020\t\022\"\n\036SK" +
      "ILL_STATS_MATCHING_AGENTS_LI\020\n\022\"\n\036SKILL_" +
      "STATS_MATCHING_AGENTS_OC\020\013\022!\n\035SKILL_STAT" +
      "S_MATCHING_AGENTS_P\020\014\022!\n\035SKILL_STATS_MAT" +
      "CHING_AGENTS_W\020\r\022\"\n\036SKILL_STATS_MATCHING" +
      "_AGENTS_WU\020\016\022\"\n\036SKILL_STATS_MATCHING_AGE" +
      "NTS_TC\020\017\022\036\n\032SKILL_STATS_MAXIMUM_LENGTH\020\020" +
      "\022\036\n\032SKILL_STATS_MINIMUM_LENGTH\020\021\022\035\n\031SKIL" +
      "L_STATS_PBX_EXTENSION\020\022\022(\n$SKILL_STATS_Q" +
      "UEUED_NOTIFICATION_TYPE\020\023\022\031\n\025SKILL_STATS" +
      "_SKILL_SET\020\024\022(\n$SKILL_STATS_TOTAL_LENGTH" +
      "_FOR_AVERAGE\020\025*\303\001\n\013SkillQueues\022\032\n\026SKILL_" +
      "QUEUES_ACD_QUEUE\020\000\022\033\n\027SKILL_QUEUES_MULTI" +
      "_HOLD\020\001\022\034\n\030SKILL_QUEUES_SIMPLE_HOLD\020\002\022\031\n" +
      "\025SKILL_QUEUES_TRANSFER\020\003\022#\n\037SKILL_QUEUES" +
      "_SUSPENDED_CALLBACK\020\004\022\035\n\031SKILL_QUEUES_GR" +
      "AND_TOTALS\020\005*\342\003\n\nAgentStats\022\032\n\026AGENT_STA" +
      "TS_AGENT_NAME\020\000\022\034\n\030AGENT_STATS_AGENT_STA" +
      "TUS\020\001\022\"\n\036AGENT_STATS_DURATION_IN_STATUS\020" +
      "\002\022\037\n\033AGENT_STATS_LOGIN_DATE_TIME\020\003\022\036\n\032AG" +
      "ENT_STATS_LOGIN_DURATION\020\004\022\034\n\030AGENT_STAT" +
      "S_AGENT_SKILLS\020\005\022\031\n\025AGENT_STATS_AGENT_SI" +
      "D\020\006\022\032\n\026AGENT_STATS_SESSION_ID\020\007\022\037\n\033AGENT" +
      "_STATS_HUNT_GROUP_NAME\020\010\022\032\n\026AGENT_STATS_" +
      "CALL_COUNT\020\t\022\032\n\026AGENT_STATS_PAUSE_CODE\020\n" +
      "\022 \n\034AGENT_STATS_RECORDING_STATUS\020\013\022 \n\034AG" +
      "ENT_STATS_MULTI_HOLD_COUNT\020\014\022!\n\035AGENT_ST" +
      "ATS_SIMPLE_HOLD_COUNT\020\r\022 \n\034AGENT_STATS_T" +
      "OTAL_HOLD_COUNT\020\016*I\n\022ManagerBargeInMode\022" +
      "\013\n\007MONITOR\020\000\022\023\n\017FULL_CONFERENCE\020\001\022\021\n\rAGE" +
      "NT_WHISPER\020\002Bz\n\035com.tcn.cloud.api.api.co" +
      "mmonsB\014ManagerProtoP\001\242\002\003ACX\252\002\013Api.Common" +
      "s\312\002\013Api\\Commons\342\002\027Api\\Commons\\GPBMetadat" +
      "a\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
