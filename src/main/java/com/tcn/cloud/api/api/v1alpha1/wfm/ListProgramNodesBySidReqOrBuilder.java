// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface ListProgramNodesBySidReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.ListProgramNodesBySidReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IDs of the program nodes to list.
   * </pre>
   *
   * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
   * @return A list containing the programNodeSids.
   */
  java.util.List<java.lang.Long> getProgramNodeSidsList();
  /**
   * <pre>
   * IDs of the program nodes to list.
   * </pre>
   *
   * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
   * @return The count of programNodeSids.
   */
  int getProgramNodeSidsCount();
  /**
   * <pre>
   * IDs of the program nodes to list.
   * </pre>
   *
   * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
   * @param index The index of the element to return.
   * @return The programNodeSids at the given index.
   */
  long getProgramNodeSids(int index);
}