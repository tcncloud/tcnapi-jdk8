// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/ana_charts.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.SuffixChoices}
 */
public enum SuffixChoices
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SUFFIX_CHOICES_NOSUFFIX = 0;</code>
   */
  SUFFIX_CHOICES_NOSUFFIX(0),
  /**
   * <code>SUFFIX_CHOICES_DOLLARS = 1;</code>
   */
  SUFFIX_CHOICES_DOLLARS(1),
  /**
   * <code>SUFFIX_CHOICES_PERCENTAGE = 2;</code>
   */
  SUFFIX_CHOICES_PERCENTAGE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SUFFIX_CHOICES_NOSUFFIX = 0;</code>
   */
  public static final int SUFFIX_CHOICES_NOSUFFIX_VALUE = 0;
  /**
   * <code>SUFFIX_CHOICES_DOLLARS = 1;</code>
   */
  public static final int SUFFIX_CHOICES_DOLLARS_VALUE = 1;
  /**
   * <code>SUFFIX_CHOICES_PERCENTAGE = 2;</code>
   */
  public static final int SUFFIX_CHOICES_PERCENTAGE_VALUE = 2;


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
  public static SuffixChoices valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SuffixChoices forNumber(int value) {
    switch (value) {
      case 0: return SUFFIX_CHOICES_NOSUFFIX;
      case 1: return SUFFIX_CHOICES_DOLLARS;
      case 2: return SUFFIX_CHOICES_PERCENTAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SuffixChoices>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SuffixChoices> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SuffixChoices>() {
          public SuffixChoices findValueByNumber(int number) {
            return SuffixChoices.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.AnaChartsProto.getDescriptor().getEnumTypes().get(7);
  }

  private static final SuffixChoices[] VALUES = values();

  public static SuffixChoices valueOf(
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

  private SuffixChoices(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.SuffixChoices)
}

