// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/email.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.EmailStatus}
 */
public enum EmailStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EMAIL_STATUS_UNKKNOWN = 0;</code>
   */
  EMAIL_STATUS_UNKKNOWN(0),
  /**
   * <pre>
   * "EMAIL_PREPARING", "Email group is being prepared for scheduling"),
   * </pre>
   *
   * <code>EMAIL_PREPARING = 8000;</code>
   */
  EMAIL_PREPARING(8000),
  /**
   * <pre>
   * "EMAIL_SCHEDULED", "Email group is currently waiting for scheduler"),
   * </pre>
   *
   * <code>EMAIL_SCHEDULED = 8100;</code>
   */
  EMAIL_SCHEDULED(8100),
  /**
   * <pre>
   * "EMAIL_RESUME", "Email group is ready to restart after being paused"),
   * </pre>
   *
   * <code>EMAIL_RESUME = 8150;</code>
   */
  EMAIL_RESUME(8150),
  /**
   * <pre>
   * "EMAIL_RUNNING", "Email group is currently being executed"),
   * </pre>
   *
   * <code>EMAIL_RUNNING = 8200;</code>
   */
  EMAIL_RUNNING(8200),
  /**
   * <pre>
   * "EMAIL_COMPLETED", "Email group has been executed"),
   * </pre>
   *
   * <code>EMAIL_COMPLETED = 8300;</code>
   */
  EMAIL_COMPLETED(8300),
  /**
   * <pre>
   * "EMAIL_CANCELLED", "Email group has been cancelled"),
   * </pre>
   *
   * <code>EMAIL_CANCELLED = 8310;</code>
   */
  EMAIL_CANCELLED(8310),
  /**
   * <pre>
   * "EMAIL_CANCELLED_ADMIN", "Email group has been cancelled by admin"),
   * </pre>
   *
   * <code>EMAIL_CANCELLED_ADMIN = 8320;</code>
   */
  EMAIL_CANCELLED_ADMIN(8320),
  /**
   * <pre>
   *"EMAIL_SUMMED_COMPLETED", "Email group has been executed and is summed"),
   * </pre>
   *
   * <code>EMAIL_SUMMED_COMPLETED = 8400;</code>
   */
  EMAIL_SUMMED_COMPLETED(8400),
  /**
   * <pre>
   *"EMAIL_SUMMED_CANCELLED", "Email group has been cancelled and is summed"),
   * </pre>
   *
   * <code>EMAIL_SUMMED_CANCELLED = 8410;</code>
   */
  EMAIL_SUMMED_CANCELLED(8410),
  /**
   * <pre>
   *"EMAIL_SUMMED_CANCELLED_ADMIN", "Email group has been cancelled by the admin and is summed"),
   * </pre>
   *
   * <code>EMAIL_SUMMED_CANCELLED_ADMIN = 8420;</code>
   */
  EMAIL_SUMMED_CANCELLED_ADMIN(8420),
  /**
   * <pre>
   * "EMAIL_PAUSED", "Email group has been signaled to pause until further notice");
   * </pre>
   *
   * <code>EMAIL_PAUSED = 8500;</code>
   */
  EMAIL_PAUSED(8500),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EMAIL_STATUS_UNKKNOWN = 0;</code>
   */
  public static final int EMAIL_STATUS_UNKKNOWN_VALUE = 0;
  /**
   * <pre>
   * "EMAIL_PREPARING", "Email group is being prepared for scheduling"),
   * </pre>
   *
   * <code>EMAIL_PREPARING = 8000;</code>
   */
  public static final int EMAIL_PREPARING_VALUE = 8000;
  /**
   * <pre>
   * "EMAIL_SCHEDULED", "Email group is currently waiting for scheduler"),
   * </pre>
   *
   * <code>EMAIL_SCHEDULED = 8100;</code>
   */
  public static final int EMAIL_SCHEDULED_VALUE = 8100;
  /**
   * <pre>
   * "EMAIL_RESUME", "Email group is ready to restart after being paused"),
   * </pre>
   *
   * <code>EMAIL_RESUME = 8150;</code>
   */
  public static final int EMAIL_RESUME_VALUE = 8150;
  /**
   * <pre>
   * "EMAIL_RUNNING", "Email group is currently being executed"),
   * </pre>
   *
   * <code>EMAIL_RUNNING = 8200;</code>
   */
  public static final int EMAIL_RUNNING_VALUE = 8200;
  /**
   * <pre>
   * "EMAIL_COMPLETED", "Email group has been executed"),
   * </pre>
   *
   * <code>EMAIL_COMPLETED = 8300;</code>
   */
  public static final int EMAIL_COMPLETED_VALUE = 8300;
  /**
   * <pre>
   * "EMAIL_CANCELLED", "Email group has been cancelled"),
   * </pre>
   *
   * <code>EMAIL_CANCELLED = 8310;</code>
   */
  public static final int EMAIL_CANCELLED_VALUE = 8310;
  /**
   * <pre>
   * "EMAIL_CANCELLED_ADMIN", "Email group has been cancelled by admin"),
   * </pre>
   *
   * <code>EMAIL_CANCELLED_ADMIN = 8320;</code>
   */
  public static final int EMAIL_CANCELLED_ADMIN_VALUE = 8320;
  /**
   * <pre>
   *"EMAIL_SUMMED_COMPLETED", "Email group has been executed and is summed"),
   * </pre>
   *
   * <code>EMAIL_SUMMED_COMPLETED = 8400;</code>
   */
  public static final int EMAIL_SUMMED_COMPLETED_VALUE = 8400;
  /**
   * <pre>
   *"EMAIL_SUMMED_CANCELLED", "Email group has been cancelled and is summed"),
   * </pre>
   *
   * <code>EMAIL_SUMMED_CANCELLED = 8410;</code>
   */
  public static final int EMAIL_SUMMED_CANCELLED_VALUE = 8410;
  /**
   * <pre>
   *"EMAIL_SUMMED_CANCELLED_ADMIN", "Email group has been cancelled by the admin and is summed"),
   * </pre>
   *
   * <code>EMAIL_SUMMED_CANCELLED_ADMIN = 8420;</code>
   */
  public static final int EMAIL_SUMMED_CANCELLED_ADMIN_VALUE = 8420;
  /**
   * <pre>
   * "EMAIL_PAUSED", "Email group has been signaled to pause until further notice");
   * </pre>
   *
   * <code>EMAIL_PAUSED = 8500;</code>
   */
  public static final int EMAIL_PAUSED_VALUE = 8500;


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
  public static EmailStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EmailStatus forNumber(int value) {
    switch (value) {
      case 0: return EMAIL_STATUS_UNKKNOWN;
      case 8000: return EMAIL_PREPARING;
      case 8100: return EMAIL_SCHEDULED;
      case 8150: return EMAIL_RESUME;
      case 8200: return EMAIL_RUNNING;
      case 8300: return EMAIL_COMPLETED;
      case 8310: return EMAIL_CANCELLED;
      case 8320: return EMAIL_CANCELLED_ADMIN;
      case 8400: return EMAIL_SUMMED_COMPLETED;
      case 8410: return EMAIL_SUMMED_CANCELLED;
      case 8420: return EMAIL_SUMMED_CANCELLED_ADMIN;
      case 8500: return EMAIL_PAUSED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EmailStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EmailStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EmailStatus>() {
          public EmailStatus findValueByNumber(int number) {
            return EmailStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.EmailProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final EmailStatus[] VALUES = values();

  public static EmailStatus valueOf(
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

  private EmailStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.EmailStatus)
}

