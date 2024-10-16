// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.integrations;

/**
 * <pre>
 * supported types of values when sending a request or response.
 * </pre>
 *
 * Protobuf enum {@code api.commons.integrations.ValueType}
 */
public enum ValueType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VALUE_TYPE_UNKNOWN = 0;</code>
   */
  VALUE_TYPE_UNKNOWN(0),
  /**
   * <code>VALUE_TYPE_NUMBER = 1;</code>
   */
  VALUE_TYPE_NUMBER(1),
  /**
   * <code>VALUE_TYPE_BOOL = 2;</code>
   */
  VALUE_TYPE_BOOL(2),
  /**
   * <code>VALUE_TYPE_MAP = 3;</code>
   */
  VALUE_TYPE_MAP(3),
  /**
   * <code>VALUE_TYPE_ARRAY = 4;</code>
   */
  VALUE_TYPE_ARRAY(4),
  /**
   * <code>VALUE_TYPE_INT = 5;</code>
   */
  VALUE_TYPE_INT(5),
  /**
   * <code>VALUE_TYPE_STRING = 6;</code>
   */
  VALUE_TYPE_STRING(6),
  /**
   * <code>VALUE_TYPE_TIME = 7;</code>
   */
  VALUE_TYPE_TIME(7),
  /**
   * <code>VALUE_TYPE_COMPOSITE_VAL = 8;</code>
   */
  VALUE_TYPE_COMPOSITE_VAL(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VALUE_TYPE_UNKNOWN = 0;</code>
   */
  public static final int VALUE_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <code>VALUE_TYPE_NUMBER = 1;</code>
   */
  public static final int VALUE_TYPE_NUMBER_VALUE = 1;
  /**
   * <code>VALUE_TYPE_BOOL = 2;</code>
   */
  public static final int VALUE_TYPE_BOOL_VALUE = 2;
  /**
   * <code>VALUE_TYPE_MAP = 3;</code>
   */
  public static final int VALUE_TYPE_MAP_VALUE = 3;
  /**
   * <code>VALUE_TYPE_ARRAY = 4;</code>
   */
  public static final int VALUE_TYPE_ARRAY_VALUE = 4;
  /**
   * <code>VALUE_TYPE_INT = 5;</code>
   */
  public static final int VALUE_TYPE_INT_VALUE = 5;
  /**
   * <code>VALUE_TYPE_STRING = 6;</code>
   */
  public static final int VALUE_TYPE_STRING_VALUE = 6;
  /**
   * <code>VALUE_TYPE_TIME = 7;</code>
   */
  public static final int VALUE_TYPE_TIME_VALUE = 7;
  /**
   * <code>VALUE_TYPE_COMPOSITE_VAL = 8;</code>
   */
  public static final int VALUE_TYPE_COMPOSITE_VAL_VALUE = 8;


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
  public static ValueType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ValueType forNumber(int value) {
    switch (value) {
      case 0: return VALUE_TYPE_UNKNOWN;
      case 1: return VALUE_TYPE_NUMBER;
      case 2: return VALUE_TYPE_BOOL;
      case 3: return VALUE_TYPE_MAP;
      case 4: return VALUE_TYPE_ARRAY;
      case 5: return VALUE_TYPE_INT;
      case 6: return VALUE_TYPE_STRING;
      case 7: return VALUE_TYPE_TIME;
      case 8: return VALUE_TYPE_COMPOSITE_VAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ValueType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ValueType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ValueType>() {
          public ValueType findValueByNumber(int number) {
            return ValueType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.integrations.IntegrationsProto.getDescriptor().getEnumTypes().get(6);
  }

  private static final ValueType[] VALUES = values();

  public static ValueType valueOf(
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

  private ValueType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.integrations.ValueType)
}

