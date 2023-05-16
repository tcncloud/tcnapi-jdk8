// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface OrganizationDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.OrganizationDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string billing_id = 1 [json_name = "billingId"];</code>
   * @return The billingId.
   */
  java.lang.String getBillingId();
  /**
   * <code>string billing_id = 1 [json_name = "billingId"];</code>
   * @return The bytes for billingId.
   */
  com.google.protobuf.ByteString
      getBillingIdBytes();

  /**
   * <code>.google.protobuf.Timestamp add_date = 5 [json_name = "addDate"];</code>
   * @return Whether the addDate field is set.
   */
  boolean hasAddDate();
  /**
   * <code>.google.protobuf.Timestamp add_date = 5 [json_name = "addDate"];</code>
   * @return The addDate.
   */
  com.google.protobuf.Timestamp getAddDate();
  /**
   * <code>.google.protobuf.Timestamp add_date = 5 [json_name = "addDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getAddDateOrBuilder();

  /**
   * <code>int64 client_sid = 7 [json_name = "clientSid"];</code>
   * @return The clientSid.
   */
  long getClientSid();

  /**
   * <code>string name = 8 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 8 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string org_id = 9 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 9 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string region_id = 10 [json_name = "regionId"];</code>
   * @return The regionId.
   */
  java.lang.String getRegionId();
  /**
   * <code>string region_id = 10 [json_name = "regionId"];</code>
   * @return The bytes for regionId.
   */
  com.google.protobuf.ByteString
      getRegionIdBytes();

  /**
   * <pre>
   * last_scheduled_date has three different states.
   * 1. the field is a valid timestamp
   * 2. the field is a zero value timestamp. This
   *    means the organization is in the current region
   *    but does not have a last scheduled date.
   * 3. the field is nil. This means the organization
   *    does not belong to the current region.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_scheduled_date = 11 [json_name = "lastScheduledDate"];</code>
   * @return Whether the lastScheduledDate field is set.
   */
  boolean hasLastScheduledDate();
  /**
   * <pre>
   * last_scheduled_date has three different states.
   * 1. the field is a valid timestamp
   * 2. the field is a zero value timestamp. This
   *    means the organization is in the current region
   *    but does not have a last scheduled date.
   * 3. the field is nil. This means the organization
   *    does not belong to the current region.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_scheduled_date = 11 [json_name = "lastScheduledDate"];</code>
   * @return The lastScheduledDate.
   */
  com.google.protobuf.Timestamp getLastScheduledDate();
  /**
   * <pre>
   * last_scheduled_date has three different states.
   * 1. the field is a valid timestamp
   * 2. the field is a zero value timestamp. This
   *    means the organization is in the current region
   *    but does not have a last scheduled date.
   * 3. the field is nil. This means the organization
   *    does not belong to the current region.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_scheduled_date = 11 [json_name = "lastScheduledDate"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastScheduledDateOrBuilder();
}
