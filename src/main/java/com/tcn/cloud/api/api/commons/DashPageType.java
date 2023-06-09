// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/ana.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.DashPageType}
 */
public enum DashPageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DASH_PAGE_TYPE_UNDEFINED = 0;</code>
   */
  DASH_PAGE_TYPE_UNDEFINED(0),
  /**
   * <code>DASH_PAGE_TYPE_DASHBOARD = 1;</code>
   */
  DASH_PAGE_TYPE_DASHBOARD(1),
  /**
   * <code>DASH_PAGE_TYPE_VISUALIZATION_LEGACY = 2;</code>
   */
  DASH_PAGE_TYPE_VISUALIZATION_LEGACY(2),
  /**
   * <code>DASH_PAGE_TYPE_CHART = 3;</code>
   */
  DASH_PAGE_TYPE_CHART(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DASH_PAGE_TYPE_UNDEFINED = 0;</code>
   */
  public static final int DASH_PAGE_TYPE_UNDEFINED_VALUE = 0;
  /**
   * <code>DASH_PAGE_TYPE_DASHBOARD = 1;</code>
   */
  public static final int DASH_PAGE_TYPE_DASHBOARD_VALUE = 1;
  /**
   * <code>DASH_PAGE_TYPE_VISUALIZATION_LEGACY = 2;</code>
   */
  public static final int DASH_PAGE_TYPE_VISUALIZATION_LEGACY_VALUE = 2;
  /**
   * <code>DASH_PAGE_TYPE_CHART = 3;</code>
   */
  public static final int DASH_PAGE_TYPE_CHART_VALUE = 3;


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
  public static DashPageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DashPageType forNumber(int value) {
    switch (value) {
      case 0: return DASH_PAGE_TYPE_UNDEFINED;
      case 1: return DASH_PAGE_TYPE_DASHBOARD;
      case 2: return DASH_PAGE_TYPE_VISUALIZATION_LEGACY;
      case 3: return DASH_PAGE_TYPE_CHART;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DashPageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DashPageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DashPageType>() {
          public DashPageType findValueByNumber(int number) {
            return DashPageType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.AnaProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final DashPageType[] VALUES = values();

  public static DashPageType valueOf(
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

  private DashPageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.DashPageType)
}

