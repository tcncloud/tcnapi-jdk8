// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/scorecards.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Evaluation is how a scorecard gets evaluated.
 * It is not a boolean because it might grow (i.e. MIXED).
 * </pre>
 *
 * Protobuf enum {@code api.commons.EvaluationType}
 */
public enum EvaluationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * a person must fill out (score) the scorecard
   * </pre>
   *
   * <code>EVALUATE_MANUAL = 0;</code>
   */
  EVALUATE_MANUAL(0),
  /**
   * <pre>
   * AKA (Auto) Flag Evaluation. Completed by the system. Produces risk level.
   * </pre>
   *
   * <code>EVALUATE_AUTO = 1;</code>
   */
  EVALUATE_AUTO(1),
  /**
   * <pre>
   * Completed by the system. Produces point total and score percentage.
   * </pre>
   *
   * <code>EVALUATE_SMART = 2;</code>
   */
  EVALUATE_SMART(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * a person must fill out (score) the scorecard
   * </pre>
   *
   * <code>EVALUATE_MANUAL = 0;</code>
   */
  public static final int EVALUATE_MANUAL_VALUE = 0;
  /**
   * <pre>
   * AKA (Auto) Flag Evaluation. Completed by the system. Produces risk level.
   * </pre>
   *
   * <code>EVALUATE_AUTO = 1;</code>
   */
  public static final int EVALUATE_AUTO_VALUE = 1;
  /**
   * <pre>
   * Completed by the system. Produces point total and score percentage.
   * </pre>
   *
   * <code>EVALUATE_SMART = 2;</code>
   */
  public static final int EVALUATE_SMART_VALUE = 2;


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
  public static EvaluationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EvaluationType forNumber(int value) {
    switch (value) {
      case 0: return EVALUATE_MANUAL;
      case 1: return EVALUATE_AUTO;
      case 2: return EVALUATE_SMART;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EvaluationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EvaluationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EvaluationType>() {
          public EvaluationType findValueByNumber(int number) {
            return EvaluationType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final EvaluationType[] VALUES = values();

  public static EvaluationType valueOf(
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

  private EvaluationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.EvaluationType)
}

