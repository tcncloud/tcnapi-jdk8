// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/authconnection/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.authconnection;

public interface ListAuthConnectionIdsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.Connection connections = 1 [json_name = "connections"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.Connection> 
      getConnectionsList();
  /**
   * <code>repeated .api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.Connection connections = 1 [json_name = "connections"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.Connection getConnections(int index);
  /**
   * <code>repeated .api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.Connection connections = 1 [json_name = "connections"];</code>
   */
  int getConnectionsCount();
  /**
   * <code>repeated .api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.Connection connections = 1 [json_name = "connections"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.ConnectionOrBuilder> 
      getConnectionsOrBuilderList();
  /**
   * <code>repeated .api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.Connection connections = 1 [json_name = "connections"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.org.authconnection.ListAuthConnectionIdsResponse.ConnectionOrBuilder getConnectionsOrBuilder(
      int index);
}
