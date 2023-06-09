// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface DeleteSchedulingTargetReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.DeleteSchedulingTargetReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The node to delete the scheduling target for.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 1 [json_name = "nodeSelector"];</code>
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();
  /**
   * <pre>
   * The node to delete the scheduling target for.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 1 [json_name = "nodeSelector"];</code>
   * @return The nodeSelector.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntity getNodeSelector();
  /**
   * <pre>
   * The node to delete the scheduling target for.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ParentEntity node_selector = 1 [json_name = "nodeSelector"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ParentEntityOrBuilder getNodeSelectorOrBuilder();
}
