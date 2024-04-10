// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/classifier.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * these are the types that will be used for File Templates
 * </pre>
 *
 * Protobuf enum {@code api.commons.ClassifierEntityType}
 */
public enum ClassifierEntityType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CET_UNKNOWN = 0;</code>
   */
  CET_UNKNOWN(0),
  /**
   * <code>CET_CREDIT_CARD = 1;</code>
   */
  CET_CREDIT_CARD(1),
  /**
   * <code>CET_CRYPTO = 2;</code>
   */
  CET_CRYPTO(2),
  /**
   * <code>CET_DATE_TIME = 3;</code>
   */
  CET_DATE_TIME(3),
  /**
   * <code>CET_EMAIL_ADDRESS = 4;</code>
   */
  CET_EMAIL_ADDRESS(4),
  /**
   * <code>CET_IBAN_CODE = 5;</code>
   */
  CET_IBAN_CODE(5),
  /**
   * <code>CET_IP_ADDRESS = 6;</code>
   */
  CET_IP_ADDRESS(6),
  /**
   * <code>CET_NRP = 7;</code>
   */
  CET_NRP(7),
  /**
   * <code>CET_LOCATION = 8;</code>
   */
  CET_LOCATION(8),
  /**
   * <code>CET_PERSON = 9;</code>
   */
  CET_PERSON(9),
  /**
   * <code>CET_PHONE_NUMBER = 10;</code>
   */
  CET_PHONE_NUMBER(10),
  /**
   * <code>CET_MEDICAL_LICENSE = 11;</code>
   */
  CET_MEDICAL_LICENSE(11),
  /**
   * <code>CET_URL = 12;</code>
   */
  CET_URL(12),
  /**
   * <code>CET_US_BANK_NUMBER = 13;</code>
   */
  CET_US_BANK_NUMBER(13),
  /**
   * <code>CET_US_DRIVER_LICENSE = 14;</code>
   */
  CET_US_DRIVER_LICENSE(14),
  /**
   * <code>CET_US_ITIN = 15;</code>
   */
  CET_US_ITIN(15),
  /**
   * <code>CET_US_PASSPORT = 16;</code>
   */
  CET_US_PASSPORT(16),
  /**
   * <code>CET_US_SSN = 17;</code>
   */
  CET_US_SSN(17),
  /**
   * <code>CET_POSTAL_CODE = 18;</code>
   */
  CET_POSTAL_CODE(18),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CET_UNKNOWN = 0;</code>
   */
  public static final int CET_UNKNOWN_VALUE = 0;
  /**
   * <code>CET_CREDIT_CARD = 1;</code>
   */
  public static final int CET_CREDIT_CARD_VALUE = 1;
  /**
   * <code>CET_CRYPTO = 2;</code>
   */
  public static final int CET_CRYPTO_VALUE = 2;
  /**
   * <code>CET_DATE_TIME = 3;</code>
   */
  public static final int CET_DATE_TIME_VALUE = 3;
  /**
   * <code>CET_EMAIL_ADDRESS = 4;</code>
   */
  public static final int CET_EMAIL_ADDRESS_VALUE = 4;
  /**
   * <code>CET_IBAN_CODE = 5;</code>
   */
  public static final int CET_IBAN_CODE_VALUE = 5;
  /**
   * <code>CET_IP_ADDRESS = 6;</code>
   */
  public static final int CET_IP_ADDRESS_VALUE = 6;
  /**
   * <code>CET_NRP = 7;</code>
   */
  public static final int CET_NRP_VALUE = 7;
  /**
   * <code>CET_LOCATION = 8;</code>
   */
  public static final int CET_LOCATION_VALUE = 8;
  /**
   * <code>CET_PERSON = 9;</code>
   */
  public static final int CET_PERSON_VALUE = 9;
  /**
   * <code>CET_PHONE_NUMBER = 10;</code>
   */
  public static final int CET_PHONE_NUMBER_VALUE = 10;
  /**
   * <code>CET_MEDICAL_LICENSE = 11;</code>
   */
  public static final int CET_MEDICAL_LICENSE_VALUE = 11;
  /**
   * <code>CET_URL = 12;</code>
   */
  public static final int CET_URL_VALUE = 12;
  /**
   * <code>CET_US_BANK_NUMBER = 13;</code>
   */
  public static final int CET_US_BANK_NUMBER_VALUE = 13;
  /**
   * <code>CET_US_DRIVER_LICENSE = 14;</code>
   */
  public static final int CET_US_DRIVER_LICENSE_VALUE = 14;
  /**
   * <code>CET_US_ITIN = 15;</code>
   */
  public static final int CET_US_ITIN_VALUE = 15;
  /**
   * <code>CET_US_PASSPORT = 16;</code>
   */
  public static final int CET_US_PASSPORT_VALUE = 16;
  /**
   * <code>CET_US_SSN = 17;</code>
   */
  public static final int CET_US_SSN_VALUE = 17;
  /**
   * <code>CET_POSTAL_CODE = 18;</code>
   */
  public static final int CET_POSTAL_CODE_VALUE = 18;


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
  public static ClassifierEntityType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ClassifierEntityType forNumber(int value) {
    switch (value) {
      case 0: return CET_UNKNOWN;
      case 1: return CET_CREDIT_CARD;
      case 2: return CET_CRYPTO;
      case 3: return CET_DATE_TIME;
      case 4: return CET_EMAIL_ADDRESS;
      case 5: return CET_IBAN_CODE;
      case 6: return CET_IP_ADDRESS;
      case 7: return CET_NRP;
      case 8: return CET_LOCATION;
      case 9: return CET_PERSON;
      case 10: return CET_PHONE_NUMBER;
      case 11: return CET_MEDICAL_LICENSE;
      case 12: return CET_URL;
      case 13: return CET_US_BANK_NUMBER;
      case 14: return CET_US_DRIVER_LICENSE;
      case 15: return CET_US_ITIN;
      case 16: return CET_US_PASSPORT;
      case 17: return CET_US_SSN;
      case 18: return CET_POSTAL_CODE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ClassifierEntityType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ClassifierEntityType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClassifierEntityType>() {
          public ClassifierEntityType findValueByNumber(int number) {
            return ClassifierEntityType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.ClassifierProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ClassifierEntityType[] VALUES = values();

  public static ClassifierEntityType valueOf(
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

  private ClassifierEntityType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ClassifierEntityType)
}
