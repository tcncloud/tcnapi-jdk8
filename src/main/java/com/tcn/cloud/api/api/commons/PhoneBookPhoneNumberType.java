// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/p3api.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.PhoneBookPhoneNumberType}
 */
public enum PhoneBookPhoneNumberType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PHONE_BOOK_PHONE_NUMBER_TYPE_CALLER_ID = 0;</code>
   */
  PHONE_BOOK_PHONE_NUMBER_TYPE_CALLER_ID(0),
  /**
   * <code>PHONE_BOOK_PHONE_NUMBER_TYPE_OUTBOUND = 1;</code>
   */
  PHONE_BOOK_PHONE_NUMBER_TYPE_OUTBOUND(1),
  /**
   * <code>PHONE_BOOK_PHONE_NUMBER_TYPE_TRANSFER = 2;</code>
   */
  PHONE_BOOK_PHONE_NUMBER_TYPE_TRANSFER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PHONE_BOOK_PHONE_NUMBER_TYPE_CALLER_ID = 0;</code>
   */
  public static final int PHONE_BOOK_PHONE_NUMBER_TYPE_CALLER_ID_VALUE = 0;
  /**
   * <code>PHONE_BOOK_PHONE_NUMBER_TYPE_OUTBOUND = 1;</code>
   */
  public static final int PHONE_BOOK_PHONE_NUMBER_TYPE_OUTBOUND_VALUE = 1;
  /**
   * <code>PHONE_BOOK_PHONE_NUMBER_TYPE_TRANSFER = 2;</code>
   */
  public static final int PHONE_BOOK_PHONE_NUMBER_TYPE_TRANSFER_VALUE = 2;


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
  public static PhoneBookPhoneNumberType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PhoneBookPhoneNumberType forNumber(int value) {
    switch (value) {
      case 0: return PHONE_BOOK_PHONE_NUMBER_TYPE_CALLER_ID;
      case 1: return PHONE_BOOK_PHONE_NUMBER_TYPE_OUTBOUND;
      case 2: return PHONE_BOOK_PHONE_NUMBER_TYPE_TRANSFER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PhoneBookPhoneNumberType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PhoneBookPhoneNumberType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PhoneBookPhoneNumberType>() {
          public PhoneBookPhoneNumberType findValueByNumber(int number) {
            return PhoneBookPhoneNumberType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.P3apiProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final PhoneBookPhoneNumberType[] VALUES = values();

  public static PhoneBookPhoneNumberType valueOf(
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

  private PhoneBookPhoneNumberType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.PhoneBookPhoneNumberType)
}

