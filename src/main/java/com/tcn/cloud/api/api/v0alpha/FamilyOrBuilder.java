// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

public interface FamilyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Family)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 client_sid = 1 [json_name = "clientSid"];</code>
   * @return The clientSid.
   */
  long getClientSid();

  /**
   * <code>string client_name = 2 [json_name = "clientName"];</code>
   * @return The clientName.
   */
  java.lang.String getClientName();
  /**
   * <code>string client_name = 2 [json_name = "clientName"];</code>
   * @return The bytes for clientName.
   */
  com.google.protobuf.ByteString
      getClientNameBytes();

  /**
   * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
   * @return Whether the parents field is set.
   */
  boolean hasParents();
  /**
   * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
   * @return The parents.
   */
  com.tcn.cloud.api.api.v0alpha.Relations getParents();
  /**
   * <code>.api.v0alpha.Relations parents = 3 [json_name = "parents"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getParentsOrBuilder();

  /**
   * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
   * @return Whether the children field is set.
   */
  boolean hasChildren();
  /**
   * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
   * @return The children.
   */
  com.tcn.cloud.api.api.v0alpha.Relations getChildren();
  /**
   * <code>.api.v0alpha.Relations children = 4 [json_name = "children"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getChildrenOrBuilder();
}
