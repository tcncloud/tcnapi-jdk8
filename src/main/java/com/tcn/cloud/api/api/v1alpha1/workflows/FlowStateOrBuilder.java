// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/entities.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface FlowStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.FlowState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.v1alpha1.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
   * @return Whether the envelope field is set.
   */
  boolean hasEnvelope();
  /**
   * <code>.api.v1alpha1.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
   * @return The envelope.
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.Envelope getEnvelope();
  /**
   * <code>.api.v1alpha1.workflows.Envelope envelope = 1 [json_name = "envelope"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.EnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <code>.api.v1alpha1.workflows.State state = 2 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <code>.api.v1alpha1.workflows.State state = 2 [json_name = "state"];</code>
   * @return The state.
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.State getState();
  /**
   * <code>.api.v1alpha1.workflows.State state = 2 [json_name = "state"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.StateOrBuilder getStateOrBuilder();

  /**
   * <code>.api.v1alpha1.workflows.Payload payload = 100 [json_name = "payload"];</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <code>.api.v1alpha1.workflows.Payload payload = 100 [json_name = "payload"];</code>
   * @return The payload.
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.Payload getPayload();
  /**
   * <code>.api.v1alpha1.workflows.Payload payload = 100 [json_name = "payload"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.workflows.PayloadOrBuilder getPayloadOrBuilder();
}
