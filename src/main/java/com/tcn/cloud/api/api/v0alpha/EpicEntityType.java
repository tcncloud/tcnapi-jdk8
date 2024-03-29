// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * The types of entities that can be returned from Epic's bulk data api.
 * </pre>
 *
 * Protobuf enum {@code api.v0alpha.EpicEntityType}
 */
public enum EpicEntityType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EPIC_UNKNOWN_TYPE = 0;</code>
   */
  EPIC_UNKNOWN_TYPE(0),
  /**
   * <code>EPIC_ENTITY_TYPE_PATIENT = 1;</code>
   */
  EPIC_ENTITY_TYPE_PATIENT(1),
  /**
   * <code>EPIC_ENTITY_TYPE_APPOINTMENT = 2;</code>
   */
  EPIC_ENTITY_TYPE_APPOINTMENT(2),
  /**
   * <code>EPIC_ENTITY_TYPE_MEDICATION = 3;</code>
   */
  EPIC_ENTITY_TYPE_MEDICATION(3),
  /**
   * <code>EPIC_ENTITY_TYPE_MEDICATION_REQUEST = 4;</code>
   */
  EPIC_ENTITY_TYPE_MEDICATION_REQUEST(4),
  /**
   * <code>EPIC_ENTITY_TYPE_ACCOUNT = 5;</code>
   */
  EPIC_ENTITY_TYPE_ACCOUNT(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EPIC_UNKNOWN_TYPE = 0;</code>
   */
  public static final int EPIC_UNKNOWN_TYPE_VALUE = 0;
  /**
   * <code>EPIC_ENTITY_TYPE_PATIENT = 1;</code>
   */
  public static final int EPIC_ENTITY_TYPE_PATIENT_VALUE = 1;
  /**
   * <code>EPIC_ENTITY_TYPE_APPOINTMENT = 2;</code>
   */
  public static final int EPIC_ENTITY_TYPE_APPOINTMENT_VALUE = 2;
  /**
   * <code>EPIC_ENTITY_TYPE_MEDICATION = 3;</code>
   */
  public static final int EPIC_ENTITY_TYPE_MEDICATION_VALUE = 3;
  /**
   * <code>EPIC_ENTITY_TYPE_MEDICATION_REQUEST = 4;</code>
   */
  public static final int EPIC_ENTITY_TYPE_MEDICATION_REQUEST_VALUE = 4;
  /**
   * <code>EPIC_ENTITY_TYPE_ACCOUNT = 5;</code>
   */
  public static final int EPIC_ENTITY_TYPE_ACCOUNT_VALUE = 5;


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
  public static EpicEntityType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EpicEntityType forNumber(int value) {
    switch (value) {
      case 0: return EPIC_UNKNOWN_TYPE;
      case 1: return EPIC_ENTITY_TYPE_PATIENT;
      case 2: return EPIC_ENTITY_TYPE_APPOINTMENT;
      case 3: return EPIC_ENTITY_TYPE_MEDICATION;
      case 4: return EPIC_ENTITY_TYPE_MEDICATION_REQUEST;
      case 5: return EPIC_ENTITY_TYPE_ACCOUNT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EpicEntityType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EpicEntityType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EpicEntityType>() {
          public EpicEntityType findValueByNumber(int number) {
            return EpicEntityType.forNumber(number);
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
    return com.tcn.cloud.api.api.v0alpha.LmsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final EpicEntityType[] VALUES = values();

  public static EpicEntityType valueOf(
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

  private EpicEntityType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.v0alpha.EpicEntityType)
}

