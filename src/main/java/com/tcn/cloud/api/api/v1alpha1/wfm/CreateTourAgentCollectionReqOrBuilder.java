// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CreateTourAgentCollectionReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CreateTourAgentCollectionReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The tour agent collection to create.
   * </pre>
   *
   * <code>.api.commons.TourAgentCollection tour_agent_collection = 1 [json_name = "tourAgentCollection"];</code>
   * @return Whether the tourAgentCollection field is set.
   */
  boolean hasTourAgentCollection();
  /**
   * <pre>
   * The tour agent collection to create.
   * </pre>
   *
   * <code>.api.commons.TourAgentCollection tour_agent_collection = 1 [json_name = "tourAgentCollection"];</code>
   * @return The tourAgentCollection.
   */
  com.tcn.cloud.api.api.commons.TourAgentCollection getTourAgentCollection();
  /**
   * <pre>
   * The tour agent collection to create.
   * </pre>
   *
   * <code>.api.commons.TourAgentCollection tour_agent_collection = 1 [json_name = "tourAgentCollection"];</code>
   */
  com.tcn.cloud.api.api.commons.TourAgentCollectionOrBuilder getTourAgentCollectionOrBuilder();
}
