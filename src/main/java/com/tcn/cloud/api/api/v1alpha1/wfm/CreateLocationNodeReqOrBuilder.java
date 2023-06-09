// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CreateLocationNodeReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CreateLocationNodeReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   * <pre>
   * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
   * @return The node.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.LocationNode getNode();
  /**
   * <pre>
   * Node to create, the &#64;location_node_sid doesn't need to be set since it won't be used.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.LocationNode node = 1 [json_name = "node"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.LocationNodeOrBuilder getNodeOrBuilder();
}
