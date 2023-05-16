// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

public interface CreateScheduleScenarioWithNodesReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.wfm.CreateScheduleScenarioWithNodesReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ScheduleScenario to be stored in the db.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ScheduleScenario schedule_scenario = 1 [json_name = "scheduleScenario"];</code>
   * @return Whether the scheduleScenario field is set.
   */
  boolean hasScheduleScenario();
  /**
   * <pre>
   * ScheduleScenario to be stored in the db.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ScheduleScenario schedule_scenario = 1 [json_name = "scheduleScenario"];</code>
   * @return The scheduleScenario.
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ScheduleScenario getScheduleScenario();
  /**
   * <pre>
   * ScheduleScenario to be stored in the db.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.ScheduleScenario schedule_scenario = 1 [json_name = "scheduleScenario"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.wfm.ScheduleScenarioOrBuilder getScheduleScenarioOrBuilder();

  /**
   * <pre>
   * Name for the created call center node.
   * </pre>
   *
   * <code>string call_center_node_name = 2 [json_name = "callCenterNodeName"];</code>
   * @return The callCenterNodeName.
   */
  java.lang.String getCallCenterNodeName();
  /**
   * <pre>
   * Name for the created call center node.
   * </pre>
   *
   * <code>string call_center_node_name = 2 [json_name = "callCenterNodeName"];</code>
   * @return The bytes for callCenterNodeName.
   */
  com.google.protobuf.ByteString
      getCallCenterNodeNameBytes();

  /**
   * <pre>
   * Description for the created call center node.
   * </pre>
   *
   * <code>string call_center_node_description = 3 [json_name = "callCenterNodeDescription"];</code>
   * @return The callCenterNodeDescription.
   */
  java.lang.String getCallCenterNodeDescription();
  /**
   * <pre>
   * Description for the created call center node.
   * </pre>
   *
   * <code>string call_center_node_description = 3 [json_name = "callCenterNodeDescription"];</code>
   * @return The bytes for callCenterNodeDescription.
   */
  com.google.protobuf.ByteString
      getCallCenterNodeDescriptionBytes();

  /**
   * <pre>
   * Name for the created client node.
   * </pre>
   *
   * <code>string client_node_name = 4 [json_name = "clientNodeName"];</code>
   * @return The clientNodeName.
   */
  java.lang.String getClientNodeName();
  /**
   * <pre>
   * Name for the created client node.
   * </pre>
   *
   * <code>string client_node_name = 4 [json_name = "clientNodeName"];</code>
   * @return The bytes for clientNodeName.
   */
  com.google.protobuf.ByteString
      getClientNodeNameBytes();

  /**
   * <pre>
   * Description for the created client node.
   * </pre>
   *
   * <code>string client_node_description = 5 [json_name = "clientNodeDescription"];</code>
   * @return The clientNodeDescription.
   */
  java.lang.String getClientNodeDescription();
  /**
   * <pre>
   * Description for the created client node.
   * </pre>
   *
   * <code>string client_node_description = 5 [json_name = "clientNodeDescription"];</code>
   * @return The bytes for clientNodeDescription.
   */
  com.google.protobuf.ByteString
      getClientNodeDescriptionBytes();

  /**
   * <pre>
   * Name for the created location node.
   * </pre>
   *
   * <code>string location_node_name = 6 [json_name = "locationNodeName"];</code>
   * @return The locationNodeName.
   */
  java.lang.String getLocationNodeName();
  /**
   * <pre>
   * Name for the created location node.
   * </pre>
   *
   * <code>string location_node_name = 6 [json_name = "locationNodeName"];</code>
   * @return The bytes for locationNodeName.
   */
  com.google.protobuf.ByteString
      getLocationNodeNameBytes();

  /**
   * <pre>
   * Description for the location center node.
   * </pre>
   *
   * <code>string location_node_description = 7 [json_name = "locationNodeDescription"];</code>
   * @return The locationNodeDescription.
   */
  java.lang.String getLocationNodeDescription();
  /**
   * <pre>
   * Description for the location center node.
   * </pre>
   *
   * <code>string location_node_description = 7 [json_name = "locationNodeDescription"];</code>
   * @return The bytes for locationNodeDescription.
   */
  com.google.protobuf.ByteString
      getLocationNodeDescriptionBytes();

  /**
   * <pre>
   * Name for the created program node.
   * </pre>
   *
   * <code>string program_node_name = 8 [json_name = "programNodeName"];</code>
   * @return The programNodeName.
   */
  java.lang.String getProgramNodeName();
  /**
   * <pre>
   * Name for the created program node.
   * </pre>
   *
   * <code>string program_node_name = 8 [json_name = "programNodeName"];</code>
   * @return The bytes for programNodeName.
   */
  com.google.protobuf.ByteString
      getProgramNodeNameBytes();

  /**
   * <pre>
   * Description for the created program node.
   * </pre>
   *
   * <code>string program_node_description = 9 [json_name = "programNodeDescription"];</code>
   * @return The programNodeDescription.
   */
  java.lang.String getProgramNodeDescription();
  /**
   * <pre>
   * Description for the created program node.
   * </pre>
   *
   * <code>string program_node_description = 9 [json_name = "programNodeDescription"];</code>
   * @return The bytes for programNodeDescription.
   */
  com.google.protobuf.ByteString
      getProgramNodeDescriptionBytes();

  /**
   * <pre>
   * TimeZoneVal is the desired timezone for the created nodes.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone_val = 10 [json_name = "timeZoneVal"];</code>
   * @return The enum numeric value on the wire for timeZoneVal.
   */
  int getTimeZoneValValue();
  /**
   * <pre>
   * TimeZoneVal is the desired timezone for the created nodes.
   * </pre>
   *
   * <code>.api.commons.TimeZone time_zone_val = 10 [json_name = "timeZoneVal"];</code>
   * @return The timeZoneVal.
   */
  com.tcn.cloud.api.api.commons.TimeZone getTimeZoneVal();
}
