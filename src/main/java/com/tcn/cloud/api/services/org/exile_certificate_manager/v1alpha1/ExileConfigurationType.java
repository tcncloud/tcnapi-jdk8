// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1alpha1/entities.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1;

/**
 * <pre>
 * ExileConfigurationType defines the types of exile configuration
 * </pre>
 *
 * Protobuf enum {@code services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType}
 */
public enum ExileConfigurationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Type Unspecified means the configuration type is not set.
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_UNSPECIFIED = 0;</code>
   */
  EXILE_CONFIGURATION_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Type None specifies that the configuration will not have any parameters.
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_NONE = 1;</code>
   */
  EXILE_CONFIGURATION_TYPE_NONE(1),
  /**
   * <pre>
   * Type Artiva HCX specifies the configuration for Artiva HCX (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_ARTIVA_HCX = 2;</code>
   */
  EXILE_CONFIGURATION_TYPE_ARTIVA_HCX(2),
  /**
   * <pre>
   * Type Artiva RM specifies the configuration for Artiva RM (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_ARTIVA_RM = 3;</code>
   */
  EXILE_CONFIGURATION_TYPE_ARTIVA_RM(3),
  /**
   * <pre>
   * Type FACS specifies the configuration for FACS (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_FACS = 4;</code>
   */
  EXILE_CONFIGURATION_TYPE_FACS(4),
  /**
   * <pre>
   * Type Velosidy specifies the configuration for Velosidy (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_VELOSIDY = 5;</code>
   */
  EXILE_CONFIGURATION_TYPE_VELOSIDY(5),
  /**
   * <pre>
   * Type Latitude Classic specifies the configuration for Latitude Classic (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_LATITUDE_CLASSIC = 6;</code>
   */
  EXILE_CONFIGURATION_TYPE_LATITUDE_CLASSIC(6),
  /**
   * <pre>
   * Type Latitude NextGen specifies the configuration for Latitude Liquid (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_LATITUDE_LIQUID = 7;</code>
   */
  EXILE_CONFIGURATION_TYPE_LATITUDE_LIQUID(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Type Unspecified means the configuration type is not set.
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int EXILE_CONFIGURATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Type None specifies that the configuration will not have any parameters.
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_NONE = 1;</code>
   */
  public static final int EXILE_CONFIGURATION_TYPE_NONE_VALUE = 1;
  /**
   * <pre>
   * Type Artiva HCX specifies the configuration for Artiva HCX (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_ARTIVA_HCX = 2;</code>
   */
  public static final int EXILE_CONFIGURATION_TYPE_ARTIVA_HCX_VALUE = 2;
  /**
   * <pre>
   * Type Artiva RM specifies the configuration for Artiva RM (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_ARTIVA_RM = 3;</code>
   */
  public static final int EXILE_CONFIGURATION_TYPE_ARTIVA_RM_VALUE = 3;
  /**
   * <pre>
   * Type FACS specifies the configuration for FACS (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_FACS = 4;</code>
   */
  public static final int EXILE_CONFIGURATION_TYPE_FACS_VALUE = 4;
  /**
   * <pre>
   * Type Velosidy specifies the configuration for Velosidy (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_VELOSIDY = 5;</code>
   */
  public static final int EXILE_CONFIGURATION_TYPE_VELOSIDY_VALUE = 5;
  /**
   * <pre>
   * Type Latitude Classic specifies the configuration for Latitude Classic (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_LATITUDE_CLASSIC = 6;</code>
   */
  public static final int EXILE_CONFIGURATION_TYPE_LATITUDE_CLASSIC_VALUE = 6;
  /**
   * <pre>
   * Type Latitude NextGen specifies the configuration for Latitude Liquid (parameters required).
   * </pre>
   *
   * <code>EXILE_CONFIGURATION_TYPE_LATITUDE_LIQUID = 7;</code>
   */
  public static final int EXILE_CONFIGURATION_TYPE_LATITUDE_LIQUID_VALUE = 7;


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
  public static ExileConfigurationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ExileConfigurationType forNumber(int value) {
    switch (value) {
      case 0: return EXILE_CONFIGURATION_TYPE_UNSPECIFIED;
      case 1: return EXILE_CONFIGURATION_TYPE_NONE;
      case 2: return EXILE_CONFIGURATION_TYPE_ARTIVA_HCX;
      case 3: return EXILE_CONFIGURATION_TYPE_ARTIVA_RM;
      case 4: return EXILE_CONFIGURATION_TYPE_FACS;
      case 5: return EXILE_CONFIGURATION_TYPE_VELOSIDY;
      case 6: return EXILE_CONFIGURATION_TYPE_LATITUDE_CLASSIC;
      case 7: return EXILE_CONFIGURATION_TYPE_LATITUDE_LIQUID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ExileConfigurationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ExileConfigurationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ExileConfigurationType>() {
          public ExileConfigurationType findValueByNumber(int number) {
            return ExileConfigurationType.forNumber(number);
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
    return com.tcn.cloud.api.services.org.exile_certificate_manager.v1alpha1.EntitiesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ExileConfigurationType[] VALUES = values();

  public static ExileConfigurationType valueOf(
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

  private ExileConfigurationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.org.exile_certificate_manager.v1alpha1.ExileConfigurationType)
}

