// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ProjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Project)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * project identifier
   * </pre>
   *
   * <code>int64 project_sid = 1 [json_name = "projectSid", jstype = JS_STRING];</code>
   * @return The projectSid.
   */
  long getProjectSid();

  /**
   * <pre>
   * project name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * project name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * project description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * project description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * project status
   * </pre>
   *
   * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * project status
   * </pre>
   *
   * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.api.commons.ProjectStatus getStatus();

  /**
   * <pre>
   * creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * compliance configuration
   * </pre>
   *
   * <code>.api.commons.OmniProjectComplianceConfig compliance_config = 6 [json_name = "complianceConfig"];</code>
   * @return Whether the complianceConfig field is set.
   */
  boolean hasComplianceConfig();
  /**
   * <pre>
   * compliance configuration
   * </pre>
   *
   * <code>.api.commons.OmniProjectComplianceConfig compliance_config = 6 [json_name = "complianceConfig"];</code>
   * @return The complianceConfig.
   */
  com.tcn.cloud.api.api.commons.OmniProjectComplianceConfig getComplianceConfig();
  /**
   * <pre>
   * compliance configuration
   * </pre>
   *
   * <code>.api.commons.OmniProjectComplianceConfig compliance_config = 6 [json_name = "complianceConfig"];</code>
   */
  com.tcn.cloud.api.api.commons.OmniProjectComplianceConfigOrBuilder getComplianceConfigOrBuilder();
}
