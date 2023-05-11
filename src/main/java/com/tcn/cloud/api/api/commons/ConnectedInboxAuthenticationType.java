// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * ConnectedInboxAuthenticationType -
 * </pre>
 *
 * Protobuf enum {@code api.commons.ConnectedInboxAuthenticationType}
 */
public enum ConnectedInboxAuthenticationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CONNECTED_INBOX_AUTHENTICATION_TYPE_PASSWORD = 0;</code>
   */
  CONNECTED_INBOX_AUTHENTICATION_TYPE_PASSWORD(0),
  /**
   * <code>CONNECTED_INBOX_AUTHENTICATION_TYPE_GOOGLE_XOAUTH2 = 1;</code>
   */
  CONNECTED_INBOX_AUTHENTICATION_TYPE_GOOGLE_XOAUTH2(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CONNECTED_INBOX_AUTHENTICATION_TYPE_PASSWORD = 0;</code>
   */
  public static final int CONNECTED_INBOX_AUTHENTICATION_TYPE_PASSWORD_VALUE = 0;
  /**
   * <code>CONNECTED_INBOX_AUTHENTICATION_TYPE_GOOGLE_XOAUTH2 = 1;</code>
   */
  public static final int CONNECTED_INBOX_AUTHENTICATION_TYPE_GOOGLE_XOAUTH2_VALUE = 1;


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
  public static ConnectedInboxAuthenticationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConnectedInboxAuthenticationType forNumber(int value) {
    switch (value) {
      case 0: return CONNECTED_INBOX_AUTHENTICATION_TYPE_PASSWORD;
      case 1: return CONNECTED_INBOX_AUTHENTICATION_TYPE_GOOGLE_XOAUTH2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConnectedInboxAuthenticationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConnectedInboxAuthenticationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConnectedInboxAuthenticationType>() {
          public ConnectedInboxAuthenticationType findValueByNumber(int number) {
            return ConnectedInboxAuthenticationType.forNumber(number);
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

  private static final ConnectedInboxAuthenticationType[] VALUES = values();

  public static ConnectedInboxAuthenticationType valueOf(
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

  private ConnectedInboxAuthenticationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ConnectedInboxAuthenticationType)
}

