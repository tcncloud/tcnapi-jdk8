// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface WorkflowRequirementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.WorkflowRequirement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * how many different flows the user can choose from on this step.
   * 0 and below is interpreted as unlimited flows.
   * example:
   * PaymentPortal would have this set to 1 for verification flow and invoice flows
   * and set to 0 for payment flows. This forces the user to verify exactly 1 way
   * see exactly 1 invoice, and choose credit card, ach paypal, etc to pay.
   * </pre>
   *
   * <code>int32 max_choices = 1 [json_name = "maxChoices"];</code>
   * @return The maxChoices.
   */
  int getMaxChoices();

  /**
   * <pre>
   * the flows for this step must be of this type
   * FLOW_TYPE_UNKNOWN is interpreted as any flow type is acceptable
   * </pre>
   *
   * <code>.api.commons.integrations.FlowType flow_type = 2 [json_name = "flowType"];</code>
   * @return The enum numeric value on the wire for flowType.
   */
  int getFlowTypeValue();
  /**
   * <pre>
   * the flows for this step must be of this type
   * FLOW_TYPE_UNKNOWN is interpreted as any flow type is acceptable
   * </pre>
   *
   * <code>.api.commons.integrations.FlowType flow_type = 2 [json_name = "flowType"];</code>
   * @return The flowType.
   */
  com.tcn.cloud.api.api.commons.integrations.FlowType getFlowType();
}