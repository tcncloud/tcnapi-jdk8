// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface GenerateEpicKeyPairReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.GenerateEpicKeyPairReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 1 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>repeated string servers = 3 [json_name = "servers"];</code>
   * @return A list containing the servers.
   */
  java.util.List<java.lang.String>
      getServersList();
  /**
   * <code>repeated string servers = 3 [json_name = "servers"];</code>
   * @return The count of servers.
   */
  int getServersCount();
  /**
   * <code>repeated string servers = 3 [json_name = "servers"];</code>
   * @param index The index of the element to return.
   * @return The servers at the given index.
   */
  java.lang.String getServers(int index);
  /**
   * <code>repeated string servers = 3 [json_name = "servers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the servers at the given index.
   */
  com.google.protobuf.ByteString
      getServersBytes(int index);
}
