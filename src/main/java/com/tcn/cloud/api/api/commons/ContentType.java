// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/compliance.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.ContentType}
 */
public enum ContentType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CT_PHONE_NUMBER = 0;</code>
   */
  CT_PHONE_NUMBER(0),
  /**
   * <code>CT_EMAIL = 1;</code>
   */
  CT_EMAIL(1),
  /**
   * <code>CT_SMS = 2;</code>
   */
  CT_SMS(2),
  /**
   * <code>CT_OTHER = 3;</code>
   */
  CT_OTHER(3),
  /**
   * <code>CT_ACCOUNT_NUMBER = 4;</code>
   */
  CT_ACCOUNT_NUMBER(4),
  /**
   * <code>CT_WHATSAPP = 5;</code>
   */
  CT_WHATSAPP(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CT_PHONE_NUMBER = 0;</code>
   */
  public static final int CT_PHONE_NUMBER_VALUE = 0;
  /**
   * <code>CT_EMAIL = 1;</code>
   */
  public static final int CT_EMAIL_VALUE = 1;
  /**
   * <code>CT_SMS = 2;</code>
   */
  public static final int CT_SMS_VALUE = 2;
  /**
   * <code>CT_OTHER = 3;</code>
   */
  public static final int CT_OTHER_VALUE = 3;
  /**
   * <code>CT_ACCOUNT_NUMBER = 4;</code>
   */
  public static final int CT_ACCOUNT_NUMBER_VALUE = 4;
  /**
   * <code>CT_WHATSAPP = 5;</code>
   */
  public static final int CT_WHATSAPP_VALUE = 5;


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
  public static ContentType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContentType forNumber(int value) {
    switch (value) {
      case 0: return CT_PHONE_NUMBER;
      case 1: return CT_EMAIL;
      case 2: return CT_SMS;
      case 3: return CT_OTHER;
      case 4: return CT_ACCOUNT_NUMBER;
      case 5: return CT_WHATSAPP;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContentType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ContentType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ContentType>() {
          public ContentType findValueByNumber(int number) {
            return ContentType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.ComplianceProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final ContentType[] VALUES = values();

  public static ContentType valueOf(
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

  private ContentType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ContentType)
}

