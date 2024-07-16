// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/insights.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Enum for Column Summary Type
 * </pre>
 *
 * Protobuf enum {@code api.commons.OutputConfigurationColumnSummaryType}
 */
public enum OutputConfigurationColumnSummaryType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_UNSPECIFIED = 0;</code>
   */
  OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Sumamry type Average
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_AVG = 1;</code>
   */
  OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_AVG(1),
  /**
   * <pre>
   * Summary type Summation
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_SUM = 2;</code>
   */
  OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_SUM(2),
  /**
   * <pre>
   * Summary type Minimum
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MIN = 3;</code>
   */
  OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MIN(3),
  /**
   * <pre>
   * Summary type Maximum
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MAX = 4;</code>
   */
  OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MAX(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Sumamry type Average
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_AVG = 1;</code>
   */
  public static final int OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_AVG_VALUE = 1;
  /**
   * <pre>
   * Summary type Summation
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_SUM = 2;</code>
   */
  public static final int OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_SUM_VALUE = 2;
  /**
   * <pre>
   * Summary type Minimum
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MIN = 3;</code>
   */
  public static final int OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MIN_VALUE = 3;
  /**
   * <pre>
   * Summary type Maximum
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MAX = 4;</code>
   */
  public static final int OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MAX_VALUE = 4;


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
  public static OutputConfigurationColumnSummaryType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OutputConfigurationColumnSummaryType forNumber(int value) {
    switch (value) {
      case 0: return OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_UNSPECIFIED;
      case 1: return OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_AVG;
      case 2: return OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_SUM;
      case 3: return OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MIN;
      case 4: return OUTPUT_CONFIGURATION_COLUMN_SUMMARY_TYPE_MAX;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OutputConfigurationColumnSummaryType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OutputConfigurationColumnSummaryType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OutputConfigurationColumnSummaryType>() {
          public OutputConfigurationColumnSummaryType findValueByNumber(int number) {
            return OutputConfigurationColumnSummaryType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.InsightsProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final OutputConfigurationColumnSummaryType[] VALUES = values();

  public static OutputConfigurationColumnSummaryType valueOf(
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

  private OutputConfigurationColumnSummaryType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.OutputConfigurationColumnSummaryType)
}

