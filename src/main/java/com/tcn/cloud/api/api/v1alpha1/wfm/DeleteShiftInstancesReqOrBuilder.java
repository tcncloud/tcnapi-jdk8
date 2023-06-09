// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface DeleteShiftInstancesReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.DeleteShiftInstancesReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IDs of shift instances to delete.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @return A list containing the shiftInstanceSids.
   */
  java.util.List<java.lang.Long> getShiftInstanceSidsList();
  /**
   * <pre>
   * IDs of shift instances to delete.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @return The count of shiftInstanceSids.
   */
  int getShiftInstanceSidsCount();
  /**
   * <pre>
   * IDs of shift instances to delete.
   * </pre>
   *
   * <code>repeated int64 shift_instance_sids = 1 [json_name = "shiftInstanceSids"];</code>
   * @param index The index of the element to return.
   * @return The shiftInstanceSids at the given index.
   */
  long getShiftInstanceSids(int index);
}
