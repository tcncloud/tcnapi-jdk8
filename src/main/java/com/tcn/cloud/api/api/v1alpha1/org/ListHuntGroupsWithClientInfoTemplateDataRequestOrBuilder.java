// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListHuntGroupsWithClientInfoTemplateDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListHuntGroupsWithClientInfoTemplateDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The filter to list the hunt groups with their client info display template.
   * </pre>
   *
   * <code>.api.v1alpha1.org.ListHuntGroupsWithClientInfoTemplateDataRequest.Filter filter = 1 [json_name = "filter"];</code>
   * @return The enum numeric value on the wire for filter.
   */
  int getFilterValue();
  /**
   * <pre>
   * The filter to list the hunt groups with their client info display template.
   * </pre>
   *
   * <code>.api.v1alpha1.org.ListHuntGroupsWithClientInfoTemplateDataRequest.Filter filter = 1 [json_name = "filter"];</code>
   * @return The filter.
   */
  com.tcn.cloud.api.api.v1alpha1.org.ListHuntGroupsWithClientInfoTemplateDataRequest.Filter getFilter();
}
