// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.integrations;

/**
 * <pre>
 * all supported integrations
 * </pre>
 *
 * Protobuf enum {@code api.commons.integrations.IntegrationType}
 */
public enum IntegrationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INTEGRATION_TYPE_UNKNOWN = 0;</code>
   */
  INTEGRATION_TYPE_UNKNOWN(0),
  /**
   * <code>INTEGRATION_TYPE_BRAINTREE = 100;</code>
   */
  INTEGRATION_TYPE_BRAINTREE(100),
  /**
   * <code>INTEGRATION_TYPE_RELATIENT = 200;</code>
   */
  INTEGRATION_TYPE_RELATIENT(200),
  /**
   * <code>INTEGRATION_TYPE_CYBERSOURCE = 300;</code>
   */
  INTEGRATION_TYPE_CYBERSOURCE(300),
  /**
   * <code>INTEGRATION_TYPE_CIRCPRO = 400;</code>
   */
  INTEGRATION_TYPE_CIRCPRO(400),
  /**
   * <code>INTEGRATION_TYPE_AUTHORIZENET = 500;</code>
   */
  INTEGRATION_TYPE_AUTHORIZENET(500),
  /**
   * <code>INTEGRATION_TYPE_EXPITRANS = 600;</code>
   */
  INTEGRATION_TYPE_EXPITRANS(600),
  /**
   * <code>INTEGRATION_TYPE_AXIAMEDFUSION = 700;</code>
   */
  INTEGRATION_TYPE_AXIAMEDFUSION(700),
  /**
   * <code>INTEGRATION_TYPE_INSTAMED = 800;</code>
   */
  INTEGRATION_TYPE_INSTAMED(800),
  /**
   * <code>INTEGRATION_TYPE_USAEPAY = 900;</code>
   */
  INTEGRATION_TYPE_USAEPAY(900),
  /**
   * <code>INTEGRATION_TYPE_EZIDEBIT = 1000;</code>
   */
  INTEGRATION_TYPE_EZIDEBIT(1000),
  /**
   * <code>INTEGRATION_TYPE_BAMBORA = 1100;</code>
   */
  INTEGRATION_TYPE_BAMBORA(1100),
  /**
   * <code>INTEGRATION_TYPE_REPAY = 1200;</code>
   */
  INTEGRATION_TYPE_REPAY(1200),
  /**
   * <code>INTEGRATION_TYPE_AXIA = 1300;</code>
   */
  INTEGRATION_TYPE_AXIA(1300),
  /**
   * <code>INTEGRATION_TYPE_SECURETRADING = 1400;</code>
   */
  INTEGRATION_TYPE_SECURETRADING(1400),
  /**
   * <code>INTEGRATION_TYPE_PAYMENTVISION = 1500;</code>
   */
  INTEGRATION_TYPE_PAYMENTVISION(1500),
  /**
   * <code>INTEGRATION_TYPE_INTERPROSE = 1600;</code>
   */
  INTEGRATION_TYPE_INTERPROSE(1600),
  /**
   * <code>INTEGRATION_TYPE_DALLASNEWS = 1700;</code>
   */
  INTEGRATION_TYPE_DALLASNEWS(1700),
  /**
   * <code>INTEGRATION_TYPE_PAYWAY = 1800;</code>
   */
  INTEGRATION_TYPE_PAYWAY(1800),
  /**
   * <code>INTEGRATION_TYPE_BILLINGTREE = 1900;</code>
   */
  INTEGRATION_TYPE_BILLINGTREE(1900),
  /**
   * <code>INTEGRATION_TYPE_EXPERIAN = 2000;</code>
   */
  INTEGRATION_TYPE_EXPERIAN(2000),
  /**
   * <code>INTEGRATION_TYPE_NEWSCYCLE = 2100;</code>
   */
  INTEGRATION_TYPE_NEWSCYCLE(2100),
  /**
   * <code>INTEGRATION_TYPE_TRUSTCOMMERCE = 2200;</code>
   */
  INTEGRATION_TYPE_TRUSTCOMMERCE(2200),
  /**
   * <code>INTEGRATION_TYPE_VANTIV = 2300;</code>
   */
  INTEGRATION_TYPE_VANTIV(2300),
  /**
   * <code>INTEGRATION_TYPE_JOURNEY = 2400;</code>
   */
  INTEGRATION_TYPE_JOURNEY(2400),
  /**
   * <code>INTEGRATION_TYPE_ATHENAHEALTH = 2500;</code>
   */
  INTEGRATION_TYPE_ATHENAHEALTH(2500),
  /**
   * <code>INTEGRATION_TYPE_BRAINWORKS = 2600;</code>
   */
  INTEGRATION_TYPE_BRAINWORKS(2600),
  /**
   * <code>INTEGRATION_TYPE_OSGCONNECT = 2700;</code>
   */
  INTEGRATION_TYPE_OSGCONNECT(2700),
  /**
   * <code>INTEGRATION_TYPE_NTVB = 2800;</code>
   */
  INTEGRATION_TYPE_NTVB(2800),
  /**
   * <code>INTEGRATION_TYPE_ELAVON = 2900;</code>
   */
  INTEGRATION_TYPE_ELAVON(2900),
  /**
   * <code>INTEGRATION_TYPE_GLOBALPAYMENTS = 3000;</code>
   */
  INTEGRATION_TYPE_GLOBALPAYMENTS(3000),
  /**
   * <code>INTEGRATION_TYPE_PAY_SCOUT = 3100;</code>
   */
  INTEGRATION_TYPE_PAY_SCOUT(3100),
  /**
   * <code>INTEGRATION_TYPE_I2C = 3200;</code>
   */
  INTEGRATION_TYPE_I2C(3200),
  /**
   * <code>INTEGRATION_TYPE_OPAYO = 3300;</code>
   */
  INTEGRATION_TYPE_OPAYO(3300),
  /**
   * <code>INTEGRATION_TYPE_SHIFT4 = 3400;</code>
   */
  INTEGRATION_TYPE_SHIFT4(3400),
  /**
   * <code>INTEGRATION_TYPE_POSCORP = 3500;</code>
   */
  INTEGRATION_TYPE_POSCORP(3500),
  /**
   * <code>INTEGRATION_TYPE_PIANO = 3600;</code>
   */
  INTEGRATION_TYPE_PIANO(3600),
  /**
   * <code>INTEGRATION_TYPE_EPIC = 3700;</code>
   */
  INTEGRATION_TYPE_EPIC(3700),
  /**
   * <code>INTEGRATION_TYPE_NEWZWARE = 3800;</code>
   */
  INTEGRATION_TYPE_NEWZWARE(3800),
  /**
   * <code>INTEGRATION_TYPE_PRIOCOMMERCE = 3900;</code>
   */
  INTEGRATION_TYPE_PRIOCOMMERCE(3900),
  /**
   * <code>INTEGRATION_TYPE_NAVIGA = 4000;</code>
   */
  INTEGRATION_TYPE_NAVIGA(4000),
  /**
   * <code>INTEGRATION_TYPE_PAYNSECONDS = 4100;</code>
   */
  INTEGRATION_TYPE_PAYNSECONDS(4100),
  /**
   * <code>INTEGRATION_TYPE_SUTHERLANDREV = 4200;</code>
   */
  INTEGRATION_TYPE_SUTHERLANDREV(4200),
  /**
   * <code>INTEGRATION_TYPE_FINVI = 4300;</code>
   */
  INTEGRATION_TYPE_FINVI(4300),
  /**
   * <code>INTEGRATION_TYPE_NAVIGA_DTI_CIRC = 4400;</code>
   */
  INTEGRATION_TYPE_NAVIGA_DTI_CIRC(4400),
  /**
   * <code>INTEGRATION_TYPE_NAVIGA_DTI_CS = 4500;</code>
   */
  INTEGRATION_TYPE_NAVIGA_DTI_CS(4500),
  /**
   * <code>INTEGRATION_TYPE_SWERVEPAY = 4600;</code>
   */
  INTEGRATION_TYPE_SWERVEPAY(4600),
  /**
   * <code>INTEGRATION_TYPE_VERADIGM = 4700 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  INTEGRATION_TYPE_VERADIGM(4700),
  /**
   * <code>INTEGRATION_TYPE_VERADIGM_PRACTICE_MANAGEMENT = 4800;</code>
   */
  INTEGRATION_TYPE_VERADIGM_PRACTICE_MANAGEMENT(4800),
  /**
   * <code>INTEGRATION_TYPE_PDCFLOW = 4900;</code>
   */
  INTEGRATION_TYPE_PDCFLOW(4900),
  /**
   * <code>INTEGRATION_TYPE_DEBUG = 5000;</code>
   */
  INTEGRATION_TYPE_DEBUG(5000),
  /**
   * <code>INTEGRATION_TYPE_ACQUIRED = 5100;</code>
   */
  INTEGRATION_TYPE_ACQUIRED(5100),
  /**
   * <code>INTEGRATION_TYPE_GENERIC = 5200;</code>
   */
  INTEGRATION_TYPE_GENERIC(5200),
  /**
   * <code>INTEGRATION_TYPE_HEALTHPAY24 = 5300;</code>
   */
  INTEGRATION_TYPE_HEALTHPAY24(5300),
  /**
   * <code>INTEGRATION_TYPE_FINVI_FACS = 5400;</code>
   */
  INTEGRATION_TYPE_FINVI_FACS(5400),
  /**
   * <code>INTEGRATION_TYPE_FINVI_VELOSIDY = 5500;</code>
   */
  INTEGRATION_TYPE_FINVI_VELOSIDY(5500),
  /**
   * <code>INTEGRATION_TYPE_CLOVER = 5600;</code>
   */
  INTEGRATION_TYPE_CLOVER(5600),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INTEGRATION_TYPE_UNKNOWN = 0;</code>
   */
  public static final int INTEGRATION_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <code>INTEGRATION_TYPE_BRAINTREE = 100;</code>
   */
  public static final int INTEGRATION_TYPE_BRAINTREE_VALUE = 100;
  /**
   * <code>INTEGRATION_TYPE_RELATIENT = 200;</code>
   */
  public static final int INTEGRATION_TYPE_RELATIENT_VALUE = 200;
  /**
   * <code>INTEGRATION_TYPE_CYBERSOURCE = 300;</code>
   */
  public static final int INTEGRATION_TYPE_CYBERSOURCE_VALUE = 300;
  /**
   * <code>INTEGRATION_TYPE_CIRCPRO = 400;</code>
   */
  public static final int INTEGRATION_TYPE_CIRCPRO_VALUE = 400;
  /**
   * <code>INTEGRATION_TYPE_AUTHORIZENET = 500;</code>
   */
  public static final int INTEGRATION_TYPE_AUTHORIZENET_VALUE = 500;
  /**
   * <code>INTEGRATION_TYPE_EXPITRANS = 600;</code>
   */
  public static final int INTEGRATION_TYPE_EXPITRANS_VALUE = 600;
  /**
   * <code>INTEGRATION_TYPE_AXIAMEDFUSION = 700;</code>
   */
  public static final int INTEGRATION_TYPE_AXIAMEDFUSION_VALUE = 700;
  /**
   * <code>INTEGRATION_TYPE_INSTAMED = 800;</code>
   */
  public static final int INTEGRATION_TYPE_INSTAMED_VALUE = 800;
  /**
   * <code>INTEGRATION_TYPE_USAEPAY = 900;</code>
   */
  public static final int INTEGRATION_TYPE_USAEPAY_VALUE = 900;
  /**
   * <code>INTEGRATION_TYPE_EZIDEBIT = 1000;</code>
   */
  public static final int INTEGRATION_TYPE_EZIDEBIT_VALUE = 1000;
  /**
   * <code>INTEGRATION_TYPE_BAMBORA = 1100;</code>
   */
  public static final int INTEGRATION_TYPE_BAMBORA_VALUE = 1100;
  /**
   * <code>INTEGRATION_TYPE_REPAY = 1200;</code>
   */
  public static final int INTEGRATION_TYPE_REPAY_VALUE = 1200;
  /**
   * <code>INTEGRATION_TYPE_AXIA = 1300;</code>
   */
  public static final int INTEGRATION_TYPE_AXIA_VALUE = 1300;
  /**
   * <code>INTEGRATION_TYPE_SECURETRADING = 1400;</code>
   */
  public static final int INTEGRATION_TYPE_SECURETRADING_VALUE = 1400;
  /**
   * <code>INTEGRATION_TYPE_PAYMENTVISION = 1500;</code>
   */
  public static final int INTEGRATION_TYPE_PAYMENTVISION_VALUE = 1500;
  /**
   * <code>INTEGRATION_TYPE_INTERPROSE = 1600;</code>
   */
  public static final int INTEGRATION_TYPE_INTERPROSE_VALUE = 1600;
  /**
   * <code>INTEGRATION_TYPE_DALLASNEWS = 1700;</code>
   */
  public static final int INTEGRATION_TYPE_DALLASNEWS_VALUE = 1700;
  /**
   * <code>INTEGRATION_TYPE_PAYWAY = 1800;</code>
   */
  public static final int INTEGRATION_TYPE_PAYWAY_VALUE = 1800;
  /**
   * <code>INTEGRATION_TYPE_BILLINGTREE = 1900;</code>
   */
  public static final int INTEGRATION_TYPE_BILLINGTREE_VALUE = 1900;
  /**
   * <code>INTEGRATION_TYPE_EXPERIAN = 2000;</code>
   */
  public static final int INTEGRATION_TYPE_EXPERIAN_VALUE = 2000;
  /**
   * <code>INTEGRATION_TYPE_NEWSCYCLE = 2100;</code>
   */
  public static final int INTEGRATION_TYPE_NEWSCYCLE_VALUE = 2100;
  /**
   * <code>INTEGRATION_TYPE_TRUSTCOMMERCE = 2200;</code>
   */
  public static final int INTEGRATION_TYPE_TRUSTCOMMERCE_VALUE = 2200;
  /**
   * <code>INTEGRATION_TYPE_VANTIV = 2300;</code>
   */
  public static final int INTEGRATION_TYPE_VANTIV_VALUE = 2300;
  /**
   * <code>INTEGRATION_TYPE_JOURNEY = 2400;</code>
   */
  public static final int INTEGRATION_TYPE_JOURNEY_VALUE = 2400;
  /**
   * <code>INTEGRATION_TYPE_ATHENAHEALTH = 2500;</code>
   */
  public static final int INTEGRATION_TYPE_ATHENAHEALTH_VALUE = 2500;
  /**
   * <code>INTEGRATION_TYPE_BRAINWORKS = 2600;</code>
   */
  public static final int INTEGRATION_TYPE_BRAINWORKS_VALUE = 2600;
  /**
   * <code>INTEGRATION_TYPE_OSGCONNECT = 2700;</code>
   */
  public static final int INTEGRATION_TYPE_OSGCONNECT_VALUE = 2700;
  /**
   * <code>INTEGRATION_TYPE_NTVB = 2800;</code>
   */
  public static final int INTEGRATION_TYPE_NTVB_VALUE = 2800;
  /**
   * <code>INTEGRATION_TYPE_ELAVON = 2900;</code>
   */
  public static final int INTEGRATION_TYPE_ELAVON_VALUE = 2900;
  /**
   * <code>INTEGRATION_TYPE_GLOBALPAYMENTS = 3000;</code>
   */
  public static final int INTEGRATION_TYPE_GLOBALPAYMENTS_VALUE = 3000;
  /**
   * <code>INTEGRATION_TYPE_PAY_SCOUT = 3100;</code>
   */
  public static final int INTEGRATION_TYPE_PAY_SCOUT_VALUE = 3100;
  /**
   * <code>INTEGRATION_TYPE_I2C = 3200;</code>
   */
  public static final int INTEGRATION_TYPE_I2C_VALUE = 3200;
  /**
   * <code>INTEGRATION_TYPE_OPAYO = 3300;</code>
   */
  public static final int INTEGRATION_TYPE_OPAYO_VALUE = 3300;
  /**
   * <code>INTEGRATION_TYPE_SHIFT4 = 3400;</code>
   */
  public static final int INTEGRATION_TYPE_SHIFT4_VALUE = 3400;
  /**
   * <code>INTEGRATION_TYPE_POSCORP = 3500;</code>
   */
  public static final int INTEGRATION_TYPE_POSCORP_VALUE = 3500;
  /**
   * <code>INTEGRATION_TYPE_PIANO = 3600;</code>
   */
  public static final int INTEGRATION_TYPE_PIANO_VALUE = 3600;
  /**
   * <code>INTEGRATION_TYPE_EPIC = 3700;</code>
   */
  public static final int INTEGRATION_TYPE_EPIC_VALUE = 3700;
  /**
   * <code>INTEGRATION_TYPE_NEWZWARE = 3800;</code>
   */
  public static final int INTEGRATION_TYPE_NEWZWARE_VALUE = 3800;
  /**
   * <code>INTEGRATION_TYPE_PRIOCOMMERCE = 3900;</code>
   */
  public static final int INTEGRATION_TYPE_PRIOCOMMERCE_VALUE = 3900;
  /**
   * <code>INTEGRATION_TYPE_NAVIGA = 4000;</code>
   */
  public static final int INTEGRATION_TYPE_NAVIGA_VALUE = 4000;
  /**
   * <code>INTEGRATION_TYPE_PAYNSECONDS = 4100;</code>
   */
  public static final int INTEGRATION_TYPE_PAYNSECONDS_VALUE = 4100;
  /**
   * <code>INTEGRATION_TYPE_SUTHERLANDREV = 4200;</code>
   */
  public static final int INTEGRATION_TYPE_SUTHERLANDREV_VALUE = 4200;
  /**
   * <code>INTEGRATION_TYPE_FINVI = 4300;</code>
   */
  public static final int INTEGRATION_TYPE_FINVI_VALUE = 4300;
  /**
   * <code>INTEGRATION_TYPE_NAVIGA_DTI_CIRC = 4400;</code>
   */
  public static final int INTEGRATION_TYPE_NAVIGA_DTI_CIRC_VALUE = 4400;
  /**
   * <code>INTEGRATION_TYPE_NAVIGA_DTI_CS = 4500;</code>
   */
  public static final int INTEGRATION_TYPE_NAVIGA_DTI_CS_VALUE = 4500;
  /**
   * <code>INTEGRATION_TYPE_SWERVEPAY = 4600;</code>
   */
  public static final int INTEGRATION_TYPE_SWERVEPAY_VALUE = 4600;
  /**
   * <code>INTEGRATION_TYPE_VERADIGM = 4700 [deprecated = true];</code>
   */
  @java.lang.Deprecated public static final int INTEGRATION_TYPE_VERADIGM_VALUE = 4700;
  /**
   * <code>INTEGRATION_TYPE_VERADIGM_PRACTICE_MANAGEMENT = 4800;</code>
   */
  public static final int INTEGRATION_TYPE_VERADIGM_PRACTICE_MANAGEMENT_VALUE = 4800;
  /**
   * <code>INTEGRATION_TYPE_PDCFLOW = 4900;</code>
   */
  public static final int INTEGRATION_TYPE_PDCFLOW_VALUE = 4900;
  /**
   * <code>INTEGRATION_TYPE_DEBUG = 5000;</code>
   */
  public static final int INTEGRATION_TYPE_DEBUG_VALUE = 5000;
  /**
   * <code>INTEGRATION_TYPE_ACQUIRED = 5100;</code>
   */
  public static final int INTEGRATION_TYPE_ACQUIRED_VALUE = 5100;
  /**
   * <code>INTEGRATION_TYPE_GENERIC = 5200;</code>
   */
  public static final int INTEGRATION_TYPE_GENERIC_VALUE = 5200;
  /**
   * <code>INTEGRATION_TYPE_HEALTHPAY24 = 5300;</code>
   */
  public static final int INTEGRATION_TYPE_HEALTHPAY24_VALUE = 5300;
  /**
   * <code>INTEGRATION_TYPE_FINVI_FACS = 5400;</code>
   */
  public static final int INTEGRATION_TYPE_FINVI_FACS_VALUE = 5400;
  /**
   * <code>INTEGRATION_TYPE_FINVI_VELOSIDY = 5500;</code>
   */
  public static final int INTEGRATION_TYPE_FINVI_VELOSIDY_VALUE = 5500;
  /**
   * <code>INTEGRATION_TYPE_CLOVER = 5600;</code>
   */
  public static final int INTEGRATION_TYPE_CLOVER_VALUE = 5600;


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
  public static IntegrationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IntegrationType forNumber(int value) {
    switch (value) {
      case 0: return INTEGRATION_TYPE_UNKNOWN;
      case 100: return INTEGRATION_TYPE_BRAINTREE;
      case 200: return INTEGRATION_TYPE_RELATIENT;
      case 300: return INTEGRATION_TYPE_CYBERSOURCE;
      case 400: return INTEGRATION_TYPE_CIRCPRO;
      case 500: return INTEGRATION_TYPE_AUTHORIZENET;
      case 600: return INTEGRATION_TYPE_EXPITRANS;
      case 700: return INTEGRATION_TYPE_AXIAMEDFUSION;
      case 800: return INTEGRATION_TYPE_INSTAMED;
      case 900: return INTEGRATION_TYPE_USAEPAY;
      case 1000: return INTEGRATION_TYPE_EZIDEBIT;
      case 1100: return INTEGRATION_TYPE_BAMBORA;
      case 1200: return INTEGRATION_TYPE_REPAY;
      case 1300: return INTEGRATION_TYPE_AXIA;
      case 1400: return INTEGRATION_TYPE_SECURETRADING;
      case 1500: return INTEGRATION_TYPE_PAYMENTVISION;
      case 1600: return INTEGRATION_TYPE_INTERPROSE;
      case 1700: return INTEGRATION_TYPE_DALLASNEWS;
      case 1800: return INTEGRATION_TYPE_PAYWAY;
      case 1900: return INTEGRATION_TYPE_BILLINGTREE;
      case 2000: return INTEGRATION_TYPE_EXPERIAN;
      case 2100: return INTEGRATION_TYPE_NEWSCYCLE;
      case 2200: return INTEGRATION_TYPE_TRUSTCOMMERCE;
      case 2300: return INTEGRATION_TYPE_VANTIV;
      case 2400: return INTEGRATION_TYPE_JOURNEY;
      case 2500: return INTEGRATION_TYPE_ATHENAHEALTH;
      case 2600: return INTEGRATION_TYPE_BRAINWORKS;
      case 2700: return INTEGRATION_TYPE_OSGCONNECT;
      case 2800: return INTEGRATION_TYPE_NTVB;
      case 2900: return INTEGRATION_TYPE_ELAVON;
      case 3000: return INTEGRATION_TYPE_GLOBALPAYMENTS;
      case 3100: return INTEGRATION_TYPE_PAY_SCOUT;
      case 3200: return INTEGRATION_TYPE_I2C;
      case 3300: return INTEGRATION_TYPE_OPAYO;
      case 3400: return INTEGRATION_TYPE_SHIFT4;
      case 3500: return INTEGRATION_TYPE_POSCORP;
      case 3600: return INTEGRATION_TYPE_PIANO;
      case 3700: return INTEGRATION_TYPE_EPIC;
      case 3800: return INTEGRATION_TYPE_NEWZWARE;
      case 3900: return INTEGRATION_TYPE_PRIOCOMMERCE;
      case 4000: return INTEGRATION_TYPE_NAVIGA;
      case 4100: return INTEGRATION_TYPE_PAYNSECONDS;
      case 4200: return INTEGRATION_TYPE_SUTHERLANDREV;
      case 4300: return INTEGRATION_TYPE_FINVI;
      case 4400: return INTEGRATION_TYPE_NAVIGA_DTI_CIRC;
      case 4500: return INTEGRATION_TYPE_NAVIGA_DTI_CS;
      case 4600: return INTEGRATION_TYPE_SWERVEPAY;
      case 4700: return INTEGRATION_TYPE_VERADIGM;
      case 4800: return INTEGRATION_TYPE_VERADIGM_PRACTICE_MANAGEMENT;
      case 4900: return INTEGRATION_TYPE_PDCFLOW;
      case 5000: return INTEGRATION_TYPE_DEBUG;
      case 5100: return INTEGRATION_TYPE_ACQUIRED;
      case 5200: return INTEGRATION_TYPE_GENERIC;
      case 5300: return INTEGRATION_TYPE_HEALTHPAY24;
      case 5400: return INTEGRATION_TYPE_FINVI_FACS;
      case 5500: return INTEGRATION_TYPE_FINVI_VELOSIDY;
      case 5600: return INTEGRATION_TYPE_CLOVER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IntegrationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IntegrationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IntegrationType>() {
          public IntegrationType findValueByNumber(int number) {
            return IntegrationType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.integrations.IntegrationsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final IntegrationType[] VALUES = values();

  public static IntegrationType valueOf(
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

  private IntegrationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.integrations.IntegrationType)
}

