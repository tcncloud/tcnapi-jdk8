// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/idp/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.idp;

public interface ListClientsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.idp.ListClientsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.org.IdpClient clients = 1 [json_name = "clients"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.IdpClient> 
      getClientsList();
  /**
   * <code>repeated .api.commons.org.IdpClient clients = 1 [json_name = "clients"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IdpClient getClients(int index);
  /**
   * <code>repeated .api.commons.org.IdpClient clients = 1 [json_name = "clients"];</code>
   */
  int getClientsCount();
  /**
   * <code>repeated .api.commons.org.IdpClient clients = 1 [json_name = "clients"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.IdpClientOrBuilder> 
      getClientsOrBuilderList();
  /**
   * <code>repeated .api.commons.org.IdpClient clients = 1 [json_name = "clients"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IdpClientOrBuilder getClientsOrBuilder(
      int index);
}