// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/email.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.EmailResult}
 */
public enum EmailResult
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EMAIL_RESULT_UNKNOWN = 0;</code>
   */
  EMAIL_RESULT_UNKNOWN(0),
  /**
   * <pre>
   *, "EMAIL_TASK_WAITING","Waiting","WTG", "Email Task is ready to be sent"),
   * </pre>
   *
   * <code>EMAIL_TASK_WAITING = 8600;</code>
   */
  EMAIL_TASK_WAITING(8600),
  /**
   * <pre>
   *, "EMAIL_TASK_PROCESSING","Sending","PRC", "Email Task is sent to gateway"),
   * </pre>
   *
   * <code>EMAIL_TASK_PROCESSING = 8700;</code>
   */
  EMAIL_TASK_PROCESSING(8700),
  /**
   * <pre>
   *, "EMAIL_TASK_DNC","Do Not Call","DNC", "Email has been scrubbed because it is on EMAIL DNC list."),
   * </pre>
   *
   * <code>EMAIL_TASK_DNC = 8710;</code>
   */
  EMAIL_TASK_DNC(8710),
  /**
   * <pre>
   *, "EMAIL_TASK_INVALID", "Invalid","INV", "Email task has been flagged for having an invalid destination number."),
   * </pre>
   *
   * <code>EMAIL_TASK_INVALID = 8720;</code>
   */
  EMAIL_TASK_INVALID(8720),
  /**
   * <pre>
   *, "EMAIL_TASK_ATTACHMENT_ERROR", "Attachment Error", "ATT", "Email task has been cancelled due to attachment file error"),
   * </pre>
   *
   * <code>EMAIL_TASK_ATTACHMENT_ERROR = 8730;</code>
   */
  EMAIL_TASK_ATTACHMENT_ERROR(8730),
  /**
   * <pre>
   *,"EMAIL_TASK_CANCELLED", "Cancelled","CNC","Email Task is cancelled"),
   * </pre>
   *
   * <code>EMAIL_TASK_CANCELLED = 8740;</code>
   */
  EMAIL_TASK_CANCELLED(8740),
  /**
   * <pre>
   *, "EMAIL_TASK_QUEUED", "Queued", "QED","Email Task is queued in provider"),
   * </pre>
   *
   * <code>EMAIL_TASK_QUEUED = 8800;</code>
   */
  EMAIL_TASK_QUEUED(8800),
  /**
   * <pre>
   *, "EMAIL_TASK_DELIVERED","Delivered","DLV", "Message has been successfully delivered to the receiving server."),
   * </pre>
   *
   * <code>EMAIL_TASK_DELIVERED = 8900;</code>
   */
  EMAIL_TASK_DELIVERED(8900),
  /**
   * <pre>
   *, "EMAIL_TASK_DROPPED","Dropped","DRP", "You may see the following drop reasons: Invalid SMTPAPI header, Spam Content (if spam checker app enabled), Unsubscribed Address, Bounced Address, Spam Reporting Address, Invalid, Recipient List over Package Quota"),
   * </pre>
   *
   * <code>EMAIL_TASK_DROPPED = 8910;</code>
   */
  EMAIL_TASK_DROPPED(8910),
  /**
   * <pre>
   *, "EMAIL_TASK_DEFERRED","Deferred","DFR", "Recipient’s email server temporarily rejected message."),
   * </pre>
   *
   * <code>EMAIL_TASK_DEFERRED = 8920;</code>
   */
  EMAIL_TASK_DEFERRED(8920),
  /**
   * <pre>
   *, "EMAIL_TASK_BOUNCED","Bounced","BNC", "Receiving server could not or would not accept message."),
   * </pre>
   *
   * <code>EMAIL_TASK_BOUNCED = 8930;</code>
   */
  EMAIL_TASK_BOUNCED(8930),
  /**
   * <pre>
   *, "EMAIL_TASK_OPENED","Opened","OPN", "Recipient has opened the HTML message."),
   * </pre>
   *
   * <code>EMAIL_TASK_OPENED = 8940;</code>
   */
  EMAIL_TASK_OPENED(8940),
  /**
   * <pre>
   *, "EMAIL_TASK_CLICKED","Clicked","CLK", "Recipient clicked on a link within the message.");,
   * </pre>
   *
   * <code>EMAIL_TASK_CLICKED = 8950;</code>
   */
  EMAIL_TASK_CLICKED(8950),
  /**
   * <pre>
   * "EMAIL_TASK_UNSUBSCRIBED","Unsubscribed","USB", "Recipient clicked on the 'Opt Out of All Emails' link"),
   * </pre>
   *
   * <code>EMAIL_TASK_UNSUBSCRIBED = 8960;</code>
   */
  EMAIL_TASK_UNSUBSCRIBED(8960),
  /**
   * <pre>
   * "EMAIL_TASK_MARKED_AS_SPAM","Marked As Spam","SPM", "Recipient marked message as spam.");
   * </pre>
   *
   * <code>EMAIL_TASK_MARKED_AS_SPAM = 8970;</code>
   */
  EMAIL_TASK_MARKED_AS_SPAM(8970),
  /**
   * <pre>
   *"EMAIL_TASK_BLOCKED","Recipient marked message as blocked.");
   * </pre>
   *
   * <code>EMAIL_TASK_BLOCKED = 8980;</code>
   */
  EMAIL_TASK_BLOCKED(8980),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EMAIL_RESULT_UNKNOWN = 0;</code>
   */
  public static final int EMAIL_RESULT_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   *, "EMAIL_TASK_WAITING","Waiting","WTG", "Email Task is ready to be sent"),
   * </pre>
   *
   * <code>EMAIL_TASK_WAITING = 8600;</code>
   */
  public static final int EMAIL_TASK_WAITING_VALUE = 8600;
  /**
   * <pre>
   *, "EMAIL_TASK_PROCESSING","Sending","PRC", "Email Task is sent to gateway"),
   * </pre>
   *
   * <code>EMAIL_TASK_PROCESSING = 8700;</code>
   */
  public static final int EMAIL_TASK_PROCESSING_VALUE = 8700;
  /**
   * <pre>
   *, "EMAIL_TASK_DNC","Do Not Call","DNC", "Email has been scrubbed because it is on EMAIL DNC list."),
   * </pre>
   *
   * <code>EMAIL_TASK_DNC = 8710;</code>
   */
  public static final int EMAIL_TASK_DNC_VALUE = 8710;
  /**
   * <pre>
   *, "EMAIL_TASK_INVALID", "Invalid","INV", "Email task has been flagged for having an invalid destination number."),
   * </pre>
   *
   * <code>EMAIL_TASK_INVALID = 8720;</code>
   */
  public static final int EMAIL_TASK_INVALID_VALUE = 8720;
  /**
   * <pre>
   *, "EMAIL_TASK_ATTACHMENT_ERROR", "Attachment Error", "ATT", "Email task has been cancelled due to attachment file error"),
   * </pre>
   *
   * <code>EMAIL_TASK_ATTACHMENT_ERROR = 8730;</code>
   */
  public static final int EMAIL_TASK_ATTACHMENT_ERROR_VALUE = 8730;
  /**
   * <pre>
   *,"EMAIL_TASK_CANCELLED", "Cancelled","CNC","Email Task is cancelled"),
   * </pre>
   *
   * <code>EMAIL_TASK_CANCELLED = 8740;</code>
   */
  public static final int EMAIL_TASK_CANCELLED_VALUE = 8740;
  /**
   * <pre>
   *, "EMAIL_TASK_QUEUED", "Queued", "QED","Email Task is queued in provider"),
   * </pre>
   *
   * <code>EMAIL_TASK_QUEUED = 8800;</code>
   */
  public static final int EMAIL_TASK_QUEUED_VALUE = 8800;
  /**
   * <pre>
   *, "EMAIL_TASK_DELIVERED","Delivered","DLV", "Message has been successfully delivered to the receiving server."),
   * </pre>
   *
   * <code>EMAIL_TASK_DELIVERED = 8900;</code>
   */
  public static final int EMAIL_TASK_DELIVERED_VALUE = 8900;
  /**
   * <pre>
   *, "EMAIL_TASK_DROPPED","Dropped","DRP", "You may see the following drop reasons: Invalid SMTPAPI header, Spam Content (if spam checker app enabled), Unsubscribed Address, Bounced Address, Spam Reporting Address, Invalid, Recipient List over Package Quota"),
   * </pre>
   *
   * <code>EMAIL_TASK_DROPPED = 8910;</code>
   */
  public static final int EMAIL_TASK_DROPPED_VALUE = 8910;
  /**
   * <pre>
   *, "EMAIL_TASK_DEFERRED","Deferred","DFR", "Recipient’s email server temporarily rejected message."),
   * </pre>
   *
   * <code>EMAIL_TASK_DEFERRED = 8920;</code>
   */
  public static final int EMAIL_TASK_DEFERRED_VALUE = 8920;
  /**
   * <pre>
   *, "EMAIL_TASK_BOUNCED","Bounced","BNC", "Receiving server could not or would not accept message."),
   * </pre>
   *
   * <code>EMAIL_TASK_BOUNCED = 8930;</code>
   */
  public static final int EMAIL_TASK_BOUNCED_VALUE = 8930;
  /**
   * <pre>
   *, "EMAIL_TASK_OPENED","Opened","OPN", "Recipient has opened the HTML message."),
   * </pre>
   *
   * <code>EMAIL_TASK_OPENED = 8940;</code>
   */
  public static final int EMAIL_TASK_OPENED_VALUE = 8940;
  /**
   * <pre>
   *, "EMAIL_TASK_CLICKED","Clicked","CLK", "Recipient clicked on a link within the message.");,
   * </pre>
   *
   * <code>EMAIL_TASK_CLICKED = 8950;</code>
   */
  public static final int EMAIL_TASK_CLICKED_VALUE = 8950;
  /**
   * <pre>
   * "EMAIL_TASK_UNSUBSCRIBED","Unsubscribed","USB", "Recipient clicked on the 'Opt Out of All Emails' link"),
   * </pre>
   *
   * <code>EMAIL_TASK_UNSUBSCRIBED = 8960;</code>
   */
  public static final int EMAIL_TASK_UNSUBSCRIBED_VALUE = 8960;
  /**
   * <pre>
   * "EMAIL_TASK_MARKED_AS_SPAM","Marked As Spam","SPM", "Recipient marked message as spam.");
   * </pre>
   *
   * <code>EMAIL_TASK_MARKED_AS_SPAM = 8970;</code>
   */
  public static final int EMAIL_TASK_MARKED_AS_SPAM_VALUE = 8970;
  /**
   * <pre>
   *"EMAIL_TASK_BLOCKED","Recipient marked message as blocked.");
   * </pre>
   *
   * <code>EMAIL_TASK_BLOCKED = 8980;</code>
   */
  public static final int EMAIL_TASK_BLOCKED_VALUE = 8980;


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
  public static EmailResult valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EmailResult forNumber(int value) {
    switch (value) {
      case 0: return EMAIL_RESULT_UNKNOWN;
      case 8600: return EMAIL_TASK_WAITING;
      case 8700: return EMAIL_TASK_PROCESSING;
      case 8710: return EMAIL_TASK_DNC;
      case 8720: return EMAIL_TASK_INVALID;
      case 8730: return EMAIL_TASK_ATTACHMENT_ERROR;
      case 8740: return EMAIL_TASK_CANCELLED;
      case 8800: return EMAIL_TASK_QUEUED;
      case 8900: return EMAIL_TASK_DELIVERED;
      case 8910: return EMAIL_TASK_DROPPED;
      case 8920: return EMAIL_TASK_DEFERRED;
      case 8930: return EMAIL_TASK_BOUNCED;
      case 8940: return EMAIL_TASK_OPENED;
      case 8950: return EMAIL_TASK_CLICKED;
      case 8960: return EMAIL_TASK_UNSUBSCRIBED;
      case 8970: return EMAIL_TASK_MARKED_AS_SPAM;
      case 8980: return EMAIL_TASK_BLOCKED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EmailResult>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EmailResult> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EmailResult>() {
          public EmailResult findValueByNumber(int number) {
            return EmailResult.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.EmailProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final EmailResult[] VALUES = values();

  public static EmailResult valueOf(
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

  private EmailResult(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.EmailResult)
}

