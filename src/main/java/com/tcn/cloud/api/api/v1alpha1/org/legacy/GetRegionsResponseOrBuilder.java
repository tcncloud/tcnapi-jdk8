// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/legacy/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.legacy;

public interface GetRegionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.legacy.GetRegionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string region_names = 1 [json_name = "regionNames"];</code>
   * @return A list containing the regionNames.
   */
  java.util.List<java.lang.String>
      getRegionNamesList();
  /**
   * <code>repeated string region_names = 1 [json_name = "regionNames"];</code>
   * @return The count of regionNames.
   */
  int getRegionNamesCount();
  /**
   * <code>repeated string region_names = 1 [json_name = "regionNames"];</code>
   * @param index The index of the element to return.
   * @return The regionNames at the given index.
   */
  java.lang.String getRegionNames(int index);
  /**
   * <code>repeated string region_names = 1 [json_name = "regionNames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the regionNames at the given index.
   */
  com.google.protobuf.ByteString
      getRegionNamesBytes(int index);
}
