// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha4/tags.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha4;

/**
 * Protobuf enum {@code services.billing.entities.v1alpha4.Category}
 */
public enum Category
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CATEGORY_UNSPECIFIED = 0;</code>
   */
  CATEGORY_UNSPECIFIED(0),
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_CHAT = 100;</code>
   */
  CATEGORY_COMMUNICATIONS_OMNI_CHAT(100),
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_EMAIL = 101;</code>
   */
  CATEGORY_COMMUNICATIONS_OMNI_EMAIL(101),
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_SMS = 102;</code>
   */
  CATEGORY_COMMUNICATIONS_OMNI_SMS(102),
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_AGENT = 103;</code>
   */
  CATEGORY_COMMUNICATIONS_OMNI_AGENT(103),
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_RESOURCES = 104;</code>
   */
  CATEGORY_COMMUNICATIONS_OMNI_RESOURCES(104),
  /**
   * <code>CATEGORY_DATA_MANAGEMENT_COMPLIANCE_COMPLIANCE = 200;</code>
   */
  CATEGORY_DATA_MANAGEMENT_COMPLIANCE_COMPLIANCE(200),
  /**
   * <code>CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_VOICE_ANALYTICS = 300;</code>
   */
  CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_VOICE_ANALYTICS(300),
  /**
   * <code>CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_AI_BUNDLE = 400;</code>
   */
  CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_AI_BUNDLE(400),
  /**
   * <code>CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_MANAGEMENT_SCHEDULER = 500;</code>
   */
  CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_MANAGEMENT_SCHEDULER(500),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_CHAT = 100;</code>
   */
  public static final int CATEGORY_COMMUNICATIONS_OMNI_CHAT_VALUE = 100;
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_EMAIL = 101;</code>
   */
  public static final int CATEGORY_COMMUNICATIONS_OMNI_EMAIL_VALUE = 101;
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_SMS = 102;</code>
   */
  public static final int CATEGORY_COMMUNICATIONS_OMNI_SMS_VALUE = 102;
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_AGENT = 103;</code>
   */
  public static final int CATEGORY_COMMUNICATIONS_OMNI_AGENT_VALUE = 103;
  /**
   * <code>CATEGORY_COMMUNICATIONS_OMNI_RESOURCES = 104;</code>
   */
  public static final int CATEGORY_COMMUNICATIONS_OMNI_RESOURCES_VALUE = 104;
  /**
   * <code>CATEGORY_DATA_MANAGEMENT_COMPLIANCE_COMPLIANCE = 200;</code>
   */
  public static final int CATEGORY_DATA_MANAGEMENT_COMPLIANCE_COMPLIANCE_VALUE = 200;
  /**
   * <code>CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_VOICE_ANALYTICS = 300;</code>
   */
  public static final int CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_VOICE_ANALYTICS_VALUE = 300;
  /**
   * <code>CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_AI_BUNDLE = 400;</code>
   */
  public static final int CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_AI_BUNDLE_VALUE = 400;
  /**
   * <code>CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_MANAGEMENT_SCHEDULER = 500;</code>
   */
  public static final int CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_MANAGEMENT_SCHEDULER_VALUE = 500;


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
  public static Category valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Category forNumber(int value) {
    switch (value) {
      case 0: return CATEGORY_UNSPECIFIED;
      case 100: return CATEGORY_COMMUNICATIONS_OMNI_CHAT;
      case 101: return CATEGORY_COMMUNICATIONS_OMNI_EMAIL;
      case 102: return CATEGORY_COMMUNICATIONS_OMNI_SMS;
      case 103: return CATEGORY_COMMUNICATIONS_OMNI_AGENT;
      case 104: return CATEGORY_COMMUNICATIONS_OMNI_RESOURCES;
      case 200: return CATEGORY_DATA_MANAGEMENT_COMPLIANCE_COMPLIANCE;
      case 300: return CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_VOICE_ANALYTICS;
      case 400: return CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_OPTIMIZATION_AI_BUNDLE;
      case 500: return CATEGORY_WORKFORCE_ENGAGEMENT_WORKFORCE_MANAGEMENT_SCHEDULER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Category>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Category> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Category>() {
          public Category findValueByNumber(int number) {
            return Category.forNumber(number);
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
    return com.tcn.cloud.api.services.billing.entities.v1alpha4.TagsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Category[] VALUES = values();

  public static Category valueOf(
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

  private Category(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.billing.entities.v1alpha4.Category)
}

