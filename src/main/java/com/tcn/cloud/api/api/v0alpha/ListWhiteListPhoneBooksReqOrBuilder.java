// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListWhiteListPhoneBooksReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListWhiteListPhoneBooksReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Entry type will be 'Hunt Group' if this field is set.
   * Otherwise the entry type will be 'Client'.
   * </pre>
   *
   * <code>int64 hunt_group_sid = 2 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();

  /**
   * <pre>
   * Whether to include the phone number types
   * </pre>
   *
   * <code>bool include_null_phone_number_types = 4 [json_name = "includeNullPhoneNumberTypes"];</code>
   * @return The includeNullPhoneNumberTypes.
   */
  boolean getIncludeNullPhoneNumberTypes();

  /**
   * <pre>
   * The list of ways to order phone books.
   * </pre>
   *
   * <code>repeated .api.commons.ListPhoneBookOrderBy.Enum order_bys = 5 [json_name = "orderBys"];</code>
   * @return A list containing the orderBys.
   */
  java.util.List<com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.Enum> getOrderBysList();
  /**
   * <pre>
   * The list of ways to order phone books.
   * </pre>
   *
   * <code>repeated .api.commons.ListPhoneBookOrderBy.Enum order_bys = 5 [json_name = "orderBys"];</code>
   * @return The count of orderBys.
   */
  int getOrderBysCount();
  /**
   * <pre>
   * The list of ways to order phone books.
   * </pre>
   *
   * <code>repeated .api.commons.ListPhoneBookOrderBy.Enum order_bys = 5 [json_name = "orderBys"];</code>
   * @param index The index of the element to return.
   * @return The orderBys at the given index.
   */
  com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.Enum getOrderBys(int index);
  /**
   * <pre>
   * The list of ways to order phone books.
   * </pre>
   *
   * <code>repeated .api.commons.ListPhoneBookOrderBy.Enum order_bys = 5 [json_name = "orderBys"];</code>
   * @return A list containing the enum numeric values on the wire for orderBys.
   */
  java.util.List<java.lang.Integer>
  getOrderBysValueList();
  /**
   * <pre>
   * The list of ways to order phone books.
   * </pre>
   *
   * <code>repeated .api.commons.ListPhoneBookOrderBy.Enum order_bys = 5 [json_name = "orderBys"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of orderBys at the given index.
   */
  int getOrderBysValue(int index);
}
