// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/contactmanager/contactmanager.proto

package com.tcn.cloud.api.api.v1alpha1.contactmanager;

public interface ListContactEntryListRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.contactmanager.ListContactEntryListRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 contact_manager_list_id = 1 [json_name = "contactManagerListId", jstype = JS_STRING];</code>
   * @return Whether the contactManagerListId field is set.
   */
  boolean hasContactManagerListId();
  /**
   * <code>optional int64 contact_manager_list_id = 1 [json_name = "contactManagerListId", jstype = JS_STRING];</code>
   * @return The contactManagerListId.
   */
  long getContactManagerListId();

  /**
   * <code>string org_id = 2 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v1alpha1.contactmanager.ListContactEntryListRequest.org_id is deprecated.
   *     See api/v1alpha1/contactmanager/contactmanager.proto;l=23
   * @return The orgId.
   */
  @java.lang.Deprecated java.lang.String getOrgId();
  /**
   * <code>string org_id = 2 [json_name = "orgId", deprecated = true];</code>
   * @deprecated api.v1alpha1.contactmanager.ListContactEntryListRequest.org_id is deprecated.
   *     See api/v1alpha1/contactmanager/contactmanager.proto;l=23
   * @return The bytes for orgId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string project_id = 3 [json_name = "projectId"];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string project_id = 3 [json_name = "projectId"];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * pagination fields - returned page
   * </pre>
   *
   * <code>int32 page_size = 4 [json_name = "pageSize"];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * pagination fields - page token
   * </pre>
   *
   * <code>string page_token = 5 [json_name = "pageToken"];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * pagination fields - page token
   * </pre>
   *
   * <code>string page_token = 5 [json_name = "pageToken"];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
