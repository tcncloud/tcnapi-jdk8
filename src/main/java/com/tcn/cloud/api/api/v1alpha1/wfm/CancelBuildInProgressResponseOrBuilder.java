// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CancelBuildInProgressResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CancelBuildInProgressResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * True if a build was cancelled.
   * False if there was not a build to cancel.
   * </pre>
   *
   * <code>bool canceled_build = 1 [json_name = "canceledBuild"];</code>
   * @return The canceledBuild.
   */
  boolean getCanceledBuild();
}
