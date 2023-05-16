// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Enum representing the level of a diagnostic.
 * </pre>
 *
 * Protobuf enum {@code api.commons.DiagnosticLevel}
 */
public enum DiagnosticLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The diagnostic is reporting an information level report.
   * </pre>
   *
   * <code>INFORMATION = 0;</code>
   */
  INFORMATION(0),
  /**
   * <pre>
   * The diagnostic is reporting a suggestion level report.
   * </pre>
   *
   * <code>SUGGESTION = 1;</code>
   */
  SUGGESTION(1),
  /**
   * <pre>
   * The diagnostic is reporting a warning level report.
   * </pre>
   *
   * <code>WARNING = 2;</code>
   */
  WARNING(2),
  /**
   * <pre>
   * The diagnostic is reporting an error level report.
   * </pre>
   *
   * <code>DIAGNOSTIC_ERROR = 3;</code>
   */
  DIAGNOSTIC_ERROR(3),
  /**
   * <pre>
   * The diagnostic is reporting an internal error level report.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 4;</code>
   */
  INTERNAL_ERROR(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The diagnostic is reporting an information level report.
   * </pre>
   *
   * <code>INFORMATION = 0;</code>
   */
  public static final int INFORMATION_VALUE = 0;
  /**
   * <pre>
   * The diagnostic is reporting a suggestion level report.
   * </pre>
   *
   * <code>SUGGESTION = 1;</code>
   */
  public static final int SUGGESTION_VALUE = 1;
  /**
   * <pre>
   * The diagnostic is reporting a warning level report.
   * </pre>
   *
   * <code>WARNING = 2;</code>
   */
  public static final int WARNING_VALUE = 2;
  /**
   * <pre>
   * The diagnostic is reporting an error level report.
   * </pre>
   *
   * <code>DIAGNOSTIC_ERROR = 3;</code>
   */
  public static final int DIAGNOSTIC_ERROR_VALUE = 3;
  /**
   * <pre>
   * The diagnostic is reporting an internal error level report.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 4;</code>
   */
  public static final int INTERNAL_ERROR_VALUE = 4;


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
  public static DiagnosticLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DiagnosticLevel forNumber(int value) {
    switch (value) {
      case 0: return INFORMATION;
      case 1: return SUGGESTION;
      case 2: return WARNING;
      case 3: return DIAGNOSTIC_ERROR;
      case 4: return INTERNAL_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiagnosticLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DiagnosticLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiagnosticLevel>() {
          public DiagnosticLevel findValueByNumber(int number) {
            return DiagnosticLevel.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(10);
  }

  private static final DiagnosticLevel[] VALUES = values();

  public static DiagnosticLevel valueOf(
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

  private DiagnosticLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.DiagnosticLevel)
}

