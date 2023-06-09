// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>string region_id = 3 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  java.lang.String getRegionId();
  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>string region_id = 3 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  com.google.protobuf.ByteString
      getRegionIdBytes();

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
   * legacy keys
   * </pre>
   *
   * <code>int64 login_sid = 10 [json_name = "loginSid"];</code>
   * @return The loginSid.
   */
  long getLoginSid();

  /**
   * <pre>
   * deprecated
   * </pre>
   *
   * <code>int64 agent_sid = 14 [json_name = "agentSid"];</code>
   * @return The agentSid.
   */
  long getAgentSid();

  /**
   * <code>repeated string regions = 103 [json_name = "regions"];</code>
   * @return A list containing the regions.
   */
  java.util.List<java.lang.String>
      getRegionsList();
  /**
   * <code>repeated string regions = 103 [json_name = "regions"];</code>
   * @return The count of regions.
   */
  int getRegionsCount();
  /**
   * <code>repeated string regions = 103 [json_name = "regions"];</code>
   * @param index The index of the element to return.
   * @return The regions at the given index.
   */
  java.lang.String getRegions(int index);
  /**
   * <code>repeated string regions = 103 [json_name = "regions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the regions at the given index.
   */
  com.google.protobuf.ByteString
      getRegionsBytes(int index);

  /**
   * <code>string email = 104 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 104 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated string caller_ids = 115 [json_name = "callerIds"];</code>
   * @return A list containing the callerIds.
   */
  java.util.List<java.lang.String>
      getCallerIdsList();
  /**
   * <code>repeated string caller_ids = 115 [json_name = "callerIds"];</code>
   * @return The count of callerIds.
   */
  int getCallerIdsCount();
  /**
   * <code>repeated string caller_ids = 115 [json_name = "callerIds"];</code>
   * @param index The index of the element to return.
   * @return The callerIds at the given index.
   */
  java.lang.String getCallerIds(int index);
  /**
   * <code>repeated string caller_ids = 115 [json_name = "callerIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the callerIds at the given index.
   */
  com.google.protobuf.ByteString
      getCallerIdsBytes(int index);

  /**
   * <code>repeated string linkback_numbers = 116 [json_name = "linkbackNumbers"];</code>
   * @return A list containing the linkbackNumbers.
   */
  java.util.List<java.lang.String>
      getLinkbackNumbersList();
  /**
   * <code>repeated string linkback_numbers = 116 [json_name = "linkbackNumbers"];</code>
   * @return The count of linkbackNumbers.
   */
  int getLinkbackNumbersCount();
  /**
   * <code>repeated string linkback_numbers = 116 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the element to return.
   * @return The linkbackNumbers at the given index.
   */
  java.lang.String getLinkbackNumbers(int index);
  /**
   * <code>repeated string linkback_numbers = 116 [json_name = "linkbackNumbers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the linkbackNumbers at the given index.
   */
  com.google.protobuf.ByteString
      getLinkbackNumbersBytes(int index);

  /**
   * <pre>
   * string default_app = 126;
   * </pre>
   *
   * <code>string user_name = 120 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <pre>
   * string default_app = 126;
   * </pre>
   *
   * <code>string user_name = 120 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string first_name = 127 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 127 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 128 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 128 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>.google.protobuf.Timestamp created = 163 [json_name = "created"];</code>
   * @return Whether the created field is set.
   */
  boolean hasCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 163 [json_name = "created"];</code>
   * @return The created.
   */
  com.google.protobuf.Timestamp getCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 163 [json_name = "created"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp last_updated = 164 [json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 164 [json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 164 [json_name = "lastUpdated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();

  /**
   * <code>bool password_reset_required = 165 [json_name = "passwordResetRequired"];</code>
   * @return The passwordResetRequired.
   */
  boolean getPasswordResetRequired();

  /**
   * <pre>
   * connection id is the id of the auth connection that the
   * user is coming from if it is a delgated user. If the user
   * is not delgated this will be nil.
   * </pre>
   *
   * <code>.google.protobuf.StringValue connection_id = 166 [json_name = "connectionId"];</code>
   * @return Whether the connectionId field is set.
   */
  boolean hasConnectionId();
  /**
   * <pre>
   * connection id is the id of the auth connection that the
   * user is coming from if it is a delgated user. If the user
   * is not delgated this will be nil.
   * </pre>
   *
   * <code>.google.protobuf.StringValue connection_id = 166 [json_name = "connectionId"];</code>
   * @return The connectionId.
   */
  com.google.protobuf.StringValue getConnectionId();
  /**
   * <pre>
   * connection id is the id of the auth connection that the
   * user is coming from if it is a delgated user. If the user
   * is not delgated this will be nil.
   * </pre>
   *
   * <code>.google.protobuf.StringValue connection_id = 166 [json_name = "connectionId"];</code>
   */
  com.google.protobuf.StringValueOrBuilder getConnectionIdOrBuilder();

  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 167 [json_name = "timeZoneOverride"];</code>
   * @return Whether the timeZoneOverride field is set.
   */
  boolean hasTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 167 [json_name = "timeZoneOverride"];</code>
   * @return The timeZoneOverride.
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapper getTimeZoneOverride();
  /**
   * <pre>
   * User TimeZone with wrapper for nullable timezone
   * </pre>
   *
   * <code>.api.commons.TimeZoneWrapper time_zone_override = 167 [json_name = "timeZoneOverride"];</code>
   */
  com.tcn.cloud.api.api.commons.TimeZoneWrapperOrBuilder getTimeZoneOverrideOrBuilder();

  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.legacy.Label> 
      getLabelEntitiesList();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.Label getLabelEntities(int index);
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  int getLabelEntitiesCount();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.legacy.LabelOrBuilder> 
      getLabelEntitiesOrBuilderList();
  /**
   * <pre>
   * A list of labels assigned to the user
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.legacy.Label label_entities = 171 [json_name = "labelEntities"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.legacy.LabelOrBuilder getLabelEntitiesOrBuilder(
      int index);
}
