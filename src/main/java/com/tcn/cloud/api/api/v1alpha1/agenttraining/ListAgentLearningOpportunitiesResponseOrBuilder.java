// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/agenttraining/learning_opportunity.proto

package com.tcn.cloud.api.api.v1alpha1.agenttraining;

public interface ListAgentLearningOpportunitiesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.agenttraining.ListAgentLearningOpportunitiesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.LearningOpportunity learning_opportunities = 1 [json_name = "learningOpportunities"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.LearningOpportunity> 
      getLearningOpportunitiesList();
  /**
   * <code>repeated .api.commons.LearningOpportunity learning_opportunities = 1 [json_name = "learningOpportunities"];</code>
   */
  com.tcn.cloud.api.api.commons.LearningOpportunity getLearningOpportunities(int index);
  /**
   * <code>repeated .api.commons.LearningOpportunity learning_opportunities = 1 [json_name = "learningOpportunities"];</code>
   */
  int getLearningOpportunitiesCount();
  /**
   * <code>repeated .api.commons.LearningOpportunity learning_opportunities = 1 [json_name = "learningOpportunities"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.LearningOpportunityOrBuilder> 
      getLearningOpportunitiesOrBuilderList();
  /**
   * <code>repeated .api.commons.LearningOpportunity learning_opportunities = 1 [json_name = "learningOpportunities"];</code>
   */
  com.tcn.cloud.api.api.commons.LearningOpportunityOrBuilder getLearningOpportunitiesOrBuilder(
      int index);
}
