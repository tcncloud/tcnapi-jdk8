// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface UpdatePortalLogoReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.UpdatePortalLogoReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id of portal_config
   * </pre>
   *
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * id of portal_config
   * </pre>
   *
   * <code>string id = 3 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * is the logo used in the corner of the payment portal screen
   * </pre>
   *
   * <code>bytes logo = 4 [json_name = "logo"];</code>
   * @return The logo.
   */
  com.google.protobuf.ByteString getLogo();
}
