// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/org/exile_certificate_manager/v1/entities.proto

package com.tcn.cloud.api.services.org.exile_certificate_manager.v1;

/**
 * <pre>
 * CertificateConfigurationType defines the types of certificate configuration.
 * </pre>
 *
 * Protobuf enum {@code services.org.exile_certificate_manager.v1.CertificateConfigurationType}
 */
public enum CertificateConfigurationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Type Unspecified means the configuration type is not set.
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_UNSPECIFIED = 0;</code>
   */
  CERTIFICATE_CONFIGURATION_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Type None specifies that the configuration will not have any parameters.
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_NONE = 1;</code>
   */
  CERTIFICATE_CONFIGURATION_TYPE_NONE(1),
  /**
   * <pre>
   * Type Artiva HCX specifies the configuration for Artiva HCX (parameters required).
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_HCX = 2;</code>
   */
  CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_HCX(2),
  /**
   * <pre>
   * Type Artiva RM specifies the configuration for Artiva RM (parameters required).
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_RM = 3;</code>
   */
  CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_RM(3),
  /**
   * <pre>
   * Type FACS specifies the configuration for FACS (parameters required).
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_FACS = 4;</code>
   */
  CERTIFICATE_CONFIGURATION_TYPE_FACS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Type Unspecified means the configuration type is not set.
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int CERTIFICATE_CONFIGURATION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Type None specifies that the configuration will not have any parameters.
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_NONE = 1;</code>
   */
  public static final int CERTIFICATE_CONFIGURATION_TYPE_NONE_VALUE = 1;
  /**
   * <pre>
   * Type Artiva HCX specifies the configuration for Artiva HCX (parameters required).
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_HCX = 2;</code>
   */
  public static final int CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_HCX_VALUE = 2;
  /**
   * <pre>
   * Type Artiva RM specifies the configuration for Artiva RM (parameters required).
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_RM = 3;</code>
   */
  public static final int CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_RM_VALUE = 3;
  /**
   * <pre>
   * Type FACS specifies the configuration for FACS (parameters required).
   * </pre>
   *
   * <code>CERTIFICATE_CONFIGURATION_TYPE_FACS = 4;</code>
   */
  public static final int CERTIFICATE_CONFIGURATION_TYPE_FACS_VALUE = 4;


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
  public static CertificateConfigurationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CertificateConfigurationType forNumber(int value) {
    switch (value) {
      case 0: return CERTIFICATE_CONFIGURATION_TYPE_UNSPECIFIED;
      case 1: return CERTIFICATE_CONFIGURATION_TYPE_NONE;
      case 2: return CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_HCX;
      case 3: return CERTIFICATE_CONFIGURATION_TYPE_ARTIVA_RM;
      case 4: return CERTIFICATE_CONFIGURATION_TYPE_FACS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CertificateConfigurationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CertificateConfigurationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CertificateConfigurationType>() {
          public CertificateConfigurationType findValueByNumber(int number) {
            return CertificateConfigurationType.forNumber(number);
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
    return com.tcn.cloud.api.services.org.exile_certificate_manager.v1.EntitiesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CertificateConfigurationType[] VALUES = values();

  public static CertificateConfigurationType valueOf(
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

  private CertificateConfigurationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.org.exile_certificate_manager.v1.CertificateConfigurationType)
}

