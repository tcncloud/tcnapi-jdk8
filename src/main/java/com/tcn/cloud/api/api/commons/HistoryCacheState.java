// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Enum representing the state of the history cache.
 * </pre>
 *
 * Protobuf enum {@code api.commons.HistoryCacheState}
 */
public enum HistoryCacheState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Cache is not loaded and no loading attempts have been made.
   * </pre>
   *
   * <code>NOT_LOADED = 0;</code>
   */
  NOT_LOADED(0),
  /**
   * <pre>
   * Cache is currently being loaded.
   * </pre>
   *
   * <code>LOADING = 1;</code>
   */
  LOADING(1),
  /**
   * <pre>
   * Cache has been successfully loaded.
   * </pre>
   *
   * <code>LOADING_COMPLETE = 2;</code>
   */
  LOADING_COMPLETE(2),
  /**
   * <pre>
   * Cache was attempted to be loaded but failed, and no new attempts have been made.
   * </pre>
   *
   * <code>LOADING_FAILED = 3;</code>
   */
  LOADING_FAILED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Cache is not loaded and no loading attempts have been made.
   * </pre>
   *
   * <code>NOT_LOADED = 0;</code>
   */
  public static final int NOT_LOADED_VALUE = 0;
  /**
   * <pre>
   * Cache is currently being loaded.
   * </pre>
   *
   * <code>LOADING = 1;</code>
   */
  public static final int LOADING_VALUE = 1;
  /**
   * <pre>
   * Cache has been successfully loaded.
   * </pre>
   *
   * <code>LOADING_COMPLETE = 2;</code>
   */
  public static final int LOADING_COMPLETE_VALUE = 2;
  /**
   * <pre>
   * Cache was attempted to be loaded but failed, and no new attempts have been made.
   * </pre>
   *
   * <code>LOADING_FAILED = 3;</code>
   */
  public static final int LOADING_FAILED_VALUE = 3;


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
  public static HistoryCacheState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HistoryCacheState forNumber(int value) {
    switch (value) {
      case 0: return NOT_LOADED;
      case 1: return LOADING;
      case 2: return LOADING_COMPLETE;
      case 3: return LOADING_FAILED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HistoryCacheState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HistoryCacheState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HistoryCacheState>() {
          public HistoryCacheState findValueByNumber(int number) {
            return HistoryCacheState.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(18);
  }

  private static final HistoryCacheState[] VALUES = values();

  public static HistoryCacheState valueOf(
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

  private HistoryCacheState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.HistoryCacheState)
}

