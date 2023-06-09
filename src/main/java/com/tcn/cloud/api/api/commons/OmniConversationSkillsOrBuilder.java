// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface OmniConversationSkillsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.OmniConversationSkills)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * map of agent skills
   * </pre>
   *
   * <code>map&lt;string, bool&gt; skills = 1 [json_name = "skills"];</code>
   */
  int getSkillsCount();
  /**
   * <pre>
   * map of agent skills
   * </pre>
   *
   * <code>map&lt;string, bool&gt; skills = 1 [json_name = "skills"];</code>
   */
  boolean containsSkills(
      java.lang.String key);
  /**
   * Use {@link #getSkillsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Boolean>
  getSkills();
  /**
   * <pre>
   * map of agent skills
   * </pre>
   *
   * <code>map&lt;string, bool&gt; skills = 1 [json_name = "skills"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Boolean>
  getSkillsMap();
  /**
   * <pre>
   * map of agent skills
   * </pre>
   *
   * <code>map&lt;string, bool&gt; skills = 1 [json_name = "skills"];</code>
   */
  boolean getSkillsOrDefault(
      java.lang.String key,
      boolean defaultValue);
  /**
   * <pre>
   * map of agent skills
   * </pre>
   *
   * <code>map&lt;string, bool&gt; skills = 1 [json_name = "skills"];</code>
   */
  boolean getSkillsOrThrow(
      java.lang.String key);
}
