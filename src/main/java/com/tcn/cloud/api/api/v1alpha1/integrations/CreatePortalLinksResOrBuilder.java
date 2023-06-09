// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/portals.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface CreatePortalLinksResOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.CreatePortalLinksRes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * each url will be returned in order of the CreatePortalLinks.link_datas sent them in
   * </pre>
   *
   * <code>repeated string urls = 1 [json_name = "urls"];</code>
   * @return A list containing the urls.
   */
  java.util.List<java.lang.String>
      getUrlsList();
  /**
   * <pre>
   * each url will be returned in order of the CreatePortalLinks.link_datas sent them in
   * </pre>
   *
   * <code>repeated string urls = 1 [json_name = "urls"];</code>
   * @return The count of urls.
   */
  int getUrlsCount();
  /**
   * <pre>
   * each url will be returned in order of the CreatePortalLinks.link_datas sent them in
   * </pre>
   *
   * <code>repeated string urls = 1 [json_name = "urls"];</code>
   * @param index The index of the element to return.
   * @return The urls at the given index.
   */
  java.lang.String getUrls(int index);
  /**
   * <pre>
   * each url will be returned in order of the CreatePortalLinks.link_datas sent them in
   * </pre>
   *
   * <code>repeated string urls = 1 [json_name = "urls"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the urls at the given index.
   */
  com.google.protobuf.ByteString
      getUrlsBytes(int index);
}
