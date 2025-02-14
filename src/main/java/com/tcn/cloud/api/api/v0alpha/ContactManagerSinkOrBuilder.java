// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ContactManagerSinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ContactManagerSink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * project id snet to Conatactmanager when sink is ran
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * project id snet to Conatactmanager when sink is ran
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * name sent to ContactManager when the sink is ran
   * </pre>
   *
   * <code>string contact_list_name = 3 [json_name = "contactListName"];</code>
   * @return The contactListName.
   */
  java.lang.String getContactListName();
  /**
   * <pre>
   * name sent to ContactManager when the sink is ran
   * </pre>
   *
   * <code>string contact_list_name = 3 [json_name = "contactListName"];</code>
   * @return The bytes for contactListName.
   */
  com.google.protobuf.ByteString
      getContactListNameBytes();

  /**
   * <pre>
   * description to use for this contact list.
   * Sent to contact manager when ran.
   * </pre>
   *
   * <code>string contact_list_description = 4 [json_name = "contactListDescription"];</code>
   * @return The contactListDescription.
   */
  java.lang.String getContactListDescription();
  /**
   * <pre>
   * description to use for this contact list.
   * Sent to contact manager when ran.
   * </pre>
   *
   * <code>string contact_list_description = 4 [json_name = "contactListDescription"];</code>
   * @return The bytes for contactListDescription.
   */
  com.google.protobuf.ByteString
      getContactListDescriptionBytes();

  /**
   * <pre>
   * if blank we export all fields.
   * if provided, we export only the fields listed here
   * </pre>
   *
   * <code>repeated string fields = 8 [json_name = "fields"];</code>
   * @return A list containing the fields.
   */
  java.util.List<java.lang.String>
      getFieldsList();
  /**
   * <pre>
   * if blank we export all fields.
   * if provided, we export only the fields listed here
   * </pre>
   *
   * <code>repeated string fields = 8 [json_name = "fields"];</code>
   * @return The count of fields.
   */
  int getFieldsCount();
  /**
   * <pre>
   * if blank we export all fields.
   * if provided, we export only the fields listed here
   * </pre>
   *
   * <code>repeated string fields = 8 [json_name = "fields"];</code>
   * @param index The index of the element to return.
   * @return The fields at the given index.
   */
  java.lang.String getFields(int index);
  /**
   * <pre>
   * if blank we export all fields.
   * if provided, we export only the fields listed here
   * </pre>
   *
   * <code>repeated string fields = 8 [json_name = "fields"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fields at the given index.
   */
  com.google.protobuf.ByteString
      getFieldsBytes(int index);

  /**
   * <code>int64 ttl = 7 [json_name = "ttl", deprecated = true];</code>
   * @deprecated api.v0alpha.ContactManagerSink.ttl is deprecated.
   *     See api/v0alpha/lms.proto;l=2368
   * @return The ttl.
   */
  @java.lang.Deprecated long getTtl();

  /**
   * <pre>
   * how long the data uploaded to this list lives for
   * if nil we default to the duration for 30 days
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 9 [json_name = "lifetime"];</code>
   * @return Whether the lifetime field is set.
   */
  boolean hasLifetime();
  /**
   * <pre>
   * how long the data uploaded to this list lives for
   * if nil we default to the duration for 30 days
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 9 [json_name = "lifetime"];</code>
   * @return The lifetime.
   */
  com.google.protobuf.Duration getLifetime();
  /**
   * <pre>
   * how long the data uploaded to this list lives for
   * if nil we default to the duration for 30 days
   * </pre>
   *
   * <code>.google.protobuf.Duration lifetime = 9 [json_name = "lifetime"];</code>
   */
  com.google.protobuf.DurationOrBuilder getLifetimeOrBuilder();
}
