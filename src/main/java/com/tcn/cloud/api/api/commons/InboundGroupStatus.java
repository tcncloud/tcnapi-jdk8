// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/inbound.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.InboundGroupStatus}
 */
public enum InboundGroupStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * never use this
   * </pre>
   *
   * <code>IBG_UNKNOWN = 0;</code>
   */
  IBG_UNKNOWN(0),
  /**
   * <pre>
   * "IBG_PREPARE", "Inbound Group is being prepared for scheduler"),
   * </pre>
   *
   * <code>IBG_PREPARE = 5000;</code>
   */
  IBG_PREPARE(5000),
  /**
   * <pre>
   * "IBG_SCHEDULED", "Inbound Group is waiting for scheduler"),
   * </pre>
   *
   * <code>IBG_SCHEDULED = 5100;</code>
   */
  IBG_SCHEDULED(5100),
  /**
   * <pre>
   * "IBG_RUNNING", "Inbound Group is currently executing calls"),
   * </pre>
   *
   * <code>IBG_RUNNING = 5200;</code>
   */
  IBG_RUNNING(5200),
  /**
   * <pre>
   * "IBG_PAUSED", "Inbound Group has been signaled to pause calls until further notice"),
   * </pre>
   *
   * <code>IBG_PAUSED = 5210;</code>
   */
  IBG_PAUSED(5210),
  /**
   * <pre>
   * "IBG_COMPLETED", "Inbound Group completed normally"),
   * </pre>
   *
   * <code>IBG_COMPLETED = 5300;</code>
   */
  IBG_COMPLETED(5300),
  /**
   * <pre>
   * "IBG_CANCELLED_TIMEOUT", "Inbound Group was cancelled due to time restrictions"),
   * </pre>
   *
   * <code>IBG_CANCELLED_TIMEOUT = 5310;</code>
   */
  IBG_CANCELLED_TIMEOUT(5310),
  /**
   * <pre>
   * "IBG_CANCELLED_USER", "Inbound Group was cancelled by login belonging to client"),
   * </pre>
   *
   * <code>IBG_CANCELLED_USER = 5320;</code>
   */
  IBG_CANCELLED_USER(5320),
  /**
   * <pre>
   * "IBG_CANCELLED_ADMIN", "Inbound Group was cancelled by some login not belonging to client with permissions"),
   * </pre>
   *
   * <code>IBG_CANCELLED_ADMIN = 5330;</code>
   */
  IBG_CANCELLED_ADMIN(5330),
  /**
   * <pre>
   * "IBG_SUMMED_COMPLETED", "Inbound Group completed normally and is summed"),
   * </pre>
   *
   * <code>IBG_SUMMED_COMPLETED = 5400;</code>
   */
  IBG_SUMMED_COMPLETED(5400),
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_TIMEOUT", "Inbound Group timedout and is summed"),
   * </pre>
   *
   * <code>IBG_SUMMED_CANCELLED_TIMEOUT = 5410;</code>
   */
  IBG_SUMMED_CANCELLED_TIMEOUT(5410),
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_USER", "Inbound Group was cancelled by login belonging to client and is summed"),
   * </pre>
   *
   * <code>IBG_SUMMED_CANCELLED_USER = 5420;</code>
   */
  IBG_SUMMED_CANCELLED_USER(5420),
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_ADMIN", "Inbound Group was cancelled by login not belonging to client and is summed"),
   * </pre>
   *
   * <code>IBG_SUMMED_CANCELLED_ADMIN = 5430;</code>
   */
  IBG_SUMMED_CANCELLED_ADMIN(5430),
  /**
   * <pre>
   * "IBG_SUMMED_COMPLETED", "Inbound Group completed normally, summed normally, and has been exported into the accounting packages
   * </pre>
   *
   * <code>IBG_ACCOUNTINGEXPORT_COMPLETED = 5500;</code>
   */
  IBG_ACCOUNTINGEXPORT_COMPLETED(5500),
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_TIMEOUT", "Inbound Group timedout, was summed normally, and has been exported into the accounting packages
   * </pre>
   *
   * <code>IBG_ACCOUNTINGEXPORT_CANCELLED_TIMEOUT = 5510;</code>
   */
  IBG_ACCOUNTINGEXPORT_CANCELLED_TIMEOUT(5510),
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_USER", "Inbound Group was cancelled by login belonging to client, was summed normally, and has been exported into the accounting packages
   * </pre>
   *
   * <code>IBG_ACCOUNTINGEXPORT_CANCELLED_USER = 5520;</code>
   */
  IBG_ACCOUNTINGEXPORT_CANCELLED_USER(5520),
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_ADMIN", "Inbound Group was cancelled by login not belonging to client, was summed normally, and has been exported into the accounting packages
   * </pre>
   *
   * <code>IBG_ACCOUNTINGEXPORT_CANCELLED_ADMIN = 5530;</code>
   */
  IBG_ACCOUNTINGEXPORT_CANCELLED_ADMIN(5530),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * never use this
   * </pre>
   *
   * <code>IBG_UNKNOWN = 0;</code>
   */
  public static final int IBG_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * "IBG_PREPARE", "Inbound Group is being prepared for scheduler"),
   * </pre>
   *
   * <code>IBG_PREPARE = 5000;</code>
   */
  public static final int IBG_PREPARE_VALUE = 5000;
  /**
   * <pre>
   * "IBG_SCHEDULED", "Inbound Group is waiting for scheduler"),
   * </pre>
   *
   * <code>IBG_SCHEDULED = 5100;</code>
   */
  public static final int IBG_SCHEDULED_VALUE = 5100;
  /**
   * <pre>
   * "IBG_RUNNING", "Inbound Group is currently executing calls"),
   * </pre>
   *
   * <code>IBG_RUNNING = 5200;</code>
   */
  public static final int IBG_RUNNING_VALUE = 5200;
  /**
   * <pre>
   * "IBG_PAUSED", "Inbound Group has been signaled to pause calls until further notice"),
   * </pre>
   *
   * <code>IBG_PAUSED = 5210;</code>
   */
  public static final int IBG_PAUSED_VALUE = 5210;
  /**
   * <pre>
   * "IBG_COMPLETED", "Inbound Group completed normally"),
   * </pre>
   *
   * <code>IBG_COMPLETED = 5300;</code>
   */
  public static final int IBG_COMPLETED_VALUE = 5300;
  /**
   * <pre>
   * "IBG_CANCELLED_TIMEOUT", "Inbound Group was cancelled due to time restrictions"),
   * </pre>
   *
   * <code>IBG_CANCELLED_TIMEOUT = 5310;</code>
   */
  public static final int IBG_CANCELLED_TIMEOUT_VALUE = 5310;
  /**
   * <pre>
   * "IBG_CANCELLED_USER", "Inbound Group was cancelled by login belonging to client"),
   * </pre>
   *
   * <code>IBG_CANCELLED_USER = 5320;</code>
   */
  public static final int IBG_CANCELLED_USER_VALUE = 5320;
  /**
   * <pre>
   * "IBG_CANCELLED_ADMIN", "Inbound Group was cancelled by some login not belonging to client with permissions"),
   * </pre>
   *
   * <code>IBG_CANCELLED_ADMIN = 5330;</code>
   */
  public static final int IBG_CANCELLED_ADMIN_VALUE = 5330;
  /**
   * <pre>
   * "IBG_SUMMED_COMPLETED", "Inbound Group completed normally and is summed"),
   * </pre>
   *
   * <code>IBG_SUMMED_COMPLETED = 5400;</code>
   */
  public static final int IBG_SUMMED_COMPLETED_VALUE = 5400;
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_TIMEOUT", "Inbound Group timedout and is summed"),
   * </pre>
   *
   * <code>IBG_SUMMED_CANCELLED_TIMEOUT = 5410;</code>
   */
  public static final int IBG_SUMMED_CANCELLED_TIMEOUT_VALUE = 5410;
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_USER", "Inbound Group was cancelled by login belonging to client and is summed"),
   * </pre>
   *
   * <code>IBG_SUMMED_CANCELLED_USER = 5420;</code>
   */
  public static final int IBG_SUMMED_CANCELLED_USER_VALUE = 5420;
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_ADMIN", "Inbound Group was cancelled by login not belonging to client and is summed"),
   * </pre>
   *
   * <code>IBG_SUMMED_CANCELLED_ADMIN = 5430;</code>
   */
  public static final int IBG_SUMMED_CANCELLED_ADMIN_VALUE = 5430;
  /**
   * <pre>
   * "IBG_SUMMED_COMPLETED", "Inbound Group completed normally, summed normally, and has been exported into the accounting packages
   * </pre>
   *
   * <code>IBG_ACCOUNTINGEXPORT_COMPLETED = 5500;</code>
   */
  public static final int IBG_ACCOUNTINGEXPORT_COMPLETED_VALUE = 5500;
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_TIMEOUT", "Inbound Group timedout, was summed normally, and has been exported into the accounting packages
   * </pre>
   *
   * <code>IBG_ACCOUNTINGEXPORT_CANCELLED_TIMEOUT = 5510;</code>
   */
  public static final int IBG_ACCOUNTINGEXPORT_CANCELLED_TIMEOUT_VALUE = 5510;
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_USER", "Inbound Group was cancelled by login belonging to client, was summed normally, and has been exported into the accounting packages
   * </pre>
   *
   * <code>IBG_ACCOUNTINGEXPORT_CANCELLED_USER = 5520;</code>
   */
  public static final int IBG_ACCOUNTINGEXPORT_CANCELLED_USER_VALUE = 5520;
  /**
   * <pre>
   * "IBG_SUMMED_CANCELLED_ADMIN", "Inbound Group was cancelled by login not belonging to client, was summed normally, and has been exported into the accounting packages
   * </pre>
   *
   * <code>IBG_ACCOUNTINGEXPORT_CANCELLED_ADMIN = 5530;</code>
   */
  public static final int IBG_ACCOUNTINGEXPORT_CANCELLED_ADMIN_VALUE = 5530;


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
  public static InboundGroupStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InboundGroupStatus forNumber(int value) {
    switch (value) {
      case 0: return IBG_UNKNOWN;
      case 5000: return IBG_PREPARE;
      case 5100: return IBG_SCHEDULED;
      case 5200: return IBG_RUNNING;
      case 5210: return IBG_PAUSED;
      case 5300: return IBG_COMPLETED;
      case 5310: return IBG_CANCELLED_TIMEOUT;
      case 5320: return IBG_CANCELLED_USER;
      case 5330: return IBG_CANCELLED_ADMIN;
      case 5400: return IBG_SUMMED_COMPLETED;
      case 5410: return IBG_SUMMED_CANCELLED_TIMEOUT;
      case 5420: return IBG_SUMMED_CANCELLED_USER;
      case 5430: return IBG_SUMMED_CANCELLED_ADMIN;
      case 5500: return IBG_ACCOUNTINGEXPORT_COMPLETED;
      case 5510: return IBG_ACCOUNTINGEXPORT_CANCELLED_TIMEOUT;
      case 5520: return IBG_ACCOUNTINGEXPORT_CANCELLED_USER;
      case 5530: return IBG_ACCOUNTINGEXPORT_CANCELLED_ADMIN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InboundGroupStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InboundGroupStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InboundGroupStatus>() {
          public InboundGroupStatus findValueByNumber(int number) {
            return InboundGroupStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.InboundProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final InboundGroupStatus[] VALUES = values();

  public static InboundGroupStatus valueOf(
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

  private InboundGroupStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.InboundGroupStatus)
}

