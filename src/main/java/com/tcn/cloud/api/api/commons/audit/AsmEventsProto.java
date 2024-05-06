// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/asm_events.proto

package com.tcn.cloud.api.api.commons.audit;

public final class AsmEventsProto {
  private AsmEventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmAgentLoginEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmAgentLoginEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmOpenVoiceEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmOpenVoiceEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmOpenOmniAgentEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmOpenOmniAgentEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmActivateConversationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmActivateConversationEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmDeactivateConversationEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmDeactivateConversationEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmAgentStateChangedEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmAgentStateChangedEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmAgentLogoutEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmAgentLogoutEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmPauseEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmPauseEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmResumeEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmResumeEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_audit_AsmConversationPulledEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_audit_AsmConversationPulledEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"api/commons/audit/asm_events.proto\022\021ap" +
      "i.commons.audit\032\025api/commons/asm.proto\032\035" +
      "api/commons/omnichannel.proto\032\037google/pr" +
      "otobuf/timestamp.proto\"U\n\022AsmAgentLoginE" +
      "vent\022\027\n\007user_id\030\001 \001(\tR\006userId\022&\n\017asm_ses" +
      "sion_sid\030\002 \001(\003R\rasmSessionSid\"\200\001\n\021AsmOpe" +
      "nVoiceEvent\022\027\n\007user_id\030\001 \001(\tR\006userId\022&\n\017" +
      "asm_session_sid\030\002 \001(\003R\rasmSessionSid\022*\n\021" +
      "voice_session_sid\030\003 \001(\003R\017voiceSessionSid" +
      "\"X\n\025AsmOpenOmniAgentEvent\022\027\n\007user_id\030\001 \001" +
      "(\tR\006userId\022&\n\017asm_session_sid\030\002 \001(\003R\rasm" +
      "SessionSid\"\242\001\n\034AsmActivateConversationEv" +
      "ent\022\027\n\007user_id\030\001 \001(\tR\006userId\022&\n\017asm_sess" +
      "ion_sid\030\002 \001(\003R\rasmSessionSid\022A\n\014conversa" +
      "tion\030\003 \001(\0132\035.api.commons.OmniConversatio" +
      "nR\014conversation\"\244\001\n\036AsmDeactivateConvers" +
      "ationEvent\022\027\n\007user_id\030\001 \001(\tR\006userId\022&\n\017a" +
      "sm_session_sid\030\002 \001(\003R\rasmSessionSid\022A\n\014c" +
      "onversation\030\003 \001(\0132\035.api.commons.OmniConv" +
      "ersationR\014conversation\"\376\001\n\031AsmAgentState" +
      "ChangedEvent\022\027\n\007user_id\030\001 \001(\tR\006userId\022&\n" +
      "\017asm_session_sid\030\002 \001(\003R\rasmSessionSid\0227\n" +
      "\nnew_status\030\003 \001(\0162\030.api.commons.StatusSt" +
      "ateR\tnewStatus\0227\n\nold_status\030\004 \001(\0162\030.api" +
      ".commons.StatusStateR\toldStatus\022.\n\023old_s" +
      "tatus_duration\030\005 \001(\003R\021oldStatusDuration\"" +
      "n\n\023AsmAgentLogoutEvent\022\027\n\007user_id\030\001 \001(\tR" +
      "\006userId\022&\n\017asm_session_sid\030\002 \001(\003R\rasmSes" +
      "sionSid\022\026\n\006reason\030\003 \001(\tR\006reason\"P\n\rAsmPa" +
      "useEvent\022\027\n\007user_id\030\001 \001(\tR\006userId\022&\n\017asm" +
      "_session_sid\030\002 \001(\003R\rasmSessionSid\"Q\n\016Asm" +
      "ResumeEvent\022\027\n\007user_id\030\001 \001(\tR\006userId\022&\n\017" +
      "asm_session_sid\030\002 \001(\003R\rasmSessionSid\"_\n\032" +
      "AsmConversationPulledEvent\022A\n\014conversati" +
      "on\030\001 \001(\0132\035.api.commons.OmniConversationR" +
      "\014conversationB\233\001\n#com.tcn.cloud.api.api." +
      "commons.auditB\016AsmEventsProtoP\001\242\002\003ACA\252\002\021" +
      "Api.Commons.Audit\312\002\021Api\\Commons\\Audit\342\002\035" +
      "Api\\Commons\\Audit\\GPBMetadata\352\002\023Api::Com" +
      "mons::Auditb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.AsmProto.getDescriptor(),
          com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_audit_AsmAgentLoginEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_audit_AsmAgentLoginEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmAgentLoginEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", });
    internal_static_api_commons_audit_AsmOpenVoiceEvent_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_audit_AsmOpenVoiceEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmOpenVoiceEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", "VoiceSessionSid", });
    internal_static_api_commons_audit_AsmOpenOmniAgentEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_audit_AsmOpenOmniAgentEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmOpenOmniAgentEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", });
    internal_static_api_commons_audit_AsmActivateConversationEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_audit_AsmActivateConversationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmActivateConversationEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", "Conversation", });
    internal_static_api_commons_audit_AsmDeactivateConversationEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_audit_AsmDeactivateConversationEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmDeactivateConversationEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", "Conversation", });
    internal_static_api_commons_audit_AsmAgentStateChangedEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_audit_AsmAgentStateChangedEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmAgentStateChangedEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", "NewStatus", "OldStatus", "OldStatusDuration", });
    internal_static_api_commons_audit_AsmAgentLogoutEvent_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_audit_AsmAgentLogoutEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmAgentLogoutEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", "Reason", });
    internal_static_api_commons_audit_AsmPauseEvent_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_audit_AsmPauseEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmPauseEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", });
    internal_static_api_commons_audit_AsmResumeEvent_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_audit_AsmResumeEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmResumeEvent_descriptor,
        new java.lang.String[] { "UserId", "AsmSessionSid", });
    internal_static_api_commons_audit_AsmConversationPulledEvent_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_audit_AsmConversationPulledEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_audit_AsmConversationPulledEvent_descriptor,
        new java.lang.String[] { "Conversation", });
    com.tcn.cloud.api.api.commons.AsmProto.getDescriptor();
    com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
