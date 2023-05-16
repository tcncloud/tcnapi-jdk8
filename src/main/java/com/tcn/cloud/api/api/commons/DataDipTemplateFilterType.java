// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Facilitate data dip template filtering on config type.
 * </pre>
 *
 * Protobuf enum {@code api.commons.DataDipTemplateFilterType}
 */
public enum DataDipTemplateFilterType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Do not filter results.
   * </pre>
   *
   * <code>DATA_DIP_TEMPLATE_FILTER_TYPE_NONE = 0;</code>
   */
  DATA_DIP_TEMPLATE_FILTER_TYPE_NONE(0),
  /**
   * <pre>
   * Do not filter results.
   * </pre>
   *
   * <code>DATA_DIP_TEMPLATE_FILTER_TYPE_BROADCAST = 1;</code>
   */
  DATA_DIP_TEMPLATE_FILTER_TYPE_BROADCAST(1),
  /**
   * <pre>
   * Include manual dial related data dip templates.
   * </pre>
   *
   * <code>DATA_DIP_TEMPLATE_FILTER_TYPE_MANUAL_DIAL = 2;</code>
   */
  DATA_DIP_TEMPLATE_FILTER_TYPE_MANUAL_DIAL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Do not filter results.
   * </pre>
   *
   * <code>DATA_DIP_TEMPLATE_FILTER_TYPE_NONE = 0;</code>
   */
  public static final int DATA_DIP_TEMPLATE_FILTER_TYPE_NONE_VALUE = 0;
  /**
   * <pre>
   * Do not filter results.
   * </pre>
   *
   * <code>DATA_DIP_TEMPLATE_FILTER_TYPE_BROADCAST = 1;</code>
   */
  public static final int DATA_DIP_TEMPLATE_FILTER_TYPE_BROADCAST_VALUE = 1;
  /**
   * <pre>
   * Include manual dial related data dip templates.
   * </pre>
   *
   * <code>DATA_DIP_TEMPLATE_FILTER_TYPE_MANUAL_DIAL = 2;</code>
   */
  public static final int DATA_DIP_TEMPLATE_FILTER_TYPE_MANUAL_DIAL_VALUE = 2;


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
  public static DataDipTemplateFilterType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataDipTemplateFilterType forNumber(int value) {
    switch (value) {
      case 0: return DATA_DIP_TEMPLATE_FILTER_TYPE_NONE;
      case 1: return DATA_DIP_TEMPLATE_FILTER_TYPE_BROADCAST;
      case 2: return DATA_DIP_TEMPLATE_FILTER_TYPE_MANUAL_DIAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataDipTemplateFilterType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataDipTemplateFilterType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataDipTemplateFilterType>() {
          public DataDipTemplateFilterType findValueByNumber(int number) {
            return DataDipTemplateFilterType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OrgProto.getDescriptor().getEnumTypes().get(40);
  }

  private static final DataDipTemplateFilterType[] VALUES = values();

  public static DataDipTemplateFilterType valueOf(
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

  private DataDipTemplateFilterType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.DataDipTemplateFilterType)
}

