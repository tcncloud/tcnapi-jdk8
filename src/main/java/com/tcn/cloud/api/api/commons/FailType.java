// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/scorecards.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * FailType is how affect the scoring of the scorecard.
 * Some answer options have points, which add to the score.
 * Other options have fail types which are applied, when chosen.
 * </pre>
 *
 * Protobuf enum {@code api.commons.FailType}
 */
public enum FailType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * default. fail the question
   * </pre>
   *
   * <code>FAIL_QUESTION = 0;</code>
   */
  FAIL_QUESTION(0),
  /**
   * <pre>
   * fail the scorecard's section
   * </pre>
   *
   * <code>FAIL_SECTION = 1;</code>
   */
  FAIL_SECTION(1),
  /**
   * <pre>
   * fail the entire scorecard
   * </pre>
   *
   * <code>FAIL_SCORECARD = 2;</code>
   */
  FAIL_SCORECARD(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * default. fail the question
   * </pre>
   *
   * <code>FAIL_QUESTION = 0;</code>
   */
  public static final int FAIL_QUESTION_VALUE = 0;
  /**
   * <pre>
   * fail the scorecard's section
   * </pre>
   *
   * <code>FAIL_SECTION = 1;</code>
   */
  public static final int FAIL_SECTION_VALUE = 1;
  /**
   * <pre>
   * fail the entire scorecard
   * </pre>
   *
   * <code>FAIL_SCORECARD = 2;</code>
   */
  public static final int FAIL_SCORECARD_VALUE = 2;


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
  public static FailType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FailType forNumber(int value) {
    switch (value) {
      case 0: return FAIL_QUESTION;
      case 1: return FAIL_SECTION;
      case 2: return FAIL_SCORECARD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FailType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FailType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FailType>() {
          public FailType findValueByNumber(int number) {
            return FailType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final FailType[] VALUES = values();

  public static FailType valueOf(
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

  private FailType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.FailType)
}

