// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/nodes.proto

package com.tcn.cloud.api.api.commons.workflows;

public interface NodeDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.workflows.NodeDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * common fields for a node
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * common fields for a node
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated string outputs = 5 [json_name = "outputs"];</code>
   * @return A list containing the outputs.
   */
  java.util.List<java.lang.String>
      getOutputsList();
  /**
   * <code>repeated string outputs = 5 [json_name = "outputs"];</code>
   * @return The count of outputs.
   */
  int getOutputsCount();
  /**
   * <code>repeated string outputs = 5 [json_name = "outputs"];</code>
   * @param index The index of the element to return.
   * @return The outputs at the given index.
   */
  java.lang.String getOutputs(int index);
  /**
   * <code>repeated string outputs = 5 [json_name = "outputs"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the outputs at the given index.
   */
  com.google.protobuf.ByteString
      getOutputsBytes(int index);

  /**
   * <code>string error_node_id = 6 [json_name = "errorNodeId"];</code>
   * @return The errorNodeId.
   */
  java.lang.String getErrorNodeId();
  /**
   * <code>string error_node_id = 6 [json_name = "errorNodeId"];</code>
   * @return The bytes for errorNodeId.
   */
  com.google.protobuf.ByteString
      getErrorNodeIdBytes();

  /**
   * <code>.api.commons.workflows.NodePrint print = 101 [json_name = "print"];</code>
   * @return Whether the print field is set.
   */
  boolean hasPrint();
  /**
   * <code>.api.commons.workflows.NodePrint print = 101 [json_name = "print"];</code>
   * @return The print.
   */
  com.tcn.cloud.api.api.commons.workflows.NodePrint getPrint();
  /**
   * <code>.api.commons.workflows.NodePrint print = 101 [json_name = "print"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.NodePrintOrBuilder getPrintOrBuilder();

  /**
   * <code>.api.commons.workflows.NodeRandom random = 102 [json_name = "random"];</code>
   * @return Whether the random field is set.
   */
  boolean hasRandom();
  /**
   * <code>.api.commons.workflows.NodeRandom random = 102 [json_name = "random"];</code>
   * @return The random.
   */
  com.tcn.cloud.api.api.commons.workflows.NodeRandom getRandom();
  /**
   * <code>.api.commons.workflows.NodeRandom random = 102 [json_name = "random"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.NodeRandomOrBuilder getRandomOrBuilder();

  /**
   * <code>.api.commons.workflows.NodeConsoleInput console_input = 103 [json_name = "consoleInput"];</code>
   * @return Whether the consoleInput field is set.
   */
  boolean hasConsoleInput();
  /**
   * <code>.api.commons.workflows.NodeConsoleInput console_input = 103 [json_name = "consoleInput"];</code>
   * @return The consoleInput.
   */
  com.tcn.cloud.api.api.commons.workflows.NodeConsoleInput getConsoleInput();
  /**
   * <code>.api.commons.workflows.NodeConsoleInput console_input = 103 [json_name = "consoleInput"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.NodeConsoleInputOrBuilder getConsoleInputOrBuilder();

  /**
   * <code>.api.commons.workflows.NodeComparator comparator = 104 [json_name = "comparator"];</code>
   * @return Whether the comparator field is set.
   */
  boolean hasComparator();
  /**
   * <code>.api.commons.workflows.NodeComparator comparator = 104 [json_name = "comparator"];</code>
   * @return The comparator.
   */
  com.tcn.cloud.api.api.commons.workflows.NodeComparator getComparator();
  /**
   * <code>.api.commons.workflows.NodeComparator comparator = 104 [json_name = "comparator"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.NodeComparatorOrBuilder getComparatorOrBuilder();

  /**
   * <code>.api.commons.workflows.NodeStoreInput store_input = 105 [json_name = "storeInput"];</code>
   * @return Whether the storeInput field is set.
   */
  boolean hasStoreInput();
  /**
   * <code>.api.commons.workflows.NodeStoreInput store_input = 105 [json_name = "storeInput"];</code>
   * @return The storeInput.
   */
  com.tcn.cloud.api.api.commons.workflows.NodeStoreInput getStoreInput();
  /**
   * <code>.api.commons.workflows.NodeStoreInput store_input = 105 [json_name = "storeInput"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.NodeStoreInputOrBuilder getStoreInputOrBuilder();

  /**
   * <code>.api.commons.workflows.NodeChatbot chatbot = 1000 [json_name = "chatbot"];</code>
   * @return Whether the chatbot field is set.
   */
  boolean hasChatbot();
  /**
   * <code>.api.commons.workflows.NodeChatbot chatbot = 1000 [json_name = "chatbot"];</code>
   * @return The chatbot.
   */
  com.tcn.cloud.api.api.commons.workflows.NodeChatbot getChatbot();
  /**
   * <code>.api.commons.workflows.NodeChatbot chatbot = 1000 [json_name = "chatbot"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.NodeChatbotOrBuilder getChatbotOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodePrompt omni_prompt = 201 [json_name = "omniPrompt"];</code>
   * @return Whether the omniPrompt field is set.
   */
  boolean hasOmniPrompt();
  /**
   * <code>.api.commons.workflows.OmniNodePrompt omni_prompt = 201 [json_name = "omniPrompt"];</code>
   * @return The omniPrompt.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodePrompt getOmniPrompt();
  /**
   * <code>.api.commons.workflows.OmniNodePrompt omni_prompt = 201 [json_name = "omniPrompt"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodePromptOrBuilder getOmniPromptOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodeSetSkill omni_set_skill = 202 [json_name = "omniSetSkill"];</code>
   * @return Whether the omniSetSkill field is set.
   */
  boolean hasOmniSetSkill();
  /**
   * <code>.api.commons.workflows.OmniNodeSetSkill omni_set_skill = 202 [json_name = "omniSetSkill"];</code>
   * @return The omniSetSkill.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeSetSkill getOmniSetSkill();
  /**
   * <code>.api.commons.workflows.OmniNodeSetSkill omni_set_skill = 202 [json_name = "omniSetSkill"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeSetSkillOrBuilder getOmniSetSkillOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodeToAgent omni_to_agent = 203 [json_name = "omniToAgent"];</code>
   * @return Whether the omniToAgent field is set.
   */
  boolean hasOmniToAgent();
  /**
   * <code>.api.commons.workflows.OmniNodeToAgent omni_to_agent = 203 [json_name = "omniToAgent"];</code>
   * @return The omniToAgent.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeToAgent getOmniToAgent();
  /**
   * <code>.api.commons.workflows.OmniNodeToAgent omni_to_agent = 203 [json_name = "omniToAgent"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeToAgentOrBuilder getOmniToAgentOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodeError omni_error = 204 [json_name = "omniError"];</code>
   * @return Whether the omniError field is set.
   */
  boolean hasOmniError();
  /**
   * <code>.api.commons.workflows.OmniNodeError omni_error = 204 [json_name = "omniError"];</code>
   * @return The omniError.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeError getOmniError();
  /**
   * <code>.api.commons.workflows.OmniNodeError omni_error = 204 [json_name = "omniError"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeErrorOrBuilder getOmniErrorOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodeOptions omni_options = 205 [json_name = "omniOptions"];</code>
   * @return Whether the omniOptions field is set.
   */
  boolean hasOmniOptions();
  /**
   * <code>.api.commons.workflows.OmniNodeOptions omni_options = 205 [json_name = "omniOptions"];</code>
   * @return The omniOptions.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeOptions getOmniOptions();
  /**
   * <code>.api.commons.workflows.OmniNodeOptions omni_options = 205 [json_name = "omniOptions"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeOptionsOrBuilder getOmniOptionsOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodeSendMessage omni_send_message = 206 [json_name = "omniSendMessage"];</code>
   * @return Whether the omniSendMessage field is set.
   */
  boolean hasOmniSendMessage();
  /**
   * <code>.api.commons.workflows.OmniNodeSendMessage omni_send_message = 206 [json_name = "omniSendMessage"];</code>
   * @return The omniSendMessage.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessage getOmniSendMessage();
  /**
   * <code>.api.commons.workflows.OmniNodeSendMessage omni_send_message = 206 [json_name = "omniSendMessage"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeSendMessageOrBuilder getOmniSendMessageOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodeUserInput omni_user_input = 207 [json_name = "omniUserInput"];</code>
   * @return Whether the omniUserInput field is set.
   */
  boolean hasOmniUserInput();
  /**
   * <code>.api.commons.workflows.OmniNodeUserInput omni_user_input = 207 [json_name = "omniUserInput"];</code>
   * @return The omniUserInput.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeUserInput getOmniUserInput();
  /**
   * <code>.api.commons.workflows.OmniNodeUserInput omni_user_input = 207 [json_name = "omniUserInput"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeUserInputOrBuilder getOmniUserInputOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodeBranching omni_branching = 208 [json_name = "omniBranching"];</code>
   * @return Whether the omniBranching field is set.
   */
  boolean hasOmniBranching();
  /**
   * <code>.api.commons.workflows.OmniNodeBranching omni_branching = 208 [json_name = "omniBranching"];</code>
   * @return The omniBranching.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeBranching getOmniBranching();
  /**
   * <code>.api.commons.workflows.OmniNodeBranching omni_branching = 208 [json_name = "omniBranching"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeBranchingOrBuilder getOmniBranchingOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniNodeToMatcher omni_to_matcher = 209 [json_name = "omniToMatcher"];</code>
   * @return Whether the omniToMatcher field is set.
   */
  boolean hasOmniToMatcher();
  /**
   * <code>.api.commons.workflows.OmniNodeToMatcher omni_to_matcher = 209 [json_name = "omniToMatcher"];</code>
   * @return The omniToMatcher.
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeToMatcher getOmniToMatcher();
  /**
   * <code>.api.commons.workflows.OmniNodeToMatcher omni_to_matcher = 209 [json_name = "omniToMatcher"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.OmniNodeToMatcherOrBuilder getOmniToMatcherOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniBotNodeTestStart omni_bot_test_start = 301 [json_name = "omniBotTestStart", deprecated = true];</code>
   * @deprecated api.commons.workflows.NodeDefinition.omni_bot_test_start is deprecated.
   *     See api/commons/workflows/nodes.proto;l=37
   * @return Whether the omniBotTestStart field is set.
   */
  @java.lang.Deprecated boolean hasOmniBotTestStart();
  /**
   * <code>.api.commons.workflows.OmniBotNodeTestStart omni_bot_test_start = 301 [json_name = "omniBotTestStart", deprecated = true];</code>
   * @deprecated api.commons.workflows.NodeDefinition.omni_bot_test_start is deprecated.
   *     See api/commons/workflows/nodes.proto;l=37
   * @return The omniBotTestStart.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.workflows.OmniBotNodeTestStart getOmniBotTestStart();
  /**
   * <code>.api.commons.workflows.OmniBotNodeTestStart omni_bot_test_start = 301 [json_name = "omniBotTestStart", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.workflows.OmniBotNodeTestStartOrBuilder getOmniBotTestStartOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniBotNodeTestStep omni_bot_test_step = 302 [json_name = "omniBotTestStep", deprecated = true];</code>
   * @deprecated api.commons.workflows.NodeDefinition.omni_bot_test_step is deprecated.
   *     See api/commons/workflows/nodes.proto;l=38
   * @return Whether the omniBotTestStep field is set.
   */
  @java.lang.Deprecated boolean hasOmniBotTestStep();
  /**
   * <code>.api.commons.workflows.OmniBotNodeTestStep omni_bot_test_step = 302 [json_name = "omniBotTestStep", deprecated = true];</code>
   * @deprecated api.commons.workflows.NodeDefinition.omni_bot_test_step is deprecated.
   *     See api/commons/workflows/nodes.proto;l=38
   * @return The omniBotTestStep.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.workflows.OmniBotNodeTestStep getOmniBotTestStep();
  /**
   * <code>.api.commons.workflows.OmniBotNodeTestStep omni_bot_test_step = 302 [json_name = "omniBotTestStep", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.workflows.OmniBotNodeTestStepOrBuilder getOmniBotTestStepOrBuilder();

  /**
   * <code>.api.commons.workflows.OmniBotNodeTestEnd omni_bot_test_end = 303 [json_name = "omniBotTestEnd", deprecated = true];</code>
   * @deprecated api.commons.workflows.NodeDefinition.omni_bot_test_end is deprecated.
   *     See api/commons/workflows/nodes.proto;l=39
   * @return Whether the omniBotTestEnd field is set.
   */
  @java.lang.Deprecated boolean hasOmniBotTestEnd();
  /**
   * <code>.api.commons.workflows.OmniBotNodeTestEnd omni_bot_test_end = 303 [json_name = "omniBotTestEnd", deprecated = true];</code>
   * @deprecated api.commons.workflows.NodeDefinition.omni_bot_test_end is deprecated.
   *     See api/commons/workflows/nodes.proto;l=39
   * @return The omniBotTestEnd.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.workflows.OmniBotNodeTestEnd getOmniBotTestEnd();
  /**
   * <code>.api.commons.workflows.OmniBotNodeTestEnd omni_bot_test_end = 303 [json_name = "omniBotTestEnd", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.workflows.OmniBotNodeTestEndOrBuilder getOmniBotTestEndOrBuilder();

  /**
   * <code>.api.commons.workflows.TestBotNodeTestStart test_bot_test_start = 401 [json_name = "testBotTestStart"];</code>
   * @return Whether the testBotTestStart field is set.
   */
  boolean hasTestBotTestStart();
  /**
   * <code>.api.commons.workflows.TestBotNodeTestStart test_bot_test_start = 401 [json_name = "testBotTestStart"];</code>
   * @return The testBotTestStart.
   */
  com.tcn.cloud.api.api.commons.workflows.TestBotNodeTestStart getTestBotTestStart();
  /**
   * <code>.api.commons.workflows.TestBotNodeTestStart test_bot_test_start = 401 [json_name = "testBotTestStart"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.TestBotNodeTestStartOrBuilder getTestBotTestStartOrBuilder();

  /**
   * <code>.api.commons.workflows.TestBotNodeTestStep test_bot_test_step = 402 [json_name = "testBotTestStep"];</code>
   * @return Whether the testBotTestStep field is set.
   */
  boolean hasTestBotTestStep();
  /**
   * <code>.api.commons.workflows.TestBotNodeTestStep test_bot_test_step = 402 [json_name = "testBotTestStep"];</code>
   * @return The testBotTestStep.
   */
  com.tcn.cloud.api.api.commons.workflows.TestBotNodeTestStep getTestBotTestStep();
  /**
   * <code>.api.commons.workflows.TestBotNodeTestStep test_bot_test_step = 402 [json_name = "testBotTestStep"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.TestBotNodeTestStepOrBuilder getTestBotTestStepOrBuilder();

  /**
   * <code>.api.commons.workflows.TestBotNodeTestEnd test_bot_test_end = 403 [json_name = "testBotTestEnd"];</code>
   * @return Whether the testBotTestEnd field is set.
   */
  boolean hasTestBotTestEnd();
  /**
   * <code>.api.commons.workflows.TestBotNodeTestEnd test_bot_test_end = 403 [json_name = "testBotTestEnd"];</code>
   * @return The testBotTestEnd.
   */
  com.tcn.cloud.api.api.commons.workflows.TestBotNodeTestEnd getTestBotTestEnd();
  /**
   * <code>.api.commons.workflows.TestBotNodeTestEnd test_bot_test_end = 403 [json_name = "testBotTestEnd"];</code>
   */
  com.tcn.cloud.api.api.commons.workflows.TestBotNodeTestEndOrBuilder getTestBotTestEndOrBuilder();

  com.tcn.cloud.api.api.commons.workflows.NodeDefinition.DefinitionCase getDefinitionCase();
}
