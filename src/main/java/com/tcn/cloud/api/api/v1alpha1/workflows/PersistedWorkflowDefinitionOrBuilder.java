// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/service.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface PersistedWorkflowDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.PersistedWorkflowDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * flow_definition_id is the unique identifier for the flow definition. This is generated by the system, therefor its value is meaningless on create
   * </pre>
   *
   * <code>string flow_definition_id = 1 [json_name = "flowDefinitionId"];</code>
   * @return The flowDefinitionId.
   */
  java.lang.String getFlowDefinitionId();
  /**
   * <pre>
   * flow_definition_id is the unique identifier for the flow definition. This is generated by the system, therefor its value is meaningless on create
   * </pre>
   *
   * <code>string flow_definition_id = 1 [json_name = "flowDefinitionId"];</code>
   * @return The bytes for flowDefinitionId.
   */
  com.google.protobuf.ByteString
      getFlowDefinitionIdBytes();

  /**
   * <pre>
   * org_id that owns this definition. Must match the org_id of the authenticated user
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <pre>
   * org_id that owns this definition. Must match the org_id of the authenticated user
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <pre>
   * application that owns this definition
   * </pre>
   *
   * <code>string application = 3 [json_name = "application"];</code>
   * @return The application.
   */
  java.lang.String getApplication();
  /**
   * <pre>
   * application that owns this definition
   * </pre>
   *
   * <code>string application = 3 [json_name = "application"];</code>
   * @return The bytes for application.
   */
  com.google.protobuf.ByteString
      getApplicationBytes();

  /**
   * <pre>
   * this definition name
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * this definition name
   * </pre>
   *
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * this definition description
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * this definition description
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * the JSON serialized form of the flow definition
   * </pre>
   *
   * <code>string definition = 6 [json_name = "definition"];</code>
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   * <pre>
   * the JSON serialized form of the flow definition
   * </pre>
   *
   * <code>string definition = 6 [json_name = "definition"];</code>
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString
      getDefinitionBytes();

  /**
   * <pre>
   * create_time is the time the flow definition was created. Not used for the create request
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * create_time is the time the flow definition was created. Not used for the create request
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * create_time is the time the flow definition was created. Not used for the create request
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * update_time is the time the flow definition was last updated. Not used for the create request
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * update_time is the time the flow definition was last updated. Not used for the create request
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * update_time is the time the flow definition was last updated. Not used for the create request
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * extra is a JSON serialized string that can be used to store extra data for the flow definition (e.g. UI positioning data)
   * </pre>
   *
   * <code>string extra = 100 [json_name = "extra"];</code>
   * @return The extra.
   */
  java.lang.String getExtra();
  /**
   * <pre>
   * extra is a JSON serialized string that can be used to store extra data for the flow definition (e.g. UI positioning data)
   * </pre>
   *
   * <code>string extra = 100 [json_name = "extra"];</code>
   * @return The bytes for extra.
   */
  com.google.protobuf.ByteString
      getExtraBytes();
}
