// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface PortalSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.PortalSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.integrations.PortalWorkflow workflow_choices = 1 [json_name = "workflowChoices"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.PortalWorkflow> 
      getWorkflowChoicesList();
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalWorkflow workflow_choices = 1 [json_name = "workflowChoices"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PortalWorkflow getWorkflowChoices(int index);
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalWorkflow workflow_choices = 1 [json_name = "workflowChoices"];</code>
   */
  int getWorkflowChoicesCount();
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalWorkflow workflow_choices = 1 [json_name = "workflowChoices"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.PortalWorkflowOrBuilder> 
      getWorkflowChoicesOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.integrations.PortalWorkflow workflow_choices = 1 [json_name = "workflowChoices"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PortalWorkflowOrBuilder getWorkflowChoicesOrBuilder(
      int index);

  /**
   * <code>string header_text = 2 [json_name = "headerText"];</code>
   * @return The headerText.
   */
  java.lang.String getHeaderText();
  /**
   * <code>string header_text = 2 [json_name = "headerText"];</code>
   * @return The bytes for headerText.
   */
  com.google.protobuf.ByteString
      getHeaderTextBytes();

  /**
   * <code>string footer_text = 3 [json_name = "footerText"];</code>
   * @return The footerText.
   */
  java.lang.String getFooterText();
  /**
   * <code>string footer_text = 3 [json_name = "footerText"];</code>
   * @return The bytes for footerText.
   */
  com.google.protobuf.ByteString
      getFooterTextBytes();
}
