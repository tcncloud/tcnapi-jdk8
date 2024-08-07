// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha4/invoice.proto

package com.tcn.cloud.api.services.billing.v1alpha4;

/**
 * Protobuf enum {@code services.billing.v1alpha4.InvoiceFormat}
 */
public enum InvoiceFormat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INVOICE_FORMAT_UNSPECIFIED = 0;</code>
   */
  INVOICE_FORMAT_UNSPECIFIED(0),
  /**
   * <code>INVOICE_FORMAT_CSV = 1;</code>
   */
  INVOICE_FORMAT_CSV(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INVOICE_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int INVOICE_FORMAT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>INVOICE_FORMAT_CSV = 1;</code>
   */
  public static final int INVOICE_FORMAT_CSV_VALUE = 1;


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
  public static InvoiceFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static InvoiceFormat forNumber(int value) {
    switch (value) {
      case 0: return INVOICE_FORMAT_UNSPECIFIED;
      case 1: return INVOICE_FORMAT_CSV;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<InvoiceFormat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      InvoiceFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InvoiceFormat>() {
          public InvoiceFormat findValueByNumber(int number) {
            return InvoiceFormat.forNumber(number);
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
    return com.tcn.cloud.api.services.billing.v1alpha4.InvoiceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final InvoiceFormat[] VALUES = values();

  public static InvoiceFormat valueOf(
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

  private InvoiceFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.billing.v1alpha4.InvoiceFormat)
}

