// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Enum representing the options for config entity relationships.
 * </pre>
 *
 * Protobuf enum {@code api.commons.ConfigRelationshipType}
 */
public enum ConfigRelationshipType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The entity is associated with the other one.
   * </pre>
   *
   * <code>IS_ASSOCIATED_WITH = 0;</code>
   */
  IS_ASSOCIATED_WITH(0),
  /**
   * <pre>
   * The entity is NOT associated with the other one.
   * </pre>
   *
   * <code>IS_NOT_ASSOCIATED_WITH = 1;</code>
   */
  IS_NOT_ASSOCIATED_WITH(1),
  /**
   * <pre>
   * The entity is a member of the other one.
   * </pre>
   *
   * <code>IS_MEMBER_OF = 2;</code>
   */
  IS_MEMBER_OF(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The entity is associated with the other one.
   * </pre>
   *
   * <code>IS_ASSOCIATED_WITH = 0;</code>
   */
  public static final int IS_ASSOCIATED_WITH_VALUE = 0;
  /**
   * <pre>
   * The entity is NOT associated with the other one.
   * </pre>
   *
   * <code>IS_NOT_ASSOCIATED_WITH = 1;</code>
   */
  public static final int IS_NOT_ASSOCIATED_WITH_VALUE = 1;
  /**
   * <pre>
   * The entity is a member of the other one.
   * </pre>
   *
   * <code>IS_MEMBER_OF = 2;</code>
   */
  public static final int IS_MEMBER_OF_VALUE = 2;


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
  public static ConfigRelationshipType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConfigRelationshipType forNumber(int value) {
    switch (value) {
      case 0: return IS_ASSOCIATED_WITH;
      case 1: return IS_NOT_ASSOCIATED_WITH;
      case 2: return IS_MEMBER_OF;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConfigRelationshipType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ConfigRelationshipType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ConfigRelationshipType>() {
          public ConfigRelationshipType findValueByNumber(int number) {
            return ConfigRelationshipType.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(9);
  }

  private static final ConfigRelationshipType[] VALUES = values();

  public static ConfigRelationshipType valueOf(
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

  private ConfigRelationshipType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ConfigRelationshipType)
}

