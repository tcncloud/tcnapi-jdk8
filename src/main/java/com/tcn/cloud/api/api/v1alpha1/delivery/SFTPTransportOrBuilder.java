// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/delivery/service.proto

package com.tcn.cloud.api.api.v1alpha1.delivery;

public interface SFTPTransportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.delivery.SFTPTransport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string host = 1 [json_name = "host"];</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <code>string host = 1 [json_name = "host"];</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <code>int32 port = 2 [json_name = "port", deprecated = true];</code>
   * @deprecated api.v1alpha1.delivery.SFTPTransport.port is deprecated.
   *     See api/v1alpha1/delivery/service.proto;l=733
   * @return The port.
   */
  @java.lang.Deprecated int getPort();

  /**
   * <code>.api.v1alpha1.delivery.PasswordRef password = 3 [json_name = "password"];</code>
   * @return Whether the password field is set.
   */
  boolean hasPassword();
  /**
   * <code>.api.v1alpha1.delivery.PasswordRef password = 3 [json_name = "password"];</code>
   * @return The password.
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.PasswordRef getPassword();
  /**
   * <code>.api.v1alpha1.delivery.PasswordRef password = 3 [json_name = "password"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.PasswordRefOrBuilder getPasswordOrBuilder();

  /**
   * <code>.api.v1alpha1.delivery.SSHKeyRef ssh_key = 4 [json_name = "sshKey"];</code>
   * @return Whether the sshKey field is set.
   */
  boolean hasSshKey();
  /**
   * <code>.api.v1alpha1.delivery.SSHKeyRef ssh_key = 4 [json_name = "sshKey"];</code>
   * @return The sshKey.
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.SSHKeyRef getSshKey();
  /**
   * <code>.api.v1alpha1.delivery.SSHKeyRef ssh_key = 4 [json_name = "sshKey"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.delivery.SSHKeyRefOrBuilder getSshKeyOrBuilder();

  /**
   * <code>string username = 5 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 5 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string base_dir = 6 [json_name = "baseDir"];</code>
   * @return The baseDir.
   */
  java.lang.String getBaseDir();
  /**
   * <code>string base_dir = 6 [json_name = "baseDir"];</code>
   * @return The bytes for baseDir.
   */
  com.google.protobuf.ByteString
      getBaseDirBytes();

  com.tcn.cloud.api.api.v1alpha1.delivery.SFTPTransport.CredentialsCase getCredentialsCase();
}
