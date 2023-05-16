// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ComplianceExportProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ComplianceExportProcess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string list_name = 2 [json_name = "listName"];</code>
   * @return The listName.
   */
  java.lang.String getListName();
  /**
   * <code>string list_name = 2 [json_name = "listName"];</code>
   * @return The bytes for listName.
   */
  com.google.protobuf.ByteString
      getListNameBytes();

  /**
   * <code>string field = 3 [json_name = "field"];</code>
   * @return The field.
   */
  java.lang.String getField();
  /**
   * <code>string field = 3 [json_name = "field"];</code>
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString
      getFieldBytes();

  /**
   * <pre>
   * Optional, has to be type date
   * </pre>
   *
   * <code>string expiration_field = 4 [json_name = "expirationField"];</code>
   * @return The expirationField.
   */
  java.lang.String getExpirationField();
  /**
   * <pre>
   * Optional, has to be type date
   * </pre>
   *
   * <code>string expiration_field = 4 [json_name = "expirationField"];</code>
   * @return The bytes for expirationField.
   */
  com.google.protobuf.ByteString
      getExpirationFieldBytes();

  /**
   * <pre>
   * Optional, only needed with phone/sms
   * </pre>
   *
   * <code>string country_code = 5 [json_name = "countryCode"];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Optional, only needed with phone/sms
   * </pre>
   *
   * <code>string country_code = 5 [json_name = "countryCode"];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <code>.api.commons.RunType run_type = 6 [json_name = "runType"];</code>
   * @return The enum numeric value on the wire for runType.
   */
  int getRunTypeValue();
  /**
   * <code>.api.commons.RunType run_type = 6 [json_name = "runType"];</code>
   * @return The runType.
   */
  com.tcn.cloud.api.api.commons.RunType getRunType();

  /**
   * <code>.api.commons.ComplianceListType compliance_list_type = 7 [json_name = "complianceListType"];</code>
   * @return The enum numeric value on the wire for complianceListType.
   */
  int getComplianceListTypeValue();
  /**
   * <code>.api.commons.ComplianceListType compliance_list_type = 7 [json_name = "complianceListType"];</code>
   * @return The complianceListType.
   */
  com.tcn.cloud.api.api.commons.ComplianceListType getComplianceListType();
}
