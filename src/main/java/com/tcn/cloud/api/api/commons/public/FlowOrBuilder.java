// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/integrations/integrations.proto

package com.tcn.cloud.api.api.commons.public;

public interface FlowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.public.Flow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.public.InvoiceFlow invoice_flow = 1 [json_name = "invoiceFlow"];</code>
   * @return Whether the invoiceFlow field is set.
   */
  boolean hasInvoiceFlow();
  /**
   * <code>.api.commons.public.InvoiceFlow invoice_flow = 1 [json_name = "invoiceFlow"];</code>
   * @return The invoiceFlow.
   */
  com.tcn.cloud.api.api.commons.public.InvoiceFlow getInvoiceFlow();
  /**
   * <code>.api.commons.public.InvoiceFlow invoice_flow = 1 [json_name = "invoiceFlow"];</code>
   */
  com.tcn.cloud.api.api.commons.public.InvoiceFlowOrBuilder getInvoiceFlowOrBuilder();

  /**
   * <code>.api.commons.public.PaymentFlow payment_flow = 2 [json_name = "paymentFlow"];</code>
   * @return Whether the paymentFlow field is set.
   */
  boolean hasPaymentFlow();
  /**
   * <code>.api.commons.public.PaymentFlow payment_flow = 2 [json_name = "paymentFlow"];</code>
   * @return The paymentFlow.
   */
  com.tcn.cloud.api.api.commons.public.PaymentFlow getPaymentFlow();
  /**
   * <code>.api.commons.public.PaymentFlow payment_flow = 2 [json_name = "paymentFlow"];</code>
   */
  com.tcn.cloud.api.api.commons.public.PaymentFlowOrBuilder getPaymentFlowOrBuilder();

  /**
   * <code>.api.commons.public.VerificationFlow verification_flow = 3 [json_name = "verificationFlow"];</code>
   * @return Whether the verificationFlow field is set.
   */
  boolean hasVerificationFlow();
  /**
   * <code>.api.commons.public.VerificationFlow verification_flow = 3 [json_name = "verificationFlow"];</code>
   * @return The verificationFlow.
   */
  com.tcn.cloud.api.api.commons.public.VerificationFlow getVerificationFlow();
  /**
   * <code>.api.commons.public.VerificationFlow verification_flow = 3 [json_name = "verificationFlow"];</code>
   */
  com.tcn.cloud.api.api.commons.public.VerificationFlowOrBuilder getVerificationFlowOrBuilder();

  /**
   * <code>.api.commons.public.ExecuteFlow execute_flow = 4 [json_name = "executeFlow"];</code>
   * @return Whether the executeFlow field is set.
   */
  boolean hasExecuteFlow();
  /**
   * <code>.api.commons.public.ExecuteFlow execute_flow = 4 [json_name = "executeFlow"];</code>
   * @return The executeFlow.
   */
  com.tcn.cloud.api.api.commons.public.ExecuteFlow getExecuteFlow();
  /**
   * <code>.api.commons.public.ExecuteFlow execute_flow = 4 [json_name = "executeFlow"];</code>
   */
  com.tcn.cloud.api.api.commons.public.ExecuteFlowOrBuilder getExecuteFlowOrBuilder();

  com.tcn.cloud.api.api.commons.public.Flow.ValueCase getValueCase();
}
