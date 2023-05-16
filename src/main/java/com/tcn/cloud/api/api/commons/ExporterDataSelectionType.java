// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/ana.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.ExporterDataSelectionType}
 */
public enum ExporterDataSelectionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CHART_ID_SELECTION_TYPE = 0;</code>
   */
  CHART_ID_SELECTION_TYPE(0),
  /**
   * <code>CUSTOM_SELECTION_TYPE = 1;</code>
   */
  CUSTOM_SELECTION_TYPE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CHART_ID_SELECTION_TYPE = 0;</code>
   */
  public static final int CHART_ID_SELECTION_TYPE_VALUE = 0;
  /**
   * <code>CUSTOM_SELECTION_TYPE = 1;</code>
   */
  public static final int CUSTOM_SELECTION_TYPE_VALUE = 1;


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
  public static ExporterDataSelectionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ExporterDataSelectionType forNumber(int value) {
    switch (value) {
      case 0: return CHART_ID_SELECTION_TYPE;
      case 1: return CUSTOM_SELECTION_TYPE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ExporterDataSelectionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ExporterDataSelectionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ExporterDataSelectionType>() {
          public ExporterDataSelectionType findValueByNumber(int number) {
            return ExporterDataSelectionType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.AnaProto.getDescriptor().getEnumTypes().get(14);
  }

  private static final ExporterDataSelectionType[] VALUES = values();

  public static ExporterDataSelectionType valueOf(
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

  private ExporterDataSelectionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ExporterDataSelectionType)
}

