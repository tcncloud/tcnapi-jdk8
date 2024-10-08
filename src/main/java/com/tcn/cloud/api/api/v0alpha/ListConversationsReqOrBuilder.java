// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListConversationsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListConversationsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the channel types to list conversations for
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 1 [json_name = "channelTypes"];</code>
   * @return A list containing the channelTypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.ChannelType> getChannelTypesList();
  /**
   * <pre>
   * the channel types to list conversations for
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 1 [json_name = "channelTypes"];</code>
   * @return The count of channelTypes.
   */
  int getChannelTypesCount();
  /**
   * <pre>
   * the channel types to list conversations for
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 1 [json_name = "channelTypes"];</code>
   * @param index The index of the element to return.
   * @return The channelTypes at the given index.
   */
  com.tcn.cloud.api.api.commons.ChannelType getChannelTypes(int index);
  /**
   * <pre>
   * the channel types to list conversations for
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 1 [json_name = "channelTypes"];</code>
   * @return A list containing the enum numeric values on the wire for channelTypes.
   */
  java.util.List<java.lang.Integer>
  getChannelTypesValueList();
  /**
   * <pre>
   * the channel types to list conversations for
   * </pre>
   *
   * <code>repeated .api.commons.ChannelType channel_types = 1 [json_name = "channelTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of channelTypes at the given index.
   */
  int getChannelTypesValue(int index);

  /**
   * <pre>
   * field mask to filter what is returned by each row
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * field mask to filter what is returned by each row
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * field mask to filter what is returned by each row
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 2 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <pre>
   * list of conversation status that we want returned, if empty return everything.
   * </pre>
   *
   * <code>repeated .api.commons.ConversationStatus statuses = 3 [json_name = "statuses"];</code>
   * @return A list containing the statuses.
   */
  java.util.List<com.tcn.cloud.api.api.commons.ConversationStatus> getStatusesList();
  /**
   * <pre>
   * list of conversation status that we want returned, if empty return everything.
   * </pre>
   *
   * <code>repeated .api.commons.ConversationStatus statuses = 3 [json_name = "statuses"];</code>
   * @return The count of statuses.
   */
  int getStatusesCount();
  /**
   * <pre>
   * list of conversation status that we want returned, if empty return everything.
   * </pre>
   *
   * <code>repeated .api.commons.ConversationStatus statuses = 3 [json_name = "statuses"];</code>
   * @param index The index of the element to return.
   * @return The statuses at the given index.
   */
  com.tcn.cloud.api.api.commons.ConversationStatus getStatuses(int index);
  /**
   * <pre>
   * list of conversation status that we want returned, if empty return everything.
   * </pre>
   *
   * <code>repeated .api.commons.ConversationStatus statuses = 3 [json_name = "statuses"];</code>
   * @return A list containing the enum numeric values on the wire for statuses.
   */
  java.util.List<java.lang.Integer>
  getStatusesValueList();
  /**
   * <pre>
   * list of conversation status that we want returned, if empty return everything.
   * </pre>
   *
   * <code>repeated .api.commons.ConversationStatus statuses = 3 [json_name = "statuses"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of statuses at the given index.
   */
  int getStatusesValue(int index);

  /**
   * <pre>
   * list conversations by time
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByTime by_time = 100 [json_name = "byTime"];</code>
   * @return Whether the byTime field is set.
   */
  boolean hasByTime();
  /**
   * <pre>
   * list conversations by time
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByTime by_time = 100 [json_name = "byTime"];</code>
   * @return The byTime.
   */
  com.tcn.cloud.api.api.v0alpha.ListConversationsReq.ByTime getByTime();
  /**
   * <pre>
   * list conversations by time
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByTime by_time = 100 [json_name = "byTime"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListConversationsReq.ByTimeOrBuilder getByTimeOrBuilder();

  /**
   * <pre>
   * list conversations by assigned user
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByAssignedUser by_assigned_user = 101 [json_name = "byAssignedUser"];</code>
   * @return Whether the byAssignedUser field is set.
   */
  boolean hasByAssignedUser();
  /**
   * <pre>
   * list conversations by assigned user
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByAssignedUser by_assigned_user = 101 [json_name = "byAssignedUser"];</code>
   * @return The byAssignedUser.
   */
  com.tcn.cloud.api.api.v0alpha.ListConversationsReq.ByAssignedUser getByAssignedUser();
  /**
   * <pre>
   * list conversations by assigned user
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByAssignedUser by_assigned_user = 101 [json_name = "byAssignedUser"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListConversationsReq.ByAssignedUserOrBuilder getByAssignedUserOrBuilder();

  /**
   * <pre>
   * list conversations by conversation sid
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByConversationSids by_conversation_sids = 102 [json_name = "byConversationSids"];</code>
   * @return Whether the byConversationSids field is set.
   */
  boolean hasByConversationSids();
  /**
   * <pre>
   * list conversations by conversation sid
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByConversationSids by_conversation_sids = 102 [json_name = "byConversationSids"];</code>
   * @return The byConversationSids.
   */
  com.tcn.cloud.api.api.v0alpha.ListConversationsReq.ByConversationSids getByConversationSids();
  /**
   * <pre>
   * list conversations by conversation sid
   * </pre>
   *
   * <code>.api.v0alpha.ListConversationsReq.ByConversationSids by_conversation_sids = 102 [json_name = "byConversationSids"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ListConversationsReq.ByConversationSidsOrBuilder getByConversationSidsOrBuilder();

  com.tcn.cloud.api.api.v0alpha.ListConversationsReq.FilterCase getFilterCase();
}
