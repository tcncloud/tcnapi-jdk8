// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.ConversationStatus}
 */
public enum ConversationStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Conversation was just created. It is both open and active
   * </pre>
   *
   * <code>CONVERSATION_STATUS_NEW = 0;</code>
   */
  CONVERSATION_STATUS_NEW(0),
  /**
   * <pre>
   * Conversation is waiting for the customer to reply. It is open but not active
   * </pre>
   *
   * <code>CONVERSATION_STATUS_AWAITING_REPLY_FROM_CUSTOMER = 1;</code>
   */
  CONVERSATION_STATUS_AWAITING_REPLY_FROM_CUSTOMER(1),
  /**
   * <pre>
   * Conversation is waiting for the agent to reply. It is both open and active
   * </pre>
   *
   * <code>CONVERSATION_STATUS_AWAITING_REPLY_FROM_AGENT = 2;</code>
   */
  CONVERSATION_STATUS_AWAITING_REPLY_FROM_AGENT(2),
  /**
   * <pre>
   * The conversation is closed because of a timeout
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_TIMEOUT = 3;</code>
   */
  CONVERSATION_STATUS_CLOSED_TIMEOUT(3),
  /**
   * <pre>
   * The conversation is closed because of an action from the agent
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_AGENT = 4;</code>
   */
  CONVERSATION_STATUS_CLOSED_AGENT(4),
  /**
   * <pre>
   * The conversation is closed because of an action from the customer
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_CUSTOMER = 5;</code>
   */
  CONVERSATION_STATUS_CLOSED_CUSTOMER(5),
  /**
   * <pre>
   * The conversation is suspended while waiting for the customer to reply
   * </pre>
   *
   * <code>CONVERSATION_STATUS_SUSPENDED_AWAITING_REPLY_FROM_CUSTOMER = 6;</code>
   */
  CONVERSATION_STATUS_SUSPENDED_AWAITING_REPLY_FROM_CUSTOMER(6),
  /**
   * <pre>
   * the conversation was assigned at one point but it was unassigned and now its wait to be reassigned
   * </pre>
   *
   * <code>CONVERSATION_STATUS_AWAITING_ASSIGNMENT = 7;</code>
   */
  CONVERSATION_STATUS_AWAITING_ASSIGNMENT(7),
  /**
   * <pre>
   * the conversation was just assigned
   * </pre>
   *
   * <code>CONVERSATION_STATUS_NEWLY_ASSIGNED = 8;</code>
   */
  CONVERSATION_STATUS_NEWLY_ASSIGNED(8),
  /**
   * <pre>
   * The conversation is in wrap up via customer closing
   * </pre>
   *
   * <code>CONVERSATION_STATUS_WRAP_UP_CUSTOMER = 9;</code>
   */
  CONVERSATION_STATUS_WRAP_UP_CUSTOMER(9),
  /**
   * <pre>
   * The conversation is in wrap up after timeout.
   * </pre>
   *
   * <code>CONVERSATION_STATUS_WRAP_UP_TIMEOUT = 10;</code>
   */
  CONVERSATION_STATUS_WRAP_UP_TIMEOUT(10),
  /**
   * <pre>
   * The conversation is closed because of an action from the customer
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_MANAGER = 11;</code>
   */
  CONVERSATION_STATUS_CLOSED_MANAGER(11),
  /**
   * <pre>
   * Conversation was just created but we are waiting for the customer to reply
   * </pre>
   *
   * <code>CONVERSATION_STATUS_NEW_PENDING_CUSTOMER_REPLY = 12;</code>
   */
  CONVERSATION_STATUS_NEW_PENDING_CUSTOMER_REPLY(12),
  /**
   * <pre>
   *Conversation is being handled by flow engine
   * </pre>
   *
   * <code>CONVERSATION_STATUS_FLOW = 13;</code>
   */
  CONVERSATION_STATUS_FLOW(13),
  /**
   * <pre>
   * Conversation was closed because a duplicate thread was created
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_DUPLICATE_THREAD = 14;</code>
   */
  CONVERSATION_STATUS_CLOSED_DUPLICATE_THREAD(14),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Conversation was just created. It is both open and active
   * </pre>
   *
   * <code>CONVERSATION_STATUS_NEW = 0;</code>
   */
  public static final int CONVERSATION_STATUS_NEW_VALUE = 0;
  /**
   * <pre>
   * Conversation is waiting for the customer to reply. It is open but not active
   * </pre>
   *
   * <code>CONVERSATION_STATUS_AWAITING_REPLY_FROM_CUSTOMER = 1;</code>
   */
  public static final int CONVERSATION_STATUS_AWAITING_REPLY_FROM_CUSTOMER_VALUE = 1;
  /**
   * <pre>
   * Conversation is waiting for the agent to reply. It is both open and active
   * </pre>
   *
   * <code>CONVERSATION_STATUS_AWAITING_REPLY_FROM_AGENT = 2;</code>
   */
  public static final int CONVERSATION_STATUS_AWAITING_REPLY_FROM_AGENT_VALUE = 2;
  /**
   * <pre>
   * The conversation is closed because of a timeout
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_TIMEOUT = 3;</code>
   */
  public static final int CONVERSATION_STATUS_CLOSED_TIMEOUT_VALUE = 3;
  /**
   * <pre>
   * The conversation is closed because of an action from the agent
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_AGENT = 4;</code>
   */
  public static final int CONVERSATION_STATUS_CLOSED_AGENT_VALUE = 4;
  /**
   * <pre>
   * The conversation is closed because of an action from the customer
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_CUSTOMER = 5;</code>
   */
  public static final int CONVERSATION_STATUS_CLOSED_CUSTOMER_VALUE = 5;
  /**
   * <pre>
   * The conversation is suspended while waiting for the customer to reply
   * </pre>
   *
   * <code>CONVERSATION_STATUS_SUSPENDED_AWAITING_REPLY_FROM_CUSTOMER = 6;</code>
   */
  public static final int CONVERSATION_STATUS_SUSPENDED_AWAITING_REPLY_FROM_CUSTOMER_VALUE = 6;
  /**
   * <pre>
   * the conversation was assigned at one point but it was unassigned and now its wait to be reassigned
   * </pre>
   *
   * <code>CONVERSATION_STATUS_AWAITING_ASSIGNMENT = 7;</code>
   */
  public static final int CONVERSATION_STATUS_AWAITING_ASSIGNMENT_VALUE = 7;
  /**
   * <pre>
   * the conversation was just assigned
   * </pre>
   *
   * <code>CONVERSATION_STATUS_NEWLY_ASSIGNED = 8;</code>
   */
  public static final int CONVERSATION_STATUS_NEWLY_ASSIGNED_VALUE = 8;
  /**
   * <pre>
   * The conversation is in wrap up via customer closing
   * </pre>
   *
   * <code>CONVERSATION_STATUS_WRAP_UP_CUSTOMER = 9;</code>
   */
  public static final int CONVERSATION_STATUS_WRAP_UP_CUSTOMER_VALUE = 9;
  /**
   * <pre>
   * The conversation is in wrap up after timeout.
   * </pre>
   *
   * <code>CONVERSATION_STATUS_WRAP_UP_TIMEOUT = 10;</code>
   */
  public static final int CONVERSATION_STATUS_WRAP_UP_TIMEOUT_VALUE = 10;
  /**
   * <pre>
   * The conversation is closed because of an action from the customer
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_MANAGER = 11;</code>
   */
  public static final int CONVERSATION_STATUS_CLOSED_MANAGER_VALUE = 11;
  /**
   * <pre>
   * Conversation was just created but we are waiting for the customer to reply
   * </pre>
   *
   * <code>CONVERSATION_STATUS_NEW_PENDING_CUSTOMER_REPLY = 12;</code>
   */
  public static final int CONVERSATION_STATUS_NEW_PENDING_CUSTOMER_REPLY_VALUE = 12;
  /**
   * <pre>
   *Conversation is being handled by flow engine
   * </pre>
   *
   * <code>CONVERSATION_STATUS_FLOW = 13;</code>
   */
  public static final int CONVERSATION_STATUS_FLOW_VALUE = 13;
  /**
   * <pre>
   * Conversation was closed because a duplicate thread was created
   * </pre>
   *
   * <code>CONVERSATION_STATUS_CLOSED_DUPLICATE_THREAD = 14;</code>
   */
  public static final int CONVERSATION_STATUS_CLOSED_DUPLICATE_THREAD_VALUE = 14;


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
  public static ConversationStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConversationStatus forNumber(int value) {
    switch (value) {
      case 0: return CONVERSATION_STATUS_NEW;
      case 1: return CONVERSATION_STATUS_AWAITING_REPLY_FROM_CUSTOMER;
      case 2: return CONVERSATION_STATUS_AWAITING_REPLY_FROM_AGENT;
      case 3: return CONVERSATION_STATUS_CLOSED_TIMEOUT;
      case 4: return CONVERSATION_STATUS_CLOSED_AGENT;
      case 5: return CONVERSATION_STATUS_CLOSED_CUSTOMER;
      case 6: return CONVERSATION_STATUS_SUSPENDED_AWAITING_REPLY_FROM_CUSTOMER;
      case 7: return CONVERSATION_STATUS_AWAITING_ASSIGNMENT;
      case 8: return CONVERSATION_STATUS_NEWLY_ASSIGNED;
      case 9: return CONVERSATION_STATUS_WRAP_UP_CUSTOMER;
      case 10: return CONVERSATION_STATUS_WRAP_UP_TIMEOUT;
      case 11: return CONVERSATION_STATUS_CLOSED_MANAGER;
      case 12: return CONVERSATION_STATUS_NEW_PENDING_CUSTOMER_REPLY;
      case 13: return CONVERSATION_STATUS_FLOW;
      case 14: return CONVERSATION_STATUS_CLOSED_DUPLICATE_THREAD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConversationStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConversationStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConversationStatus>() {
          public ConversationStatus findValueByNumber(int number) {
            return ConversationStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final ConversationStatus[] VALUES = values();

  public static ConversationStatus valueOf(
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

  private ConversationStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ConversationStatus)
}

