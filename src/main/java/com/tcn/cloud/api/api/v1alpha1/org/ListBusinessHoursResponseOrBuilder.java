// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

@java.lang.Deprecated public interface ListBusinessHoursResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListBusinessHoursResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.BusinessHours business_hours = 2 [json_name = "businessHours"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.BusinessHours> 
      getBusinessHoursList();
  /**
   * <pre>
   * The list of business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.BusinessHours business_hours = 2 [json_name = "businessHours"];</code>
   */
  com.tcn.cloud.api.api.commons.org.BusinessHours getBusinessHours(int index);
  /**
   * <pre>
   * The list of business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.BusinessHours business_hours = 2 [json_name = "businessHours"];</code>
   */
  int getBusinessHoursCount();
  /**
   * <pre>
   * The list of business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.BusinessHours business_hours = 2 [json_name = "businessHours"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder> 
      getBusinessHoursOrBuilderList();
  /**
   * <pre>
   * The list of business hours
   * </pre>
   *
   * <code>repeated .api.commons.org.BusinessHours business_hours = 2 [json_name = "businessHours"];</code>
   */
  com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder getBusinessHoursOrBuilder(
      int index);
}
