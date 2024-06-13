// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/learn.proto

package com.tcn.cloud.api.api.v0alpha;

public interface VersionDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.VersionDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * version
   * </pre>
   *
   * <code>string version = 1 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * version
   * </pre>
   *
   * <code>string version = 1 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * version name
   * </pre>
   *
   * <code>string version_name = 2 [json_name = "versionName"];</code>
   * @return The versionName.
   */
  java.lang.String getVersionName();
  /**
   * <pre>
   * version name
   * </pre>
   *
   * <code>string version_name = 2 [json_name = "versionName"];</code>
   * @return The bytes for versionName.
   */
  com.google.protobuf.ByteString
      getVersionNameBytes();

  /**
   * <pre>
   * version creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * version creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * version creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * version publised date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_published = 4 [json_name = "datePublished"];</code>
   * @return Whether the datePublished field is set.
   */
  boolean hasDatePublished();
  /**
   * <pre>
   * version publised date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_published = 4 [json_name = "datePublished"];</code>
   * @return The datePublished.
   */
  com.google.protobuf.Timestamp getDatePublished();
  /**
   * <pre>
   * version publised date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_published = 4 [json_name = "datePublished"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDatePublishedOrBuilder();

  /**
   * <pre>
   * published status
   * </pre>
   *
   * <code>string status = 5 [json_name = "status"];</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * published status
   * </pre>
   *
   * <code>string status = 5 [json_name = "status"];</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
