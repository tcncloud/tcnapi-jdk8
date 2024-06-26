// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * WhatsAppNumberProvider
 * </pre>
 *
 * Protobuf enum {@code api.commons.WhatsAppNumberProvider}
 */
public enum WhatsAppNumberProvider
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown provider
   * </pre>
   *
   * <code>UNKNOWN_WHATSAPP_PROVIDER = 0;</code>
   */
  UNKNOWN_WHATSAPP_PROVIDER(0),
  /**
   * <pre>
   * WhatsAppSmsProvder
   * </pre>
   *
   * <code>WHATSAPP_SMS_PROVIDER = 1;</code>
   */
  WHATSAPP_SMS_PROVIDER(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown provider
   * </pre>
   *
   * <code>UNKNOWN_WHATSAPP_PROVIDER = 0;</code>
   */
  public static final int UNKNOWN_WHATSAPP_PROVIDER_VALUE = 0;
  /**
   * <pre>
   * WhatsAppSmsProvder
   * </pre>
   *
   * <code>WHATSAPP_SMS_PROVIDER = 1;</code>
   */
  public static final int WHATSAPP_SMS_PROVIDER_VALUE = 1;


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
  public static WhatsAppNumberProvider valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WhatsAppNumberProvider forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_WHATSAPP_PROVIDER;
      case 1: return WHATSAPP_SMS_PROVIDER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WhatsAppNumberProvider>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WhatsAppNumberProvider> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WhatsAppNumberProvider>() {
          public WhatsAppNumberProvider findValueByNumber(int number) {
            return WhatsAppNumberProvider.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor().getEnumTypes().get(22);
  }

  private static final WhatsAppNumberProvider[] VALUES = values();

  public static WhatsAppNumberProvider valueOf(
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

  private WhatsAppNumberProvider(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.WhatsAppNumberProvider)
}

