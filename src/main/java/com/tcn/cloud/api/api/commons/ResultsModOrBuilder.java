// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/compliance.proto

package com.tcn.cloud.api.api.commons;

public interface ResultsModOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.ResultsMod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string results = 1 [json_name = "results"];</code>
   * @return A list containing the results.
   */
  java.util.List<java.lang.String>
      getResultsList();
  /**
   * <code>repeated string results = 1 [json_name = "results"];</code>
   * @return The count of results.
   */
  int getResultsCount();
  /**
   * <code>repeated string results = 1 [json_name = "results"];</code>
   * @param index The index of the element to return.
   * @return The results at the given index.
   */
  java.lang.String getResults(int index);
  /**
   * <code>repeated string results = 1 [json_name = "results"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the results at the given index.
   */
  com.google.protobuf.ByteString
      getResultsBytes(int index);
}
