// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListBusinessHoursResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListBusinessHoursResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .api.commons.org.BusinessHours business_hours_lists = 1 [json_name = "businessHoursLists"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.BusinessHours> 
      getBusinessHoursListsList();
  /**
   * <code>repeated .api.commons.org.BusinessHours business_hours_lists = 1 [json_name = "businessHoursLists"];</code>
   */
  com.tcn.cloud.api.api.commons.org.BusinessHours getBusinessHoursLists(int index);
  /**
   * <code>repeated .api.commons.org.BusinessHours business_hours_lists = 1 [json_name = "businessHoursLists"];</code>
   */
  int getBusinessHoursListsCount();
  /**
   * <code>repeated .api.commons.org.BusinessHours business_hours_lists = 1 [json_name = "businessHoursLists"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder> 
      getBusinessHoursListsOrBuilderList();
  /**
   * <code>repeated .api.commons.org.BusinessHours business_hours_lists = 1 [json_name = "businessHoursLists"];</code>
   */
  com.tcn.cloud.api.api.commons.org.BusinessHoursOrBuilder getBusinessHoursListsOrBuilder(
      int index);
}
