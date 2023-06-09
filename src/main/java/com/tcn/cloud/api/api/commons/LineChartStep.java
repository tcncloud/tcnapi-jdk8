// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/ana_charts.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.LineChartStep}
 */
public enum LineChartStep
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LINE_CHART_STEP_LEFT = 0;</code>
   */
  LINE_CHART_STEP_LEFT(0),
  /**
   * <code>LINE_CHART_STEP_CENTER = 1;</code>
   */
  LINE_CHART_STEP_CENTER(1),
  /**
   * <code>LINE_CHART_STEP_RIGHT = 2;</code>
   */
  LINE_CHART_STEP_RIGHT(2),
  /**
   * <code>LINE_CHART_STEP_NOLINE = 3;</code>
   */
  LINE_CHART_STEP_NOLINE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LINE_CHART_STEP_LEFT = 0;</code>
   */
  public static final int LINE_CHART_STEP_LEFT_VALUE = 0;
  /**
   * <code>LINE_CHART_STEP_CENTER = 1;</code>
   */
  public static final int LINE_CHART_STEP_CENTER_VALUE = 1;
  /**
   * <code>LINE_CHART_STEP_RIGHT = 2;</code>
   */
  public static final int LINE_CHART_STEP_RIGHT_VALUE = 2;
  /**
   * <code>LINE_CHART_STEP_NOLINE = 3;</code>
   */
  public static final int LINE_CHART_STEP_NOLINE_VALUE = 3;


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
  public static LineChartStep valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LineChartStep forNumber(int value) {
    switch (value) {
      case 0: return LINE_CHART_STEP_LEFT;
      case 1: return LINE_CHART_STEP_CENTER;
      case 2: return LINE_CHART_STEP_RIGHT;
      case 3: return LINE_CHART_STEP_NOLINE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LineChartStep>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LineChartStep> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LineChartStep>() {
          public LineChartStep findValueByNumber(int number) {
            return LineChartStep.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.AnaChartsProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final LineChartStep[] VALUES = values();

  public static LineChartStep valueOf(
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

  private LineChartStep(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.LineChartStep)
}

