// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/agent_training.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * LearningOpportunityStatus describes the status of the learning opportunity.
 * </pre>
 *
 * Protobuf enum {@code api.commons.LearningOpportunityStatus}
 */
public enum LearningOpportunityStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Default status - Ready to be completed by the agent.
   * </pre>
   *
   * <code>STATUS_OPEN = 0;</code>
   */
  STATUS_OPEN(0),
  /**
   * <pre>
   * Agent has completed the learning opportunity.
   * </pre>
   *
   * <code>STATUS_COMPLETED = 1;</code>
   */
  STATUS_COMPLETED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Default status - Ready to be completed by the agent.
   * </pre>
   *
   * <code>STATUS_OPEN = 0;</code>
   */
  public static final int STATUS_OPEN_VALUE = 0;
  /**
   * <pre>
   * Agent has completed the learning opportunity.
   * </pre>
   *
   * <code>STATUS_COMPLETED = 1;</code>
   */
  public static final int STATUS_COMPLETED_VALUE = 1;


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
  public static LearningOpportunityStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LearningOpportunityStatus forNumber(int value) {
    switch (value) {
      case 0: return STATUS_OPEN;
      case 1: return STATUS_COMPLETED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LearningOpportunityStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LearningOpportunityStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LearningOpportunityStatus>() {
          public LearningOpportunityStatus findValueByNumber(int number) {
            return LearningOpportunityStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.AgentTrainingProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final LearningOpportunityStatus[] VALUES = values();

  public static LearningOpportunityStatus valueOf(
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

  private LearningOpportunityStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.LearningOpportunityStatus)
}

