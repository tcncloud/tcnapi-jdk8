// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.integrations;

/**
 * <pre>
 * CompareOperation represents a comparison that can be done on on 'Value'
 * structs
 * </pre>
 *
 * Protobuf enum {@code api.commons.integrations.CompareOperation}
 */
public enum CompareOperation
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * equal to ==
   * </pre>
   *
   * <code>COMPARE_OPERATION_EQ = 0;</code>
   */
  COMPARE_OPERATION_EQ(0),
  /**
   * <pre>
   * greater than &gt;
   * </pre>
   *
   * <code>COMPARE_OPERATION_GT = 1;</code>
   */
  COMPARE_OPERATION_GT(1),
  /**
   * <pre>
   * less than &lt;
   * </pre>
   *
   * <code>COMPARE_OPERATION_LT = 2;</code>
   */
  COMPARE_OPERATION_LT(2),
  /**
   * <pre>
   * greater or equal &gt;=
   * </pre>
   *
   * <code>COMPARE_OPERATION_GE = 3;</code>
   */
  COMPARE_OPERATION_GE(3),
  /**
   * <pre>
   * less or equal &lt;=
   * </pre>
   *
   * <code>COMPARE_OPERATION_LE = 4;</code>
   */
  COMPARE_OPERATION_LE(4),
  /**
   * <pre>
   * !=
   * </pre>
   *
   * <code>COMPARE_OPERATION_NE = 5;</code>
   */
  COMPARE_OPERATION_NE(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * equal to ==
   * </pre>
   *
   * <code>COMPARE_OPERATION_EQ = 0;</code>
   */
  public static final int COMPARE_OPERATION_EQ_VALUE = 0;
  /**
   * <pre>
   * greater than &gt;
   * </pre>
   *
   * <code>COMPARE_OPERATION_GT = 1;</code>
   */
  public static final int COMPARE_OPERATION_GT_VALUE = 1;
  /**
   * <pre>
   * less than &lt;
   * </pre>
   *
   * <code>COMPARE_OPERATION_LT = 2;</code>
   */
  public static final int COMPARE_OPERATION_LT_VALUE = 2;
  /**
   * <pre>
   * greater or equal &gt;=
   * </pre>
   *
   * <code>COMPARE_OPERATION_GE = 3;</code>
   */
  public static final int COMPARE_OPERATION_GE_VALUE = 3;
  /**
   * <pre>
   * less or equal &lt;=
   * </pre>
   *
   * <code>COMPARE_OPERATION_LE = 4;</code>
   */
  public static final int COMPARE_OPERATION_LE_VALUE = 4;
  /**
   * <pre>
   * !=
   * </pre>
   *
   * <code>COMPARE_OPERATION_NE = 5;</code>
   */
  public static final int COMPARE_OPERATION_NE_VALUE = 5;


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
  public static CompareOperation valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CompareOperation forNumber(int value) {
    switch (value) {
      case 0: return COMPARE_OPERATION_EQ;
      case 1: return COMPARE_OPERATION_GT;
      case 2: return COMPARE_OPERATION_LT;
      case 3: return COMPARE_OPERATION_GE;
      case 4: return COMPARE_OPERATION_LE;
      case 5: return COMPARE_OPERATION_NE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CompareOperation>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CompareOperation> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CompareOperation>() {
          public CompareOperation findValueByNumber(int number) {
            return CompareOperation.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.integrations.IntegrationsProto.getDescriptor().getEnumTypes().get(8);
  }

  private static final CompareOperation[] VALUES = values();

  public static CompareOperation valueOf(
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

  private CompareOperation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.integrations.CompareOperation)
}

