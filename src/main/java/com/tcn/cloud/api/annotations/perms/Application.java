// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: annotations/perms/license.proto

package com.tcn.cloud.api.annotations.perms;

/**
 * <pre>
 * Application contains license/permission application name constants.
 * </pre>
 *
 * Protobuf enum {@code annotations.perms.Application}
 */
public enum Application
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>APPLICATION_UNSPECIFIED = 0;</code>
   */
  APPLICATION_UNSPECIFIED(0),
  /**
   * <code>APPLICATION_AGENT = 1;</code>
   */
  APPLICATION_AGENT(1),
  /**
   * <code>APPLICATION_BUSINESS_INTELLIGENCE = 2;</code>
   */
  APPLICATION_BUSINESS_INTELLIGENCE(2),
  /**
   * <code>APPLICATION_DELIVERY_SERVICE = 3;</code>
   */
  APPLICATION_DELIVERY_SERVICE(3),
  /**
   * <code>APPLICATION_DEV_TOOLS = 4;</code>
   */
  APPLICATION_DEV_TOOLS(4),
  /**
   * <code>APPLICATION_INTEGRATIONS = 5;</code>
   */
  APPLICATION_INTEGRATIONS(5),
  /**
   * <code>APPLICATION_LIST_MANAGEMENT_SERVICES = 6;</code>
   */
  APPLICATION_LIST_MANAGEMENT_SERVICES(6),
  /**
   * <code>APPLICATION_NATURAL_LANGUAGE_COMPLIANCE = 7;</code>
   */
  APPLICATION_NATURAL_LANGUAGE_COMPLIANCE(7),
  /**
   * <code>APPLICATION_OMNI_BOSS = 8;</code>
   */
  APPLICATION_OMNI_BOSS(8),
  /**
   * <code>APPLICATION_ORGANIZATION = 9;</code>
   */
  APPLICATION_ORGANIZATION(9),
  /**
   * <code>APPLICATION_ROOM_303 = 10;</code>
   */
  APPLICATION_ROOM_303(10),
  /**
   * <code>APPLICATION_SCORECARDS = 11;</code>
   */
  APPLICATION_SCORECARDS(11),
  /**
   * <code>APPLICATION_SCRIPTS = 12;</code>
   */
  APPLICATION_SCRIPTS(12),
  /**
   * <code>APPLICATION_TICKETS = 13;</code>
   */
  APPLICATION_TICKETS(13),
  /**
   * <code>APPLICATION_VOICE_ANALYTICS = 14;</code>
   */
  APPLICATION_VOICE_ANALYTICS(14),
  /**
   * <code>APPLICATION_WORK_FORCE_MANAGEMENT = 15;</code>
   */
  APPLICATION_WORK_FORCE_MANAGEMENT(15),
  /**
   * <code>APPLICATION_WORKFLOWS = 16;</code>
   */
  APPLICATION_WORKFLOWS(16),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>APPLICATION_UNSPECIFIED = 0;</code>
   */
  public static final int APPLICATION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>APPLICATION_AGENT = 1;</code>
   */
  public static final int APPLICATION_AGENT_VALUE = 1;
  /**
   * <code>APPLICATION_BUSINESS_INTELLIGENCE = 2;</code>
   */
  public static final int APPLICATION_BUSINESS_INTELLIGENCE_VALUE = 2;
  /**
   * <code>APPLICATION_DELIVERY_SERVICE = 3;</code>
   */
  public static final int APPLICATION_DELIVERY_SERVICE_VALUE = 3;
  /**
   * <code>APPLICATION_DEV_TOOLS = 4;</code>
   */
  public static final int APPLICATION_DEV_TOOLS_VALUE = 4;
  /**
   * <code>APPLICATION_INTEGRATIONS = 5;</code>
   */
  public static final int APPLICATION_INTEGRATIONS_VALUE = 5;
  /**
   * <code>APPLICATION_LIST_MANAGEMENT_SERVICES = 6;</code>
   */
  public static final int APPLICATION_LIST_MANAGEMENT_SERVICES_VALUE = 6;
  /**
   * <code>APPLICATION_NATURAL_LANGUAGE_COMPLIANCE = 7;</code>
   */
  public static final int APPLICATION_NATURAL_LANGUAGE_COMPLIANCE_VALUE = 7;
  /**
   * <code>APPLICATION_OMNI_BOSS = 8;</code>
   */
  public static final int APPLICATION_OMNI_BOSS_VALUE = 8;
  /**
   * <code>APPLICATION_ORGANIZATION = 9;</code>
   */
  public static final int APPLICATION_ORGANIZATION_VALUE = 9;
  /**
   * <code>APPLICATION_ROOM_303 = 10;</code>
   */
  public static final int APPLICATION_ROOM_303_VALUE = 10;
  /**
   * <code>APPLICATION_SCORECARDS = 11;</code>
   */
  public static final int APPLICATION_SCORECARDS_VALUE = 11;
  /**
   * <code>APPLICATION_SCRIPTS = 12;</code>
   */
  public static final int APPLICATION_SCRIPTS_VALUE = 12;
  /**
   * <code>APPLICATION_TICKETS = 13;</code>
   */
  public static final int APPLICATION_TICKETS_VALUE = 13;
  /**
   * <code>APPLICATION_VOICE_ANALYTICS = 14;</code>
   */
  public static final int APPLICATION_VOICE_ANALYTICS_VALUE = 14;
  /**
   * <code>APPLICATION_WORK_FORCE_MANAGEMENT = 15;</code>
   */
  public static final int APPLICATION_WORK_FORCE_MANAGEMENT_VALUE = 15;
  /**
   * <code>APPLICATION_WORKFLOWS = 16;</code>
   */
  public static final int APPLICATION_WORKFLOWS_VALUE = 16;


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
  public static Application valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Application forNumber(int value) {
    switch (value) {
      case 0: return APPLICATION_UNSPECIFIED;
      case 1: return APPLICATION_AGENT;
      case 2: return APPLICATION_BUSINESS_INTELLIGENCE;
      case 3: return APPLICATION_DELIVERY_SERVICE;
      case 4: return APPLICATION_DEV_TOOLS;
      case 5: return APPLICATION_INTEGRATIONS;
      case 6: return APPLICATION_LIST_MANAGEMENT_SERVICES;
      case 7: return APPLICATION_NATURAL_LANGUAGE_COMPLIANCE;
      case 8: return APPLICATION_OMNI_BOSS;
      case 9: return APPLICATION_ORGANIZATION;
      case 10: return APPLICATION_ROOM_303;
      case 11: return APPLICATION_SCORECARDS;
      case 12: return APPLICATION_SCRIPTS;
      case 13: return APPLICATION_TICKETS;
      case 14: return APPLICATION_VOICE_ANALYTICS;
      case 15: return APPLICATION_WORK_FORCE_MANAGEMENT;
      case 16: return APPLICATION_WORKFLOWS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Application>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Application> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Application>() {
          public Application findValueByNumber(int number) {
            return Application.forNumber(number);
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
    return com.tcn.cloud.api.annotations.perms.LicenseProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Application[] VALUES = values();

  public static Application valueOf(
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

  private Application(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:annotations.perms.Application)
}

