// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/workflows/service.proto

package com.tcn.cloud.api.api.v1alpha1.workflows;

public interface PersistedFlowDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.workflows.PersistedFlowDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string flow_definition_id = 1 [json_name = "flowDefinitionId"];</code>
   * @return The flowDefinitionId.
   */
  java.lang.String getFlowDefinitionId();
  /**
   * <code>string flow_definition_id = 1 [json_name = "flowDefinitionId"];</code>
   * @return The bytes for flowDefinitionId.
   */
  com.google.protobuf.ByteString
      getFlowDefinitionIdBytes();

  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  java.lang.String getOrgId();
  /**
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  com.google.protobuf.ByteString
      getOrgIdBytes();

  /**
   * <code>string application = 3 [json_name = "application"];</code>
   * @return The application.
   */
  java.lang.String getApplication();
  /**
   * <code>string application = 3 [json_name = "application"];</code>
   * @return The bytes for application.
   */
  com.google.protobuf.ByteString
      getApplicationBytes();

  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * JSON serialized form of the proto definition
   * </pre>
   *
   * <code>string definition = 6 [json_name = "definition"];</code>
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   * <pre>
   * JSON serialized form of the proto definition
   * </pre>
   *
   * <code>string definition = 6 [json_name = "definition"];</code>
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString
      getDefinitionBytes();

  /**
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime"];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime"];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <code>.google.protobuf.Timestamp create_time = 7 [json_name = "createTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime"];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime"];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <code>.google.protobuf.Timestamp update_time = 8 [json_name = "updateTime"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   *JSON serialized data for UI (e.g. nodes positioning)
   * </pre>
   *
   * <code>string extra = 100 [json_name = "extra"];</code>
   * @return The extra.
   */
  java.lang.String getExtra();
  /**
   * <pre>
   *JSON serialized data for UI (e.g. nodes positioning)
   * </pre>
   *
   * <code>string extra = 100 [json_name = "extra"];</code>
   * @return The bytes for extra.
   */
  com.google.protobuf.ByteString
      getExtraBytes();
}
