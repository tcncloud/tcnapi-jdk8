// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/businesshours/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.businesshours;

public interface GetBusinessHoursResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.businesshours.GetBusinessHoursResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The retrieved business hours
   * </pre>
   *
   * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
   * @return Whether the businessHours field is set.
   */
  boolean hasBusinessHours();
  /**
   * <pre>
   * The retrieved business hours
   * </pre>
   *
   * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
   * @return The businessHours.
   */
  com.tcn.cloud.api.api.commons.org.BusinessHours getBusinessHours();
  /**
   * <pre>
   * The retrieved business hours
   * </pre>
   *
   * <code>.api.commons.org.BusinessHours business_hours = 1 [json_name = "businessHours"];</code>
   */
  com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder getBusinessHoursOrBuilder();
}
