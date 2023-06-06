// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetAgentSkillsResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetAgentSkillsRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * skills found for the given parameters, will be value pairs (name, level).
   * </pre>
   *
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  int getSkillsCount();
  /**
   * <pre>
   * skills found for the given parameters, will be value pairs (name, level).
   * </pre>
   *
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  boolean containsSkills(
      java.lang.String key);
  /**
   * Use {@link #getSkillsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getSkills();
  /**
   * <pre>
   * skills found for the given parameters, will be value pairs (name, level).
   * </pre>
   *
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getSkillsMap();
  /**
   * <pre>
   * skills found for the given parameters, will be value pairs (name, level).
   * </pre>
   *
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  long getSkillsOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   * skills found for the given parameters, will be value pairs (name, level).
   * </pre>
   *
   * <code>map&lt;string, int64&gt; skills = 2 [json_name = "skills"];</code>
   */
  long getSkillsOrThrow(
      java.lang.String key);
}
