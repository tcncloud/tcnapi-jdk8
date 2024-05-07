// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/labels/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.labels;

public interface AttachLabelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.labels.AttachLabelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The label id to attach to the entity
   * </pre>
   *
   * <code>string label_id = 1 [json_name = "labelId"];</code>
   * @return The labelId.
   */
  java.lang.String getLabelId();
  /**
   * <pre>
   * The label id to attach to the entity
   * </pre>
   *
   * <code>string label_id = 1 [json_name = "labelId"];</code>
   * @return The bytes for labelId.
   */
  com.google.protobuf.ByteString
      getLabelIdBytes();

  /**
   * <pre>
   * The ID of the entity that is being labeled
   * </pre>
   *
   * <code>string entity_id = 2 [json_name = "entityId"];</code>
   * @return The entityId.
   */
  java.lang.String getEntityId();
  /**
   * <pre>
   * The ID of the entity that is being labeled
   * </pre>
   *
   * <code>string entity_id = 2 [json_name = "entityId"];</code>
   * @return The bytes for entityId.
   */
  com.google.protobuf.ByteString
      getEntityIdBytes();

  /**
   * <pre>
   * The given entity type to attach the label to
   * </pre>
   *
   * <code>.api.commons.LabeledEntity entity_type = 3 [json_name = "entityType"];</code>
   * @return The enum numeric value on the wire for entityType.
   */
  int getEntityTypeValue();
  /**
   * <pre>
   * The given entity type to attach the label to
   * </pre>
   *
   * <code>.api.commons.LabeledEntity entity_type = 3 [json_name = "entityType"];</code>
   * @return The entityType.
   */
  com.tcn.cloud.api.api.commons.LabeledEntity getEntityType();
}
