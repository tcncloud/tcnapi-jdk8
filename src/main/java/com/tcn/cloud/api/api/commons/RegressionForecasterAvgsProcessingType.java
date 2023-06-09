// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.RegressionForecasterAvgsProcessingType}
 */
public enum RegressionForecasterAvgsProcessingType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * a complete forecast is built for each skill profile for ACW/ASA/AHT/ATAB
   * </pre>
   *
   * <code>FORECAST = 0;</code>
   */
  FORECAST(0),
  /**
   * <pre>
   * an average from the training data is built for each skill profile for ACW/ASA/AHT/ATAB
   * </pre>
   *
   * <code>AVERAGES = 1;</code>
   */
  AVERAGES(1),
  /**
   * <pre>
   * Fixed values are used for  ACW/ASA/AHT/ATAB
   * </pre>
   *
   * <code>FIXED_AVERAGES = 2;</code>
   */
  FIXED_AVERAGES(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * a complete forecast is built for each skill profile for ACW/ASA/AHT/ATAB
   * </pre>
   *
   * <code>FORECAST = 0;</code>
   */
  public static final int FORECAST_VALUE = 0;
  /**
   * <pre>
   * an average from the training data is built for each skill profile for ACW/ASA/AHT/ATAB
   * </pre>
   *
   * <code>AVERAGES = 1;</code>
   */
  public static final int AVERAGES_VALUE = 1;
  /**
   * <pre>
   * Fixed values are used for  ACW/ASA/AHT/ATAB
   * </pre>
   *
   * <code>FIXED_AVERAGES = 2;</code>
   */
  public static final int FIXED_AVERAGES_VALUE = 2;


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
  public static RegressionForecasterAvgsProcessingType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RegressionForecasterAvgsProcessingType forNumber(int value) {
    switch (value) {
      case 0: return FORECAST;
      case 1: return AVERAGES;
      case 2: return FIXED_AVERAGES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RegressionForecasterAvgsProcessingType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RegressionForecasterAvgsProcessingType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RegressionForecasterAvgsProcessingType>() {
          public RegressionForecasterAvgsProcessingType findValueByNumber(int number) {
            return RegressionForecasterAvgsProcessingType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final RegressionForecasterAvgsProcessingType[] VALUES = values();

  public static RegressionForecasterAvgsProcessingType valueOf(
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

  private RegressionForecasterAvgsProcessingType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.RegressionForecasterAvgsProcessingType)
}

