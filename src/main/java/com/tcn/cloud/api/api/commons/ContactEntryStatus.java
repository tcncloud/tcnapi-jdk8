// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/contactmanager.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.ContactEntryStatus}
 */
public enum ContactEntryStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *NEW
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_NEW = 0;</code>
   */
  CONTACT_ENTRY_STATUS_NEW(0),
  /**
   * <pre>
   *IN USE
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_INUSE = 1;</code>
   */
  CONTACT_ENTRY_STATUS_INUSE(1),
  /**
   * <pre>
   *NOT REF
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_NOTREF = 2;</code>
   */
  CONTACT_ENTRY_STATUS_NOTREF(2),
  /**
   * <pre>
   *DONE
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_DONE = 3;</code>
   */
  CONTACT_ENTRY_STATUS_DONE(3),
  /**
   * <pre>
   *EXPIRED
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_EXPIRED = 4;</code>
   */
  CONTACT_ENTRY_STATUS_EXPIRED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *NEW
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_NEW = 0;</code>
   */
  public static final int CONTACT_ENTRY_STATUS_NEW_VALUE = 0;
  /**
   * <pre>
   *IN USE
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_INUSE = 1;</code>
   */
  public static final int CONTACT_ENTRY_STATUS_INUSE_VALUE = 1;
  /**
   * <pre>
   *NOT REF
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_NOTREF = 2;</code>
   */
  public static final int CONTACT_ENTRY_STATUS_NOTREF_VALUE = 2;
  /**
   * <pre>
   *DONE
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_DONE = 3;</code>
   */
  public static final int CONTACT_ENTRY_STATUS_DONE_VALUE = 3;
  /**
   * <pre>
   *EXPIRED
   * </pre>
   *
   * <code>CONTACT_ENTRY_STATUS_EXPIRED = 4;</code>
   */
  public static final int CONTACT_ENTRY_STATUS_EXPIRED_VALUE = 4;


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
  public static ContactEntryStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContactEntryStatus forNumber(int value) {
    switch (value) {
      case 0: return CONTACT_ENTRY_STATUS_NEW;
      case 1: return CONTACT_ENTRY_STATUS_INUSE;
      case 2: return CONTACT_ENTRY_STATUS_NOTREF;
      case 3: return CONTACT_ENTRY_STATUS_DONE;
      case 4: return CONTACT_ENTRY_STATUS_EXPIRED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContactEntryStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ContactEntryStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ContactEntryStatus>() {
          public ContactEntryStatus findValueByNumber(int number) {
            return ContactEntryStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.ContactmanagerProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final ContactEntryStatus[] VALUES = values();

  public static ContactEntryStatus valueOf(
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

  private ContactEntryStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.ContactEntryStatus)
}

