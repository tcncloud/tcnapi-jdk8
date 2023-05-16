// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.StandardImportFormat}
 */
public enum StandardImportFormat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STANDARD_IMPORT_FORMAT_TAB_DELIMITED = 0;</code>
   */
  STANDARD_IMPORT_FORMAT_TAB_DELIMITED(0),
  /**
   * <code>STANDARD_IMPORT_FORMAT_EXCEL_COMMA_SEPARATED = 1;</code>
   */
  STANDARD_IMPORT_FORMAT_EXCEL_COMMA_SEPARATED(1),
  /**
   * <code>STANDARD_IMPORT_FORMAT_COMMA_SEPARATED = 2;</code>
   */
  STANDARD_IMPORT_FORMAT_COMMA_SEPARATED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STANDARD_IMPORT_FORMAT_TAB_DELIMITED = 0;</code>
   */
  public static final int STANDARD_IMPORT_FORMAT_TAB_DELIMITED_VALUE = 0;
  /**
   * <code>STANDARD_IMPORT_FORMAT_EXCEL_COMMA_SEPARATED = 1;</code>
   */
  public static final int STANDARD_IMPORT_FORMAT_EXCEL_COMMA_SEPARATED_VALUE = 1;
  /**
   * <code>STANDARD_IMPORT_FORMAT_COMMA_SEPARATED = 2;</code>
   */
  public static final int STANDARD_IMPORT_FORMAT_COMMA_SEPARATED_VALUE = 2;


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
  public static StandardImportFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StandardImportFormat forNumber(int value) {
    switch (value) {
      case 0: return STANDARD_IMPORT_FORMAT_TAB_DELIMITED;
      case 1: return STANDARD_IMPORT_FORMAT_EXCEL_COMMA_SEPARATED;
      case 2: return STANDARD_IMPORT_FORMAT_COMMA_SEPARATED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StandardImportFormat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StandardImportFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StandardImportFormat>() {
          public StandardImportFormat findValueByNumber(int number) {
            return StandardImportFormat.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OrgProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final StandardImportFormat[] VALUES = values();

  public static StandardImportFormat valueOf(
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

  private StandardImportFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.StandardImportFormat)
}

