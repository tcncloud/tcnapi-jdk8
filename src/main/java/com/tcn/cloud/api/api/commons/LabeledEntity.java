// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/labels.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * LabeledEntity is an enum that represents the different types of entities that can be labeled.
 * </pre>
 *
 * Protobuf enum {@code api.commons.LabeledEntity}
 */
public enum LabeledEntity
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * LABELED_ENTITY_UNSPECIFIED is an unspecified entity type.
   * </pre>
   *
   * <code>LABELED_ENTITY_UNSPECIFIED = 0;</code>
   */
  LABELED_ENTITY_UNSPECIFIED(0),
  /**
   * <pre>
   * LABELED_ENTITY_SKILL_GROUP is a skill group entity type.
   * </pre>
   *
   * <code>LABELED_ENTITY_SKILL_GROUP = 1;</code>
   */
  LABELED_ENTITY_SKILL_GROUP(1),
  /**
   * <pre>
   * LABELED_ENTITY_USER is a user entity type.
   * </pre>
   *
   * <code>LABELED_ENTITY_USER = 2;</code>
   */
  LABELED_ENTITY_USER(2),
  /**
   * <pre>
   * LABELED_ENTITY_TICKET is a ticket entity type.
   * </pre>
   *
   * <code>LABELED_ENTITY_TICKET = 3;</code>
   */
  LABELED_ENTITY_TICKET(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * LABELED_ENTITY_UNSPECIFIED is an unspecified entity type.
   * </pre>
   *
   * <code>LABELED_ENTITY_UNSPECIFIED = 0;</code>
   */
  public static final int LABELED_ENTITY_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * LABELED_ENTITY_SKILL_GROUP is a skill group entity type.
   * </pre>
   *
   * <code>LABELED_ENTITY_SKILL_GROUP = 1;</code>
   */
  public static final int LABELED_ENTITY_SKILL_GROUP_VALUE = 1;
  /**
   * <pre>
   * LABELED_ENTITY_USER is a user entity type.
   * </pre>
   *
   * <code>LABELED_ENTITY_USER = 2;</code>
   */
  public static final int LABELED_ENTITY_USER_VALUE = 2;
  /**
   * <pre>
   * LABELED_ENTITY_TICKET is a ticket entity type.
   * </pre>
   *
   * <code>LABELED_ENTITY_TICKET = 3;</code>
   */
  public static final int LABELED_ENTITY_TICKET_VALUE = 3;


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
  public static LabeledEntity valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LabeledEntity forNumber(int value) {
    switch (value) {
      case 0: return LABELED_ENTITY_UNSPECIFIED;
      case 1: return LABELED_ENTITY_SKILL_GROUP;
      case 2: return LABELED_ENTITY_USER;
      case 3: return LABELED_ENTITY_TICKET;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LabeledEntity>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LabeledEntity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LabeledEntity>() {
          public LabeledEntity findValueByNumber(int number) {
            return LabeledEntity.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.LabelsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final LabeledEntity[] VALUES = values();

  public static LabeledEntity valueOf(
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

  private LabeledEntity(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.LabeledEntity)
}

