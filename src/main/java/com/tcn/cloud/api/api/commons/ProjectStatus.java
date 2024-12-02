// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.ProjectStatus}
 */
public enum ProjectStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PROJECT_STATUS_UNKNOWN = 0;</code>
   */
  PROJECT_STATUS_UNKNOWN(0),
  /**
   * <pre>
   *Project status is Open
   * </pre>
   *
   * <code>PROJECT_STATUS_OPEN = 17000;</code>
   */
  PROJECT_STATUS_OPEN(17000),
  /**
   * <pre>
   *Project status is Closed
   * </pre>
   *
   * <code>PROJECT_STATUS_CLOSED = 17010;</code>
   */
  PROJECT_STATUS_CLOSED(17010),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PROJECT_STATUS_UNKNOWN = 0;</code>
   */
  public static final int PROJECT_STATUS_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   *Project status is Open
   * </pre>
   *
   * <code>PROJECT_STATUS_OPEN = 17000;</code>
   */
  public static final int PROJECT_STATUS_OPEN_VALUE = 17000;
  /**
   * <pre>
   *Project status is Closed
   * </pre>
   *
   * <code>PROJECT_STATUS_CLOSED = 17010;</code>
   */
  public static final int PROJECT_STATUS_CLOSED_VALUE = 17010;


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
  public static ProjectStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProjectStatus forNumber(int value) {
    switch (value) {
      case 0: return PROJECT_STATUS_UNKNOWN;
      case 17000: return PROJECT_STATUS_OPEN;
      case 17010: return PROJECT_STATUS_CLOSED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProjectStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProjectStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProjectStatus>() {
          public ProjectStatus findValueByNumber(int number) {
            return ProjectStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(20);
  }

  private static final ProjectStatus[] VALUES = values();

  public static ProjectStatus valueOf(
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

  private ProjectStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ProjectStatus)
}

