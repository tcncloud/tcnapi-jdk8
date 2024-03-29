// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/acd.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.AgentSessionLogActionKey}
 */
public final class AgentSessionLogActionKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.AgentSessionLogActionKey)
    AgentSessionLogActionKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgentSessionLogActionKey.newBuilder() to construct.
  private AgentSessionLogActionKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgentSessionLogActionKey() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgentSessionLogActionKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSessionLogActionKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSessionLogActionKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.class, com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.Builder.class);
  }

  /**
   * Protobuf enum {@code api.commons.AgentSessionLogActionKey.Enum}
   */
  public enum Enum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * FRONTEND ENUMS
     * </pre>
     *
     * <code>AGENT_PAUSE_START = 0;</code>
     */
    AGENT_PAUSE_START(0),
    /**
     * <code>AGENT_PAUSE_STOP = 1;</code>
     */
    AGENT_PAUSE_STOP(1),
    /**
     * <code>AGENT_SKILLS_INITIAL = 2;</code>
     */
    AGENT_SKILLS_INITIAL(2),
    /**
     * <code>AGENT_LOGOUT = 3;</code>
     */
    AGENT_LOGOUT(3),
    /**
     * <code>EXECUTED_AGENT_TRIGGER = 4;</code>
     */
    EXECUTED_AGENT_TRIGGER(4),
    /**
     * <code>DURATION_SINCE_LAST_LOGON = 5;</code>
     */
    DURATION_SINCE_LAST_LOGON(5),
    /**
     * <code>AGENT_LOGIN_IP = 6;</code>
     */
    AGENT_LOGIN_IP(6),
    /**
     * <code>MAC_DECISION = 7;</code>
     */
    MAC_DECISION(7),
    /**
     * <code>MAC_10_KEY_DECISION = 8;</code>
     */
    MAC_10_KEY_DECISION(8),
    /**
     * <code>MAC_10_KEY_CONFIRM = 9;</code>
     */
    MAC_10_KEY_CONFIRM(9),
    /**
     * <code>HUNT_GROUP_REASSIGNMENT = 10;</code>
     */
    HUNT_GROUP_REASSIGNMENT(10),
    /**
     * <pre>
     * PBX
     * </pre>
     *
     * <code>PBX_ACCEPT = 11;</code>
     */
    PBX_ACCEPT(11),
    /**
     * <code>PBX_HANGUP = 12;</code>
     */
    PBX_HANGUP(12),
    /**
     * <code>PBX_LOST = 13;</code>
     */
    PBX_LOST(13),
    /**
     * <code>PBX_REJECT = 14;</code>
     */
    PBX_REJECT(14),
    /**
     * <code>PBX_TIMEOUT = 15;</code>
     */
    PBX_TIMEOUT(15),
    /**
     * <pre>
     * WARM AGENT TRANSFER
     * </pre>
     *
     * <code>WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL = 16;</code>
     */
    WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL(16),
    /**
     * <code>WARM_TRANSFER_AGENT_INVITE_CALLER = 17;</code>
     */
    WARM_TRANSFER_AGENT_INVITE_CALLER(17),
    /**
     * <code>WARM_TRANSFER_AGENT_START_SOURCE = 18;</code>
     */
    WARM_TRANSFER_AGENT_START_SOURCE(18),
    /**
     * <code>WARM_TRANSFER_AGENT_END_SOURCE = 19;</code>
     */
    WARM_TRANSFER_AGENT_END_SOURCE(19),
    /**
     * <code>WARM_TRANSFER_AGENT_START_DESTINATION = 20;</code>
     */
    WARM_TRANSFER_AGENT_START_DESTINATION(20),
    /**
     * <code>WARM_TRANSFER_AGENT_END_DESTINATION = 21;</code>
     */
    WARM_TRANSFER_AGENT_END_DESTINATION(21),
    /**
     * <pre>
     * WARM OUTBOUND TRANSFER
     * </pre>
     *
     * <code>WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL = 22;</code>
     */
    WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL(22),
    /**
     * <code>WARM_TRANSFER_OUTBOUND_INVITE_CALLER = 23;</code>
     */
    WARM_TRANSFER_OUTBOUND_INVITE_CALLER(23),
    /**
     * <code>WARM_TRANSFER_OUTBOUND_START = 24;</code>
     */
    WARM_TRANSFER_OUTBOUND_START(24),
    /**
     * <code>WARM_TRANSFER_OUTBOUND_END = 25;</code>
     */
    WARM_TRANSFER_OUTBOUND_END(25),
    /**
     * <pre>
     * COLD OUTBOUND TRANSFER
     * </pre>
     *
     * <code>COLD_TRANSFER_OUTBOUND_START = 26;</code>
     */
    COLD_TRANSFER_OUTBOUND_START(26),
    /**
     * <pre>
     * COLD AGENT TRANSFER
     * </pre>
     *
     * <code>COLD_TRANSFER_AGENT_START_SOURCE = 27;</code>
     */
    COLD_TRANSFER_AGENT_START_SOURCE(27),
    /**
     * <code>COLD_TRANSFER_AGENT_END_SOURCE = 28;</code>
     */
    COLD_TRANSFER_AGENT_END_SOURCE(28),
    /**
     * <code>COLD_TRANSFER_AGENT_START_DESTINATION = 29;</code>
     */
    COLD_TRANSFER_AGENT_START_DESTINATION(29),
    /**
     * <code>COLD_TRANSFER_AGENT_END_DESTINATION = 30;</code>
     */
    COLD_TRANSFER_AGENT_END_DESTINATION(30),
    /**
     * <pre>
     * HOLD
     * </pre>
     *
     * <code>HOLD_START = 31;</code>
     */
    HOLD_START(31),
    /**
     * <code>HOLD_END = 32;</code>
     */
    HOLD_END(32),
    /**
     * <pre>
     * QUEUE
     * </pre>
     *
     * <code>REQUEUE = 33;</code>
     */
    REQUEUE(33),
    /**
     * <pre>
     * VOICEMAIL
     * </pre>
     *
     * <code>CALLER_SENT_TO_VOICEMAIL = 34;</code>
     */
    CALLER_SENT_TO_VOICEMAIL(34),
    /**
     * <pre>
     * RECORDING
     * </pre>
     *
     * <code>RECORDING_START = 35;</code>
     */
    RECORDING_START(35),
    /**
     * <code>RECORDING_STOP = 36;</code>
     */
    RECORDING_STOP(36),
    /**
     * <pre>
     * PREVIEW BY RECORD
     * </pre>
     *
     * <code>PBR_STARTED_RECORD = 37;</code>
     */
    PBR_STARTED_RECORD(37),
    /**
     * <code>PBR_FINISHED_RECORD = 38;</code>
     */
    PBR_FINISHED_RECORD(38),
    /**
     * <pre>
     * ACD ENUMS
     * </pre>
     *
     * <code>ACD_LOGOUT = 39;</code>
     */
    ACD_LOGOUT(39),
    /**
     * <code>ACD_REGISTER = 40;</code>
     */
    ACD_REGISTER(40),
    /**
     * <pre>
     * FRONTEND WEBLINK ENUM
     * </pre>
     *
     * <code>EXECUTED_AGENT_WEBLINK = 41;</code>
     */
    EXECUTED_AGENT_WEBLINK(41),
    /**
     * <pre>
     * Transfer Hold and Unhold
     * </pre>
     *
     * <code>TRANSFER_HOLD_CALLER = 42;</code>
     */
    TRANSFER_HOLD_CALLER(42),
    /**
     * <code>TRANSFER_UNHOLD_CALLER = 43;</code>
     */
    TRANSFER_UNHOLD_CALLER(43),
    /**
     * <code>TRANSFER_HOLD_AGENT = 44;</code>
     */
    TRANSFER_HOLD_AGENT(44),
    /**
     * <code>TRANSFER_UNHOLD_AGENT = 45;</code>
     */
    TRANSFER_UNHOLD_AGENT(45),
    /**
     * <code>TRANSFER_HOLD = 46;</code>
     */
    TRANSFER_HOLD(46),
    /**
     * <code>TRANSFER_UNHOLD = 47;</code>
     */
    TRANSFER_UNHOLD(47),
    /**
     * <code>TRANSFER_HOLD_OUTBOUND = 48;</code>
     */
    TRANSFER_HOLD_OUTBOUND(48),
    /**
     * <code>TRANSFER_UNHOLD_OUTBOUND = 49;</code>
     */
    TRANSFER_UNHOLD_OUTBOUND(49),
    /**
     * <pre>
     * Transfer Add and Remove
     * </pre>
     *
     * <code>TRANSFER_ADD_OUTBOUND = 50;</code>
     */
    TRANSFER_ADD_OUTBOUND(50),
    /**
     * <code>TRANSFER_REMOVE_OUTBOUND = 51;</code>
     */
    TRANSFER_REMOVE_OUTBOUND(51),
    /**
     * <pre>
     * when the transfer starts for the agent
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_START = 52;</code>
     */
    WARM_CALLER_TRANSFER_START(52),
    /**
     * <pre>
     * when the transfer starts and the source caller is not on hold
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL = 53;</code>
     */
    WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL(53),
    /**
     * <pre>
     * when during transfer and the source caller is taken of hold
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_INVITE_CALLER = 54;</code>
     */
    WARM_CALLER_TRANSFER_INVITE_CALLER(54),
    /**
     * <pre>
     * when the transfer ends
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_END = 55;</code>
     */
    WARM_CALLER_TRANSFER_END(55),
    /**
     * <pre>
     * when a manager starts a barge in
     * </pre>
     *
     * <code>BARGE_IN_START = 56;</code>
     */
    BARGE_IN_START(56),
    /**
     * <pre>
     * when a manager stops a barge in
     * </pre>
     *
     * <code>BARGE_IN_STOP = 57;</code>
     */
    BARGE_IN_STOP(57),
    /**
     * <pre>
     * when a manager joins a barge in
     * </pre>
     *
     * <code>BargeInCallJoined = 58;</code>
     */
    BargeInCallJoined(58),
    /**
     * <pre>
     * when a manager leaves a barge in
     * </pre>
     *
     * <code>BargeInCallLeft = 59;</code>
     */
    BargeInCallLeft(59),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * FRONTEND ENUMS
     * </pre>
     *
     * <code>AGENT_PAUSE_START = 0;</code>
     */
    public static final int AGENT_PAUSE_START_VALUE = 0;
    /**
     * <code>AGENT_PAUSE_STOP = 1;</code>
     */
    public static final int AGENT_PAUSE_STOP_VALUE = 1;
    /**
     * <code>AGENT_SKILLS_INITIAL = 2;</code>
     */
    public static final int AGENT_SKILLS_INITIAL_VALUE = 2;
    /**
     * <code>AGENT_LOGOUT = 3;</code>
     */
    public static final int AGENT_LOGOUT_VALUE = 3;
    /**
     * <code>EXECUTED_AGENT_TRIGGER = 4;</code>
     */
    public static final int EXECUTED_AGENT_TRIGGER_VALUE = 4;
    /**
     * <code>DURATION_SINCE_LAST_LOGON = 5;</code>
     */
    public static final int DURATION_SINCE_LAST_LOGON_VALUE = 5;
    /**
     * <code>AGENT_LOGIN_IP = 6;</code>
     */
    public static final int AGENT_LOGIN_IP_VALUE = 6;
    /**
     * <code>MAC_DECISION = 7;</code>
     */
    public static final int MAC_DECISION_VALUE = 7;
    /**
     * <code>MAC_10_KEY_DECISION = 8;</code>
     */
    public static final int MAC_10_KEY_DECISION_VALUE = 8;
    /**
     * <code>MAC_10_KEY_CONFIRM = 9;</code>
     */
    public static final int MAC_10_KEY_CONFIRM_VALUE = 9;
    /**
     * <code>HUNT_GROUP_REASSIGNMENT = 10;</code>
     */
    public static final int HUNT_GROUP_REASSIGNMENT_VALUE = 10;
    /**
     * <pre>
     * PBX
     * </pre>
     *
     * <code>PBX_ACCEPT = 11;</code>
     */
    public static final int PBX_ACCEPT_VALUE = 11;
    /**
     * <code>PBX_HANGUP = 12;</code>
     */
    public static final int PBX_HANGUP_VALUE = 12;
    /**
     * <code>PBX_LOST = 13;</code>
     */
    public static final int PBX_LOST_VALUE = 13;
    /**
     * <code>PBX_REJECT = 14;</code>
     */
    public static final int PBX_REJECT_VALUE = 14;
    /**
     * <code>PBX_TIMEOUT = 15;</code>
     */
    public static final int PBX_TIMEOUT_VALUE = 15;
    /**
     * <pre>
     * WARM AGENT TRANSFER
     * </pre>
     *
     * <code>WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL = 16;</code>
     */
    public static final int WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL_VALUE = 16;
    /**
     * <code>WARM_TRANSFER_AGENT_INVITE_CALLER = 17;</code>
     */
    public static final int WARM_TRANSFER_AGENT_INVITE_CALLER_VALUE = 17;
    /**
     * <code>WARM_TRANSFER_AGENT_START_SOURCE = 18;</code>
     */
    public static final int WARM_TRANSFER_AGENT_START_SOURCE_VALUE = 18;
    /**
     * <code>WARM_TRANSFER_AGENT_END_SOURCE = 19;</code>
     */
    public static final int WARM_TRANSFER_AGENT_END_SOURCE_VALUE = 19;
    /**
     * <code>WARM_TRANSFER_AGENT_START_DESTINATION = 20;</code>
     */
    public static final int WARM_TRANSFER_AGENT_START_DESTINATION_VALUE = 20;
    /**
     * <code>WARM_TRANSFER_AGENT_END_DESTINATION = 21;</code>
     */
    public static final int WARM_TRANSFER_AGENT_END_DESTINATION_VALUE = 21;
    /**
     * <pre>
     * WARM OUTBOUND TRANSFER
     * </pre>
     *
     * <code>WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL = 22;</code>
     */
    public static final int WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL_VALUE = 22;
    /**
     * <code>WARM_TRANSFER_OUTBOUND_INVITE_CALLER = 23;</code>
     */
    public static final int WARM_TRANSFER_OUTBOUND_INVITE_CALLER_VALUE = 23;
    /**
     * <code>WARM_TRANSFER_OUTBOUND_START = 24;</code>
     */
    public static final int WARM_TRANSFER_OUTBOUND_START_VALUE = 24;
    /**
     * <code>WARM_TRANSFER_OUTBOUND_END = 25;</code>
     */
    public static final int WARM_TRANSFER_OUTBOUND_END_VALUE = 25;
    /**
     * <pre>
     * COLD OUTBOUND TRANSFER
     * </pre>
     *
     * <code>COLD_TRANSFER_OUTBOUND_START = 26;</code>
     */
    public static final int COLD_TRANSFER_OUTBOUND_START_VALUE = 26;
    /**
     * <pre>
     * COLD AGENT TRANSFER
     * </pre>
     *
     * <code>COLD_TRANSFER_AGENT_START_SOURCE = 27;</code>
     */
    public static final int COLD_TRANSFER_AGENT_START_SOURCE_VALUE = 27;
    /**
     * <code>COLD_TRANSFER_AGENT_END_SOURCE = 28;</code>
     */
    public static final int COLD_TRANSFER_AGENT_END_SOURCE_VALUE = 28;
    /**
     * <code>COLD_TRANSFER_AGENT_START_DESTINATION = 29;</code>
     */
    public static final int COLD_TRANSFER_AGENT_START_DESTINATION_VALUE = 29;
    /**
     * <code>COLD_TRANSFER_AGENT_END_DESTINATION = 30;</code>
     */
    public static final int COLD_TRANSFER_AGENT_END_DESTINATION_VALUE = 30;
    /**
     * <pre>
     * HOLD
     * </pre>
     *
     * <code>HOLD_START = 31;</code>
     */
    public static final int HOLD_START_VALUE = 31;
    /**
     * <code>HOLD_END = 32;</code>
     */
    public static final int HOLD_END_VALUE = 32;
    /**
     * <pre>
     * QUEUE
     * </pre>
     *
     * <code>REQUEUE = 33;</code>
     */
    public static final int REQUEUE_VALUE = 33;
    /**
     * <pre>
     * VOICEMAIL
     * </pre>
     *
     * <code>CALLER_SENT_TO_VOICEMAIL = 34;</code>
     */
    public static final int CALLER_SENT_TO_VOICEMAIL_VALUE = 34;
    /**
     * <pre>
     * RECORDING
     * </pre>
     *
     * <code>RECORDING_START = 35;</code>
     */
    public static final int RECORDING_START_VALUE = 35;
    /**
     * <code>RECORDING_STOP = 36;</code>
     */
    public static final int RECORDING_STOP_VALUE = 36;
    /**
     * <pre>
     * PREVIEW BY RECORD
     * </pre>
     *
     * <code>PBR_STARTED_RECORD = 37;</code>
     */
    public static final int PBR_STARTED_RECORD_VALUE = 37;
    /**
     * <code>PBR_FINISHED_RECORD = 38;</code>
     */
    public static final int PBR_FINISHED_RECORD_VALUE = 38;
    /**
     * <pre>
     * ACD ENUMS
     * </pre>
     *
     * <code>ACD_LOGOUT = 39;</code>
     */
    public static final int ACD_LOGOUT_VALUE = 39;
    /**
     * <code>ACD_REGISTER = 40;</code>
     */
    public static final int ACD_REGISTER_VALUE = 40;
    /**
     * <pre>
     * FRONTEND WEBLINK ENUM
     * </pre>
     *
     * <code>EXECUTED_AGENT_WEBLINK = 41;</code>
     */
    public static final int EXECUTED_AGENT_WEBLINK_VALUE = 41;
    /**
     * <pre>
     * Transfer Hold and Unhold
     * </pre>
     *
     * <code>TRANSFER_HOLD_CALLER = 42;</code>
     */
    public static final int TRANSFER_HOLD_CALLER_VALUE = 42;
    /**
     * <code>TRANSFER_UNHOLD_CALLER = 43;</code>
     */
    public static final int TRANSFER_UNHOLD_CALLER_VALUE = 43;
    /**
     * <code>TRANSFER_HOLD_AGENT = 44;</code>
     */
    public static final int TRANSFER_HOLD_AGENT_VALUE = 44;
    /**
     * <code>TRANSFER_UNHOLD_AGENT = 45;</code>
     */
    public static final int TRANSFER_UNHOLD_AGENT_VALUE = 45;
    /**
     * <code>TRANSFER_HOLD = 46;</code>
     */
    public static final int TRANSFER_HOLD_VALUE = 46;
    /**
     * <code>TRANSFER_UNHOLD = 47;</code>
     */
    public static final int TRANSFER_UNHOLD_VALUE = 47;
    /**
     * <code>TRANSFER_HOLD_OUTBOUND = 48;</code>
     */
    public static final int TRANSFER_HOLD_OUTBOUND_VALUE = 48;
    /**
     * <code>TRANSFER_UNHOLD_OUTBOUND = 49;</code>
     */
    public static final int TRANSFER_UNHOLD_OUTBOUND_VALUE = 49;
    /**
     * <pre>
     * Transfer Add and Remove
     * </pre>
     *
     * <code>TRANSFER_ADD_OUTBOUND = 50;</code>
     */
    public static final int TRANSFER_ADD_OUTBOUND_VALUE = 50;
    /**
     * <code>TRANSFER_REMOVE_OUTBOUND = 51;</code>
     */
    public static final int TRANSFER_REMOVE_OUTBOUND_VALUE = 51;
    /**
     * <pre>
     * when the transfer starts for the agent
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_START = 52;</code>
     */
    public static final int WARM_CALLER_TRANSFER_START_VALUE = 52;
    /**
     * <pre>
     * when the transfer starts and the source caller is not on hold
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL = 53;</code>
     */
    public static final int WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL_VALUE = 53;
    /**
     * <pre>
     * when during transfer and the source caller is taken of hold
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_INVITE_CALLER = 54;</code>
     */
    public static final int WARM_CALLER_TRANSFER_INVITE_CALLER_VALUE = 54;
    /**
     * <pre>
     * when the transfer ends
     * </pre>
     *
     * <code>WARM_CALLER_TRANSFER_END = 55;</code>
     */
    public static final int WARM_CALLER_TRANSFER_END_VALUE = 55;
    /**
     * <pre>
     * when a manager starts a barge in
     * </pre>
     *
     * <code>BARGE_IN_START = 56;</code>
     */
    public static final int BARGE_IN_START_VALUE = 56;
    /**
     * <pre>
     * when a manager stops a barge in
     * </pre>
     *
     * <code>BARGE_IN_STOP = 57;</code>
     */
    public static final int BARGE_IN_STOP_VALUE = 57;
    /**
     * <pre>
     * when a manager joins a barge in
     * </pre>
     *
     * <code>BargeInCallJoined = 58;</code>
     */
    public static final int BargeInCallJoined_VALUE = 58;
    /**
     * <pre>
     * when a manager leaves a barge in
     * </pre>
     *
     * <code>BargeInCallLeft = 59;</code>
     */
    public static final int BargeInCallLeft_VALUE = 59;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Enum valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Enum forNumber(int value) {
      switch (value) {
        case 0: return AGENT_PAUSE_START;
        case 1: return AGENT_PAUSE_STOP;
        case 2: return AGENT_SKILLS_INITIAL;
        case 3: return AGENT_LOGOUT;
        case 4: return EXECUTED_AGENT_TRIGGER;
        case 5: return DURATION_SINCE_LAST_LOGON;
        case 6: return AGENT_LOGIN_IP;
        case 7: return MAC_DECISION;
        case 8: return MAC_10_KEY_DECISION;
        case 9: return MAC_10_KEY_CONFIRM;
        case 10: return HUNT_GROUP_REASSIGNMENT;
        case 11: return PBX_ACCEPT;
        case 12: return PBX_HANGUP;
        case 13: return PBX_LOST;
        case 14: return PBX_REJECT;
        case 15: return PBX_TIMEOUT;
        case 16: return WARM_TRANSFER_AGENT_INVITE_CALLER_INITIAL;
        case 17: return WARM_TRANSFER_AGENT_INVITE_CALLER;
        case 18: return WARM_TRANSFER_AGENT_START_SOURCE;
        case 19: return WARM_TRANSFER_AGENT_END_SOURCE;
        case 20: return WARM_TRANSFER_AGENT_START_DESTINATION;
        case 21: return WARM_TRANSFER_AGENT_END_DESTINATION;
        case 22: return WARM_TRANSFER_OUTBOUND_INVITE_CALLER_INITIAL;
        case 23: return WARM_TRANSFER_OUTBOUND_INVITE_CALLER;
        case 24: return WARM_TRANSFER_OUTBOUND_START;
        case 25: return WARM_TRANSFER_OUTBOUND_END;
        case 26: return COLD_TRANSFER_OUTBOUND_START;
        case 27: return COLD_TRANSFER_AGENT_START_SOURCE;
        case 28: return COLD_TRANSFER_AGENT_END_SOURCE;
        case 29: return COLD_TRANSFER_AGENT_START_DESTINATION;
        case 30: return COLD_TRANSFER_AGENT_END_DESTINATION;
        case 31: return HOLD_START;
        case 32: return HOLD_END;
        case 33: return REQUEUE;
        case 34: return CALLER_SENT_TO_VOICEMAIL;
        case 35: return RECORDING_START;
        case 36: return RECORDING_STOP;
        case 37: return PBR_STARTED_RECORD;
        case 38: return PBR_FINISHED_RECORD;
        case 39: return ACD_LOGOUT;
        case 40: return ACD_REGISTER;
        case 41: return EXECUTED_AGENT_WEBLINK;
        case 42: return TRANSFER_HOLD_CALLER;
        case 43: return TRANSFER_UNHOLD_CALLER;
        case 44: return TRANSFER_HOLD_AGENT;
        case 45: return TRANSFER_UNHOLD_AGENT;
        case 46: return TRANSFER_HOLD;
        case 47: return TRANSFER_UNHOLD;
        case 48: return TRANSFER_HOLD_OUTBOUND;
        case 49: return TRANSFER_UNHOLD_OUTBOUND;
        case 50: return TRANSFER_ADD_OUTBOUND;
        case 51: return TRANSFER_REMOVE_OUTBOUND;
        case 52: return WARM_CALLER_TRANSFER_START;
        case 53: return WARM_CALLER_TRANSFER_INVITE_CALLER_INITIAL;
        case 54: return WARM_CALLER_TRANSFER_INVITE_CALLER;
        case 55: return WARM_CALLER_TRANSFER_END;
        case 56: return BARGE_IN_START;
        case 57: return BARGE_IN_STOP;
        case 58: return BargeInCallJoined;
        case 59: return BargeInCallLeft;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Enum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Enum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Enum>() {
            public Enum findValueByNumber(int number) {
              return Enum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.getDescriptor().getEnumTypes().get(0);
    }

    private static final Enum[] VALUES = values();

    public static Enum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Enum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:api.commons.AgentSessionLogActionKey.Enum)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.commons.AgentSessionLogActionKey)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.AgentSessionLogActionKey other = (com.tcn.cloud.api.api.commons.AgentSessionLogActionKey) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.AgentSessionLogActionKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.commons.AgentSessionLogActionKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.AgentSessionLogActionKey)
      com.tcn.cloud.api.api.commons.AgentSessionLogActionKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSessionLogActionKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSessionLogActionKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.class, com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.AcdProto.internal_static_api_commons_AgentSessionLogActionKey_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentSessionLogActionKey getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentSessionLogActionKey build() {
      com.tcn.cloud.api.api.commons.AgentSessionLogActionKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AgentSessionLogActionKey buildPartial() {
      com.tcn.cloud.api.api.commons.AgentSessionLogActionKey result = new com.tcn.cloud.api.api.commons.AgentSessionLogActionKey(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.AgentSessionLogActionKey) {
        return mergeFrom((com.tcn.cloud.api.api.commons.AgentSessionLogActionKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.AgentSessionLogActionKey other) {
      if (other == com.tcn.cloud.api.api.commons.AgentSessionLogActionKey.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.commons.AgentSessionLogActionKey)
  }

  // @@protoc_insertion_point(class_scope:api.commons.AgentSessionLogActionKey)
  private static final com.tcn.cloud.api.api.commons.AgentSessionLogActionKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.AgentSessionLogActionKey();
  }

  public static com.tcn.cloud.api.api.commons.AgentSessionLogActionKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgentSessionLogActionKey>
      PARSER = new com.google.protobuf.AbstractParser<AgentSessionLogActionKey>() {
    @java.lang.Override
    public AgentSessionLogActionKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AgentSessionLogActionKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgentSessionLogActionKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AgentSessionLogActionKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

