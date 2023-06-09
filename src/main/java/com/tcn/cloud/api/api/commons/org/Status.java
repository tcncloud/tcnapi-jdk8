// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/trusts.proto

package com.tcn.cloud.api.api.commons.org;

/**
 * <pre>
 * Status represents the states that trusts can be in.
 * </pre>
 *
 * Protobuf enum {@code api.commons.org.Status}
 */
public enum Status
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PENDING = 0;</code>
   */
  PENDING(0),
  /**
   * <code>REJECTED = 1;</code>
   */
  REJECTED(1),
  /**
   * <code>ACCEPTED = 2;</code>
   */
  ACCEPTED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PENDING = 0;</code>
   */
  public static final int PENDING_VALUE = 0;
  /**
   * <code>REJECTED = 1;</code>
   */
  public static final int REJECTED_VALUE = 1;
  /**
   * <code>ACCEPTED = 2;</code>
   */
  public static final int ACCEPTED_VALUE = 2;


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
  public static Status valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Status forNumber(int value) {
    switch (value) {
      case 0: return PENDING;
      case 1: return REJECTED;
      case 2: return ACCEPTED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Status>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Status> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Status>() {
          public Status findValueByNumber(int number) {
            return Status.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.org.TrustsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Status[] VALUES = values();

  public static Status valueOf(
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

  private Status(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.org.Status)
}

