// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * The AgentLeavePetitionStatus, which is the current state of an agent's AgentLeavePetition for the scheduler service.
 * </pre>
 *
 * Protobuf enum {@code api.commons.AgentLeavePetitionStatus}
 */
public enum AgentLeavePetitionStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not Set.
   * </pre>
   *
   * <code>UNSPECIFIED_PETITION_STATUS = 0;</code>
   */
  UNSPECIFIED_PETITION_STATUS(0),
  /**
   * <pre>
   * The petition is pending approval.
   * </pre>
   *
   * <code>PENDING_PETITION = 1;</code>
   */
  PENDING_PETITION(1),
  /**
   * <pre>
   * The petition has been approved.
   * </pre>
   *
   * <code>APPROVED_PETITION = 2;</code>
   */
  APPROVED_PETITION(2),
  /**
   * <pre>
   * The petition has been denied.
   * </pre>
   *
   * <code>DENIED_PETITION = 3;</code>
   */
  DENIED_PETITION(3),
  /**
   * <pre>
   * The petition has been cancelled.
   * </pre>
   *
   * <code>CANCELLED_PETITION = 4;</code>
   */
  CANCELLED_PETITION(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not Set.
   * </pre>
   *
   * <code>UNSPECIFIED_PETITION_STATUS = 0;</code>
   */
  public static final int UNSPECIFIED_PETITION_STATUS_VALUE = 0;
  /**
   * <pre>
   * The petition is pending approval.
   * </pre>
   *
   * <code>PENDING_PETITION = 1;</code>
   */
  public static final int PENDING_PETITION_VALUE = 1;
  /**
   * <pre>
   * The petition has been approved.
   * </pre>
   *
   * <code>APPROVED_PETITION = 2;</code>
   */
  public static final int APPROVED_PETITION_VALUE = 2;
  /**
   * <pre>
   * The petition has been denied.
   * </pre>
   *
   * <code>DENIED_PETITION = 3;</code>
   */
  public static final int DENIED_PETITION_VALUE = 3;
  /**
   * <pre>
   * The petition has been cancelled.
   * </pre>
   *
   * <code>CANCELLED_PETITION = 4;</code>
   */
  public static final int CANCELLED_PETITION_VALUE = 4;


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
  public static AgentLeavePetitionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AgentLeavePetitionStatus forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_PETITION_STATUS;
      case 1: return PENDING_PETITION;
      case 2: return APPROVED_PETITION;
      case 3: return DENIED_PETITION;
      case 4: return CANCELLED_PETITION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AgentLeavePetitionStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AgentLeavePetitionStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AgentLeavePetitionStatus>() {
          public AgentLeavePetitionStatus findValueByNumber(int number) {
            return AgentLeavePetitionStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(22);
  }

  private static final AgentLeavePetitionStatus[] VALUES = values();

  public static AgentLeavePetitionStatus valueOf(
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

  private AgentLeavePetitionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.AgentLeavePetitionStatus)
}

