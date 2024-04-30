// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListOrgHuntGroupScriptsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListOrgHuntGroupScriptsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The scripts belonging to an org
   * </pre>
   *
   * <code>repeated .api.commons.org.HuntGroupScript scripts = 1 [json_name = "scripts"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.HuntGroupScript> 
      getScriptsList();
  /**
   * <pre>
   * The scripts belonging to an org
   * </pre>
   *
   * <code>repeated .api.commons.org.HuntGroupScript scripts = 1 [json_name = "scripts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.HuntGroupScript getScripts(int index);
  /**
   * <pre>
   * The scripts belonging to an org
   * </pre>
   *
   * <code>repeated .api.commons.org.HuntGroupScript scripts = 1 [json_name = "scripts"];</code>
   */
  int getScriptsCount();
  /**
   * <pre>
   * The scripts belonging to an org
   * </pre>
   *
   * <code>repeated .api.commons.org.HuntGroupScript scripts = 1 [json_name = "scripts"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.HuntGroupScriptOrBuilder> 
      getScriptsOrBuilderList();
  /**
   * <pre>
   * The scripts belonging to an org
   * </pre>
   *
   * <code>repeated .api.commons.org.HuntGroupScript scripts = 1 [json_name = "scripts"];</code>
   */
  com.tcn.cloud.api.api.commons.org.HuntGroupScriptOrBuilder getScriptsOrBuilder(
      int index);
}
