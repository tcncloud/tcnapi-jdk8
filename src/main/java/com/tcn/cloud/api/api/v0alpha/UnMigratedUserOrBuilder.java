// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

public interface UnMigratedUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.UnMigratedUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional agent_sid or login_sid (must have one)
   * </pre>
   *
   * <code>int64 agent_sid = 1 [json_name = "agentSid"];</code>
   * @return The agentSid.
   */
  long getAgentSid();

  /**
   * <code>int64 login_sid = 2 [json_name = "loginSid"];</code>
   * @return The loginSid.
   */
  long getLoginSid();

  /**
   * <code>int64 client_sid = 3 [json_name = "clientSid"];</code>
   * @return The clientSid.
   */
  long getClientSid();

  /**
   * <code>string user_name = 4 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 4 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string user_id = 5 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 5 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>bool login_disabled = 6 [json_name = "loginDisabled"];</code>
   * @return The loginDisabled.
   */
  boolean getLoginDisabled();

  /**
   * <code>string first_name = 7 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 7 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 8 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 8 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();
}
