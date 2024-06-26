// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.OmniSenderType}
 */
public enum OmniSenderType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OMNI_SENDER_TYPE_AGENT = 0;</code>
   */
  OMNI_SENDER_TYPE_AGENT(0),
  /**
   * <code>OMNI_SENDER_TYPE_CUSTOMER = 1;</code>
   */
  OMNI_SENDER_TYPE_CUSTOMER(1),
  /**
   * <code>OMNI_SENDER_TYPE_SYSTEM = 2;</code>
   */
  OMNI_SENDER_TYPE_SYSTEM(2),
  /**
   * <code>OMNI_SENDER_TYPE_MANAGER = 3;</code>
   */
  OMNI_SENDER_TYPE_MANAGER(3),
  /**
   * <code>OMNI_SENDER_TYPE_FLOW = 4;</code>
   */
  OMNI_SENDER_TYPE_FLOW(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OMNI_SENDER_TYPE_AGENT = 0;</code>
   */
  public static final int OMNI_SENDER_TYPE_AGENT_VALUE = 0;
  /**
   * <code>OMNI_SENDER_TYPE_CUSTOMER = 1;</code>
   */
  public static final int OMNI_SENDER_TYPE_CUSTOMER_VALUE = 1;
  /**
   * <code>OMNI_SENDER_TYPE_SYSTEM = 2;</code>
   */
  public static final int OMNI_SENDER_TYPE_SYSTEM_VALUE = 2;
  /**
   * <code>OMNI_SENDER_TYPE_MANAGER = 3;</code>
   */
  public static final int OMNI_SENDER_TYPE_MANAGER_VALUE = 3;
  /**
   * <code>OMNI_SENDER_TYPE_FLOW = 4;</code>
   */
  public static final int OMNI_SENDER_TYPE_FLOW_VALUE = 4;


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
  public static OmniSenderType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OmniSenderType forNumber(int value) {
    switch (value) {
      case 0: return OMNI_SENDER_TYPE_AGENT;
      case 1: return OMNI_SENDER_TYPE_CUSTOMER;
      case 2: return OMNI_SENDER_TYPE_SYSTEM;
      case 3: return OMNI_SENDER_TYPE_MANAGER;
      case 4: return OMNI_SENDER_TYPE_FLOW;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OmniSenderType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OmniSenderType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OmniSenderType>() {
          public OmniSenderType findValueByNumber(int number) {
            return OmniSenderType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(15);
  }

  private static final OmniSenderType[] VALUES = values();

  public static OmniSenderType valueOf(
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

  private OmniSenderType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.OmniSenderType)
}

