// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface TransactionSummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.TransactionSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 total_transactions_attempted = 1 [json_name = "totalTransactionsAttempted"];</code>
   * @return The totalTransactionsAttempted.
   */
  long getTotalTransactionsAttempted();

  /**
   * <code>int64 total_transactions_completed = 2 [json_name = "totalTransactionsCompleted"];</code>
   * @return The totalTransactionsCompleted.
   */
  long getTotalTransactionsCompleted();

  /**
   * <code>int64 total_transactions_failed = 3 [json_name = "totalTransactionsFailed"];</code>
   * @return The totalTransactionsFailed.
   */
  long getTotalTransactionsFailed();

  /**
   * <code>double total_amount_collected = 4 [json_name = "totalAmountCollected"];</code>
   * @return The totalAmountCollected.
   */
  double getTotalAmountCollected();

  /**
   * <code>double avg_amount_collected = 5 [json_name = "avgAmountCollected"];</code>
   * @return The avgAmountCollected.
   */
  double getAvgAmountCollected();
}
