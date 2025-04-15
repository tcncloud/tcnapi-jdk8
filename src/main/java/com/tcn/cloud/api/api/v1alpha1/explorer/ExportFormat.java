// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/entities.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

/**
 * <pre>
 * ExportFormat is an enum for the format of a report.
 * </pre>
 *
 * Protobuf enum {@code api.v1alpha1.explorer.ExportFormat}
 */
public enum ExportFormat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REPORT_FORMAT_UNSPECIFIED = 0;</code>
   */
  REPORT_FORMAT_UNSPECIFIED(0),
  /**
   * <code>REPORT_FORMAT_CSV = 1;</code>
   */
  REPORT_FORMAT_CSV(1),
  /**
   * <code>REPORT_FORMAT_PARQUET = 2;</code>
   */
  REPORT_FORMAT_PARQUET(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REPORT_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int REPORT_FORMAT_UNSPECIFIED_VALUE = 0;
  /**
   * <code>REPORT_FORMAT_CSV = 1;</code>
   */
  public static final int REPORT_FORMAT_CSV_VALUE = 1;
  /**
   * <code>REPORT_FORMAT_PARQUET = 2;</code>
   */
  public static final int REPORT_FORMAT_PARQUET_VALUE = 2;


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
  public static ExportFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ExportFormat forNumber(int value) {
    switch (value) {
      case 0: return REPORT_FORMAT_UNSPECIFIED;
      case 1: return REPORT_FORMAT_CSV;
      case 2: return REPORT_FORMAT_PARQUET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ExportFormat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ExportFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ExportFormat>() {
          public ExportFormat findValueByNumber(int number) {
            return ExportFormat.forNumber(number);
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
    return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ExportFormat[] VALUES = values();

  public static ExportFormat valueOf(
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

  private ExportFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.v1alpha1.explorer.ExportFormat)
}

