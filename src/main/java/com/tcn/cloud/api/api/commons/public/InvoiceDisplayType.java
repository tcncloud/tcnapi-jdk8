// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.public;

/**
 * Protobuf enum {@code api.commons.public.InvoiceDisplayType}
 */
public enum InvoiceDisplayType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <code>AMOUNT_DUE = 1;</code>
   */
  AMOUNT_DUE(1),
  /**
   * <code>SERVICE_DATE = 2;</code>
   */
  SERVICE_DATE(2),
  /**
   * <code>INVOICE_NUMBER = 3;</code>
   */
  INVOICE_NUMBER(3),
  /**
   * <code>ITEM_QUANTITY = 4;</code>
   */
  ITEM_QUANTITY(4),
  /**
   * <code>ITEM_NAME = 5;</code>
   */
  ITEM_NAME(5),
  /**
   * <code>ITEM_DESCRIPTION = 6;</code>
   */
  ITEM_DESCRIPTION(6),
  /**
   * <code>ITEM_AMOUNT = 7;</code>
   */
  ITEM_AMOUNT(7),
  /**
   * <pre>
   * if InvoiceDisplayType is greater than 100, then IDT mod 100 will give you the same type of
   * info for all InvoiceDisplayType values.
   * so 1 = account number, 2 = first name, 3 = last name, etc
   * </pre>
   *
   * <code>PAYOR_ACCOUNT_NUMBER = 101;</code>
   */
  PAYOR_ACCOUNT_NUMBER(101),
  /**
   * <code>PAYOR_FIRST_NAME = 102;</code>
   */
  PAYOR_FIRST_NAME(102),
  /**
   * <code>PAYOR_LAST_NAME = 103;</code>
   */
  PAYOR_LAST_NAME(103),
  /**
   * <code>PAYOR_DATE_OF_BIRTH = 104;</code>
   */
  PAYOR_DATE_OF_BIRTH(104),
  /**
   * <code>PAYOR_SSN_R4 = 105;</code>
   */
  PAYOR_SSN_R4(105),
  /**
   * <code>PAYOR_CELL_PHONE = 106;</code>
   */
  PAYOR_CELL_PHONE(106),
  /**
   * <code>PAYOR_HOME_PHONE = 107;</code>
   */
  PAYOR_HOME_PHONE(107),
  /**
   * <code>PAYOR_WORK_PHONE = 108;</code>
   */
  PAYOR_WORK_PHONE(108),
  /**
   * <code>PAYOR_ZIP_CODE = 109;</code>
   */
  PAYOR_ZIP_CODE(109),
  /**
   * <code>PATIENT_ACCOUNT_NUMBER = 201;</code>
   */
  PATIENT_ACCOUNT_NUMBER(201),
  /**
   * <code>PATIENT_FIRST_NAME = 202;</code>
   */
  PATIENT_FIRST_NAME(202),
  /**
   * <code>PATIENT_LAST_NAME = 203;</code>
   */
  PATIENT_LAST_NAME(203),
  /**
   * <code>PATIENT_DATE_OF_BIRTH = 204;</code>
   */
  PATIENT_DATE_OF_BIRTH(204),
  /**
   * <code>PATIENT_SSN_R4 = 205;</code>
   */
  PATIENT_SSN_R4(205),
  /**
   * <code>PATIENT_CELL_PHONE = 206;</code>
   */
  PATIENT_CELL_PHONE(206),
  /**
   * <code>PATIENT_HOME_PHONE = 207;</code>
   */
  PATIENT_HOME_PHONE(207),
  /**
   * <code>PATIENT_WORK_PHONE = 208;</code>
   */
  PATIENT_WORK_PHONE(208),
  /**
   * <code>PATIENT_ZIP_CODE = 209;</code>
   */
  PATIENT_ZIP_CODE(209),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <code>AMOUNT_DUE = 1;</code>
   */
  public static final int AMOUNT_DUE_VALUE = 1;
  /**
   * <code>SERVICE_DATE = 2;</code>
   */
  public static final int SERVICE_DATE_VALUE = 2;
  /**
   * <code>INVOICE_NUMBER = 3;</code>
   */
  public static final int INVOICE_NUMBER_VALUE = 3;
  /**
   * <code>ITEM_QUANTITY = 4;</code>
   */
  public static final int ITEM_QUANTITY_VALUE = 4;
  /**
   * <code>ITEM_NAME = 5;</code>
   */
  public static final int ITEM_NAME_VALUE = 5;
  /**
   * <code>ITEM_DESCRIPTION = 6;</code>
   */
  public static final int ITEM_DESCRIPTION_VALUE = 6;
  /**
   * <code>ITEM_AMOUNT = 7;</code>
   */
  public static final int ITEM_AMOUNT_VALUE = 7;
  /**
   * <pre>
   * if InvoiceDisplayType is greater than 100, then IDT mod 100 will give you the same type of
   * info for all InvoiceDisplayType values.
   * so 1 = account number, 2 = first name, 3 = last name, etc
   * </pre>
   *
   * <code>PAYOR_ACCOUNT_NUMBER = 101;</code>
   */
  public static final int PAYOR_ACCOUNT_NUMBER_VALUE = 101;
  /**
   * <code>PAYOR_FIRST_NAME = 102;</code>
   */
  public static final int PAYOR_FIRST_NAME_VALUE = 102;
  /**
   * <code>PAYOR_LAST_NAME = 103;</code>
   */
  public static final int PAYOR_LAST_NAME_VALUE = 103;
  /**
   * <code>PAYOR_DATE_OF_BIRTH = 104;</code>
   */
  public static final int PAYOR_DATE_OF_BIRTH_VALUE = 104;
  /**
   * <code>PAYOR_SSN_R4 = 105;</code>
   */
  public static final int PAYOR_SSN_R4_VALUE = 105;
  /**
   * <code>PAYOR_CELL_PHONE = 106;</code>
   */
  public static final int PAYOR_CELL_PHONE_VALUE = 106;
  /**
   * <code>PAYOR_HOME_PHONE = 107;</code>
   */
  public static final int PAYOR_HOME_PHONE_VALUE = 107;
  /**
   * <code>PAYOR_WORK_PHONE = 108;</code>
   */
  public static final int PAYOR_WORK_PHONE_VALUE = 108;
  /**
   * <code>PAYOR_ZIP_CODE = 109;</code>
   */
  public static final int PAYOR_ZIP_CODE_VALUE = 109;
  /**
   * <code>PATIENT_ACCOUNT_NUMBER = 201;</code>
   */
  public static final int PATIENT_ACCOUNT_NUMBER_VALUE = 201;
  /**
   * <code>PATIENT_FIRST_NAME = 202;</code>
   */
  public static final int PATIENT_FIRST_NAME_VALUE = 202;
  /**
   * <code>PATIENT_LAST_NAME = 203;</code>
   */
  public static final int PATIENT_LAST_NAME_VALUE = 203;
  /**
   * <code>PATIENT_DATE_OF_BIRTH = 204;</code>
   */
  public static final int PATIENT_DATE_OF_BIRTH_VALUE = 204;
  /**
   * <code>PATIENT_SSN_R4 = 205;</code>
   */
  public static final int PATIENT_SSN_R4_VALUE = 205;
  /**
   * <code>PATIENT_CELL_PHONE = 206;</code>
   */
  public static final int PATIENT_CELL_PHONE_VALUE = 206;
  /**
   * <code>PATIENT_HOME_PHONE = 207;</code>
   */
  public static final int PATIENT_HOME_PHONE_VALUE = 207;
  /**
   * <code>PATIENT_WORK_PHONE = 208;</code>
   */
  public static final int PATIENT_WORK_PHONE_VALUE = 208;
  /**
   * <code>PATIENT_ZIP_CODE = 209;</code>
   */
  public static final int PATIENT_ZIP_CODE_VALUE = 209;


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
  public static InvoiceDisplayType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InvoiceDisplayType forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return AMOUNT_DUE;
      case 2: return SERVICE_DATE;
      case 3: return INVOICE_NUMBER;
      case 4: return ITEM_QUANTITY;
      case 5: return ITEM_NAME;
      case 6: return ITEM_DESCRIPTION;
      case 7: return ITEM_AMOUNT;
      case 101: return PAYOR_ACCOUNT_NUMBER;
      case 102: return PAYOR_FIRST_NAME;
      case 103: return PAYOR_LAST_NAME;
      case 104: return PAYOR_DATE_OF_BIRTH;
      case 105: return PAYOR_SSN_R4;
      case 106: return PAYOR_CELL_PHONE;
      case 107: return PAYOR_HOME_PHONE;
      case 108: return PAYOR_WORK_PHONE;
      case 109: return PAYOR_ZIP_CODE;
      case 201: return PATIENT_ACCOUNT_NUMBER;
      case 202: return PATIENT_FIRST_NAME;
      case 203: return PATIENT_LAST_NAME;
      case 204: return PATIENT_DATE_OF_BIRTH;
      case 205: return PATIENT_SSN_R4;
      case 206: return PATIENT_CELL_PHONE;
      case 207: return PATIENT_HOME_PHONE;
      case 208: return PATIENT_WORK_PHONE;
      case 209: return PATIENT_ZIP_CODE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InvoiceDisplayType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InvoiceDisplayType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InvoiceDisplayType>() {
          public InvoiceDisplayType findValueByNumber(int number) {
            return InvoiceDisplayType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.public.IntegrationsProto.getDescriptor().getEnumTypes().get(10);
  }

  private static final InvoiceDisplayType[] VALUES = values();

  public static InvoiceDisplayType valueOf(
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

  private InvoiceDisplayType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.public.InvoiceDisplayType)
}

