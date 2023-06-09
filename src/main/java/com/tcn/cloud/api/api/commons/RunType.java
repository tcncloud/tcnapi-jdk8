// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.RunType}
 */
public enum RunType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RUN_TYPE_ENABLED = 0;</code>
   */
  RUN_TYPE_ENABLED(0),
  /**
   * <code>RUN_TYPE_DISABLED = 1;</code>
   */
  RUN_TYPE_DISABLED(1),
  /**
   * <code>RUN_TYPE_TEST = 2;</code>
   */
  RUN_TYPE_TEST(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RUN_TYPE_ENABLED = 0;</code>
   */
  public static final int RUN_TYPE_ENABLED_VALUE = 0;
  /**
   * <code>RUN_TYPE_DISABLED = 1;</code>
   */
  public static final int RUN_TYPE_DISABLED_VALUE = 1;
  /**
   * <code>RUN_TYPE_TEST = 2;</code>
   */
  public static final int RUN_TYPE_TEST_VALUE = 2;


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
  public static RunType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RunType forNumber(int value) {
    switch (value) {
      case 0: return RUN_TYPE_ENABLED;
      case 1: return RUN_TYPE_DISABLED;
      case 2: return RUN_TYPE_TEST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RunType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RunType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RunType>() {
          public RunType findValueByNumber(int number) {
            return RunType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.LmsProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final RunType[] VALUES = values();

  public static RunType valueOf(
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

  private RunType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.RunType)
}

