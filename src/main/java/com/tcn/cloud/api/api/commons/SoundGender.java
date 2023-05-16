// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.SoundGender}
 */
public enum SoundGender
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SOUND_GENDER_MALE = 0;</code>
   */
  SOUND_GENDER_MALE(0),
  /**
   * <code>SOUND_GENDER_FEMALE = 1;</code>
   */
  SOUND_GENDER_FEMALE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SOUND_GENDER_MALE = 0;</code>
   */
  public static final int SOUND_GENDER_MALE_VALUE = 0;
  /**
   * <code>SOUND_GENDER_FEMALE = 1;</code>
   */
  public static final int SOUND_GENDER_FEMALE_VALUE = 1;


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
  public static SoundGender valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SoundGender forNumber(int value) {
    switch (value) {
      case 0: return SOUND_GENDER_MALE;
      case 1: return SOUND_GENDER_FEMALE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SoundGender>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SoundGender> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SoundGender>() {
          public SoundGender findValueByNumber(int number) {
            return SoundGender.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OrgProto.getDescriptor().getEnumTypes().get(20);
  }

  private static final SoundGender[] VALUES = values();

  public static SoundGender valueOf(
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

  private SoundGender(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.SoundGender)
}

