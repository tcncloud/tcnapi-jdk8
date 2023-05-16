// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface IntegrationTransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.IntegrationTransaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string integration_transaction_id = 1 [json_name = "integrationTransactionId"];</code>
   * @return The integrationTransactionId.
   */
  java.lang.String getIntegrationTransactionId();
  /**
   * <code>string integration_transaction_id = 1 [json_name = "integrationTransactionId"];</code>
   * @return The bytes for integrationTransactionId.
   */
  com.google.protobuf.ByteString
      getIntegrationTransactionIdBytes();

  /**
   * <code>string task_id = 4 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  java.lang.String getTaskId();
  /**
   * <code>string task_id = 4 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString
      getTaskIdBytes();

  /**
   * <pre>
   * integration used
   * </pre>
   *
   * <code>.api.commons.integrations.IntegrationType integration_id = 5 [json_name = "integrationId"];</code>
   * @return The enum numeric value on the wire for integrationId.
   */
  int getIntegrationIdValue();
  /**
   * <pre>
   * integration used
   * </pre>
   *
   * <code>.api.commons.integrations.IntegrationType integration_id = 5 [json_name = "integrationId"];</code>
   * @return The integrationId.
   */
  com.tcn.cloud.api.api.commons.integrations.IntegrationType getIntegrationId();

  /**
   * <pre>
   * external service method
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod method_id = 6 [json_name = "methodId"];</code>
   * @return The enum numeric value on the wire for methodId.
   */
  int getMethodIdValue();
  /**
   * <pre>
   * external service method
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod method_id = 6 [json_name = "methodId"];</code>
   * @return The methodId.
   */
  com.tcn.cloud.api.api.commons.integrations.RequestMethod getMethodId();

  /**
   * <pre>
   * payment, data inquiry, etc.
   * </pre>
   *
   * <code>.api.commons.integrations.TransactionType transaction_type = 7 [json_name = "transactionType"];</code>
   * @return The enum numeric value on the wire for transactionType.
   */
  int getTransactionTypeValue();
  /**
   * <pre>
   * payment, data inquiry, etc.
   * </pre>
   *
   * <code>.api.commons.integrations.TransactionType transaction_type = 7 [json_name = "transactionType"];</code>
   * @return The transactionType.
   */
  com.tcn.cloud.api.api.commons.integrations.TransactionType getTransactionType();

  /**
   * <pre>
   * email/web/sms/ivr/chat
   * </pre>
   *
   * <code>.api.commons.integrations.RequestSource request_source = 8 [json_name = "requestSource"];</code>
   * @return The enum numeric value on the wire for requestSource.
   */
  int getRequestSourceValue();
  /**
   * <pre>
   * email/web/sms/ivr/chat
   * </pre>
   *
   * <code>.api.commons.integrations.RequestSource request_source = 8 [json_name = "requestSource"];</code>
   * @return The requestSource.
   */
  com.tcn.cloud.api.api.commons.integrations.RequestSource getRequestSource();

  /**
   * <pre>
   * success/failure
   * </pre>
   *
   * <code>.api.commons.integrations.TransactionResult result = 9 [json_name = "result"];</code>
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   * <pre>
   * success/failure
   * </pre>
   *
   * <code>.api.commons.integrations.TransactionResult result = 9 [json_name = "result"];</code>
   * @return The result.
   */
  com.tcn.cloud.api.api.commons.integrations.TransactionResult getResult();

  /**
   * <code>double amount_collected = 10 [json_name = "amountCollected"];</code>
   * @return The amountCollected.
   */
  double getAmountCollected();

  /**
   * <code>.api.v1alpha1.integrations.Values request_data = 11 [json_name = "requestData"];</code>
   * @return Whether the requestData field is set.
   */
  boolean hasRequestData();
  /**
   * <code>.api.v1alpha1.integrations.Values request_data = 11 [json_name = "requestData"];</code>
   * @return The requestData.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Values getRequestData();
  /**
   * <code>.api.v1alpha1.integrations.Values request_data = 11 [json_name = "requestData"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ValuesOrBuilder getRequestDataOrBuilder();

  /**
   * <pre>
   * response from external service
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.Values response_data = 12 [json_name = "responseData"];</code>
   * @return Whether the responseData field is set.
   */
  boolean hasResponseData();
  /**
   * <pre>
   * response from external service
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.Values response_data = 12 [json_name = "responseData"];</code>
   * @return The responseData.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Values getResponseData();
  /**
   * <pre>
   * response from external service
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.Values response_data = 12 [json_name = "responseData"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ValuesOrBuilder getResponseDataOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp created_on = 13 [json_name = "createdOn"];</code>
   * @return Whether the createdOn field is set.
   */
  boolean hasCreatedOn();
  /**
   * <code>.google.protobuf.Timestamp created_on = 13 [json_name = "createdOn"];</code>
   * @return The createdOn.
   */
  com.google.protobuf.Timestamp getCreatedOn();
  /**
   * <code>.google.protobuf.Timestamp created_on = 13 [json_name = "createdOn"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOnOrBuilder();

  /**
   * <code>string config_name = 14 [json_name = "configName"];</code>
   * @return The configName.
   */
  java.lang.String getConfigName();
  /**
   * <code>string config_name = 14 [json_name = "configName"];</code>
   * @return The bytes for configName.
   */
  com.google.protobuf.ByteString
      getConfigNameBytes();

  /**
   * <code>.api.v1alpha1.integrations.Conditions conds = 15 [json_name = "conds"];</code>
   * @return Whether the conds field is set.
   */
  boolean hasConds();
  /**
   * <code>.api.v1alpha1.integrations.Conditions conds = 15 [json_name = "conds"];</code>
   * @return The conds.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Conditions getConds();
  /**
   * <code>.api.v1alpha1.integrations.Conditions conds = 15 [json_name = "conds"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ConditionsOrBuilder getCondsOrBuilder();
}
