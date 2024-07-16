// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/insights.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Enum for Column Format Type
 * </pre>
 *
 * Protobuf enum {@code api.commons.OperationType}
 */
public enum OperationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>OPERATION_TYPE_UNSPECIFIED = 0;</code>
   */
  OPERATION_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Date format type
   * </pre>
   *
   * <code>OPERATION_TYPE_DATE = 1;</code>
   */
  OPERATION_TYPE_DATE(1),
  /**
   * <pre>
   * Prefix format type
   * </pre>
   *
   * <code>OPERATION_TYPE_PREFIX = 2;</code>
   */
  OPERATION_TYPE_PREFIX(2),
  /**
   * <pre>
   * Suffix format type
   * </pre>
   *
   * <code>OPERATION_TYPE_SUFFIX = 3;</code>
   */
  OPERATION_TYPE_SUFFIX(3),
  /**
   * <pre>
   * Duration format type
   * </pre>
   *
   * <code>OPERATION_TYPE_DURATION = 4;</code>
   */
  OPERATION_TYPE_DURATION(4),
  /**
   * <pre>
   * Add operation
   * </pre>
   *
   * <code>OPERATION_TYPE_ADD = 5;</code>
   */
  OPERATION_TYPE_ADD(5),
  /**
   * <pre>
   * Subract operation
   * </pre>
   *
   * <code>OPERATION_TYPE_SUBTRACT = 6;</code>
   */
  OPERATION_TYPE_SUBTRACT(6),
  /**
   * <pre>
   * Multiply operation
   * </pre>
   *
   * <code>OPERATION_TYPE_MULTIPLY = 7;</code>
   */
  OPERATION_TYPE_MULTIPLY(7),
  /**
   * <pre>
   * Divide operation
   * </pre>
   *
   * <code>OPERATION_TYPE_DIVIDE = 8;</code>
   */
  OPERATION_TYPE_DIVIDE(8),
  /**
   * <pre>
   * Format number operation
   * </pre>
   *
   * <code>OPERATION_TYPE_FORMAT_NUMBER = 9;</code>
   */
  OPERATION_TYPE_FORMAT_NUMBER(9),
  /**
   * <pre>
   * Precision operation
   * </pre>
   *
   * <code>OPERATION_TYPE_PRECISION = 10;</code>
   */
  OPERATION_TYPE_PRECISION(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>OPERATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int OPERATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Date format type
   * </pre>
   *
   * <code>OPERATION_TYPE_DATE = 1;</code>
   */
  public static final int OPERATION_TYPE_DATE_VALUE = 1;
  /**
   * <pre>
   * Prefix format type
   * </pre>
   *
   * <code>OPERATION_TYPE_PREFIX = 2;</code>
   */
  public static final int OPERATION_TYPE_PREFIX_VALUE = 2;
  /**
   * <pre>
   * Suffix format type
   * </pre>
   *
   * <code>OPERATION_TYPE_SUFFIX = 3;</code>
   */
  public static final int OPERATION_TYPE_SUFFIX_VALUE = 3;
  /**
   * <pre>
   * Duration format type
   * </pre>
   *
   * <code>OPERATION_TYPE_DURATION = 4;</code>
   */
  public static final int OPERATION_TYPE_DURATION_VALUE = 4;
  /**
   * <pre>
   * Add operation
   * </pre>
   *
   * <code>OPERATION_TYPE_ADD = 5;</code>
   */
  public static final int OPERATION_TYPE_ADD_VALUE = 5;
  /**
   * <pre>
   * Subract operation
   * </pre>
   *
   * <code>OPERATION_TYPE_SUBTRACT = 6;</code>
   */
  public static final int OPERATION_TYPE_SUBTRACT_VALUE = 6;
  /**
   * <pre>
   * Multiply operation
   * </pre>
   *
   * <code>OPERATION_TYPE_MULTIPLY = 7;</code>
   */
  public static final int OPERATION_TYPE_MULTIPLY_VALUE = 7;
  /**
   * <pre>
   * Divide operation
   * </pre>
   *
   * <code>OPERATION_TYPE_DIVIDE = 8;</code>
   */
  public static final int OPERATION_TYPE_DIVIDE_VALUE = 8;
  /**
   * <pre>
   * Format number operation
   * </pre>
   *
   * <code>OPERATION_TYPE_FORMAT_NUMBER = 9;</code>
   */
  public static final int OPERATION_TYPE_FORMAT_NUMBER_VALUE = 9;
  /**
   * <pre>
   * Precision operation
   * </pre>
   *
   * <code>OPERATION_TYPE_PRECISION = 10;</code>
   */
  public static final int OPERATION_TYPE_PRECISION_VALUE = 10;


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
  public static OperationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OperationType forNumber(int value) {
    switch (value) {
      case 0: return OPERATION_TYPE_UNSPECIFIED;
      case 1: return OPERATION_TYPE_DATE;
      case 2: return OPERATION_TYPE_PREFIX;
      case 3: return OPERATION_TYPE_SUFFIX;
      case 4: return OPERATION_TYPE_DURATION;
      case 5: return OPERATION_TYPE_ADD;
      case 6: return OPERATION_TYPE_SUBTRACT;
      case 7: return OPERATION_TYPE_MULTIPLY;
      case 8: return OPERATION_TYPE_DIVIDE;
      case 9: return OPERATION_TYPE_FORMAT_NUMBER;
      case 10: return OPERATION_TYPE_PRECISION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OperationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OperationType>() {
          public OperationType findValueByNumber(int number) {
            return OperationType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.InsightsProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final OperationType[] VALUES = values();

  public static OperationType valueOf(
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

  private OperationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.OperationType)
}
