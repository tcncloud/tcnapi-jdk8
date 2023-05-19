// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/event.proto

package com.tcn.cloud.api.api.commons;

public interface AsmEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.AsmEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.StatusState state = 1 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.api.commons.StatusState state = 1 [json_name = "state"];</code>
   * @return The state.
   */
  com.tcn.cloud.api.api.commons.StatusState getState();

  /**
   * <code>int64 event_time = 2 [json_name = "eventTime"];</code>
   * @return The eventTime.
   */
  long getEventTime();

  /**
   * <code>.api.commons.ActivatedConversationAsmEvent activated_conversation_asm_event = 5 [json_name = "activatedConversationAsmEvent"];</code>
   * @return Whether the activatedConversationAsmEvent field is set.
   */
  boolean hasActivatedConversationAsmEvent();
  /**
   * <code>.api.commons.ActivatedConversationAsmEvent activated_conversation_asm_event = 5 [json_name = "activatedConversationAsmEvent"];</code>
   * @return The activatedConversationAsmEvent.
   */
  com.tcn.cloud.api.api.commons.ActivatedConversationAsmEvent getActivatedConversationAsmEvent();
  /**
   * <code>.api.commons.ActivatedConversationAsmEvent activated_conversation_asm_event = 5 [json_name = "activatedConversationAsmEvent"];</code>
   */
  com.tcn.cloud.api.api.commons.ActivatedConversationAsmEventOrBuilder getActivatedConversationAsmEventOrBuilder();

  /**
   * <code>.api.commons.DeactivatedConversationAsmEvent deactivated_conversation_asm_event = 6 [json_name = "deactivatedConversationAsmEvent"];</code>
   * @return Whether the deactivatedConversationAsmEvent field is set.
   */
  boolean hasDeactivatedConversationAsmEvent();
  /**
   * <code>.api.commons.DeactivatedConversationAsmEvent deactivated_conversation_asm_event = 6 [json_name = "deactivatedConversationAsmEvent"];</code>
   * @return The deactivatedConversationAsmEvent.
   */
  com.tcn.cloud.api.api.commons.DeactivatedConversationAsmEvent getDeactivatedConversationAsmEvent();
  /**
   * <code>.api.commons.DeactivatedConversationAsmEvent deactivated_conversation_asm_event = 6 [json_name = "deactivatedConversationAsmEvent"];</code>
   */
  com.tcn.cloud.api.api.commons.DeactivatedConversationAsmEventOrBuilder getDeactivatedConversationAsmEventOrBuilder();

  /**
   * <code>.api.commons.SentMessageAsmEvent sent_message_asm_event = 7 [json_name = "sentMessageAsmEvent"];</code>
   * @return Whether the sentMessageAsmEvent field is set.
   */
  boolean hasSentMessageAsmEvent();
  /**
   * <code>.api.commons.SentMessageAsmEvent sent_message_asm_event = 7 [json_name = "sentMessageAsmEvent"];</code>
   * @return The sentMessageAsmEvent.
   */
  com.tcn.cloud.api.api.commons.SentMessageAsmEvent getSentMessageAsmEvent();
  /**
   * <code>.api.commons.SentMessageAsmEvent sent_message_asm_event = 7 [json_name = "sentMessageAsmEvent"];</code>
   */
  com.tcn.cloud.api.api.commons.SentMessageAsmEventOrBuilder getSentMessageAsmEventOrBuilder();

  /**
   * <pre>
   * An event to indicate that the status has changed
   * </pre>
   *
   * <code>.api.commons.SendStatusAsmEvent send_status_asm_event = 8 [json_name = "sendStatusAsmEvent"];</code>
   * @return Whether the sendStatusAsmEvent field is set.
   */
  boolean hasSendStatusAsmEvent();
  /**
   * <pre>
   * An event to indicate that the status has changed
   * </pre>
   *
   * <code>.api.commons.SendStatusAsmEvent send_status_asm_event = 8 [json_name = "sendStatusAsmEvent"];</code>
   * @return The sendStatusAsmEvent.
   */
  com.tcn.cloud.api.api.commons.SendStatusAsmEvent getSendStatusAsmEvent();
  /**
   * <pre>
   * An event to indicate that the status has changed
   * </pre>
   *
   * <code>.api.commons.SendStatusAsmEvent send_status_asm_event = 8 [json_name = "sendStatusAsmEvent"];</code>
   */
  com.tcn.cloud.api.api.commons.SendStatusAsmEventOrBuilder getSendStatusAsmEventOrBuilder();

  /**
   * <code>.api.commons.PauseEvent pause_event = 9 [json_name = "pauseEvent"];</code>
   * @return Whether the pauseEvent field is set.
   */
  boolean hasPauseEvent();
  /**
   * <code>.api.commons.PauseEvent pause_event = 9 [json_name = "pauseEvent"];</code>
   * @return The pauseEvent.
   */
  com.tcn.cloud.api.api.commons.PauseEvent getPauseEvent();
  /**
   * <code>.api.commons.PauseEvent pause_event = 9 [json_name = "pauseEvent"];</code>
   */
  com.tcn.cloud.api.api.commons.PauseEventOrBuilder getPauseEventOrBuilder();

  /**
   * <code>.api.commons.ResumeEvent resume_event = 10 [json_name = "resumeEvent"];</code>
   * @return Whether the resumeEvent field is set.
   */
  boolean hasResumeEvent();
  /**
   * <code>.api.commons.ResumeEvent resume_event = 10 [json_name = "resumeEvent"];</code>
   * @return The resumeEvent.
   */
  com.tcn.cloud.api.api.commons.ResumeEvent getResumeEvent();
  /**
   * <code>.api.commons.ResumeEvent resume_event = 10 [json_name = "resumeEvent"];</code>
   */
  com.tcn.cloud.api.api.commons.ResumeEventOrBuilder getResumeEventOrBuilder();

  /**
   * <code>.api.commons.ConversationPulledEvent conversation_pulled_event = 11 [json_name = "conversationPulledEvent"];</code>
   * @return Whether the conversationPulledEvent field is set.
   */
  boolean hasConversationPulledEvent();
  /**
   * <code>.api.commons.ConversationPulledEvent conversation_pulled_event = 11 [json_name = "conversationPulledEvent"];</code>
   * @return The conversationPulledEvent.
   */
  com.tcn.cloud.api.api.commons.ConversationPulledEvent getConversationPulledEvent();
  /**
   * <code>.api.commons.ConversationPulledEvent conversation_pulled_event = 11 [json_name = "conversationPulledEvent"];</code>
   */
  com.tcn.cloud.api.api.commons.ConversationPulledEventOrBuilder getConversationPulledEventOrBuilder();

  com.tcn.cloud.api.api.commons.AsmEvent.EventCase getEventCase();
}
