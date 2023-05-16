// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface ContactPreferencesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.ContactPreferences)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DefaultContactImportFormat sets the DefaultContactImportFormat oneof
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ImportFormat default_contact_import_format = 10 [json_name = "defaultContactImportFormat"];</code>
   * @return Whether the defaultContactImportFormat field is set.
   */
  boolean hasDefaultContactImportFormat();
  /**
   * <pre>
   * DefaultContactImportFormat sets the DefaultContactImportFormat oneof
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ImportFormat default_contact_import_format = 10 [json_name = "defaultContactImportFormat"];</code>
   * @return The defaultContactImportFormat.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ImportFormat getDefaultContactImportFormat();
  /**
   * <pre>
   * DefaultContactImportFormat sets the DefaultContactImportFormat oneof
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ImportFormat default_contact_import_format = 10 [json_name = "defaultContactImportFormat"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ImportFormatOrBuilder getDefaultContactImportFormatOrBuilder();

  /**
   * <pre>
   * UseContactImportFormat controls whether the default import format is enabled
   * </pre>
   *
   * <code>bool use_contact_import_format = 11 [json_name = "useContactImportFormat"];</code>
   * @return The useContactImportFormat.
   */
  boolean getUseContactImportFormat();

  /**
   * <pre>
   * DefaultContactAreaCode sets the DefaultContactAreaCodeOor oneof
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ContactAreaCode default_contact_area_code = 12 [json_name = "defaultContactAreaCode"];</code>
   * @return Whether the defaultContactAreaCode field is set.
   */
  boolean hasDefaultContactAreaCode();
  /**
   * <pre>
   * DefaultContactAreaCode sets the DefaultContactAreaCodeOor oneof
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ContactAreaCode default_contact_area_code = 12 [json_name = "defaultContactAreaCode"];</code>
   * @return The defaultContactAreaCode.
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactAreaCode getDefaultContactAreaCode();
  /**
   * <pre>
   * DefaultContactAreaCode sets the DefaultContactAreaCodeOor oneof
   * </pre>
   *
   * <code>.api.v1alpha1.org.legacy.ContactAreaCode default_contact_area_code = 12 [json_name = "defaultContactAreaCode"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.ContactAreaCodeOrBuilder getDefaultContactAreaCodeOrBuilder();

  /**
   * <pre>
   * UseContactAreaCode controls whether the default area code is enabled
   * </pre>
   *
   * <code>bool use_contact_area_code = 16 [json_name = "useContactAreaCode"];</code>
   * @return The useContactAreaCode.
   */
  boolean getUseContactAreaCode();

  /**
   * <pre>
   * DefaultAbsentNumbersHandling False: Keep Record, True: Discard Record
   * </pre>
   *
   * <code>bool discard_record_default_absent_numbers_handling = 13 [json_name = "discardRecordDefaultAbsentNumbersHandling"];</code>
   * @return The discardRecordDefaultAbsentNumbersHandling.
   */
  boolean getDiscardRecordDefaultAbsentNumbersHandling();

  /**
   * <pre>
   * ContactsImportRandomization if true randomize the imported contact list default false
   * </pre>
   *
   * <code>bool default_contacts_import_randomization = 14 [json_name = "defaultContactsImportRandomization"];</code>
   * @return The defaultContactsImportRandomization.
   */
  boolean getDefaultContactsImportRandomization();

  /**
   * <pre>
   * DefaultEmailColumn sets the DefaultEmailColumn oneof
   * </pre>
   *
   * <code>string default_email_column = 15 [json_name = "defaultEmailColumn"];</code>
   * @return The defaultEmailColumn.
   */
  java.lang.String getDefaultEmailColumn();
  /**
   * <pre>
   * DefaultEmailColumn sets the DefaultEmailColumn oneof
   * </pre>
   *
   * <code>string default_email_column = 15 [json_name = "defaultEmailColumn"];</code>
   * @return The bytes for defaultEmailColumn.
   */
  com.google.protobuf.ByteString
      getDefaultEmailColumnBytes();

  /**
   * <pre>
   * DefaultDuplicateHandling sets a string choice for duplicate numbers
   * </pre>
   *
   * <code>.api.commons.DefaultDuplicateHandling default_duplicate_handling = 17 [json_name = "defaultDuplicateHandling"];</code>
   * @return The enum numeric value on the wire for defaultDuplicateHandling.
   */
  int getDefaultDuplicateHandlingValue();
  /**
   * <pre>
   * DefaultDuplicateHandling sets a string choice for duplicate numbers
   * </pre>
   *
   * <code>.api.commons.DefaultDuplicateHandling default_duplicate_handling = 17 [json_name = "defaultDuplicateHandling"];</code>
   * @return The defaultDuplicateHandling.
   */
  com.tcn.cloud.api.api.commons.DefaultDuplicateHandling getDefaultDuplicateHandling();
}
