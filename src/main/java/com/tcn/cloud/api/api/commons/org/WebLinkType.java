// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * WebLinkType describes the type of a particular web link
 * </pre>
 *
 * Protobuf enum {@code api.commons.org.WebLinkType}
 */
public enum WebLinkType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>WEB_LINK_TYPE_UNSPECIFIED = 0;</code>
   */
  WEB_LINK_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Standard web link type
   * </pre>
   *
   * <code>WEB_LINK_STANDARD = 1;</code>
   */
  WEB_LINK_STANDARD(1),
  /**
   * <pre>
   * Javascript web link type
   * </pre>
   *
   * <code>WEB_LINK_JAVASCRIPT = 2;</code>
   */
  WEB_LINK_JAVASCRIPT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 0 explicitly means unspecified or invalid.
   * </pre>
   *
   * <code>WEB_LINK_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int WEB_LINK_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Standard web link type
   * </pre>
   *
   * <code>WEB_LINK_STANDARD = 1;</code>
   */
  public static final int WEB_LINK_STANDARD_VALUE = 1;
  /**
   * <pre>
   * Javascript web link type
   * </pre>
   *
   * <code>WEB_LINK_JAVASCRIPT = 2;</code>
   */
  public static final int WEB_LINK_JAVASCRIPT_VALUE = 2;


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
  public static WebLinkType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WebLinkType forNumber(int value) {
    switch (value) {
      case 0: return WEB_LINK_TYPE_UNSPECIFIED;
      case 1: return WEB_LINK_STANDARD;
      case 2: return WEB_LINK_JAVASCRIPT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WebLinkType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WebLinkType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WebLinkType>() {
          public WebLinkType findValueByNumber(int number) {
            return WebLinkType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.org.HuntgroupProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final WebLinkType[] VALUES = values();

  public static WebLinkType valueOf(
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

  private WebLinkType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.org.WebLinkType)
}

