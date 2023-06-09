// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListExtendedCallHistoryReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListExtendedCallHistoryReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.commons.CallHistorySearchType.Enum search_type = 4 [json_name = "searchType"];</code>
   * @return The enum numeric value on the wire for searchType.
   */
  int getSearchTypeValue();
  /**
   * <code>.api.commons.CallHistorySearchType.Enum search_type = 4 [json_name = "searchType"];</code>
   * @return The searchType.
   */
  com.tcn.cloud.api.api.commons.CallHistorySearchType.Enum getSearchType();

  /**
   * <code>repeated .api.commons.CallType.Enum call_types = 5 [json_name = "callTypes"];</code>
   * @return A list containing the callTypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.CallType.Enum> getCallTypesList();
  /**
   * <code>repeated .api.commons.CallType.Enum call_types = 5 [json_name = "callTypes"];</code>
   * @return The count of callTypes.
   */
  int getCallTypesCount();
  /**
   * <code>repeated .api.commons.CallType.Enum call_types = 5 [json_name = "callTypes"];</code>
   * @param index The index of the element to return.
   * @return The callTypes at the given index.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallTypes(int index);
  /**
   * <code>repeated .api.commons.CallType.Enum call_types = 5 [json_name = "callTypes"];</code>
   * @return A list containing the enum numeric values on the wire for callTypes.
   */
  java.util.List<java.lang.Integer>
  getCallTypesValueList();
  /**
   * <code>repeated .api.commons.CallType.Enum call_types = 5 [json_name = "callTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of callTypes at the given index.
   */
  int getCallTypesValue(int index);

  /**
   * <code>string customer_number = 6 [json_name = "customerNumber"];</code>
   * @return The customerNumber.
   */
  java.lang.String getCustomerNumber();
  /**
   * <code>string customer_number = 6 [json_name = "customerNumber"];</code>
   * @return The bytes for customerNumber.
   */
  com.google.protobuf.ByteString
      getCustomerNumberBytes();

  /**
   * <code>.api.commons.CallHistorySearchScope.Enum search_scope = 7 [json_name = "searchScope"];</code>
   * @return The enum numeric value on the wire for searchScope.
   */
  int getSearchScopeValue();
  /**
   * <code>.api.commons.CallHistorySearchScope.Enum search_scope = 7 [json_name = "searchScope"];</code>
   * @return The searchScope.
   */
  com.tcn.cloud.api.api.commons.CallHistorySearchScope.Enum getSearchScope();

  /**
   * <code>int64 call_sid = 8 [json_name = "callSid"];</code>
   * @return The callSid.
   */
  long getCallSid();

  /**
   * <code>string caller_id = 9 [json_name = "callerId"];</code>
   * @return The callerId.
   */
  java.lang.String getCallerId();
  /**
   * <code>string caller_id = 9 [json_name = "callerId"];</code>
   * @return The bytes for callerId.
   */
  com.google.protobuf.ByteString
      getCallerIdBytes();
}
