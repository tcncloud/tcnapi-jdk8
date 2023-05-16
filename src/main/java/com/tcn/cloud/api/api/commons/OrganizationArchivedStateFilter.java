// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * Facilitate organization filtering on archived state
 * </pre>
 *
 * Protobuf enum {@code api.commons.OrganizationArchivedStateFilter}
 */
public enum OrganizationArchivedStateFilter
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Filter to only unarchived
   * </pre>
   *
   * <code>ORGANIZATION_ARCHIVED_STATE_FILTER_UNARCHIVED = 0;</code>
   */
  ORGANIZATION_ARCHIVED_STATE_FILTER_UNARCHIVED(0),
  /**
   * <pre>
   * Filter to only archived
   * </pre>
   *
   * <code>ORGANIZATION_ARCHIVED_STATE_FILTER_ARCHIVED = 1;</code>
   */
  ORGANIZATION_ARCHIVED_STATE_FILTER_ARCHIVED(1),
  /**
   * <pre>
   * Do not filter
   * </pre>
   *
   * <code>ORGANIZATION_ARCHIVED_STATE_FILTER_ALL = 2;</code>
   */
  ORGANIZATION_ARCHIVED_STATE_FILTER_ALL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Filter to only unarchived
   * </pre>
   *
   * <code>ORGANIZATION_ARCHIVED_STATE_FILTER_UNARCHIVED = 0;</code>
   */
  public static final int ORGANIZATION_ARCHIVED_STATE_FILTER_UNARCHIVED_VALUE = 0;
  /**
   * <pre>
   * Filter to only archived
   * </pre>
   *
   * <code>ORGANIZATION_ARCHIVED_STATE_FILTER_ARCHIVED = 1;</code>
   */
  public static final int ORGANIZATION_ARCHIVED_STATE_FILTER_ARCHIVED_VALUE = 1;
  /**
   * <pre>
   * Do not filter
   * </pre>
   *
   * <code>ORGANIZATION_ARCHIVED_STATE_FILTER_ALL = 2;</code>
   */
  public static final int ORGANIZATION_ARCHIVED_STATE_FILTER_ALL_VALUE = 2;


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
  public static OrganizationArchivedStateFilter valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OrganizationArchivedStateFilter forNumber(int value) {
    switch (value) {
      case 0: return ORGANIZATION_ARCHIVED_STATE_FILTER_UNARCHIVED;
      case 1: return ORGANIZATION_ARCHIVED_STATE_FILTER_ARCHIVED;
      case 2: return ORGANIZATION_ARCHIVED_STATE_FILTER_ALL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrganizationArchivedStateFilter>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrganizationArchivedStateFilter> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrganizationArchivedStateFilter>() {
          public OrganizationArchivedStateFilter findValueByNumber(int number) {
            return OrganizationArchivedStateFilter.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.OrgProto.getDescriptor().getEnumTypes().get(41);
  }

  private static final OrganizationArchivedStateFilter[] VALUES = values();

  public static OrganizationArchivedStateFilter valueOf(
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

  private OrganizationArchivedStateFilter(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.OrganizationArchivedStateFilter)
}

