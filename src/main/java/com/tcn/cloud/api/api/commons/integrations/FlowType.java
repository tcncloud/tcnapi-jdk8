// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.integrations;

/**
 * <pre>
 * must match the numbers in the Flow message's "value" oneof
 * </pre>
 *
 * Protobuf enum {@code api.commons.integrations.FlowType}
 */
public enum FlowType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FLOW_TYPE_UNKNOWN = 0;</code>
   */
  FLOW_TYPE_UNKNOWN(0),
  /**
   * <code>FLOW_TYPE_INVOICE = 1;</code>
   */
  FLOW_TYPE_INVOICE(1),
  /**
   * <code>FLOW_TYPE_PAYMENT = 2;</code>
   */
  FLOW_TYPE_PAYMENT(2),
  /**
   * <code>FLOW_TYPE_VERIFICATION = 3;</code>
   */
  FLOW_TYPE_VERIFICATION(3),
  /**
   * <code>FLOW_TYPE_EXECUTE = 4;</code>
   */
  FLOW_TYPE_EXECUTE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FLOW_TYPE_UNKNOWN = 0;</code>
   */
  public static final int FLOW_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <code>FLOW_TYPE_INVOICE = 1;</code>
   */
  public static final int FLOW_TYPE_INVOICE_VALUE = 1;
  /**
   * <code>FLOW_TYPE_PAYMENT = 2;</code>
   */
  public static final int FLOW_TYPE_PAYMENT_VALUE = 2;
  /**
   * <code>FLOW_TYPE_VERIFICATION = 3;</code>
   */
  public static final int FLOW_TYPE_VERIFICATION_VALUE = 3;
  /**
   * <code>FLOW_TYPE_EXECUTE = 4;</code>
   */
  public static final int FLOW_TYPE_EXECUTE_VALUE = 4;


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
  public static FlowType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FlowType forNumber(int value) {
    switch (value) {
      case 0: return FLOW_TYPE_UNKNOWN;
      case 1: return FLOW_TYPE_INVOICE;
      case 2: return FLOW_TYPE_PAYMENT;
      case 3: return FLOW_TYPE_VERIFICATION;
      case 4: return FLOW_TYPE_EXECUTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FlowType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FlowType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FlowType>() {
          public FlowType findValueByNumber(int number) {
            return FlowType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.integrations.IntegrationsProto.getDescriptor().getEnumTypes().get(13);
  }

  private static final FlowType[] VALUES = values();

  public static FlowType valueOf(
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

  private FlowType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.integrations.FlowType)
}

