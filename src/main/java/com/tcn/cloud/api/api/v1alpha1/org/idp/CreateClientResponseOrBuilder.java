// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/idp/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.idp;

public interface CreateClientResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.idp.CreateClientResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool already_exists = 1 [json_name = "alreadyExists"];</code>
   * @return The alreadyExists.
   */
  boolean getAlreadyExists();

  /**
   * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
   * @return Whether the client field is set.
   */
  boolean hasClient();
  /**
   * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
   * @return The client.
   */
  com.tcn.cloud.api.api.commons.org.IdpClient getClient();
  /**
   * <code>.api.commons.org.IdpClient client = 2 [json_name = "client"];</code>
   */
  com.tcn.cloud.api.api.commons.org.IdpClientOrBuilder getClientOrBuilder();
}
