// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UpdateUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UpdateUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string first_name = 11 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 11 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 12 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 12 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string partner_agent_id = 4 [json_name = "partnerAgentId"];</code>
   * @return The partnerAgentId.
   */
  java.lang.String getPartnerAgentId();
  /**
   * <code>string partner_agent_id = 4 [json_name = "partnerAgentId"];</code>
   * @return The bytes for partnerAgentId.
   */
  com.google.protobuf.ByteString
      getPartnerAgentIdBytes();

  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 16 [json_name = "timeZoneOverride"];</code>
   * @return Whether the timeZoneOverride field is set.
   */
  boolean hasTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 16 [json_name = "timeZoneOverride"];</code>
   * @return The timeZoneOverride.
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapper getTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 16 [json_name = "timeZoneOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapperOrBuilder getTimeZoneOverrideOrBuilder();

  /**
   * <code>repeated string linkback_numbers = 6 [json_name = "linkbackNumbers"];</code>
   * @return A list containing the linkbackNumbers.
   */
  java.util.List<java.lang.String>
      getLinkbackNumbersList();
  /**
   * <code>repeated string linkback_numbers = 6 [json_name = "linkbackNumbers"];</code>
   * @return The count of linkbackNumbers.
   */
  int getLinkbackNumbersCount();
  /**
   * <code>repeated string linkback_numbers = 6 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the element to return.
   * @return The linkbackNumbers at the given index.
   */
  java.lang.String getLinkbackNumbers(int index);
  /**
   * <code>repeated string linkback_numbers = 6 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the linkbackNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getLinkbackNumbersBytes(int index);

  /**
   * <code>repeated string caller_ids = 7 [json_name = "callerIds"];</code>
   * @return A list containing the callerIds.
   */
  java.util.List<java.lang.String>
      getCallerIdsList();
  /**
   * <code>repeated string caller_ids = 7 [json_name = "callerIds"];</code>
   * @return The count of callerIds.
   */
  int getCallerIdsCount();
  /**
   * <code>repeated string caller_ids = 7 [json_name = "callerIds"];</code>
   * @param index The index of the element to return.
   * @return The callerIds at the given index.
   */
  java.lang.String getCallerIds(int index);
  /**
   * <code>repeated string caller_ids = 7 [json_name = "callerIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the callerIds at the given index.
   */
  com.google.protobuf.ByteString
      getCallerIdsBytes(int index);

  /**
   * <code>string user_name = 8 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 8 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <pre>
   * Default app the user starts on
   * </pre>
   *
   * <code>.api.commons.OperatorApplications default_app = 9 [json_name = "defaultApp"];</code>
   * @return The enum numeric value on the wire for defaultApp.
   */
  int getDefaultAppValue();
  /**
   * <pre>
   * Default app the user starts on
   * </pre>
   *
   * <code>.api.commons.OperatorApplications default_app = 9 [json_name = "defaultApp"];</code>
   * @return The defaultApp.
   */
  com.tcn.cloud.api.api.commons.OperatorApplications getDefaultApp();

  /**
   * <pre>
   * DEPRECATED: user_caller_id was previously optional,
   * if user_caller_id needs to be provided, use UpdateUserCallerId rpc
   * </pre>
   *
   * <code>string user_caller_id = 10 [json_name = "userCallerId", deprecated = true];</code>
   * @deprecated api.v0alpha.UpdateUserRequest.user_caller_id is deprecated.
   *     See api/v0alpha/org.proto;l=3296
   * @return The userCallerId.
   */
  @java.lang.Deprecated java.lang.String getUserCallerId();
  /**
   * <pre>
   * DEPRECATED: user_caller_id was previously optional,
   * if user_caller_id needs to be provided, use UpdateUserCallerId rpc
   * </pre>
   *
   * <code>string user_caller_id = 10 [json_name = "userCallerId", deprecated = true];</code>
   * @deprecated api.v0alpha.UpdateUserRequest.user_caller_id is deprecated.
   *     See api/v0alpha/org.proto;l=3296
   * @return The bytes for userCallerId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getUserCallerIdBytes();

  /**
   * <code>bool password_reset_required = 13 [json_name = "passwordResetRequired"];</code>
   * @return The passwordResetRequired.
   */
  boolean getPasswordResetRequired();

  /**
   * <code>string agent_profile_group_id = 14 [json_name = "agentProfileGroupId"];</code>
   * @return The agentProfileGroupId.
   */
  java.lang.String getAgentProfileGroupId();
  /**
   * <code>string agent_profile_group_id = 14 [json_name = "agentProfileGroupId"];</code>
   * @return The bytes for agentProfileGroupId.
   */
  com.google.protobuf.ByteString
      getAgentProfileGroupIdBytes();

  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 18 [json_name = "labelEntities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Label> 
      getLabelEntitiesList();
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 18 [json_name = "labelEntities"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Label getLabelEntities(int index);
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 18 [json_name = "labelEntities"];</code>
   */
  int getLabelEntitiesCount();
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 18 [json_name = "labelEntities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.LabelOrBuilder> 
      getLabelEntitiesOrBuilderList();
  /**
   * <pre>
   * A list of labels to assign to the user
   * </pre>
   *
   * <code>repeated .api.v0alpha.Label label_entities = 18 [json_name = "labelEntities"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.LabelOrBuilder getLabelEntitiesOrBuilder(
      int index);

  /**
   * <pre>
   * The users email
   * </pre>
   *
   * <code>string email = 17 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * The users email
   * </pre>
   *
   * <code>string email = 17 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <pre>
   * List of all fields being updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * List of all fields being updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * List of all fields being updated
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 100 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();
}
