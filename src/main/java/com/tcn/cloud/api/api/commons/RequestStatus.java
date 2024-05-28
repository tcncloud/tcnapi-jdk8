// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * The RequestStatus, which is the current state of an agent's LeaveRequest for the scheduler service.
 * </pre>
 *
 * Protobuf enum {@code api.commons.RequestStatus}
 */
public enum RequestStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not Set.
   * </pre>
   *
   * <code>UNSPECIFIED_STATUS = 0;</code>
   */
  UNSPECIFIED_STATUS(0),
  /**
   * <pre>
   * The request is pending approval.
   * </pre>
   *
   * <code>PENDING_REQUEST = 1;</code>
   */
  PENDING_REQUEST(1),
  /**
   * <pre>
   * The request has been approved.
   * </pre>
   *
   * <code>APPROVED_REQUEST = 2;</code>
   */
  APPROVED_REQUEST(2),
  /**
   * <pre>
   * The request has been denied.
   * </pre>
   *
   * <code>DENIED_REQUEST = 3;</code>
   */
  DENIED_REQUEST(3),
  /**
   * <pre>
   * The request has been cancelled.
   * </pre>
   *
   * <code>CANCELLED_REQUEST = 4;</code>
   */
  CANCELLED_REQUEST(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not Set.
   * </pre>
   *
   * <code>UNSPECIFIED_STATUS = 0;</code>
   */
  public static final int UNSPECIFIED_STATUS_VALUE = 0;
  /**
   * <pre>
   * The request is pending approval.
   * </pre>
   *
   * <code>PENDING_REQUEST = 1;</code>
   */
  public static final int PENDING_REQUEST_VALUE = 1;
  /**
   * <pre>
   * The request has been approved.
   * </pre>
   *
   * <code>APPROVED_REQUEST = 2;</code>
   */
  public static final int APPROVED_REQUEST_VALUE = 2;
  /**
   * <pre>
   * The request has been denied.
   * </pre>
   *
   * <code>DENIED_REQUEST = 3;</code>
   */
  public static final int DENIED_REQUEST_VALUE = 3;
  /**
   * <pre>
   * The request has been cancelled.
   * </pre>
   *
   * <code>CANCELLED_REQUEST = 4;</code>
   */
  public static final int CANCELLED_REQUEST_VALUE = 4;


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
  public static RequestStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RequestStatus forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED_STATUS;
      case 1: return PENDING_REQUEST;
      case 2: return APPROVED_REQUEST;
      case 3: return DENIED_REQUEST;
      case 4: return CANCELLED_REQUEST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RequestStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RequestStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RequestStatus>() {
          public RequestStatus findValueByNumber(int number) {
            return RequestStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(20);
  }

  private static final RequestStatus[] VALUES = values();

  public static RequestStatus valueOf(
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

  private RequestStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.RequestStatus)
}

