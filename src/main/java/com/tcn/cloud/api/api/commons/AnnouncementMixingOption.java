// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.AnnouncementMixingOption}
 */
public enum AnnouncementMixingOption
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ANNOUNCEMENT_MIXING_OPTION_MUTE_HOLD_MUSIC = 0;</code>
   */
  ANNOUNCEMENT_MIXING_OPTION_MUTE_HOLD_MUSIC(0),
  /**
   * <code>ANNOUNCEMENT_MIXING_OPTION_PLAY_OVER_HOLD_MUSIC = 1;</code>
   */
  ANNOUNCEMENT_MIXING_OPTION_PLAY_OVER_HOLD_MUSIC(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ANNOUNCEMENT_MIXING_OPTION_MUTE_HOLD_MUSIC = 0;</code>
   */
  public static final int ANNOUNCEMENT_MIXING_OPTION_MUTE_HOLD_MUSIC_VALUE = 0;
  /**
   * <code>ANNOUNCEMENT_MIXING_OPTION_PLAY_OVER_HOLD_MUSIC = 1;</code>
   */
  public static final int ANNOUNCEMENT_MIXING_OPTION_PLAY_OVER_HOLD_MUSIC_VALUE = 1;


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
  public static AnnouncementMixingOption valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AnnouncementMixingOption forNumber(int value) {
    switch (value) {
      case 0: return ANNOUNCEMENT_MIXING_OPTION_MUTE_HOLD_MUSIC;
      case 1: return ANNOUNCEMENT_MIXING_OPTION_PLAY_OVER_HOLD_MUSIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AnnouncementMixingOption>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AnnouncementMixingOption> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AnnouncementMixingOption>() {
          public AnnouncementMixingOption findValueByNumber(int number) {
            return AnnouncementMixingOption.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OrgProto.getDescriptor().getEnumTypes().get(14);
  }

  private static final AnnouncementMixingOption[] VALUES = values();

  public static AnnouncementMixingOption valueOf(
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

  private AnnouncementMixingOption(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.AnnouncementMixingOption)
}

