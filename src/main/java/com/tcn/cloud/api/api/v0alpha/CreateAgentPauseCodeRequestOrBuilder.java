// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface CreateAgentPauseCodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.CreateAgentPauseCodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the pause_code.xml_client_property_sid field is
   * NOT used in this context. The pause code will
   * be created with a default xml_client_property sid.
   * </pre>
   *
   * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
   * @return Whether the pauseCode field is set.
   */
  boolean hasPauseCode();
  /**
   * <pre>
   * the pause_code.xml_client_property_sid field is
   * NOT used in this context. The pause code will
   * be created with a default xml_client_property sid.
   * </pre>
   *
   * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
   * @return The pauseCode.
   */
  com.tcn.cloud.api.api.v0alpha.PauseCode getPauseCode();
  /**
   * <pre>
   * the pause_code.xml_client_property_sid field is
   * NOT used in this context. The pause code will
   * be created with a default xml_client_property sid.
   * </pre>
   *
   * <code>.api.v0alpha.PauseCode pause_code = 1 [json_name = "pauseCode"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PauseCodeOrBuilder getPauseCodeOrBuilder();
}
