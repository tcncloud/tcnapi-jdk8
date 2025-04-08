// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/explorer/entities.proto

package com.tcn.cloud.api.api.v1alpha1.explorer;

/**
 * <pre>
 * FileExtension represents the file extension of a file
 * </pre>
 *
 * Protobuf enum {@code api.v1alpha1.explorer.FileExtension}
 */
public enum FileExtension
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>FILE_EXTENSION_UNSPECIFIED = 0;</code>
   */
  FILE_EXTENSION_UNSPECIFIED(0),
  /**
   * <pre>
   * Parquet files
   * </pre>
   *
   * <code>FILE_EXTENSION_PARQUET = 1;</code>
   */
  FILE_EXTENSION_PARQUET(1),
  /**
   * <pre>
   * Comma separated files
   * </pre>
   *
   * <code>FILE_EXTENSION_CSV = 2;</code>
   */
  FILE_EXTENSION_CSV(2),
  /**
   * <pre>
   * Tab separated files
   * </pre>
   *
   * <code>FILE_EXTENSION_TSV = 3;</code>
   */
  FILE_EXTENSION_TSV(3),
  /**
   * <pre>
   * Text files
   * </pre>
   *
   * <code>FILE_EXTENSION_TXT = 4;</code>
   */
  FILE_EXTENSION_TXT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>FILE_EXTENSION_UNSPECIFIED = 0;</code>
   */
  public static final int FILE_EXTENSION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Parquet files
   * </pre>
   *
   * <code>FILE_EXTENSION_PARQUET = 1;</code>
   */
  public static final int FILE_EXTENSION_PARQUET_VALUE = 1;
  /**
   * <pre>
   * Comma separated files
   * </pre>
   *
   * <code>FILE_EXTENSION_CSV = 2;</code>
   */
  public static final int FILE_EXTENSION_CSV_VALUE = 2;
  /**
   * <pre>
   * Tab separated files
   * </pre>
   *
   * <code>FILE_EXTENSION_TSV = 3;</code>
   */
  public static final int FILE_EXTENSION_TSV_VALUE = 3;
  /**
   * <pre>
   * Text files
   * </pre>
   *
   * <code>FILE_EXTENSION_TXT = 4;</code>
   */
  public static final int FILE_EXTENSION_TXT_VALUE = 4;


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
  public static FileExtension valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FileExtension forNumber(int value) {
    switch (value) {
      case 0: return FILE_EXTENSION_UNSPECIFIED;
      case 1: return FILE_EXTENSION_PARQUET;
      case 2: return FILE_EXTENSION_CSV;
      case 3: return FILE_EXTENSION_TSV;
      case 4: return FILE_EXTENSION_TXT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FileExtension>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FileExtension> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FileExtension>() {
          public FileExtension findValueByNumber(int number) {
            return FileExtension.forNumber(number);
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
    return com.tcn.cloud.api.api.v1alpha1.explorer.EntitiesProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final FileExtension[] VALUES = values();

  public static FileExtension valueOf(
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

  private FileExtension(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.v1alpha1.explorer.FileExtension)
}

