// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha1/plan.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha1;

public interface BillingPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha1.BillingPlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the billing plan identifier
   * </pre>
   *
   * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
   * @return The billingPlanId.
   */
  java.lang.String getBillingPlanId();
  /**
   * <pre>
   * the billing plan identifier
   * </pre>
   *
   * <code>string billing_plan_id = 1 [json_name = "billingPlanId"];</code>
   * @return The bytes for billingPlanId.
   */
  com.google.protobuf.ByteString
      getBillingPlanIdBytes();

  /**
   * <pre>
   * time the billing plan was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * time the billing plan was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * time the billing plan was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * time the billing plan was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * time the billing plan was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * time the billing plan was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * the time from which this billing plan will take effect
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime"];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * the time from which this billing plan will take effect
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime"];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * the time from which this billing plan will take effect
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [json_name = "startTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * the time this billing plan ended; can be null
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime"];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * the time this billing plan ended; can be null
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime"];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * the time this billing plan ended; can be null
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [json_name = "endTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * the time this billing plan was deleted; can be null
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [json_name = "deleteTime"];</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <pre>
   * the time this billing plan was deleted; can be null
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [json_name = "deleteTime"];</code>
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   * <pre>
   * the time this billing plan was deleted; can be null
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 6 [json_name = "deleteTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   * <pre>
   * the billing plan rate definitions
   * </pre>
   *
   * <code>repeated string rate_definition_ids = 7 [json_name = "rateDefinitionIds"];</code>
   * @return A list containing the rateDefinitionIds.
   */
  java.util.List<java.lang.String>
      getRateDefinitionIdsList();
  /**
   * <pre>
   * the billing plan rate definitions
   * </pre>
   *
   * <code>repeated string rate_definition_ids = 7 [json_name = "rateDefinitionIds"];</code>
   * @return The count of rateDefinitionIds.
   */
  int getRateDefinitionIdsCount();
  /**
   * <pre>
   * the billing plan rate definitions
   * </pre>
   *
   * <code>repeated string rate_definition_ids = 7 [json_name = "rateDefinitionIds"];</code>
   * @param index The index of the element to return.
   * @return The rateDefinitionIds at the given index.
   */
  java.lang.String getRateDefinitionIds(int index);
  /**
   * <pre>
   * the billing plan rate definitions
   * </pre>
   *
   * <code>repeated string rate_definition_ids = 7 [json_name = "rateDefinitionIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the rateDefinitionIds at the given index.
   */
  com.google.protobuf.ByteString
      getRateDefinitionIdsBytes(int index);

  /**
   * <pre>
   * the billing plan status
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.BillingPlanStatus status = 8 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * the billing plan status
   * </pre>
   *
   * <code>.services.billing.entities.v1alpha1.BillingPlanStatus status = 8 [json_name = "status"];</code>
   * @return The status.
   */
  com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanStatus getStatus();

  /**
   * <code>.google.protobuf.Timestamp actual_start_time = 9 [json_name = "actualStartTime", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.BillingPlan.actual_start_time is deprecated.
   *     See services/billing/entities/v1alpha1/plan.proto;l=25
   * @return Whether the actualStartTime field is set.
   */
  @java.lang.Deprecated boolean hasActualStartTime();
  /**
   * <code>.google.protobuf.Timestamp actual_start_time = 9 [json_name = "actualStartTime", deprecated = true];</code>
   * @deprecated services.billing.entities.v1alpha1.BillingPlan.actual_start_time is deprecated.
   *     See services/billing/entities/v1alpha1/plan.proto;l=25
   * @return The actualStartTime.
   */
  @java.lang.Deprecated com.google.protobuf.Timestamp getActualStartTime();
  /**
   * <code>.google.protobuf.Timestamp actual_start_time = 9 [json_name = "actualStartTime", deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.TimestampOrBuilder getActualStartTimeOrBuilder();
}
