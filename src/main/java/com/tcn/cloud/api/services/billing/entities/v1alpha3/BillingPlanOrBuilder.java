// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha3/plan.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha3;

public interface BillingPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha3.BillingPlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
   * @return The billingPlanId.
   */
  java.lang.String getBillingPlanId();
  /**
   * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
   * @return The bytes for billingPlanId.
   */
  com.google.protobuf.ByteString
      getBillingPlanIdBytes();

  /**
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>.services.billing.entities.v1alpha3.BillingPlanType type = 3 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.services.billing.entities.v1alpha3.BillingPlanType type = 3 [json_name = "type"];</code>
   * @return The type.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha3.BillingPlanType getType();

  /**
   * <code>bool is_draft = 4 [json_name = "isDraft"];</code>
   * @return The isDraft.
   */
  boolean getIsDraft();

  /**
   * <code>.google.protobuf.Timestamp start_time = 5 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 5 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 5 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp create_time = 6 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 6 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 6 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp update_time = 7 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 7 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 7 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp delete_time = 8 [json_name = "deleteTime"];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <code>.google.protobuf.Timestamp delete_time = 8 [json_name = "deleteTime"];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <code>.google.protobuf.Timestamp delete_time = 8 [json_name = "deleteTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <code>string user_id = 9 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 9 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();
}