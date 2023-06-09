// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * OmniCampaignDirection -
 * </pre>
 *
 * Protobuf enum {@code api.commons.OmniCampaignDirection}
 */
public enum OmniCampaignDirection
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * campaigns focused on receiving messages
   * </pre>
   *
   * <code>INBOUND = 0;</code>
   */
  INBOUND(0),
  /**
   * <pre>
   * campaigns focused on sending messages
   * </pre>
   *
   * <code>OUTBOUND = 1;</code>
   */
  OUTBOUND(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * campaigns focused on receiving messages
   * </pre>
   *
   * <code>INBOUND = 0;</code>
   */
  public static final int INBOUND_VALUE = 0;
  /**
   * <pre>
   * campaigns focused on sending messages
   * </pre>
   *
   * <code>OUTBOUND = 1;</code>
   */
  public static final int OUTBOUND_VALUE = 1;


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
  public static OmniCampaignDirection valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OmniCampaignDirection forNumber(int value) {
    switch (value) {
      case 0: return INBOUND;
      case 1: return OUTBOUND;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OmniCampaignDirection>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OmniCampaignDirection> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OmniCampaignDirection>() {
          public OmniCampaignDirection findValueByNumber(int number) {
            return OmniCampaignDirection.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final OmniCampaignDirection[] VALUES = values();

  public static OmniCampaignDirection valueOf(
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

  private OmniCampaignDirection(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.OmniCampaignDirection)
}

