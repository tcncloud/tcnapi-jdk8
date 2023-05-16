// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/wfm.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Enum representing the type of a diagnostic.
 * </pre>
 *
 * Protobuf enum {@code api.commons.DiagnosticCode}
 */
public enum DiagnosticCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The code type used when no other code is appropriate.
   * </pre>
   *
   * <code>GENERAL = 0;</code>
   */
  GENERAL(0),
  /**
   * <pre>
   * The diagnostic is reporting no errors found.
   * </pre>
   *
   * <code>OK = 1;</code>
   */
  OK(1),
  /**
   * <pre>
   * The diagnostic is reporting no skills in the dictionary.
   * </pre>
   *
   * <code>NO_SKILLS_IN_DICTIONARY = 2;</code>
   */
  NO_SKILLS_IN_DICTIONARY(2),
  /**
   * <pre>
   * The diagnostic is reporting a wfm agent with no skill proficiencies.
   * </pre>
   *
   * <code>AGENT_HAS_NO_SKILL_PROFICIENCIES = 3;</code>
   */
  AGENT_HAS_NO_SKILL_PROFICIENCIES(3),
  /**
   * <pre>
   * The diagnostic is reporting an agent with no skills.
   * </pre>
   *
   * <code>AGENT_HAS_NO_SKILLS = 4;</code>
   */
  AGENT_HAS_NO_SKILLS(4),
  /**
   * <pre>
   * The diagnostic is reporting the constraint rules don't have a scheduling activity.
   * </pre>
   *
   * <code>NO_SCHEDULING_ACTIVITIES_FOR_CONSTRAINT_RULES = 5;</code>
   */
  NO_SCHEDULING_ACTIVITIES_FOR_CONSTRAINT_RULES(5),
  /**
   * <pre>
   * The diagnostic is reporting a constraint rule pointing to a scheduling activity that cannot be found.
   * </pre>
   *
   * <code>SCHEDULING_ACTIVITY_FOR_CONSTRAINT_RULE_NOT_FOUND = 6;</code>
   */
  SCHEDULING_ACTIVITY_FOR_CONSTRAINT_RULE_NOT_FOUND(6),
  /**
   * <pre>
   * The diagnostic is reporting a NONE value for a shift template
   * </pre>
   *
   * <code>SHIFT_TEMPLATE_CANNOT_BE_NONE = 7;</code>
   */
  SHIFT_TEMPLATE_CANNOT_BE_NONE(7),
  /**
   * <pre>
   * The diagnostic is reporting a shift template with no member placement rules.
   * </pre>
   *
   * <code>SHIFT_TEMPLATE_HAS_NO_PLACEMENT_RULES = 8;</code>
   */
  SHIFT_TEMPLATE_HAS_NO_PLACEMENT_RULES(8),
  /**
   * <pre>
   * The diagnostic is reporting a shift template whose placement rules do not include an on-call placement.
   * </pre>
   *
   * <code>NO_ONCALL_IN_SHIFT_TEMPLATE_PLACEMENT_RULES = 9;</code>
   */
  NO_ONCALL_IN_SHIFT_TEMPLATE_PLACEMENT_RULES(9),
  /**
   * <pre>
   * The diagnostic is reporting the min duration for a shift templates placement rule being greater than the max duration.
   * </pre>
   *
   * <code>MIN_GT_MAX_DURATION_IN_SHIFT_TEMPLATE_PLACEMENT_RULES = 10;</code>
   */
  MIN_GT_MAX_DURATION_IN_SHIFT_TEMPLATE_PLACEMENT_RULES(10),
  /**
   * <pre>
   * The diagnostic is reporting a shift template with a min_agents value greater than it's max_agents value.
   * </pre>
   *
   * <code>MIN_GT_MAX_AGENTS_IN_SHIFT_TEMPLATE = 11;</code>
   */
  MIN_GT_MAX_AGENTS_IN_SHIFT_TEMPLATE(11),
  /**
   * <pre>
   * The diagnostic is reporting no placement rules as members of the shift template.
   * </pre>
   *
   * <code>NO_PLACEMENT_RULES_FOR_SHIFT_TEMPLATE = 12;</code>
   */
  NO_PLACEMENT_RULES_FOR_SHIFT_TEMPLATE(12),
  /**
   * <pre>
   * The diagnostic is reporting that the activities are too short for the shift.
   * </pre>
   *
   * <code>ACTIVITIES_SHORTER_THAN_SHIFT = 13;</code>
   */
  ACTIVITIES_SHORTER_THAN_SHIFT(13),
  /**
   * <pre>
   * The diagnostic is reporting that a shift doesn't have a sufficient number of agents available.
   * </pre>
   *
   * <code>NOT_ENOUGH_AGENTS_FOR_SHIFT = 14;</code>
   */
  NOT_ENOUGH_AGENTS_FOR_SHIFT(14),
  /**
   * <pre>
   * The diagnostic is reporting that a program node has no member agent groups.
   * </pre>
   *
   * <code>PROGRAM_HAS_NO_AGENT_GROUPS = 15;</code>
   */
  PROGRAM_HAS_NO_AGENT_GROUPS(15),
  /**
   * <pre>
   * The diagnostic is reporting that a program node has no member shift templates.
   * </pre>
   *
   * <code>PROGRAM_HAS_NO_SHIFT_TEMPLATES = 16;</code>
   */
  PROGRAM_HAS_NO_SHIFT_TEMPLATES(16),
  /**
   * <pre>
   * The diagnostic is reporting that a location node has no member program nodes.
   * </pre>
   *
   * <code>LOCATION_HAS_NO_PROGRAMS = 17;</code>
   */
  LOCATION_HAS_NO_PROGRAMS(17),
  /**
   * <pre>
   * The diagnostic is reporting that a client node has no member location nodes.
   * </pre>
   *
   * <code>CLIENT_HAS_NO_LOCATIONS = 18;</code>
   */
  CLIENT_HAS_NO_LOCATIONS(18),
  /**
   * <pre>
   * The diagnostic is reporting that a call center node has no member client nodes
   * </pre>
   *
   * <code>CALL_CENTER_HAS_NO_CLIENTS = 19;</code>
   */
  CALL_CENTER_HAS_NO_CLIENTS(19),
  /**
   * <pre>
   * The diagnostic is reporting that a program node has an invalid parent location node.
   * </pre>
   *
   * <code>PROGRAM_HAS_INVALID_PARENT_LOCATION = 20;</code>
   */
  PROGRAM_HAS_INVALID_PARENT_LOCATION(20),
  /**
   * <pre>
   * The diagnostic is reporting that a location node has an invalid parent client node.
   * </pre>
   *
   * <code>LOCATION_HAS_INVALID_PARENT_CLIENT = 21;</code>
   */
  LOCATION_HAS_INVALID_PARENT_CLIENT(21),
  /**
   * <pre>
   * The diagnostic is reporting that a client node has an invalid parent call center.
   * </pre>
   *
   * <code>CLIENT_HAS_INVALID_PARENT_CALL_CENTER = 22;</code>
   */
  CLIENT_HAS_INVALID_PARENT_CALL_CENTER(22),
  /**
   * <pre>
   * The diagnostic is reporting that an agent group has an invalid parent node.
   * </pre>
   *
   * <code>AGENT_GROUP_HAS_INVALID_PARENT_NODE = 23;</code>
   */
  AGENT_GROUP_HAS_INVALID_PARENT_NODE(23),
  /**
   * <pre>
   * The diagnostic is reporting an invalid parent program for a shift template.
   * </pre>
   *
   * <code>SHIFT_TEMPLATE_HAS_INVALID_PARENT_PROGRAM = 24;</code>
   */
  SHIFT_TEMPLATE_HAS_INVALID_PARENT_PROGRAM(24),
  /**
   * <pre>
   * The diagnostic is reporting a constraint rule pointing to a missing skill proficiency.
   * </pre>
   *
   * <code>NO_SKILL_PROFICIENCY_FOR_MIN_SKILL_PROFICIENCY_CONSTRAINT_RULE = 25;</code>
   */
  NO_SKILL_PROFICIENCY_FOR_MIN_SKILL_PROFICIENCY_CONSTRAINT_RULE(25),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The code type used when no other code is appropriate.
   * </pre>
   *
   * <code>GENERAL = 0;</code>
   */
  public static final int GENERAL_VALUE = 0;
  /**
   * <pre>
   * The diagnostic is reporting no errors found.
   * </pre>
   *
   * <code>OK = 1;</code>
   */
  public static final int OK_VALUE = 1;
  /**
   * <pre>
   * The diagnostic is reporting no skills in the dictionary.
   * </pre>
   *
   * <code>NO_SKILLS_IN_DICTIONARY = 2;</code>
   */
  public static final int NO_SKILLS_IN_DICTIONARY_VALUE = 2;
  /**
   * <pre>
   * The diagnostic is reporting a wfm agent with no skill proficiencies.
   * </pre>
   *
   * <code>AGENT_HAS_NO_SKILL_PROFICIENCIES = 3;</code>
   */
  public static final int AGENT_HAS_NO_SKILL_PROFICIENCIES_VALUE = 3;
  /**
   * <pre>
   * The diagnostic is reporting an agent with no skills.
   * </pre>
   *
   * <code>AGENT_HAS_NO_SKILLS = 4;</code>
   */
  public static final int AGENT_HAS_NO_SKILLS_VALUE = 4;
  /**
   * <pre>
   * The diagnostic is reporting the constraint rules don't have a scheduling activity.
   * </pre>
   *
   * <code>NO_SCHEDULING_ACTIVITIES_FOR_CONSTRAINT_RULES = 5;</code>
   */
  public static final int NO_SCHEDULING_ACTIVITIES_FOR_CONSTRAINT_RULES_VALUE = 5;
  /**
   * <pre>
   * The diagnostic is reporting a constraint rule pointing to a scheduling activity that cannot be found.
   * </pre>
   *
   * <code>SCHEDULING_ACTIVITY_FOR_CONSTRAINT_RULE_NOT_FOUND = 6;</code>
   */
  public static final int SCHEDULING_ACTIVITY_FOR_CONSTRAINT_RULE_NOT_FOUND_VALUE = 6;
  /**
   * <pre>
   * The diagnostic is reporting a NONE value for a shift template
   * </pre>
   *
   * <code>SHIFT_TEMPLATE_CANNOT_BE_NONE = 7;</code>
   */
  public static final int SHIFT_TEMPLATE_CANNOT_BE_NONE_VALUE = 7;
  /**
   * <pre>
   * The diagnostic is reporting a shift template with no member placement rules.
   * </pre>
   *
   * <code>SHIFT_TEMPLATE_HAS_NO_PLACEMENT_RULES = 8;</code>
   */
  public static final int SHIFT_TEMPLATE_HAS_NO_PLACEMENT_RULES_VALUE = 8;
  /**
   * <pre>
   * The diagnostic is reporting a shift template whose placement rules do not include an on-call placement.
   * </pre>
   *
   * <code>NO_ONCALL_IN_SHIFT_TEMPLATE_PLACEMENT_RULES = 9;</code>
   */
  public static final int NO_ONCALL_IN_SHIFT_TEMPLATE_PLACEMENT_RULES_VALUE = 9;
  /**
   * <pre>
   * The diagnostic is reporting the min duration for a shift templates placement rule being greater than the max duration.
   * </pre>
   *
   * <code>MIN_GT_MAX_DURATION_IN_SHIFT_TEMPLATE_PLACEMENT_RULES = 10;</code>
   */
  public static final int MIN_GT_MAX_DURATION_IN_SHIFT_TEMPLATE_PLACEMENT_RULES_VALUE = 10;
  /**
   * <pre>
   * The diagnostic is reporting a shift template with a min_agents value greater than it's max_agents value.
   * </pre>
   *
   * <code>MIN_GT_MAX_AGENTS_IN_SHIFT_TEMPLATE = 11;</code>
   */
  public static final int MIN_GT_MAX_AGENTS_IN_SHIFT_TEMPLATE_VALUE = 11;
  /**
   * <pre>
   * The diagnostic is reporting no placement rules as members of the shift template.
   * </pre>
   *
   * <code>NO_PLACEMENT_RULES_FOR_SHIFT_TEMPLATE = 12;</code>
   */
  public static final int NO_PLACEMENT_RULES_FOR_SHIFT_TEMPLATE_VALUE = 12;
  /**
   * <pre>
   * The diagnostic is reporting that the activities are too short for the shift.
   * </pre>
   *
   * <code>ACTIVITIES_SHORTER_THAN_SHIFT = 13;</code>
   */
  public static final int ACTIVITIES_SHORTER_THAN_SHIFT_VALUE = 13;
  /**
   * <pre>
   * The diagnostic is reporting that a shift doesn't have a sufficient number of agents available.
   * </pre>
   *
   * <code>NOT_ENOUGH_AGENTS_FOR_SHIFT = 14;</code>
   */
  public static final int NOT_ENOUGH_AGENTS_FOR_SHIFT_VALUE = 14;
  /**
   * <pre>
   * The diagnostic is reporting that a program node has no member agent groups.
   * </pre>
   *
   * <code>PROGRAM_HAS_NO_AGENT_GROUPS = 15;</code>
   */
  public static final int PROGRAM_HAS_NO_AGENT_GROUPS_VALUE = 15;
  /**
   * <pre>
   * The diagnostic is reporting that a program node has no member shift templates.
   * </pre>
   *
   * <code>PROGRAM_HAS_NO_SHIFT_TEMPLATES = 16;</code>
   */
  public static final int PROGRAM_HAS_NO_SHIFT_TEMPLATES_VALUE = 16;
  /**
   * <pre>
   * The diagnostic is reporting that a location node has no member program nodes.
   * </pre>
   *
   * <code>LOCATION_HAS_NO_PROGRAMS = 17;</code>
   */
  public static final int LOCATION_HAS_NO_PROGRAMS_VALUE = 17;
  /**
   * <pre>
   * The diagnostic is reporting that a client node has no member location nodes.
   * </pre>
   *
   * <code>CLIENT_HAS_NO_LOCATIONS = 18;</code>
   */
  public static final int CLIENT_HAS_NO_LOCATIONS_VALUE = 18;
  /**
   * <pre>
   * The diagnostic is reporting that a call center node has no member client nodes
   * </pre>
   *
   * <code>CALL_CENTER_HAS_NO_CLIENTS = 19;</code>
   */
  public static final int CALL_CENTER_HAS_NO_CLIENTS_VALUE = 19;
  /**
   * <pre>
   * The diagnostic is reporting that a program node has an invalid parent location node.
   * </pre>
   *
   * <code>PROGRAM_HAS_INVALID_PARENT_LOCATION = 20;</code>
   */
  public static final int PROGRAM_HAS_INVALID_PARENT_LOCATION_VALUE = 20;
  /**
   * <pre>
   * The diagnostic is reporting that a location node has an invalid parent client node.
   * </pre>
   *
   * <code>LOCATION_HAS_INVALID_PARENT_CLIENT = 21;</code>
   */
  public static final int LOCATION_HAS_INVALID_PARENT_CLIENT_VALUE = 21;
  /**
   * <pre>
   * The diagnostic is reporting that a client node has an invalid parent call center.
   * </pre>
   *
   * <code>CLIENT_HAS_INVALID_PARENT_CALL_CENTER = 22;</code>
   */
  public static final int CLIENT_HAS_INVALID_PARENT_CALL_CENTER_VALUE = 22;
  /**
   * <pre>
   * The diagnostic is reporting that an agent group has an invalid parent node.
   * </pre>
   *
   * <code>AGENT_GROUP_HAS_INVALID_PARENT_NODE = 23;</code>
   */
  public static final int AGENT_GROUP_HAS_INVALID_PARENT_NODE_VALUE = 23;
  /**
   * <pre>
   * The diagnostic is reporting an invalid parent program for a shift template.
   * </pre>
   *
   * <code>SHIFT_TEMPLATE_HAS_INVALID_PARENT_PROGRAM = 24;</code>
   */
  public static final int SHIFT_TEMPLATE_HAS_INVALID_PARENT_PROGRAM_VALUE = 24;
  /**
   * <pre>
   * The diagnostic is reporting a constraint rule pointing to a missing skill proficiency.
   * </pre>
   *
   * <code>NO_SKILL_PROFICIENCY_FOR_MIN_SKILL_PROFICIENCY_CONSTRAINT_RULE = 25;</code>
   */
  public static final int NO_SKILL_PROFICIENCY_FOR_MIN_SKILL_PROFICIENCY_CONSTRAINT_RULE_VALUE = 25;


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
  public static DiagnosticCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DiagnosticCode forNumber(int value) {
    switch (value) {
      case 0: return GENERAL;
      case 1: return OK;
      case 2: return NO_SKILLS_IN_DICTIONARY;
      case 3: return AGENT_HAS_NO_SKILL_PROFICIENCIES;
      case 4: return AGENT_HAS_NO_SKILLS;
      case 5: return NO_SCHEDULING_ACTIVITIES_FOR_CONSTRAINT_RULES;
      case 6: return SCHEDULING_ACTIVITY_FOR_CONSTRAINT_RULE_NOT_FOUND;
      case 7: return SHIFT_TEMPLATE_CANNOT_BE_NONE;
      case 8: return SHIFT_TEMPLATE_HAS_NO_PLACEMENT_RULES;
      case 9: return NO_ONCALL_IN_SHIFT_TEMPLATE_PLACEMENT_RULES;
      case 10: return MIN_GT_MAX_DURATION_IN_SHIFT_TEMPLATE_PLACEMENT_RULES;
      case 11: return MIN_GT_MAX_AGENTS_IN_SHIFT_TEMPLATE;
      case 12: return NO_PLACEMENT_RULES_FOR_SHIFT_TEMPLATE;
      case 13: return ACTIVITIES_SHORTER_THAN_SHIFT;
      case 14: return NOT_ENOUGH_AGENTS_FOR_SHIFT;
      case 15: return PROGRAM_HAS_NO_AGENT_GROUPS;
      case 16: return PROGRAM_HAS_NO_SHIFT_TEMPLATES;
      case 17: return LOCATION_HAS_NO_PROGRAMS;
      case 18: return CLIENT_HAS_NO_LOCATIONS;
      case 19: return CALL_CENTER_HAS_NO_CLIENTS;
      case 20: return PROGRAM_HAS_INVALID_PARENT_LOCATION;
      case 21: return LOCATION_HAS_INVALID_PARENT_CLIENT;
      case 22: return CLIENT_HAS_INVALID_PARENT_CALL_CENTER;
      case 23: return AGENT_GROUP_HAS_INVALID_PARENT_NODE;
      case 24: return SHIFT_TEMPLATE_HAS_INVALID_PARENT_PROGRAM;
      case 25: return NO_SKILL_PROFICIENCY_FOR_MIN_SKILL_PROFICIENCY_CONSTRAINT_RULE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DiagnosticCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DiagnosticCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DiagnosticCode>() {
          public DiagnosticCode findValueByNumber(int number) {
            return DiagnosticCode.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.WfmProto.getDescriptor().getEnumTypes().get(11);
  }

  private static final DiagnosticCode[] VALUES = values();

  public static DiagnosticCode valueOf(
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

  private DiagnosticCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.DiagnosticCode)
}

