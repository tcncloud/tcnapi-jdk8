// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.public;

/**
 * Protobuf enum {@code api.commons.public.TransactionType}
 */
public enum TransactionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TRANSACTION_TYPE_PAYMENT = 0;</code>
   */
  TRANSACTION_TYPE_PAYMENT(0),
  /**
   * <code>TRANSACTION_TYPE_DATA_INQUIRY = 1;</code>
   */
  TRANSACTION_TYPE_DATA_INQUIRY(1),
  /**
   * <code>TRANSACTION_TYPE_ACCOUNT_VERIFY = 2;</code>
   */
  TRANSACTION_TYPE_ACCOUNT_VERIFY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TRANSACTION_TYPE_PAYMENT = 0;</code>
   */
  public static final int TRANSACTION_TYPE_PAYMENT_VALUE = 0;
  /**
   * <code>TRANSACTION_TYPE_DATA_INQUIRY = 1;</code>
   */
  public static final int TRANSACTION_TYPE_DATA_INQUIRY_VALUE = 1;
  /**
   * <code>TRANSACTION_TYPE_ACCOUNT_VERIFY = 2;</code>
   */
  public static final int TRANSACTION_TYPE_ACCOUNT_VERIFY_VALUE = 2;


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
  public static TransactionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransactionType forNumber(int value) {
    switch (value) {
      case 0: return TRANSACTION_TYPE_PAYMENT;
      case 1: return TRANSACTION_TYPE_DATA_INQUIRY;
      case 2: return TRANSACTION_TYPE_ACCOUNT_VERIFY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransactionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TransactionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TransactionType>() {
          public TransactionType findValueByNumber(int number) {
            return TransactionType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.public.IntegrationsProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final TransactionType[] VALUES = values();

  public static TransactionType valueOf(
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

  private TransactionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.public.TransactionType)
}

