// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/users.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

public interface UserDirectoryEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.users.UserDirectoryEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User ID
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * User ID
   * </pre>
   *
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * Full name of the user, formatted: "firstname lastname"
   * </pre>
   *
   * <code>string full_name = 2 [json_name = "fullName"];</code>
   * @return The fullName.
   */
  java.lang.String getFullName();
  /**
   * <pre>
   * Full name of the user, formatted: "firstname lastname"
   * </pre>
   *
   * <code>string full_name = 2 [json_name = "fullName"];</code>
   * @return The bytes for fullName.
   */
  com.google.protobuf.ByteString
      getFullNameBytes();

  /**
   * <pre>
   * User's username.
   * </pre>
   *
   * <code>string user_name = 3 [json_name = "userName"];</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <pre>
   * User's username.
   * </pre>
   *
   * <code>string user_name = 3 [json_name = "userName"];</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <pre>
   * Fisrt name of the user.
   * </pre>
   *
   * <code>string first_name = 4 [json_name = "firstName"];</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <pre>
   * Fisrt name of the user.
   * </pre>
   *
   * <code>string first_name = 4 [json_name = "firstName"];</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <pre>
   * Last name of the user.
   * </pre>
   *
   * <code>string last_name = 5 [json_name = "lastName"];</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <pre>
   * Last name of the user.
   * </pre>
   *
   * <code>string last_name = 5 [json_name = "lastName"];</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();
}
