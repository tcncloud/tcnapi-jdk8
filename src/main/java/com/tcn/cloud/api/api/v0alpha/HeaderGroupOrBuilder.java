// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface HeaderGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.HeaderGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the name of this group
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * the name of this group
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated string headers = 2 [json_name = "headers", deprecated = true];</code>
   * @deprecated api.v0alpha.HeaderGroup.headers is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1604
   * @return A list containing the headers.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getHeadersList();
  /**
   * <code>repeated string headers = 2 [json_name = "headers", deprecated = true];</code>
   * @deprecated api.v0alpha.HeaderGroup.headers is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1604
   * @return The count of headers.
   */
  @java.lang.Deprecated int getHeadersCount();
  /**
   * <code>repeated string headers = 2 [json_name = "headers", deprecated = true];</code>
   * @deprecated api.v0alpha.HeaderGroup.headers is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1604
   * @param index The index of the element to return.
   * @return The headers at the given index.
   */
  @java.lang.Deprecated java.lang.String getHeaders(int index);
  /**
   * <code>repeated string headers = 2 [json_name = "headers", deprecated = true];</code>
   * @deprecated api.v0alpha.HeaderGroup.headers is deprecated.
   *     See api/v0alpha/omniapi.proto;l=1604
   * @param index The index of the value to return.
   * @return The bytes of the headers at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getHeadersBytes(int index);

  /**
   * <pre>
   * the headers provided by this group
   * </pre>
   *
   * <code>repeated .api.v0alpha.Header list_headers = 3 [json_name = "listHeaders"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.Header> 
      getListHeadersList();
  /**
   * <pre>
   * the headers provided by this group
   * </pre>
   *
   * <code>repeated .api.v0alpha.Header list_headers = 3 [json_name = "listHeaders"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.Header getListHeaders(int index);
  /**
   * <pre>
   * the headers provided by this group
   * </pre>
   *
   * <code>repeated .api.v0alpha.Header list_headers = 3 [json_name = "listHeaders"];</code>
   */
  int getListHeadersCount();
  /**
   * <pre>
   * the headers provided by this group
   * </pre>
   *
   * <code>repeated .api.v0alpha.Header list_headers = 3 [json_name = "listHeaders"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder> 
      getListHeadersOrBuilderList();
  /**
   * <pre>
   * the headers provided by this group
   * </pre>
   *
   * <code>repeated .api.v0alpha.Header list_headers = 3 [json_name = "listHeaders"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder getListHeadersOrBuilder(
      int index);
}
