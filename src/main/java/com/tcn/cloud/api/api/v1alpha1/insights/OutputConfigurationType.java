// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/insights/insight.proto

package com.tcn.cloud.api.api.v1alpha1.insights;

/**
 * <pre>
 * Enum for different types of output configurations
 * </pre>
 *
 * Protobuf enum {@code api.v1alpha1.insights.OutputConfigurationType}
 */
public enum OutputConfigurationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified type
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_TYPE_UNSPECIFIED = 0;</code>
   */
  OUTPUT_CONFIGURATION_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Output configuration for table format
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_TYPE_TABLE = 1;</code>
   */
  OUTPUT_CONFIGURATION_TYPE_TABLE(1),
  /**
   * <pre>
   * Output configuration for multi-series format
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_TYPE_MULTI_SERIES = 2;</code>
   */
  OUTPUT_CONFIGURATION_TYPE_MULTI_SERIES(2),
  /**
   * <pre>
   * Output configuration for pie chart format
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_TYPE_PIE_CHART = 3;</code>
   */
  OUTPUT_CONFIGURATION_TYPE_PIE_CHART(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified type
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int OUTPUT_CONFIGURATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Output configuration for table format
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_TYPE_TABLE = 1;</code>
   */
  public static final int OUTPUT_CONFIGURATION_TYPE_TABLE_VALUE = 1;
  /**
   * <pre>
   * Output configuration for multi-series format
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_TYPE_MULTI_SERIES = 2;</code>
   */
  public static final int OUTPUT_CONFIGURATION_TYPE_MULTI_SERIES_VALUE = 2;
  /**
   * <pre>
   * Output configuration for pie chart format
   * </pre>
   *
   * <code>OUTPUT_CONFIGURATION_TYPE_PIE_CHART = 3;</code>
   */
  public static final int OUTPUT_CONFIGURATION_TYPE_PIE_CHART_VALUE = 3;


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
  public static OutputConfigurationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OutputConfigurationType forNumber(int value) {
    switch (value) {
      case 0: return OUTPUT_CONFIGURATION_TYPE_UNSPECIFIED;
      case 1: return OUTPUT_CONFIGURATION_TYPE_TABLE;
      case 2: return OUTPUT_CONFIGURATION_TYPE_MULTI_SERIES;
      case 3: return OUTPUT_CONFIGURATION_TYPE_PIE_CHART;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OutputConfigurationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OutputConfigurationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OutputConfigurationType>() {
          public OutputConfigurationType findValueByNumber(int number) {
            return OutputConfigurationType.forNumber(number);
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
    return com.tcn.cloud.api.api.v1alpha1.insights.InsightProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final OutputConfigurationType[] VALUES = values();

  public static OutputConfigurationType valueOf(
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

  private OutputConfigurationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.v1alpha1.insights.OutputConfigurationType)
}

