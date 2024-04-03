// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniComplianceActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniComplianceAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * a list of config keywords
   * </pre>
   *
   * <code>repeated string keywords = 1 [json_name = "keywords"];</code>
   * @return A list containing the keywords.
   */
  java.util.List<java.lang.String>
      getKeywordsList();
  /**
   * <pre>
   * a list of config keywords
   * </pre>
   *
   * <code>repeated string keywords = 1 [json_name = "keywords"];</code>
   * @return The count of keywords.
   */
  int getKeywordsCount();
  /**
   * <pre>
   * a list of config keywords
   * </pre>
   *
   * <code>repeated string keywords = 1 [json_name = "keywords"];</code>
   * @param index The index of the element to return.
   * @return The keywords at the given index.
   */
  java.lang.String getKeywords(int index);
  /**
   * <pre>
   * a list of config keywords
   * </pre>
   *
   * <code>repeated string keywords = 1 [json_name = "keywords"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the keywords at the given index.
   */
  com.google.protobuf.ByteString
      getKeywordsBytes(int index);

  /**
   * <pre>
   * confirmation for the config
   * </pre>
   *
   * <code>string confirmation_message = 2 [json_name = "confirmationMessage"];</code>
   * @return The confirmationMessage.
   */
  java.lang.String getConfirmationMessage();
  /**
   * <pre>
   * confirmation for the config
   * </pre>
   *
   * <code>string confirmation_message = 2 [json_name = "confirmationMessage"];</code>
   * @return The bytes for confirmationMessage.
   */
  com.google.protobuf.ByteString
      getConfirmationMessageBytes();

  /**
   * <code>bool fuzzy_match = 3 [json_name = "fuzzyMatch"];</code>
   * @return The fuzzyMatch.
   */
  boolean getFuzzyMatch();
}
