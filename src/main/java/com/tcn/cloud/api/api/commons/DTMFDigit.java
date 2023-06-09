// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/acd.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * enum used to represent a dtmf tone
 * </pre>
 *
 * Protobuf enum {@code api.commons.DTMFDigit}
 */
public enum DTMFDigit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DTMFDigit_0 = 0;</code>
   */
  DTMFDigit_0(0),
  /**
   * <code>DTMFDigit_1 = 1;</code>
   */
  DTMFDigit_1(1),
  /**
   * <code>DTMFDigit_2 = 2;</code>
   */
  DTMFDigit_2(2),
  /**
   * <code>DTMFDigit_3 = 3;</code>
   */
  DTMFDigit_3(3),
  /**
   * <code>DTMFDigit_4 = 4;</code>
   */
  DTMFDigit_4(4),
  /**
   * <code>DTMFDigit_5 = 5;</code>
   */
  DTMFDigit_5(5),
  /**
   * <code>DTMFDigit_6 = 6;</code>
   */
  DTMFDigit_6(6),
  /**
   * <code>DTMFDigit_7 = 7;</code>
   */
  DTMFDigit_7(7),
  /**
   * <code>DTMFDigit_8 = 8;</code>
   */
  DTMFDigit_8(8),
  /**
   * <code>DTMFDigit_9 = 9;</code>
   */
  DTMFDigit_9(9),
  /**
   * <code>DTMFDigit_A = 10;</code>
   */
  DTMFDigit_A(10),
  /**
   * <code>DTMFDigit_B = 11;</code>
   */
  DTMFDigit_B(11),
  /**
   * <code>DTMFDigit_C = 12;</code>
   */
  DTMFDigit_C(12),
  /**
   * <code>DTMFDigit_D = 13;</code>
   */
  DTMFDigit_D(13),
  /**
   * <code>DTMFDigit_STAR = 14;</code>
   */
  DTMFDigit_STAR(14),
  /**
   * <code>DTMFDigit_POUND = 15;</code>
   */
  DTMFDigit_POUND(15),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DTMFDigit_0 = 0;</code>
   */
  public static final int DTMFDigit_0_VALUE = 0;
  /**
   * <code>DTMFDigit_1 = 1;</code>
   */
  public static final int DTMFDigit_1_VALUE = 1;
  /**
   * <code>DTMFDigit_2 = 2;</code>
   */
  public static final int DTMFDigit_2_VALUE = 2;
  /**
   * <code>DTMFDigit_3 = 3;</code>
   */
  public static final int DTMFDigit_3_VALUE = 3;
  /**
   * <code>DTMFDigit_4 = 4;</code>
   */
  public static final int DTMFDigit_4_VALUE = 4;
  /**
   * <code>DTMFDigit_5 = 5;</code>
   */
  public static final int DTMFDigit_5_VALUE = 5;
  /**
   * <code>DTMFDigit_6 = 6;</code>
   */
  public static final int DTMFDigit_6_VALUE = 6;
  /**
   * <code>DTMFDigit_7 = 7;</code>
   */
  public static final int DTMFDigit_7_VALUE = 7;
  /**
   * <code>DTMFDigit_8 = 8;</code>
   */
  public static final int DTMFDigit_8_VALUE = 8;
  /**
   * <code>DTMFDigit_9 = 9;</code>
   */
  public static final int DTMFDigit_9_VALUE = 9;
  /**
   * <code>DTMFDigit_A = 10;</code>
   */
  public static final int DTMFDigit_A_VALUE = 10;
  /**
   * <code>DTMFDigit_B = 11;</code>
   */
  public static final int DTMFDigit_B_VALUE = 11;
  /**
   * <code>DTMFDigit_C = 12;</code>
   */
  public static final int DTMFDigit_C_VALUE = 12;
  /**
   * <code>DTMFDigit_D = 13;</code>
   */
  public static final int DTMFDigit_D_VALUE = 13;
  /**
   * <code>DTMFDigit_STAR = 14;</code>
   */
  public static final int DTMFDigit_STAR_VALUE = 14;
  /**
   * <code>DTMFDigit_POUND = 15;</code>
   */
  public static final int DTMFDigit_POUND_VALUE = 15;


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
  public static DTMFDigit valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DTMFDigit forNumber(int value) {
    switch (value) {
      case 0: return DTMFDigit_0;
      case 1: return DTMFDigit_1;
      case 2: return DTMFDigit_2;
      case 3: return DTMFDigit_3;
      case 4: return DTMFDigit_4;
      case 5: return DTMFDigit_5;
      case 6: return DTMFDigit_6;
      case 7: return DTMFDigit_7;
      case 8: return DTMFDigit_8;
      case 9: return DTMFDigit_9;
      case 10: return DTMFDigit_A;
      case 11: return DTMFDigit_B;
      case 12: return DTMFDigit_C;
      case 13: return DTMFDigit_D;
      case 14: return DTMFDigit_STAR;
      case 15: return DTMFDigit_POUND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DTMFDigit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DTMFDigit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DTMFDigit>() {
          public DTMFDigit findValueByNumber(int number) {
            return DTMFDigit.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.AcdProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final DTMFDigit[] VALUES = values();

  public static DTMFDigit valueOf(
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

  private DTMFDigit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.DTMFDigit)
}

