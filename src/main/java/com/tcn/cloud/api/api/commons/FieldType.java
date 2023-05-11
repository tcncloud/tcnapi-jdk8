// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.FieldType}
 */
public enum FieldType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FIELD_TYPE_STRING = 0;</code>
   */
  FIELD_TYPE_STRING(0),
  /**
   * <code>FIELD_TYPE_NUMBER = 1;</code>
   */
  FIELD_TYPE_NUMBER(1),
  /**
   * <code>FIELD_TYPE_BOOLEAN = 2;</code>
   */
  FIELD_TYPE_BOOLEAN(2),
  /**
   * <code>FIELD_TYPE_PHONE = 3;</code>
   */
  FIELD_TYPE_PHONE(3),
  /**
   * <code>FIELD_TYPE_CURRENCY = 4;</code>
   */
  FIELD_TYPE_CURRENCY(4),
  /**
   * <code>FIELD_TYPE_EMAIL = 5;</code>
   */
  FIELD_TYPE_EMAIL(5),
  /**
   * <code>FIELD_TYPE_DATETIME_NOW = 6;</code>
   */
  FIELD_TYPE_DATETIME_NOW(6),
  /**
   * <code>FIELD_TYPE_DATETIME_TIMESTAMP = 7;</code>
   */
  FIELD_TYPE_DATETIME_TIMESTAMP(7),
  /**
   * <code>FIELD_TYPE_DATETIME_DATE = 8;</code>
   */
  FIELD_TYPE_DATETIME_DATE(8),
  /**
   * <code>FIELD_TYPE_DATETIME_MONTH_AND_DAY = 9;</code>
   */
  FIELD_TYPE_DATETIME_MONTH_AND_DAY(9),
  /**
   * <code>FIELD_TYPE_DATETIME_TIME_OF_DAY = 10;</code>
   */
  FIELD_TYPE_DATETIME_TIME_OF_DAY(10),
  /**
   * <code>FIELD_TYPE_POSTAL_CODE = 12;</code>
   */
  FIELD_TYPE_POSTAL_CODE(12),
  /**
   * <code>FIELD_TYPE_ENRICHED_PHONE = 13;</code>
   */
  FIELD_TYPE_ENRICHED_PHONE(13),
  /**
   * <code>FIELD_TYPE_ENRICHED_ZIP = 14;</code>
   */
  FIELD_TYPE_ENRICHED_ZIP(14),
  /**
   * <code>FIELD_TYPE_SOCIAL = 15;</code>
   */
  FIELD_TYPE_SOCIAL(15),
  /**
   * <code>FIELD_TYPE_DATE_OF_BIRTH = 16;</code>
   */
  FIELD_TYPE_DATE_OF_BIRTH(16),
  /**
   * <code>FIELD_TYPE_FULL_NAME = 17;</code>
   */
  FIELD_TYPE_FULL_NAME(17),
  /**
   * <code>FIELD_TYPE_ACCOUNT_NUMBER = 18;</code>
   */
  FIELD_TYPE_ACCOUNT_NUMBER(18),
  /**
   * <code>FIELD_TYPE_ERROR = 19;</code>
   */
  FIELD_TYPE_ERROR(19),
  /**
   * <code>FIELD_TYPE_STRUCT_VALUE = 20;</code>
   */
  FIELD_TYPE_STRUCT_VALUE(20),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FIELD_TYPE_STRING = 0;</code>
   */
  public static final int FIELD_TYPE_STRING_VALUE = 0;
  /**
   * <code>FIELD_TYPE_NUMBER = 1;</code>
   */
  public static final int FIELD_TYPE_NUMBER_VALUE = 1;
  /**
   * <code>FIELD_TYPE_BOOLEAN = 2;</code>
   */
  public static final int FIELD_TYPE_BOOLEAN_VALUE = 2;
  /**
   * <code>FIELD_TYPE_PHONE = 3;</code>
   */
  public static final int FIELD_TYPE_PHONE_VALUE = 3;
  /**
   * <code>FIELD_TYPE_CURRENCY = 4;</code>
   */
  public static final int FIELD_TYPE_CURRENCY_VALUE = 4;
  /**
   * <code>FIELD_TYPE_EMAIL = 5;</code>
   */
  public static final int FIELD_TYPE_EMAIL_VALUE = 5;
  /**
   * <code>FIELD_TYPE_DATETIME_NOW = 6;</code>
   */
  public static final int FIELD_TYPE_DATETIME_NOW_VALUE = 6;
  /**
   * <code>FIELD_TYPE_DATETIME_TIMESTAMP = 7;</code>
   */
  public static final int FIELD_TYPE_DATETIME_TIMESTAMP_VALUE = 7;
  /**
   * <code>FIELD_TYPE_DATETIME_DATE = 8;</code>
   */
  public static final int FIELD_TYPE_DATETIME_DATE_VALUE = 8;
  /**
   * <code>FIELD_TYPE_DATETIME_MONTH_AND_DAY = 9;</code>
   */
  public static final int FIELD_TYPE_DATETIME_MONTH_AND_DAY_VALUE = 9;
  /**
   * <code>FIELD_TYPE_DATETIME_TIME_OF_DAY = 10;</code>
   */
  public static final int FIELD_TYPE_DATETIME_TIME_OF_DAY_VALUE = 10;
  /**
   * <code>FIELD_TYPE_POSTAL_CODE = 12;</code>
   */
  public static final int FIELD_TYPE_POSTAL_CODE_VALUE = 12;
  /**
   * <code>FIELD_TYPE_ENRICHED_PHONE = 13;</code>
   */
  public static final int FIELD_TYPE_ENRICHED_PHONE_VALUE = 13;
  /**
   * <code>FIELD_TYPE_ENRICHED_ZIP = 14;</code>
   */
  public static final int FIELD_TYPE_ENRICHED_ZIP_VALUE = 14;
  /**
   * <code>FIELD_TYPE_SOCIAL = 15;</code>
   */
  public static final int FIELD_TYPE_SOCIAL_VALUE = 15;
  /**
   * <code>FIELD_TYPE_DATE_OF_BIRTH = 16;</code>
   */
  public static final int FIELD_TYPE_DATE_OF_BIRTH_VALUE = 16;
  /**
   * <code>FIELD_TYPE_FULL_NAME = 17;</code>
   */
  public static final int FIELD_TYPE_FULL_NAME_VALUE = 17;
  /**
   * <code>FIELD_TYPE_ACCOUNT_NUMBER = 18;</code>
   */
  public static final int FIELD_TYPE_ACCOUNT_NUMBER_VALUE = 18;
  /**
   * <code>FIELD_TYPE_ERROR = 19;</code>
   */
  public static final int FIELD_TYPE_ERROR_VALUE = 19;
  /**
   * <code>FIELD_TYPE_STRUCT_VALUE = 20;</code>
   */
  public static final int FIELD_TYPE_STRUCT_VALUE_VALUE = 20;


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
  public static FieldType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FieldType forNumber(int value) {
    switch (value) {
      case 0: return FIELD_TYPE_STRING;
      case 1: return FIELD_TYPE_NUMBER;
      case 2: return FIELD_TYPE_BOOLEAN;
      case 3: return FIELD_TYPE_PHONE;
      case 4: return FIELD_TYPE_CURRENCY;
      case 5: return FIELD_TYPE_EMAIL;
      case 6: return FIELD_TYPE_DATETIME_NOW;
      case 7: return FIELD_TYPE_DATETIME_TIMESTAMP;
      case 8: return FIELD_TYPE_DATETIME_DATE;
      case 9: return FIELD_TYPE_DATETIME_MONTH_AND_DAY;
      case 10: return FIELD_TYPE_DATETIME_TIME_OF_DAY;
      case 12: return FIELD_TYPE_POSTAL_CODE;
      case 13: return FIELD_TYPE_ENRICHED_PHONE;
      case 14: return FIELD_TYPE_ENRICHED_ZIP;
      case 15: return FIELD_TYPE_SOCIAL;
      case 16: return FIELD_TYPE_DATE_OF_BIRTH;
      case 17: return FIELD_TYPE_FULL_NAME;
      case 18: return FIELD_TYPE_ACCOUNT_NUMBER;
      case 19: return FIELD_TYPE_ERROR;
      case 20: return FIELD_TYPE_STRUCT_VALUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FieldType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FieldType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FieldType>() {
          public FieldType findValueByNumber(int number) {
            return FieldType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.LmsProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final FieldType[] VALUES = values();

  public static FieldType valueOf(
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

  private FieldType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.FieldType)
}

