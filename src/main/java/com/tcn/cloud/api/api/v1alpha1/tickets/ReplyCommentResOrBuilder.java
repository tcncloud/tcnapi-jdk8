// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

public interface ReplyCommentResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.tickets.ReplyCommentRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returns boolen true OR False in the response
   * </pre>
   *
   * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
   * @return Whether the isCreated field is set.
   */
  boolean hasIsCreated();
  /**
   * <pre>
   * Returns boolen true OR False in the response
   * </pre>
   *
   * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
   * @return The isCreated.
   */
  com.tcn.cloud.api.api.commons.ConfirmReplyComment getIsCreated();
  /**
   * <pre>
   * Returns boolen true OR False in the response
   * </pre>
   *
   * <code>.api.commons.ConfirmReplyComment is_created = 1 [json_name = "isCreated"];</code>
   */
  com.tcn.cloud.api.api.commons.ConfirmReplyCommentOrBuilder getIsCreatedOrBuilder();
}
