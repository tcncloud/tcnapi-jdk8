// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * OmniCampaignModuleType -
 * </pre>
 *
 * Protobuf enum {@code api.commons.OmniCampaignModuleType}
 */
public enum OmniCampaignModuleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * inbound module
   * </pre>
   *
   * <code>MODULE_TYPE_INBOUND = 0;</code>
   */
  MODULE_TYPE_INBOUND(0),
  /**
   * <pre>
   * outbound module
   * </pre>
   *
   * <code>MODULE_TYPE_OUTBOUND = 1;</code>
   */
  MODULE_TYPE_OUTBOUND(1),
  /**
   * <pre>
   * manual approve module
   * </pre>
   *
   * <code>MODULE_TYPE_MANUAL_APPROVAL = 2;</code>
   */
  MODULE_TYPE_MANUAL_APPROVAL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * inbound module
   * </pre>
   *
   * <code>MODULE_TYPE_INBOUND = 0;</code>
   */
  public static final int MODULE_TYPE_INBOUND_VALUE = 0;
  /**
   * <pre>
   * outbound module
   * </pre>
   *
   * <code>MODULE_TYPE_OUTBOUND = 1;</code>
   */
  public static final int MODULE_TYPE_OUTBOUND_VALUE = 1;
  /**
   * <pre>
   * manual approve module
   * </pre>
   *
   * <code>MODULE_TYPE_MANUAL_APPROVAL = 2;</code>
   */
  public static final int MODULE_TYPE_MANUAL_APPROVAL_VALUE = 2;


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
  public static OmniCampaignModuleType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OmniCampaignModuleType forNumber(int value) {
    switch (value) {
      case 0: return MODULE_TYPE_INBOUND;
      case 1: return MODULE_TYPE_OUTBOUND;
      case 2: return MODULE_TYPE_MANUAL_APPROVAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OmniCampaignModuleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OmniCampaignModuleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OmniCampaignModuleType>() {
          public OmniCampaignModuleType findValueByNumber(int number) {
            return OmniCampaignModuleType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final OmniCampaignModuleType[] VALUES = values();

  public static OmniCampaignModuleType valueOf(
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

  private OmniCampaignModuleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.OmniCampaignModuleType)
}

