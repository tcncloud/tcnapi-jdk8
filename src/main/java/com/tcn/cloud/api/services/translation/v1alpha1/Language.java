// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/translation/v1alpha1/entities.proto

package com.tcn.cloud.api.services.translation.v1alpha1;

/**
 * <pre>
 * BCP-47 language tag enum.. Add more as needed
 * </pre>
 *
 * Protobuf enum {@code services.translation.v1alpha1.Language}
 */
public enum Language
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LANGUAGE_UNSPECIFIED = 0;</code>
   */
  LANGUAGE_UNSPECIFIED(0),
  /**
   * <pre>
   * Arabic Saudi Arabia
   * </pre>
   *
   * <code>AR_SA = 1;</code>
   */
  AR_SA(1),
  /**
   * <pre>
   * Czech Czech Republic
   * </pre>
   *
   * <code>CS_CZ = 2;</code>
   */
  CS_CZ(2),
  /**
   * <pre>
   * Danish Denmark
   * </pre>
   *
   * <code>DA_DK = 3;</code>
   */
  DA_DK(3),
  /**
   * <pre>
   * German Germany
   * </pre>
   *
   * <code>DE_DE = 4;</code>
   */
  DE_DE(4),
  /**
   * <pre>
   * Modern Greek Greece
   * </pre>
   *
   * <code>EL_GR = 5;</code>
   */
  EL_GR(5),
  /**
   * <pre>
   * English Australia
   * </pre>
   *
   * <code>EN_AU = 6;</code>
   */
  EN_AU(6),
  /**
   * <pre>
   * English United Kingdom
   * </pre>
   *
   * <code>EN_GB = 7;</code>
   */
  EN_GB(7),
  /**
   * <pre>
   * English Ireland
   * </pre>
   *
   * <code>EN_IE = 8;</code>
   */
  EN_IE(8),
  /**
   * <pre>
   * English United States
   * </pre>
   *
   * <code>EN_US = 9;</code>
   */
  EN_US(9),
  /**
   * <pre>
   * English South Africa
   * </pre>
   *
   * <code>EN_ZA = 10;</code>
   */
  EN_ZA(10),
  /**
   * <pre>
   * Spanish Spain
   * </pre>
   *
   * <code>ES_ES = 11;</code>
   */
  ES_ES(11),
  /**
   * <pre>
   * Spanish Mexico
   * </pre>
   *
   * <code>ES_MX = 12;</code>
   */
  ES_MX(12),
  /**
   * <pre>
   * Finnish Finland
   * </pre>
   *
   * <code>FI_FI = 13;</code>
   */
  FI_FI(13),
  /**
   * <pre>
   * French Canada
   * </pre>
   *
   * <code>FR_CA = 14;</code>
   */
  FR_CA(14),
  /**
   * <pre>
   * French France
   * </pre>
   *
   * <code>FR_FR = 15;</code>
   */
  FR_FR(15),
  /**
   * <pre>
   * Hebrew Israel
   * </pre>
   *
   * <code>HE_IL = 16;</code>
   */
  HE_IL(16),
  /**
   * <pre>
   * Hindi India
   * </pre>
   *
   * <code>HI_IN = 17;</code>
   */
  HI_IN(17),
  /**
   * <pre>
   * Hungarian Hungary
   * </pre>
   *
   * <code>HU_HU = 18;</code>
   */
  HU_HU(18),
  /**
   * <pre>
   * Indonesian Indonesia
   * </pre>
   *
   * <code>ID_ID = 19;</code>
   */
  ID_ID(19),
  /**
   * <pre>
   * Italian Italy
   * </pre>
   *
   * <code>IT_IT = 20;</code>
   */
  IT_IT(20),
  /**
   * <pre>
   * Japanese Japan
   * </pre>
   *
   * <code>JA_JP = 21;</code>
   */
  JA_JP(21),
  /**
   * <pre>
   * Korean Republic of Korea
   * </pre>
   *
   * <code>KO_KR = 22;</code>
   */
  KO_KR(22),
  /**
   * <pre>
   * Dutch Belgium
   * </pre>
   *
   * <code>NL_BE = 23;</code>
   */
  NL_BE(23),
  /**
   * <pre>
   * Dutch Netherlands
   * </pre>
   *
   * <code>NL_NL = 24;</code>
   */
  NL_NL(24),
  /**
   * <pre>
   * Norwegian Norway
   * </pre>
   *
   * <code>NO_NO = 25;</code>
   */
  NO_NO(25),
  /**
   * <pre>
   * Polish Poland
   * </pre>
   *
   * <code>PL_PL = 26;</code>
   */
  PL_PL(26),
  /**
   * <pre>
   * Portuguese Brazil
   * </pre>
   *
   * <code>PT_BR = 27;</code>
   */
  PT_BR(27),
  /**
   * <pre>
   * Portuguese Portugal
   * </pre>
   *
   * <code>PT_PT = 28;</code>
   */
  PT_PT(28),
  /**
   * <pre>
   * Romanian Romania
   * </pre>
   *
   * <code>RO_RO = 29;</code>
   */
  RO_RO(29),
  /**
   * <pre>
   * Russian Russian Federation
   * </pre>
   *
   * <code>RU_RU = 30;</code>
   */
  RU_RU(30),
  /**
   * <pre>
   * Slovak Slovakia
   * </pre>
   *
   * <code>SK_SK = 31;</code>
   */
  SK_SK(31),
  /**
   * <pre>
   * Swedish Sweden
   * </pre>
   *
   * <code>SV_SE = 32;</code>
   */
  SV_SE(32),
  /**
   * <pre>
   * Thai Thailand
   * </pre>
   *
   * <code>TH_TH = 33;</code>
   */
  TH_TH(33),
  /**
   * <pre>
   * Turkish Turkey
   * </pre>
   *
   * <code>TR_TR = 34;</code>
   */
  TR_TR(34),
  /**
   * <pre>
   * Chinese China
   * </pre>
   *
   * <code>ZH_CN = 35;</code>
   */
  ZH_CN(35),
  /**
   * <pre>
   * Chinese Hong Kong
   * </pre>
   *
   * <code>ZH_HK = 36;</code>
   */
  ZH_HK(36),
  /**
   * <pre>
   * Chinese Taiwan
   * </pre>
   *
   * <code>ZH_TW = 37;</code>
   */
  ZH_TW(37),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LANGUAGE_UNSPECIFIED = 0;</code>
   */
  public static final int LANGUAGE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Arabic Saudi Arabia
   * </pre>
   *
   * <code>AR_SA = 1;</code>
   */
  public static final int AR_SA_VALUE = 1;
  /**
   * <pre>
   * Czech Czech Republic
   * </pre>
   *
   * <code>CS_CZ = 2;</code>
   */
  public static final int CS_CZ_VALUE = 2;
  /**
   * <pre>
   * Danish Denmark
   * </pre>
   *
   * <code>DA_DK = 3;</code>
   */
  public static final int DA_DK_VALUE = 3;
  /**
   * <pre>
   * German Germany
   * </pre>
   *
   * <code>DE_DE = 4;</code>
   */
  public static final int DE_DE_VALUE = 4;
  /**
   * <pre>
   * Modern Greek Greece
   * </pre>
   *
   * <code>EL_GR = 5;</code>
   */
  public static final int EL_GR_VALUE = 5;
  /**
   * <pre>
   * English Australia
   * </pre>
   *
   * <code>EN_AU = 6;</code>
   */
  public static final int EN_AU_VALUE = 6;
  /**
   * <pre>
   * English United Kingdom
   * </pre>
   *
   * <code>EN_GB = 7;</code>
   */
  public static final int EN_GB_VALUE = 7;
  /**
   * <pre>
   * English Ireland
   * </pre>
   *
   * <code>EN_IE = 8;</code>
   */
  public static final int EN_IE_VALUE = 8;
  /**
   * <pre>
   * English United States
   * </pre>
   *
   * <code>EN_US = 9;</code>
   */
  public static final int EN_US_VALUE = 9;
  /**
   * <pre>
   * English South Africa
   * </pre>
   *
   * <code>EN_ZA = 10;</code>
   */
  public static final int EN_ZA_VALUE = 10;
  /**
   * <pre>
   * Spanish Spain
   * </pre>
   *
   * <code>ES_ES = 11;</code>
   */
  public static final int ES_ES_VALUE = 11;
  /**
   * <pre>
   * Spanish Mexico
   * </pre>
   *
   * <code>ES_MX = 12;</code>
   */
  public static final int ES_MX_VALUE = 12;
  /**
   * <pre>
   * Finnish Finland
   * </pre>
   *
   * <code>FI_FI = 13;</code>
   */
  public static final int FI_FI_VALUE = 13;
  /**
   * <pre>
   * French Canada
   * </pre>
   *
   * <code>FR_CA = 14;</code>
   */
  public static final int FR_CA_VALUE = 14;
  /**
   * <pre>
   * French France
   * </pre>
   *
   * <code>FR_FR = 15;</code>
   */
  public static final int FR_FR_VALUE = 15;
  /**
   * <pre>
   * Hebrew Israel
   * </pre>
   *
   * <code>HE_IL = 16;</code>
   */
  public static final int HE_IL_VALUE = 16;
  /**
   * <pre>
   * Hindi India
   * </pre>
   *
   * <code>HI_IN = 17;</code>
   */
  public static final int HI_IN_VALUE = 17;
  /**
   * <pre>
   * Hungarian Hungary
   * </pre>
   *
   * <code>HU_HU = 18;</code>
   */
  public static final int HU_HU_VALUE = 18;
  /**
   * <pre>
   * Indonesian Indonesia
   * </pre>
   *
   * <code>ID_ID = 19;</code>
   */
  public static final int ID_ID_VALUE = 19;
  /**
   * <pre>
   * Italian Italy
   * </pre>
   *
   * <code>IT_IT = 20;</code>
   */
  public static final int IT_IT_VALUE = 20;
  /**
   * <pre>
   * Japanese Japan
   * </pre>
   *
   * <code>JA_JP = 21;</code>
   */
  public static final int JA_JP_VALUE = 21;
  /**
   * <pre>
   * Korean Republic of Korea
   * </pre>
   *
   * <code>KO_KR = 22;</code>
   */
  public static final int KO_KR_VALUE = 22;
  /**
   * <pre>
   * Dutch Belgium
   * </pre>
   *
   * <code>NL_BE = 23;</code>
   */
  public static final int NL_BE_VALUE = 23;
  /**
   * <pre>
   * Dutch Netherlands
   * </pre>
   *
   * <code>NL_NL = 24;</code>
   */
  public static final int NL_NL_VALUE = 24;
  /**
   * <pre>
   * Norwegian Norway
   * </pre>
   *
   * <code>NO_NO = 25;</code>
   */
  public static final int NO_NO_VALUE = 25;
  /**
   * <pre>
   * Polish Poland
   * </pre>
   *
   * <code>PL_PL = 26;</code>
   */
  public static final int PL_PL_VALUE = 26;
  /**
   * <pre>
   * Portuguese Brazil
   * </pre>
   *
   * <code>PT_BR = 27;</code>
   */
  public static final int PT_BR_VALUE = 27;
  /**
   * <pre>
   * Portuguese Portugal
   * </pre>
   *
   * <code>PT_PT = 28;</code>
   */
  public static final int PT_PT_VALUE = 28;
  /**
   * <pre>
   * Romanian Romania
   * </pre>
   *
   * <code>RO_RO = 29;</code>
   */
  public static final int RO_RO_VALUE = 29;
  /**
   * <pre>
   * Russian Russian Federation
   * </pre>
   *
   * <code>RU_RU = 30;</code>
   */
  public static final int RU_RU_VALUE = 30;
  /**
   * <pre>
   * Slovak Slovakia
   * </pre>
   *
   * <code>SK_SK = 31;</code>
   */
  public static final int SK_SK_VALUE = 31;
  /**
   * <pre>
   * Swedish Sweden
   * </pre>
   *
   * <code>SV_SE = 32;</code>
   */
  public static final int SV_SE_VALUE = 32;
  /**
   * <pre>
   * Thai Thailand
   * </pre>
   *
   * <code>TH_TH = 33;</code>
   */
  public static final int TH_TH_VALUE = 33;
  /**
   * <pre>
   * Turkish Turkey
   * </pre>
   *
   * <code>TR_TR = 34;</code>
   */
  public static final int TR_TR_VALUE = 34;
  /**
   * <pre>
   * Chinese China
   * </pre>
   *
   * <code>ZH_CN = 35;</code>
   */
  public static final int ZH_CN_VALUE = 35;
  /**
   * <pre>
   * Chinese Hong Kong
   * </pre>
   *
   * <code>ZH_HK = 36;</code>
   */
  public static final int ZH_HK_VALUE = 36;
  /**
   * <pre>
   * Chinese Taiwan
   * </pre>
   *
   * <code>ZH_TW = 37;</code>
   */
  public static final int ZH_TW_VALUE = 37;


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
  public static Language valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Language forNumber(int value) {
    switch (value) {
      case 0: return LANGUAGE_UNSPECIFIED;
      case 1: return AR_SA;
      case 2: return CS_CZ;
      case 3: return DA_DK;
      case 4: return DE_DE;
      case 5: return EL_GR;
      case 6: return EN_AU;
      case 7: return EN_GB;
      case 8: return EN_IE;
      case 9: return EN_US;
      case 10: return EN_ZA;
      case 11: return ES_ES;
      case 12: return ES_MX;
      case 13: return FI_FI;
      case 14: return FR_CA;
      case 15: return FR_FR;
      case 16: return HE_IL;
      case 17: return HI_IN;
      case 18: return HU_HU;
      case 19: return ID_ID;
      case 20: return IT_IT;
      case 21: return JA_JP;
      case 22: return KO_KR;
      case 23: return NL_BE;
      case 24: return NL_NL;
      case 25: return NO_NO;
      case 26: return PL_PL;
      case 27: return PT_BR;
      case 28: return PT_PT;
      case 29: return RO_RO;
      case 30: return RU_RU;
      case 31: return SK_SK;
      case 32: return SV_SE;
      case 33: return TH_TH;
      case 34: return TR_TR;
      case 35: return ZH_CN;
      case 36: return ZH_HK;
      case 37: return ZH_TW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Language>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Language> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Language>() {
          public Language findValueByNumber(int number) {
            return Language.forNumber(number);
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
    return com.tcn.cloud.api.services.translation.v1alpha1.EntitiesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Language[] VALUES = values();

  public static Language valueOf(
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

  private Language(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.translation.v1alpha1.Language)
}

