// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface InvoiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.InvoiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * set of actions that need to happen to get a payload that can be used for the invoice_request
   * the verification handler in the service will always populate this with a request with the data used in verifiation
   * but if that is not enough data for the payment the user is allowed to list out more requests here.
   * the results of all these method calls will be merged into one payload that is given to the invoice_request.
   * each result will be given as a request the result of all previous responses, so order matters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Request invoice_request_payload = 2 [json_name = "invoiceRequestPayload"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.Request> 
      getInvoiceRequestPayloadList();
  /**
   * <pre>
   * set of actions that need to happen to get a payload that can be used for the invoice_request
   * the verification handler in the service will always populate this with a request with the data used in verifiation
   * but if that is not enough data for the payment the user is allowed to list out more requests here.
   * the results of all these method calls will be merged into one payload that is given to the invoice_request.
   * each result will be given as a request the result of all previous responses, so order matters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Request invoice_request_payload = 2 [json_name = "invoiceRequestPayload"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Request getInvoiceRequestPayload(int index);
  /**
   * <pre>
   * set of actions that need to happen to get a payload that can be used for the invoice_request
   * the verification handler in the service will always populate this with a request with the data used in verifiation
   * but if that is not enough data for the payment the user is allowed to list out more requests here.
   * the results of all these method calls will be merged into one payload that is given to the invoice_request.
   * each result will be given as a request the result of all previous responses, so order matters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Request invoice_request_payload = 2 [json_name = "invoiceRequestPayload"];</code>
   */
  int getInvoiceRequestPayloadCount();
  /**
   * <pre>
   * set of actions that need to happen to get a payload that can be used for the invoice_request
   * the verification handler in the service will always populate this with a request with the data used in verifiation
   * but if that is not enough data for the payment the user is allowed to list out more requests here.
   * the results of all these method calls will be merged into one payload that is given to the invoice_request.
   * each result will be given as a request the result of all previous responses, so order matters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Request invoice_request_payload = 2 [json_name = "invoiceRequestPayload"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.RequestOrBuilder> 
      getInvoiceRequestPayloadOrBuilderList();
  /**
   * <pre>
   * set of actions that need to happen to get a payload that can be used for the invoice_request
   * the verification handler in the service will always populate this with a request with the data used in verifiation
   * but if that is not enough data for the payment the user is allowed to list out more requests here.
   * the results of all these method calls will be merged into one payload that is given to the invoice_request.
   * each result will be given as a request the result of all previous responses, so order matters.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.Request invoice_request_payload = 2 [json_name = "invoiceRequestPayload"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.RequestOrBuilder getInvoiceRequestPayloadOrBuilder(
      int index);

  /**
   * <code>.api.v1alpha1.integrations.Request invoice_request = 3 [json_name = "invoiceRequest"];</code>
   * @return Whether the invoiceRequest field is set.
   */
  boolean hasInvoiceRequest();
  /**
   * <code>.api.v1alpha1.integrations.Request invoice_request = 3 [json_name = "invoiceRequest"];</code>
   * @return The invoiceRequest.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Request getInvoiceRequest();
  /**
   * <code>.api.v1alpha1.integrations.Request invoice_request = 3 [json_name = "invoiceRequest"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.RequestOrBuilder getInvoiceRequestOrBuilder();

  /**
   * <pre>
   * removes these keys from the response so they are not shown to the user
   * </pre>
   *
   * <code>repeated string filter_response_keys = 4 [json_name = "filterResponseKeys"];</code>
   * @return A list containing the filterResponseKeys.
   */
  java.util.List<java.lang.String>
      getFilterResponseKeysList();
  /**
   * <pre>
   * removes these keys from the response so they are not shown to the user
   * </pre>
   *
   * <code>repeated string filter_response_keys = 4 [json_name = "filterResponseKeys"];</code>
   * @return The count of filterResponseKeys.
   */
  int getFilterResponseKeysCount();
  /**
   * <pre>
   * removes these keys from the response so they are not shown to the user
   * </pre>
   *
   * <code>repeated string filter_response_keys = 4 [json_name = "filterResponseKeys"];</code>
   * @param index The index of the element to return.
   * @return The filterResponseKeys at the given index.
   */
  java.lang.String getFilterResponseKeys(int index);
  /**
   * <pre>
   * removes these keys from the response so they are not shown to the user
   * </pre>
   *
   * <code>repeated string filter_response_keys = 4 [json_name = "filterResponseKeys"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the filterResponseKeys at the given index.
   */
  com.google.protobuf.ByteString
      getFilterResponseKeysBytes(int index);
}
